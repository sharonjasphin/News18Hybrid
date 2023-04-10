package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.IPath;
import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiSitemapParentUrlValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();
	public ArrayList<String> smDailyList = new ArrayList<String>();
	public String url;


	@BeforeMethod
	@Parameters({"url","server"})
	public void navigateToHomePageURL(String url, String serverType) {
		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile(url));
	}

	@BeforeClass
	public void setUp(){
		launchWebBrowser(chrome, desktop);
		pages = new InitializePages(getDriver());
	}	


	@AfterClass
	public void afterClassSetup() {
		closeAllDriver();
	}


	@Test(priority = -1)
	public void hindiSiteMapParentUrlsStatusCodeValidation() throws Throwable {
		url = fileUtility.readDataFromPropertyFile("hindiDailySiteMapUrl")+todaysDate()+".xml";
		Logs.info(getClass(),"Daily Site Map link is : " +url);
		navigateToUrl(url);
		try {
			try {
				smDailyList=getSiteMapLinks(getCurrentPageUrl());
				Assert.assertTrue(smDailyList.size()>0," Possibly Sitemap xml unable to fetch Parent Urls "+ url);
				for (int i = 0; i < smDailyList.size(); i++) {
					dbInsertHindiSiteMapParentUrls(smDailyList.get(i));
				}
				Logs.info(getClass(),"Total links added in list : " +smDailyList.size());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				assrt.fail(" Unable fectch LOC Urls " );
			}

			try {
				Logs.info(getClass(),"Links are being validated ");
				smDailyList.parallelStream().forEach(e -> checkLinksSiteMap(e,url));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assrt.fail(" Possibily no Urls found " );
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			Logs.error(getClass(),"Invalid xml " +url);
			e.printStackTrace();
			assrt.fail(" Invalid xml " +url);
		}
		assrt.assertAll("Issues found in Site Map Url for :");
	}

	/**
	 * This method validates query checks for Urls format
	 * @param queryList
	 * @throws Throwable 
	 */
	@Test
	public void doubleForwardFormatParentValidation() throws Throwable
	{
		SoftAssert softassert = new SoftAssert();
		List<String> doubleForwardQueryList = new ArrayList<String>();
		String queryDoubleForward=fileUtility.readDataFromPropertyFile("queryParentDoubleForward");
		doubleForwardQueryList=dbSelectHindiSiteMapParentUrls(queryDoubleForward);
		for (int j = 0; j < doubleForwardQueryList.size(); j++) {
			if (doubleForwardQueryList.size()>0) {

				softassert.fail("Double Forward Slash Format issues in this Url :"+doubleForwardQueryList.get(j)+ " Its Parent Url : "+url);
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
	public void multipleHttpsFormatParentValidation() throws Throwable
	{
		List<String> multipleHttpsQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryMultipleHttps=fileUtility.readDataFromPropertyFile("queryParentMultipleHttps");
		multipleHttpsQueryList=dbSelectHindiSiteMapParentUrls(queryMultipleHttps);
		for (int j = 0; j < multipleHttpsQueryList.size(); j++) {
			if (multipleHttpsQueryList.size()>0) {
				softassert.fail("Multiple HTTPS Format issues in this Url :"+multipleHttpsQueryList.get(j)+ " Its Parent Url : "+url);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ multipleHttpsQueryList.get(j));
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
	public void slugFormatParentValidation() throws Throwable
	{
		List<String> slugQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String querySlug=fileUtility.readDataFromPropertyFile("queryParentSlug");
		slugQueryList=dbSelectHindiSiteMapParentUrls(querySlug);
		for (int j = 0; j < slugQueryList.size(); j++) {
			if (slugQueryList.size()>0) {
				softassert.fail("Slug Format issues in this Url :"+slugQueryList.get(j)+ " Its Parent Url : "+url);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ slugQueryList.get(j));
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
	public void betaUrlFormatParentValidation() throws Throwable
	{
		List<String> betaUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryBetaUrls=fileUtility.readDataFromPropertyFile("queryParentBetaUrls");
		betaUrlQueryList=dbSelectHindiSiteMapParentUrls(queryBetaUrls);
		for (int j = 0; j < betaUrlQueryList.size(); j++) {
			if (betaUrlQueryList.size()>0) {
				softassert.fail("Beta Url Format issues in this Url :"+betaUrlQueryList.get(j)+ " Its Parent Url : "+url);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ betaUrlQueryList.get(j));
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
	public void cmsUrlFormatParentValidation() throws Throwable
	{
		List<String> cmsUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryBetaUrls=fileUtility.readDataFromPropertyFile("queryParentCmsUrls");
		cmsUrlQueryList=dbSelectHindiSiteMapParentUrls(queryBetaUrls);
		for (int j = 0; j < cmsUrlQueryList.size(); j++) {
			if (cmsUrlQueryList.size()>0) {
				softassert.fail("Beta Url Format issues in this Url :"+cmsUrlQueryList.get(j)+ " Its Parent Url : "+url);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ cmsUrlQueryList.get(j));
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
	public void onlyHttpUrlFormatParentValidation() throws Throwable
	{
		List<String> httpUrlQueryList = new ArrayList<String>();
		SoftAssert softassert = new SoftAssert();
		String queryOnlyHttp=fileUtility.readDataFromPropertyFile("queryParentOnlyHttp");
		httpUrlQueryList=dbSelectHindiSiteMapParentUrls(queryOnlyHttp);
		for (int j = 0; j < httpUrlQueryList.size(); j++) {
			if (httpUrlQueryList.size()>0) {
				softassert.fail("Only HTTP Format issues in this Url :"+httpUrlQueryList.get(j)+ " Its Parent Url : "+url);
			}
			else {
				Logs.info(getClass(),"No Format issues in this Url :"+ httpUrlQueryList.get(j));
			}
		}
		softassert.assertAll();
	}

	/**
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinksSiteMap(String links,String parentUrl)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("hindiMigUsername")+":"+fileUtility.readDataFromPropertyFile("hindiMigPwd");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(20000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();

			if (responseCode>200) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in "+links+ " Its Parent Url : "+parentUrl);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links);
			}
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
			assrt.fail("Unable to fetch the link response "+links+ " Its Parent Url : "+parentUrl);
		} 
	}	

}


