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

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;


/**
 * @author Sanjeeb
 * This class contains WebElements and Business logic of Desktop Article Consumption page
 */

public class DesktopArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();
	public WebDriver driver;

	public DesktopArticleConsumptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Link of all main articles except live and CricketNext in home page*/
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]/ul/li/a[not(contains(@href,'live')) and not(contains(@href,'cricketnext'))]")
	private List<WebElement> articleLst;

	/*breadcrumb link*/
	@FindBy(xpath = "//div[(contains(@class,'bredcrum'))]//a")
	private List<WebElement> breadcrumbLnk;

	/*article main featured image*/
	@FindBy(xpath = "//div[contains(@class,'article_bimg')]//img")
	private List<WebElement> featuredImg;

	/*Link of Tags mentioned below of main article */
	@FindBy(xpath = "//div[@class='tags_box']//li/a[contains(@href,'news18')]")
	private List<WebElement> TagsLnk;

	/*Google ads displayed in page*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe_/1039154/') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__')) and not(contains(@id,'AS_ROS_NAT1'))]/iframe")
	private List<WebElement> googleAdds;

	/*List of recommended stories mentioned in more news section*/
	@FindBy(xpath = "//div[contains(@class,'recomeded_story')]//li")
	private List<WebElement> recommendStories;

	/*List of links mentioned in photo gallery section in RHS*/
	@FindBy(xpath = "//div[@data-url]//ul[contains(@class,'photo_listing')]//li/a")
	private List<WebElement> photoglryLst;

	/*List of meta tags in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'meta')]")
	private List<WebElement> metaTagTitle;

	/*List of keywords in browser source code page*/
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keyWordsLst;

	/*Description in browser source code page*/
	@FindBy(xpath = "(//span[text()='description']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement dscrptnTxt;

	/*Og image in browser source code page*/
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> ogImgTxt;

	/*AmpHtml in browser source code page*/
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlTxt;

	/*titleText in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'<title ')]/parent::td")
	private List<WebElement> titleTxt;

	/*LiveTV in RHS*/
	@FindBy(xpath = "//div[contains(@class,'news18-special vwall')]//h2[contains(@class,'title')]")
	private WebElement liveTV;

	/*LiveTv player container in RHS*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTVPlyr ;

	/*Author name in main article*/
	@FindBy(xpath = "//div[@class='text']/a")
	private WebElement authorName;

	/*List of Related news displayed in page*/
	@FindBy(xpath = "(//div[@class='article_related_story']//li)/a")
	private List<WebElement> relatedNews;

	/*Footer section in article consumption page*/
	@FindBy(xpath = "//section[@class='bottom_footer']")
	private WebElement footerSection;

	/*Header section in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'headerContainer')]")
	private WebElement headerSection;

	/*First Published date displayed in below of tags*/
	@FindBy(xpath = "(//div[contains(@class,'published_date')])[1]")
	private WebElement firstPubDate;

	/*HeaderInner section in Header part*/
	@FindBy(xpath = "//div[contains(@class,'jsx-515945483 headerInner')]")
	private WebElement headerInner;

	/*Logo in header section*/
	@FindBy(xpath = "(//div//img[@alt='News18 Logo'])[1]")
	private WebElement nw18Logo;

	/*Main header part in header section*/
	@FindBy(xpath = "//header[contains(@class,'mainHeader')]")
	private WebElement mainHeader;

	/*Headline of desktop article mentioned in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'article-box')]//h1")
	private WebElement deskHeadlne;

	/*Outbrain in promoted content*/
	@FindBy(xpath = "//div[text()='PROMOTED CONTENT']")
	private WebElement outbrainTxt;

	/*list of all outbrain*/
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainBx;

	/*Outbrain list in RHS side*/
	@FindBy(xpath = "//div[@id='right']//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainRHSLst;

	/*Og image width mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='og:image:width']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement ogImgWidth;

	/*Og image height mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='og:image:height']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement ogImgHeight;

	/*Photo gallery text mentioned in RHS*/
	@FindBy(xpath = "//div[contains(@class,'photogellary_widget')]/h2/span[contains(text(),'Photogallery')]")
	private List<WebElement> PhotoglryTxt;

	/*Article title text*/
	@FindBy(xpath = "//*[contains(@class,'article_heading')]")
	private List<WebElement> artTitle;

	/*Article content explanation*/
	@FindBy(xpath = "//div[contains(@class,'article_bnow_box')]/h2[contains(@class,'jsx')]")
	private List<WebElement> artExpln;

	/*Robot tag mentioned in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'robots')]/following-sibling::span[contains(text(),'max-image-preview:large')]")
	private WebElement robotTag;

	/*Follow No-follow href links mentioned above tags*/
	@FindBy(xpath = "//article[contains(@class,'article-content-box first_big_character')]/div/p/a[contains(@href,'http')  and not (contains(@id,'__NEXT_DATA__'))]")
	private List<WebElement> hrefLnks;

	/*List of FB share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'facebook')]")
	private List<WebElement> fbShareIcn;

	/*List of getPocket share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'getpocket')]")
	private List<WebElement> getpocketShareIcn;

	/*List of twitter share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'twitter')]")
	private List<WebElement> twitterShareIcn;

	/*List of twitter share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'whatsapp')]")
	private List<WebElement> watsappShareIcn;

	/*Twitter content mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='twitter:image']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement twitterContent;

	/* List of Promoted Content Ads in RHS of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]/div//ul/li/a/span[contains(@class,'text')]")
	private List<WebElement> promotedContentRHSLnk;

	/* List of Promoted Content Ads in body of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]//div[contains(@class,'items-container')]/div/a/section")
	private List<WebElement> promotedContentBodyLnk;

	/*Outbrain Logo Links in body of PhotoGallery Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'grid-layout')]/div/div/a/span[contains(@class,'logo')]" )
	private WebElement outbrainLogoLnkBody;

	/*Outbrain Logo Links in RHS of PhotoGallery Consumption Page*/
	@FindBy(xpath ="(//div[contains(@class,'ob_what')])[2]/a/span" )
	private WebElement outbrainLogoLnkRHS;

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and not (contains(@href,'/videos/'))]")
	private List<WebElement> latestArtcleLst;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "//div[contains(@class,'published_date')]")
	private WebElement firstPublishedDate;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="(//div[contains(@class,'articleshare-new')])/a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'articleshare-new')])[2]")
	private WebElement allShareIcons;

	// --------------------------------Vipin's Webelement --------------------------------------//


	//---------------Cricket Category-----------//

	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> cricketArticleLnk;

	/* Common Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))  and not(contains(@href,'cricket'))]")
	private List<WebElement> commonArticleLnks;

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'content')]//a[contains(@href,'photogallery')]")
	private List<WebElement> commonPhotogalleryArticleLnks;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bredcrum')]/a")
	private List<WebElement> articleBreadcrumbLnk;

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

	/*Article Footer Read More Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'more_content')]/div")
	private WebElement articleFooterReadMoreLnk;

	/*Article Detailed Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-box story_body')]/article//p")
	private List<WebElement> articleDetailedDescriptionTxt;

	/*Article Detailed Description Header Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-box story_body')]/article//p//a[contains(@href,'news18')]")
	private List<WebElement> articleDetailedHighlightLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-box')]/h1")
	private WebElement articleHeaderTxt;

	/*Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details_list')]/div[contains(@class,'article_headline')]/p[contains(.,'Last')]")
	private WebElement articleLastUpdatedTxt;

	/*Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details_list')]/div[contains(@class,'article_headline')]/p[contains(.,'Last')]/span")
	private WebElement articleLastUpdatedTimeTxt;

	/*Article Post By Name in Article Description in */
	@FindBy(xpath = "//div[contains(@class,'article_details_list')]/div[contains(@class,'article_headline')]/p/span[contains(@class,'postby')]/a")
	private WebElement articleAuthorLnk;

	/*Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details_list')]/div[contains(@class,'article_headline')]/p/span[contains(@class,'bnowSpan')]/a")
	private WebElement articleAgencyLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h2")
	private WebElement news18AgencyTxt;

	/*Read More Description link in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//h2/span[contains(@class,'readmoreintro')]")
	private WebElement articleDescriptionReadMoreLnk;

	/*Article Description Text in Article Detailed Description Division in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article_bnow_box')]/h2")
	private WebElement articleDescriptionTxt; 

	/*Article Social Share Icon Links in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'articleshare')]/a")
	private List<WebElement> articleSocialShareLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'landing-header')]")
	private WebElement whatsAppHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//h2[contains(@id,'homelink')]")
	private WebElement facebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'tgme_head')]")
	private WebElement telegramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_aarf')]//span/img")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@data-testid,'Login_Sheet')]")
	private WebElement twitterHeader;

	/*Article Google News Links in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_bnow_box')]/ul//a[contains(@href,'google')]")
	private WebElement articleGoogleNewsLnk;

	/*News18 Google Header */
	@FindBy(xpath = "//div/h2[contains(.,'News18')]")
	private WebElement googleNews18Logo;

	/*Article Tags Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'tags')]//a")
	private List<WebElement> articleTagsLnk;

	/*Article Related News Links in LHS Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'related')]/ul/li/a")
	private List<WebElement> articleRelatedNewsLnk;

	/*Article Highlight Section Division in Article Consumption page*/
	@FindBy(xpath = "//div[contains(@class,'artclhglght')]")
	private WebElement articleHighlightDiv;

	/*Article Contents Location in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_details_list')]/div[contains(@class,'article_headline')]/p/span[contains(@id,'location')]")
	private WebElement articleLocationTxt;

	/*Article Contents Featured_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'article_bimg')]//img/parent::figure/following-sibling::p")
	private WebElement articleFeaturedImgTxt;

	/* Tredning News Close Button Image */
	@FindBy(xpath = "//div[contains(@class,'close')]//img")
	private WebElement trendingNewsCloseBtn;
	
	/* Top Photogallery Article Story Social Share Icon Link in Photo Article Page */
	@FindBy(xpath = "//div[contains(@class,'photo_gallery_top')]/div[contains(@class,'share')]/div[contains(@class,'artcl-shr')]/a")
	private List<WebElement> topPhotoGallerySocialShareLnk;
	
	/* Photogallery Article Image Widget Social Share Icon Links in Photo Article Page  */
	@FindBy(xpath = "(//div[contains(@id,'photo')])[1]//div[contains(@class,'pht-artcl-shr2')]/a")
	private List<WebElement> photoImageSocialShareLnk;
	
	
	
	//---------------------Anupam's Webelement ------------------------------------

	/* read more present in article page*/
	@FindBy(xpath ="//div[contains(@class,'more_content') and not (contains(@id,'gotobody'))]")
	private WebElement readMoreBox;

	/*Tags division present below of the page*/
	@FindBy(xpath = "//div[contains(@class,'tags_box')]")
	private WebElement tagsDiv;

	/* tags breadcrumb present in Tags page*/
	@FindBy(xpath ="//div[contains(@class,'Topic_brade_crum')]")
	private WebElement tagBreadcrumb;

	/*Tags links present in tag division present below of the page*/
	@FindBy(xpath = "//div[contains(@class,'tags_box')]//li/a")
	private List<WebElement> tagsLnks;

	/* first published present in  bottom article page*/
	@FindBy(xpath ="//div[contains(@class,'published_date')]")
	private WebElement firstpublishedDiv;

	/* last updated present in  bottom article page*/
	@FindBy(xpath ="//div[contains(@class,'updated_date')]")
	private WebElement lastUpdatedDiv;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'rhs_latest_news')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))] | //div[contains(@class,'TeamRanking')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsTopAds;

	/* author Box present in article page*/
	@FindBy(xpath ="//div[contains(@class,'author_box')]")
	private WebElement authorBox;

	/* author Box read more link present in article page*/
	@FindBy(xpath ="//div[contains(@class,'author_box')]//a[contains(@class,'read_more')]")
	private WebElement authorBoxMoreLnk;



	public List<WebElement> getLatestArtcleLst() {
		return latestArtcleLst;
	}

	public WebElement getFirstPublishedDate() {
		return firstPublishedDate;
	}

	public List<WebElement> getSocialShareIconsLnk() {
		return socialShareIconsLnk;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	//======================Danish==Webelements=================

	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/')) and not (contains(@href,'live-news-updates'))]")
	private List<WebElement> commonsCategoryArticleLnk;

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

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]/a")
	private WebElement photogalleryTitle; 

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]//following-sibling::ul//li//img//parent::a")
	private List<WebElement> photogalleryArticles;

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
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsMoreNewsDownAd;



	//======================== Common Element to click on First Article in L1 and L2 Sections========================
	/*common Element*/
	@FindBy(xpath = "(//div[contains(@class,'top_story')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/')) and not (contains(@href,'live-news-updates'))])[1]")
	private WebElement commonEle;
	
	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'live')]")
	private WebElement commonLiveBlogEle;
	
	/*Photo Article Element*/
	@FindBy(xpath = "(//div[contains(@class,'news_page_left')]//a[not(contains(@href,'/videos/')) and (contains(@href,'/photogallery/')) and not (contains(@href,'live-news-updates'))])[1]")
	private WebElement photoArticleEle;
	
	/*Photo Article Element*/
	@FindBy(xpath = "(//div[contains(@class,'top_story')]//a[(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/')) and not (contains(@href,'live-news-updates'))])[1]")
	private WebElement videoArticleEle;
	
	/*Photo Article Element*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'copy')]/a")
	private WebElement photoSectionFirstArticle;

	//========================= Sanjeeb's Elements =============================================

	/*list of elements present under sticky Sections*/
	@FindBy(xpath="//div[contains(@class,'slick-track')]//a")
	private List<WebElement> stickySectionEleList;

	/*Footer Sticky Sections*/
	@FindBy(xpath="//div[contains(@class,'slick-track')]")
	private WebElement stickySection;


	//======================== Common Business Logics to click on First Article in L1 and L2 Sections========================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(commonEle);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPhotoFirstArticle()
	{
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(photoArticleEle, 10);
		webDriverActions.clickJS(photoArticleEle);
		}
		catch (Throwable e) {
			throw new SkipException("Unable to locate Photo Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
		}
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnVideoFirstArticle()
	{
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(videoArticleEle, 10);
		webDriverActions.clickJS(videoArticleEle);
		}
		catch (Throwable e) {
			throw new SkipException("Unable to locate Photo Gallery article element possibly no Photo Gallery Element Present "+webDriverActions.getCurrentPageUrl());
		}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnFirstLiveBlogArticle()
	{
		try {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(commonLiveBlogEle, 10);
		webDriverActions.clickJS(commonLiveBlogEle);
		}
		catch (Throwable e) {
			throw new SkipException("Possibly no Live Blog Element Present "+webDriverActions.getCurrentPageUrl());
		}
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPhotoSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(photoSectionFirstArticle);
	}


	//============================ Sanjeeb's Business Logics=================================
	public void verifyStickySection()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();	
		webDriverActions.waitForElement(2000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(stickySection,20);
		for(int i=0;i<stickySectionEleList.size();i++)
		{
			webDriverActions.softHighlightElement(stickySectionEleList.get(i));
			webDriverActions.softMouseHover(stickySectionEleList.get(i));
			String pageUrl = webDriverActions.getAttribute("href",stickySectionEleList.get(i));
			String title = webDriverActions.getAttribute("target", stickySectionEleList.get(i));
			webDriverActions.softClickJS(stickySectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), pageUrl);
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.continuousScrollTillElement(stickySection,20);
				webDriverActions.softHighlightElement(stickySectionEleList.get(i));
				webDriverActions.softClickJS(stickySectionEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), pageUrl);
				}
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + "and Status Code is - "+response);
			softAssert.assertTrue(status,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);

			}
			else {
				webDriverActions.navigateToUrl(mainUrl);
			}
			webDriverActions.continuousScrollTillElement(stickySection,20);
		}
		softAssert.assertAll("Destop Sticky Section Validation Failed");
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
		}
		softAssert.assertAll("Issue Found in Article Body ");
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
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issues found in Article Body");
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
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLocation);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLocation) , "Possibly Article Location Text is Not Visible in "+currentPageUrl);
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
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("whatsapp"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));

		//Below list adds webelements of social share icons
		listEle.add(facebookHeader);
		listEle.add(twitterHeader);
		listEle.add(whatsAppHeader);
		listEle.add(telegramHeader);
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
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(socialResponse==200, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				//					softAssert.assertTrue(currentShare.contains(actualShare), "Possibly not navigate to same page "+actualShare);

				// it will iterate the list and validate social media
				for(int k=0;k<articleSocialMedia.size();k++)
				{
					if(currentShare.contains(list.get(k)))
					{
						webDriverActions.softWaitForElementVisibility(listEle.get(k), 2);
						webDriverActions.softHighlightElement(listEle.get(k));
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(k)), "Possibly Element Is Not Visible For This URL "+currentShare);	
					}
				}
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
					if(webDriverActions.softIsElementDisplayed(trendingNewsCloseBtn))
					{
						webDriverActions.softClickJS(trendingNewsCloseBtn);
					}
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
	public void verifyArticleTaboolaNavigation(String serverType , List<WebElement> articleLst, List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImgElement, WebElement taboolaLogo)
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
			webDriverActions.waitForSecond(500);
			webDriverActions.continuousScrollTillElement(taboolaLogo, 7);
			webDriverActions.waitForSecond(4000);
			webDriverActions.softHighlightElement(taboolaLogo);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(taboolaLogo), "Possibly Article Body Taboola Feed Logo is Not Visible in "+currentPageUrl);
			softAssert.assertTrue(taboolaFeedArticle.size()>0, "Possibly Taboola Feeds Is Not Visible in "+currentPageUrl);
			for(int j =0 ; j<taboolaFeedArticle.size() ; j++)
			{
				webDriverActions.softMouseHover(taboolaFeedArticle.get(j));
				webDriverActions.softMouseHover(taboolaFeedImgElement.get(j));
				webDriverActions.softHighlightElement(taboolaFeedArticle.get(j));
				webDriverActions.softHighlightElement(taboolaFeedImgElement.get(j));
				softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedArticle.get(j)) , "Possibly Taboola Feed Article Is not Visible in " +currentPageUrl);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedImgElement.get(j)) , "Possibly Taboola Feed Img Article Is not Visible in " +currentPageUrl);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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

	public void verifyCommonArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCommonArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCommonArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCommonArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCommonArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialShareLnk);
	}

	public void verifyCommonArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, articleBreadcrumbLnk);
	}

	public void verifyCommonArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCommonArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk);
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

	public void verifyCommonArticleDetailedBoxValidation(String serverType)
	{
		verifyArticleDetailedBoxValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt, articleLocationTxt, articleFeaturedImgTxt);
	}

	public void verifyCommonArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	//-------------------Cricket Article Consumption Business Logic ----------------------//

	//----------Cricket English Article Body-------//

	public void verifyCricketArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyCricketArticleReadMoreAndHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, cricketArticleLnk, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCricketArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCricketArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCricketArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketArticleLnk, articleSocialShareLnk);
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

	public void verifyCricketArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, cricketArticleLnk,articleGoogleNewsLnk ,googleNews18Logo);
	}


	//-------Anupam Business Logic-----------------------------
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
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(tagsDiv, 2);
				//				webDriverActions.continuousScrollTillAllElement(tagsValue, 10);
				//				softAssert.assertTrue(tagsValue.size()>0, "Possibly Tags is Not Visible"+"\t"+currentPageUrl);

				if(webDriverActions.softIsElementDisplayed(tagsDiv, 2)) {
					for(int j=0; j<tagsLnks.size(); j++) {
						webDriverActions.softScrollToElement(tagsLnks.get(j));
						webDriverActions.softMouseHover(tagsLnks.get(j));
						webDriverActions.softHighlightElement(tagsLnks.get(j));
						String actualTagUrl = webDriverActions.getAttribute("href", tagsLnks.get(j));
						webDriverActions.softClickJS(tagsLnks.get(j));
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
						if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
							webDriverActions.softClickJS(readMoreBox);
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
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
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
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(tagsDiv, 2);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(firstPublishedDate, 2) , "Possibly firstpublished is Not Visible "+currentPageUrl);
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
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSTopAdsNavigation(String serverType , List<WebElement> articleLst) {
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


	public void verifyMoviesArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
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
		Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible in"+sectionPage);
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorBox,10) , "Possibly About author section is not present "+"\t"+currentPageUrl);
				if(webDriverActions.softIsElementDisplayed(authorBox, 1)) {
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorBoxMoreLnk,10) , "Possibly Read more link is not present in About Author section "+"\t"+currentPageUrl);

					if(webDriverActions.softIsElementDisplayed(authorBoxMoreLnk, 1)) {
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
						softAssert.assertTrue(responseMore==200, "Possibly Url is Invalid "+expectedMoreUrl+" And Status Code is "+responseMore);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualMoreUrl, expectedMoreUrl), "Possibly not navigate to same page "+actualMoreUrl);

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
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//AUTO
	public void verifyAutoTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyAutoArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyAutoArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//BUSINESS
	public void verifyBusinessTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyBusinessArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyBusinessArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyBusinessArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//BUZZ
	public void verifyBuzzTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyBuzzArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyBuzzArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyBuzzArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//CRICKET
	public void verifyCricketTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, cricketArticleLnk,tagBreadcrumb);
	}
	public void verifyCricketArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, cricketArticleLnk);
	}
	public void verifyCricketArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, cricketArticleLnk);
	}
	public void verifyCricketArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, cricketArticleLnk);
	}


	//EDUCATION
	public void verifyEducationTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyEducationArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyEducationArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyEducationArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//EXPLAINERS
	public void verifyExplainersTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyExplainersArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyExplainersArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyExplainersArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//INDIA
	public void verifyIndiaTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyIndiaArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyIndiaArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyIndiaArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//LATEST
	public void verifyLatestTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyLatestArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyLatestArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyLatestArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//LIFESTYLE
	public void verifyLifeStyleTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyLifeStyleArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyLifeStyleArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyLifeStyleArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//OPINION
	public void verifyOpinionTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyOpinionArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyOpinionArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyOpinionArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}


	//POLITICS
	public void verifyPoliticsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyPoliticsArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyPoliticsArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyPoliticsArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//SHOWSHA
	public void verifyShowshaTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyShowshaArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyShowshaArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyShowshaArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//SPORTS
	public void verifySportsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifySportsArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifySportsArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifySportsArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//TECT
	public void verifyTechTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyTechArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyTechArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyTechArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//WORLD
	public void verifyWorldTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonArticleLnks,tagBreadcrumb);
	}
	public void verifyWorldArticleFirstPublishedAndLastUpdatedNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndLastUpdatedNavigation(serverType, commonArticleLnks);
	}
	public void verifyWorldArticleRHSTopAdsNavigation(String serverType)
	{
		verifyArticleRHSTopAdsNavigation(serverType, commonArticleLnks);
	}
	public void verifyWorldArticleAboutTheAuthorNavigation(String serverType)
	{
		verifyArticleAboutTheAuthorNavigation(serverType, commonArticleLnks);
	}

	//********************************Danish**Business**Logic*****************************

	/* Common Categories RHS Trending News Validation Methods */

	public void verifyRhsTrendingNewsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingNewsTitle,commonArticleLnks);
	}

	public void verifyRhsTrendingNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingNewsTitle,trendingNewsArticles,commonArticleLnks);
	}

	public void verifyRhsTrendingNewsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingNewsTitle,trendingNewsReadMore,commonArticleLnks);
	}


	/**
	 * This method is used to verify RHS More News Articles
	 * @param serverType
	 */
	public void verifyRhsMoreNewsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles,commonArticleLnks);
	}

	/**
	 * This method is used to verify RHS PhotoGallery Title
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle,commonArticleLnks);
	}
	/**
	 * This method is used to verify RHS PhotoGallery Articles
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles,commonArticleLnks);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS Big ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSBigAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonArticleLnks,rhsBigAdBlock,rhsBigAd);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS MoreNews down ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSMoreNewsDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonArticleLnks,rhsMoreNewsDownAdBlock,rhsMoreNewsDownAd);
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
		webDriverActions.waitForElement(1000);
		String categoryPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
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
					webDriverActions.softMouseHover(articlesLinks.get(j));
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
					webDriverActions.waitForSecond(2000);
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
			webDriverActions.navigateToUrl(moneyPage);
		}
		softAssert.assertAll("Issues found in money category section Read more ");
	}

	/**
	 * @author DanishR
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsNavigation(String serverType , List<WebElement> articleLst,WebElement adBlock, WebElement ad) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
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
				webDriverActions.softMouseHover(ad);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(ad,10) , " Possibly RHS 2nd or 3rd Ad not visible "+"\t"+currentPageUrl);
			}

		}
		softAssert.assertAll("Issue Found in Article Body");
	}
	
	// ------------------ Photogallery Article Common Methods ---------------------------//
	
	public void verifyCommonPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, articleBreadcrumbLnk);
	}
}
