
package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Sanjeeb
 * This class contains WebElements and BusinessLogic of Desktop Liveblog Page 
 */

public class DesktopLiveblogPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopLiveblogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Desktop_LiveBlogPage List of Liveblog article*/
	@FindBy(xpath = "//*[contains(@class,'lead-mstory') or contains(@class,'lead-story')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'live-update') and not(contains(@tag,'img'))]")
	private List<WebElement> liveBlogList;

	/* Desktop_LiveBlogPage List of googleAds*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe_/1039154/') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__'))]/iframe")
	private List<WebElement> googleAds;

	/*Desktop_LiveBlogPage ampHtmlStatus in browser source code page */
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlStatus;

	/*Desktop_LiveBlogPage autoRefreshButton*/
	@FindBy(xpath = "//span[contains(text(),'Auto Refresh')]")
	private WebElement autoRefreshBtn;

	/*Desktop_LiveBlogPage autoRefreshOff*/
	@FindBy(xpath = "//div[contains(@class,'jsx-3533517042 auto-slider')]//span[text()='Off']")
	private WebElement autoRefreshOff;

	/*Desktop_LiveBlogPage autoRefreshON*/
	@FindBy(xpath = "//div[contains(@class,'jsx-3533517042 auto-slider')]//span[text()='On']")
	private WebElement autoRefreshOn;

	/*Desktop_LiveBlogPage liveTvLink*/
	@FindBy(xpath = "//div[contains(@class,'vspacer20 news18-special vwall')]//h2")
	private WebElement liveTvLnk;

	/* Desktop_LiveBlogPage List of featuredImg*/
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1ets6dv r-1q9bdsx r-1phboty r-rs99b7 r-1s2bzr4 r-1udh08x']//img")
	private List<WebElement> featuredImg;	

	/* Desktop_LiveBlogPage List of keywordStatus in browser source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value'][1]")
	private WebElement keywordStatus;

	/*Desktop_LiveBlogPage descriptionStatus in browser source code page */
	@FindBy(xpath = "//span[text()='description']")
	private WebElement descriptionStatus;	

	/*Desktop_LiveBlogPage ogimgStatus in browser source code page */
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value'][1]")
	private WebElement ogimgStatus;

	/*Desktop_LiveBlogPage parentTitle in browser source code page  */
	@FindBy(xpath = "(//*[contains(text(),'<title')]/parent::td)[1]")
	private WebElement parentTitle;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'articleshare-new')]/a")
	private List<WebElement> socialShareIconsLnks;

	//---------------Cricket Category-----------//

	/*Photogallery Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> cricketLiveblogArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bread')]//a")
	private List<WebElement> cricketLiveblogArticleBreadcrumbLnk;

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'content')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> photoSectionArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'breadcrumbs')]//ul//a")
	private List<WebElement> liveblogArticleBreadcrumbLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h2")
	private WebElement news18AgencyTxt;

	/* Common Section Liveblog Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> commonLiveblogArticleLnk;

	/*Liveblog_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//h1")
	private WebElement liveblogArticleHeaderTxt;

	/*Liveblog_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'language')]/p")
	private WebElement liveblogLiveNowTxt;

	/*Liveblog_Article Excerpt Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'live_blog')]/h2")
	private WebElement liveblogArticleExcerptTxt;

	/*Liveblog_Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'post_headline')]//p[contains(.,'Updated')]")
	private WebElement liveblogArticleLastUpdatedTxt;

	/*Liveblog_Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'post_headline')]//p[contains(.,'Updated')]/span")
	private WebElement liveblogArticleLastUpdatedDateTimeTxt;

	/*Liveblog_Article Contents Location_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'post_headline')]//span[contains(@id,'location')]")
	private WebElement liveblogArticleLocationTxt;

	/*Photogallery_Article Contents Caption_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'first_story')]//img/ancestor::div//figcaption")
	private WebElement liveblogArticleImageCaptionTxt;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'post_headline')]//span[contains(@class,'post')]/a[contains(@href,'agency')]")
	private WebElement liveblogArticleAgencyLnk;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'post_headline')]//span[contains(@class,'post')]/a[contains(@href,'byline')]")
	private WebElement liveblogArticleAuthorLnk;

	/*Photogallery_Article Image Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'live_blog')]//div[contains(@class,'first_story')]//div[contains(@class,'para')]/p")
	private List<WebElement> liveblogArticleDetailedDescription;

	/* Top Photogallery Article Story Social Share Icon Link in Photo Article Page */
	@FindBy(xpath = "(//div[contains(@class,'live_feed')]//div[contains(@class,'social')])[1]//a")
	private List<WebElement> liveblogArticleFeaturedImgSocialShareLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaArticleLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> rhsTaboolaImgLnk;

	/*RHS Taboola Logo in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'link-attribution')]")
	private WebElement rhsTaboolaLogo;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'header-logo')]")
	private WebElement articleBodyTaboolaLogo;

	/*Live Article Body Key Events in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'key_event')]/ul/li/a")
	private List<WebElement> keyEventsTxt;

	/*Live blog Article Highlight Section Link in Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'live_blog_tab')]//li[contains(@id,'tabHighlights')]/a")
	private WebElement liveblogArticleHighlightLnk;

	/*Active Highlight Section in Live Blog Section*/
	@FindBy(xpath = "//div[contains(@class,'live_blog_tab')]//li[contains(@id,'tabHighlights') and contains(@class,'active')]")
	private WebElement activeLiveblogHighlightLnk;

	/*Active Live Feed  Section in Live Blog Section*/
	@FindBy(xpath = "//div[contains(@class,'live_blog_tab')]/li[contains(@id,'tabActive')]")
	private WebElement activeLiveblogLiveFeedTab;

	/*Live blog Article Live feeds Read More Links in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'live_feed_row')]//p//a")
	private List<WebElement> liveFeedsReadMoreLnk;

	/*Article Body ReadMore Link in LiveBlog Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'first-para')]//a")
	private WebElement liveblogArticleDescriptionReadMoreLnk;

	/*Article Body ReadMore Link in LiveBlog Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'first-para')]//a")
	private WebElement liveblogArticleDescripitionTxt;


	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'articleshare-new')])[2]")
	private WebElement allShareIcons;

	//--------------------------------Anupam Webelement------------------------------
	/* load more present below of liveblog article page*/
	@FindBy(xpath ="//div[contains(@class,'updateBtn')]/a")
	private WebElement loadMoreBtn;

	/* Common Section Liveblog Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story_left')]//div[contains(@class,'liveStatusIcon')]/parent::div//a[1]  |  //div[contains(@class,'top_story_right')]//div[contains(@class,'liveBlog')]/parent::a  ")
	private List<WebElement> commonLiveblogLnks;

	/* Live feed division in liveblog page*/
	@FindBy(xpath = "//div[contains(@class,'live_feed_row')]")
	private List<WebElement> liveFeedDiv;

	/* read more section present in livebllog article page*/
	@FindBy(xpath ="//div[contains(@class,'readmore_content')]/div")
	private WebElement liveBlogreadMoreSection;

	/*Tags division present Rhs below of the page*/
	@FindBy(xpath = "//div[contains(@class,'tags')]")
	private WebElement tagsLiveBlogDiv;

	/*Tags links present in tag division present Rhs below of the page*/
	@FindBy(xpath = "//div[contains(@class,'tags')]//a")
	private List<WebElement> tagsLiveBlogLnks;

	/* tags breadcrumb present in Tags page*/
	@FindBy(xpath ="//div[contains(@class,'Topic_brade_crum')]")
	private WebElement tagBreadcrumb;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'rhs_latest_news')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))] | //div[contains(@class,'TeamRanking')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsTopAds;

	//======================Danish==Webelements=================

	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> commonArticleLnks;

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//parent::a")
	private WebElement trendingNewsTitle;

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul//li//a")
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

	/*Bid Ad Present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING NEWS')]//ancestor::div//preceding-sibling::div[contains(@style,'600px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsBigAd;

	/*Ad Present after MoreNews in RHS Ad block*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING NEWS')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//child::div[contains(@class,'ad-d')]")
	private WebElement rhsMoreNewsDownAdBlock;

	/*Ad Present after MoreNews in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'TRENDING NEWS')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//child::div[contains(@class,'ad-d')]")
	private WebElement rhsMoreNewsDownAd;



	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
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
	 * @param authorLnk
	 * @param authorTxt
	 * @author VipinKumarGawande
	 *  This method is used to Validate the Author In Article Consumption Page
	 */
	public void verifyArticleAuthorNavigation(String serverType , List<WebElement> articleLst, WebElement authorLnk )
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
			Assert.assertTrue(webDriverActions.softIsElementDisplayed(authorLnk), "Possibly Author Link is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(authorLnk);
			String authorUrl = webDriverActions.getAttribute("href", authorLnk);
			webDriverActions.softClickJS(authorLnk);
			webDriverActions.waitForPageToLoad();
			String currentAuthorUrl = webDriverActions.getCurrentPageUrl();
			String expectedAuthorUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentAuthorUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentAuthorUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentAuthorUrl = betaUrl;
			}
			int authorResponse = genericUtility.checkLinks(currentAuthorUrl);
			softAssert.assertTrue(genericUtility.compareUrlSub(authorUrl, expectedAuthorUrl), "Possibly Navigating to Different Url Page "+authorUrl);
			softAssert.assertTrue(authorResponse==200, "Possibly Url is Invalid "+currentAuthorUrl + " Response Code "+authorResponse);
			if(currentAuthorUrl.contains(expectedAuthorUrl)) {
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
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issue Found in Article Body");
	}

	/**
	 * 
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

	public void verifyArticleDetailedBoxValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime, WebElement articleLocation, WebElement articleFeaturedImgTxt , WebElement liveblogTxt , WebElement articleExcerpt)
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Possibly Liveblog Article Header Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly Liveblog LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLocation);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLocation) , "Possibly Liveblog Article Location Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleFeaturedImgTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleFeaturedImgTxt) , "Possibly Liveblog Featured_Image Or Featured_Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleExcerpt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleExcerpt) , "Possibly Liveblog Article Excerpt is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(liveblogTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(liveblogTxt) , "Possibly Liveblog Article LIVEBLOG Text is Not Visible in "+currentPageUrl);
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
	 * @param highlightLnk
	 * @param descriptionTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More Description in Article Details Page for Article Consumption Page
	 */
	public void verifyLiveblogArticleHighlightSectionValidation(String serverType , List<WebElement> articleLst ,WebElement activeLiveFeedTab , WebElement highlightLnk ,  WebElement activeHighlightTab)
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
			webDriverActions.softMouseHover(highlightLnk);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(highlightLnk) , "Possibly Highlight Tab is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(activeLiveFeedTab);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(activeLiveFeedTab), "Possibly Live Feed Tab is Not Visible in "+currentPageUrl);
			if(webDriverActions.softIsElementDisplayed(highlightLnk))
			{
				boolean beforeClick = webDriverActions.softIsElementDisplayed(activeHighlightTab ,1);
				Logs.info(getClass(), "BC - "+beforeClick);
				webDriverActions.softHighlightElement(highlightLnk);
				webDriverActions.softClickJS(highlightLnk);
				webDriverActions.waitForSecond(500);
				boolean afterClick = webDriverActions.softIsElementDisplayed(activeHighlightTab,1);
				Logs.info(getClass(), "AC - "+afterClick);
				softAssert.assertNotEquals(beforeClick, afterClick , "Possibly Highlight Tab Navigation is Not Working in "+expectedUrl);
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

	/**
	 * @param serverType
	 * @param articleLst
	 * @param description
	 * @param readMoreLnk
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Description and Article Header Link in Article Consumption Page
	 */
	public void verifyLiveFeedsReadMoreLinkNavigation(String serverType , List<WebElement> articleLst ,List<WebElement> readMoreLnk  )
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
			if(readMoreLnk.size()>0) {
				String articlePageTitle = webDriverActions.getPageTitle();
				for(int k=0;k<readMoreLnk.size();k++)
				{
					webDriverActions.softMouseHover(readMoreLnk.get(k));
					webDriverActions.softHighlightElement(readMoreLnk.get(k));
					String actualHeaderUrl = webDriverActions.getAttribute("href", readMoreLnk.get(k));
					String target = webDriverActions.getAttribute("target", readMoreLnk.get(k));
					if(target.contains("blank"))
					{
						webDriverActions.softClickJS(readMoreLnk.get(k));
						webDriverActions.switchToNewWindow();
						webDriverActions.waitForPageToLoad();
						String currentHeaderUrl = webDriverActions.getCurrentPageUrl();
						String expectedHeaderUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preProd") && !currentHeaderUrl.contains("//beta") && currentHeaderUrl.contains("news18")) {
							String betaUrl = genericUtility.replaceInUrl(currentHeaderUrl);
							webDriverActions.navigateToUrl(betaUrl);
							currentHeaderUrl = betaUrl;
						}
						int headerResponse = genericUtility.checkLinks(currentHeaderUrl);
						softAssert.assertTrue(headerResponse==200, "Possibly Url is Invalid "+expectedHeaderUrl+" And Status Code is "+headerResponse);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualHeaderUrl, expectedHeaderUrl), "Possibly not navigate to same page "+actualHeaderUrl);
						webDriverActions.waitForSecond(1000);
						webDriverActions.closeDriver();
						webDriverActions.waitForSecond(1000);
						webDriverActions.switchToWindow(articlePageTitle);
						webDriverActions.waitForSecond(1000);
					}
					else
					{
						webDriverActions.softMouseHover(readMoreLnk.get(k));
						webDriverActions.softClickJS(readMoreLnk.get(k));
						String currentHeaderUrl = webDriverActions.getCurrentPageUrl();
						String expectedHeaderUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preprod") && !currentHeaderUrl.contains("//beta") && currentHeaderUrl.contains("news18")) {
							String betaUrl = genericUtility.replaceInUrl(currentHeaderUrl);
							webDriverActions.navigateToUrl(betaUrl);
							currentHeaderUrl = betaUrl;
						}
						int headerResponse = genericUtility.checkLinks(currentHeaderUrl);
						softAssert.assertTrue(headerResponse==200, "Possibly Url is Invalid "+expectedHeaderUrl+" And Status Code is "+headerResponse);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualHeaderUrl, expectedHeaderUrl), "Possibly not navigate to same page "+actualHeaderUrl);
						webDriverActions.waitForSecond(1000);
						webDriverActions.navigateBack();
					}
				}
			}
			else
			{
				Logs.error(getClass(), "NO READ MORE LINK PRESENT ");
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
			Assert.assertTrue(webDriverActions.softIsElementDisplayed(agencyLnk), "Possibly Agency Link is Not Visible in "+expectedUrl);
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
	 * @param articleSocialMedia\
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Media Icons Navigation In Article Consumption Page
	 */
	public void verifyArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,List< WebElement> articleSocialMedia)
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
		//Below list adds webelements of social share icons
		for(int i=0; i<1; i++) {
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleSocialMedia.get(j)), "Possibly Social Share Icon is Not Visible in "+currentPageUrl);
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				webDriverActions.navigateToNewTab(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(socialResponse==200, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				webDriverActions.closeDriver();
				webDriverActions.waitForSecond(1000);
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
	 * @param authorLnk
	 * @param authorTxt
	 * @author VipinKumarGawande
	 *  This method is used to Validate the Author In Article Consumption Page
	 */
	public void verifyArticleAuthorNavigation(String serverType , List<WebElement> articleLst, WebElement authorLnk , WebElement authorTxt)
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorLnk), "Possibly Author Link is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(authorLnk);
			String authorUrl = webDriverActions.getAttribute("href", authorLnk);
			webDriverActions.softClickJS(authorLnk);
			webDriverActions.waitForPageToLoad();
			String currentAuthorUrl = webDriverActions.getCurrentPageUrl();
			String expectedAuthorUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentAuthorUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentAuthorUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentAuthorUrl = betaUrl;
			}
			int authorResponse = genericUtility.checkLinks(currentAuthorUrl);
			softAssert.assertTrue(genericUtility.compareUrlSub(authorUrl, expectedAuthorUrl), "Possibly Navigating to Different Page "+authorUrl);
			softAssert.assertTrue(authorResponse==200, "Possibly Url is Invalid "+currentAuthorUrl + " Response Code "+authorResponse);
			webDriverActions.softHighlightElement(authorTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorTxt), "Possibly Page Content is Not Visible "+currentAuthorUrl);
			if(currentAuthorUrl.contains(expectedAuthorUrl)) {
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
			webDriverActions.waitForPageToLoad();
			webDriverActions.softMouseHover(articleLst.get(i));
		}
		softAssert.assertAll("Issue Found in Article Body");
	}


	/**
	 * @param serverType
	 * @param articleLst
	 * @param keyEvent
	 * @param headerLnk
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Description and Article Header Link in Article Consumption Page
	 */
	public void verifyLiveblogArticleKeyEventValidation(String serverType , List<WebElement> articleLst , List<WebElement> keyEvent)
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
			softAssert.assertTrue(keyEvent.size()>0, "Possibly Liveblog Article KeyEvent Is Not Visible in "+currentPageUrl);
			for(int j=0;j<keyEvent.size();j++)
			{
				webDriverActions.softMouseHover(keyEvent.get(j));
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(keyEvent.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(keyEvent.get(j)), "Possibly Liveblog Article KeyEvent Is Not Visible in "+currentPageUrl);
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
	 * @param googleLnk
	 * @param news18Logo
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News In Article Consumption Page
	 */
	public void verifyArticleGoogleNewsNavigation(String serverType ,List<WebElement> articleLst , WebElement googleLnk , WebElement news18Logo)
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
			webDriverActions.softHighlightElement(googleLnk);
			String googleUrl = webDriverActions.getAttribute("href", googleLnk);
			webDriverActions.softClickJS(googleLnk);
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			String currentGoogleUrl = webDriverActions.getCurrentPageUrl();
			String expectedGoogleUrl = webDriverActions.getCurrentPageUrl();
			int googleResponse = genericUtility.checkLinks(currentGoogleUrl);
			softAssert.assertTrue(genericUtility.compareUrlSub(googleUrl, expectedGoogleUrl), "Possibly Navigating to Different Page "+googleUrl);
			softAssert.assertTrue(googleResponse==200, "Possibly Url is Invalid "+currentGoogleUrl + " Response Code "+googleResponse);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(news18Logo) , "Possibly Page is Not Visible "+currentGoogleUrl);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(articlePageTitle);
			if(currentGoogleUrl.contains(expectedGoogleUrl)) {
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
	 * @param readMoreLnk
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More Link in LiveBlog Page for Article Consumption Page
	 */
	public void verifyArticleReadMoreValidation(String serverType , List<WebElement> articleLst ,WebElement articleDescription ,  WebElement readMoreLnk)
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleDescription), "Possibly Liveblog Article Description is Not Visible in "+ currentPageUrl);
			if(webDriverActions.softIsElementDisplayed(readMoreLnk))
			{
				String beforeClickUrl = webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), beforeClickUrl);
				webDriverActions.softHighlightElement(readMoreLnk);
				webDriverActions.softClickJS(readMoreLnk);
				webDriverActions.waitForSecond(500);
				String afterClickUrl = webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), afterClickUrl);
				softAssert.assertNotEquals(beforeClickUrl, afterClickUrl , "Possibly Read More Description Link is Not Working "+expectedUrl);
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


	/*================Common Section Liveblog Article Consumption Page=============*/

	public void verifyCommonLiveblogArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonLiveblogArticleLnk, liveblogArticleBreadcrumbLnk);
	}

	public void verifyCommonLiveblogArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, commonLiveblogArticleLnk, liveblogArticleHeaderTxt,liveblogArticleLastUpdatedTxt,liveblogArticleLastUpdatedDateTimeTxt,liveblogArticleLocationTxt,liveblogArticleImageCaptionTxt, liveblogArticleExcerptTxt,liveblogLiveNowTxt);
	}

	public void verifyCommonLiveblogArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonLiveblogArticleLnk, liveblogArticleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCommonLiveblogArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonLiveblogArticleLnk, liveblogArticleFeaturedImgSocialShareLnk);
	}

	public void verifyCommonLiveblogArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonLiveblogArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCommonLiveblogArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonLiveblogArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCommonLiveblogArticleKeyEventsValidation(String serverType) 
	{
		verifyLiveblogArticleKeyEventValidation(serverType, commonLiveblogArticleLnk, keyEventsTxt);
	}

	public void verifyCommonLiveblogArticleHighlightValidation(String serverType)
	{
		verifyLiveblogArticleHighlightSectionValidation(serverType, commonLiveblogArticleLnk,activeLiveblogLiveFeedTab ,  liveblogArticleHighlightLnk, activeLiveblogHighlightLnk);
	}

	public void verifyCommonLiveblogArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonLiveblogArticleLnk, liveblogArticleAuthorLnk);
	}

	public void verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(String serverType)
	{
		verifyLiveFeedsReadMoreLinkNavigation(serverType, commonLiveblogArticleLnk, liveFeedsReadMoreLnk);
	}

	public void verifyCommonLiveblogArticleDescriptionReadMoreValidation(String serverType) {
		verifyArticleReadMoreValidation(serverType, commonLiveblogArticleLnk,liveblogArticleDescripitionTxt , liveblogArticleDescriptionReadMoreLnk);
	}

	//----------------------- Cricket Liveblog Business Logic --------------------------------//

	/*================Common Section Liveblog Article Consumption Page=============*/

	public void verifyCricketLiveblogArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketLiveblogArticleLnk, cricketLiveblogArticleBreadcrumbLnk);
	}

	public void verifyCricketLiveblogArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, cricketLiveblogArticleLnk, liveblogArticleHeaderTxt,liveblogArticleLastUpdatedTxt,liveblogArticleLastUpdatedDateTimeTxt,liveblogArticleLocationTxt,liveblogArticleImageCaptionTxt, liveblogArticleExcerptTxt,liveblogLiveNowTxt);
	}

	public void verifyCricketLiveblogArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cricketLiveblogArticleLnk, liveblogArticleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCricketLiveblogArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketLiveblogArticleLnk, liveblogArticleFeaturedImgSocialShareLnk);
	}

	public void verifyCricketLiveblogArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketLiveblogArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCricketLiveblogArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketLiveblogArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCricketLiveblogArticleKeyEventsValidation(String serverType) 
	{
		verifyLiveblogArticleKeyEventValidation(serverType, cricketLiveblogArticleLnk, keyEventsTxt);
	}

	public void verifyCricketLiveblogArticleHighlightValidation(String serverType)
	{
		verifyLiveblogArticleHighlightSectionValidation(serverType, cricketLiveblogArticleLnk,activeLiveblogLiveFeedTab ,  liveblogArticleHighlightLnk, activeLiveblogHighlightLnk);
	}

	public void verifyCricketLiveblogArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, cricketLiveblogArticleLnk, liveblogArticleAuthorLnk);
	}

	public void verifyCricketLiveblogArticleLiveFeedsReadMoreNavigation(String serverType)
	{
		verifyLiveFeedsReadMoreLinkNavigation(serverType, cricketLiveblogArticleLnk, liveFeedsReadMoreLnk);
	}

	public void verifyCricketLiveblogArticleDescriptionReadMoreValidation(String serverType) {
		verifyArticleReadMoreValidation(serverType, cricketLiveblogArticleLnk,liveblogArticleDescripitionTxt , liveblogArticleDescriptionReadMoreLnk);
	}


	//--------------------------------Anupam Business Logic-----------------------------

	/**
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyLiveblogLoadMoreNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
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
				webDriverActions.continuousScrollTillElement(loadMoreBtn, 1);
				if(webDriverActions.softIsElementDisplayed(loadMoreBtn, 3))
				{
					int beforeClickDiv=liveFeedDiv.size();
					webDriverActions.softClick(loadMoreBtn);
					webDriverActions.waitForSecond(1000);
					int afterClickDiv=liveFeedDiv.size();

					Logs.info(getClass(), "before click article div: "+beforeClickDiv+", after click article div: "+afterClickDiv);
					softAssert.assertTrue(afterClickDiv>beforeClickDiv , "Possibly Load more button is not clicked  "+"\t"+currentPageUrl);
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


	public void verifyMoviesLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyLiveBlogReadMoreSectionValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
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
				webDriverActions.continuousScrollTillElement(liveBlogreadMoreSection, 3);
				webDriverActions.softHighlightElement(liveBlogreadMoreSection);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(liveBlogreadMoreSection, 10) , "Possibly Read More Section is Not Visible in bottom "+currentPageUrl);

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

	public void verifyMoviesLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyLiveBLogRHSTopAdsValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(rhsTopAds,10) , "Possibly RHS top Ads is not visible after 10 sec  "+"\t"+currentPageUrl);
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


	public void verifyMoviesLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Widgets in english Page.
	 * @param serverType
	 * @param articleLst
	 * @param breadcrumb
	 */
	public void verifyRHSTagsNavigation(String serverType , List<WebElement> articleLst, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly LiveBlog Article is Not Visible in Category Page in "+sectionPage);
		}
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if(serverType.equalsIgnoreCase("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl = betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPageUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, currentPageUrl), "Possibly not navigate to same page "+actualUrl);
			if (response==200)
			{
				webDriverActions.scrollDown();
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(tagsLiveBlogDiv, 2);
				//				webDriverActions.continuousScrollTillAllElement(tagsValue, 10);
				//				softAssert.assertTrue(tagsValue.size()>0, "Possibly Tags is Not Visible"+"\t"+currentPageUrl);

				if(webDriverActions.softIsElementDisplayed(tagsLiveBlogDiv, 2)) {
					for(int j=0; j<tagsLiveBlogLnks.size(); j++) {
						webDriverActions.softScrollToElement(tagsLiveBlogLnks.get(j));
						webDriverActions.softMouseHover(tagsLiveBlogLnks.get(j));
						webDriverActions.softHighlightElement(tagsLiveBlogLnks.get(j));
						String actualTagUrl = webDriverActions.getAttribute("href", tagsLiveBlogLnks.get(j));
						webDriverActions.softClickJS(tagsLiveBlogLnks.get(j));
						String currentPageTagUrl = webDriverActions.getCurrentPageUrl();
						String expectedTagUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preProd") && !currentPageTagUrl.contains("//beta")) {
							String betaUrl = genericUtility.replaceInUrl(currentPageTagUrl);
							webDriverActions.navigateToUrl(betaUrl);
							currentPageTagUrl = betaUrl;
						}

						int tagPageResponse = genericUtility.checkLinks(currentPageTagUrl);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualTagUrl, currentPageTagUrl), "Possibly Navigating to Different Page "+actualTagUrl);
						softAssert.assertTrue(tagPageResponse==200, "Possibly Url is Invalid "+currentPageTagUrl + " Its Response Code "+tagPageResponse + " Its Parent Url :  "+currentPageUrl);
						//						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb) , "Possibly Page is Not Visible "+currentPageTagUrl);
						if (currentPageTagUrl.contains(expectedTagUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}
					}
				}
				else {
					softAssert.fail("Possibly Tag is not present"+"\t"+currentPageUrl);
				}
			}
			webDriverActions.waitForSecond(300);
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();

			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(100);
		}
		softAssert.assertAll("Issue Found in Article Body");
	}

	public void verifyMoviesRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//AUTO
	public void verifyAutoLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyAutoLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyAutoLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyAutoRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//BUSINESS
	public void verifyBusinessLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyBusinessLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyBusinessLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyBusinessRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//BUZZ
	public void verifyBuzzLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyBuzzLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyBuzzLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyBuzzRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//CRICKET
	public void verifyCricketLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyCricketLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyCricketLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyCricketRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//EDUCATION
	public void verifyEducationLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyEducationLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyEducationLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyEducationRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}


	//EXPLAINERS
	public void verifyExplainersLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyExplainersLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyExplainersLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyExplainersRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//INDIA
	public void verifyIndiaLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyIndiaLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyIndiaLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyIndiaRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//LATEST
	public void verifyLatestLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyLatestLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyLatestLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyLatestRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//LIFESTYLE
	public void verifyLifeStyleLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyLifeStyleLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyLifeStyleLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyLifeStyleRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//OPINION
	public void verifyOpinionLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyOpinionLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyOpinionLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyOpinionRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//POLITICS
	public void verifyPoliticsLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyPoliticsLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyPoliticsLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyPoliticsRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//SHOWSHA
	public void verifyShowshaLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyShowshaLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyShowshaLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyShowshaRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//SPORTS
	public void verifySportsLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}

	public void verifySportsLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifySportsLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifySportsRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//TECH
	public void verifyTechLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}
	public void verifyTechLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyTechLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyTechRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	//WORLD
	public void verifyWorldLiveblogLoadMoreNavigation(String serverType)
	{
		verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
	}

	public void verifyWorldLiveBlogReadMoreSectionValidation(String serverType)
	{
		verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
	}
	public void verifyWorldLiveBLogRHSTopAdsValidation(String serverType)
	{
		verifyLiveBLogRHSTopAdsValidation(serverType, commonLiveblogLnks);
	}
	public void verifyWorldRHSTagsNavigation(String serverType)
	{
		verifyRHSTagsNavigation(serverType, commonLiveblogLnks,tagBreadcrumb);
	}

	/**
	 * This method is used to verify RHS TrendingNews Title
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle,commonArticleLnks);
	}
	/**
	 * This method is used to verify RHS TrendingNews Articles
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles,commonArticleLnks);
	}

	/**
	 * This method is used to verify RHS TrendingNews Read more
	 * @param serverType
	 */
	public void verifyRhsTrendingNewsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore,commonArticleLnks);
	}

	public void verifyArticleRHSMoreNewsDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonArticleLnks,rhsMoreNewsDownAd);
	}

	public void verifyArticleTrendingNewsDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonArticleLnks,rhsBigAd);
	}
	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the RHS section
	 */
	public void verifyRHSTitleNavigation(String serverType,WebElement title,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(commonArticleLnks.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
		Assert.assertTrue(categoryPageLinks.size()>0,"Possibly no articles present or size is "+categoryPageLinks.size() +" In this Url "+pageUrl);
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
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
				webDriverActions.softWaitForElementVisibility(title, 2); 
				webDriverActions.softScrollToElement(title);
				//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
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
					softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentCPPage);
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(pageUrl);
		}
		softAssert.assertAll(" Issues found in the section ");
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
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(commonArticleLnks.size()==0){
			Logs.error(getClass(), "Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
		}
		Assert.assertTrue(categoryPageLinks.size()>0,"Possibly no articles present or size is "+categoryPageLinks.size() +" In this Url "+sectionPage);
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
		}
		softAssert.assertAll("Issues found in money category section Articles ");
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This metod is used to click on Read more button of RHS section
	 */
	public void verifyRHSReadMoreNavigation(String serverType,WebElement title, WebElement morelink,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(commonArticleLnks.size()==0){
			Logs.error(getClass(), "Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
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
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
				webDriverActions.softScrollToElement(title);
				webDriverActions.continuousScrollTillElement(morelink, 10);
				webDriverActions.softScrollToElement(morelink);
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
					softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentCPPage);
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(categoryPage);
		}
		softAssert.assertAll("Issues found in money category section Read more ");
	}

	/**
	 * @author DanishR
	 * This method is used to validate RHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsNavigation(String serverType , List<WebElement> articleLst, WebElement ad) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(commonArticleLnks.size()==0){
			Logs.error(getClass(), "Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
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

		}
		softAssert.assertAll("Issue Found in Article Body");
	}




}



