package com.news18.sitemapurls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopAssamNewsSiteMapValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();


	@Test
	public void N18_AS_NEWS() {
		ArrayList<String> smDailyList = new ArrayList<String>();
		String url = fileUtility.readDataFromPropertyFile("AssamNewsSiteMapUrl");
		Logs.info(getClass(),"Daily Site Map link is : " +url);
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
				for (int i = 0; i < smDailyList.size(); i++) {
					assrt.assertFalse(smDailyList.get(i).contains("index.html")," Issue in Url format " +smDailyList.get(i));
				}
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
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinksSiteMap(String links,String parentLink)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(40000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			
			if (responseCode>200) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in "+links+ " Its Parent Url : "+parentLink);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links+ " Its Parent Url : "+parentLink);
			}
			httpUrlConnection.disconnect();
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response "+ links+ " Its Parent Url : "+parentLink );
			assrt.fail("Unable to fetch the link response "+links+ " Its Parent Url : "+parentLink);
		} 
	}	
	
}


