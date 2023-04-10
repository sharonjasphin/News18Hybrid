package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopEnglishSitemapChildUrlValidation extends WebDriverActions {

	ITestResult result;
	GenericUtility genericUtility = new GenericUtility();
	protected static List<String> sitemapUrls; 
	SoftAssert assrt = new SoftAssert();
	public String getLastId;
	public List<String> articleList = new ArrayList<String>();
	public int limitFrom;
	public String url;


	@BeforeClass
	public void getDBParentSitemapUrls() throws Throwable {

		sitemapUrls = dbGetHindiSitemapUrls();
		getLastId=fileUtility.readDataFromPropertyFile("getLastId");
		limitFrom = dbGetLastId(getLastId);
	}

	@DataProvider(name = "englishSitemapUrls")
	public static Object[] hindiRevampUrl()
	{	
		try{
			Object data[]= new Object[sitemapUrls.size()];
			for (int i = 0; i < sitemapUrls.size(); i++) 
			{
				data[i] = sitemapUrls.get(i);
			}
			System.out.println("Fetching Hindi Revamp Urls "+sitemapUrls.size());
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}

	@Test(dataProvider = "englishSitemapUrls",priority=-1)
	public void insertDBChildSitemapUrls(String url) throws Throwable {
		String methodName = new DesktopEnglishSitemapChildUrlValidation() {}.getClass().getEnclosingMethod().getName();
		String className = new DesktopEnglishSitemapChildUrlValidation() {}.getClass().getEnclosingClass().getName();
		String lang=checkLanguage(className,methodName);//Extract Language by calling checklanguage method

		Logs.info(getClass(),"Current DB Url is "+ url);
		Connection.Response response = Jsoup.connect(url).timeout(100000).execute();
		Document doc = response.parse();
		String xpath = "//div//h2//ancestor::div[contains(@class,'heading_title') or contains(@class,'photo')]//following-sibling::ul//li//a[contains(@href,'news18')]|//div//p//a[contains(@href,'news18')]|//div[contains(@class,'tag')]//li//a[contains(@href,'news18')]|//div[contains(@style,'uppercase')]//a[contains(@href,'')]";
		Elements links = doc.selectXpath(xpath);
//		Elements links = doc.select("div>p>a[href*=http],h2+ul>li>a,ul[class*=photo]>li>a");
		
		for (int i = 0; i <links.size(); i++) {
			if(!(links.get(i).attr("href").contains("news18.com")))
			{
				String domUrl = fileUtility.readDataFromPropertyFile("englishUrl").replace("com/", "com")+links.get(i).attr("href").toString();
				articleList.add(domUrl) ;
			}
			else {
				
				articleList.add(links.get(i).attr("href")) ;
			}
			dbInsertHindiSiteMapChildUrls(url, articleList.get(i),lang );
		}
	}
	
	/**
	 * This method validates query checks for Urls format
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishDoubleForwardFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		SoftAssert softassert = new SoftAssert();
		List<String> doubleForwardQueryList = new ArrayList<String>();
		String queryEnglishDoubleForward=fileUtility.readDataFromPropertyFile("queryEnglishDoubleForward");
		doubleForwardQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishDoubleForward,limitFrom,articleList.size());
		for (int j = 0; j < doubleForwardQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,doubleForwardQueryList.get(j));
			if (doubleForwardQueryList.size()>0) {

				softassert.fail("Double Forward Slash Format issues in this Url :"+doubleForwardQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ doubleForwardQueryList.get(j));
			}
		}
		softassert.assertAll();
	}

	/**
	 * This method validates query checks
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishMultipleHttpsFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> multipleHttpsQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryEnglishMultipleHttps=fileUtility.readDataFromPropertyFile("queryEnglishMultipleHttps");
		multipleHttpsQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishMultipleHttps,limitFrom,articleList.size());
		for (int j = 0; j < multipleHttpsQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,multipleHttpsQueryList.get(j));
			if (multipleHttpsQueryList.size()>0) {
				softassert.fail("Multiple HTTPS Format issues in this Url :"+multipleHttpsQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ multipleHttpsQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
		}
		softassert.assertAll();
	}

	/**
	 * This method validates query checks
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishSlugFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> slugQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryEnglishSlug=fileUtility.readDataFromPropertyFile("queryEnglishSlug");
		slugQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishSlug,limitFrom,articleList.size());
		for (int j = 0; j < slugQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,slugQueryList.get(j));
			if (slugQueryList.size()>0) {
				softassert.fail("Slug Format issues in this Url :"+slugQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ slugQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
		}
		softassert.assertAll();
	}

	/**
	 * This method validates query checks
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishBetaUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> betaUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryEnglishBetaUrls=fileUtility.readDataFromPropertyFile("queryEnglishBetaUrls");
		betaUrlQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishBetaUrls,limitFrom,articleList.size());
		for (int j = 0; j < betaUrlQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,betaUrlQueryList.get(j));
			if (betaUrlQueryList.size()>0) {
				softassert.fail("Beta Url Format issues in this Url :"+betaUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ betaUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
		}
		softassert.assertAll();
	}
	
	/**
	 * This method validates query checks
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishCmsUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> cmsUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryEnglishCmsUrls=fileUtility.readDataFromPropertyFile("queryEnglishCmsUrls");
		cmsUrlQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishCmsUrls,limitFrom,articleList.size());
		for (int j = 0; j < cmsUrlQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,cmsUrlQueryList.get(j));
			if (cmsUrlQueryList.size()>0) {
				softassert.fail("Beta Url Format issues in this Url :"+cmsUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ cmsUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
		}
		softassert.assertAll();
	}

	/**
	 * This method validates query checks
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void englishOnlyHttpUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> httpUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryEnglishOnlyHttp=fileUtility.readDataFromPropertyFile("queryEnglishOnlyHttp");
		httpUrlQueryList=dbSelectHindiSiteMapChildUrls(queryEnglishOnlyHttp,limitFrom,articleList.size());
		for (int j = 0; j < httpUrlQueryList.size(); j++) {
			String parentUrlQuery=fileUtility.readDataFromPropertyFile("queryParentUrlFromChildUrl");
			String parentUrl = dbSelectHindiSiteMapParentUrls(parentUrlQuery,httpUrlQueryList.get(j));
			if (httpUrlQueryList.size()>0) {
				softassert.fail("Only HTTP Format issues in this Url :"+httpUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ httpUrlQueryList.get(j)+" Its Parent Url "+parentUrl);
			}
		}
		softassert.assertAll();
	}

	@Test(priority = 100)
	public void validateEnglishChildUrlStatusCode() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> childUrlsList=new ArrayList<String>();
		String queryEnglishStatusCode=fileUtility.readDataFromPropertyFile("queryEnglishStatusCode");
		childUrlsList=dbSelectHindiSiteMapChildUrls(queryEnglishStatusCode,limitFrom, articleList.size());
		childUrlsList.parallelStream().forEach(e-> checkLinks1(e));
		dbTruncateParentTable();
		assrt.assertAll();
	}

	/**
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinks1(String links)  {
		try {
			String authStr = fileUtility.readDataFromPropertyFile("hindiMigUsername")+":"+fileUtility.readDataFromPropertyFile("hindiMigPwd");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection	 httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			httpUrlConnection.setConnectTimeout(30000);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			if (responseCode>200) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in "+links);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links);
			}
			httpUrlConnection.disconnect();
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response "+ links );
			assrt.fail("Unable to fetch the link response "+links);
		} 

	}		
}
