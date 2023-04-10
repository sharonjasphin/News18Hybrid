package com.news18.tamilpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

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
 * @author AbhishekRaj
 * This page contains elements and business logic for Tamil mobile home page
 */
public class MobileTamilLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert =new SoftAssert();

	public MobileTamilLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Homepage List of article Link for news18 Tamil Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//ul[contains(@class,'navigation')]//li//a[contains(@href,'photogallery')]")
	private WebElement photoSectionLnk;

	/*Homepage List of Live article Link for news18 Tamil Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'memes')]")
	private WebElement lineOneLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'videos')]")
	private WebElement videosLnk;

	/*photo section Present in Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'sports')]")
	private WebElement sportsLnk;

	/*Humburger  Lnk Present above Line one navigation bar in Tamil HomePage */
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement humburgerLnk;

	/*Trending Topic link present in Home page*/
	@FindBy(xpath ="//div[contains(@class,'top_links')]//a[contains(@href,'tag')]")
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


	//---------India
	/* India section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/national/')]")
	private WebElement indiaSectionLnk;

	/* India section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> indiaSectionArticleLnk;

	/* India section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> indiaSectionImgLnk;

	/* India section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreIndiaSectionLnk;

	/*Breadcrumb present in India article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement indiaBreadcrumb;

	//---------World
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/international/')]")
	private WebElement worldSectionLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> worldSectionArticleLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> worldSectionImgLnk;

	/* World section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreWorldSectionLnk;

	/* Breadcrumb present in World article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement worldBreadcrumb;


	//---------Employment
	/* Employment section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/employment/')]")
	private WebElement employmentSectionLnk;

	/* Employment section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> employmentSectionArticleLnk;

	/* Employment section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> employmentSectionImgLnk;

	/* Employment section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreEmploymentSectionLnk;

	/* Breadcrumb present in Employment article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement employmentBreadcrumb;

	//---------Business
	/* Business section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/business/')]")
	private WebElement businessSectionLnk;

	/* Business section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> businessSectionArticleLnk;

	/* Business section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> businessSectionImgLnk;

	/* Business section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreBusinessSectionLnk;

	/* Breadcrumb present in Business article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement businessBreadcrumb;

	//---------Sport
	/* Sport section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/sports/')]")
	private WebElement sportSectionLnk;

	/* Sport section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreSportSectionLnk;

	/* Breadcrumb present in Sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement sportBreadcrumb;

	//---------Featured Article
	/* Featured Article section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/special-articles/')]")
	private WebElement featuredArticleSectionLnk;

	/* Featured Article section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> featuredArticleSectionArticleLnk;

	/* Featured Article section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//img")
	private List<WebElement> featuredArticleSectionImgLnk;

	/* Featured Article section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreFeaturedArticleSectionLnk;

	/* Breadcrumb present in Featured Article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement featuredArticleBreadcrumb;


	// ---------------------------------------- Vipin's Webelemnts ----------------------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd') or contains(@class,'bread') or contains(@class,'brade')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/* List of Top Tamil News Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top-news bigstory')]/h2")
	private List<WebElement> topTamilNewsArticleLnk;

	/*List of Top Tamil News Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top-news bigstory')]/a//img[@data-src]")
	private List<WebElement> topTamilNewsImgLnk;

	/*List of Important News Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/ul/li/a//h3")
	private List<WebElement> importantNewsArticleLnk;

	/*List of Important News Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/ul/li/a//img[@data-src]")
	private List<WebElement> importantNewsImgLnk;

	/*Important News ReadMore Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/a")
	private WebElement importantNewsReadMoreLnk;

	/*TamilNadu Section City Links*/
	@FindBy(xpath="//ul[contains(@class,'news-home-tab')]/li/a")
	private List<WebElement> tamilnaduCitiesLnks;

	/*TamilNadu Section City Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> tamilnaduCitiesArticleLnks;

	/*TamilNadu Section City Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> tamilnaduCitiesImgLnks;

	/* TamilNadu Section Title Link in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/tamil-nadu/')]")
	private WebElement tamilnaduTitleLnk;

	/*TamilNadu Section City Title Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement tamilnaduCitiesReadMoreLnk;

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

	/*News18 Special Section Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> news18SpecialArticleLnks;

	/*News18 Special Section City Image Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> news18SpecialImgLnks;

	/* News18 Special Section Title Link in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/news/')]")
	private WebElement news18SpecialTitleLnk;

	/*News18 Special Title Links in Homepage*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement news18SpecialReadMoreLnk;

	/*Entertainment Section Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> entertainmentArticleLnks;

	/*Entertainment Section City Image Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> entertainmentImgLnks;

	/* Entertainment Section Title Link in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/entertainment/')]")
	private WebElement entertainmentTitleLnk;

	/*Entertainment Title Links in Homepage*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement entertainmentReadMoreLnk;

	/*List of Photogallery Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
	private List<WebElement> photogalleryArticleLnk;

	/*List of Photogallery Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//img")
	private List<WebElement> photogalleryImgLnk;

	/*Photogallery Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement photogalleryReadMoreLnk;

	/*Photogallery Title in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery')]")
	private WebElement photogalleryTitleLnk;

	/*List of Technology Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
	private List<WebElement> technologyArticleLnk;

	/*List of Technology Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//img")
	private List<WebElement> technologyImgLnk;

	/*Technology Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement technologyReadMoreLnk;

	/*Technology Title in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]")
	private WebElement technologyTitleLnk;

	/*List of Videos Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
	private List<WebElement> videosArticleLnk;

	/*List of Videos Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//img")
	private List<WebElement> videosImgLnk;

	/*Videos Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement videosReadMoreLnk;

	/*Videos Title in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]")
	private WebElement videosTitleLnk;

	/*List of Automobiles Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
	private List<WebElement> automobileArticleLnk;

	/*List of Automobiles Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//img")
	private List<WebElement> automobileImgLnk;

	/*Automobiles Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]/a")
	private WebElement automobileReadMoreLnk;

	/*Automobiles Title in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]")
	private WebElement automobileTitleLnk;

	/*Education Section Article Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> educationArticleLnks;

	/*Education Section Image Links*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//img")
	private List<WebElement> educationImgLnks;

	/* Education Section Title Link in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/education/')]")
	private WebElement educationTitleLnk;

	/*Education Title Links in Homepage*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement educationReadMoreLnk;

	//======================================Sanjeeb's Elements ============================================

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//div[contains(@class,'tpctlits')]//li/a")
	private List<WebElement> districtEleLinks;

	/*photo section Present in Line one navigation bar in Gujarati HomePage */
	@FindBy(xpath="//a[contains(@class,'logo')]")
	private WebElement headerLogo;

	/*header App Link of TAmil home Page */
	@FindBy(xpath="//div[contains(@class,'app_icon')]/a")
	private WebElement headerDownloadAppLogo;

	/*Header logo present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'header')] | //div[contains(@class,'row')]")
	private WebElement headerSection;

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]  | //h2[contains(@class,'brd')]")
	private WebElement headerBreadcrumbLnk;

	/*Header district Icon present on mobile Tamil homepage*/
	@FindBy(xpath="//div[contains(@class,'chs-stct')]")
	private WebElement headerDistrictIcon;

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//ul[contains(@class,'adclsnavg')]/li/a")
	private List<WebElement> headerHamburgerSectionLnks;

	/*Header Mobile Hamburger Menu mobile Tamil homepage*/
	@FindBy(xpath="//a[contains(@class,'nav_icon')]")
	private WebElement headerHamburgerIcon;

	/*change Langauge button Present in Hamburger Menu*/
	@FindBy(xpath="(//div[contains(@class,'chs-tplng')]/ul//a)[2]")
	private WebElement changeLanguageIcon;

	/*Homepage List of Live article Link for news18 Gujarati Page*/
	@FindBy(xpath ="//ul[contains(@class,'lng-subnav')]/li/a")
	private List<WebElement> changelanguageLnks;

	/*Header logo present in Gujarati HomePage  */
	@FindBy(xpath ="//div[contains(@class,'hdrClss1')]  | //div[contains(@class,'mobile_nav_icon')] ")
	private WebElement headerTextLnk;

	/*Footer Sticky Section Element List*/
	@FindBy(xpath="//ul[contains(@class,'btnvav')]//a")
	private List<WebElement> footerStickySectionEleList;

	/*Footer Sticky Section */
	@FindBy(xpath="//ul[contains(@class,'btnvav')]")
	private WebElement footerStickySection;

	/*Header LineOne Section Elements List*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> headerLineOneSectionEleLnks;


	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//a[contains(@aria-label,'Facebook')] | //div[contains(@id,'MChromeHeader')] ")
	private WebElement facebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_acum')] | //div//img[contains(@alt,'Instagram')] | //div//img[contains(@alt,'Instagram')] | //div[contains(@class,'_aarf')]")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[contains(@class,'header')] ")
	private WebElement youtubeHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@src,'JioNewsAppIcon')]")
	private WebElement jioHeader;

	/*Footer Social Share Section*/
	@FindBy(xpath ="//div[contains(@class,'social_net')]")
	private WebElement footerSocialSection;

	/*Header LineOne Section Elements List*/
	@FindBy(xpath ="//div[contains(@class,'social_net')]//a")
	private List<WebElement> footerSocialSectionEleList;



	/**
	 * This method is used to click on First Article of Tamil Home Page 
	 */
	public void clickOnFirstArticleTamilHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
			Logs.info(getClass(), "Clicked on first article");
		}
		catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in first Article Homepage ", e);
		}
	}


	/**
	 * @author AbhishekRaj
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnPhotoSection()
	{
		try {
			webDriverActions.clickJS(humburgerLnk);
			webDriverActions.scrollDown();
			webDriverActions.clickJS(photoSectionLnk);
			Logs.info(getClass(), "Clicked on photo Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in PhotoSection Link ", e);
		}
	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of Tamil Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage() {
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
	 * @author AbhishekRaj
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnVideosSection()
	{
		try {
			webDriverActions.clickJS( videosLnk);
			Logs.info(getClass(), "Clicked on videos Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Link ", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnLineOneSection()
	{
		try {
			webDriverActions.clickJS(lineOneLnk);
			Logs.info(getClass(), "Clicked on Line One Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Homepage ", e);
		}
	}

	/**
	 * @author Sanjeeb
	 * This method used to click on photos section of Tamil Homepage
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.clickJS(sportsLnk);
			Logs.info(getClass(), "Clicked on sports Section ");
		}
		catch (Exception e) {
			Logs.error(getClass(), "Exception in Sports Link Homepage ", e);
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
			Logs.error(getClass(), "Exception in First topic link");
		}
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
		webDriverActions.continuousScrollTillElement(section, 6);
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
		webDriverActions.continuousScrollTillElement(section, 6);		
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
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,String page,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 6);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
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
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,String page, WebElement moreLnk ,WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 6);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();

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
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}
	//-----Life

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,"/lifestyle",lifestyleSectionLnk, lifestyleBreadcrumb);
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
		verifyMoreLnks(serverType,"/lifestyle",readMoreLifestyleSectionLnk, lifestyleBreadcrumb);
	}

	//-----India

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget
	 */
	public void verifyIndiaWidget(String serverType) {
		verifySectionLnks(serverType,"/national",indiaSectionLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,indiaSectionLnk,indiaSectionArticleLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	public void verifyIndiaWidgetImg(String serverType) {
		verifyImgNavigation(serverType,indiaSectionLnk,indiaSectionImgLnk, indiaBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	public void verifyMoreIndiaLnk(String serverType) {
		verifyMoreLnks(serverType,"/national",readMoreIndiaSectionLnk, indiaBreadcrumb);
	}


	//-----World

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	public void verifyWorldWidget(String serverType) {
		verifySectionLnks(serverType,"/international",worldSectionLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,worldSectionLnk,worldSectionArticleLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigation(serverType,worldSectionLnk,worldSectionImgLnk, worldBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnks(serverType,"/international",readMoreWorldSectionLnk, worldBreadcrumb);
	}

	//----Employment

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget
	 */
	public void verifyEmploymentWidget(String serverType) {
		verifySectionLnks(serverType,"/employment",employmentSectionLnk, employmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget Article
	 */
	public void verifyEmploymentWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,employmentSectionLnk,employmentSectionArticleLnk, employmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget Image
	 */
	public void verifyEmploymentWidgetImg(String serverType) {
		verifyImgNavigation(serverType,employmentSectionLnk,employmentSectionImgLnk, employmentBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Employment News
	 */
	public void verifyMoreEmploymentLnk(String serverType) {
		verifyMoreLnks(serverType,"/employment",readMoreEmploymentSectionLnk, employmentBreadcrumb);
	}

	//---------Business
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	public void verifyBusinessWidget(String serverType) {
		verifySectionLnks(serverType,"/business",businessSectionLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,businessSectionLnk,businessSectionArticleLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	public void verifyBusinessWidgetImg(String serverType) {
		verifyImgNavigation(serverType,businessSectionLnk,businessSectionImgLnk, businessBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnks(serverType,"/business",readMoreBusinessSectionLnk, businessBreadcrumb);
	}

	//---------Sport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget
	 */
	public void verifySportWidget(String serverType) {
		verifySectionLnks(serverType,"/sports",sportSectionLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget Image
	 */
	public void verifySportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,sportSectionLnk,sportSectionImgLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Sport News
	 */
	public void verifyMoreSportLnk(String serverType) {
		verifyMoreLnks(serverType,"/sports",readMoreSportSectionLnk, sportBreadcrumb);
	}

	//---------Featured Article
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget
	 */
	public void verifyFeaturedArticleWidget(String serverType) {
		verifySectionLnks(serverType,"/special-articles",featuredArticleSectionLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget Article
	 */
	public void verifyFeaturedArticleWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,featuredArticleSectionLnk,featuredArticleSectionArticleLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget Image
	 */
	public void verifyFeaturedArticleWidgetImg(String serverType) {
		verifyImgNavigation(serverType,featuredArticleSectionLnk,featuredArticleSectionImgLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Featured Article News
	 */
	public void verifyMoreFeaturedArticleLnk(String serverType) {
		verifyMoreLnks(serverType,"/special-articles",readMoreFeaturedArticleSectionLnk, featuredArticleBreadcrumb);
	}


	//----------------------------- Vipin's Business Logic -------------------------------//


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
	public void verifyMoreNewsNavigation(String serverType,WebElement moreLnk , WebElement element ,  String section) {
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
		softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
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


	public void verifyTopTamilNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topTamilNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTopTamilNewsImageNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topTamilNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyImportantNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, importantNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyImportantNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, importantNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyImportantNewsReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, importantNewsReadMoreLnk, articleBreadCrumbDiv , "/news");
	}

	public void checkLinks(String links)  {
		//		SoftAssert softAssert = new SoftAssert();
		try {
			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			//				URL url=new URL(links);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			Logs.info(getClass(), responseCode + "--------------- "  +links);
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}

	public void verifyTamilNaduArticleNavigations(String serverType)
	{
		List<String> list=new ArrayList<String>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(tamilnaduCitiesLnks, 10);
		webDriverActions.scrollDown();
		for(int i=0;i<tamilnaduCitiesLnks.size() ; i++)
		{
			webDriverActions.mouseHover(tamilnaduCitiesLnks.get(i));
			webDriverActions.softClickJS(tamilnaduCitiesLnks.get(i));
			webDriverActions.waitForSecond(1000);
			for(int j=0 ; j<tamilnaduCitiesArticleLnks.size() ; j++)
			{
				String attribute = tamilnaduCitiesArticleLnks.get(j).getAttribute("href");
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

	public void verifyTamilNaduTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, tamilnaduTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyTamilNaduReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(tamilnaduTitleLnk , 10);
		webDriverActions.waitForElement(1000);

		/* Below loop validates the Lokmat cities articles Navigations */
		for (int i = 0; i < tamilnaduCitiesLnks.size() ;i++) {
			webDriverActions.softHighlightElement(tamilnaduCitiesLnks.get(i));
			webDriverActions.softMouseHover(tamilnaduCitiesLnks.get(i));
			webDriverActions.softClickJS(tamilnaduCitiesLnks.get(i));
			webDriverActions.waitForSecond(1000);
			webDriverActions.softMouseHover(tamilnaduCitiesReadMoreLnk);
			webDriverActions.softClickJS(tamilnaduCitiesReadMoreLnk);
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd") && !currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in ");
			if (serverType.contains("preProd") && expectedUrl.contains("//beta") ) {
				webDriverActions.navigateBack();
			}
			else
			{
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
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

	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.softScrollToElement(webstoriesTitleLnk);
		if(webDriverActions.softIsElementDisplayed(webstoriesSliderBtn.get(0)))
		{
			for(int i = 1 ; i< webstoriesArticleLnk.size()-1 ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(2000);
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

	public void verifyNews18SpecialArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18SpecialArticleLnks, articleBreadCrumbDiv);
	}

	public void verifyNews18SpecialImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, news18SpecialImgLnks, articleBreadCrumbDiv);
	}

	public void verifyNews18SpecialReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, news18SpecialReadMoreLnk, articleBreadCrumbDiv , "/news");
	}

	public void verifyNews18SpecialTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, news18SpecialTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, entertainmentArticleLnks, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, entertainmentImgLnks, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, entertainmentTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyEntertainmentReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, entertainmentReadMoreLnk, articleBreadCrumbDiv , "/entertainment");
	}

	public void verifyPhotogalleryArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(photogalleryTitleLnk , 10);
		softAssert.assertTrue(photogalleryArticleLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<photogalleryArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(photogalleryArticleLnk.get(i));
			webDriverActions.softScrollToElement(photogalleryArticleLnk.get(i));
			webDriverActions.softClickJS(photogalleryArticleLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(photogalleryArticleLnk.get(i));
				webDriverActions.softScrollToElement(photogalleryArticleLnk.get(i));
				webDriverActions.softClickJS(photogalleryArticleLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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

	public void verifyPhotogalleryImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(photogalleryTitleLnk , 10);
		softAssert.assertTrue(photogalleryImgLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<photogalleryImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(photogalleryImgLnk.get(i));
			webDriverActions.softScrollToElement(photogalleryImgLnk.get(i));
			webDriverActions.softClickJS(photogalleryImgLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(photogalleryImgLnk.get(i));
				webDriverActions.softScrollToElement(photogalleryImgLnk.get(i));
				webDriverActions.softClickJS(photogalleryImgLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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

	public void verifyPhotogalleryReadMoreNavigation(String serverType)
	{
		String section = "/photogallery";
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(photogalleryReadMoreLnk , 10);
		String actual = webDriverActions.getAttribute("href", photogalleryReadMoreLnk);
		webDriverActions.softClickJS(photogalleryReadMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(), currentPage);
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyPhotogalleryTitleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(photogalleryTitleLnk, 10);
		webDriverActions.softClickJS(photogalleryTitleLnk);
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
		webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");

	}

	public void verifyTechnologyArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(technologyTitleLnk , 10);
		softAssert.assertTrue(technologyArticleLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<technologyArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(technologyArticleLnk.get(i));
			webDriverActions.softScrollToElement(technologyArticleLnk.get(i));
			webDriverActions.softClickJS(technologyArticleLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(technologyArticleLnk.get(i));
				webDriverActions.softScrollToElement(technologyArticleLnk.get(i));
				webDriverActions.softClickJS(technologyArticleLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(500);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTechnologyImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(technologyReadMoreLnk , 10);
		softAssert.assertTrue(technologyImgLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<technologyImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(technologyImgLnk.get(i));
			webDriverActions.softScrollToElement(technologyImgLnk.get(i));
			webDriverActions.softClickJS(technologyImgLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(technologyImgLnk.get(i));
				webDriverActions.softScrollToElement(technologyImgLnk.get(i));
				webDriverActions.softClickJS(technologyImgLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(500);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTechnologyTitleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(technologyTitleLnk, 10);
		webDriverActions.softClickJS(technologyTitleLnk);
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
		webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");


	}

	public void verifyTechnologyReadMoreNavigation(String serverType)
	{
		String section = "/technology";
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(technologyReadMoreLnk , 10);
		String actual = webDriverActions.getAttribute("href", technologyReadMoreLnk);
		webDriverActions.softClickJS(technologyReadMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(), currentPage);
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyAutomobileArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(automobileTitleLnk , 10);
		softAssert.assertTrue(automobileArticleLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<automobileArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(automobileArticleLnk.get(i));
			webDriverActions.softScrollToElement(automobileArticleLnk.get(i));
			webDriverActions.softClickJS(automobileArticleLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(automobileArticleLnk.get(i));
				webDriverActions.softScrollToElement(automobileArticleLnk.get(i));
				webDriverActions.softClickJS(automobileArticleLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(500);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyAutomobileImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(automobileTitleLnk , 10);
		softAssert.assertTrue(automobileImgLnk.size()>1, "Possibly Element is not Visible");
		for(int i=0; i<automobileImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(automobileImgLnk.get(i));
			webDriverActions.softScrollToElement(automobileImgLnk.get(i));
			webDriverActions.softClickJS(automobileImgLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.refreshPage();
				webDriverActions.softMouseHover(automobileImgLnk.get(i));
				webDriverActions.softScrollToElement(automobileImgLnk.get(i));
				webDriverActions.softClickJS(automobileImgLnk.get(i));
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(500);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyAutomobileTitleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(automobileTitleLnk, 10);
		webDriverActions.softClickJS(automobileTitleLnk);
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
		webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");


	}

	public void verifyAutomobileReadMoreNavigation(String serverType)
	{
		String section = "/automobile";
		SoftAssert softAssert = new SoftAssert(); 
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
		webDriverActions.softMouseHover(employmentSectionLnk);
		webDriverActions.continuousScrollTillElement(automobileReadMoreLnk , 10);
		webDriverActions.softClickJS(automobileReadMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(), currentPage);
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyEducationArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, educationArticleLnks, articleBreadCrumbDiv);
	}

	public void verifyEducationImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, educationImgLnks, articleBreadCrumbDiv);
	}

	public void verifyEducationTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, educationTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyEducationReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, educationReadMoreLnk, articleBreadCrumbDiv , "/education");
	}

	public void verifyVideoArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, videosArticleLnk, articleBreadCrumbDiv);
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
		verifyMoreNewsNavigation(serverType, videosReadMoreLnk, articleBreadCrumbDiv , "/video");
	}


	//=======================================Sanjeeb's Business Logics====================================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Header Logo And Download App
	 */
	public void verfyMobileHeaderLogoAndDownloadAppIcon()
	{
		try {
			webDriverActions.waitForPageToLoad();
			String pageUrl=webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForSecond(1000);

			//Validating Header Logo by clicking on it
			webDriverActions.softHighlightElement(headerLogo);
			webDriverActions.softClickJS(headerLogo);
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softHighlightElement(headerLogo);
				webDriverActions.softClickJS(headerLogo);
			}
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Failed To display Header Icon");
			webDriverActions.navigateToUrl(pageUrl);

			//Validating Header Download App by clicking on it
			webDriverActions.softHighlightElement(headerDownloadAppLogo);
			webDriverActions.softClickJS(headerDownloadAppLogo);
			String url=webDriverActions.getAttribute("href", headerDownloadAppLogo);
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softHighlightElement(headerDownloadAppLogo);
				webDriverActions.softClickJS(headerDownloadAppLogo);
			}
			currentPage=webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Failed To display Header Icon");
			softAssert.assertTrue(url.equals(currentPage), "not navigated to proper pages"+url);
		}
		catch(Exception e)
		{
			softAssert.assertTrue(false, "Possibly Element Is Not Clickable or Visible");	
		}
		softAssert.assertAll("Issues Found In Validating Mobile Header Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Header Logo And Download App
	 */
	public void verifyHeaderDistrictSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		String pageUrl=webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(1000);
		webDriverActions.softClickJS(headerDistrictIcon);
		softAssert.assertTrue(districtEleLinks.size()>0, "Failed To display Header Icon");
		for(int i=0;i<districtEleLinks.size();i++)
		{
			webDriverActions.softHighlightElement(districtEleLinks.get(i));
			webDriverActions.softClickJS(districtEleLinks.get(i));
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(headerDistrictIcon);
				webDriverActions.softHighlightElement(districtEleLinks.get(i));
				webDriverActions.softClickJS(districtEleLinks.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Failed To display Header Icon");
			webDriverActions.navigateToUrl(pageUrl);
			webDriverActions.softClickJS(headerDistrictIcon);
		}
		softAssert.assertAll("Issues Found In Validating Mobile Header District Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Header Hamburger language Section
	 */
	public void verifyHamburgerLanguageSection()
	{
		webDriverActions.waitForPageToLoad();
		String pageUrl=webDriverActions.getCurrentPageUrl();
		String pageTitle=webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(1000);
		webDriverActions.softClickJS(headerHamburgerIcon);
		webDriverActions.softClickJS(changeLanguageIcon);
		softAssert.assertTrue(changelanguageLnks.size()>0, "Failed To display Header Icon");
		for(int i=0;i<changelanguageLnks.size();i++)
		{
			webDriverActions.softHighlightElement(changelanguageLnks.get(i));
			String title = webDriverActions.getAttribute("target", changelanguageLnks.get(i));
			webDriverActions.softClickJS(changelanguageLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(headerHamburgerIcon);
				webDriverActions.softClickJS(changeLanguageIcon);
				webDriverActions.softHighlightElement(changelanguageLnks.get(i));
				webDriverActions.softClickJS(changelanguageLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Failed To display Header Icon "+expected);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(headerHamburgerIcon);
				webDriverActions.softClickJS(changeLanguageIcon);

			}
		}
		softAssert.assertAll("Issues Found In Validating Mobile Hamburger Change Language Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Header Hamburger all Section except languages Section
	 */
	public void verifyHamburgerAllSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		String pageUrl=webDriverActions.getCurrentPageUrl();
		String pageTitle=webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(1000);
		webDriverActions.softClickJS(headerHamburgerIcon);
		softAssert.assertTrue(headerHamburgerSectionLnks.size()>0, "Failed To display Header Icon");
		for(int i=1;i<changelanguageLnks.size();i++)
		{
			webDriverActions.softHighlightElement(headerHamburgerSectionLnks.get(i));
			String title = webDriverActions.getAttribute("target", headerHamburgerSectionLnks.get(i));
			webDriverActions.softClickJS(headerHamburgerSectionLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(headerHamburgerIcon);
				webDriverActions.softHighlightElement(headerHamburgerSectionLnks.get(i));
				webDriverActions.softClickJS(headerHamburgerSectionLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(headerSection, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "Failed To display Header Icon "+expected);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softClickJS(headerHamburgerIcon);

			}
		}
		softAssert.assertAll("Issues Found In Validating Mobile Header District Section");
	}



	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Header Line One Section
	 */
	public void verifyHeaderLineOneSection(String server)
	{
		webDriverActions.waitForPageToLoad();
		String pageUrl=webDriverActions.getCurrentPageUrl();
		String pageTitle=webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(headerLineOneSectionEleLnks.size()>0, "Failed To display Header Icon");
		for(int i=1;i<headerLineOneSectionEleLnks.size();i++)
		{
			webDriverActions.softHighlightElement(headerLineOneSectionEleLnks.get(i));
			String title = webDriverActions.getAttribute("target", headerLineOneSectionEleLnks.get(i));
			webDriverActions.softClickJS(headerLineOneSectionEleLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.softHighlightElement(headerLineOneSectionEleLnks.get(i));
				webDriverActions.softClickJS(headerLineOneSectionEleLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			String pageTitlee = webDriverActions.getPageTitle();
			webDriverActions.softWaitForElementVisibility(headerTextLnk, 3);
			webDriverActions.stopPageLoading();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTextLnk), "Failed To display Header Icon "+expected);
			softAssert.assertTrue(!pageTitlee.contains("404"),"possiby issues in URL page not Found");
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageUrl);

			}
		}
		softAssert.assertAll("Issues Found In Validating Mobile Header District Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Trending Section Desktop Landing Page.
	 */
	public void verifyFooterSocialShareSection()
	{
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("jionews"));
		Logs.info(getClass(), list);

		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(facebookHeader);
		listEle.add(twitterHeader);
		listEle.add(instagramHeader);
		listEle.add(youtubeHeader);
		listEle.add(jioHeader);

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollDown();
		webDriverActions.softScrollToElement(footerSocialSection);
		webDriverActions.softMouseHover(footerSocialSection);
		webDriverActions.softHighlightElement(footerSocialSection);
		softAssert.assertTrue(footerSocialSectionEleList.size()>0, "Failed To display Header Icon");
		for(int i=0;i<footerSocialSectionEleList.size();i++)
		{
			webDriverActions.softHighlightElement(footerSocialSectionEleList.get(i));
			String title = webDriverActions.getAttribute("target", footerSocialSectionEleList.get(i));
			webDriverActions.softClickJS(footerSocialSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				webDriverActions.waitForSecond(1000);
			}
			String currentPage=webDriverActions.getCurrentPageUrl();
			if(currentPage.contains("google_vignette") || currentPage.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateToUrl(pageUrl);
				webDriverActions.scrollToLast();
				webDriverActions.waitForSecond(1000);
				webDriverActions.scrollDown();
				webDriverActions.softScrollToElement(footerSocialSection);
				webDriverActions.softMouseHover(footerSocialSection);
				webDriverActions.softHighlightElement(footerSocialSection);
				webDriverActions.softHighlightElement(footerSocialSectionEleList.get(i));
				webDriverActions.softClickJS(footerSocialSectionEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			String expected = webDriverActions.getCurrentPageUrl();
			String pageTitlee = webDriverActions.getPageTitle();
			for(int j=0;j<list.size();j++)
			{
				if(expected.contains(list.get(j)))
				{
					webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
				}
			}
			softAssert.assertTrue(!pageTitlee.contains("404"),"possiby issues in URL page not Found");
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(pageUrl);

			}
		}
		softAssert.assertAll("Issues Found In Validating Mobile Footer Social Share Section");
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
		webDriverActions.scrollDown();
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
