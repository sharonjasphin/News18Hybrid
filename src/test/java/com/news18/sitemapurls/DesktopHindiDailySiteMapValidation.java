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

public class DesktopHindiDailySiteMapValidation extends WebDriverActions {
	InitializePages pages;
	public List<String> streamUrl = null;
	SoftAssert assrt = new SoftAssert();
	public static List<String> failedLinks=new ArrayList<String>();


	@Test
	public void N18_HI_TDAY() {
		String url = fileUtility.readDataFromPropertyFile("hindiImageSiteMap");
		ArrayList<String> smList = new ArrayList<String>();
		ArrayList<String> smArtList = new ArrayList<String>();
		Logs.info(getClass(),"Lokmat xml Url is : " +url);
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
			Logs.error(getClass(),"Invalid xml "+url);
			e.printStackTrace();
		}

		assrt.assertAll("Issues found in Site Map : ");
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


