package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopCategoryArticleConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();
	public WebDriver driver;

	public DesktopCategoryArticleConsumptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//======================Danish==Webelements=================

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//parent::a")
	private WebElement trendingNewsTitle;

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'heading_title')]//following::ul[contains(@class,'latest')]//li//a")
	private List<WebElement> trendingNewsArticles;

	/*Trending News Widget Read More Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul/a")
	private WebElement trendingNewsReadMore;

	/*More News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'More News')]")
	private WebElement moreNewsTitle;

	/*More News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'More News')]//parent::h2//following-sibling::ul//li//div//a")
	private List<WebElement> moreNewsArticles;

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]/a")
	private WebElement photogalleryTitle; 

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]//following-sibling::ul//li//img//parent::a")
	private List<WebElement> photogalleryArticles;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//div[contains(@class,'video_wall')]//h2")
	private WebElement videoWallTitle;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//div[contains(@class,'video_wall')]//a")
	private WebElement videoWallArticle;

	/*Bid Ad Present in RHS*/
	@FindBy(xpath="//div[contains(@class,'rhs_latest_news vspacer20')]//following-sibling::div[contains(@class,'nw18-dfp-ad')]//iframe[contains(@height,'600')]")
	private WebElement rhsBigAd;

	/*Ad Present after MoreNews in RHS*/
	@FindBy(xpath="//div[contains(@class,'rhs_latest_news vspacer20')]//following-sibling::div[contains(@class,'nw18-dfp-ad')]//iframe[contains(@height,'250')]")
	private WebElement rhsMoreNewsDownAd;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[.='Pause']")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span[.='Play']")
	private WebElement playBtn;

	/*Mute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-0']//span[.='Unmute']")
	private WebElement unmuteBtn;

	/*Unmute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']//span[.='Mute']")
	private WebElement muteBtn;

	/*share Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-control vjs-button vjs-icon-share')]")
	private WebElement shareBtn;

	/*Maximum Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement maximizeBtn;

	/*Minimum Button displaying in below of video player*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement minimizeBtn;

	/*Live Tv Ads element present in Live Tv Section*/
	@FindBy(xpath = "//div[contains(text(),'Advertisement')]")
	private WebElement liveTvAds;

	/*Close Button present in Live TV section*/
	@FindBy(xpath = "//div[@class='vjs-close-btn vjs-share-close']")
	private WebElement shareCloseBtn;

	/*Element present in action bar*/
	@FindBy(xpath = "//div[@class='vjs-custom-control-spacer vjs-spacer ']")
	private WebElement mouseoverActionBar;

	/*LiveTv video player displaying in RHS of Savings and Investment page*/
	@FindBy(xpath = "//div[contains(@class,'livetv')]//span[contains(text(),'LIVE TV')]//ancestor::a[contains(@href,'live')]")
	private WebElement liveTvPlayerTitle;

	/*LiveTv video player displaying in RHS of Savings and Investment page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Skip ad button present in live Tv*/
	@FindBy(xpath = "//div//button[contains(@class,'videoAdUiSkipButton videoAdUiAction')]")
	private WebElement skipAd;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//iframe[contains(@id,'goog_')]")
	private WebElement videoAdsIframe;
	
	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//div[@id='playerContainer']//div[contains(@id,'content_video_ima-ad-container')]")
	private WebElement videoAds;
	
	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//button[contains(@class,'vjs-big-play-button')]")
	private WebElement videoPlay;

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
	
	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//div//gwd-taparea[contains(@id,'close-button')]")
	private WebElement closeAd;
	

	/**
	 * This method is used to verify RHS Trending News Title
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle);
	}

	/**
	 * This method is used to verify RHS Trending News Articles
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles);
	}
	
	/**
	 * This method is used to verify RHS Trending News Read More
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore);
	}

	/**
	 * This method is used to verify RHS More News Articles
	 * @param serverType
	 */
	public void verifyRhsMoreNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles);
	}

	/**
	 * This method is used to verify RHS PhotoGallery Title
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle);
	}
	/**
	 * This method is used to verify RHS PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles);
	}
	
	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS Trending News down ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSBigAdNavigation(String serverType){
		
		verifyArticleRHSAdsNavigation(serverType,rhsBigAd,trendingNewsTitle);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS Videowall down ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSMoreNewsDownAdNavigation(String serverType){
		
		verifyArticleRHSAdsNavigation(serverType,rhsMoreNewsDownAd,moreNewsTitle);
	}
	
	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS Trending Video validation 
	 * @param serverType
	 */
	public void verifyArticleRHSTrendingVideoNavigation(String serverType) 
	{
		verifyRHSArticleNavigation(serverType,trendingVideosTitle,trendingVideosArticlesLnk);
	}
	
	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS Trending Photos validation 
	 * @param serverType
	 */
	public void verifyArticleRHSTrendingPhotoNavigation(String serverType) 
	{
		verifyRHSArticleNavigation(serverType,trendingPhotosTitle,trendingPhotosArticlesLnk);
	}
	
	/**
	 * This method is used to verify RHS Video wall
	 * @param serverType
	 */
	public void verifyRhsVideowallNavigation(String serverType) 
	{
		verifyRHSTitleNavigation(serverType,videoWallArticle);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the RHS section
	 */
	public void verifyRHSTitleNavigation(String serverType,WebElement title) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(title);
		Assert.assertTrue(webDriverActions.isElementDisplayed(title),"Possibly no articles present or size is "+title+" In this Url "+pageUrl);
		webDriverActions.softWaitForElementVisibility(title, 2); 
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		webDriverActions.mouseHover(title);
		String actualCP=webDriverActions.getAttribute("href", title);
		webDriverActions.softClickJS(title);
		String currentCPPage = webDriverActions.getCurrentPageUrl();
		String expectedCP = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentCPPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentCPPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentCPPage=betaUrl;
		}
		int responseCP = genericUtility.checkLinks(currentCPPage);
		if (responseCP==200) {
			boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
			softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
		}

		else {
			softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
		}
		softAssert.assertAll("Issues found in category section Title "+webDriverActions.getCurrentPageUrl());
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(title);
		Assert.assertTrue(articlesLinks.size()>0,"Possibly no articles present or size is "+articlesLinks.size() +" In this Url "+categoryPage);
		for(int i=0;i<articlesLinks.size();i++) {
			webDriverActions.softHighlightElement(articlesLinks.get(i));
			webDriverActions.softMouseHover(articlesLinks.get(i));
			String actualCP=webDriverActions.getAttribute("href", articlesLinks.get(i));
			webDriverActions.softClickJS(articlesLinks.get(i));
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
				softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
			}
			webDriverActions.navigateBack();
		}
		softAssert.assertAll("Issues found in category section Articles "+webDriverActions.getCurrentPageUrl());
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This metod is used to click on Read more button of RHS section
	 */
	public void verifyRHSReadMoreNavigation(String serverType,WebElement title, WebElement morelink) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(morelink);
		Assert.assertTrue(webDriverActions.isElementDisplayed(morelink),"Possibly no articles present or size is "+title+" In this Url "+pageUrl);
		webDriverActions.softWaitForElementVisibility(morelink, 2); 
		webDriverActions.softScrollToElement(morelink);
		webDriverActions.softHighlightElement(morelink);
		webDriverActions.mouseHover(morelink);
		String actualCP=webDriverActions.getAttribute("href", morelink);
		webDriverActions.softClickJS(morelink);
		String currentCPPage = webDriverActions.getCurrentPageUrl();
		String expectedCP = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentCPPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentCPPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentCPPage=betaUrl;
		}
		int responseCP = genericUtility.checkLinks(currentCPPage);
		if (responseCP==200) {
			boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
			softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
		}

		else {
			softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
		}
		softAssert.assertAll("Issues found in category section Title "+webDriverActions.getCurrentPageUrl());
	}
	
	/**
	 * @author DanishR
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsNavigation(String serverType, WebElement ad, WebElement section) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentPageUrl);
			if (response==200)
			{
				webDriverActions.softScrollToElement(section);
				webDriverActions.softWaitForElementVisibility(ad, 10);
				webDriverActions.continuousScrollTillElement(ad, 5);
				webDriverActions.softMouseHover(ad);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(ad,10) , " Possibly RHS 2nd or 3rd Ad not visible "+"\t"+currentPageUrl);
			}
		softAssert.assertAll("Issue Found in Article Body");
	}
	
	/**
	 * This method contains the steps to validate the functionalities of the Live Tv section
	 * present at the RHS of the page
	 * @throws InterruptedException
	 */
	public void liveTv() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.waitForElement(1000);
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.waitForSecond(5000);
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softHighlightElement(liveTvPlayer);
		webDriverActions.softClickJS(videoPlay);
		if (webDriverActions.softIsElementDisplayed(videoAds, 5)) {
			DriverUtility.getDriver().switchTo().frame(videoAdsIframe);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softMouseHover(skipAd);
			webDriverActions.softHighlightElement(skipAd);
			webDriverActions.softClickJS(skipAd);
			DriverUtility.getDriver().switchTo().parentFrame();
		}
		else {
			Logs.info(getClass(), "Live TV is Displayed ");
		}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(liveTvPlayer),"Unable to display Element"+liveTvPlayer);

		// Pause button //
//		DriverUtility.getDriver().switchTo().frame(videoAdsIframe);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(pauseBtn, 20);
		webDriverActions.softClickJS(pauseBtn);
		Logs.info(getClass(),"LiveTv is paused");
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playBtn),"Unable to display Element");

		/*/ Play Button /*/		
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		webDriverActions.softClickJS(playBtn);
		Logs.info(getClass(),"Live Tv Playing");

		/*/ Unmute Button /*/
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(unmuteBtn, 20);
		webDriverActions.softClickJS(unmuteBtn);
		webDriverActions.softMouseHover(liveTvPlayer);
		Logs.info(getClass(),"audio unmuted");

		/*/ Mute Button /*/
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(muteBtn, 20);
		webDriverActions.softClickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");

		/*/ Share Button /*/
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softWaitForElementVisibility(shareBtn, 30);
		webDriverActions.softClickJS(shareBtn);
		Logs.info(getClass(),"clicked on share Button");
		webDriverActions.softClickJS(shareCloseBtn);
		Logs.info(getClass(),"clicked on close Button");

		/*/ Maximize Button /*/
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(maximizeBtn, 30);
		webDriverActions.softClickJS(maximizeBtn);
		Logs.info(getClass(), "Maximized Live Tv");

		/*/ Minimize Button /*/
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(minimizeBtn, 30);
		webDriverActions.softClickJS(minimizeBtn);
		Logs.info(getClass(), "Minimized Live Tv");
		softAssert.assertAll("Live Tv Functionalities are not working fine "+ webDriverActions.getCurrentPageUrl()); 

	}
}
