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

public class DesktopEnglishUrlsGetChildUrlsTest2 extends WebDriverActions {

	//InitializePages pages;
	ITestResult result;
	protected static List<String> englishUrls; 
	GenericUtility genericUtility = new GenericUtility();
	//	public InitializePages pages = new InitializePages(getDriver());

//	@BeforeClass
//	public void setUp(){
//		launchWebBrowser(chrome, desktop);
//		pages = new InitializePages(getDriver());
//	}	


	@BeforeClass
	public void beforeClassConfig() throws Throwable {
		englishUrls = dbGetHindiRevampUrls(60001,10000);
	}


	@DataProvider(name = "englishUrls2")
	public static Object[] englishUrl()
	{
		try{
			Object data[]= new Object[englishUrls.size()];
			for (int i = 0; i < englishUrls.size(); i++) 
			{
				data[i] = englishUrls.get(i);
			}
			System.out.println("Fetching English Urls "+englishUrls.size());
			//			Logs.info(DesktopHindiRevampUrlsTest.class,"Hindi Revamp Urls "+revampUrls);
			return data;
		}
		catch(Exception e)
		{
			return new Object[] {};
		}
	}

	@Test(dataProvider = "englishUrls2")
	public void validateEnglishUrls(String url) throws Throwable
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
		String xpath = "//div//h2//ancestor::div[contains(@class,'heading_title') or contains(@class,'photo')]//following-sibling::ul//li//a[contains(@href,'news18')]|//div//p//a[contains(@href,'news18')]|//div[contains(@class,'tag')]//li//a[contains(@href,'news18')]";
		Elements links = doc.selectXpath(xpath);
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
