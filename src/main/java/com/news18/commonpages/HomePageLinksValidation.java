package com.news18.commonpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;



/**
 * @author DanishR
 * This class is used to check all the links present on HomePage are working fine
 * present in Desktop, Mobile and AMP Mode which is common for All the Languages 
 */
public class HomePageLinksValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions=new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert assrt = new SoftAssert();

	public HomePageLinksValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*All href https Links present in HomePage   */
	@FindBy(xpath = "//a[starts-with(@href,'http') and contains(@href,'news18.com')]")
	private List<WebElement>  hrefLinks;

	/*All href https Links present in HomePage   */
	@FindBy(xpath = "//a[starts-with(@href,'http') and contains(@href,'news18.com')]")
	private List<WebElement>  betaLinks;

	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllLinksOnHomepage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.scrollDown();
		Logs.info(getClass(),"Total Links "+hrefLinks.size());
		List<String> list=new ArrayList<String>();
		for(WebElement wb:hrefLinks)
		{
			String attribute = wb.getAttribute("href");
			list.add(attribute);
		}
		long startingTime= System.currentTimeMillis();
		list.parallelStream().forEach(e -> checkLinks(e));
		long endingTime= System.currentTimeMillis();
		Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}


	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllLinksOnMobileHomepage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.mobileScroll(10);
		webDriverActions.scrollToLast();
		Logs.info(getClass(),"Total Links "+hrefLinks.size());
		List<String> list=new ArrayList<String>();
		for(WebElement wb:hrefLinks)
		{

			String attribute = wb.getAttribute("href");
			list.add(attribute);
		}
		long startingTime= System.currentTimeMillis();
		list.parallelStream().forEach(e -> checkLinks(e));
		long endingTime= System.currentTimeMillis();
		Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}

	/**
	 * This method is used to take response code of the URL's
	 * @param links
	 */
	public void checkLinks(String links)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(40000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			if (responseCode>200 && responseCode!=401 ) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in "+links);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links);
			}
			httpUrlConnection.disconnect();
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}	

	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllBetaLinks(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000); 
		webDriverActions.mobileScroll(10);
		webDriverActions.scrollToLast();
		Logs.info(getClass(),"Total Links "+betaLinks.size());
		List<String> list=new ArrayList<String>();
		for(int j=0;j<betaLinks.size();j++)
		{
			String attribute = betaLinks.get(j).getAttribute("href");
			if (serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				attribute=betaUrl;
			}
			list.add(attribute);
		}
		long startingTime= System.currentTimeMillis();
		list.parallelStream().forEach(e -> checkLinksBeta(e));
		long endingTime= System.currentTimeMillis();
		Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}

	/**
	 * This method is used to take response code of the URL's
	 * @param links
	 */
	public void checkLinksBeta(String links)  {
		try {

			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(10000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			Logs.info(getClass(), "Response code is : "+responseCode+" "+links);
			if (responseCode>200 && responseCode!=401) {
				Logs.error(getClass(), responseCode + "--------------- "  +links);
				assrt.fail("Status code is "+responseCode +" URL has issue in " +links);
			}
			else {
				Logs.info(getClass(), responseCode + "--------------- "  +links);
			}
			httpUrlConnection.disconnect();
		}	
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}	
}
