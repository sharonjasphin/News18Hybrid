package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek
 * This class contain WebElements and their Business logics
 */

public class MobileVideosArticlePage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public  MobileVideosArticlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* HomePage Videos Article Section below Business section*/
	@FindBy(xpath = "//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))][1]//a[not(contains(@href,'cricketnext'))][1]")
	private WebElement videosTxt;

	/* HomePage Videos Article Section links*/
	@FindBy(xpath = "//ul[contains(@class,'videoLists')]//li//a[contains(@href,\"/videos/\")]/img")
	private List<WebElement> videosArticlesLnk;

	/* Videos Page Breadcrumb Header Text Display*/
	@FindBy(xpath = "//div[@class='BreadCum']")
	private WebElement breadcrumbTxt;

	/* Videos Page Header News18Logo*/
	@FindBy(xpath = "//div[contains(@class,'logo')]")
	private WebElement nw18Logo;

	/* Videos Page News18Logo*/
	@FindBys(@FindBy(xpath = "//div[contains(@class,'videoSection')]/div/div[contains(@class,'vshre')]/a"))
	private List<WebElement> socialMediaIcons;

	/* Videos Page Ads*/
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	private WebElement videosPageAds;

	/* Videos Page Footer*/
	@FindBy(xpath = "//footer")
	private WebElement videosPageFooter;

	/* Videos Page Header*/
	@FindBy(xpath = "//header")
	private WebElement videosPageHeader;

	/*-------Vipin's Web Elements--------*/

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]/a")
	private List<WebElement> videoArticleBreadcrumbLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*Video Article Header Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoInner')]/h1")
	private WebElement videoArticleHeaderTxt;

	/*Video Article Last Updated Date Time Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoInner')]//div[contains(@class,'post_details')]/p")
	private WebElement videoArticleLastUpdatedDateTime;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoInner')]//div[contains(@class,'vdotime')]/span")
	private WebElement videoArticleCategoryName;

	/*Video Article SocialShare Icon Links in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoInner')]/div[contains(@class,'vshre')]/a")
	private List<WebElement> videoArticleSocialShareIconLnk;

	/*Video Article Category Name Text in Video Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videoInner')]//div[contains(@class,'videoContent')]/p")
	private WebElement videoArticleExcerptTxt;


	//----------------Common category-------------//
	
	/*Homepage Article Link */
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a[contains(@href,'/videos/')] | //div[contains(@class,'top_story')]/following-sibling::ul[contains(@class,'story_listing')]//a[contains(@href,'/videos/')]")
	private List<WebElement> homepageVideosArticleLnk; 

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/videos/')]")
	private List<WebElement> commonVideogalleryArticleLnks;

	//----------------Video category-------------//

	/*Video Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'fe_outer')]/a[contains(@class,'fe_wrp') and contains(@href,'/videos/')]")
	private List<WebElement> videoSectionArticleLnks;

	//---------------Cricket Category-----------//

	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/videos/')]")
	private List<WebElement> cricketVideoArticleLnk;

	//---------------Astrology Category-----------//

	/* Astrology Section VideoGallery Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//a[contains(@href,'/videos/')]")
	private List<WebElement> astrologyVideoArticleEle;

	/**
	 * @author Abhishek
	 * This method is used to click on First Article of Video Article Page 
	 */
	public void clickOnFirstArticleVideoPage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.clickJS(videosArticlesLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Video Section Article Link");
		}
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
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.clickJS(articleLst.get(i));
				webDriverActions.waitForElement(1000);
			}
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
				if(currentPageUrlCP.contains("google_vignette") || currentPageUrlCP.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.clickJS(articleBreadCrumb.get(j));
					webDriverActions.waitForElement(1000);
				}
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
		//Below list adds webelements of social share icons
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.clickJS(articleLst.get(i));
				webDriverActions.waitForElement(1000);
			}
			currentPageUrl = webDriverActions.getCurrentPageUrl();
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleSocialMedia.get(j)), "Possibly Social Share Icon is Not Displayed in "+currentPageUrl);
				webDriverActions.softScrollToElement(articleSocialMedia.get(j));
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				softAssert.assertTrue(actualShare.contains("whatsapp") || actualShare.contains("getpocket") || actualShare.contains("facebook") || actualShare.contains("telegram") || actualShare.contains("twitter") || actualShare.contains("google") , "Possibly Social Share Links is Not Navigating to Same Page "+currentPageUrl);
			}
		}
		softAssert.assertAll("Issue Found in Article Body ");
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
		for(int i=0; i<1; i++) {
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.clickJS(articleLst.get(i));
				webDriverActions.waitForElement(1000);
			}
			currentPageUrl = webDriverActions.getCurrentPageUrl();
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
		for(int i=0; i<1; i++) {
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
		for(int i=0; i<1; i++) {
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(descriptionTxt));
			if(webDriverActions.softIsElementDisplayed(readMoreLnk))
			{
				boolean beforeClick = webDriverActions.softIsElementDisplayed(descriptionTxt);
				Logs.info(getClass(), ""+beforeClick);
				webDriverActions.softHighlightElement(readMoreLnk);
				webDriverActions.softClickJS(readMoreLnk);
				webDriverActions.waitForSecond(500);
				boolean afterClick = webDriverActions.softIsElementDisplayed(descriptionTxt);
				Logs.info(getClass(), ""+afterClick);
				softAssert.assertNotEquals(beforeClick, afterClick , "Possibly Read More Description Link is Not Working "+expectedUrl);
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

	public void verifyHomepageVideogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, homepageVideosArticleLnk, videoArticleBreadcrumbLnk);
	}

	public void verifyHomepageVideogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, homepageVideosArticleLnk, videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}

	public void verifyHomepageVideogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, homepageVideosArticleLnk, videoArticleSocialShareIconLnk);
	}
	
	public void verifyHomepageVideogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, homepageVideosArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}
	
	/*================Videogallery Common Article Consumption Page=============*/

	public void verifyCommonVideogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonVideogalleryArticleLnks, videoArticleBreadcrumbLnk);
	}

	public void verifyCommonVideogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, commonVideogalleryArticleLnks, videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}

	public void verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonVideogalleryArticleLnks, videoArticleSocialShareIconLnk);
	}

	public void verifyCommonVideogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonVideogalleryArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	/*================Cricket__Videogallery Article Consumption Page=============*/
	public void verifyCricketVideogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketVideoArticleLnk, videoArticleBreadcrumbLnk);
	}

	public void verifyCricketVideogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, cricketVideoArticleLnk, videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}

	public void verifyCricketVideogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketVideoArticleLnk, videoArticleSocialShareIconLnk);
	}

	public void verifyCricketVideogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketVideoArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	/*================VideoSection Article Consumption Page=============*/

	public void verifyVideoSectionArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, videoSectionArticleLnks, videoArticleBreadcrumbLnk);
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

	/*================Astrology Article Consumption Page=============*/

	public void verifyAstrologyVideoArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, astrologyVideoArticleEle, videoArticleBreadcrumbLnk);
	}

	public void verifyAstrologyVideoArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, astrologyVideoArticleEle, videoArticleHeaderTxt ,videoArticleExcerptTxt, videoArticleLastUpdatedDateTime, videoArticleCategoryName);
	}

	public void verifyAstrologyVideoArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, astrologyVideoArticleEle, videoArticleSocialShareIconLnk);
	}

	public void verifyAstrologyVideoArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, astrologyVideoArticleEle , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}
}
