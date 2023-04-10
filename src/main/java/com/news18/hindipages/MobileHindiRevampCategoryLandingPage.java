package com.news18.hindipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 * This Class Contains elements and business logics for AMP Hindi Revamp Desktop Landing  Page
 *
 */
public class MobileHindiRevampCategoryLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public MobileHindiRevampCategoryLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//================================= Sanjeeb's Elements =======================================
	
	//=======Blog Category =======================
	
	/* Author list present on Blog Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'list__item')]/a")
	private List<WebElement> authorList;
	
	/* Author header Text list present on Blog Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'list__item')]/h2/a")
	private List<WebElement> authorheaderTextList;
	
	/* Read more Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'list__item')]/p/a")
	private List<WebElement> authorTextBoxReadMoreList;

	/* Date Time Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'list__item')]/h2/span")
	private List<WebElement> dateTimeList;

	/* Txt Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//div[contains(@class,'list__item')]/p")
	private List<WebElement> textList;
	
	//==========================Vipin's WebElements (Category Page)=============================//

	// Common Category Articles Links //
	@FindBy(xpath = "//div[contains(@class,'nwctgrtopnew')]/a|//ul[contains(@class,'topstories')]/li/a")
	private List<WebElement> commonsCategoryArticleLnk;

	//------------------------Latest News (Category Page)-----------------------------//

	/*BreadCrumb Links present in the category page*
		/*Latest News Read More Link in Category Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'newbotbrdrbtn')]/a")
	private WebElement latestNewsReadMoreLnk;

	/*Latest News Priority Panel Category Name Links in Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'nwctgrtopnew')]/a/h1/span | //ul[contains(@class,'topstories')]/li/a/h2/span")
	private List<WebElement> latestNewsCategoryNameLnk;

	/*BreadCrumb Links present in the category page*/
	@FindBy(xpath="//section/ul[contains(@class,'brdcrmb')]/li/a[@href]")
	private List<WebElement> breadCrumbLnks;

	/*Breadcrumb Text present in Category Page*/
	@FindBy(xpath="//section/ul[contains(@class,'brdcrmb')]/li/a/h2")
	private WebElement breadCrumbTxt;

	/*Header Text present in Category Page*/
	@FindBy(xpath="//div[contains(@class,'newtopctgrhd')]//h1")
	private WebElement headerTxt;

	/*List of Promoted Content*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*List of Promoted Content image */
	@FindBy(xpath ="//div[contains(@id,'taboola-below') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]//div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Article Body Taboola Logo in Landing*/
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*List of Promoted Content*/
	@FindBy(xpath ="//div[contains(@id,'taboola-mid') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> bodyTaboolaArticleLst;

	/*List of Promoted Content image */
	@FindBy(xpath ="//div[contains(@id,'taboola-mid') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]//div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> bodyTaboolaImgLnk;

	/*Article Body Taboola Logo in Landing*/
	@FindBy(xpath = "//div[contains(@id,'taboola-mid')]//div[contains(@class,'logoDiv link-attribution ')]")
	private WebElement bodyTaboolaLogo;

	//=======Blog Category =======================

	/*BreadCrumb Links present in the category page*/
	@FindBy(xpath="//div[contains(@class,'breadcrumb')]/a[@href]")
	private List<WebElement> blogsBreadCrumbLnks;

	/* News18 Minis Category Webelement*/

	/*News18Minis BreadCrumb Links present in the category page*/
	@FindBy(xpath="//div[contains(@class,'breadcum')]/a[@href]")
	private List<WebElement> news18MinisBreadCrumbLnks;

	/*News18Minis Breadcrumb Text present in Category Page*/
	@FindBy(xpath="//div[contains(@class,'breadcum')]/h2")
	private WebElement news18MinisBreadCrumbTxt;

	/*News18Minis Header Text present in Category Page*/
	@FindBy(xpath="//div[contains(@class,'nw18_minis')]/div//h1")
	private WebElement news18MinisHeaderTxt;

	
	
	
	//=================================Sanjeeb's Business Logics================================
	
	//============== Blog Category
	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verfyAuthorTextBoxPresntOnBody(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(authorheaderTextList.size()>0,"Unable To Display Author Text in "+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < authorheaderTextList.size(); i++)
		{
			webDriverActions.softScrollToElement(authorheaderTextList.get(i));
			webDriverActions.softHighlightElement(authorheaderTextList.get(i));
			webDriverActions.softMouseHover(authorheaderTextList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", authorheaderTextList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", authorheaderTextList.get(i));
			webDriverActions.softWaitForElementVisibility(authorheaderTextList.get(i), 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorheaderTextList.get(i)),"header Text is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(dateTimeList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(dateTimeList.get(i)),"date Time is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(authorTextBoxReadMoreList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorTextBoxReadMoreList.get(i)),"Read more Box is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(textList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(textList.get(i)),"text list is not visible for this Url "+pageUrl);
			webDriverActions.softClick(authorList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(authorheaderTextList.get(i), 3);
				webDriverActions.softClickJS(authorheaderTextList.get(i));
			}
			webDriverActions.waitForPageToLoad();
			//			String expected = webDriverActions.getCurrentPageUrl();	
			//			if(server.contains("preProd") && !expected.contains("//beta"))
			//			{
			//				String betaUrl = genericUtility.replaceInUrl(expected);
			//				expected=betaUrl;
			//				webDriverActions.navigateToUrl(expected);
			//			}
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{	
				webDriverActions.navigateToUrl(actualUrl);
			}
		}
		softAssert.assertAll("Author Text Box Presnt On Body Validation Failed ");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verfyAuthorListPresntOnBody(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(authorList.size()>0,"Unable To Display the author list in "+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < authorList.size(); i++)
		{
			webDriverActions.softScrollToElement(authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softMouseHover(authorList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", authorList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
			webDriverActions.softClick(authorList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
				webDriverActions.softClickJS(authorList.get(i));
			}
			webDriverActions.waitForPageToLoad();
			//			String expected = webDriverActions.getCurrentPageUrl();	
			//			if(server.contains("preProd") && !expected.contains("//beta"))
			//			{
			//				String betaUrl = genericUtility.replaceInUrl(expected);
			//				expected=betaUrl;
			//				webDriverActions.navigateToUrl(expected);
			//			}
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{	
				webDriverActions.navigateToUrl(actualUrl);
			}
		}
		softAssert.assertAll("Author List Presnt On Body Validation Failed ");
	}
	
	/*--------------------Vipin's Business Logic ( Category Page )-------------------------*/

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 *  This method is used to Validate the Breadcrumb Navigation For 
	 */
	public void verifyBreadCrumbNavigation(String serverType  , List<WebElement> articleBreadCrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(articleBreadCrumb.size()>0, "Possibly Breadcrumb is Not Visible in "+expectedUrl);
		for(int j=0; j<articleBreadCrumb.size(); j++) {
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(articleBreadCrumb.get(j));
			webDriverActions.softClickJS(articleBreadCrumb.get(j));
			String currentPageUrlCP = webDriverActions.getCurrentPageUrl();
			String expectedUrlCP = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrlCP.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrlCP);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrlCP = betaUrl;
			}
			String currentUrlCP = webDriverActions.getCurrentPageUrl();
			int responseCP = genericUtility.checkLinks(currentUrlCP);
			softAssert.assertTrue(responseCP==200, "Possibly Url is Invalid "+currentUrlCP + " Response Code "+responseCP);
			if (currentPageUrlCP.contains(expectedUrlCP)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		webDriverActions.waitForPageToLoad();
		softAssert.assertAll("Issues found in Article Body ");
	}

	/**
	 * @param serverType
	 * @param headerText
	 * @author VipinKumarGawande
	 * This method is used to verify the breadcrumb and header text from Category page.
	 * @param serverType
	 */
	public void verifyBreadcrumbAndHeaderTextValidation(String serverType, WebElement breadcrumbText , WebElement headerText  )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(breadcrumbText);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumbText, 1) , "Unable to Display Breadcrumb Text in "+currentPageUrl);
		webDriverActions.softHighlightElement(headerText);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerText, 1) , "Unable to Display Header Text in "+currentPageUrl);
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList )
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//			String homeUrl =webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		webDriverActions.waitForSecond(1000);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl = webDriverActions.getAttribute("href", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @param moreLnk
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Widget News Navigation
	 */
	public void verifyMoreNewsNavigation(String serverType , WebElement moreLnk ) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 20);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, currentPage), "Possibly not navigate to same page "+actualUrl);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyArticleTaboolaNavigation(String serverType ,List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImglement, WebElement taboolaLogo)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(taboolaLogo, 7);
		webDriverActions.softHighlightElement(taboolaLogo);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(taboolaLogo), "Possibly Article Body Taboola Feed Logo is Not Visible in "+currentPageUrl);
		softAssert.assertTrue(taboolaFeedArticle.size()>0, "Possibly Taboola Feeds Is Not Visible in "+currentPageUrl);
		for(int j =0 ; j<taboolaFeedArticle.size() ; j++)
		{
			webDriverActions.softMouseHover(taboolaFeedArticle.get(j));
			webDriverActions.softMouseHover(taboolaFeedImglement.get(j));
			webDriverActions.softHighlightElement(taboolaFeedArticle.get(j));
			webDriverActions.softHighlightElement(taboolaFeedImglement.get(j));
			softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedArticle.get(j)) , "Poosibly Taboola Feed Article Is not Visible in " +currentPageUrl);
			softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedImglement.get(j)) , "Poosibly Taboola Feed Img Article Is not Visible in " +currentPageUrl);
			Logs.info(getClass(), webDriverActions.getTextFromElement(taboolaFeedArticle.get(j)));
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in Article Body");
	}

	//========================== LatestNews ( CATEGORY PAGE ) ====================================//

	public void verifyCategoryNameNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(latestNewsCategoryNameLnk.size()>0, "Possibly Priority Panel Category Names Links is Not Visible in "+expectedUrl);
		for(int i=0;i<latestNewsCategoryNameLnk.size();i++)
		{
			webDriverActions.softMouseHover(latestNewsCategoryNameLnk.get(i));
			webDriverActions.softScrollToElement(latestNewsCategoryNameLnk.get(i));
			webDriverActions.softHighlightElement(latestNewsCategoryNameLnk.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsCategoryNameLnk.get(i)), "Possibly Category Name is Not Visible in "+expectedUrl);
		}
		softAssert.assertAll("Issue Found in Landing Page Body");
	}

	public void verifyCategoryPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyCategoryReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyCategoryBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyCategoryBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyCategoryTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCategoryBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}


	//=================================Sanjeeb's Business Logics================================

	public void verifyBlogsBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, blogsBreadCrumbLnks);
	}

	//--------News18Minis LP---//

	public void verifyNews18MinisCategoryBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, news18MinisBreadCrumbLnks);
	}

	public void verifyNews18MinisCategoryBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, news18MinisBreadCrumbTxt, news18MinisHeaderTxt);
	}

}
