package com.news18.lokmatpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author DanishR
 *
 */
public class MobileLokmatLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public MobileLokmatLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//nav[contains(@class,'adclsnav')]//ul[contains(@class,'adclsnavg')]//li//a[contains(@href,'photogallery')]")
	private WebElement photoSectionLnk;

	/*video section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'wapper')]/ul/li/a[contains(@href,'video')]")
	private WebElement videoSectionLnk;

	/*sports section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/sport/')]")
	private WebElement sportsSectionLnk;

	/*Section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[not(contains(@href,'/astrology/')) and not(contains(@href,'/Pune/')) and not(contains(@href,'/netrasuraksha/')) and not(@href='/')]")
	private List<WebElement> sectionLnk;

	/*Section Present in LineOne navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerLnk;

	/*Trending Topic link present in home page*/
	@FindBy(xpath ="//div[contains(@class,'side_bar')]//a[contains(@href,'tag')]")
	private List<WebElement> trendingTopicsfirstLnk;

	//-------------------Anupam*Webelement-------------

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/lifestyle')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement lifestyleBreadcrumb;

	//---------Technology
	/* Technology section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/technology')]")
	private WebElement technologySectionLnk;

	/* Technology section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/technology')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/technology')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> technologySectionArticleLnk;

	/* TechnologyTechnology section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/technology')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> technologySectionImgLnk;

	/* Technology section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/technology')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreTechnologySectionLnk;

	/* Breadcrumb present in Technology article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement technologyBreadcrumb;

	//---------sport
	/* Sport section present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/sport')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage */
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sport')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreSportSectionLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement sportBreadcrumb;


	// ---------------------------------- Vipin's Webelement ----------------------------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd') or contains(@class,'bread') or contains(@class,'brade')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of Marathi News Article in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bigstory')]//h2/a")
	private List<WebElement> marathiNewsArticleLnk;

	/*List of Marathi News Image in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'bigstory')]//h2/a/ancestor::div[contains(@class,'bigstory')]//img")
	private List<WebElement> marathiNewsImgLnk;

	/*List of TopNews Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrendvideo')]/ul/li/a//h3")
	private List<WebElement> topNewsArticleLnk;

	/*List of TopNews Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrendvideo')]/ul/li/a/figure//img[@title]")
	private List<WebElement> topNewsImgLnk;

	/*Top News Read More News Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrendvideo')]/a")
	private WebElement topNewsMoreNewsLnk;

	/*TopNews Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]/div[contains(@class,'newstrendvideo')]/a")
	private WebElement topNewsTitleLnk;

	/*List of News18 Minis Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'imgBox')]//img")
	private List<WebElement> news18MinisImgLnk;

	/* List of News18 Minis Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'content')]//p/a[contains(@href ,'html')]")
	private List<WebElement> news18MinisArticleLnk;

	/*List of News18 Minis Read More link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'read')]/a")
	private List<WebElement> news18MinisReadMoreLnk;

	/*News18 Minis Section A world of news at your fingertips Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'head')]/a")
	private WebElement worldOfNewsLnk;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a//img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a//img")
	private WebElement activeWebstoriesImgLnk;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]//ul[contains(@class,'slick-dots')]/li/button")
	private List<WebElement> webstoriesSliderBtn;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/*List of Entertainment Article in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'entertainment')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> entertainmentArticleLnk;

	/*List of Entertainment Image in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'entertainment')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> entertainmentImgLnk;

	/*Entertainment Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'entertainment')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement entertainmentReadMoreLnk;

	/*Entertainment Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'entertainment')]")
	private WebElement entertainmentTitleLnk;

	/* List of Money Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'money')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> moneyArticleLnk;

	/* List of Money Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'money')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> moneyImgLnk;

	/* Money Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/money')]")
	private WebElement moneyTitleLnk;

	/*Money Widget Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'money')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement moneyReadMoreLnk;

	/* List of Photogallery Article links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'photo-gallery')]/ancestor::div[contains(@class,'superhitgallery')]/div[contains(@id,'clkbuttonpradesh')]/ul/li/a/h3")
	private List<WebElement> photogalleryArticleLnk;

	/*List of Photogallery Images Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'photo-gallery')]/ancestor::div[contains(@class,'superhitgallery')]/div[contains(@id,'clkbuttonpradesh')]/ul/li/a//img")
	private List<WebElement> photogalleryImgLnk;

	/* Photogallery Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'photo-gallery')]")
	private WebElement photogalleryTitleLnk;

	/* Photogallery Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'photo-gallery')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement photogalleryReadMoreLnk;

	/* List of Photogallery Article links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'video')]/ancestor::div[contains(@class,'superhitgallery')]/div[contains(@id,'clkbuttonpradesh')]/ul/li/a/h3")
	private List<WebElement> videosArticleLnk;

	/*List of Photogallery Images Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'video')]/ancestor::div[contains(@class,'superhitgallery')]/div[contains(@id,'clkbuttonpradesh')]/ul/li/a//img")
	private List<WebElement> videosImgLnk;

	/* Photogallery Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/video/')]")
	private WebElement videosTitleLnk;

	/* Photogallery Section Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//a[contains(@href,'video')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement videoReadMoreLnk;

	/*Maharashtra Section City Links*/
	@FindBy(xpath="//ul[contains(@class,'news-home-tab')]/li/a")
	private List<WebElement> maharashtraCitiesLnks;

	/*Maharashtra Section City Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'maharashtra')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> maharashtraCitiesArticleLnks;

	/*Maharashtra Section City Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'maharashtra')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> maharashtraCitiesImgLnks;

	/* Maharashtra Section Title Link in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/maharashtra/')]")
	private WebElement maharashtraTitleLnk;

	/*Gujarat Section City Title Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'maharashtra')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement maharashtraCitiesReadMoreLnk;

	//====================================Sanjeeb's Element=====================================
	/*Header Logo*/
	@FindBy(xpath="//div[contains(@class,'header')]")
	private WebElement headerLogo;

	/*Header Search Button*/
	@FindBy(xpath="//div[contains(@class,'search_icon')]")
	private WebElement headerSearchBtn;

	/*Header Search Button*/
	@FindBy(xpath="//div[contains(@class,'gsc-input-box')]//input")
	private WebElement headerSearchBox;

	/*Header inner Search Button*/
	@FindBy(xpath="//td[contains(@class,'gsc-search-button')]/button")
	private WebElement innerSearchBtn;

	/*cancel Button*/
	@FindBy(xpath="//div[contains(@class,'close-btn')]")
	private WebElement cancelBtn;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')]")
	private WebElement headerBreadcrumbLnk;

	/*header Text Logo*/
	@FindBy(xpath="//div[contains(@class,'header')]")
	private WebElement headerTextLogo;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chs-stct')]")
	private WebElement rajyaSeherChuneLnk;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*icici Header Text*/
	@FindBy(xpath="//div[contains(@class,'restart_right')]/div/img | //div[contains(@class,'breadcum')]")
	private WebElement iciciHeaderTxtLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')]")
	private WebElement electralHydrationText;

	/*Krypto ki khojo Header Text*/
	@FindBy(xpath="(//div[contains(@class,'crypto_wrap')]//div/img)[1]")
	private WebElement kryptoTxtLnk;

	/*netra Suraksha Header Text*/
	@FindBy(xpath="(//div[contains(@class,'launch_info')]//img)[1]")
	private WebElement netraSurkshaTxtLnk;

	/*Line One Section Article Links Present in Mobile Hindi Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> lineOneSectionELementLnk; 

	/*hamburger Menu Link present on homepage Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement hamburgerMenuLnk;

	/*list Of elements present under Hamburger Menu*/
	@FindBy(xpath="//ul[contains(@class,'adclsnavg')]//a")
	private List<WebElement> hamburgerMenuEleList;

	/*hamburger Menu Link present on homepage Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chs-tplng')]//li[not (contains(@class,'act'))]/a")
	private WebElement hamburgerMenuLanguageLnk;

	/*list Of elements present under Hamburger Menu*/
	@FindBy(xpath="//ul[contains(@class,'lng-subnav')]//li/a")
	private List<WebElement> hamburgerMenuLanguageEleList;


	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'navbar-header')] | //div[contains(@class,'logo bxshadow')]")
	private WebElement townHallAndTopLearningIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'logo-main')] ")
	private WebElement firstPostAndCnbcIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//header[contains(@id,'mainHeader')]")
	private WebElement firstPostIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'container')]")
	private WebElement historyAndMTvIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')  or contains(@class,'head_homepage') or contains(@class,'stmimg')]")
	private WebElement moneyControlInstaPlayStoreIcon;

	/*header Text for CompareIndia*/
	@FindBy(xpath ="//div[contains(@class,'hideme')]")
	private WebElement compareIndiaIcon;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_acum')] | //div//img[contains(@alt,'Instagram')] | //div//img[contains(@alt,'Instagram')] | //div[contains(@class,'_ab16')]")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[contains(@class,'header')] ")
	private WebElement youtubeHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@src,'JioNewsAppIcon')]")
	private WebElement jioHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[@role='banner']")
	private WebElement googlePlayHeader;

	/*Header Text Link Present in google app store page*/
	@FindBy(xpath ="//header//a[contains(@href,'store/games')]")
	private WebElement playStoreHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="(//ul[contains(@class,'header')])[1]")
	private WebElement appleHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//a[contains(@aria-label,'Facebook')] | //div[contains(@id,'MChromeHeader')] ")
	private WebElement facebookHeader;

	/*Footer Trending Section */
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerTrendingSection;

	/*Footer Trending Section Element List*/
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerTrendingSectionEleList;

	/*Footer Bivag Section */
	@FindBy(xpath="//span[contains(text(),'विभाग')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerBivagSection;

	/*Footer Bivag Section Element List*/
	@FindBy(xpath="//span[contains(text(),'विभाग')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerBivagSectionEleList;

	/*Footer Social Section */
	@FindBy(xpath="//span[contains(text(),'सोशल मीडिया')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerSocialSection;

	/*Footer Social Section Element List*/
	@FindBy(xpath="//span[contains(text(),'सोशल मीडिया')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerSocialSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//span[contains(text(),'LANGUAGE SITES')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerLangaugeSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//span[contains(text(),'LANGUAGE SITES')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerLanguageSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//span[contains(text(),'NEWS18 GROUP SITES')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerGroupSitesSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//span[contains(text(),'NEWS18 GROUP SITES')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerGroupSitesSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//div[contains(@class,'social_icon')]")
	private WebElement footerLineTwoSocialSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerLineTwoSocialSectionEleList;

	/*Footer Language Section */
	@FindBy(xpath="//div[contains(@class,'ftr_container')]")
	private WebElement footerLineTwoLastLayerSection;

	/*Footer Language Section Element List*/
	@FindBy(xpath="//div[contains(@class,'ftr_container')]//a")
	private List<WebElement> footerLineTwoLastLayerSectionEleList;

	/*Footer Live Tv Section */
	@FindBy(xpath="//div[contains(@class,'live_tv')]//a")
	private WebElement footerLiveTVSection;

	/*Footer Sticky Section Element List*/
	@FindBy(xpath="//ul[contains(@class,'btnvav')]//a")
	private List<WebElement> footerStickySectionEleList;

	/*Footer Sticky Section */
	@FindBy(xpath="//ul[contains(@class,'btnvav')]")
	private WebElement footerStickySection;




	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Lokmat Home Page 
	 */
	public void clickOnFirstArticleLokmatHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First Article of Home Page",e);
		}
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Lokmat Home Page 
	 */
	public void clickOnFirstLiveBlogArticleLokmatHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnk.get(0)))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
		}
	}



	/**
	 * @author Anupam
	 * This method used to click on photos section of Lokmat Homepage
	 */
	public void clickOnPhotoSection(){
		try {
			webDriverActions.click(humburgerLnk);
			webDriverActions.click(photoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link of Home Page",e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on video section
	 */
	public void clickOnVideoSection()
	{
		try {
			webDriverActions.click(videoSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Video Section Link of Home Page",e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on Sports section
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.click(sportsSectionLnk);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Sports section Link of Home Page",e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method used to click on first section
	 */
	public void clickOnFirstSection()
	{
		try {
			webDriverActions.clickJS(sectionLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Section Link of Home Page",e);
		}
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.continuousScrollTillElement(trendingTopicsfirstLnk.get(0), 5);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(trendingTopicsfirstLnk.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in First topic of Trending Topic");
		}
		webDriverActions.switchToNewWindow();
	}


	//--------------------------Anupam*Business Logic------------------

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 12);
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();

			if (serverType.equalsIgnoreCase("preProd")) {
				if(currentPage.contains("//beta")) {
					Logs.info(getClass(), "url already contain beta");
				}
				else {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
					webDriverActions.waitForPageToLoad();
					webDriverActions.waitForSecond(2000);
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			//			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType ,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 20);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				if(currentPage.contains("//beta")) {
					Logs.info(getClass(), "url already contain beta");
				}
				else {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
					webDriverActions.waitForPageToLoad();
					webDriverActions.waitForSecond(2000);
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			//			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " on "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 12);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(genericUtility.compareTwoStrings(currentPage, actualUrl) , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			if(currentPage.contains("//beta")) {
				Logs.info(getClass(), "url already contain beta");
			}
			else {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		//		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();

		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(section);
			webDriverActions.softScrollToElement(section);
			webDriverActions.softClickJS(section);
			webDriverActions.waitForPageToLoad();
		}


		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(genericUtility.compareTwoStrings(currentPage, actualUrl) , "Unable to Navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			if(currentPage.contains("//beta")) {
				Logs.info(getClass(), "url already contain beta");
			}
			else {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
				webDriverActions.waitForPageToLoad();
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		//		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}

	//-----Life

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,lifestyleSectionLnk, lifestyleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,lifestyleSectionLnk,lifestyleSectionArticleLnk, lifestyleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	public void verifyLifeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,lifestyleSectionLnk,lifestyleSectionImgLnk, lifestyleBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreLifeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreLifestyleSectionLnk, lifestyleBreadcrumb);
	}

	//---Technology

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	public void verifyTechnologyWidget(String serverType) {
		verifySectionLnks(serverType,technologySectionLnk, technologyBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Article
	 */
	public void verifyTechnologyWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,technologySectionLnk,technologySectionArticleLnk, technologyBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Image
	 */
	public void verifyTechnologyWidgetImg(String serverType) {
		verifyImgNavigation(serverType,technologySectionLnk,technologySectionImgLnk, technologyBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Technology News
	 */
	public void verifyMoreTechnologyLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreTechnologySectionLnk, technologyBreadcrumb);
	}

	//-----Sport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	public void verifySportWidget(String serverType) {
		verifySectionLnks(serverType,sportSectionLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	public void verifySportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,sportSectionLnk,sportSectionImgLnk, sportBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	public void verifyMoreSportLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreSportSectionLnk, sportBreadcrumb);
	}

	//*****************************Vipin Business Logic********************************

	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(artList, 30);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
			}
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in " +currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @param imgList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Image Navigation  
	 */
	public void verifyImageNavigation(String serverType,List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(imgList, 30);
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softScrollToElement(imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
			}
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expected =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
			if (currentPage.contains(expected)) {
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
	public void verifyMoreNewsNavigation(String serverType,WebElement moreLnk , WebElement element) {
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 30);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actual = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		//				softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(), currentPage);
		webDriverActions.softHighlightElement(element);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * @param element
	 * @param breadcrumb
	 * This method is used to Validate the Title Navigation for All Sections
	 */
	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(element, 10);
		webDriverActions.softScrollToElement(element);
		webDriverActions.softMouseHover(element);
		webDriverActions.softClickJS(element);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.continuousScrollTillElement(breadcrumb, 5);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyMarathiNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, marathiNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyMarathiNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, marathiNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, topNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, topNewsMoreNewsLnk, articleBreadCrumbDiv);
	}

	public void verifyTopNewsTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, topNewsTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisWorldOfNewsNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(worldOfNewsLnk, 20);
		webDriverActions.softClickJS(worldOfNewsLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyNews18MinisImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, news18MinisImgLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18MinisArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(news18MinisReadMoreLnk, 20);
		for(int i=0 ; i<news18MinisReadMoreLnk.size()-1 ; i++)
		{
			webDriverActions.continuousScrollTillAllElement(news18MinisReadMoreLnk, 20);
			webDriverActions.softMouseHover(news18MinisReadMoreLnk.get(i));
			webDriverActions.softClickJS(news18MinisReadMoreLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable To Display Element in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForPageToLoad();
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		List<String> list=new ArrayList<String>();
		//		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webstoriesTitleLnk, 10);
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.scrollDown();
		for(int i=0 ; i<webstoriesArticleLnk.size() ; i++)
		{
			String attribute = webstoriesArticleLnk.get(i).getAttribute("href");
			if(serverType.equalsIgnoreCase("preProd") && !attribute.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(attribute);	
				Logs.info(getClass(), "Url Replaced "+betaUrl);
				list.add(betaUrl);
			}
		}
		Logs.info(getClass(),"Total Links "+list.size());
		list.parallelStream().forEach(e -> checkLinks(e));
		softAssert.assertAll("Issue Found in Homepage ");
	}

	//	public void verifyWebstoriesArticleNavigation(String serverType)
	//	{
	//		SoftAssert softAssert =new SoftAssert();
	//		webDriverActions.waitForPageToLoad();
	//		String title = webDriverActions.getPageTitle();
	//		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 20);
	//		if(webstoriesArticleLnk.size()>0)
	//		{
	//			webDriverActions.softScrollToElement(webstoriesArticleLnk.get(0));
	//			webDriverActions.softMouseHover(webstoriesArticleLnk.get(0));
	//			webDriverActions.waitForSecond(1000);
	//			for(int i=0; i<webstoriesArticleLnk.size() ;i++)
	//			{
	//				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
	//				webDriverActions.softClickJS(activeWebstoriesArticleLnk);
	//				webDriverActions.switchToNewWindow();
	//				webDriverActions.waitForSecond(1000);
	//				String currentPage =webDriverActions.getCurrentPageUrl();
	//				Logs.info(getClass(), currentPage);
	//				if (serverType.equalsIgnoreCase("preProd")) {
	//					String betaUrl = genericUtility.replaceInUrl(currentPage);
	//					webDriverActions.navigateToUrl(betaUrl);
	//					currentPage=betaUrl;
	//				}
	//				else {
	//					currentPage = webDriverActions.getCurrentPageUrl();
	//				}
	//				webDriverActions.waitForSecond(1000);
	//				webDriverActions.softHighlightElement(nextWebStoryBtn);
	//				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in "+currentPage);;
	//				webDriverActions.closeDriver();
	//				webDriverActions.switchToWindow(title);
	//			}
	//		}
	//		else
	//		{
	//			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesArticleLnk.size());
	//		}
	//		softAssert.assertAll("Issues Found in Homepage Body");
	//	}

	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 20);
		if(webstoriesImgLnk.size()>0)
		{
			webDriverActions.softScrollToElement(webstoriesImgLnk.get(0));
			webDriverActions.softMouseHover(webstoriesImgLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<webstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(activeWebstoriesImgLnk);
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(1000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForSecond(1000);
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in "+currentPage);;
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesImgLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.softScrollToElement(webstoriesTitleLnk);
		if(webDriverActions.softIsElementDisplayed(webstoriesSliderBtn.get(0)))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Webstories Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Webstories Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}

	public void verifyWebstoriesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , webstoriesTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, entertainmentArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, entertainmentImgLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, entertainmentReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, entertainmentTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoneyArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , moneyArticleLnk, articleHeaderTxt);
	}

	public void verifyMoneyImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , moneyImgLnk, articleHeaderTxt);
	}

	public void verifyMoneyTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , moneyTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoneyReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, moneyReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType, photogalleryArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, photogalleryImgLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, photogalleryTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, photogalleryReadMoreLnk, articleBreadCrumbDiv);
	}


	public void verifyVideoArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType, videosArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, videosImgLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, videosTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, videoReadMoreLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to gujarat Cities Articles
	 */
	public void verifyGujaratCitiesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(maharashtraCitiesArticleLnks,10);
		//		webDriverActions.continuousScrollTillAllElement(maharashtraCitiesLnks, 6);
		webDriverActions.softScrollToElement(maharashtraCitiesLnks.get(0));
		softAssert.assertTrue(maharashtraCitiesLnks.size()>0, "Possibly Element is Not Visible "+homeUrl);

		/* Below loop validates the Gujarati cities articles Navigations */
		for (int i = 0; i < maharashtraCitiesLnks.size();i++) {
			webDriverActions.softHighlightElement(maharashtraCitiesLnks.get(i));
			webDriverActions.softMouseHover(maharashtraCitiesLnks.get(i));
			Logs.info(getClass(), webDriverActions.getTextFromElement(maharashtraCitiesLnks.get(i)));		
			webDriverActions.softClickJS(maharashtraCitiesLnks.get(i));
			webDriverActions.waitForPageToLoad();

			for (int j = 0; j < maharashtraCitiesArticleLnks.size();j++) {
				webDriverActions.softHighlightElement(maharashtraCitiesArticleLnks.get(j));
				webDriverActions.softMouseHover(maharashtraCitiesArticleLnks.get(j));
				webDriverActions.softClickJS(maharashtraCitiesArticleLnks.get(j));
				webDriverActions.waitForPageToLoad();
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softHighlightElement(maharashtraCitiesArticleLnks.get(j));
					webDriverActions.softMouseHover(maharashtraCitiesArticleLnks.get(j));
					webDriverActions.softClickJS(maharashtraCitiesArticleLnks.get(j));
					webDriverActions.waitForSecond(2000);
				}
				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.contains("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl=betaUrl;
				}
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Possibly Element is Not Visible "+currentPageUrl);
				webDriverActions.navigateToUrl(homeUrl);
				webDriverActions.waitForPageToLoad();
				webDriverActions.softScrollToElement(maharashtraCitiesLnks.get(i));
				webDriverActions.softHighlightElement(maharashtraCitiesLnks.get(i));
				webDriverActions.softMouseHover(maharashtraCitiesLnks.get(i));
				webDriverActions.softClickJS(maharashtraCitiesLnks.get(i));
				webDriverActions.waitForPageToLoad();
			}
		}
		softAssert.assertAll("Issues Found In Validating Gujarat Section Cities Articles Present on HomePage");
	}

	public void checkLinks(String links)  {
		//		SoftAssert softAssert = new SoftAssert();
		try {
			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			//			URL url=new URL(links);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			Logs.info(getClass(), responseCode + "--------------- "  +links);
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}

	public void verifyLokmatCitiesNavigations(String serverType)
	{
		List<String> list=new ArrayList<String>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(maharashtraCitiesLnks, 10);
		webDriverActions.scrollDown();
		for(int i=0;i<maharashtraCitiesLnks.size() ; i++)
		{
			webDriverActions.mouseHover(maharashtraCitiesLnks.get(i));
			webDriverActions.softClickJS(maharashtraCitiesLnks.get(i));
			webDriverActions.waitForSecond(1000);
			for(int j=0 ; j<maharashtraCitiesArticleLnks.size() ; j++)
			{
				String attribute = maharashtraCitiesArticleLnks.get(j).getAttribute("href");
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(attribute);	
					Logs.info(getClass(), "Url Replaced "+betaUrl);
					list.add(betaUrl);
				}
			}
		}
		Logs.info(getClass(),"Total Links "+list.size());
		list.parallelStream().forEach(e -> checkLinks(e));
		softAssert.assertAll("Issue Found in Homepage ");
	}

	public void verifyMaharashtraTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, maharashtraTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMaharashtraReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, maharashtraCitiesReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyMaharashtraArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, maharashtraCitiesArticleLnks, articleBreadCrumbDiv);
	}

	public void verifyMaharashtraImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, maharashtraCitiesImgLnks, articleBreadCrumbDiv);
	}


	//===================================Sanjeeb's Business Logics=================================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is used To Validate Header Section Search and Logo Section.
	 */
	public void verifyHeaderLogoAndSearchSection() {
		webDriverActions.waitForPageToLoad();
		String pageUrl="";
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		//This Line Of Scripts use to Verify Logo on Homepage Header.
		webDriverActions.softMouseHover(headerLogo);
		webDriverActions.softHighlightElement(headerLogo);
		webDriverActions.navigateToNewTab(headerLogo);
		webDriverActions.switchToNewWindow();
		pageUrl=webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), "Naviagted to "+pageUrl);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTextLogo),"Unable to display "+pageUrl);
		webDriverActions.closeDriver();
		webDriverActions.switchToWindow(parentTitle);

		//This Line Of Scripts use to Verify Search on Homepage Header.
		webDriverActions.softHighlightElement(headerSearchBtn);
		webDriverActions.softClickJS(headerSearchBtn);
		webDriverActions.inputText(headerSearchBox, "NEWS 18");
		webDriverActions.softClickJS(innerSearchBtn);
		webDriverActions.waitForSecond(4000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cancelBtn),"Unable to display ");
		softAssert.assertAll("Isuues Found In Header Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is used To Validate Header District Section.
	 */
	public void verifyHeaderDistrictSection(String server) {

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		String mainPgTitle=webDriverActions.getPageTitle();
		for (int i = 0; i <apnaSeherChuneEleList.size(); i++) {	

			webDriverActions.navigateToNewTab(apnaSeherChuneEleList.get(i));
			webDriverActions.switchToNewWindow();
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(rajyaSeherChuneLnk);
				webDriverActions.navigateToNewTab(apnaSeherChuneEleList.get(i));
				webDriverActions.switchToNewWindow();
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTextLogo), "Possibly Element Is Not Visible For This URL ");
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(mainPgTitle);
		}
		softAssert.assertAll("Issues Found In Validating Header District Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is used To Validate LineOne Section.
	 */
	public void verifyLineOneSection(String server) {
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		String mainPgTitle=webDriverActions.getPageTitle();
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("icici"));
		list.add(fileUtility.readDataFromPropertyFile("electral"));
		list.add(fileUtility.readDataFromPropertyFile("crypto"));
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(iciciHeaderTxtLnk);
		listEle.add(electralHydrationText);
		listEle.add(kryptoTxtLnk);
		listEle.add(netraSurkshaTxtLnk);

		for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
		{
			actual=webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
			if(actual.contains("icici-lombard") ||actual.contains("electral") ||actual.contains("crypto") || actual.contains("netrasuraksha") )
			{
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
				webDriverActions.navigateToNewTab(lineOneSectionELementLnk.get(i));
				webDriverActions.switchToNewWindow();
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
					webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
					webDriverActions.navigateToNewTab(lineOneSectionELementLnk.get(i));
					webDriverActions.switchToNewWindow();
				}
				actual = webDriverActions.getCurrentPageUrl();
				for(int j=0;j<list.size();j++)
				{
					if(actual.contains(list.get(j)))
					{
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);	
					}
				}
			}
			else
			{
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
				webDriverActions.navigateToNewTab(lineOneSectionELementLnk.get(i));
				webDriverActions.switchToNewWindow();
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
					webDriverActions.softHighlightElement(lineOneSectionELementLnk.get(i));
					webDriverActions.navigateToNewTab(lineOneSectionELementLnk.get(i));
					webDriverActions.switchToNewWindow();
					actual = webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd")&& !actual.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);	
				}
			}
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(mainPgTitle);
		}

		softAssert.assertAll("Issues Found In Validating Line One Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is used To Validate Header Hamburger Section.
	 */
	public void verifyHeaderHamburgerSection(String server) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		String mainPgTitle=webDriverActions.getPageTitle();
		for (int i = 1; i <hamburgerMenuEleList.size(); i++) {	
			webDriverActions.softMouseHover(hamburgerMenuEleList.get(i));
			webDriverActions.softHighlightElement(hamburgerMenuEleList.get(i));
			webDriverActions.navigateToNewTab(hamburgerMenuEleList.get(i));
			webDriverActions.switchToNewWindow();
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerMenuLnk);
				webDriverActions.softMouseHover(hamburgerMenuEleList.get(i));
				webDriverActions.softHighlightElement(hamburgerMenuEleList.get(i));
				webDriverActions.navigateToNewTab(hamburgerMenuEleList.get(i));
				webDriverActions.switchToNewWindow();
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL ");
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(mainPgTitle);
		}	
		softAssert.assertAll("Issues Found In Validating Hamburger Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is used To Validate Header Hamburger Section.
	 */
	public void verifyHeaderHamburgerLanguageSection() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		webDriverActions.softClickJS(hamburgerMenuLanguageLnk);
		String mainPgTitle=webDriverActions.getPageTitle();
		for (int i = 0; i <hamburgerMenuLanguageEleList.size()-2; i++) {	
			webDriverActions.softMouseHover(hamburgerMenuLanguageEleList.get(i));
			webDriverActions.softHighlightElement(hamburgerMenuLanguageEleList.get(i));
			webDriverActions.navigateToNewTab(hamburgerMenuLanguageEleList.get(i));
			webDriverActions.switchToNewWindow();
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerMenuLanguageLnk);
				webDriverActions.softMouseHover(hamburgerMenuLanguageEleList.get(i));
				webDriverActions.softHighlightElement(hamburgerMenuLanguageEleList.get(i));
				webDriverActions.navigateToNewTab(hamburgerMenuLanguageEleList.get(i));
				webDriverActions.switchToNewWindow();
			}
			String actual = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerLogo), "Possibly Element Is Not Visible For This URL "+actual);
			webDriverActions.switchToWindow(mainPgTitle);
		}	
		softAssert.assertAll("Issues Found In Validating Hamburger Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Section Desktop Landing Page.
	 */
	public void verifyFooterSection(String server,List<WebElement> eleList,WebElement Section,WebElement header)
	{
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(Section);
		webDriverActions.softMouseHover(Section);
		webDriverActions.softHighlightElement(Section);
		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				webDriverActions.softHighlightElement(eleList.get(i));
				webDriverActions.mouseHover(eleList.get(i));
				webDriverActions.navigateToNewTab(eleList.get(i));
				webDriverActions.switchToNewWindow();
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.scrollToLast();
					webDriverActions.softMouseHover(Section);
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.mouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
				}
				actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);	
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Second Section Desktop Landing Page.
	 */
	public void verifyFooterSecondSection(String server,List<WebElement> eleList,WebElement Section,WebElement header)
	{
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollDown();
		webDriverActions.softScrollToElement(Section);
		webDriverActions.softMouseHover(Section);
		webDriverActions.softHighlightElement(Section);
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("younggenius"));
		list.add(fileUtility.readDataFromPropertyFile("firstpost"));
		list.add(fileUtility.readDataFromPropertyFile("cnbctv18"));
		list.add(fileUtility.readDataFromPropertyFile("historyindia"));
		list.add(fileUtility.readDataFromPropertyFile("mtvindia"));
		list.add(fileUtility.readDataFromPropertyFile("moneycontrol"));
		list.add(fileUtility.readDataFromPropertyFile("compareindia"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("jionews"));
		list.add(fileUtility.readDataFromPropertyFile("googlePlay"));
		list.add(fileUtility.readDataFromPropertyFile("apple"));
		Logs.info(getClass(), list);

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(townHallAndTopLearningIcon);
		listEle.add(firstPostIcon);
		listEle.add(firstPostAndCnbcIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(historyAndMTvIcon);
		listEle.add(moneyControlInstaPlayStoreIcon);
		listEle.add(compareIndiaIcon);
		listEle.add(facebookHeader);
		listEle.add(twitterHeader);
		listEle.add(instagramHeader);
		listEle.add(youtubeHeader);
		listEle.add(jioHeader);
		listEle.add(googlePlayHeader);
		listEle.add(appleHeader);
		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				actual=webDriverActions.getAttribute("href", eleList.get(i));
				if(actual.contains("topperlearning") || actual.contains("firstpost") || actual.contains("cnbctv18") || actual.contains("historyindia") || actual.contains("mtvindia") || actual.contains("moneycontrol") || actual.contains("play.google.com") || actual.contains("compareindia") || actual.contains("caprep18") || actual.contains("facebook") || actual.contains("twitter") || actual.contains("instagram") || actual.contains("youtube") || actual.contains("jionews") || actual.contains("apple"))
				{
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.softMouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
					String currentPageUrl=webDriverActions.getCurrentPageUrl();
					if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.scrollToLast();
						webDriverActions.waitForSecond(1000);
						webDriverActions.scrollDown();
						webDriverActions.softMouseHover(Section);
						webDriverActions.softHighlightElement(eleList.get(i));
						webDriverActions.mouseHover(eleList.get(i));
						webDriverActions.navigateToNewTab(eleList.get(i));
						webDriverActions.switchToNewWindow();
					}
					actual = webDriverActions.getCurrentPageUrl();
					{
						for(int j=0;j<list.size();j++)
						{
							if(actual.contains(list.get(j)))
							{
								softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);	
							}
						}
					}
				}
				else
				{
					webDriverActions.softHighlightElement(eleList.get(i));
					webDriverActions.softMouseHover(eleList.get(i));
					webDriverActions.navigateToNewTab(eleList.get(i));
					webDriverActions.switchToNewWindow();
					String currentPageUrl=webDriverActions.getCurrentPageUrl();
					if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.scrollToLast();
						webDriverActions.waitForSecond(1000);
						webDriverActions.scrollDown();
						webDriverActions.softMouseHover(Section);
						webDriverActions.softHighlightElement(eleList.get(i));
						webDriverActions.mouseHover(eleList.get(i));
						webDriverActions.navigateToNewTab(eleList.get(i));
						webDriverActions.switchToNewWindow();
					}
					actual = webDriverActions.getCurrentPageUrl();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);	
				}
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Trending Section Desktop Landing Page.
	 */
	public void verifyFooterTrendingSection(String server)
	{
		verifyFooterSection(server, footerTrendingSectionEleList, footerTrendingSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer bivag Section Desktop Landing Page.
	 */
	public void verifyFooterBivagSection(String server)
	{
		verifyFooterSection(server, footerBivagSectionEleList, footerBivagSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Social Section Desktop Landing Page.
	 */
	public void verifyFooterSocialSection(String server)
	{
		verifyFooterSection(server, footerSocialSectionEleList, footerSocialSection, headerLogo);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Language Section Desktop Landing Page.
	 */
	public void verifyFooterLanguageSitesSection(String server)
	{
		verifyFooterSecondSection(server, footerLanguageSectionEleList, footerLangaugeSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Group Sites Section Desktop Landing Page.
	 */
	public void verifyFooterGroupSitesSection(String server)
	{
		verifyFooterSecondSection(server, footerGroupSitesSectionEleList, footerGroupSitesSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer LineTwo Section Desktop Landing Page.
	 */
	public void verifyFooterLineTwoSocialSection(String server)
	{
		verifyFooterSecondSection(server, footerLineTwoSocialSectionEleList, footerLineTwoSocialSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer LineTwo Section Desktop Landing Page.
	 */
	public void verifyFooterLineTwoLastlayerSection(String server)
	{
		verifyFooterSecondSection(server, footerLineTwoLastLayerSectionEleList, footerLineTwoLastLayerSection, headerLogo);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer live Tv Section Desktop Landing Page.
	 */
	public void verifyFooterLiveTvSection()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(footerLiveTVSection);
		webDriverActions.softHighlightElement(footerLiveTVSection);
		webDriverActions.softClickJS(footerLiveTVSection);
		String actual = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);	
		softAssert.assertAll("Issues found in Footer Live TV");

	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Sticky Section Mobile Landing Page.
	 */
	public void verifyStickySection(String server)
	{			
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.softMouseHover(footerStickySection);
		webDriverActions.softHighlightElement(footerStickySection);
		if (footerStickySectionEleList.size()>0) {
			for (int i = 0; i < footerStickySectionEleList.size(); i++) {
				webDriverActions.softHighlightElement(footerStickySectionEleList.get(i));
				webDriverActions.softMouseHover(footerStickySectionEleList.get(i));
				webDriverActions.navigateToNewTab(footerStickySectionEleList.get(i));
				webDriverActions.switchToNewWindow();
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(footerStickySection);
					webDriverActions.softHighlightElement(footerStickySectionEleList.get(i));
					webDriverActions.navigateToNewTab(footerStickySectionEleList.get(i));
					webDriverActions.switchToNewWindow();
				}
				actual = webDriverActions.getCurrentPageUrl();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerLogo), "Possibly Element Is Not Visible For This URL "+actual);	
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+footerStickySectionEleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}


}
