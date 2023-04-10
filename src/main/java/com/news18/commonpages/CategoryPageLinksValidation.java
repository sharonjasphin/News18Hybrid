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
public class CategoryPageLinksValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions=new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert assrt = new SoftAssert();

	public CategoryPageLinksValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*LineOne Section Elements except states Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a")
	private List<WebElement> lineOneSectionEleList; 

	/*Linetwo Section Elements Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'sub_navigation_ul')]//a")
	private List<WebElement> lineTwoSectionEleList; 
	
	/*Latest Section Articles */
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a")
	private List<WebElement>  lineOneSectionMobileElementsList;

	
	/*All href https Links present in HomePage   */
	@FindBy(xpath = "//a[(starts-with(@href,'https://')or starts-with(@href,'/') ) and not(contains(@href,'taboola'))and (not(contains(@href,'ad.'))) and (not(contains(@rel,'sponsored'))) and (not(contains(@href,'twitter')))and (not(contains(@href,'instagram'))) and (not(contains(@href,'youtube')))and (not(contains(@href,'facebook')))and (not(contains(@href,'t.me')))]")
	private List<WebElement>  hrefLinks;

	/*All href https Links present in HomePage   */
	@FindBy(xpath = "//a[(starts-with(@href,'https://')or starts-with(@href,'/') ) and not(contains(@href,'taboola'))and (not(contains(@href,'ad.'))) and (not(contains(@rel,'sponsored'))) and (not(contains(@href,'twitter')))and (not(contains(@href,'instagram'))) and (not(contains(@href,'youtube')))and (not(contains(@href,'facebook')))and (not(contains(@href,'t.me')))]")
	private List<WebElement>  betaLinks;

	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllLinksInCategoryPages(String un,String pwd,String serverType) {
		
		webDriverActions.waitForPageToLoad();
	for (int i = 2; i < lineOneSectionEleList.size(); i++) {
		
		webDriverActions.softClickJS(lineOneSectionEleList.get(i));	
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.scrollDown();
		Logs.info(getClass(),"Total Links "+hrefLinks.size());
		List<String> list=new ArrayList<String>();
		for(int j=0;j<hrefLinks.size();j++)
		{
			String attribute = hrefLinks.get(j).getAttribute("href");
			if (serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				attribute=betaUrl;
			}
			list.add(attribute);
		}
		//added to check list of urls
		System.out.println("Urls:"+list);
		list.parallelStream().forEach(e -> checkLinks(e,un,pwd));
	}
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}
	


	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllLinksOnMobileHomepage(String un,String pwd,String serverType) {
		webDriverActions.waitForPageToLoad();
		for (int i = 1; i < lineOneSectionMobileElementsList.size(); i++) {
		webDriverActions.softClickJS(lineOneSectionMobileElementsList.get(i));
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.mobileScroll(10);
		webDriverActions.scrollToLast();
		Logs.info(getClass(),"Total Links "+hrefLinks.size());
		List<String> list=new ArrayList<String>();
		for(int j=0;j<hrefLinks.size();j++)
		{
			String attribute = hrefLinks.get(j).getAttribute("href");
			if (serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				attribute=betaUrl;
			}
			list.add(attribute);
		}
		list.parallelStream().forEach(e -> checkLinks(e,un,pwd));
		}
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}

	/**
	 * This method is used to take response code of the URL's
	 * @param links
	 */
	public void checkLinks(String links,String un,String pwd)  {
		try {

			String authStr = un +":"+pwd;
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);

			//Connect
			httpUrlConnection.setConnectTimeout(40000);	
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			if((responseCode>200))
			{
				Logs.info(getClass(), "Response code is : "+responseCode+" "+links);
				assrt.assertTrue((responseCode==200), "URL has issue in these "+links + " Response code is: " +responseCode);

			}
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
			assrt.fail( "URL has issue unable to fetch response :"+links);
		} 
	}	

	/**
	 * This method is used to verify the links present on HomePage
	 * 
	 */
	public void verifyAllLinksInCategoryPagesL2(String un,String pwd,String serverType) {
		
		webDriverActions.waitForPageToLoad();
	for (int i = 0; i < lineTwoSectionEleList.size(); i++) {
		webDriverActions.softClickJS(lineTwoSectionEleList.get(i));	
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.scrollDown();
		Logs.info(getClass(),"Total Links "+hrefLinks.size());
		List<String> list=new ArrayList<String>();
		for(int j=0;j<hrefLinks.size();j++)
		{
			String attribute = hrefLinks.get(j).getAttribute("href");
			if (serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				attribute=betaUrl;
			}
			list.add(attribute);
		}
		list.parallelStream().forEach(e -> checkLinks(e,un,pwd));
	}
		assrt.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}
	

}
