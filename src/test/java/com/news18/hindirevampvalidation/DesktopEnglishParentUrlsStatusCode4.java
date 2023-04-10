package com.news18.hindirevampvalidation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopEnglishParentUrlsStatusCode4 extends WebDriverActions {

	protected static List<String> englishUrls; 
	GenericUtility genericUtility = new GenericUtility();
	 SoftAssert softassert = new SoftAssert();

	@Test
	public void validateEnglishUrlStatusCode() throws Throwable
	{
		String url;
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();
		Statement stat = con.createStatement();
		String query="SELECT urls FROM english_urls limit 500001,100000; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("urls"));
		}
		list.parallelStream().forEach(e-> checkLinks1(e));
		softassert.assertAll("Issues found in hindi  urls status code ");
		result.close();
		stat.close();
		dbConnectionClose();
	}
	
	/**
	 * @author DanishR
	 * Validates the Url response code from the server
	 * @param links
	 */
	public void checkLinks1(String links)  {
		//			SoftAssert softAssert = new SoftAssert();
		try {
			String authStr = "news18hindi:!3h3rkhan";
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8
			
			HttpURLConnection	 httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			//				URL url=new URL(links);
			httpUrlConnection.setConnectTimeout(10000);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			if (responseCode>200) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
//				softassert.fail("Status code is "+responseCode +" URL has issue in "+links);
				softassert.fail(responseCode +" "+links);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links);
			}
			httpUrlConnection.disconnect();
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response "+ links );
			softassert.fail("Unable to fetch the link response "+links);
		} 
		
	}	

}
