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

/**
 * @author Abhishek
 *  This class contains WebElements and BusinessLogic of Mobile PhotoGallery Consumption Page 
 */

public class MobilePhotoGalleryConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility = new GenericUtility();
	public MobilePhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesLink */
	@FindBy(xpath = "//a[text()='Photogalleries']")
	private WebElement photogalleriesLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[@class='glide__slide--active']/a[2]")
	private WebElement photogalleriesArticleLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleImgLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))]//a[not(contains(@href,'cricketnext'))][1]")
	private WebElement photogalleriesArticleImgLnk;

	/* Mobile_PhotoGalleryConsumption_Page socialShareIcon */
	@FindBy(xpath = "//div[@class='jsx-1927145440 pht-artcl-shr fright']")
	private WebElement socialShareIcon;

	/* Mobile_LiveBlogPage List of footerLnk*/
	@FindBy(xpath = "//span[@class='ftr_title']/span")
	private List<WebElement> footerLnk ;

	/* Mobile_PhotoGalleryConsumption_Page headerLnk */
	@FindBy(xpath = "//img[@title='News18 English']")
	private WebElement headerLnk;

	/* Mobile_PhotoGalleryConsumption_Page firstImg  */
	@FindBy(xpath = "(//div[@class='photo-gallery vspacer30 prelative photo-gallery-slider glide--ltr glide--carousel glide--swipeable']//img)[4]")
	private WebElement firstImg;

	/* Mobile_LiveBlogPage List of imageList*/
	@FindBy(xpath = "//div[@class='jsx-1927145440 glrbox']//img")
	private List<WebElement> imageList ;

	/* Mobile_PhotoGalleryConsumption_Page footerContainer  */
	@FindBy(xpath = "//div[@class='ftr_container']")
	private WebElement footerContainer;

	/* Mobile_PhotoGalleryConsumption_Page SocialFirstImage  */
	@FindBy(xpath = "(//div[contains(@class,'glrbox')])[1]")
	private WebElement SocialFirstImage;

	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[1]")
	private WebElement fbShareIcon;

	/* Mobile_PhotoGalleryConsumption_Page getPocketIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[2]")
	private WebElement getPocketIcon;

	/* Mobile_PhotoGalleryConsumption_Page twitterIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[3]")
	private WebElement twitterIcon;

	/* Mobile_PhotoGalleryConsumption_Page whatsappIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[4]")
	private WebElement whatsappIcon;

	/* Mobile_LiveBlogPage List of shareIconOfImage*/
	@FindBy(xpath = "//div[contains(@class,'glrbox')][1]/figure/a/span[contains(@class,'phtsprt2 shr')]")
	private List<WebElement> shareIconOfImage ;

	/*List of Top Story Articles in PhotoGallery page */
	@FindBy(xpath = "//div[contains(@class,'story_title')]//h3//a[not (contains(@href,'photonews'))]")
	private List<WebElement> photoGalleryArticleLnkLst;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'PGsocialBox ')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'PGsocialBox ')]")
	private WebElement allShareIcons;

	/*List of Top Story Articles in PhotoGallery page */
	@FindBy(xpath = "//ul[contains(@class,'top_story_list')]//h3/a[contains(@href,'photonews')]")
	private List<WebElement> newPhotoGalleryArticleLnkLst;

	/*------------------Vipin's Common WebElements--------------------*/
	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bread') or contains(@class,'brade')]//a")
	private List<WebElement> articleBreadcrumbLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*Photogallery_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl-top')]//h1")
	private WebElement articlePhotogalleryHeaderTxt;

	/*Photogallery_Article Excerpt Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl-top')]//h2")
	private WebElement articlePhotogalleryExcerptTxt;

	/*Photogallery_Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl-top')]//p[contains(.,'Last')]")
	private WebElement articlePhotogalleryLastUpdatedTxt;

	/*Photogallery_Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl-top')]//p[contains(.,'Last')]/span")
	private WebElement articlePhotogalleryLastUpdatedTimeTxt;

	/*Photogallery_Article Contents Location_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl-top')]//p/span[contains(@id,'location')]")
	private WebElement articlePhotogalleryLocationTxt;

	/*Photogallery_Article Contents Caption_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'photo')]/preceding-sibling::div[contains(@style,'margin')]//p")
	private WebElement articlePhotogalleryCaptionTxt;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'post_wrap')]//a[contains(@href,'/agency/')]")
	private WebElement articlePhotogalleryAgencyLnk;

	/*Photogallery_Article Image Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'glrbox')]//p")
	private List<WebElement> photogalleryImageDescriptionTxt;

	/* Top Photogallery Article Story Social Share Icon Link in Photo Article Page */
	@FindBy(xpath = "//div[contains(@class,'social')]/div[contains(@class,'artcl-shr')]/a")
	private List<WebElement> topPhotoGallerySocialShareLnk;

	/* Top Photogallery Article Story Share_Btn Link in Photo Article Page */
	@FindBy(xpath = "(//div[contains(@class,'glrbox')])[1]//span[contains(@class,'shr')]")
	private WebElement photoGalleryShareBtn;

	/* Photogallery Article Image Widget Social Share Icon Links in Photo Article Page */
	@FindBy(xpath = "(//div[contains(@id,'photo')])[1]//div[contains(@class,'pht-artcl-shr2')]/ul/li/a")
	private List<WebElement> photoImageSocialShareLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'landing-header')]")
	private WebElement whatsAppHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_aarf')]//span/img")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'xw7yly9')]//div//span/h1")
	private WebElement facebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@id,'MChromeHeader')]")
	private WebElement footerFacebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'tgme_page_photo')]/a/img")
	private WebElement telegramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@data-testid,'Login_Sheet')]")
	private WebElement twitterHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@data-testid,'TopNavBar')]")
	private WebElement footerTwitterHeader;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h2 | //div[contains(@class,'agencyWrapper')]/h2")
	private WebElement news18AgencyTxt;

	/*Article Google News Links in Article Consumption Page */
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]/li/a[contains(@href,'google')]")
	private WebElement articleGoogleNewsLnk;

	/*News18 Google Header */
	@FindBy(xpath = "//div/h2[contains(.,'News18')]")
	private WebElement googleNews18Logo;

	/* Common Section Photogallery Article Link in  Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/')] | //div[contains(@class,'top_story')]/following-sibling::ul[contains(@class,'story_listing')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> commonPhotogalleryArticleLnks;
	
	/* Homepage Photogallery Article */
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a[contains(@href,'/photogallery/')] | //div[contains(@class,'top_story')]/following-sibling::ul[contains(@class,'story_listing')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> homepagePhotogalleryArticleLnk;

	/* PhotoSection  Article Link in  Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'photoGalleryWrapper')]//div[contains(@class,'content')]//a[contains(@href,'photogallery')]")
	private List<WebElement> photoSectionArticleLnks;

	/* Cricket Section Photogallery Article Link in  Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'CN-Topstory')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> cricketPhotogalleryArticleLnks;

	/* Astrology Section Photogallery Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> astrologyPhotogalleryArticleEle;

	//================================Anupam webelement================================
	/* Photo article count in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-lef')]//div[contains(@class,'glrbox')]//div[contains(@class,'phtcount')]//span")
	private List<WebElement> photoArticleCount;

	/* Photo article div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-lef')]//div[contains(@class,'glrbox')]")
	private List<WebElement> photoArticleDiv;

	/* photo Section photo Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'photogallery_wrp')]//div[contains(@class,'latest_img_wrp')]//a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> photoArticleEle;

	/* Common Section photo Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> commonPhotoArticleEle;

	/* Common Section photo Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> astrologyPhotoArticleEle;

	/* Cricket Section Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'CN-Topstory')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> cricketPhotoArticleEle;

	/* Photo article  Ads div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-top')]/following-sibling::div//div[contains(@class,'ad-main')]//div[contains(@class,'dfp-ad')]")
	private List<WebElement> photoArticleAdsDiv;

	/* Photo article  Ads div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-artcl-top')]/following-sibling::div//div[contains(@class,'ad-main')]//div[contains(@class,'dfp-ad')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private List<WebElement> photoArticleAds;

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Navigate to First Article of PhotoGallery 
	 */
	public void navigateToPhotogalleryFirstArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.mouseHover(photoGalleryArticleLnkLst.get(0));
			webDriverActions.highlightElement(photoGalleryArticleLnkLst.get(0));
			webDriverActions.clickJS(photoGalleryArticleLnkLst.get(0));// Click on First PhotoGallery Article
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in PhotoGallery Article Link", e);
		}
	}

	/**
	 * @author Anupam gupta
	 * This method is used to Navigate to First Article of new PhotoGallery 
	 */
	public void navigateToNewPhotogalleryFirstArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.click(newPhotoGalleryArticleLnkLst.get(0));	// Click on First PhotoGallery Article
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in New PhotoGallery Article Link", e);
		} 	
	}

	/*======================Vipin's Business Libraries=====================*/
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
			currentPageUrl = webDriverActions.getCurrentPageUrl();
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
	 * @param articleHeader
	 * @param articleLastUpdated
	 * @param articleLastUpdatedTime
	 * @param articleLocation
	 * @param articleFeaturedImgTxt
	 * @author VipinKumarGawande
	 * This method is used to verify the  from Article consumption page.
	 */
	public void verifyArticleDetailedBoxValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime, WebElement articleLocation, WebElement articleFeaturedImgTxt)
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
			webDriverActions.softHighlightElement(articleHeader);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Unable to Display Element in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLocation);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLocation) , "Possibly Location is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleFeaturedImgTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleFeaturedImgTxt) , "Possibly Featured_Image Or Featured_Text is Not Visible in "+currentPageUrl);
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
	 * @param agencyLnk
	 * @param agencyTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation In Article Consumption Page
	 */
	public void verifyArticleAgencyNavigation(String serverType , List<WebElement> articleLst , WebElement agencyLnk , WebElement agencyTxt)
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
			Assert.assertTrue(webDriverActions.isElementDisplayed(agencyLnk), "Possibly Agency Link is not visisble in "+currentPageUrl);
			webDriverActions.softHighlightElement(agencyLnk);
			String agencyUrl = webDriverActions.getAttribute("href", agencyLnk);
			webDriverActions.softClickJS(agencyLnk);
			webDriverActions.waitForPageToLoad();
			String currentAgencyUrl = webDriverActions.getCurrentPageUrl();
			String expectedAgencyUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentAgencyUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentAgencyUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentAgencyUrl = betaUrl;
			}
			int agencyResponse = genericUtility.checkLinks(currentAgencyUrl);
			softAssert.assertTrue(genericUtility.compareUrlSub(agencyUrl, expectedAgencyUrl), "Possibly Navigating to Different Page "+agencyUrl);
			softAssert.assertTrue(agencyResponse==200, "Possibly Url is Invalid "+currentAgencyUrl + " Response Code "+agencyResponse);
			webDriverActions.softHighlightElement(agencyTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(agencyTxt), "Possibly Page Content is Not Visible "+expectedAgencyUrl);
			if (currentAgencyUrl.contains(expectedAgencyUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in Article Body");
	}	

	/**
	 * @param serverType
	 * @param articleLst
	 * @param articleSocialMedia
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Media Icons Navigation In Article Consumption Page
	 */
	public void verifyArticlePhotogallerySocialMediaNavigation(String serverType , List<WebElement> articleLst,List< WebElement> articleSocialMedia)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
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
			webDriverActions.waitForSecond(500);
			if(webDriverActions.softIsElementDisplayed(photoGalleryShareBtn))
			{
				webDriverActions.softMouseHover(photoGalleryShareBtn);
				webDriverActions.softClickJS(photoGalleryShareBtn);
			}
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
				int shareResponse = genericUtility.checkLinks(actualShare);
				softAssert.assertTrue(shareResponse==200, "Possibly Url is Invalid "+actualShare+" And Status Code is "+response);
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
	 * @param articleLastUpdatedTime
	 * @param articleLocation
	 * @param captionTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Photogallery_Article Detailed_Box Validation In Article Consumption Page
	 */
	public void verifyPhotogalleryArticleDetailedBoxValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader, WebElement articleExcerpt , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime, WebElement articleLocation,WebElement captionTxt)
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLocation);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLocation) , "Possibly Article Location Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(captionTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(captionTxt) , "Possibly Article Caption Text is Not Visible in "+currentPageUrl);
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
	 * @param description
	 *  @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation In Article Consumption Page
	 */
	public void verifyPhotogalleryArticleImageDescriptionValidation(String serverType , List<WebElement> articleLst , List<WebElement> description )
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
			softAssert.assertTrue(description.size()>0, "Possibly Article Detailed Description Is Not Visible in "+currentPageUrl);
			for(int j=0;j<description.size();j++)
			{
				webDriverActions.softMouseHover(description.get(j));
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
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
		softAssert.assertAll("Issues found in Article Body");
	}


	/*================Photogallery Common Article Consumption Page=============*/

	public void verifyCommonPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCommonPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, commonPhotogalleryArticleLnks, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyCommonPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyCommonPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, commonPhotogalleryArticleLnks, photogalleryImageDescriptionTxt);
	}

	public void verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, commonPhotogalleryArticleLnks,topPhotoGallerySocialShareLnk);
	}

	public void verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photoImageSocialShareLnk);
	}

	public void verifyCommonPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}
	
	/*================Homepage Common Article Consumption Page=============*/

	public void verifyHomepagePhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, homepagePhotogalleryArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyHomepagePhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, homepagePhotogalleryArticleLnk, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyHomepagePhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, homepagePhotogalleryArticleLnk, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyHomepagePhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, homepagePhotogalleryArticleLnk, photogalleryImageDescriptionTxt);
	}

	public void verifyHomepagePhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, homepagePhotogalleryArticleLnk,topPhotoGallerySocialShareLnk);
	}

	public void verifyHomepagePhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photoImageSocialShareLnk);
	}

	public void verifyHomepagePhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, homepagePhotogalleryArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	/*================PhotoSection Article Consumption Page=============*/

	public void verifyPhotoSectionArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, photoSectionArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyPhotoSectionArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, photoSectionArticleLnks, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyPhotoSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, photoSectionArticleLnks, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyPhotoSectionArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, photoSectionArticleLnks, photogalleryImageDescriptionTxt);
	}

	public void verifyPhotoSectionArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, photoSectionArticleLnks,topPhotoGallerySocialShareLnk);
	}

	public void verifyPhotoSectionArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, photoSectionArticleLnks, photoImageSocialShareLnk);
	}

	public void verifyPhotoSectionArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photoSectionArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	/*================Cricket Article Consumption Page=============*/

	public void verifyCricketPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketPhotogalleryArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCricketPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, cricketPhotogalleryArticleLnks, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyCricketPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cricketPhotogalleryArticleLnks, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyCricketPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, cricketPhotogalleryArticleLnks, photogalleryImageDescriptionTxt);
	}

	public void verifyCricketPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, cricketPhotogalleryArticleLnks,topPhotoGallerySocialShareLnk);
	}

	public void verifyCricketPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, cricketPhotogalleryArticleLnks, photoImageSocialShareLnk);
	}

	public void verifyCricketPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketPhotogalleryArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	/*================Astrology Article Consumption Page=============*/

	public void verifyAstrologyPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, astrologyPhotogalleryArticleEle, articleBreadcrumbLnk);
	}

	public void verifyAstrologyPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, astrologyPhotogalleryArticleEle, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyAstrologyPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, astrologyPhotogalleryArticleEle, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyAstrologyPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, astrologyPhotogalleryArticleEle, photogalleryImageDescriptionTxt);
	}

	public void verifyAstrologyPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, astrologyPhotogalleryArticleEle,topPhotoGallerySocialShareLnk);
	}

	public void verifyAstrologyPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticlePhotogallerySocialMediaNavigation(serverType, astrologyPhotogalleryArticleEle, photoImageSocialShareLnk);
	}

	public void verifyAstrologyPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, astrologyPhotogalleryArticleEle , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}


	//-------------------------------------Anupam Business Logic--------------------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page .
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoArticleCountValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Photogallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Photogallery Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(articleLst.get(i));
				webDriverActions.softScrollToElement(articleLst.get(i));
				actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
				webDriverActions.softClickJS(articleLst.get(i));
				webDriverActions.waitForElement(1000);
			}

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
				softAssert.assertTrue(photoArticleDiv.size()>0, "Possibly photo Article division is Not Visible");
				for(int j=0; j<photoArticleDiv.size(); j++) {
					webDriverActions.softScrollToElement(photoArticleDiv.get(j));
					webDriverActions.softMouseHover(photoArticleDiv.get(j));
					webDriverActions.softHighlightElement(photoArticleCount.get(j));
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photoArticleCount.get(j), 4) , "Possibly photo count is Not Visible "+(j+1)+currentPageUrl);
				}
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


	public void verifyPhotoSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, photoArticleEle);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Astrology Widget in English Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoAdsBetweenArticleValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Photogallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Photogallery Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(articleLst.get(i));
				webDriverActions.softScrollToElement(articleLst.get(i));
				actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
				webDriverActions.softClickJS(articleLst.get(i));
				webDriverActions.waitForElement(1000);
			}

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
				webDriverActions.mobileScroll(3);
				webDriverActions.scrollToPoint(0, 0);
				softAssert.assertTrue(photoArticleDiv.size()>0, "Possibly photo Article division is Not Visible");
				for(int j=0; j<photoArticleDiv.size()-1; j+=2) {
					webDriverActions.softScrollToElement(photoArticleDiv.get(j));
					//					webDriverActions.softMouseHover(photoArticleDiv.get(j));
					int k=j/2;
					webDriverActions.waitForSecond(2000);
					webDriverActions.softScrollToElement(photoArticleAdsDiv.get(k));
					webDriverActions.softHighlightElement(photoArticleAdsDiv.get(k));
					String id=webDriverActions.getAttribute("data-google-query-id", photoArticleAdsDiv.get(k));
					if(id==null) {
						webDriverActions.waitForSecond(2000);
						id=webDriverActions.getAttribute("data-google-query-id", photoArticleAdsDiv.get(k));
					}if(id==null) {
						webDriverActions.waitForSecond(3000);
						id=webDriverActions.getAttribute("data-google-query-id", photoArticleAdsDiv.get(k));
					}
					System.out.println(id);
					softAssert.assertNotEquals(id, null ,"Possibly Ads is not present After 9 sec at "+(k+1)+"\t"+currentPageUrl);
					softAssert.assertNotEquals(id, "" ,"Possibly Ads is not present After 9 sec at "+(k+1)+"\t"+currentPageUrl);
				}
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

	public void verifyPhotoSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, photoArticleEle);
	}


	//AUTO
	public void verifyAutoSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyAutoSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//BUSINESS
	public void verifyBusinessSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyBusinessSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//BUZZ
	public void verifyBuzzSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyBuzzSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//CRICKET
	public void verifyCricketSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, cricketPhotoArticleEle);
	}
	public void verifyCricketSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, cricketPhotoArticleEle);
	}

	//EDUCATION
	public void verifyEducationSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyEducationSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//EXPLAINERS
	public void verifyExplainersSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyExplainersSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//INDIA
	public void verifyIndiaSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyIndiaSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//LATEST
	public void verifyLatestSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyLatestSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//LIFESTYLE
	public void verifyLifeStyleSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyLifeStyleSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//MOVIES
	public void verifyMoviesSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyMoviesSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//OPINION
	public void verifyOpinionSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyOpinionSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//POLITICS
	public void verifyPoliticsSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyPoliticsSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//SHOWSHA
	public void verifyShowshaSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyShowshaSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//SPORTS
	public void verifySportsSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifySportsSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//TECH	
	public void verifyTechSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyTechSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//WORLD
	public void verifyWorldSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyWorldSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}
}
