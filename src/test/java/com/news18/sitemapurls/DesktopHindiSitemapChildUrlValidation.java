package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
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

public class DesktopHindiSitemapChildUrlValidation extends WebDriverActions {

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

	@DataProvider(name = "hindiSitemapUrls")
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

	@Test(dataProvider = "hindiSitemapUrls",priority=-1)
	public void insertDBChildSitemapUrls(String url) throws Throwable {
		String methodName = new DesktopHindiSitemapChildUrlValidation() {}.getClass().getEnclosingMethod().getName();
		String className = new DesktopHindiSitemapChildUrlValidation() {}.getClass().getEnclosingClass().getName();
		String lang=checkLanguage(className,methodName);//Extract Language by calling checklanguage method

		String authStr = fileUtility.readDataFromPropertyFile("hindiMigUsername")+":"+fileUtility.readDataFromPropertyFile("hindiMigPwd");
		String base64login = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8
		Logs.info(getClass(),"Current DB Url is "+ url);
//		getLastId=fileUtility.readDataFromPropertyFile("getLastId");
//		limitFrom = dbGetLastId(getLastId);
		Connection.Response response = Jsoup.connect(url)
				.timeout(20000)
				.ignoreHttpErrors(true)
				.header("Authorization", "Basic " + base64login)
				.execute();
		Document doc = response.parse();
		Elements links = doc.select("div[class*=side_srt_gllry]>ul>li>a[href*=news18],div[class*=story_widget]>ul>li>a[href*=news18],div[class*=khbr_lft_sec ]>ul>li>a[href*=news18],div[class*=top-galleries]>ul>li>a[href*=news18],div[class*=new]>ul>li>a[href*=news18],div>p>a[href^=http]:not([href^=tag],:not([href^=instagram]))");
		for (int i = 0; i <links.size(); i++) {
			articleList.add(links.get(i).attr("href")) ;
			dbInsertHindiSiteMapChildUrls(url, articleList.get(i),lang );
		}
	}

	/**
	 * This method validates query checks for Urls format
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void doubleForwardFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		SoftAssert softassert = new SoftAssert();
		List<String> doubleForwardQueryList = new ArrayList<String>();
		String queryDoubleForward=fileUtility.readDataFromPropertyFile("queryDoubleForward");
		doubleForwardQueryList=dbSelectHindiSiteMapChildUrls(queryDoubleForward,limitFrom,articleList.size());
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
	public void multipleHttpsFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> multipleHttpsQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryMultipleHttps=fileUtility.readDataFromPropertyFile("queryMultipleHttps");
		multipleHttpsQueryList=dbSelectHindiSiteMapChildUrls(queryMultipleHttps,limitFrom,articleList.size());
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
	public void slugFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> slugQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String querySlug=fileUtility.readDataFromPropertyFile("querySlug");
		slugQueryList=dbSelectHindiSiteMapChildUrls(querySlug,limitFrom,articleList.size());
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
	public void betaUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> betaUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryBetaUrls=fileUtility.readDataFromPropertyFile("queryBetaUrls");
		betaUrlQueryList=dbSelectHindiSiteMapChildUrls(queryBetaUrls,limitFrom,articleList.size());
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
	public void cmsUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> cmsUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryCmsUrls=fileUtility.readDataFromPropertyFile("queryCmsUrls");
		cmsUrlQueryList=dbSelectHindiSiteMapChildUrls(queryCmsUrls,limitFrom,articleList.size());
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
	public void onlyHttpUrlFormatChildValidation() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> httpUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryOnlyHttp=fileUtility.readDataFromPropertyFile("queryOnlyHttp");
		httpUrlQueryList=dbSelectHindiSiteMapChildUrls(queryOnlyHttp,limitFrom,articleList.size());
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
	public void validateHindiChildUrlStatusCode() throws Throwable
	{
		Logs.info(getClass()," DB Last First ID "+limitFrom+" "+"DB Child urls size "+articleList.size());
		List<String> childUrlsList=new ArrayList<String>();
		String queryStatusCode=fileUtility.readDataFromPropertyFile("queryStatusCode");
		childUrlsList=dbSelectHindiSiteMapChildUrls(queryStatusCode,limitFrom, articleList.size());
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
