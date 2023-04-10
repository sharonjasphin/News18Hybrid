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

public class DesktopHindiMigrationUrlsValidateFormatTest extends WebDriverActions {

	protected static List<String> revampUrls; 
	GenericUtility genericUtility = new GenericUtility();
	public SoftAssert softassert = new SoftAssert();



	@Test
	public void validateHindiRevampUrlsValidateFormat() throws Throwable
	{
//		SoftAssert softassert = new SoftAssert();
		String url;
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();
		Statement stat = con.createStatement();
		String query="select urls from hindi_revamp_urls; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("urls"));
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			softassert.assertTrue(list.get(i).contains("https") , "Possibly https is Missing "+list.get(i));
			softassert.assertFalse(list.get(i).contains("betahindi.news18.com") , "Possibly Hyperlink contains BetaHindi "+list.get(i));
			
		}
		softassert.assertAll("Issues found in Url Format Validation ");
		result.close();
		stat.close();
	}

}
