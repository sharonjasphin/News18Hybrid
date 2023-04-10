package com.news18.englishpages;

import java.util.ArrayList;
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
 * @author SanjeebKumarPati
 * This Class contains webelements and business logic for Mobile Article Consumption Page
 */

public class MobileArticleConsumptionPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt =new SoftAssert();

	public MobileArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Outbrain present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='ob_what ob_what_resp']/a/span [contains(@title,'Outbrain')]")
	private WebElement outbrain;

	/* Robot tag present in Meta */
	@FindBy(xpath = "//*[contains(text(),'robots')]/following-sibling::span[contains(text(),'max-image-preview:large')]")
	private WebElement robotsInSourceCode;

	/* Outbrain box present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainBox;

	/*Promoted Content All Article List present inside Outbrain in Homepage*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//section/span[1]")
	private List<WebElement> promotedContentArticleList;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//span[@class='ob-unit ob-rec-image-container']")
	private List<WebElement> promotedContentImg;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private List<WebElement> outbrainTxt;

	/*Homepage List of article Link for news18 home Page*/
	@FindBy(xpath ="(//ul[contains(@class,'story_listing')])[1]/li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "(//div[contains(@class,'top_story')]//a) ")
	private List<WebElement> latestArtcleLnk;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'published_date')]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'article_main')]//ul[contains(@class,'article_socials')]")
	private WebElement allShareIcons;

	//======================Danish==Webelements=================


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

	/*More News Widget Articles Present in RHS */
	@FindBy(xpath="//div//h2//span[contains(text(),'More News')]//parent::h2//following-sibling::ul//li//div//a")
	private List<WebElement> moreNewsArticles;

	/*PhotoGallery Widget Title Present in RHS */
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]/a")
	private WebElement photogalleryTitle; 

	/*PhotoGallery  Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]//following-sibling::ul//li//img//parent::a")
	private List<WebElement> photogalleryArticles;

	/* Common Section Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> commonArticleEle;

	/* Cricket Section Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'CN-Topstory')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> cricketArticleEle;

	/* Astrology Section Article Link in Line one Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> astrologyArticleEle;

	/*------------------Vipin's Common WebElements--------------------*/

	/* Common Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> commonArticleLnks ;
	
	/*Homepage Article Link */
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-')) and not(contains(@href,'livenews'))] | //div[contains(@class,'top_story')]/following-sibling::ul[contains(@class,'story_listing')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-')) and not(contains(@href,'livenews'))]")
	private List<WebElement> homepageArticleLnk; 
	
	//---------------Cricket Category-----------//
	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'CN-Topstory')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> cricketArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bread')]//a")
	private List<WebElement> articleBreadcrumbLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article')]/h1")
	private WebElement articleHeaderTxt;

	/*Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details')]/p[contains(.,'Last')]")
	private WebElement articleLastUpdatedTxt;

	/*Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details')]/p[contains(.,'Last')]/span")
	private WebElement articleLastUpdatedTimeTxt;

	/*Article Contents Location in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details')]/p[contains(.,'Last')]/parent::div/following-sibling::div/p")
	private WebElement articleLocationTxt;

	/*Article Contents Featured_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_img')]//img/parent::div/following-sibling::div/div")
	private WebElement articleFeaturedImgTxt;

	/*Article Post By Name in Article Description in */
	@FindBy(xpath = "//div[contains(@class,'article_details')]//span[contains(@class,'article_postby')]/a[contains(@href,'/byline/')]")
	private WebElement articleAuthorLnk;

	/*Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details')]/p/a[contains(@href,'/agency/')]")
	private WebElement articleAgencyLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h2 | //div[contains(@class,'agencyWrapper')]/h2")
	private WebElement news18AgencyTxt;

	/*Read More Description link in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//h2/span[contains(@class,'readmoreintro')]")
	private WebElement articleDescriptionReadMoreLnk;

	/*Article Description Text in Article Detailed Description Division in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article')]/h2")
	private WebElement articleDescriptionTxt; 

	/*Article Footer Read More Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'more_content')]/div")
	private WebElement articleFooterReadMoreLnk;

	/*Article Detailed Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-body')]//p")
	private List<WebElement> articleDetailedDescriptionTxt;

	/*Article Detailed Description Header Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-body')]//p//a[contains(@href,'news18')]")
	private List<WebElement> articleDetailedHighlightLnk;

	/*Article Google News Links in Article Consumption Page */
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]/li/a[contains(@href,'google')]")
	private WebElement articleGoogleNewsLnk;

	/*News18 Google Header */
	@FindBy(xpath = "//div/h2[contains(.,'News18')]")
	private WebElement googleNews18Logo;

	/*Article Share on Social Media Link in Article Consumption Page*/
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]/li/a")
	private List<WebElement> articleSocialShareLnk;

	/*Social Media Link present in the Footer in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article_follow')]//a")
	private List<WebElement> articleFooterSocialIconLnk;

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

	/*Article Tags Links in Article Consumption Page*/
	@FindBy(xpath = "//ul[contains(@class,'tags')]//a")
	private List<WebElement> articleTagsLnk;

	/*Article Related News Links in LHS Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'related')]/ul/li/a")
	private List<WebElement> articleRelatedNewsLnk;

	/*Article Highlight Section Division in Article Consumption page*/
	@FindBy(xpath = "//div[contains(@class,'artclhglght')]")
	private WebElement articleHighlightDiv;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	//------------------------------Anupam Webelement-----------------------------------

	/* read more present in article page*/
	@FindBy(xpath ="//div[contains(@class,'more_content')]/div")
	private WebElement readMoreBox;

	/*Tags division present below of the page*/
	@FindBy(xpath = "//ul[contains(@class,'tags')]")
	private WebElement tagsDiv;

	/* tags breadcrumb present in Tags page*/
	@FindBy(xpath ="//div[contains(@class,'ProfileBiography_top_link')]")
	private WebElement tagBreadcrumb;

	/*Tags links present in tag division present below of the page*/
	@FindBy(xpath = "//ul[contains(@class,'tags')]/li/a[not(contains(@href,'#'))]")
	private List<WebElement> tagsLnks;

	/*Tags links present in tag division present below of the page*/
	@FindBy(xpath = "//ul[contains(@class,'tags')]/a[contains(.,'Show more')]")
	private WebElement tagsMoreLnk;

	/* first published present in  bottom article page*/
	@FindBy(xpath ="//div[contains(@class,'published_date')]")
	private WebElement firstpublishedDiv;

	/* last updated present in  bottom article page*/
	@FindBy(xpath ="//div[contains(@class,'updated_date')]")
	private WebElement lastUpdatedDiv;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'rhs_latest_news')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsTopAds;

	/* author Box present in article page*/
	@FindBy(xpath ="//div[contains(@class,'author_box_inner')]")
	private WebElement authorBox;

	/* author Box read more link present in article page*/
	@FindBy(xpath ="//div[contains(@class,'author_box_inner')]//a[contains(@class,'read_more')]")
	private WebElement authorBoxMoreLnk;



	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	public List<WebElement> getLatestArtcleLnk() {
		return latestArtcleLnk;
	}


	//======================== Common Element to click on First Article in L1 and L2 Sections========================
	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private WebElement commonEle;
	
	/* Common Section Photogallery Article Link in  Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/')]")
	private WebElement commonPhotogalleryArticleLnks;
	
	/*Video Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/videos/')]")
	private WebElement videoSectionArticleLnks;
	
	/*Video Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'fe_outer')]//a[contains(@href,'/videos/')]")
	private WebElement videoArticleLnks;
	
	/*Live Blog Section Videogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'liveStatusIcon')]/ancestor::figure//a  |  //div[contains(@class,'liveBlog')]/parent::a  ")
	private WebElement liveBlogArticleLnks;



	//======================== Common Business Logics to click on First Article in L1 and L2 Sections========================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(commonEle);
		webDriverActions.clickJS(commonEle);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstPhotoArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.softWaitForElementVisibility(commonPhotogalleryArticleLnks, 10);
			webDriverActions.clickJS(commonPhotogalleryArticleLnks);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(commonPhotogalleryArticleLnks, 10);
				webDriverActions.clickJS(commonPhotogalleryArticleLnks);
			}
			}
			catch (Throwable e) {
				throw new SkipException("Unable to locate Photo Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
			}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstVideoArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.softWaitForElementVisibility(videoSectionArticleLnks, 10);
			webDriverActions.clickJS(videoSectionArticleLnks);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(videoSectionArticleLnks, 10);
				webDriverActions.clickJS(videoSectionArticleLnks);
			}
			}
			catch (Throwable e) {
				throw new SkipException("Unable to locate Video Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
			}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstVideoSectionArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.softWaitForElementVisibility(videoArticleLnks, 10);
			webDriverActions.clickJS(videoArticleLnks);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(videoArticleLnks, 10);
				webDriverActions.clickJS(videoArticleLnks);
			}
			}
			catch (Throwable e) {
				throw new SkipException("Unable to locate Video Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
			}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstLiveBlogArticle()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(liveBlogArticleLnks, 20);
			webDriverActions.softWaitForElementVisibility(liveBlogArticleLnks, 10);
			webDriverActions.clickJS(liveBlogArticleLnks);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softWaitForElementVisibility(liveBlogArticleLnks, 10);
				webDriverActions.clickJS(liveBlogArticleLnks);
			}
			}
			catch (Throwable e) {
				throw new SkipException("Unable to locate Video Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
			}
	}

	//============================Danish-Business_logic=======================================

	/**
	 * This method is used to verify Astrology TrendingNews Title
	 * @param serverType
	 */
	public void verifyTrendingNewsAstrologyTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle,astrologyArticleEle);
	}
	/**
	 * This method is used to verify Astrology TrendingNews Articles
	 * @param serverType
	 */
	public void verifyTrendingNewsAstrologyArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles,astrologyArticleEle);
	}

	/**
	 * This method is used to verify Astrology TrendingNews Read more
	 * @param serverType
	 */
	public void verifyTrendingNewsAstrologyReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore,astrologyArticleEle);
	}

	/**
	 * This method is used to verify Astrology More News Articles
	 * @param serverType
	 */
	public void verifyMoreNewsAstrologyArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles,astrologyArticleEle);
	}

	/**
	 * This method is used to verify Astrology PhotoGallery Title
	 * @param serverType
	 */
	public void verifyPhotoGalleryAstrologyTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle,astrologyArticleEle);
	}
	/**
	 * This method is used to verify Astrology PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyPhotoGalleryAstrologyArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles,astrologyArticleEle);
	}

	/**
	 * This method is used to verify  TrendingNews Title
	 * @param serverType
	 */
	public void verifyTrendingNewsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle,homepageArticleLnk);
	}
	/**
	 * This method is used to verify  TrendingNews Articles
	 * @param serverType
	 */
	public void verifyTrendingNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles,homepageArticleLnk);
	}

	/**
	 * This method is used to verify  TrendingNews Read more
	 * @param serverType
	 */
	public void verifyTrendingNewsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore,homepageArticleLnk);
	}

	/**
	 * This method is used to verify  More News Articles
	 * @param serverType
	 */
	public void verifyMoreNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles,homepageArticleLnk);
	}

	/**
	 * This method is used to verify  PhotoGallery Title
	 * @param serverType
	 */
	public void verifyPhotoGalleryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle,homepageArticleLnk);
	}
	/**
	 * This method is used to verify  PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyPhotoGalleryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles,homepageArticleLnk);
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
		webDriverActions.softWaitForAllElementsVisible(categoryPageLinks, 5);
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
				webDriverActions.softScrollToElement(title);
				webDriverActions.softWaitForElementVisibility(title, 15); 
				webDriverActions.softHighlightElement(title);
				webDriverActions.softMouseHover(title);
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
		}
		softAssert.assertAll(" Issues found in money category section Title ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForAllElementsVisible(categoryPageLinks, 5);
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
					webDriverActions.waitForAllElementsVisible(articlesLinks, 15);
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(categoryPage);
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
		String moneyPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForAllElementsVisible(categoryPageLinks, 5);
		Assert.assertTrue(categoryPageLinks.size()>0,"Possibly no articles present or size is "+categoryPageLinks.size() +" In this Url "+moneyPage);
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
				webDriverActions.waitForElementVisibility(morelink, 15);
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
		}
		softAssert.assertAll("Issues found in money category section Read more ");
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
	 * @author VipinKumarGawande
	 * This method is used to verify the header text and LAST UPDATED Time from Article consumption page.
	 * @param serverType
	 */
	public void verifyArticleTitleAndLastUpdatedTimeValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(descriptionTxt));
			if(webDriverActions.softIsElementDisplayed(readMoreLnk))
			{
				String beforeClick = webDriverActions.getTextFromElement(descriptionTxt);
				Logs.info(getClass(), beforeClick);
				webDriverActions.softHighlightElement(readMoreLnk);
				webDriverActions.softClickJS(readMoreLnk);
				webDriverActions.waitForSecond(500);
				String afterClick = webDriverActions.getTextFromElement(descriptionTxt);
				Logs.info(getClass(), afterClick);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
	 * @param articleSocialMedia
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);

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
				softAssert.assertTrue(actualShare.contains("whatsapp") || actualShare.contains("facebook") || actualShare.contains("telegram") || actualShare.contains("twitter") || actualShare.contains("google") , "Possibly Social Share Links is Not Navigating to Same Page "+currentPageUrl);
			}
		}
		softAssert.assertAll("Issue Found in Article Body ");
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			webDriverActions.softMouseHover(articleLst.get(i));
		}
		softAssert.assertAll("Issue Found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param tagsLnk
	 * @param relatedNews
	 * @author VipinKumarGawande
	 *  This method is used to Validate the LHS Related News In Article Consumption Page
	 */
	public void verifyArticleRelatedNewsNavigation(String serverType , List<WebElement> articleLst , List<WebElement> tagsLnk , List<WebElement> relatedNews)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		for(int i=0; i<articleLst.size(); i++) {
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
			if(tagsLnk.size()>0)
			{
				//			webDriverActions.softMouseHover(tagsLnk, 5);
				Logs.info(getClass(), "TAGSLINK "+tagsLnk.size());
				softAssert.assertTrue(relatedNews.size()>0, "Possibly LHS Related News is Not Visible in "+expectedUrl);
				Logs.info(getClass(), "RELATEDNEWS "+relatedNews.size());
				for(int j=0;j<relatedNews.size() ; j++) {
					webDriverActions.softMouseHover(relatedNews.get(j));
					webDriverActions.softScrollToElement(relatedNews.get(j));
					webDriverActions.softHighlightElement(relatedNews.get(j));
					String actualRelatedNewsUrl = webDriverActions.getAttribute("href", relatedNews.get(j));
					webDriverActions.softClickJS(relatedNews.get(j));
					String currentRelatedNewsUrl = webDriverActions.getCurrentPageUrl();
					String expectedRelatedNewsUrl = webDriverActions.getCurrentPageUrl();
					if(serverType.equalsIgnoreCase("preProd") && !currentRelatedNewsUrl.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentRelatedNewsUrl);
						webDriverActions.navigateToUrl(betaUrl);
						currentRelatedNewsUrl = betaUrl;
					}
					webDriverActions.waitForPageToLoad();
					int relatedResponse = genericUtility.checkLinks(currentRelatedNewsUrl);
					softAssert.assertTrue(relatedResponse==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+relatedResponse);
					softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualRelatedNewsUrl);
					if (currentRelatedNewsUrl.contains(expectedRelatedNewsUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
				}
			}
			else
			{
				Logs.info(getClass(), "No TAGS FOUND");
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
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param highlight
	 * @author VipinKumarGawande
	 * This method is used to Validate the Highlight Section in Article Consumption Page
	 */
	public void verifyArticleHighlightValidation(String serverType , List<WebElement> articleLst , WebElement highlight  )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			if(webDriverActions.softIsElementDisplayed(highlight)) {
				webDriverActions.softMouseHover(highlight);
				webDriverActions.softHighlightElement(highlight);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(highlight) , "Possibly Highlight Section is Not Visible in "+currentPageUrl);
			}
			else
			{
				Logs.error(getClass(), "NO HIGHLIGHT WIDGET IN "+expectedUrl);
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
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param description
	 * @param headerLnk
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Description and Article Header Link in Article Consumption Page
	 */
	public void verifyArticleDescriptionHeaderLinkNavigation(String serverType , List<WebElement> articleLst , List<WebElement> description , List<WebElement> headerLnk  )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			if(webDriverActions.softIsElementDisplayed(articleFooterReadMoreLnk))
			{
				webDriverActions.softMouseHover(articleFooterReadMoreLnk);
				webDriverActions.softHighlightElement(articleFooterReadMoreLnk);
				webDriverActions.softClickJS(articleFooterReadMoreLnk);
				webDriverActions.waitForPageToLoad();
			}
			softAssert.assertTrue(description.size()>0, "Possibly Article Detailed Description Is Not Visible in "+currentPageUrl);
			for(int j=0;j<description.size();j++)
			{
				webDriverActions.softMouseHover(description.get(j));
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
			}
			if(headerLnk.size()>0) {
				String articlePageTitle = webDriverActions.getPageTitle();
				for(int k=0;k<headerLnk.size();k++)
				{
					webDriverActions.softMouseHover(headerLnk.get(k));
					webDriverActions.softHighlightElement(headerLnk.get(k));
					String actualHeaderUrl = webDriverActions.getAttribute("href", headerLnk.get(k));
					String target = webDriverActions.getAttribute("target", headerLnk.get(k));
					if(target.contains("blank"))
					{
						webDriverActions.softClickJS(headerLnk.get(k));
						webDriverActions.switchToNewWindow();
						webDriverActions.waitForPageToLoad();
						String currentHeaderUrl = webDriverActions.getCurrentPageUrl();
						String expectedHeaderUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("hindiRevamp") && !currentHeaderUrl.contains("//beta") && currentHeaderUrl.contains("news18")) {
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
					webDriverActions.softMouseHover(headerLnk.get(k));
						webDriverActions.softClickJS(headerLnk.get(k));
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
				Logs.error(getClass(), "NO ARTICLE HEADER PRESENT ");
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
				webDriverActions.softClickJS(articleLst.get(i));
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
	 * This method is used to verify whether the social media icons present in footer are able to navigate.
	 * @param serverType
	 * @param articleLst
	 * @param articleSocialMedia
	 */
	public void verifyFooterArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,WebElement footerReadMoreLnk , List< WebElement> articleSocialMedia) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);

		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			webDriverActions.continuousScrollTillElement(footerReadMoreLnk, 3);
			if(webDriverActions.softIsElementDisplayed(footerReadMoreLnk))
			{
				webDriverActions.softMouseHover(footerReadMoreLnk);
				webDriverActions.softClickJS(footerReadMoreLnk);
			}
			softAssert.assertTrue(articleSocialMedia.size()>0, "Possibly Social Share Icon is not visible in"+currentPageUrl);
			for(int j=0; j< articleSocialMedia.size(); j++) {
				webDriverActions.softScrollToElement(articleSocialMedia.get(j));
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentShare);
				softAssert.assertTrue(socialResponse==200|socialResponse==429, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				//					softAssert.assertTrue(genericUtility.compareUrlSub(actualShare, currentShare), "Possibly not navigate to same page "+actualShare);
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

	public void verifyCommonArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCommonArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCommonArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt, articleLocationTxt, articleFeaturedImgTxt);
	}

	public void verifyCommonArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk);
	}

	public void verifyCommonArticleSocialMediaShareNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialShareLnk);
	}

	public void verifyCommonArticleFooterSocialMediaIconNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType,commonArticleLnks,articleFooterReadMoreLnk,articleFooterSocialIconLnk);
	}

	public void verifyCommonArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCommonArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyCommonArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyCommonArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyCommonArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCommonArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//--------------------------- Astrology Business Logic ----------------------------//

	public void verifyAstrologyArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, astrologyArticleEle, articleBreadcrumbLnk);
	}

	public void verifyAstrologyArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, astrologyArticleEle, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyAstrologyArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, astrologyArticleEle, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt, articleLocationTxt, articleFeaturedImgTxt);
	}

	public void verifyAstrologyArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, astrologyArticleEle, articleAuthorLnk);
	}

	public void verifyAstrologyArticleSocialMediaShareNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, astrologyArticleEle, articleSocialShareLnk);
	}

	public void verifyAstrologyArticleFooterSocialMediaIconNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType,astrologyArticleEle,articleFooterReadMoreLnk,articleFooterSocialIconLnk);
	}

	public void verifyAstrologyArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, astrologyArticleEle,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyAstrologyArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, astrologyArticleEle, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyAstrologyArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, astrologyArticleEle, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyAstrologyArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, astrologyArticleEle, articleHighlightDiv);
	}

	public void verifyAstrologyArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, astrologyArticleEle, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyAstrologyArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, astrologyArticleEle , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	
	//--------------------------- Homepage Business Logic ----------------------------//
	
	public void verifyHomepageArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, homepageArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyHomepageArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, homepageArticleLnk, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyHomepageArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, homepageArticleLnk, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt, articleLocationTxt, articleFeaturedImgTxt);
	}

	public void verifyHomepageArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, homepageArticleLnk, articleAuthorLnk);
	}

	public void verifyHomepageArticleSocialMediaShareNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, homepageArticleLnk, articleSocialShareLnk);
	}

	public void verifyHomepageArticleFooterSocialMediaIconNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType,homepageArticleLnk,articleFooterReadMoreLnk,articleFooterSocialIconLnk);
	}

	public void verifyHomepageArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, homepageArticleLnk,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyHomepageArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, homepageArticleLnk, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyHomepageArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, homepageArticleLnk, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyHomepageArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, homepageArticleLnk, articleHighlightDiv);
	}

	public void verifyHomepageArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, homepageArticleLnk, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyHomepageArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, homepageArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}
	
	//--------------------------- Cricket Business Logic ----------------------------//

	public void verifyCricketArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyCricketArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cricketArticleLnk, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCricketArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, cricketArticleLnk, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt, articleLocationTxt, articleFeaturedImgTxt);
	}

	public void verifyCricketArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, cricketArticleLnk, articleAuthorLnk);
	}

	public void verifyCricketArticleSocialMediaShareNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketArticleLnk, articleSocialShareLnk);
	}

	public void verifyCricketArticleFooterSocialMediaIconNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType,cricketArticleLnk,articleFooterReadMoreLnk,articleFooterSocialIconLnk);
	}

	public void verifyCricketArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, cricketArticleLnk,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCricketArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, cricketArticleLnk, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyCricketArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, cricketArticleLnk, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyCricketArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, cricketArticleLnk, articleHighlightDiv);
	}

	public void verifyCricketArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, cricketArticleLnk, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCricketArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}


	//--------------------Anupam Business logic------------------------------------

	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Widgets in english Page.
	 * @param serverType
	 * @param articleLst
	 * @param breadcrumb
	 */
	public void verifyTagsNavigation(String serverType , List<WebElement> articleLst, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible in "+sectionPage);
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
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPageUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, currentPageUrl), "Possibly not navigate to same page "+actualUrl);
			if (response==200)
			{
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 2))
					webDriverActions.softClickJS(readMoreBox);

				webDriverActions.continuousScrollTillElement(tagsDiv, 2);
				if(webDriverActions.softIsElementDisplayed(tagsMoreLnk, 2))
					webDriverActions.softClickJS(tagsMoreLnk);
				webDriverActions.waitForSecond(1000);
				//				webDriverActions.continuousScrollTillAllElement(tagsValue, 10);
				//				softAssert.assertTrue(tagsValue.size()>0, "Possibly Tags is Not Visible"+"\t"+currentPageUrl);

				if(webDriverActions.softIsElementDisplayed(tagsDiv, 2)) {
					for(int j=0; j<tagsLnks.size(); j++) {
						webDriverActions.softScrollToElement(tagsLnks.get(j));
						webDriverActions.softMouseHover(tagsLnks.get(j));
						webDriverActions.softHighlightElement(tagsLnks.get(j));
						String actualTagUrl = webDriverActions.getAttribute("href", tagsLnks.get(j));
						webDriverActions.softClickJS(tagsLnks.get(j));
						//						webDriverActions.waitForSecond(500);
						String currentPageTagUrl = webDriverActions.getCurrentPageUrl();
						String expectedTagUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preProd") && !currentPageTagUrl.contains("//beta")) {
							String betaUrl = genericUtility.replaceInUrl(currentPageTagUrl);
							webDriverActions.navigateToUrl(betaUrl);
							currentPageTagUrl = betaUrl;
						}

						int tagPageResponse = genericUtility.checkLinks(currentPageTagUrl);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualTagUrl, currentPageTagUrl), "Possibly Navigating to Different Page "+actualTagUrl);
						softAssert.assertTrue(tagPageResponse==200, "Possibly Url is Invalid "+currentPageTagUrl + " Response Code "+tagPageResponse+ " Its Parent Url :  "+currentPageUrl);
//						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb,1) , "Possibly element is Not Visible "+breadcrumb+"\t"+currentPageTagUrl +"\t"+(j+1));
						if (currentPageTagUrl.contains(expectedTagUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}
						if(webDriverActions.softIsElementDisplayed(readMoreBox, 1))
							webDriverActions.softClickJS(readMoreBox);

						if(webDriverActions.softIsElementDisplayed(tagsMoreLnk, 1))
							webDriverActions.softClickJS(tagsMoreLnk);
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


	public void verifyMoviesTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleFirstPublishedAndLastUpdatedNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible in "+sectionPage);
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 2))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(tagsDiv, 2);

				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(firstpublishedDiv, 2) , "Possibly firstpublished is Not Visible "+currentPageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lastUpdatedDiv, 2) , "Possibly Last updated is Not Visible in bottom "+currentPageUrl);

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

	public void verifyMoviesArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleAboutTheAuthorNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible in "+sectionPage);
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorBox,10) , "Possibly About author section is not present "+"\t"+currentPageUrl);
				if(webDriverActions.softIsElementDisplayed(authorBox, 1)) {
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorBoxMoreLnk,10) , "Possibly Read more link is not present in About Author section "+"\t"+currentPageUrl);

					if(webDriverActions.softIsElementDisplayed(authorBoxMoreLnk, 3)) {
						String actualMoreUrl = webDriverActions.getAttribute("href", authorBoxMoreLnk);

						webDriverActions.softClickJS(authorBoxMoreLnk);

						String currentPageMoreUrl = webDriverActions.getCurrentPageUrl();
						String expectedMoreUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preProd") && !currentPageMoreUrl.contains("//beta")) {
							String betaMoreUrl = genericUtility.replaceInUrl(currentPageMoreUrl);
							webDriverActions.navigateToUrl(betaMoreUrl);
							currentPageMoreUrl = betaMoreUrl;
						}
						webDriverActions.waitForPageToLoad();
						int responseMore = genericUtility.checkLinks(currentPageMoreUrl);
						softAssert.assertTrue(responseMore==200, "Possibly Url is Invalid "+currentPageMoreUrl+" And Status Code is "+responseMore);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualMoreUrl, currentPageMoreUrl), "Possibly not navigate to same page "+actualMoreUrl);

						if (currentPageMoreUrl.contains(expectedMoreUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}
					}
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


	public void verifyMoviesArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Astrology
	public void verifyAstrologyTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, astrologyArticleEle,tagBreadcrumb);
	}
	public void verifyAstrologyArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, astrologyArticleEle);
	}
	public void verifyAstrologyArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, astrologyArticleEle);
	}

	//Auto
	public void verifyAutoTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyAutoArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Business
	public void verifyBusinessTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyBusinessArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyBusinessArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Buzz
	public void verifyBuzzTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyBuzzArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyBuzzArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Cricket
	public void verifyCricketTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, cricketArticleEle,tagBreadcrumb);
	}
	public void verifyCricketArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, cricketArticleEle);
	}
	public void verifyCricketArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, cricketArticleEle);
	}

	//Education
	public void verifyEducationTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyEducationArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyEducationArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Explainers
	public void verifyExplainersTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyExplainersArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyExplainersArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//India
	public void verifyIndiaTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyIndiaArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyIndiaArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Latest
	public void verifyLatestTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyLatestArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyLatestArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//LifeStyle
	public void verifyLifeStyleTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyLifeStyleArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyLifeStyleArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Opinion
	public void verifyOpinionTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyOpinionArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyOpinionArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Politics
	public void verifyPoliticsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyPoliticsArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyPoliticsArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Showsha
	public void verifyShowshaTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyShowshaArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyShowshaArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Sports
	public void verifySportsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifySportsArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifySportsArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//Tech
	public void verifyTechTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyTechArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyTechArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}

	//World
	public void verifyWorldTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleEle,tagBreadcrumb);
	}
	public void verifyWorldArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleEle);
	}
	public void verifyWorldArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleEle);
	}


}
