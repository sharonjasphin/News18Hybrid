package com.news18.englishpages;
import static org.testng.Assert.assertNotEquals;

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

public class MobileCategoryArticleConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();
	public WebDriver driver;

	public MobileCategoryArticleConsumptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//======================Danish==Webelements=================

	/*PhotoGallery  Widget Articles Present in RHS*/
	@FindBy(xpath="//span[contains(text(),'Photogallery')]//parent::h2//following-sibling::figure//img")
	private List<WebElement> photogalleryArticlesImg;

	/*PhotoGallery Widget Title Present in RHS */
	@FindBy(xpath="//span[contains(text(),'Photogallery')]")
	private WebElement photogalleryTitle; 

	/*PhotoGallery  Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h3[contains(@class,'photogallery_title')]/a")
	private List<WebElement> photogalleryArticlesLnk;

	/*LiveTv video player displaying in RHS of Savings and Investment page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Big play button displaying in below of video player to play the liveTV*/
	@FindBy(xpath = "//div//button[@class='vjs-big-play-button']")
	private WebElement videoPlayBtn;

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

	/*share Button on Live Tv section*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-control vjs-button vjs-icon-share')]")
	private WebElement shareBtn;

	/*Maximize Button on Live Tv section*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement maximizeBtn;

	/*minimize Button on Live Tv section*/
	@FindBy(xpath = "//div//button[contains(@class,'vjs-fullscreen-control vjs-control vjs-button')]")
	private WebElement minimizeBtn;

	/*close Button on Live Tv section*/
	@FindBy(xpath = "//div[@class='vjs-close-btn vjs-share-close']")
	private WebElement closeBtn;

	/*Webelement on Live Tv section */
	@FindBy(xpath = "//video[contains(@id,'content_video_html5_api')]")
	private WebElement mouseoverActionBar;

	/*LIve Tv element Headline Text*/
	@FindBy(xpath = "//div[contains(@class,'livetv-mobile-title heading_title')]")
	private WebElement liveTvHeadline;

	/*Skip ad button present in live Tv*/
	@FindBy(xpath = "//div//button[contains(@class,'videoAdUiSkipButton videoAdUiAction')]")
	private WebElement skipAdd;

	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//div[@id='playerContainer']//div[contains(@id,'content_video_ima-ad-container')]")
	private WebElement videoAds;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//iframe[contains(@id,'goog_')]")
	private WebElement videoAdsIframe;
	
	/*Vedio wall Title present in Video wall Section*/
	@FindBy(xpath = "//span[contains(text(),'Video Wall')]")
	private WebElement videoWallTitle;

	/*Vedio wall article Link present in Video wall Section*/
	@FindBy(xpath = "//div[contains(@class,'video_wall')]//a")
	private List<WebElement> videoWallArticle;
	
	/*Vedio wall Img Link present in Video wall Section*/
	@FindBy(xpath = "//div[contains(@class,'video_wall')]//img")
	private List<WebElement> videoWallImg;
	
	/*Ad present below Video wall Section*/
	@FindBy(xpath = "//span[contains(text(),'Video Wall')]//parent::h2//parent::div//following-sibling::div[contains(@class,'pwa_add')]")
	private WebElement adBelowVidWall;

	/**
	 * @author Danish R
	 * This method is used to verify  PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyPhotoGalleryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticlesLnk);
	}

	/**
	 * @author Danish R
	 * This method is used to verify  PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyPhotoGalleryArticleImg(String serverType) {
		verifyRHSArticleImgNavigation(serverType,photogalleryTitle,photogalleryArticlesImg);
	}
	
	/**
	 * @author Danish R
	 * This method is used to verify  PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyVideoWallArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,videoWallTitle,videoWallArticle);
	}

	/**
	 * @author Danish R
	 * This method is used to verify  PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyVideoWallArticleImg(String serverType) {
		verifyRHSArticleImgNavigation(serverType,videoWallTitle,videoWallImg);
	}
	
	/**
	 * @author Rahul
	 * This method is used to call verifyArticleAdsNavigation present Videowall down ad validation 
	 * @param serverType
	 */
	public void verifyArticleVideoDownAdNavigation(String serverType){
		verifyArticleAdsNavigation(serverType,adBelowVidWall,videoWallTitle);
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
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSArticleImgNavigation(String serverType,WebElement title,List<WebElement> articlesLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.softScrollToElement(title);
		Assert.assertTrue(articlesLinks.size()>0,"Possibly no articles present or size is "+articlesLinks.size() +" In this Url "+categoryPage);
		for(int i=0;i<articlesLinks.size();i++) {
			webDriverActions.softHighlightElement(articlesLinks.get(i));
			webDriverActions.softMouseHover(articlesLinks.get(i));
			webDriverActions.softClickJS(articlesLinks.get(i));
			String currentCPPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preprod")) {
				String betaUrl = genericUtility.replaceInUrl(currentCPPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentCPPage = betaUrl;
			}
			int responseCP = genericUtility.checkLinks(currentCPPage);
			Assert.assertTrue(!currentCPPage.equals(categoryPage),"not navigated");
			softAssert.assertTrue(responseCP==200,"Issues found in navigation"+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issues found in category section Articles "+webDriverActions.getCurrentPageUrl());
	} 
	
	/**
	 * @author Danish
	 * This method is used to check the functionalities of Live Tv present in Category mobile mode
	 */
	public void liveTv() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(photogalleryTitle, 15);
		webDriverActions.waitForElement(1000);
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.softMouseHover(liveTvPlayer);
		if (videoAds.isDisplayed()) {
			DriverUtility.getDriver().switchTo().frame(videoAdsIframe);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softMouseHover(skipAdd);
			webDriverActions.softHighlightElement(skipAdd);
			webDriverActions.clickJS(skipAdd);
			webDriverActions.waitForSecond(2000);
			DriverUtility.getDriver().switchTo().parentFrame();
			webDriverActions.waitForSecond(4000);
			Logs.info(getClass(),"Navigated to LiveTV player");
		}
		else {
			Logs.info(getClass(), "Live TV is Displayed ");
		}

		/* Pause button */
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(mouseoverActionBar, 20);
		webDriverActions.softMouseHover(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(pauseBtn, 20);
		webDriverActions.softClickJS(pauseBtn);
		Logs.info(getClass(),"LiveTv is paused");
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playBtn),"Unable to display Element");

		/* Play Button */	
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(playBtn, 20);
		webDriverActions.softClickJS(playBtn);
		Logs.info(getClass(),"Live Tv Playing");
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(pauseBtn, 20);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(pauseBtn),"Unable to display Element");

		/* Unmute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(unmuteBtn, 20);
		webDriverActions.softClickJS(unmuteBtn);
		Logs.info(getClass(),"audio unmuted");
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(muteBtn, 20);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(muteBtn),"Unable to display Element");

		/* Mute Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(muteBtn, 20);
		webDriverActions.softClickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softMouseHover(mouseoverActionBar);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(unmuteBtn),"Unable to display Element");

		/* Share Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(shareBtn, 30);
		webDriverActions.softClickJS(shareBtn);
		Logs.info(getClass(),"clicked on share Button");
		webDriverActions.softClickJS(closeBtn);
		Logs.info(getClass(),"clicked on close Button");

		/* Maximize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(maximizeBtn, 30);
		webDriverActions.softClickJS(maximizeBtn);
		Logs.info(getClass(), "Maximized Live Tv");
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(minimizeBtn, 30);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(minimizeBtn),"Unable to display Element");

		/* Minimize Button */
		webDriverActions.softMouseHover(liveTvPlayer);
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(minimizeBtn, 30);
		webDriverActions.softClickJS(minimizeBtn);
		Logs.info(getClass(), "Minimized Live Tv");
		webDriverActions.doubleClick(mouseoverActionBar);
		webDriverActions.softWaitForElementVisibility(maximizeBtn, 30);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(maximizeBtn),"Unable to display Element");
		softAssert.assertAll("Issues found in Home Page RHS Live Tv Functionalities"); 
	}
	/**
	 * @author DanishR
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleAdsNavigation(String serverType, WebElement ad, WebElement section) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentPageUrl);
			if (response==200)
			{
				webDriverActions.softScrollToElement(section);
				webDriverActions.softWaitForElementVisibility(ad, 10);
				webDriverActions.softMouseHover(ad);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(ad,10) , " Possibly RHS 2nd or 3rd Ad not visible "+"\t"+currentPageUrl);
			}
		softAssert.assertAll("Issue Found in Article Body");
	}
}