package com.news18.hindirevampvalidation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiMigrationUrlsGetStatusCodeJsoup1 extends WebDriverActions {

	ITestResult result;
	protected static List<String> revampUrls; 
	GenericUtility genericUtility = new GenericUtility();

	

	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();
		Statement stat = con.createStatement();
		String query="select childurl from hindi_migration_urls where childurl not like '%instagram%' limit 17921; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("childurl"));
		}
		revampUrls = list;
		dbConnectionClose();
		
	}


	@DataProvider(name = "hindiRevampUrls1")
	public static Object[] hindiRevampUrl()
	{
		try{
			Object data[]= new Object[revampUrls.size()];
			for (int i = 0; i < revampUrls.size(); i++) 
			{
				data[i] = revampUrls.get(i);
			}
			System.out.println("Fetching Hindi Revamp Urls "+revampUrls.size());
			//			Logs.info(DesktopHindiRevampUrlsTest.class,"Hindi Revamp Urls "+revampUrls);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}


	@Test(dataProvider = "hindiRevampUrls1")
	public void validateHindiRevampUrls(String url) 
	{
		SoftAssert sa = new SoftAssert();
		String replaceNews=url.replace("/news/", "/");
		String replacedUrl=replaceNews.replace("https://hindi.news18.com", "https://www.news18hindi.in");
		url=replacedUrl;
		System.out.println("url "+url);
		checkStatusOfLink(url,sa);
		sa.assertAll("Hindi urls has Issues  : ");
	
	}
	
	public void checkStatusOfLink(String url,SoftAssert sa) {
		
		String login = "news18hindi:!3h3rkhan";
		String base64login = Base64.getEncoder().encodeToString(login.getBytes());
		int statusCode=0;
//		String url=" https://hindi.news18.com/news/sports/cricket-ind-vs-eng-team-india-batting-average-has-been-worst-under-virat-kohli-captaincy-36https://hindi.news18.com/news/sports/cricket-ind-vs-eng-team-india-batting-average-has-been-worst-under-virat-kohli-captaincy-3683456.html83456.html";
//		String url1=" https://www.instagram.com/kajalaggarwalofficial/?utm_source=ig_embed&utm_campaign=loading";
//		"https://iift.nta.nic.in/webinfo/File/ViewFile?FileId=18&LangId=P"
		try{
		    Connection.Response response = Jsoup.connect(url)
		                            .timeout(10000)
		                            .ignoreHttpErrors(true)
		                            .header("Authorization", "Basic " + base64login)
		                            .execute();

		 statusCode = response.statusCode();
		    if(statusCode > 200) {
		        
		            System.out.println("Url : " + url);
		            System.out.println("Statuscode : " + statusCode);
		            sa.fail("Statuscode:"+statusCode+" Url:"+url);
		    }
		
		}
		catch (MalformedURLException e) {
			sa.fail("Malformed URL:"+url);
			
		}
		catch(HttpStatusException e)
			{
				sa.fail("HttpSocketTimeout:"+url);
			}
		 catch (IOException e) {
			sa.fail("IO Exception:"+url);
		}
	}
}
