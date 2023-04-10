package com.news18.sitemapurls;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopTeluguDailyImageSiteMapValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();


	@Test
	public void N18_TL_IMG_TODAY() throws IOException {
		String url = fileUtility.readDataFromPropertyFile("teluguYearlyImageSiteMapUrl");
		ArrayList<String> smList = new ArrayList<String>();
		ArrayList<String> smArtList = new ArrayList<String>();
		Connection.Response response = Jsoup.connect(url).timeout(20000).ignoreHttpErrors(true).execute();
		Document doc = response.parse();
		String url1 = doc.baseUri();
		Logs.info(getClass(),"Lokmat xml Url is : " +url1);
		try {
			smList=getSiteMapLinks(url);
			for (int i = 0; i < 1; i++) {
				try {
					smArtList=getSiteMapLinks(smList.get(i));
					Logs.info(getClass()," In this Url "+ smList.get(i));
					Logs.info(getClass(),"Total links added in list : " +smArtList.size());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					assrt.fail(" Unable fectch LOC Urls in " +smList.get(i));
				}
				try {
					String parentUrl = smList.get(i);
					smArtList.parallelStream().forEach(e -> checkLinksSiteMap(e,parentUrl));

				} catch (Exception e) {
					e.printStackTrace();
					assrt.fail(" Possibily no Urls found in "+smArtList.get(i) );
				}
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			Logs.error(getClass(),"Invalid xml "+url1);
			e.printStackTrace();
		}

		assrt.assertAll("Issues found in Site Map : ");
	}

	/**
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinksSiteMap(String links,final String parentLink)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8
			if(!(links.contains("telugu.news18.com")))
			{
				String domUrl = fileUtility.readDataFromPropertyFile("teluguUrl").replace("com/", "com")+links;
				links=domUrl;
			}

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
			Logs.error(getClass(), "Unable to fetch the link response "+ links+ " Parent Url : "+parentLink );
			assrt.fail("Unable to fetch the link response "+links+ " Parent Url : "+parentLink);
		} 
	}	
}


