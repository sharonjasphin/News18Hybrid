package com.news18.tamilpages;

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
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This Class Contains elements and business logics for Tamil Desktop Landing  Page
 */
public class DesktopTamilLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public DesktopTamilLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'nhtranding')]//a[contains(@href,'/tag/')]")
	private List<WebElement> trendingTopicsLnk;

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_news_right')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a[not(contains(@href,'live')) and contains(@href,'/news/')]")
	private List<WebElement> homePageArticleLnk;

	/*Sports link present after clicking on line two*/
	@FindBy(xpath ="//div[contains(@class,'container')]//ul[contains(@class,'nav_bar')]//a[@href='/sports/']")
	private WebElement sportsSectionLnk;

	/*cinema link present at line one section*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[not(contains(@href,'/sports/'))]")
	private List<WebElement> sectionLnk;

	/*video link present at Footer section*/
	@FindBy(xpath ="//div[contains(@class,'video-gallery')]//a[@href='/videos/']")
	private WebElement videoSectionLnk;


	/*photo section Present  */
	@FindBy(xpath="//div[contains(@class,'sub_navigation')]//li/a[contains(@href,'/album/')]")
	private WebElement photoSectionLineOneLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'container')]//ul[contains(@class,'sub_navigation')]//a[@href='/news/']")
	private WebElement latestSectionLnk;

	//------------------------Anupam*Webelements--------------

	//---------Entertainment
	/* Entertainment section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]")
	private WebElement entertainmentSectionLnk;

	/*Entertainment section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> entertainmentSectionArticleLnk;

	/*Entertainment section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> entertainmentSectionImgLnk;

	/*Entertainment section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'section-box')]/div[contains(@class,'globalhd large')]//a[(@href='/entertainment/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreEntertainmentSectionLnk;

	/*Entertainment present in MobileAndTech article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement entertainmentBreadcrumb;

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/lifestyle/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement lifestyleBreadcrumb;

	//---------Technology
	/* Technology section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]")
	private WebElement technologySectionLnk;

	/* Technology section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> technologySectionArticleLnk;

	/* TechnologyTechnology section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> technologySectionImgLnk;

	/* Technology section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/technology/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreTechnologySectionLnk;

	/*Breadcrumb present in Technology article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]")
	private WebElement technologyBreadcrumb;

	//---------sport
	/* Sport section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sports/')]")
	private WebElement sportSectionLnk;

	/*Sport section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sports/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sports/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/sports/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreSportSectionLnk;

	/*Breadcrumb present in sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement sportBreadcrumb;

	//---------National
	/* National section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]")
	private WebElement nationalSectionLnk;

	/* National section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> nationalSectionArticleLnk;

	/* National section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> nationalSectionImgLnk;

	/* National section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/national/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreNationalSectionLnk;

	/*Breadcrumb present in National article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement nationalBreadcrumb;

	//---------spiritual
	/* Spiritual section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/spiritual/')]")
	private WebElement spiritualSectionLnk;

	/* spiritual section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/spiritual/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> spiritualSectionArticleLnk;

	/* spiritual section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/spiritual/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> spiritualSectionImgLnk;

	/* spiritual section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/spiritual/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreSpiritualSectionLnk;

	/*Breadcrumb present in spiritual article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement spiritualBreadcrumb;

	//---------Business
	/* Business section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]")
	private WebElement businessSectionLnk;

	/* Business section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> businessSectionArticleLnk;

	/* Business section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> businessSectionImgLnk;

	/* Business section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/business/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreBusinessSectionLnk;

	/*Breadcrumb present in Business article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement businessBreadcrumb;

	//---------Education
	/* Education section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/education/')]")
	private WebElement educationSectionLnk;

	/* Education section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/education/')]//ancestor::div[contains(@class,'section-box')]/ul/li/a")
	private List<WebElement> educationSectionArticleLnk;

	/* Education section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/education/')]//ancestor::div[contains(@class,'section-box')]/ul//figure//img")
	private List<WebElement> educationSectionImgLnk;

	/* Education section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[(@href='/education/')]//ancestor::div[contains(@class,'section-box')]/a")
	private WebElement readMoreEducationSectionLnk;

	/*Breadcrumb present in Education article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement educationBreadcrumb;

	//---------TrendingNewsRHS
	/* TrendingNewsRHS section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'top_story_section')]//a[(@href='/news/')]")
	private WebElement trendingNewsRHSSectionLnk;

	/* TrendingNewsRHS section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'top_story_section')]//a[(@href='/news/')]//ancestor::div[contains(@class,'top_story_section')]//li/a")
	private List<WebElement> trendingNewsRHSArticleLnk;

	/* TrendingNewsRHS section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'top_story_section')]//a[(@href='/news/')]//ancestor::div[contains(@class,'top_story_section')]//li//figure//img[not(@aria-hidden=\"true\")]")
	private List<WebElement> trendingNewsRHSImgLnk;

	/*Breadcrumb present in TrendingNewsRHS article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement trendingNewsRHSBreadcrumb;


	//---------Explainer
	/* Explainer section present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]")
	private WebElement explainerSectionLnk;

	/* Explainer section Article present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//li/a")
	private List<WebElement> explainerSectionArticleLnk;

	/* Explainer section Image present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//li//figure//img[not(@aria-hidden=\"true\")]")
	private List<WebElement> explainerSectionImgLnk;

	/* Explainer section Active Article present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//li[contains(@class,'active')]/a")
	private WebElement explainerSectionActiveArticleLnk;

	/* Explainer section Active Article Text present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//li[contains(@class,'active')]//h3")
	private WebElement explainerSectionActiveArticleTxt;

	/* Explainer section NextButton present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//button[contains(@class,'next')]")
	private WebElement explainerSectionNextButton;

	/* Explainer section PreviousButton present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/explainers/')]//ancestor::div[contains(@class,'news-story')]//button[contains(@class,'prev')]")
	private WebElement explainerSectionPreviousButton;

	/*Breadcrumb present in Explainer article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement explainerRHSBreadcrumb;


	//---------LiveNow
	/* LiveNow section present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]/h2")
	private WebElement liveNowSectionLnk;

	/* LiveNow section Article present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]//div[contains(@class,'lcinner')]//li/a")
	private List<WebElement> liveNowSectionTeamLnk;

	/* LiveNow section Article present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]//div[contains(@class,'lcinner')]//li[contains(@class,'active')]/a")
	private WebElement liveNowActiveTeamLnk;

	/* LiveNow section NextButton present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]//div[contains(@class,'score_arrow')]//button[contains(.,'next')]")
	private WebElement liveNowSectionNextButton;

	/* LiveNow section PreviousButton present in homepage at RHS*/
	@FindBy(xpath ="//div[contains(@class,'live_cwidget')]//div[contains(@class,'score_arrow')]//button[contains(.,'prev')]")
	private WebElement liveNowSectionPreviousButton;

	/*ScoreCard Header present in LiveNow article page*/
	@FindBy(xpath ="//div[contains(@id,'scorecardHeader')]//span")
	private WebElement scorecardHeader;

	/*Ads close button present in homepage*/
	@FindBy(xpath ="//div[contains(@id,'close_btn')]")
	private WebElement adsCloseBtn;


	// ---------------------------------------------- Vipin's Webelement ----------------------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd') or contains(@class,'bread') or contains(@class,'brade')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;
	/*List of Top Tamil News Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'topnews')]/div[contains(@class,'left')]/ul/li/a/h2")
	private List<WebElement> topTamilNewsArticleLnk;

	/*List of Top Tamil News Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'topnews')]/div[contains(@class,'left')]/ul/li//img")
	private List<WebElement> topTamilNewsImgLnk;

	/*List of Impoertant News Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'topnews')]/div[contains(@class,'right')]/ul/li/a/h3")
	private List<WebElement> importantNewsArticleLnk;

	/*Important News Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'topnews')]/div[contains(@class,'right')]/div//a")
	private WebElement importantNewsTitleLnk;

	/*Local News Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/news/tamil-nadu')]")
	private WebElement localNewsTitleLnk;

	/*Local News Cities Name Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradeshnavwrap')]//ul/li/a")
	private List<WebElement> localNewsCitiesNameLnk;

	/*Local News Cities Previous Slider Button */
	@FindBy(xpath = "//div[contains(@class,'pradeshnavwrap')]//div[contains(@data-glide-el,'controls')]/button[contains(@class,'prev')]")
	private WebElement localNewsPreviousSliderBtn;

	/*Local News Cities Next Slider Button */
	@FindBy(xpath = "//div[contains(@class,'pradeshnavwrap')]//div[contains(@data-glide-el,'controls')]/button[contains(@class,'next')]")
	private WebElement localNewsNextSliderBtn;

	/*Active Local News Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradeshnavwrap')]//ul/li[contains(@class,'glide__slide--active')]")
	private WebElement activeLocalNewsCitiesLnk;

	/*Local News Cities Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/ul/li//a")
	private List<WebElement> localNewsCitiesArticleLnk; 

	/*Local News Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pradesh-newswrap')]/parent::div/a")
	private WebElement localNewsReadMoreLnk;

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

	/*List of Article Links for Movies Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/ul[contains(@class,'superhitgalley')]/li/a//h3[1]")
	private List<WebElement> moviesArticleLnk;

	/*List of Image Links for Movies Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/ul[contains(@class,'superhitgalley')]/li/a//figure//img")
	private List<WebElement> moviesImgLnk;

	/*Movies Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/div[contains(@class,'global')]/h2/a[contains(@href,'/movies/')]")
	private WebElement moviesTitleLnk;

	/*Crime Incidents Title Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/crime/')]")
	private WebElement crimeTitleLnk;

	/*Crime Incidents Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/crime/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//h3")
	private List<WebElement> crimeArticleLnk;

	/*Crime Read More Link In Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/crime/')]/ancestor::div[contains(@class,'home-sports')]/div/a")
	private WebElement crimeReadMoreLnk;

	/*Crime Incidents Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/crime/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//img[@data-src]")
	private List<WebElement> crimeImgLnk;

	/*Crime Incidents Title Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/tamil-nadu/')]")
	private WebElement tamilnaduTitleLnk;

	/*Crime Incidents Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/tamil-nadu/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//h3")
	private List<WebElement> tamilnaduArticleLnk;

	/*Crime Incidents Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/tamil-nadu/')]/ancestor::div[contains(@class,'home-sports')]//ul/li/a//img[@data-src]")
	private List<WebElement> tamilnaduImgLnk;

	/*Crime Read More Link In Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home-sports')]/div[contains(@class,'global')]/h2/a[contains(@href,'/tamil-nadu/')]/ancestor::div[contains(@class,'home-sports')]/div/a")
	private WebElement tamilnaduReadMoreLnk;

	/*Photogallery Titile Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/div[contains(@class,'global')]/h2/a[contains(@href,'/photogallery')]")
	private WebElement photogalleryTitleLnk;

	/*Photogallery Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/ul[contains(@class,'photogallerystories')]/li/a//h3[1]")
	private List<WebElement> photogalleryArticleLnk;

	/*Photogallery Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/ul[contains(@class,'photogallerystories')]/li/a//img")
	private List<WebElement> photogalleryImgLnk;

	/*Video Articles Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/div[contains(@class,'video-gallery')]/ul/li/a//h3")
	private List<WebElement> videoArticleLnk;

	/*Video Articles Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/div[contains(@class,'video-gallery')]/ul/li/a//img")
	private List<WebElement> videoImgLnk;

	/*Videos Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'lazyload')]/div[contains(@class,'video-gallery')]/div[contains(@class,'global')]//a[contains(@href,'/videos/')]")
	private WebElement videoTitleLnk;

	/*Promoted Content Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]//span[contains(@class,'video-title')]")
	private List<WebElement> promotedContentArticleLst;

	/*Promoted Content Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'container')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> promotedContetntImgLnk;

	/*OutBrain Division Block present at the Footer Portion*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]")
	private WebElement outbrainBlock;

	//=========================================Sanjeeb's Elements=================================

	/*LineTwo Section Elements List present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'open_nav_sub')]//a")
	private List<WebElement> hamburgerMenuEleList;

	/*header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_open')]")
	private WebElement hamburgerMenuBtn;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')] | //div[contains(@class,'headerContainer')]//h2 | //div[contains(@class,'n18hcontainer')] ")
	private WebElement headerTxtLogoLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//h2")
	private WebElement twitterIcon;

	/*instagram and jio news Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//h2)[1] | //img[contains(@alt,'Instagram')]")
	private WebElement instaAndJioTxt;

	/*Header Text Link Present in google app store page*/
	@FindBy(xpath ="//header//a[contains(@href,'store/games')]")
	private WebElement playStoreHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="//div[contains(@class,'container')]//following-sibling::ul")
	private WebElement appleHeader;

	/*Header Text Link Present in apple app store page*/
	@FindBy(xpath ="(//div[contains(@class,'tgme_head')])[1]")
	private WebElement telegramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div//a[contains(@aria-label,'Facebook')]")
	private WebElement facebookHeader;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//div[contains(@class,'logo-renderer')])[1]")
	private WebElement youtubeIcon;

	/*Header Part Element of Lokmat*/
	@FindBy(xpath="//div[contains(@class,'nhhdr-nav')]/div/div[not (contains(@class,'languagebox'))]/a | //div[contains(@class,'nhhdr-nav')]/div[contains(@class,'tranding')]/a")
	private List<WebElement> headerEleList;

	/*header Section at Header Part*/
	@FindBy(xpath="(//div[contains(@class,'lnlivetv')])[1]")
	private WebElement headerSection;

	/*Crypto Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//section[contains(@class,'banner')]")
	private WebElement cryptoLogo;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'launch_info')]")
	private WebElement netraSurkshaIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'logo-lft')]")
	private WebElement moneyControlIcon;

	/*LineOne Section Elements List present at Header Part*/
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]/li[ not (contains(@class,'for-logo'))]//a")
	private List<WebElement> lineOneSectionEleList;

	/*LineTwo Section Elements List present at Header Part*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation')]//a")
	private List<WebElement> lineTwoSectionEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header_search')]/a")
	private WebElement headerSearchIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'gsc-input-box')]//input")
	private WebElement headerSearchInputBox;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//td[contains(@class,'gsc-search-button')]/button")
	private WebElement headerInnerSearchBtn;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'close-btn')]")
	private WebElement searchCancelBtn;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chsstctbtn')]")
	private WebElement rajyaSeherChuneLnk;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'navbar-header')] | //div[contains(@class,'logo bxshadow')]")
	private WebElement townHallAndTopLearningIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'logo-main')] ")
	private WebElement firstPostAndCnbcIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'header-wrap container')] | //div[contains(@class,'container')]")
	private WebElement historyAndMTvIcon;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')  or contains(@class,'head_homepage') or contains(@class,'stmimg')]")
	private WebElement moneyControlInstaPlayStoreIcon;

	/*header Text for CompareIndia*/
	@FindBy(xpath ="//div[contains(@class,'desklogo')]")
	private WebElement compareIndiaIcon;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'_acum')] | //div//img[contains(@alt,'Instagram')] | //div//img[contains(@alt,'Instagram')] | //div[contains(@style,'pointer')]")
	private WebElement instagramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'ytd-topbar')]")
	private WebElement youtubeHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@src,'JioNewsAppIcon')]")
	private WebElement jioHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//header[@role='banner']")
	private WebElement googlePlayHeader;


	/*Footer Latest Story Section*/
	@FindBy(xpath="//span[contains(text(),'Story Links')]/ancestor::div[contains(@class,'section_bar')]")
	private WebElement footerLatestStorySection;

	/*list Of elements present under Footer Latest Story Section*/
	@FindBy(xpath="//span[contains(text(),'Story Links')]/ancestor::div[contains(@class,'section_bar')]//a")
	private List<WebElement> footerLatestStoryEleSection;

	/*Footer Latest Trending Tag Section*/
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'section_bar')]")
	private WebElement footerTrendingTagSection;

	/*list Of elements present under Footer Trending Tag Section*/
	@FindBy(xpath="//span[contains(text(),'Trending')]/ancestor::div[contains(@class,'section_bar')]//a")
	private List<WebElement> footerTrendingTagEleSection;

	/*Footer Latest Story Section*/
	@FindBy(xpath="(//span[contains(text(),'Story')])[2]/ancestor::div[contains(@class,'section_bar')]")
	private WebElement footerLatestSection;

	/*list Of elements present under Footer Latest Story Section*/
	@FindBy(xpath="(//span[contains(text(),'Story')])[2]/ancestor::div[contains(@class,'section_bar')]//a")
	private List<WebElement> footerLatestEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'POPULAR ')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerPopularCategorySection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'POPULAR ')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerPopularCategoryEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'Language')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerLanguageSitesSection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'Language')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerLanguageSitesEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'Group Site')]/ancestor::div[contains(@class,'side_bar')]")
	private WebElement footerGroupSitesSection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//span[contains(text(),'Group Site')]/ancestor::div[contains(@class,'side_bar')]//a")
	private List<WebElement> footerGroupSitesEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]/descendant::div[contains(@class,'link_table')]")
	private WebElement footerLastLayerSection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]/descendant::div[contains(@class,'link_table')]//a")
	private List<WebElement> footerLastLayerEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]/descendant::div[contains(@class,'social_icon')]")
	private WebElement footerLastLayerSocialSection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]/descendant::div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerLastLayerSocialEleSection;

	/*Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'live_tv')]")
	private WebElement footerLiveTVSection;

	/*list Of elements present under Footer Popular Category Section*/
	@FindBy(xpath="//div[contains(@class,'live_tv')]/a")
	private List<WebElement> footerLiveTVEleSection;




	/**
	 * @author Abhishek
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in first Article Homepage", e);
		}	
	}


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
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
	 * @author Sanjeeb
	 * This method is used to click on sports link present on lineOne section
	 */
	public void clickOnSportsLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sportsSectionLnk);
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in sports Link", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Cinema link present on line one section
	 */
	public void clickOnFirstSectionLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnk.get(1));
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Section Link in HomePage ", e);
		}
	}


	/**
	 * @author Sanjeeb
	 * This method is used to click on Video link present on Line one section
	 */
	public void clickOnVideoLnk()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(videoSectionLnk, GlobalVariables.sec30);
			webDriverActions.click(videoSectionLnk);
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Videos Section Link", e);
		}	
	}


	/**
	 * @author Sanjeeb
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(trendingTopicsLnk.get(0));
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in First Trending Topic Link", e);
		}	
	}



	/**
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(),"Latest section link is not found");
		}
	}

	/**
	 * @author Abhishek
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		try {
			webDriverActions.continuousScrollTillElement(photoSectionLineOneLnk, GlobalVariables.sec30);;
			webDriverActions.clickJS(photoSectionLineOneLnk);
		}
		catch (NoSuchElementException e) {
			Logs.error(getClass(), "Exception in Photos Section Link", e);
		}	
	}

	//--------------------------------Anupam Business logic----
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
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 8);
		//		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		//		webDriverActions.softHighlightElement(section);
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			//			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

			webDriverActions.waitForSecond(200);
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
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in HomePage Body or RHS Article Navigation");	
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
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 8);		
		webDriverActions.softScrollToElement(section);
		//		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			//			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();

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
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body or RHS Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb,String page) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(moreLnk, 8);	
		//		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
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
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ " in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body or RHS More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb,String page) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 12);	
		//		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

		webDriverActions.waitForSecond(100);
		String currentPage = webDriverActions.getCurrentPageUrl();

		if (serverType.equalsIgnoreCase("preProd")) {
			if(currentPage.contains("//beta")) {
				Logs.info(getClass(), "url already contain beta");
			}
			else {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		//		webDriverActions.softHighlightElement(breadcrumb);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		webDriverActions.waitForSecond(100);
		softAssert.assertAll("Issue Found in HomePage Body or RHS Section Link");
	}

	//-----Entertainment
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	public void verifyEntertainmentWidget(String serverType) {
		verifySectionLnks(serverType,entertainmentSectionLnk, entertainmentBreadcrumb,"/entertainment");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	public void verifyEntertainmentWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,entertainmentSectionLnk,entertainmentSectionArticleLnk, entertainmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	public void verifyEntertainmentWidgetImg(String serverType) {
		verifyImgNavigation(serverType,entertainmentSectionLnk,entertainmentSectionImgLnk, entertainmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment More Link 
	 */
	public void verifyMoreEntertainmentLnk(String serverType) {
		verifySectionLnks(serverType,readMoreEntertainmentSectionLnk, entertainmentBreadcrumb,"/entertainment");
	}

	//-----Life

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,lifestyleSectionLnk, lifestyleBreadcrumb,"/lifestyle");
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
	 * This method is used to validate navigation of Lifestyle More Link 
	 */
	public void verifyMoreLifeLnk(String serverType) {
		verifySectionLnks(serverType,readMoreLifestyleSectionLnk, lifestyleBreadcrumb,"/lifestyle");
	}


	//---Technology

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	public void verifyTechnologyWidget(String serverType) {
		verifySectionLnks(serverType,technologySectionLnk, technologyBreadcrumb,"/technology");
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
	 * This method is used to validate navigation of Technology More Link 
	 */
	public void verifyMoreTechnologyLnk(String serverType) {
		verifySectionLnks(serverType,readMoreTechnologySectionLnk, technologyBreadcrumb,"/technology");
	}

	//-----Sport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	public void verifySportWidget(String serverType) {
		verifySectionLnks(serverType,sportSectionLnk, sportBreadcrumb,"/sports");
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
	 * This method is used to validate navigation of Technology More Link 
	 */
	public void verifyMoreSportLnk(String serverType) {
		verifySectionLnks(serverType,readMoreSportSectionLnk, sportBreadcrumb,"/sports");
	}


	///--
	//-----Natioanl
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National Widget
	 */
	public void verifyNationalWidget(String serverType) {
		verifySectionLnks(serverType,nationalSectionLnk, nationalBreadcrumb,"/national");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National Widget Article
	 */
	public void verifyNationalWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationalSectionLnk,nationalSectionArticleLnk, nationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National Widget Image
	 */
	public void verifyNationalWidgetImg(String serverType) {
		verifyImgNavigation(serverType,nationalSectionLnk,nationalSectionImgLnk, nationalBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National More Link 
	 */
	public void verifyMoreNationalLnk(String serverType) {
		verifySectionLnks(serverType,readMoreNationalSectionLnk, nationalBreadcrumb,"/national");
	}

	//-----Spiritual

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifySpiritualWidget(String serverType) {
		verifySectionLnks(serverType,spiritualSectionLnk, spiritualBreadcrumb,"/spiritual");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifySpiritualWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,spiritualSectionLnk,spiritualSectionArticleLnk, spiritualBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Spiritual Widget Image
	 */
	public void verifySpiritualWidgetImg(String serverType) {
		verifyImgNavigation(serverType,spiritualSectionLnk,spiritualSectionImgLnk, spiritualBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Spiritual More Link 
	 */
	public void verifyMoreSpiritualLnk(String serverType) {
		verifySectionLnks(serverType,readMoreSpiritualSectionLnk, spiritualBreadcrumb,"/spiritual");
	}


	//---Business

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	public void verifyBusinessWidget(String serverType) {
		verifySectionLnks(serverType,businessSectionLnk, businessBreadcrumb,"/business");
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
	 * This method is used to validate navigation of Business More Link 
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifySectionLnks(serverType,readMoreBusinessSectionLnk, businessBreadcrumb,"/business");
	}

	//-----Education
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education Widget
	 */
	public void verifyEducationWidget(String serverType) {
		verifySectionLnks(serverType,educationSectionLnk, educationBreadcrumb,"/education");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education Widget Article
	 */
	public void verifyEducationWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,educationSectionLnk,educationSectionArticleLnk, educationBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education Widget Image
	 */
	public void verifyEducationWidgetImg(String serverType) {
		verifyImgNavigation(serverType,educationSectionLnk,educationSectionImgLnk, educationBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education More Link 
	 */
	public void verifyMoreEducationLnk(String serverType) {
		verifySectionLnks(serverType,readMoreEducationSectionLnk, educationBreadcrumb,"/education");
	}


	//-----TrendingNewsRHS
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of TrendingNewsRHS Widget
	 */
	public void verifyTrendingNewsRHSWidget(String serverType) {
		verifySectionLnks(serverType,trendingNewsRHSSectionLnk, trendingNewsRHSBreadcrumb,"/news");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of TrendingNewsRHS Widget Article
	 */
	public void verifyTrendingNewsRHSWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,trendingNewsRHSSectionLnk,trendingNewsRHSArticleLnk, trendingNewsRHSBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of TrendingNewsRHS Widget Image
	 */
	public void verifyTrendingNewsRHSWidgetImg(String serverType) {
		verifyImgNavigation(serverType,trendingNewsRHSSectionLnk,trendingNewsRHSImgLnk, trendingNewsRHSBreadcrumb);
	}

	//-----ExplainerRHS
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget
	 */
	public void verifyExplainerRHSWidget(String serverType) {
		verifySectionLnks(serverType,explainerSectionLnk, explainerRHSBreadcrumb,"/explainers");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget Article
	 */
	public void verifyExplainerRHSWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,explainerSectionLnk,explainerSectionArticleLnk, explainerRHSBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget Image
	 */
	public void verifyExplainerRHSWidgetImg(String serverType) {
		verifyImgNavigation(serverType,explainerSectionLnk,explainerSectionImgLnk, explainerRHSBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button
	 */
	public void verifyNextButton(String serverType,WebElement section, WebElement activeArticleTxt,WebElement sectionNextButton) {
		SoftAssert softAssert = new SoftAssert();
		String prevText="";
		String currentText="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 8);
		webDriverActions.softScrollToElement(section);
		webDriverActions.waitForElement(1000);
		if(webDriverActions.softIsElementDisplayed(activeArticleTxt)) {
			prevText=webDriverActions.getTextFromElement(activeArticleTxt);
			Logs.info(getClass(), prevText);
		}
		webDriverActions.softHighlightElement(sectionNextButton);
		webDriverActions.softClickJS(sectionNextButton);
		webDriverActions.waitForSecond(500);
		if(webDriverActions.softIsElementDisplayed(activeArticleTxt)) {
			currentText=webDriverActions.getTextFromElement(activeArticleTxt);
			Logs.info(getClass(), currentText);
		}
		softAssert.assertNotEquals(prevText, currentText,"Possibly Next button is not working or only one article is Present");
		softAssert.assertAll("Issue Found in HomePage Body or RHS Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button
	 */
	public void verifyPreviousButton(String serverType,WebElement section, WebElement activeArticleTxt, WebElement sectionPreviousButton) {
		SoftAssert softAssert = new SoftAssert();
		String prevText="";
		String currentText="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(section, 8);
		webDriverActions.softScrollToElement(section);
		webDriverActions.waitForElement(1000);
		//		webDriverActions.softClickJS(explainerSectionNextButton);
		webDriverActions.waitForElement(500);
		if(webDriverActions.softIsElementDisplayed(activeArticleTxt)) {
			prevText=webDriverActions.getTextFromElement(activeArticleTxt);
			Logs.info(getClass(), prevText);
		}
		webDriverActions.softHighlightElement(sectionPreviousButton);
		webDriverActions.softClickJS(sectionPreviousButton);
		webDriverActions.waitForSecond(500);
		if(webDriverActions.softIsElementDisplayed(activeArticleTxt)) {
			currentText=webDriverActions.getTextFromElement(activeArticleTxt);
			Logs.info(getClass(), currentText);
		}
		softAssert.assertNotEquals(prevText, currentText,"Possibly Previous button is not working or only one article is Present");
		softAssert.assertAll("Issue Found in HomePage Body or RHS Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button in ExplainerRHS
	 */
	public void verifyExplainerRHSNextButton(String serverType) {
		verifyNextButton(serverType,explainerSectionLnk,explainerSectionActiveArticleTxt,explainerSectionNextButton);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Previous Button in ExplainerRHS
	 */
	public void verifyExplainerRHSPreviousButton(String serverType) {
		verifyPreviousButton(serverType,explainerSectionLnk,explainerSectionActiveArticleTxt,explainerSectionPreviousButton);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of LiveNowRHS Widget Team
	 */
	public void verifyLiveNowRHSWidgetTeams(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.continuousScrollTillElement(liveNowSectionLnk, 4);
		webDriverActions.softMouseHover(liveNowSectionLnk);
		//			webDriverActions.softScrollToElement(superHitBoxSectionLnk);
		webDriverActions.softHighlightElement(liveNowSectionLnk);
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(liveNowSectionTeamLnk.size()>0, " Possibly Element is Not Visible "+ liveNowSectionTeamLnk );
		for(int i=0; i<liveNowSectionTeamLnk.size() ;i++)
		{
			webDriverActions.navigateToNewTab(liveNowSectionTeamLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			webDriverActions.waitForSecond(2000);
			String currentPage = webDriverActions.getCurrentPageUrl();

			if (serverType.equalsIgnoreCase("preProd")) {
				if(currentPage.contains("//beta")) {
					Logs.info(getClass(), "url already contain beta");
				}
				else {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(scorecardHeader) , "Unable to Display Element "+scorecardHeader +"in "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.waitForSecond(1000);
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.softIsElementDisplayed(adsCloseBtn)) {
				webDriverActions.softClickJS(adsCloseBtn);
			}
			webDriverActions.waitForSecond(1000);
			webDriverActions.softClickJS(liveNowSectionNextButton);
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in HomePage Body or RHS Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button in LiveNowRHS
	 */
	public void verifyLiveNowRHSNextButton(String serverType) {
		verifyNextButton(serverType,liveNowSectionLnk,liveNowActiveTeamLnk,liveNowSectionNextButton);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Previous Button in LiveNowRHS
	 */
	public void verifyLiveNowRHSPreviousButton(String serverType) {
		verifyPreviousButton(serverType,liveNowSectionLnk,liveNowActiveTeamLnk,liveNowSectionPreviousButton);
	}


	// --------------------------- Vipin's Business Logic ---------------------------//


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
		//			String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		webDriverActions.softMouseHover(artList.get(0));
		webDriverActions.waitForElement(1000);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
			//				webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	/**
	 * @param imgList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Image Navigation  
	 */
	public void verifyImageNavigation(String serverType , List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(imgList, 15);
		webDriverActions.waitForElement(1000);
		if(imgList.size()>0)
		{
			webDriverActions.softMouseHover(imgList.get(0));
			webDriverActions.softScrollToElement(imgList.get(0));
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softHighlightElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				//								webDriverActions.waitForPageToLoad();
				String currentPage =webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if(expectedUrl.equalsIgnoreCase(homeUrl))
				{
					softAssert.fail("Unable to Navigate in "+actual);
				}
				else if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
				//					webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}		
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+imgList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @param moreLnk
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Widget News Navigation
	 */
	public void verifyMoreNewsNavigation(String serverType , WebElement moreLnk , WebElement element) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 15);
		webDriverActions.waitForElement(1000);					
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.highlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * @param element
	 * @param breadcrumb
	 * This method is used to Validate the Title Navigation for All Section In Homepage
	 */
	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(element,20);
		webDriverActions.waitForElement(1000);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in "+currentPage);
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

	public void verifyImportantNewsTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, importantNewsTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoviesArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, moviesArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoviesImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, moviesImgLnk, articleBreadCrumbDiv);
	}

	public void verifyMoviesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, moviesTitleLnk, articleBreadCrumbDiv);
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

	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 20);
		webDriverActions.waitForElement(500);
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
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
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
		if(webDriverActions.isElementDisplayed(activeWebstoriesArticleLnk))
		{
			for(int i = 0 ; i< webstoriesArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(800);
				String afterSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Slider Button Is Not Displayed ");
		}
	}

	public void verifyWebstoriesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , webstoriesTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyCrimeArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, crimeArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyCrimeImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, crimeImgLnk, articleBreadCrumbDiv);
	}

	public void verifyCrimeTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, crimeTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyCrimeReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, crimeReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyTamilNaduArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, tamilnaduArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTamilNaduImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, tamilnaduImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTamilNaduReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, tamilnaduReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyTamilNaduTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, tamilnaduTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, photogalleryArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, photogalleryImgLnk, articleBreadCrumbDiv);
	}

	public void verifyPhotogalleryTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, photogalleryTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyVideoArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(tamilnaduTitleLnk, 15);
		webDriverActions.softMouseHover(tamilnaduTitleLnk);
		webDriverActions.continuousScrollTillAllElement(videoArticleLnk, 10);
		softAssert.assertTrue(videoArticleLnk.size()>0 , "Possibly Elements is Not Visible");
		webDriverActions.waitForElement(1000);
		for(int i=0; i<videoArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(videoArticleLnk.get(i));
			webDriverActions.softScrollToElement(videoArticleLnk.get(i));
			webDriverActions.softClickJS(videoArticleLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
			//				webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.equals(expectedUrl) && expectedUrl.contains("//beta"))
			{
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyVideoImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(tamilnaduTitleLnk, 15);
		webDriverActions.softMouseHover(tamilnaduTitleLnk);
		webDriverActions.continuousScrollTillAllElement(videoImgLnk, 10);
		softAssert.assertTrue(videoImgLnk.size()>0 , "Possibly Elements is Not Visible");
		webDriverActions.waitForElement(1000);
		for(int i=0; i<videoImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(videoImgLnk.get(i));
			webDriverActions.softScrollToElement(videoImgLnk.get(i));
			webDriverActions.softClickJS(videoImgLnk.get(i));
			String currentPage =webDriverActions.getCurrentPageUrl();
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
			//				webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.equals(expectedUrl) && expectedUrl.contains("//beta"))
			{
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");


	}

	public void verifyVideoTitleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(tamilnaduTitleLnk,20);
		webDriverActions.softMouseHover(tamilnaduTitleLnk);
		webDriverActions.continuousScrollTillElement(videoTitleLnk , 10);
		webDriverActions.softClickJS(videoTitleLnk);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");

	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 */
	public void verifyLocalNewsTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, localNewsTitleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author VipinKumarGawande
	 * This method used to verify Lokmat Slider Navigation on Home Page
	 */
	public void verifyLocalNewsSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(localNewsNextSliderBtn, 10);
		webDriverActions.softMouseHover(localNewsNextSliderBtn);
		webDriverActions.softScrollToElement(localNewsNextSliderBtn);
		if(webDriverActions.isElementDisplayed(localNewsNextSliderBtn))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				String beforeSlide = webDriverActions.getTextFromElement(activeLocalNewsCitiesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(localNewsNextSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeLocalNewsCitiesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Next Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Next Slider Button Is Not Displayed ");
		}

		if(webDriverActions.isElementDisplayed(localNewsPreviousSliderBtn))
		{
			for(int i = 0 ; i< 10 ; i++)
			{
				webDriverActions.softMouseHover(localNewsPreviousSliderBtn);
				webDriverActions.softScrollToElement(localNewsPreviousSliderBtn);
				String beforeSlide = webDriverActions.getTextFromElement(activeLocalNewsCitiesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(localNewsPreviousSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(activeLocalNewsCitiesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Previous Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Previous Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue in Homepage Body ");
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

	/**
	 * @author VipinKumarGawande
	 * This method is used to click and navigate to Lokmat Cities Articles
	 */
	public void verifyLocalNewsArticleNavigation(String serverType)
	{

		List<String> list=new ArrayList<String>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(localNewsCitiesNameLnk, 10);
		webDriverActions.scrollDown();
		for(int i=0;i<localNewsCitiesNameLnk.size() ; i++)
		{
			webDriverActions.mouseHover(localNewsCitiesNameLnk.get(i));
			webDriverActions.softClickJS(localNewsCitiesNameLnk.get(i));
			webDriverActions.waitForSecond(1000);
			for(int j=0 ; j<localNewsCitiesArticleLnk.size() ; j++)
			{
				String attribute = localNewsCitiesArticleLnk.get(j).getAttribute("href");
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

	public void verifyLocalNewsReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(localNewsTitleLnk , 10);
		webDriverActions.waitForElement(1000);

		/* Below loop validates the Lokmat cities articles Navigations */
		for (int i = 0; i < localNewsCitiesNameLnk.size() ;i++) {
			webDriverActions.softHighlightElement(localNewsCitiesNameLnk.get(i));
			webDriverActions.softMouseHover(localNewsCitiesNameLnk.get(i));
			webDriverActions.softClickJS(localNewsCitiesNameLnk.get(i));
			webDriverActions.waitForSecond(1000);
			webDriverActions.softMouseHover(localNewsReadMoreLnk);
			webDriverActions.softClickJS(localNewsReadMoreLnk);
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in ");
			if (serverType.contains("preProd") && expectedUrl.contains("//beta") ) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else
			{
				webDriverActions.navigateBack();
			}
		}
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads Article Navigation in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyPromotedContentArticleNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(promotedContentArticleLst.size()>=1)
		{
			for(int i =0 ; i<promotedContentArticleLst.size() ; i++)
			{
				softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContentArticleLst.get(i)) , "Failed to Display " +promotedContentArticleLst);
				webDriverActions.softMouseHover(promotedContentArticleLst.get(i));
				webDriverActions.softHighlightElement(promotedContentArticleLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleLst.get(i)));
				webDriverActions.softClickJS(promotedContentArticleLst.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String title = webDriverActions.getPageTitle();
				softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Unable to Verify Promoated Content Article in "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads Article Navigation in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyPromotedContentImageNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(promotedContetntImgLnk.size()>=1)
		{
			for(int i =0 ; i<promotedContetntImgLnk.size() ; i++)
			{
				softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContetntImgLnk.get(i)) , "Failed to Display " +promotedContentArticleLst);
				webDriverActions.softMouseHover(promotedContetntImgLnk.get(i));
				webDriverActions.softHighlightElement(promotedContetntImgLnk.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContetntImgLnk.get(i)));
				webDriverActions.softClickJS(promotedContetntImgLnk.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String title = webDriverActions.getPageTitle();
				softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Unable to Verify Promoated Content Image in "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}

	//=========================================Sanjeeb's Business Logics==============================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Hamburger Menu Present On Header of Lokmat Language.
	 */
	public void verifyHamburgerMenu(String server) {
		SoftAssert softAssert = new SoftAssert();
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerMenuBtn);
		softAssert.assertTrue(hamburgerMenuEleList.size()>0, "Possibly Element Is Not Visible For This URL "+actual);	
		if (hamburgerMenuEleList.size()>0) {
			for (int i = 0; i < hamburgerMenuEleList.size(); i++) {
				webDriverActions.softHighlightElement(hamburgerMenuEleList.get(i));
				webDriverActions.softMouseHover(hamburgerMenuEleList.get(i));
				webDriverActions.softClickJS(hamburgerMenuEleList.get(i));
				actual = webDriverActions.getCurrentPageUrl();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);
				if(actual.equals(currentPage))
				{
					webDriverActions.navigateBack();
				}
				else
				{
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softClickJS(hamburgerMenuBtn);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+hamburgerMenuEleList.size());
		}
		softAssert.assertAll("Issues found in Hamburger Menu "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is use to Verify Header Section Present on HomePage.
	 */
	public void verifyHeaderSection(String server) {
		SoftAssert softAssert = new SoftAssert();
		String expected ="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();

		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));
		list.add(fileUtility.readDataFromPropertyFile("instagram"));
		list.add(fileUtility.readDataFromPropertyFile("youtube"));
		list.add(fileUtility.readDataFromPropertyFile("googlePlay"));
		list.add(fileUtility.readDataFromPropertyFile("apple"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));
		Logs.info(getClass(), list);
		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(facebookHeader);
		listEle.add(twitterIcon);
		listEle.add(instaAndJioTxt);
		listEle.add(youtubeIcon);
		listEle.add(playStoreHeader);
		listEle.add(appleHeader);
		listEle.add(telegramHeader);

		if (headerEleList.size()>0) {
			webDriverActions.softMouseHover(headerSection);
			for (int i = 0; i < headerEleList.size(); i++) {
				expected =webDriverActions.getAttribute("href", headerEleList.get(i));
				if(expected.contains("facebook") || expected.contains("twitter") || expected.contains("instagram") || expected.contains("youtube") || expected.contains("play.google.com") || expected.contains("apple") || expected.contains("t.me"))
				{
					webDriverActions.softMouseHover(headerEleList.get(i));
					webDriverActions.softHighlightElement(headerEleList.get(i));
					String title = webDriverActions.getAttribute("target", headerEleList.get(i));
					webDriverActions.softClickJS(headerEleList.get(i));
					if(title.contains("_blank"))
					{
						webDriverActions.switchToNewWindow();
					}
					else
					{
						Logs.info(getClass(), expected);
					}
					expected = webDriverActions.getCurrentPageUrl();
					for(int j=0;j<list.size();j++)
					{
						if(expected.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
						}
					}
					if(title.contains("_blank"))
					{
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentTitle);
					}
					else
					{
						webDriverActions.navigateBack();
					}
				}
				else
				{
					webDriverActions.mouseHover(headerEleList.get(i));
					webDriverActions.softHighlightElement(headerEleList.get(i));
					String title = webDriverActions.getAttribute("target", headerEleList.get(i));
					webDriverActions.softClickJS(headerEleList.get(i));
					if(title.contains("_blank"))
					{
						webDriverActions.switchToNewWindow();
					}
					else
					{
						Logs.info(getClass(), expected);
					}
					expected = webDriverActions.getCurrentPageUrl();
					String currentPage = webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd") && !expected.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(expected);
						expected=betaUrl;
						webDriverActions.navigateToUrl(expected);
					}
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+expected);	
					if(title.contains("_blank"))
					{
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentTitle);
					}
					else
					{
						if(expected.equals(currentPage))
						{
							webDriverActions.navigateBack();
						}
						else
						{
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}
					}
				}

			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+headerEleList.size());
		}
		softAssert.assertAll("Issues Found In Header Section "+ expected);
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to Verify Header Line Two Third Party Section
	 */
	public void verifyLineOneAndTwoSection(String server,List<WebElement> lineTwoSectionEleList) {
		SoftAssert softAssert = new SoftAssert();
		String actual="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		//it takes the social share Url from property File
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("moneycontrol"));
		list.add(fileUtility.readDataFromPropertyFile("crypto"));
		list.add(fileUtility.readDataFromPropertyFile("netrasuraksha"));

		//it add the element of social share icons.
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(moneyControlIcon);
		listEle.add(cryptoLogo);
		listEle.add(netraSurkshaIcon);
		if (lineTwoSectionEleList.size()>0)
		{
			for (int i = 0; i < lineTwoSectionEleList.size(); i++) 
			{
				String lineTwo = webDriverActions.getAttribute("href", lineTwoSectionEleList.get(i));
				webDriverActions.softHighlightElement(lineTwoSectionEleList.get(i));
				webDriverActions.softMouseHover(lineTwoSectionEleList.get(i));
				String title = webDriverActions.getAttribute("target", lineTwoSectionEleList.get(i));
				webDriverActions.softClickJS(lineTwoSectionEleList.get(i));
				if(title.contains("_blank")) 
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), lineTwo);
				}
				actual =webDriverActions.getCurrentPageUrl();
				String currentPage =webDriverActions.getCurrentPageUrl();
				if(lineTwo.contains("moneycontrol") || lineTwo.contains("crypto") || lineTwo.contains("netrasuraksha"))
				{
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							webDriverActions.softWaitForElementVisibility(listEle.get(j), 3);
							webDriverActions.stopPageLoading();
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);
						}
					}
					if(title.contains("_blank"))
					{
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentTitle);
					}
					else
					{
						webDriverActions.navigateBack();
					}
				}
				else
				{
					if(server.contains("preProd") && !actual.contains("//beta"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					webDriverActions.waitForSecond(1000);
					webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL "+actual);
					if(actual.equals(currentPage))
					{
						webDriverActions.navigateBack();
					}
					else
					{
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+lineTwoSectionEleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ actual);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line one Section Present On Header of Lokmat Language.
	 */
	public void verifyLineOneSection(String server) {
		verifyLineOneAndTwoSection(server, lineOneSectionEleList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line Two Section Present On Header of Lokmat Language.
	 */
	public void verifyLineTwoSection(String server) {
		verifyLineOneAndTwoSection(server, lineTwoSectionEleList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify line Two Section Present On Header of Lokmat Language.
	 */
	public void verifyLineOneSearchSection() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(headerSearchIcon);
		webDriverActions.inputText(headerSearchInputBox, "NEWS 18");
		webDriverActions.softClickJS(headerInnerSearchBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(searchCancelBtn), "Possibly Element Is Not Visible For This URL ");
		softAssert.assertAll("Google Search Button Verification Failed");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Rajya Seher Chune Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionRajyaSeherChune(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		if (apnaSeherChuneEleList.size()>0) {
			for (int i = 0; i <apnaSeherChuneEleList.size(); i++) {	

				webDriverActions.softHighlightElement(apnaSeherChuneEleList.get(i));
				webDriverActions.clickJS(apnaSeherChuneEleList.get(i));
				String actual = webDriverActions.getCurrentPageUrl();
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd")&& !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				webDriverActions.softWaitForElementVisibility(headerTxtLogoLnk, 3);
				webDriverActions.stopPageLoading();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtLogoLnk), "Possibly Element Is Not Visible For This URL ");
				if(actual.equals(expected))
				{				
					webDriverActions.navigateBack();
				}
				else
				{
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softClickJS(rajyaSeherChuneLnk);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+apnaSeherChuneEleList.size());
		}
		softAssert.assertAll("Rajya seher chune Validation Failed");
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Section Desktop Landing Page.
	 */
	public void verifyFooterSection(String server,List<WebElement> eleList,WebElement Section,WebElement header)
	{
		SoftAssert softAssert = new SoftAssert();
		String actual = "";
		String page="";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softMouseHover(Section);
		webDriverActions.softHighlightElement(Section);
		if (eleList.size()>0) {
			for (int i = 0; i < eleList.size(); i++) {
				webDriverActions.softHighlightElement(eleList.get(i));
				webDriverActions.softMouseHover(eleList.get(i));
				String pageUrl=webDriverActions.getAttribute("href", eleList.get(i));
				String title = webDriverActions.getAttribute("target", eleList.get(i));
				webDriverActions.softClickJS(eleList.get(i));
				if(title.contains("_blank")) 
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), title);
				}
				actual = webDriverActions.getCurrentPageUrl();
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !actual.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				webDriverActions.softWaitForElementVisibility(header, 3);
				webDriverActions.stopPageLoading();
				page=webDriverActions.getPageTitle();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);
				softAssert.assertTrue(!page.contains("404"),"possiby issues in URL page not Found");
				softAssert.assertTrue(pageUrl.equals(expected),"Possibly its Not Navigate To the proper page");
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(parentTitle);
				}
				else
				{
					if(expected.equals(actual))
					{
						webDriverActions.navigateBack();
					}
					else
					{
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}
				}
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+eleList.size());
		}
		softAssert.assertAll("Issues found in this Url "+ page);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Second Section Desktop Landing Page.
	 */
	public void verifyFooterSecondSection(List<WebElement> eleList,WebElement Section,WebElement header)
	{
		SoftAssert softAssert = new SoftAssert();
		String actual = "";
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
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
		listEle.add(firstPostAndCnbcIcon);
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
				webDriverActions.softHighlightElement(eleList.get(i));
				webDriverActions.mouseHover(eleList.get(i));
				String title = webDriverActions.getAttribute("target", eleList.get(i));
				webDriverActions.softClickJS(eleList.get(i));
				if(title.contains("_blank")) 
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), title);
				}
				actual = webDriverActions.getCurrentPageUrl();
				if(actual.contains("topperlearning") || actual.contains("firstpost") || actual.contains("cnbctv18") || actual.contains("historyindia") || actual.contains("mtvindia") || actual.contains("moneycontrol") || actual.contains("play.google.com") || actual.contains("compareindia") || actual.contains("caprep18") || actual.contains("facebook") || actual.contains("twitter") || actual.contains("instagram") || actual.contains("youtube") || actual.contains("jionews") || actual.contains("apple"))
				{
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							webDriverActions.softWaitForElementVisibility(listEle.get(j),3);
							webDriverActions.stopPageLoading();
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+actual);	
						}
					}
					if(title.contains("_blank"))
					{
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentTitle);
					}
					else
					{
						webDriverActions.navigateBack();

					}

				}
				else
				{
					webDriverActions.softWaitForElementVisibility(header,3);
					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(header), "Possibly Element Is Not Visible For This URL "+actual);	
					if(title.contains("_blank"))
					{
						webDriverActions.closeDriver();
						webDriverActions.switchToWindow(parentTitle);
					}
					else
					{
						webDriverActions.navigateBack();

					}
				}
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
	 * This method used to verify Footer Latest Story Section Desktop Landing Page.
	 */
	public void verifyFooterLatestStorySection(String server)
	{
		verifyFooterSection(server, footerLatestStoryEleSection, footerLatestStorySection, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Trending Tag Section Desktop Landing Page.
	 */
	public void verifyFooterTrendingTagSection(String server)
	{
		verifyFooterSection(server, footerTrendingTagEleSection, footerTrendingTagSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Trending Tag Section Desktop Landing Page.
	 */
	public void verifyFooterLatestSection(String server)
	{
		verifyFooterSection(server, footerLatestEleSection, footerLatestSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer popular category Section Desktop Landing Page.
	 */
	public void verifyFooterPopularCategorySection(String server)
	{
		verifyFooterSection(server, footerPopularCategoryEleSection, footerPopularCategorySection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer popular category Section Desktop Landing Page.
	 */
	public void verifyFooterLanguageSitesSection()
	{
		verifyFooterSecondSection(footerLanguageSitesEleSection, footerLanguageSitesSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Group Sites Section Desktop Landing Page.
	 */
	public void verifyFooterGroupSitesSection()
	{
		verifyFooterSecondSection(footerGroupSitesEleSection, footerGroupSitesSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify FooterLast Layer Section Desktop Landing Page.
	 */
	public void verifyFooterLastLayerSection()
	{
		verifyFooterSecondSection(footerLastLayerEleSection, footerLastLayerSection, headerTxtLogoLnk);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify FooterLast Layer Section Desktop Landing Page.
	 */
	public void verifyFooterLastLayerSocialSection()
	{
		verifyFooterSecondSection(footerLastLayerSocialEleSection, footerLastLayerSocialSection, headerTxtLogoLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Live TV Section Desktop Landing Page.
	 */
	public void verifyFooterLiveTVSection(String server)
	{
		verifyFooterSection(server,footerLiveTVEleSection, footerLiveTVSection, headerTxtLogoLnk);
	}

}
