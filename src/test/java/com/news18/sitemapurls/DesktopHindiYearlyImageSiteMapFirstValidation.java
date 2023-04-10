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

import com.news18.init.GenericUtility;
import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiYearlyImageSiteMapFirstValidation extends WebDriverActions {
	InitializePages pages;
	GenericUtility glib=new GenericUtility();
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();


//	@BeforeMethod
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
	public void N18_HI_ALL_IMG() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiImageSiteMap"));
		ArrayList<String> smList = new ArrayList<String>();
		try {
			smList=getSiteMapLinks(getCurrentPageUrl());
			for (int i = 0; i < smList.size(); i++) {
				ArrayList<String> smArtList = new ArrayList<String>();
//				Logs.info(getClass(),"Site Map link is : " +smList.get(i));
				navigateToUrl(smList.get(i));
				try {
					smArtList=getSiteMapLinks(smList.get(i));
					Logs.info(getClass(),"Total links added in list : " +smArtList.size());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					assrt.fail(" Unable fectch LOC Urls in " +smList.get(i));
				}
				try {
					String url = smList.get(i);
					smArtList.parallelStream().forEach(e -> checkLinksSiteMap(e,url));
					
//					failedLinks.parallelStream().forEach(e->checkLinksSiteMap(e));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					assrt.fail(" Possibily no Urls found in "+smArtList.get(i) );
				}
//				assrt.assertAll("Issues found in Site Map Url for "+smList.get(i)+" :");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			Logs.error(getClass(),"Invalid xml ");
			e.printStackTrace();
		}
		
		assrt.assertAll("Issues found in Site Map : ");
	}
	
	
	
	/**
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 * @return 
	 */
	public void checkLinksSiteMap(String links,String parentUrl)  {
		try {
			int responseCode=0;
			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(10000);	
			httpUrlConnection.connect();
			responseCode = httpUrlConnection.getResponseCode();
			
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


