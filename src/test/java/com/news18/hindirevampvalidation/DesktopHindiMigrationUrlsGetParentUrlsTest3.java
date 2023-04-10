package com.news18.hindirevampvalidation;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.news18.init.GenericUtility;
import com.news18.init.InitializePages;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopHindiMigrationUrlsGetParentUrlsTest3 extends WebDriverActions {

	InitializePages pages;
	ITestResult result;
	protected static List<String> revampUrls; 
	GenericUtility genericUtility = new GenericUtility();
	//	public InitializePages pages = new InitializePages(getDriver());

//	@BeforeClass
	public void setUp(){
		launchWebBrowser(chrome, desktop);
		pages = new InitializePages(getDriver());
	}	


	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		revampUrls = dbGetHindiRevampUrls(20000,10000);
	}


	@DataProvider(name = "hindiRevampUrls3")
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

	@Test(dataProvider = "hindiRevampUrls3")
	public void validateHindiRevampUrls(String url) throws Throwable
	{
		String login = "news18hindi:!3h3rkhan";
		String base64login = Base64.getEncoder().encodeToString(login.getBytes());

		List<String> articleList = new ArrayList<String>();
		Logs.info(getClass(),"Current DB Url is "+ url);

		Connection.Response response = Jsoup.connect(url)
                .timeout(10000)
                .ignoreHttpErrors(true)
                .header("Authorization", "Basic " + base64login)
                .execute();
		Document doc = response.parse();
		Elements links = doc.select("div>p>a[href^=http],div>p>strong>a[href^=http]");
		for (int i = 0; i <links.size(); i++) {

			articleList.add(links.get(i).attr("href")) ;
//			System.out.println(articleList);
			dbInsertHindiRevampUrls(url, articleList.get(i));
		}
		doc=null;
		links=null;
		System.gc();
	}
}
