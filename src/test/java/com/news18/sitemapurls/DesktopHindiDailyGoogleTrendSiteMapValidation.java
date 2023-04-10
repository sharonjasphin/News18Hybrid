package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.RetryTestScript;
import com.news18.init.WebDriverActions;

public class DesktopHindiDailyGoogleTrendSiteMapValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();
	GenericUtility genericUtility=new GenericUtility();
	public List<WebElement> googleTrendsEleList;
	public WebElement allSection;
	ITestResult result;

	@BeforeSuite(alwaysRun = true)
	public void setupSuite(ITestContext context) {
		for (ITestNGMethod method : context.getAllTestMethods()) {
			method.setRetryAnalyzerClass(RetryTestScript.class);
		}
	}

	@BeforeMethod
	@Parameters({"url"})
	public void navigateToHomePageURL(String url) {
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



	/**
	 * @author SanjeebKumarPati, Anupam Gupta
	 * This Method is use to verify SiteMap Urls having the google trends words.
	 * @throws Throwable 
	 */
	@Test
	public void verifyGoogleTrends() throws Throwable
	{
		waitForElement(10000);
		waitForSecond(5000);
		allSection=pages.desktopHindiRevampLandingPage.getAllSectionEle();
		waitForElementVisibility(allSection, 5000);
		ArrayList<String> smDailyList = new ArrayList<String>();
		LinkedHashSet<String> textList = new LinkedHashSet<String>();
		ArrayList<String> urlList = new ArrayList<String>();
		List<String> synonymsList = new ArrayList<String>();
		//		String status="";
		String url = fileUtility.readDataFromPropertyFile("hindiDailySiteMapUrl")+genericUtility.todaysDate()+".xml";
		Logs.info(getClass(),"Daily Site Map link is : " +url);
		try {
			smDailyList=genericUtility.getSiteMapLinks(url);
			synonymsList=dbGetGoogleTrendsSynonyms();
			googleTrendsEleList=pages.desktopHindiRevampLandingPage.getGoogleTrendsEleList();
			Assert.assertTrue(googleTrendsEleList.size()>0, "Failed To Fetch the elements from Google Trend Url");
			for(int i =0;i<googleTrendsEleList.size();i++)
			{
				String trendTopic = getAttribute("title", googleTrendsEleList.get(i));
				trendTopic=trendTopic.replace("Explore ", "").replace(". ", "").replace(".", "").replace("'", "").replace("(", "").replace(")", "").replace("’", "").replace(" ", "-").replace(":", "").toLowerCase();
				trendTopic=trendTopic.replaceAll(" ", null);
				if(trendTopic==null)
				{
					Logs.error(getClass(), "Not Able To Get The Text");
				}
				else if((trendTopic.equals("2022") || trendTopic.equals("2023") || trendTopic.equals("india")) )
				{
					Logs.info(getClass(), trendTopic);	
				}
				else 
				{
					Logs.info(getClass(), trendTopic);	
					textList.add(trendTopic);
				}
			}
			
			Logs.info(getClass(), ""+textList);
			Logs.info(getClass(), "Google trends topic size "+textList.size());
			Assert.assertTrue(textList.size()>0, "Google Trends Page Not Loaded");
			for(String j:textList)
			{
				int count =0;
				for(int k =0;k<smDailyList.size();k++)
				{
					if(smDailyList.get(k).toLowerCase().contains(j))
					{
						count ++;
						urlList.add(smDailyList.get(k)+"\n");	
					}

				}
				String str=urlList.toString();
				if(urlList.size()==0)
				{	
					str=("   KeyWord not found in SiteMap URL  "+url );
					//					status="NO";

				}
				else
				{
					Logs.info(getClass(), str);
					//					status="YES";
				}
				insertIntoGoogleTrendsDB(j,"Hindi", str, count);
				urlList.clear();
			}
			

			//Checking for Synonyms 
			for(String j:synonymsList)
			{	
				int count =0;
				for(int k =0;k<smDailyList.size();k++)
				{
					if(smDailyList.get(k).toLowerCase().contains(j))
					{
						count ++;
						urlList.add(smDailyList.get(k)+"\n");	
					}

				}
				String str=urlList.toString();
				if(urlList.size()==0)
				{	
					str=("   KeyWord not found in SiteMap URL  "+url );
					//					status="NO";

				}
				else
				{
					Logs.info(getClass(), str);
					//					status="YES";
				}
				if(count==0)
				{
					Logs.info(getClass(), "Synonym words are not present");
				}
				else
				{
					insertIntoGoogleTrendsDB(j,"English", str, count);	
				}
				urlList.clear();
			}
		} catch (Exception e) {
			Logs.error(getClass(),"Invalid URL " +url);
			e.printStackTrace();
		}
	}

}


