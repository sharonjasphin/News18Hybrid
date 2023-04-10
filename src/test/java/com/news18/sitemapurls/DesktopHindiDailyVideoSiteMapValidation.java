package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiDailyVideoSiteMapValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();


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


	@Test
	public void N18_HI_VDO() {
		ArrayList<String> smDailyList = new ArrayList<String>();
		String url = getCurrentPageUrl();
		try {
			try {
				smDailyList=getSiteMapLinks(url);
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
//			assrt.assertAll("Issues found in Site Map Url for :");
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
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinksSiteMap(String links,String parentUrl)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(10000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			
			if (responseCode>200) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in "+links+ " Its Parent Url : "+parentUrl);
			}
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
			assrt.fail("Unable to fetch the link response "+links+ " Its Parent Url : "+parentUrl);
		}
	}	
	
}


