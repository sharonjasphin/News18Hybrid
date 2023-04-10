package com.news18.hindirevampvalidation;

import java.util.ArrayList;
import java.util.List;

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

public class DesktopHindiMigrationUrlsGetParentUrlsTest14 extends WebDriverActions {

	ITestResult result;
	protected static List<String> revampUrls; 
	GenericUtility genericUtility = new GenericUtility();



	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		revampUrls = dbGetHindiRevampUrls(700000,50000);
	}


	@DataProvider(name = "hindiRevampUrls14")
	public static Object[] hindiRevampUrl()
	{
		try{
			Object data[]= new Object[revampUrls.size()];
			for (int i = 0; i < revampUrls.size(); i++) 
			{
				data[i] = revampUrls.get(i);
			}
			System.out.println("Fetching Hindi Revamp Urls "+revampUrls.size());
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}

	@Test(dataProvider = "hindiRevampUrls14")
	public void validateHindiRevampUrls(String url) throws Throwable
	{
		List<String> articleList = new ArrayList<String>();
		Logs.info(getClass(),"Current DB Url is "+ url);

			Document doc = Jsoup.connect(url).get();// enter the url
			Elements links = doc.select("div>p>a[href^=http]");
			for (int i = 0; i <links.size(); i++) {

				articleList.add(links.get(i).attr("href")) ;
				System.out.println(articleList);
				dbInsertHindiRevampUrls(url, articleList.get(i));
			}
			doc=null;
			links=null;
			System.gc();
		}
}
