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
 *  This class contains WebElements and BusinessLogic of Mobile Liveblog Page
 */

public class MobileLiveblogPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility(); 

	public MobileLiveblogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]")
	private WebElement allShareIcons;

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//parent::a")
	private WebElement trendingNewsTitle;

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul//li//a")
	private List<WebElement> trendingNewsArticles;

	/*Trending News Widget Read More Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul/a")
	private WebElement trendingNewsReadMore;

	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'liveStatusIcon')]/ancestor::figure//a  |  //div[contains(@class,'liveBlog')]/parent::a  ")
	private List<WebElement> commonsCategoryArticleLnk;

	//---------------Cricket Category-----------//

	/*Photogallery Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'CN-Topstory')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> cricketLiveblogArticleLnk;

	/*Photogallery Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')] | //div[contains(@class,'top_story')]/following-sibling::ul[contains(@class,'story_listing')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> homepageLiveblogArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bread')]//a")
	private List<WebElement> cricketLiveblogArticleBreadcrumbLnk;

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'content')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> photoSectionArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'breadcum')]//a")
	private List<WebElement> liveblogArticleBreadcrumbLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'agency')]/h2")
	private WebElement news18AgencyTxt;

	/* Common Section Liveblog Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> commonLiveblogArticleLnk;

	/* Common Section Liveblog Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'livenews')]")
	private List<WebElement> astrologyLiveblogArticleLnk;

	/*Liveblog_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'storyHead')]//h1")
	private WebElement liveblogArticleHeaderTxt;

	/*Liveblog_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'LiveNow')]//div[contains(@class,'liveNowBtn')]")
	private WebElement liveblogLiveNowTxt;

	/*Liveblog_Article Excerpt Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'story')]//h2")
	private WebElement liveblogArticleExcerptTxt;

	/*Liveblog_Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'post_wrap')]//div[contains(@class,'post_details')]//p[contains(.,'Updated')]")
	private WebElement liveblogArticleLastUpdatedTxt;

	/*Liveblog_Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'post_wrap')]//div[contains(@class,'post_details')]//p[contains(.,'Updated')]/span")
	private WebElement liveblogArticleLastUpdatedDateTimeTxt;

	/*Liveblog_Article Contents Location_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'post_wrap')]//div[contains(@class,'post_details')]//p/span[contains(@id,'location')]")
	private WebElement liveblogArticleLocationTxt;

	/*Photogallery_Article Contents Caption_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'TstoryImg')]//div//img/ancestor::div//figcaption")
	private WebElement liveblogArticleImageCaptionTxt;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'TopStoryBox')]//div[contains(@class,'post_details')]/p[contains(@class,'post')]/a[contains(@href,'agency')]")
	private WebElement liveblogArticleAgencyLnk;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'TopStoryBox')]//div[contains(@class,'post_details')]//span[contains(@class,'post')]//a[contains(@href,'byline')]")
	private WebElement liveblogArticleAuthorLnk;

	/*Photogallery_Article Image Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'LiveBlog_shortDis')]//p")
	private List<WebElement> liveblogArticleDetailedDescription;

	/* Top Photogallery Article Story Social Share Icon Link in Photo Article Page */
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]/ul/li/a")
	private List<WebElement> liveblogArticleSocialShareLnk;

	/*Live Article Body Key Events in Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'keyEvents')]/ul/li/a")
	private List<WebElement> keyEventsTxt;

	/*Live blog Article Highlight Section Link in Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'feedWrapper')]//li[contains(@id,'tabHighlights')]/a")
	private WebElement liveblogArticleHighlightLnk;

	/*Active Highlight Section in Live Blog Section*/
	@FindBy(xpath = "//div[contains(@id,'feedWrapper')]//li[contains(@id,'tabHighlights') and contains(@class,'active')]")
	private WebElement activeLiveblogHighlightLnk;

	/*Active Live Feed  Section in Live Blog Section*/
	@FindBy(xpath = "//div[contains(@id,'feedWrapper')]//li[contains(@id,'tabActive')]")
	private WebElement activeLiveblogLiveFeedTab;

	/*Live blog Article Live feeds Read More Links in Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'feedWrapper')]//p//a[contains(.,'here')]")
	private List<WebElement> liveFeedsReadMoreLnk;

	/*Article Body ReadMore Link in LiveBlog Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'LiveBlog_shortDis')]//p//a")
	private WebElement liveblogArticleDescriptionReadMoreLnk;

	/*Article Body ReadMore Link in LiveBlog Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'LiveBlog_shortDis')]//p")
	private WebElement liveblogArticleDescripitionTxt;
	
	
	//----------------------Anupam Webelement----------------------------------------
	/* load more present below of liveblog article page*/
	@FindBy(xpath ="//div[contains(@class,'updateBtn')]/a")
	private WebElement loadMoreBtn;

	/* Common Section Liveblog Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'liveStatusIcon')]/ancestor::figure//a  |  //div[contains(@class,'liveBlog')]/parent::a  ")
	private List<WebElement> commonLiveblogLnks;

	/* Live feed division in liveblog page*/
	@FindBy(xpath = "//div[contains(@class,'feedBox_outer')]")
	private List<WebElement> liveFeedDiv;

	/* read more section present in livebllog article page*/
	@FindBy(xpath ="//div[contains(@id,'gotobody')]/div[contains(@class,'readMoreContent')]")
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


	/**
	 * This method is used to verify  TrendingNews Title
	 * @param serverType
	 */
	public void verifyTrendingNewsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle,commonsCategoryArticleLnk);
	}
	/**
	 * This method is used to verify  TrendingNews Articles
	 * @param serverType
	 */
	public void verifyTrendingNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles,commonsCategoryArticleLnk);
	}

	/**
	 * This method is used to verify  TrendingNews Read more
	 * @param serverType
	 */
	public void verifyTrendingNewsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore,commonsCategoryArticleLnk);
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
		if(commonsCategoryArticleLnk.size()==0){
			Logs.error(getClass(), "Possibly liveblog is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly liveblog is Not Visible in Category Page in "+sectionPage);
		}
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
		softAssert.assertAll(" Issues found in liveblog category section Title ");
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
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(commonsCategoryArticleLnk.size()==0){
			Logs.error(getClass(), "Possibly liveblog is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly liveblog is Not Visible in Category Page in "+sectionPage);
		}
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
		softAssert.assertAll("Issues found in liveblog category section Articles ");
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
		String sectionPage = webDriverActions.getCurrentPageUrl();
		if(commonsCategoryArticleLnk.size()==0){
			Logs.error(getClass(), "Possibly liveblog Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly liveblog Article is Not Visible in Category Page in "+sectionPage);
		}
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
		softAssert.assertAll("Issues found in liveblog category section Read more ");
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
							softAssert.assertTrue(headerResponse==200, "Possibly Url is Invalid "+expectedHeaderUrl+" And Status Code is "+headerResponse + " Parent Url "+currentPageUrl);
							softAssert.assertTrue(actualHeaderUrl.contains(currentHeaderUrl), "Possibly not navigate to same page "+actualHeaderUrl +" Parent Url "+currentPageUrl);
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
					String currentShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
					int socialResponse = genericUtility.checkLinks(currentPageUrl);
					softAssert.assertTrue(socialResponse==200 | socialResponse==429, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
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

		public void verifyHomepageLiveblogArticleBreadcrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, homepageLiveblogArticleLnk, liveblogArticleBreadcrumbLnk);
		}

		public void verifyHomepageLiveblogArticleDetailedBoxValidation(String serverType)
		{
			verifyArticleDetailedBoxValidation(serverType, homepageLiveblogArticleLnk, liveblogArticleHeaderTxt,liveblogArticleLastUpdatedTxt,liveblogArticleLastUpdatedDateTimeTxt,liveblogArticleLocationTxt,liveblogArticleImageCaptionTxt, liveblogArticleExcerptTxt,liveblogLiveNowTxt);
		}

		public void verifyHomepageLiveblogArticleAgencyNavigation(String serverType)
		{
			verifyArticleAgencyNavigation(serverType, homepageLiveblogArticleLnk, liveblogArticleAgencyLnk , news18AgencyTxt);
		}

		public void verifyHomepageLiveblogArticleISocialMediaIconNavigation(String serverType) {
			verifyArticleSocialMediaNavigation(serverType, homepageLiveblogArticleLnk, liveblogArticleSocialShareLnk);
		}

		public void verifyHomepageLiveblogArticleKeyEventsValidation(String serverType) 
		{
			verifyLiveblogArticleKeyEventValidation(serverType, homepageLiveblogArticleLnk, keyEventsTxt);
		}

		public void verifyHomepageLiveblogArticleHighlightValidation(String serverType)
		{
			verifyLiveblogArticleHighlightSectionValidation(serverType, homepageLiveblogArticleLnk,activeLiveblogLiveFeedTab ,  liveblogArticleHighlightLnk, activeLiveblogHighlightLnk);
		}

		public void verifyHomepageLiveblogArticleAuthorNavigation(String serverType)
		{
			verifyArticleAuthorNavigation(serverType, homepageLiveblogArticleLnk, liveblogArticleAuthorLnk);
		}

		public void verifyHomepageLiveblogArticleLiveFeedsReadMoreNavigation(String serverType)
		{
			verifyLiveFeedsReadMoreLinkNavigation(serverType, homepageLiveblogArticleLnk, liveFeedsReadMoreLnk);
		}

		public void verifyHomepageLiveblogArticleDescriptionReadMoreValidation(String serverType) {
			verifyArticleReadMoreValidation(serverType, homepageLiveblogArticleLnk,liveblogArticleDescripitionTxt , liveblogArticleDescriptionReadMoreLnk);
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

		public void verifyCommonLiveblogArticleSocialMediaIconNavigation(String serverType) {
			verifyArticleSocialMediaNavigation(serverType, commonLiveblogArticleLnk, liveblogArticleSocialShareLnk);
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

		public void verifyCricketLiveblogArticleSocialMediaIconNavigation(String serverType) {
			verifyArticleSocialMediaNavigation(serverType, cricketLiveblogArticleLnk, liveblogArticleSocialShareLnk);
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
		//----------------------- Astrology Liveblog Business Logic --------------------------------//
		
		public void verifyAstrologyLiveblogArticleBreadcrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, astrologyLiveblogArticleLnk, cricketLiveblogArticleBreadcrumbLnk);
		}
		
		public void verifyAstrologyLiveblogArticleDetailedBoxValidation(String serverType)
		{
			verifyArticleDetailedBoxValidation(serverType, astrologyLiveblogArticleLnk, liveblogArticleHeaderTxt,liveblogArticleLastUpdatedTxt,liveblogArticleLastUpdatedDateTimeTxt,liveblogArticleLocationTxt,liveblogArticleImageCaptionTxt, liveblogArticleExcerptTxt,liveblogLiveNowTxt);
		}
		
		public void verifyAstrologyLiveblogArticleAgencyNavigation(String serverType)
		{
			verifyArticleAgencyNavigation(serverType, astrologyLiveblogArticleLnk, liveblogArticleAgencyLnk , news18AgencyTxt);
		}
		
		public void verifyAstrologyLiveblogArticleSocialMediaIconNavigation(String serverType) {
			verifyArticleSocialMediaNavigation(serverType, astrologyLiveblogArticleLnk, liveblogArticleSocialShareLnk);
		}
		
		public void verifyAstrologyLiveblogArticleKeyEventsValidation(String serverType) 
		{
			verifyLiveblogArticleKeyEventValidation(serverType, astrologyLiveblogArticleLnk, keyEventsTxt);
		}
		
		public void verifyAstrologyLiveblogArticleHighlightValidation(String serverType)
		{
			verifyLiveblogArticleHighlightSectionValidation(serverType, astrologyLiveblogArticleLnk,activeLiveblogLiveFeedTab ,  liveblogArticleHighlightLnk, activeLiveblogHighlightLnk);
		}
		
		public void verifyAstrologyLiveblogArticleAuthorNavigation(String serverType)
		{
			verifyArticleAuthorNavigation(serverType, astrologyLiveblogArticleLnk, liveblogArticleAuthorLnk);
		}
		
		public void verifyAstrologyLiveblogArticleLiveFeedsReadMoreNavigation(String serverType)
		{
			verifyLiveFeedsReadMoreLinkNavigation(serverType, astrologyLiveblogArticleLnk, liveFeedsReadMoreLnk);
		}
		
		public void verifyAstrologyLiveblogArticleDescriptionReadMoreValidation(String serverType) {
			verifyArticleReadMoreValidation(serverType, astrologyLiveblogArticleLnk,liveblogArticleDescripitionTxt , liveblogArticleDescriptionReadMoreLnk);
		}

		
		//===========================Anupam Business Logic===============================
		/**
		 * @author AnupamGupta
		 * This method is used to validate AboutTheAuthor present inside article consumption page for Widgets in Hindi revamp Page.
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
					Logs.error(getClass(), "Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
					throw new SkipException("Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
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
						webDriverActions.continuousScrollTillElement(loadMoreBtn, 1);
						if(webDriverActions.softIsElementDisplayed(loadMoreBtn, 3))
						{
							int beforeClickDiv=liveFeedDiv.size();
							webDriverActions.softClick(loadMoreBtn);
							webDriverActions.scrollDown();
							webDriverActions.waitForSecond(4000);
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
	     * This method is used to validate Read more present at bottom inside LiveBlog article consumption page .
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
				Logs.error(getClass(), "Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
				throw new SkipException("Possibly Liveblog Article is Not Visible in Category Page in "+sectionPage);
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

		
		//Astrology
		public void verifyAstrologyLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyAstrologyLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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


		//BUSINESS
		public void verifyBusinessLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyBusinessLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
		}

		//CRICKET
		public void verifyCricketLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, cricketLiveblogArticleLnk);
		}

		public void verifyCricketLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, cricketLiveblogArticleLnk);
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

		//EXPLAINERS
		public void verifyExplainersLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyExplainersLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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

		//LATEST
		public void verifyLatestLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyLatestLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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

		//OPINION
		public void verifyOpinionLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyOpinionLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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

		//SHOWSHA
		public void verifyShowshaLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyShowshaLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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

		//TECH
		public void verifyTechLiveblogLoadMoreNavigation(String serverType)
		{
			verifyLiveblogLoadMoreNavigation(serverType, commonLiveblogLnks);
		}

		public void verifyTechLiveBlogReadMoreSectionValidation(String serverType)
		{
			verifyLiveBlogReadMoreSectionValidation(serverType, commonLiveblogLnks);
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

}
