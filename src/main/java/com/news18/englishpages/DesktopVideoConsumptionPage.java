package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopVideoConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopVideoConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Trending video articles trending video present in RHS*/
	@FindBy(xpath="//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> photogalleryArticlesLnk;

	/*Trending video articles trending video present in RHS*/
	@FindBy(xpath="//div[contains(@class,'photogellary_widget trending')]//ul[contains(@class,'photo_listing')]/li/a")
	private List<WebElement> trendingVideosArticlesLnk;

	/*Trending video articles trending Photos present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING PHOTOS')]//parent::h2//parent::div//ul/li/a")
	private List<WebElement> trendingPhotosArticlesLnk;

	/*Trending video title trending Photos present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING PHOTOS')]")
	private WebElement trendingPhotosTitle;

	/*Trending video title video present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING VIDEOS')]")
	private WebElement trendingVideosTitle; 

	/*Bid Ad Present in RHS Ad block*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//preceding-sibling::div[contains(@style,'600px')]")
	private WebElement rhsBigAdBlock;

	/*Bid Ad Present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//preceding-sibling::div[contains(@style,'600px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsBigAd;

	/*Ad Present after MoreNews in RHS Ad block*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//following-sibling::div[contains(@style,'250px')]")
	private WebElement rhsMoreNewsDownAdBlock;

	/*Ad Present after MoreNews in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING VIDEOS')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsMoreVideoTrendingDownAd;

	@FindBy(xpath="//div[contains(@class,'top_story')]//a[contains(@href,'/videos/') and not(contains(@href,'/photogallery/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> videoArticlesLnk;

	/*-------Vipin's Web Elements--------*/

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bredcrum') or contains(@class,'BreadCum')]//a")
	private List<WebElement> articleBreadcrumbLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaArticleLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> rhsTaboolaImgLnk;

	/*RHS Taboola Logo in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'link-attribution')]")
	private WebElement rhsTaboolaLogo;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*Video Article Header Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//h1")
	private WebElement videoArticleHeaderTxt;

	/*Video Article Last Updated Date Time Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoShare')]/div[contains(@class,'post')]//p")
	private WebElement videoArticleLastUpdatedDateTime;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoShare')]/div[contains(@class,'vdotime')]//span")
	private WebElement videoArticleCategoryName;

	/*Video Article SocialShare Icon Links in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoShare')]/div[contains(@class,'videoSocial')]//a")
	private List<WebElement> videoArticleSocialShareIconLnk;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoContent')]/p")
	private WebElement videoArticleExcerptTxt;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoMore')]/a")
	private WebElement videoArticleShowMoreLnk;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoOutter')]//div[contains(@id,'video_consumption') and @data-srno='1']//div[contains(@class,'videoMore')]/a[contains(.,'Less')]")
	private WebElement videoArticleShowLessLnk;

	//----------------Common category-------------//

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/videos/')]")
	private List<WebElement> commonVideogalleryArticleLnks;


	//----------------Video category-------------//

	/*Video Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'fe_outer')]//li[not(contains(@class,'clone'))]/a[contains(@href,'/videos/')]")
	private List<WebElement> videoSectionArticleLnks;

	//---------------Cricket Category-----------//

	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/videos/')]")
	private List<WebElement> videogalleryCricketArticleLnk;


	///---------------------- Anupam Webelement=======================================
	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'special vwall')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))] | //div[contains(@class,'trand-vdo')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsVideoTopAds;

	/*Common Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/') and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> commonSectionVideoArticleLnks;

	/* Cricket Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/') and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> cricketSectionVideoArticleLnks;


	/**
	 * @author DanishR
	 * This method calls verify Article RHS AdsNavigation for RHS Trending Videos
	 * @param serverType 
	 */
	public void verifyRhsCommonVideoConsumptionTrendingVideosarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingVideosTitle,trendingVideosArticlesLnk,commonVideogalleryArticleLnks);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticle RHS Ads Navigation for RHS Trending Photos
	 * @param serverType 
	 */
	public void verifyRhsCommonVideoConsumptiontrendingPhotosarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingPhotosTitle,trendingPhotosArticlesLnk,commonVideogalleryArticleLnks);
	}
	/**
	 * @author DanishR
	 * This method calls verify Article RHS Ads Navigation for RHS MoreNews down ad validation 
	 * @param serverType 
	 */
	public void verifyCommonVideoConsumptionRHSTrendingVideoDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonVideogalleryArticleLnks,rhsMoreVideoTrendingDownAd);
	}

	/**
	 * @author DanishR
	 * This method calls verify Video Category Article RHS AdsNavigation for RHS Trending Videos
	 * @param serverType 
	 */
	public void verifyRhsVideoConsumptionTrendingVideosarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingVideosTitle,trendingVideosArticlesLnk,videoSectionArticleLnks);
	}

	/**
	 * @author DanishR
	 * This method calls verify Video Category  Article RHS Ads Navigation for RHS Trending Photos
	 * @param serverType 
	 */
	public void verifyRhsVideoConsumptiontrendingPhotosarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingPhotosTitle,trendingPhotosArticlesLnk,videoSectionArticleLnks);
	}

	/**
	 * @author DanishR
	 * This method calls verify Video Category Article RHS Ads Navigation for RHS MoreNews down ad validation 
	 * @param serverType 
	 */
	public void verifyVideosArticleRHSTrendingVideoDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, videoSectionArticleLnks,rhsMoreVideoTrendingDownAd);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(videoArticlesLnk.size()==0){
			Logs.error(getClass(), "Possibly Video Gallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Video Gallery Article is Not Visible in Category Page in "+sectionPage);
		}
		Assert.assertTrue(categoryPageLinks.size()>0,"Possibly no articles present or size is "+categoryPageLinks.size() +" In this Url "+categoryPage);
		for (int i = 0; i < 1; i++) {
			webDriverActions.softHighlightElement(categoryPageLinks.get(i));
			webDriverActions.softMouseHover(categoryPageLinks.get(i));
			String actual=webDriverActions.getAttribute("href", categoryPageLinks.get(i));
			webDriverActions.softClickJS(categoryPageLinks.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expected = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			webDriverActions.waitForAllElementsVisible(articlesLinks, 10);
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, "Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
				webDriverActions.softScrollToElement(title);
				Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				String categoryCPPage = webDriverActions.getCurrentPageUrl();
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				System.out.println(articlesLinks.size());
				for(int j=0;j<articlesLinks.size();j++) {
					webDriverActions.softHighlightElement(articlesLinks.get(j));
					webDriverActions.mouseHover(articlesLinks.get(j));
					String actualCP=webDriverActions.getAttribute("href", articlesLinks.get(j));
					webDriverActions.softClickJS(articlesLinks.get(j));
					String currentCPPage = webDriverActions.getCurrentPageUrl();
					String expectedCP = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preprod")) {
						String betaUrl = genericUtility.replaceInUrl(currentCPPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentCPPage = betaUrl;
					}
					int responseCP = genericUtility.checkLinks(currentCPPage);
					if (responseCP==200) {
						boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
						softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
					}
					else {
						softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentCPPage);
					}
					webDriverActions.navigateToUrl(categoryCPPage);
					webDriverActions.waitForSecond(3000);
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(categoryPage);
		}
		softAssert.assertAll("Issues found in Video category section Articles ");
	}

	/**
	 * @author DanishR
	 * This method is used to validate Top RHS Ads present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsNavigation(String serverType , List<WebElement> articleLst,WebElement ad) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(videoArticlesLnk.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible");
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			webDriverActions.waitForSecond(3000);
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);

			if (response==200)
			{
				webDriverActions.continuousScrollTillElement(ad, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(ad,10) , " Possibly RHS 2nd or 3rd Ad not visible  "+"\t"+currentPageUrl);
			}

			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in Article Body");
	}

	//---------------------- Vipins Business Logic --------------------------------//
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 *  This method is used to Validate the Breadcrumb Navigation For 
	 */
	public void verifyArticleBreadCrumbNavigation(String serverType , List<WebElement> articleLst , List<WebElement> articleBreadCrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
		for(int i=5; i<6; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.waitForPageToLoad();
			softAssert.assertTrue(articleBreadCrumb.size()>0, "Possibly Breadcrumb is Not Visible in "+expectedUrl);
			//			webDriverActions.continuousScrollTillAllElement(articleBreadCrumb, 10);
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
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issues found in Article Body ");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param articleSocialMedia\
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Media Icons Navigation In Article Consumption Page
	 */
	public void verifyArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,List< WebElement> articleSocialMedia)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}		
		for(int i=5; i<6; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			expectedUrl = webDriverActions.getCurrentPageUrl();
			String articlePageTitle = webDriverActions.getPageTitle();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.continuousScrollTillAllElement(articleSocialMedia, 5);
			softAssert.assertTrue(articleSocialMedia.size()>0, "Possibly Social Media Icon is Not Visible "+currentPageUrl);	
			for(int j=0 ; j<articleSocialMedia.size();j++ )
			{
				softAssert.assertTrue(webDriverActions.isElementDisplayed(articleSocialMedia.get(j)),"Possibly Social Share Icons are not visible in "+ currentPageUrl);
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(articlePageTitle);
			}
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issue Found in Article Body ");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param articleHeader
	 * @param articleExcerpt
	 * @param articleLastUpdated
	 * @param categoryTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Photogallery_Article Detailed_Box Validation In Article Consumption Page
	 */
	public void verifyArticleDetailedBoxValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader, WebElement articleExcerpt , WebElement articleLastUpdated ,WebElement categoryTxt)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
		for(int i=5; i<6; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.softHighlightElement(articleHeader);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Possibly Article Header Text is Not Visible "+currentPageUrl);
			webDriverActions.softHighlightElement(articleExcerpt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleExcerpt, 1) , "Possibly Article Excerpt Text is Not Visible "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Date And Time is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(categoryTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(categoryTxt) , "Possibly Article Category Text is Not Visible in "+currentPageUrl);
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issues found in Article Body");
	}


	/**
	 * @param serverType
	 * @param articleLst
	 * @param taboolaFeedArticle
	 * This method is used to Validate the Article Taboola In Body and RHS in Article Consumption Page
	 */
	public void verifyArticleTaboolaNavigation(String serverType , List<WebElement> articleLst, List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImglement, WebElement taboolaLogo)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
		for(int i=5; i<6; i++) {
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.waitForSecond(2000);
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
			if(currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in Article Body");
	}




	/**
	 * @param serverType
	 * @param articleLst
	 * @param readMoreLnk
	 * @param descriptionTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More Description in Article Details Page for Article Consumption Page
	 */
	public void verifyArticleReadMoreDescription(String serverType , List<WebElement> articleLst , WebElement readMoreLnk , WebElement descriptionTxt)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(),  "Possibly Photogallery Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Photogallery Article is Not Visible in Category Page in "+expectedUrl);
		}
		for(int i=5; i<6; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.softIsElementDisplayed(descriptionTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(descriptionTxt) , "Possibly Description is Not Visible in "+currentPageUrl);
			if(webDriverActions.softIsElementDisplayed(readMoreLnk))
			{
				boolean beforeClick = webDriverActions.softIsElementDisplayed(videoArticleShowLessLnk);
				Logs.info(getClass(), ""+beforeClick);
				webDriverActions.softHighlightElement(readMoreLnk);
				webDriverActions.softClickJS(readMoreLnk);
				webDriverActions.waitForSecond(500);
				boolean afterClick = webDriverActions.softIsElementDisplayed(videoArticleShowLessLnk);
				Logs.info(getClass(), ""+afterClick);
				softAssert.assertNotEquals(beforeClick, afterClick , "Possibly Show More Description Link is Not Working "+expectedUrl);
			}
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issues found in Article Body");
	}

	/*================Videogallery Common Article Consumption Page=============*/
	public void verifyCommonVideogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonVideogalleryArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonVideogalleryArticleLnks, videoArticleSocialShareIconLnk);
	}

	public void verifyCommonVideogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonVideogalleryArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCommonVideogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonVideogalleryArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCommonVideogalleryArticleShowMoreDescriptionValidation(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonVideogalleryArticleLnks, videoArticleShowMoreLnk, videoArticleExcerptTxt);
	}

	public void verifyCommonVideogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, commonVideogalleryArticleLnks,videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}


	/*================Cricket__Videogallery Article Consumption Page=============*/
	public void verifyCricketVideogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, videogalleryCricketArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyCricketVideogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, videogalleryCricketArticleLnk,videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}


	public void verifyCricketVideogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, videogalleryCricketArticleLnk, videoArticleSocialShareIconLnk);
	}

	public void verifyCricketVideogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, videogalleryCricketArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCricketVideogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, videogalleryCricketArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCricketVideogalleryArticleShowMoreDescriptionValidation(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, videogalleryCricketArticleLnk, videoArticleShowMoreLnk, videoArticleExcerptTxt);
	}

	/*================VideoSection Article Consumption Page=============*/
	public void verifyVideoSectionArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, videoSectionArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyVideoSectionArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, videoSectionArticleLnks, videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}


	public void verifyVideoSectionArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, videoSectionArticleLnks, videoArticleSocialShareIconLnk);
	}

	public void verifyVideoSectionArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, videoSectionArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyVideoSectionArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, videoSectionArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyVideoSectionArticleShowMoreDescriptionValidation(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, videoSectionArticleLnks, videoArticleShowMoreLnk, videoArticleExcerptTxt);
	}


	//================================Anupam Business Logic================================
	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside Video article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyVideoRHSTopAdsNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly VideoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly VideoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
		//		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible");
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.mouseHoverAndClick(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);

			if (response==200)
			{
				webDriverActions.scrollDown();
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(rhsVideoTopAds,10) , "Possibly RHS top Ads is not visible after 10 sec  "+"\t"+currentPageUrl);
			}

			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in video Article Body");
	}


	public void verifyVideoSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, videoSectionArticleLnks);
	}

	//Auto
	public void verifyAutoSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Business
	public void verifyBusinessSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Buzz
	public void verifyBuzzSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Cricket
	public void verifyCricketSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, cricketSectionVideoArticleLnks);
	}

	//Education
	public void verifyEducationSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Explainers
	public void verifyExplainersSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//India
	public void verifyIndiaSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Latest
	public void verifyLatestSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//LifeStyle
	public void verifyLifeStyleSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Movies
	public void verifyMoviesSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Opinion
	public void verifyOpinionSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Politics
	public void verifyPoliticsSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Showsha
	public void verifyShowshaSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Sports
	public void verifySportsSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//Tech
	public void verifyTechSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

	//World
	public void verifyWorldSectionVideoArticleTopRhsAdsValidation(String serverType)
	{
		verifyVideoRHSTopAdsNavigation(serverType, commonSectionVideoArticleLnks);
	}

}