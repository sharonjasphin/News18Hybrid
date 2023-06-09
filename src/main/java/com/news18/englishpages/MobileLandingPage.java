package com.news18.englishpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public MobileLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*photos section present in Line one in home page*/
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//a[(@href='/photogallery/')]")
	private WebElement photoSectionLnk;

	/*Footer section present in  home page*/
	@FindBy(xpath ="//footer")
	private WebElement footerLnk;

	/*Homepage List of article Link for news18 home Page*/
	@FindBy(xpath ="//ul[contains(@class,'story_listing')]/li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 home Page*/
	@FindBy(xpath ="//div[contains(@class,'home_page')]//a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*cricketNext section present in Line one in home page*/
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//a[@href='/cricketnext/']")
	private WebElement cricketNextSectionLnk;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="(//div//ul//li//a[contains(text(),'Latest')])[1]")
	private WebElement latestSectionLnk;

	/*Mobile View Tracker Lnk is present in Header of News18 Mobile View*/
	@FindBy(xpath = "//div[contains(@class,'main_header')]//li/a[contains(@id,'trackerClick')]")
	private WebElement  mobViewTrackerLnk;

	/*Mobile Covid Updated Time Tracker Lnk is present in Header of News18 Mobile View*/
	@FindBy(xpath="//div[contains(@class,'corona-m-ftr')]//ul//span")
	private WebElement mobileCovidUpdatedTime;

	/* video section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//ul//a[contains(@href,'/videos')]" )
	private WebElement videoSectionLnk;

	/*India Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'L1_neuWrapper')]//a[contains(@href,'/india/')]")
	private WebElement indiaSectionLnk;

	/* Link of Gold Price Today in footer Tending Topics section in Homepage */
	@FindBy(xpath ="//div[contains(@class,'link_table w3 trand')]//a[contains(@href,'topics') and contains(text(),'Gold')]" )
	private WebElement footerGoldPriceTopicLnk;

	//======================================================MOBILE ENGLISH=============================================================

	//======================================= web elements for Line One Sections =================================================

	/*Click On Movie Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/movies/']")
	private WebElement movieEle;

	/*Click On cricket Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/cricketnext/']")
	private WebElement cricketEle;

	/*Click On india Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/india/']")
	private WebElement indiaEle;

	/*Click On showsha Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/entertainment/']")
	private WebElement showshaEle;

	/*Click On politics Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/politics/']")
	private WebElement politicsEle;

	/*Click On world Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/world/']")
	private WebElement worldEle;

	/*Click On education Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/education-career/']")
	private WebElement educationEle;

	/*Click On business Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/business/']")
	private WebElement businessEle;

	/*Click On buzz Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/buzz/']")
	private WebElement buzzEle;

	/*Click On opinion Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/opinion/']")
	private WebElement opnionEle;

	/*Click On photos Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/photogallery/']")
	private WebElement photosEle;

	/*Click On videos Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/videos/']")
	private WebElement videsoEle;

	/*Click On latest Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/news/']")
	private WebElement latestEle;

	/*Click On lifeStyle Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/lifestyle/']")
	private WebElement lifeStyleEle;

	/*Click On webStories Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/web-stories/']")
	private WebElement webStoriesEle;

	/*Click On expliners Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/explainers/']")
	private WebElement explinersEle;

	/*Click On sports Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/sports/']")
	private WebElement sportsEle;

	/*Click On tech Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/tech/']")
	private WebElement techEle;

	/*Click On auto Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/auto/']")
	private WebElement autoEle;

	/*Click On Astrology Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/auto/']")
	private WebElement astrologyEle;



	//	***********************Danish**WebElement*************************

	/* Home Page Header Logo */
	@FindBy(xpath ="//div[contains(@class,'logo_box')]" )
	private WebElement headerLogo;

	/* Home Page Header covid Tracker */
	@FindBy(xpath ="//div[contains(@class,'header')]//following-sibling::ul//li/a[@id='trackerClick']")
	private WebElement headerTracker;

	/* Home Page Header covid Tracker close icon */
	@FindBy(xpath ="//div[contains(@class,'cross-icon')]")
	private WebElement trackerCloseIcon;

	/* Home Page Header covid Tracker close icon */
	@FindBy(xpath ="//ul//li[contains(@id,'mobile-search-icon')]/a")
	private WebElement searchBtnLnk;

	/* Home Page Header covid Tracker close icon */
	@FindBy(xpath ="//div[contains(@class,'input-box')]//input")
	private WebElement searchInputBox;

	/* Home Page Header covid Tracker close icon */
	@FindBy(xpath ="//div[contains(@class,'wrapper')]//td[contains(@class,'search-button')]")
	private WebElement searchBtn;

	/* Home Page Header covid Tracker close icon */
	@FindBy(xpath ="//div[contains(@class,'close-btn')]")
	private WebElement searchCloseBtn;

	//****************************Sanjeeb***WebElements*******************

	/*Mobile_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'social_share')]//a | //div[contains(@class,'socalWrap')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'social_share')] | //div[contains(@class,'socalWrap')]")
	private WebElement allShareIcons;

	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/*LiveTv*/
	@FindBy(xpath ="//ul//li[contains(@class,'livetv_icon_wrp')]/a")
	private WebElement liveTVBtn;

	/*Latest Section Articles */
	@FindBy(xpath="//div[contains(@class,'L1_neuWrapper')]//a")
	private List<WebElement>  lineOneSectionElementsList;

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'nwhdrrgt')]/a[contains(@id,'search-top-goog')]")
	private WebElement searchhBtnLnk;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeeBtn;

	/*Search Box Button present after clicking on Search Icon present on the Line One Section*/
	@FindBy(xpath ="//div[contains(@class,'gsc-input-box')]//input")
	private WebElement searchBoxBtn;

	/*Search Icon Present After Clicking on The Search Btn Present On the Line One Bar */
	@FindBy(xpath ="//*[local-name()='svg']/parent::button")
	private WebElement insideSearchIcon;

	/*Choose Your City Btn Present On Header LineOne*/
	@FindBy(xpath="//div[contains(@class,'nwhdrrgt')]/a[not (contains(@id,'search-top-goog'))]")
	private WebElement apnaSeherChuneBtn;

	/*Choose Your City Btn Present On Header LineOne*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]")
	private WebElement chooseYourCitySectionHeader;

	/*list Of elements present under apna Seher chune Header*/
	@FindBy(xpath="//div[contains(@class,'tpctlits')]//a")
	private List<WebElement> chooseYourCitySectionHeaderEleList;

	/*Choose Your City Btn Present On Footer LineOne*/
	@FindBy(xpath="(//div[contains(@class,'tpstatesnames')])[1]")
	private WebElement chooseYourCitySectionFooter;

	/*list Of elements present under apna Seher chune Footer*/
	@FindBy(xpath="(//div[contains(@class,'tpstatesnames')])[1]/ul/li")
	private List<WebElement> chooseYourCitySectionFooterEleList;

	/*list Of elements present under apna Seher chune Footer*/
	@FindBy(xpath="(//div[contains(@class,'tpstatesnames')])[1]/ul/li/a")
	private List<WebElement> chooseYourCitySectionFooterSectionEleList;

	/*list Of all elements present under rajya Section*/
	@FindBy(xpath="//li[contains(@class,'active')]//parent::li/child::div/a")
	private List<WebElement> rajyaSectionFooterEleDropDwn;

	/*hamburger Menu Btn Present on header line one Section*/
	@FindBy(xpath="//div[contains(@class,'Hamburger_icon')]")
	private WebElement hamburgerMenuBtn;

	/*hamburger Menu Header Social Section*/
	@FindBy(xpath="//div[contains(@class,'nwnavpopu-hdrrgt')]")
	private WebElement hamburgerMenuSocialSection;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'nwnavpopu-hdrrgt')]/a")
	private List<WebElement> hamburgerMenuSocialSectionEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="//ul[contains(@class,'nwnavpopu-insidenv-right')]")
	private WebElement hamburgerMenuRHSSection;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//ul[contains(@class,'nwnavpopu-insidenv-right')]//a")
	private List<WebElement> hamburgerMenuRHSSectionEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="//div[contains(@class,'headerNav_accordion')]/div[text()='Sections']")
	private WebElement hamburgerMenuLHSSectionWidget;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'sections')]//a")
	private List<WebElement> hamburgerMenuLHSSectionWidgetEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="//div[contains(@class,'headerNav_accordion')]/div[text()='Nw18 Initiatives']")
	private WebElement hamburgerMenuLHSNews18InitiativesWidget;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'nw18-initiatives')]//a")
	private List<WebElement> hamburgerMenuLHSNews18InitiativesWidgetEleList;

	/*groupsites*/
	@FindBy(xpath="//div[contains(@class,'headerNav_accordion')]/div[text()='Group Sites']")
	private WebElement hamburgerMenuLHSGroupSitesWidget;

	/*groupsites*/
	@FindBy(xpath="//div[contains(@class,'group-sites')]//a")
	private List<WebElement> hamburgerMenuLHSGroupSitesWidgetEleList;

	/*Know Us*/
	@FindBy(xpath="//div[contains(@class,'headerNav_accordion')]/div[text()='Know Us']")
	private WebElement hamburgerMenuLHSKnowUsWidget;

	/*Know us Ele*/
	@FindBy(xpath="//div[contains(@class,'know-us')]//a")
	private List<WebElement> hamburgerMenuLHSKnowUsWidgetEleList;

	/*Know Us*/
	@FindBy(xpath="//div[contains(@class,'right')]/h4")
	private WebElement hamburgerMenuLHSInTrendsWidget;

	/*Know us Ele*/
	@FindBy(xpath="//ul[contains(@class,'inTrendsList')]/li/a")
	private List<WebElement> hamburgerMenuLHSInTrendsWidgetEleList;

	/*Social Share Section*/
	@FindBy(xpath="//ul[contains(@class,'nav_social')]")
	private WebElement hamburgerMenuSocialShareSection;

	/*Social Share Icons*/
	@FindBy(xpath="//ul[contains(@class,'nav_social')]//a[not (contains(@href,'insta'))]")
	private List<WebElement> hamburgerMenuSocialShareSectionWidgetEleList;

	/*ChangeLangauge*/
	@FindBy(xpath="//div[contains(@class,'language_click')]")
	private WebElement hamburgerChnageLanguageSection;

	/*Change Language Ele List*/
	@FindBy(xpath="//ul[contains(@class,'lang_list')]//a")
	private List<WebElement> hamburgerChnageLanguageSectionEleList;

	/*Social Share Section*/
	@FindBy(xpath="//ul[contains(@class,'other_links')]//a[contains(@href,'play.google.com')]")
	private WebElement hamburgerDownloadApp;

	/*Social Share Section*/
	@FindBy(xpath="//ul[contains(@class,'other_links')]//a[contains(@href,'livetv')]")
	private WebElement hamburgerMenuLiveTVSection;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//div[contains(@class,'ftr_row')]")
	private WebElement footerFirstLayer;

	/*list Of all elements present on app down load section after clicking on download app btn present on footer */
	@FindBy(xpath="//div[contains(@class,'ftr_row')]//a")
	private List<WebElement> footerFirstLayerEleList;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]")
	private WebElement footerfollowUsSection;

	/*list Of all elements present on app down load section after clicking on download app btn present on footer */
	@FindBy(xpath="//div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerfollowUsSectionEleList;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//footer[contains(@class,'common-footer')]")
	private WebElement footerLastLayerSection;

	/*list Of all elements present on app down load section after clicking on download app btn present on footer */
	@FindBy(xpath="//footer[contains(@class,'common-footer')]//div[contains(@class,'social_net') or contains(@class,'ftr_container')]//a")
	private List<WebElement> footerLastLayerSectionEleList;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//div[contains(@class,'side_bar live_tv dropdown')]/a")
	private WebElement footerLiveTvSection;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//ul[contains(@class,'btnvav')]")
	private WebElement footerStickySection;

	/*list Of all elements present on app down load section after clicking on download app btn present on footer */
	@FindBy(xpath="//ul[contains(@class,'btnvav')]//a")
	private List<WebElement> footerStickySectionEleList;

	//***********************************Anupam***Webelemt************************

	/* movie section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']" )
	private WebElement moviesWidgetSectionLnk;

	/*movie widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/ul/li/a")
	private List<WebElement> moviesWidgetArticleLnk;

	/*movie widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/ul/li//img")
	private List<WebElement> moviesWidgetImgLnk;

	/*movie  article body Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'article-body')])[1]")
	private WebElement moviesArticleBody;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/span)[1]  |  (//div[contains(@class,'breadcum')])[1]")
	private WebElement moviesArticleBreadcrumb;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement moviesMoreBreadcrumb;

	/*more movies Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/movies/']/parent::div/div/a")
	private WebElement moreMoviesWidgetLnk;

	////------cricketnext

	/* CricketNext section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']" )
	private WebElement cricketNextWidgetSectionLnk;

	/*CricketNext widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/ul/li/a")
	private List<WebElement> cricketNextWidgetArticleLnk;

	/*CricketNext widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/ul/li//img")
	private List<WebElement> cricketNextWidgetImgLnk;

	/*more CricketNext Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/cricketnext/']/parent::div/div/a")
	private WebElement moreCricketNextWidgetLnk;

	/*movie  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/p)[1]")
	private WebElement cricketNextBreadcrumb;


	////------india

	/* india section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']" )
	private WebElement indiaWidgetSectionLnk;

	/*india widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/ul/li/a")
	private List<WebElement> indiaWidgetArticleLnk;

	/*india widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/ul/li//img")
	private List<WebElement> indiaWidgetImgLnk;

	/*more india Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/india/']/parent::div/div/a")
	private WebElement moreIndiaWidgetLnk;

	/*india article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement indiaBreadcrumb;


	////------business

	/* business section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']" )
	private WebElement businessWidgetSectionLnk;

	/*business widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/ul/li/a")
	private List<WebElement> businessWidgetArticleLnk;

	/*business widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/ul/li//img")
	private List<WebElement> businessWidgetImgLnk;

	/*more business Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top_stories vspacer30')]/a[@href='/business/']/parent::div/div/a")
	private WebElement moreBusinessWidgetLnk;

	/*business article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement businessBreadcrumb;

	////------videowall
	/*video wall widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//a")
	private WebElement videoWallWidgetArticleLnk;

	/*video wall article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'BreadCum')]/span)[1]|//div[contains(@class,'bradcurm')]| //div[contains(@class,'bradcrum')]")
	private WebElement videoWallArticleBreadcrumb;

	/*video wall widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//img")
	private WebElement videoWallWidgetImgLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[@href='/videos/']/parent::div/h2/a")
	private List<WebElement> fromOurShowsWidgetArticleLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[@href='/videos/']/ancestor::li/a")
	private List<WebElement> fromOurShowsWidgetImgLnk;

	/*jump to show widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'category_select from_shows_select')]/select")
	private WebElement jumpToShowWidgetLnk;

	/*jump to show option Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'category_select from_shows_select')]/select/option")
	private List<WebElement> jumpToShowOptionLnk;

	/*jump to show option breadcrumb in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum bnon')]")
	private WebElement jumpToShowOptionBreadcrumb;

	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//a")
	private WebElement horoscopeSectionLnk;

	/*Horoscope Active Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row glide__slide--active')]/p")
	private WebElement horoscopeActiveText;

	/*Forward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//button[contains(@class,'arrow--next')]")
	private WebElement forwardTapButton;

	/*Backward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//button[contains(@class,'arrow--prev')]")
	private WebElement backwardTapButton;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider_row') and (not(contains(@class,'glide__slide--clone')))]")
	private  List<WebElement> horoscopeSigns;

	/*horoscope info present in Horoscope Section in Homepage*/
	@FindBy(xpath ="//p[contains(@class,'horoscope_info')]")
	private WebElement horoscopeInfo;

	/*video wall widget Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'video_section')]//p[contains(.,'Videos Wall')]")
	private WebElement videoWallWidgetLnk;


	//*****************************************Vipin***Webelements**********************************

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]/h1/a | (//ul[@class='story_listing'])[1]//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//h1[contains(@class,'gallery_tilte')] | //div[contains(@class,'article_main')]/h1 | //div[contains(@class,'TstoryHead')]/h1 | //div[contains(@class,'pht-artcl')]/h1 | //div[contains(@class,'article-container')]//h1 ")
	private WebElement articleHeaderTxt;

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_story_img')]/a/img | (//ul[@class='story_listing'])[1]//div[contains(@class,'img')]//img[@title]")
	private List<WebElement> priorityPanelImgLnk;

	/*Top Stories Widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_stories')]/a[@href='/news/']/parent::div/child::ul/li/a")
	private List<WebElement> topStoriesWidgetArticleLnk;

	/*List of Hot and Trending Widget articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul//div//h2/a")
	private List<WebElement> hotAndTrendingWidgetArticleLnk;

	/*List of Hot and Trending Widget Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul//a[contains(@class,'img')]//img[@title]")
	private List<WebElement> hotAndTrendingWidgetImgLnk;

	/*More Hot and Trending articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul/div[contains(@class,'more_story')]/a")
	private WebElement moreHotAndTrendingLnk;

	/* List Of WebStories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'stroy_list_row')]/a")
	private List<WebElement> webstoriesArticleLnk;

	/* WebStoreis Next Story Button */
	@FindBy(xpath = "//button[contains(@aria-label,'Next page')]")
	private WebElement nextWebstoriesBtn;

	/* List Of WebStories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'stroy_list_row')]/a//img[@title]")
	private List<WebElement> webstoriesImgLnk;

	/*List of Right Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//button")
	private List<WebElement> webstoriesRightSlideBtn;

	/*Active Webstories Article text for Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'active')]/a//figcaption//h3")
	private WebElement activeWebstoriesArticleTxt;

	/*Active Arrow Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'next_arrow')]//button[contains(@class,'active')]")
	private WebElement activeWebstoriesBtn;

	/*Webstories Widget See More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'story_list')]//a[contains(@href,'/web-stories/')]/ancestor::div[contains(@class,'story_list')]/div//a[contains(@class,'see_more')]")
	private WebElement webstoriesSeeMoreLnk;

	/* BreadCrumb Division after Navigation of Article */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]")
	private WebElement webstoriesBreadCrumbDiv;

	/* BreadCrumb Division for More News Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'bread')] | //div[contains(@class,'Bread')] | //div[contains(@class,'heading_title')]")
	private WebElement articleBreadCrumbDiv;

	/* Video Article Breadcrumb Division in Video Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]|(//div[contains(@class,'BreadCum')]/span)[1] | //div[contains(@class,'bradcurm')] | //div[contains(@class,'bradcrum')]")
	private WebElement videoBreadCrumbDiv;

	/* List of Slider Button for Cricknext in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button")
	private List<WebElement> cricketnextRightSlideBtn;

	/* Active Arrow Button for CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button[contains(@class,'active')]")
	private WebElement activeCricketnextBtn;

	/* Active Cricketnext Article for Cricketnext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]//li[contains(@class,'active')]//h3")
	private WebElement activeCricketnextTxt;

	/* List of Cricknext Widget Article Text in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//li[not (contains(@class,'clone'))]/a")
	private List<WebElement> cricketnextArticleLnk;

	/*List of CricketNext Widget Article Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//li[not (contains(@class,'clone'))]/a//img")
	private List<WebElement> cricketnextImgLnk;

	/* List of Cricketnext Tabs Link in CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'tab')]/a[not (contains(@class,'active'))]")
	private List<WebElement> cricketnextTabLnk;

	/*List of Photogallery Article Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a")
	private List<WebElement> photogalleryWidgetArticleLnk;

	/*List of Photogallery Image Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a//img[@title]")
	private List<WebElement> photogalleryWidgetImgLnk;

	/* List of Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//button[contains(@class,'right')]")
	List<WebElement> photogalleryRightSliderBtn;

	/* Active Photogallery Article Text for Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogallerie')]//div[contains(@class,'active')]//h3")
	private WebElement activePhotgallerySlider;

	/* Active Videos Article Text for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'active')]//figcaption/h3")
	private WebElement activeVideosSlider;

	/*List of Photogallery Article Text for Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'photogallerie_row') and (not (contains(@class,'clone')))]/a/figcaption/h3")
	private List<WebElement> photogallerySectionArticleTxt;

	/* Active Arrow Button for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'bullets')]/button[contains(@class,'active')]")
	private WebElement activePhotogalleryBtn;

	/* More Photogalleries Link for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'load_more')]/a")
	private WebElement morePhotogalleryLnk;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//button[contains(@class,'right')]")
	List<WebElement> videosRightSliderBtn;

	/*List of Videos Article Links in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'video_slider_row') and (not (contains(@class,'clone')))]//figure/a")
	private List<WebElement> videosSectiontArticleLnk;

	/*List of Videos Image Links for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'video_section')]//div[contains(@class,'video_slider_row') and (not (contains(@class,'clone')))]//figure/a//img")
	private List<WebElement> videosSectiontImgLnk;

	/* More Videos Link for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photogalleries')]//div[contains(@class,'load_more')]/a")
	private WebElement moreVideosLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/ul/li/a")
	private List<WebElement> buzzSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/ul/li/a//img")
	private List<WebElement> buzzSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/buzz/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreBuzzLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/ul/li/a")
	private List<WebElement> educationAndCareerSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/ul/li/a//img")
	private List<WebElement> educationAndCareerSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/education-career/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreEducationAndCareerLnk;

	/*List of Tech Article Link for Tech Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/ul/li/a")
	private List<WebElement> techSectiontArticleLnk;

	/*List of Tech Image Links for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/ul/li/a//img")
	private List<WebElement> techSectiontImgLnk;

	/* More Tech News Link for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/tech/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreTechLnk;

	/*List of Auto Article Link for Auto Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/ul/li/a")
	private List<WebElement> autoSectiontArticleLnk;

	/*List of Auto Image Links for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/ul/li/a//img")
	private List<WebElement> autoSectiontImgLnk;

	/* More Auto News Link for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/auto/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreAutoLnk;

	/*List of World Article Link for World Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/ul/li/a")
	private List<WebElement> worldSectiontArticleLnk;

	/*List of World Image Links for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/ul/li/a//img")
	private List<WebElement> worldSectiontImgLnk;

	/* More World News Link for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/world/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreWorldLnk;

	/*List of Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/ul/li/a")
	private List<WebElement> sportsSectiontArticleLnk;

	/*List of Sports Image Links for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/ul/li/a//img")
	private List<WebElement> sportsSectiontImgLnk;

	/* More Sports News Link for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/sports/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreSportsLnk;

	/*List of Lifestyle Article Link for Lifestyle Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/ul/li/a")
	private List<WebElement> lifestyleSectiontArticleLnk;

	/*List of Lifestyle Image Links for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/ul/li/a//img")
	private List<WebElement> lifestyleSectiontImgLnk;

	/* More Lifestyle News Link for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreLifestyleLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/ul/li/a")
	private List<WebElement> healthAndFitnessSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/ul/li/a//img")
	private List<WebElement> healthAndFitnessSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/lifestyle/health-and-fitness/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreHealthAndFitnessLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/ul/li/a")
	private List<WebElement> explainersSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/ul/li/a//img")
	private List<WebElement> explainersSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/explainers/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreExplainersLnk;

	/*List of Opinion Article Link for Opinion Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/ul/li/a")
	private List<WebElement> opinionSectiontArticleLnk;

	/*List of Opinion Image Links for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/ul/li/a//img")
	private List<WebElement> opinionSectiontImgLnk;

	/* More Opinion News Link for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/opinion/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreOpinionLnk;

	/*List of politics Article Link for politics Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/ul/li/a")
	private List<WebElement> politicsSectiontArticleLnk;

	/*List of politics Image Links for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/ul/li/a//img")
	private List<WebElement> politicsSectiontImgLnk;

	/* More politics News Link for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/politics/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement morePoliticsLnk;

	/*List of Football Article Link for Football Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/ul/li/a")
	private List<WebElement> footballSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/ul/li/a//img")
	private List<WebElement> footballSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'top_stories')]/a[@href='/football/']/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreFootballLnk;

	/*List of News18 Showsha Article Link for News18 Showsha Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]")
	private List<WebElement> news18ShowshaSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a//img[@class] | //div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a//img[@title]")
	private List<WebElement> news18ShowshaSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/a")
	private WebElement moreFromNews18ShowshaLnk;

	/* News18 Showsha Logo Image Link for News18 Showsha Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/div[contains(@class,'header')]/a/img[contains(@src,'showsha')]")
	private WebElement news18ShowshaLogoImgLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'txt')]" )
	private List<WebElement> cricketNextArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'img')]/img" )
	private List<WebElement> cricketNextImgLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'nws18')]" )
	private WebElement cricketNextNews18LogoLnk;

	/* List Of CricketNext Widget Tab Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]//div[contains(@class,'cnw_header')]/a[contains(@class,'logo')]" )
	private WebElement cricketNextLogoLnk;

	/* More From CricketNext Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cn_widget')]/a[contains(@class,'more')]")
	private WebElement cricketNextMoreLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')] | //h1")
	private WebElement articleBreadcrumb;


	//*****************************Rahul Webelemts*****************************************

	/* Latest News breadcrum */ 
	@FindBy(xpath ="//div[contains(@class,'breadcum_outter')]" )
	private WebElement LatestNewsBreadcrum;

	/*List of webelements of Air quality widget */
	@FindBy(xpath ="//div[contains(@class,'aqiwidget kul')]//ul//li//a" )
	private List<WebElement> airQualityWidgetLst;

	/*Aqi logo present at Aqi page*/
	@FindBy(xpath ="//a[contains(@class,'aqiwidgetsprite aqipwrdbylogo')]" )
	private WebElement aqilogo;

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

	/*Element in Air Quality Section*/
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//ul//li//a[contains(@href,'aqi-india')]" )
	private WebElement aqiBradeCrumb;

	/*Link of viewMoreLatest news webelement*/ 
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[contains(text(),'Latest')]//parent::a//following-sibling::ul//div//a[contains(text(),'More')]" )
	private WebElement viewMoreLatestNews;

	/*List of webelements of Latest news article Links*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[contains(text(),'Latest')]//parent::a//following-sibling::ul//li//h2//a[contains(@href,'')]" )
	private List<WebElement> latestNewsLnkList;

	/*Skip ad button present in live Tv*/
	@FindBy(xpath = "//div//button[contains(@class,'videoAdUiSkipButton videoAdUiAction')]")
	private WebElement skipAdd;

	/*Video Ad element present in Live Tv*/
	@FindBy(xpath = "//div[@id='playerContainer']//div[contains(@id,'content_video_ima-ad-container')]")
	private WebElement videoAds;

	/*Ad iframe present in Live Tv Section*/
	@FindBy(xpath = "//iframe[contains(@id,'goog_')]")
	private WebElement videoAdsIframe;


	/**
	 * @author AbhishekRaj
	 * This method is used validate Covid tracker Date
	 */
	public void clickOnTrackerMobileView() {
		try {
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(mobViewTrackerLnk);
			webDriverActions.waitForSecond(5000);
			webDriverActions.clickJS(mobViewTrackerLnk);
		} catch (Exception e) {
			Assert.fail("Unable to Locate Covid Tracker Link "+mobViewTrackerLnk);
		}
		webDriverActions.waitForElementVisibility(mobileCovidUpdatedTime,GlobalVariables.sec60);
		String covidDate=webDriverActions.getTextFromElement(mobileCovidUpdatedTime);
		//below actual variable is to get string position from the article text
		String actual = genericUtility.getSubstring(9, 20,covidDate).trim();
		Logs.info(getClass(), "Current Covid Tracker Date is: "+actual);
		String expected = genericUtility.getSystemDateTime();
		Logs.info(getClass(), "Current System Date is: " +expected);
		Assert.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed to Update Covid Tracker Date and Time "+actual+webDriverActions.getCurrentPageUrl());
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to click on First Article of Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(homePageArticleLnk.get(0));
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in first Article Homepage", e);
		}
	}

	/**
	 * @author AnupamG
	 * This method used to click on photos section
	 */
	public void clickOnPhotoSection()
	{
		try {

			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(photoSectionLnk);
			Logs.info(getClass(), "Clicked on photoSection");
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Photo Section Link", e);
		}
	}

	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
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
	 * @author SanjeebP
	 * This method used to click on cricketNext section
	 */
	public void clickOnCricketNextSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(cricketNextSectionLnk);
			Logs.info(getClass(), "Clicked on cricket next section");
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Cricket Next Link", e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method used to navigate to India Section Page
	 */
	public void clickOnIndiaSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(indiaSectionLnk);
			Logs.info(getClass(),"Clicked on india section link");
		}catch (Exception e) {
			Logs.error(getClass(), "Exception in India Section Link", e);
		}
	}

	/**
	 * @author AbhishekRaj
	 * This method is used click on video section
	 */
	public void clickOnVideoSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(videoSectionLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Video Section Link", e);
		}
	}

	/**
	 * @author VipinKumar
	 * This method is used to click on the article in footer containing /topics/ in the URL
	 */
	public void clickOnFooterTopics()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.continuousScrollTillElement(footerGoldPriceTopicLnk, GlobalVariables.sec30);
			webDriverActions.clickJS(footerGoldPriceTopicLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Footer Topics Link", e);
		}
	}

	/**
	 * @author SanjeebP
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Link", e);
		}
	}

	//======================================= Buiness Logics for Line One And Line Two Sections ==================================
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on movie widget present on line one section.
	 */
	public void clickOnLineOneMovieLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(movieEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(movieEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on cricket widget present on line one section.
	 */
	public void clickOnLineOneCricketLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(cricketEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(cricketEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on INdia widget present on line one section.
	 */
	public void clickOnLineOneIndiaLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(indiaEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(indiaEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on movie widget present on line one section.
	 */
	public void clickOnLineOneShowshaLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(showshaEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(showshaEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Politics widget present on line one section.
	 */
	public void clickOnLineOnePoliticsLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(politicsEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(politicsEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on World widget present on line one section.
	 */
	public void clickOnLineOneWorldLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(worldEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(worldEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on education widget present on line one section.
	 */
	public void clickOnLineOneEducationLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(educationEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(educationEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Business widget present on line one section.
	 */
	public void clickOnLineOneBusinessLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(businessEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(businessEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on movie widget present on line one section.
	 */
	public void clickOnLineOneBuzzLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(buzzEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(buzzEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Opinion widget present on line one section.
	 */
	public void clickOnLineOneOpinionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(opnionEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(opnionEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Photos widget present on line one section.
	 */
	public void clickOnLineOnePhotosLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(photosEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(photosEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Latest widget present on line one section.
	 */
	public void clickOnLineOneLatestLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(latestEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(latestEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on LifeStyle widget present on line one section.
	 */
	public void clickOnLineOneLifeStyleLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lifeStyleEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(lifeStyleEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on WebStories widget present on line one section.
	 */
	public void clickOnLineOneWebStoriesLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(webStoriesEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(webStoriesEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on explainers widget present on line one section.
	 */
	public void clickOnLineOneExplainersLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(explinersEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(explinersEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Sports widget present on line one section.
	 */
	public void clickOnLineOneSportsLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(sportsEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(sportsEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Tech widget present on line one section.
	 */
	public void clickOnLineOneTechLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(techEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(techEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Auto widget present on line one section.
	 */
	public void clickOnLineOneAutoLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(autoEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(autoEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Astrology widget present on line one section.
	 */
	public void clickOnLineOneAstrologyLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(astrologyEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(astrologyEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/* ********************************Danish***BusinessLogic********************************

	/**
	 * @author DanishR
	 * This method is used to display News18 logo
	 */
	public void verifyHeaderLogo() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(headerLogo, 20);
		webDriverActions.softHighlightElement(headerLogo);
		Logs.info(getClass(),"News18 Header Logo is displayed");
		softAssert.assertTrue(webDriverActions.isElementDisplayed(headerLogo), "Failed to Dsiplay "+ webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in Home Page Header Logo ");
	}


	/**
	 * @author DanishR
	 * This method is used to display News18 logo
	 */
	public void verifyTracker(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softIsElementDisplayed(mobViewTrackerLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.mouseHoverAndClick(mobViewTrackerLnk);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.waitForSecond(5000);
			webDriverActions.mouseHoverAndClick(mobViewTrackerLnk);
		}
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			webDriverActions.waitForSecond(5000);
			webDriverActions.mouseHoverAndClick(mobViewTrackerLnk);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(5000);
				webDriverActions.mouseHoverAndClick(mobViewTrackerLnk);
			}
			currentPageUrl=betaUrl;
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trackerCloseIcon), "Failed to Dsiplay "+ currentPageUrl);
		webDriverActions.softHighlightElement(trackerCloseIcon);
		webDriverActions.waitForSecond(5000);
		webDriverActions.softClickJS(trackerCloseIcon);
		softAssert.assertAll("Issues found in Home Page Tracker ");
	}


	/**
	 * @author DanishR
	 * This method is used to verify google search 
	 */
	public void verfyGoogleSearch()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		//validating Search Icon
		webDriverActions.softClick(searchBtnLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(searchBtnLnk);
			webDriverActions.softClick(searchBtnLnk);
		}
		webDriverActions.waitForSecond(5000);
		webDriverActions.softWaitForElementVisibility(searchInputBox, 10);
		webDriverActions.inputText(searchInputBox, "News 18");
		webDriverActions.softHighlightElement(searchBtn);
		webDriverActions.softClick(searchBtn);
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(searchCloseBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(searchCloseBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues found in this Url "+ webDriverActions.getCurrentPageUrl());
	}

	//******************************Sanjeen**Business Logic**************************

	public void validationCondition(WebElement section,String id,String mainUrl)
	{
		if(id.contains("active") || id.contains("TrendHeading") || id.contains("nav_social"))
		{
			Logs.info(getClass(), mainUrl);
		}
		else
		{	
			webDriverActions.softClick(section);
		}
	}

	public void switchingTitle(String title,String pageUrl)
	{
		if(title.contains("_blank"))
		{
			webDriverActions.switchToNewWindow();
		}
		else
		{
			Logs.info(getClass(), pageUrl);
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSection(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElement(1000);
			String pageTitle=webDriverActions.getPageTitle();
			String actualUrl=webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue(lineOneSectionElementsList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
			//Validating the Line one section Except Search Button
			for (int i = 1; i < lineOneSectionElementsList.size(); i++)
			{
				webDriverActions.softHighlightElement(lineOneSectionElementsList.get(i));
				webDriverActions.softMouseHover(lineOneSectionElementsList.get(i));
				String pageUrl = webDriverActions.getAttribute("href", lineOneSectionElementsList.get(i));
				String title = webDriverActions.getAttribute("target", lineOneSectionElementsList.get(i));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lineOneSectionElementsList.get(i)), "possibly line One Element Is not Visible"+pageUrl);
				webDriverActions.softClick(lineOneSectionElementsList.get(i));
				switchingTitle(title, pageUrl);
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(lineOneSectionElementsList.get(i));
					switchingTitle(title, pageUrl);
				}
				webDriverActions.waitForSecond(1000);	
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd")&& !pageUrl.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(pageUrl);
					expected=betaUrl;
					webDriverActions.navigateToUrl(expected);
				}
				String currentUrl = webDriverActions.getCurrentPageUrl();
				int response = genericUtility.checkLinks(currentUrl);
				boolean status=genericUtility.manageUrl(pageUrl, expected);
				softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
				softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);
				}
				else
				{	
					webDriverActions.navigateToUrl(actualUrl);
				}
			}
		}
		catch(Exception e)
		{
			softAssert.assertTrue(false, "Possibly Element Is Not Clickable or Visible");	
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");
	}


	/**
	 * This method is used to verify Search Button Present on Header
	 * @author SanjeebKumarPati
	 */
	public void verfyHeaderLiveTv()
	{
		//validating Search Icon
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.softHighlightElement(liveTVBtn);
		webDriverActions.softClickJS(liveTVBtn);
		String currentPageUrl=webDriverActions.getCurrentPageUrl();
		if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softHighlightElement(liveTVBtn);
			webDriverActions.softClickJS(liveTVBtn);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);		
		softAssert.assertAll("Issues Found In Validating LiveTV");
	}



	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerMenu(String server,WebElement section , List<WebElement> sectionlist)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(section);
		String id = webDriverActions.getAttribute("class", section);
		validationCondition(section, id, mainUrl);
		softAssert.assertTrue(sectionlist.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<sectionlist.size();i++)
		{
			webDriverActions.softHighlightElement(sectionlist.get(i));
			String pageUrl = webDriverActions.getAttribute("href",sectionlist.get(i));
			String title = webDriverActions.getAttribute("target", sectionlist.get(i));
			int response = genericUtility.checkLinks(pageUrl);
			if(response==200)
			{
				webDriverActions.softClickJS(sectionlist.get(i));
				switchingTitle(title, pageUrl);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(hamburgerMenuBtn);
					validationCondition(section, id, mainUrl);
					webDriverActions.softHighlightElement(sectionlist.get(i));
					webDriverActions.softClickJS(sectionlist.get(i));
					switchingTitle(title, pageUrl);
				}
				webDriverActions.stopPageLoading();
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !expected.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					webDriverActions.navigateToUrl(betaUrl);
					expected=betaUrl;
				}
				webDriverActions.stopPageLoading();
				String currentUrl = webDriverActions.getCurrentPageUrl();
				boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
				int response1 = genericUtility.checkLinks(currentUrl);
				softAssert.assertTrue(response1==200 | response1==429 , "Possibly Url is Invalid "+currentUrl);
				softAssert.assertTrue(status,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);

				}
				else {
					webDriverActions.navigateToUrl(mainUrl);
					webDriverActions.softClickJS(hamburgerMenuBtn);
				}
				validationCondition(section, id, mainUrl);
			}
			else
			{
				softAssert.fail("Url is Invalid "+pageUrl+" And Status Code is "+response);
			}
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLHSSection(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSSectionWidget, hamburgerMenuLHSSectionWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLHSNews18Initiatives(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSNews18InitiativesWidget, hamburgerMenuLHSNews18InitiativesWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLHSGroupSites(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSGroupSitesWidget, hamburgerMenuLHSGroupSitesWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerLHSKnowUs(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSKnowUsWidget, hamburgerMenuLHSKnowUsWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerIntrendsValidation(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSInTrendsWidget, hamburgerMenuLHSInTrendsWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerSocialShareValidation(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuSocialShareSection, hamburgerMenuSocialShareSectionWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerHeaderValidation(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerDownloadApp);
		String pageUrl = webDriverActions.getAttribute("href",hamburgerDownloadApp);
		webDriverActions.softClickJS(hamburgerDownloadApp);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softHighlightElement(hamburgerMenuBtn);
			webDriverActions.softClick(hamburgerMenuBtn);
			webDriverActions.softHighlightElement(hamburgerDownloadApp);

		}
		webDriverActions.switchToNewWindow();
		webDriverActions.stopPageLoading();
		String currentUrl = webDriverActions.getCurrentPageUrl();
		boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
		int response1 = genericUtility.checkLinks(currentUrl);
		softAssert.assertTrue(response1==200 , "Possibly Url is Invalid "+currentUrl);
		softAssert.assertTrue(status,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
		webDriverActions.navigateToUrl(mainUrl);

		//Live Tv
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerMenuLiveTVSection);
		String pageUrl1 = webDriverActions.getAttribute("href",hamburgerMenuLiveTVSection);
		webDriverActions.softClickJS(hamburgerMenuLiveTVSection);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softHighlightElement(hamburgerMenuBtn);
			webDriverActions.softClick(hamburgerMenuBtn);
			webDriverActions.softHighlightElement(hamburgerMenuLiveTVSection);

		}
		webDriverActions.stopPageLoading();
		String currentUrl1 = webDriverActions.getCurrentPageUrl();
		boolean status1=genericUtility.compareUrlSub(pageUrl1, currentUrl1);
		int response = genericUtility.checkLinks(currentUrl);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl1);
		softAssert.assertTrue(status1,pageUrl+ " Possibly not Navigate to same Page "+currentUrl1);

		softAssert.assertAll("Issues Found in Validating Hamburger Header Section ");
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerChangeLanguageValidation(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerChnageLanguageSection);
		webDriverActions.softClickJS(hamburgerChnageLanguageSection);
		softAssert.assertTrue(hamburgerChnageLanguageSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<hamburgerChnageLanguageSectionEleList.size();i++)
		{
			webDriverActions.softHighlightElement(hamburgerChnageLanguageSectionEleList.get(i));
			String pageUrl = webDriverActions.getAttribute("href",hamburgerChnageLanguageSectionEleList.get(i));
			String title = webDriverActions.getAttribute("target", hamburgerChnageLanguageSectionEleList.get(i));
			int response = genericUtility.checkLinks(pageUrl);
			if(response==200)
			{
				webDriverActions.softClickJS(hamburgerChnageLanguageSectionEleList.get(i));
				switchingTitle(title, pageUrl);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(hamburgerMenuBtn);
					webDriverActions.softClickJS(hamburgerChnageLanguageSection);
					webDriverActions.softHighlightElement(hamburgerChnageLanguageSectionEleList.get(i));
					webDriverActions.softClickJS(hamburgerChnageLanguageSectionEleList.get(i));
					switchingTitle(title, pageUrl);
				}
				webDriverActions.stopPageLoading();
				String expected = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd") && !expected.contains("//beta"))
				{
					String betaUrl = genericUtility.replaceInUrl(expected);
					webDriverActions.navigateToUrl(betaUrl);
					expected=betaUrl;
				}
				webDriverActions.stopPageLoading();
				String currentUrl = webDriverActions.getCurrentPageUrl();
				boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
				int response1 = genericUtility.checkLinks(currentUrl);
				softAssert.assertTrue(response1==200 , "Possibly Url is Invalid "+currentUrl);
				softAssert.assertTrue(status,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);

				}
				else {
					webDriverActions.navigateToUrl(mainUrl);
					webDriverActions.softClickJS(hamburgerMenuBtn);
				}
			}
			else
			{
				softAssert.fail("Url is Invalid "+pageUrl+" And Status Code is "+response);
			}
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyFooterSection(WebElement section,List<WebElement> sectionlist)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.scrollUp();
		webDriverActions.continuousScrollTillElement(section, 10);
		webDriverActions.softWaitForElementVisibility(section, 5);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softMouseHover(section);
		softAssert.assertTrue(sectionlist.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<sectionlist.size();i++)
		{
			webDriverActions.softWaitForElementVisibility(sectionlist.get(i), 1);
			webDriverActions.softHighlightElement(sectionlist.get(i));
			webDriverActions.softMouseHover(sectionlist.get(i));
			String pageUrl = webDriverActions.getAttribute("href",sectionlist.get(i));
			String title = webDriverActions.getAttribute("target", sectionlist.get(i));
			webDriverActions.softClickJS(sectionlist.get(i));
			switchingTitle(title, pageUrl);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.scrollToLast();
				webDriverActions.scrollUp();
				webDriverActions.continuousScrollTillElement(section, 10);
				webDriverActions.softWaitForElementVisibility(section, 5);
				webDriverActions.softScrollToElement(section);
				webDriverActions.softHighlightElement(section);
				webDriverActions.softMouseHover(section);
				webDriverActions.softWaitForElementVisibility(sectionlist.get(i), 1);
				webDriverActions.softHighlightElement(sectionlist.get(i));
				webDriverActions.softScrollToElement(sectionlist.get(i));
				webDriverActions.softClickJS(sectionlist.get(i));
				switchingTitle(title, pageUrl);
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 | response==429 , "Possibly Url is Invalid "+currentUrl + "and Status Code is - "+response);
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
			webDriverActions.scrollToLast();
			webDriverActions.scrollUp();
			webDriverActions.continuousScrollTillElement(section, 10);
			webDriverActions.softWaitForElementVisibility(section, 5);
			webDriverActions.softScrollToElement(section);
			webDriverActions.softHighlightElement(section);
			webDriverActions.softMouseHover(section);
		}
		softAssert.assertAll("Issues Found In Validating footer Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyFooterFirstLayerSection()
	{
		verfyFooterSection(footerFirstLayer, footerFirstLayerEleList);
	}




	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify LiveTv Present on Footer Part of mobile hindi revamp Landing Page.
	 */
	public void verfyfooterLiveTvSection()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(footerLiveTvSection, 10);
		webDriverActions.softHighlightElement(footerLiveTvSection);
		String pageUrl = webDriverActions.getAttribute("href",footerLiveTvSection);
		webDriverActions.softClickJS(footerLiveTvSection);
		webDriverActions.switchToNewWindow();
		webDriverActions.stopPageLoading();
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
		softAssert.assertTrue(status,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
		webDriverActions.closeDriver();
		softAssert.assertAll("Issues Found In Validating footer Live Tv Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Footer Last layer mobile hindi revamp Landing Page.
	 */
	public void verfyfooterLastLayerSection()
	{
		verfyFooterSection(footerLastLayerSection, footerLastLayerSectionEleList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Footer Last layer mobile hindi revamp Landing Page.
	 */
	public void verfyfooterStickySection()
	{
		verfyFooterSection(footerStickySection, footerStickySectionEleList);
	}
	//**************************Anupam***Business Logic***************************

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(WebElement section ,List<WebElement> artList ,String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 5);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(artList.get(i));

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(artList.get(i));
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			//			String expectedUrl =webDriverActions.getCurrentPageUrl();
			//			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(moviesArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moviesArticleBreadcrumb) , "Unable to Display Element "+moviesArticleBreadcrumb+" on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Article
	 */
	public void verifyMoviesWidgetArticle(String serverType) {
		verifyArticlesNavigation(moviesWidgetSectionLnk,moviesWidgetArticleLnk,serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	public void verifyCricketNextWidgetArticle(String serverType) {
		verifyArticlesNavigation(cricketNextWidgetSectionLnk,cricketNextWidgetArticleLnk,serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(indiaWidgetSectionLnk,indiaWidgetArticleLnk,serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(businessWidgetSectionLnk,businessWidgetArticleLnk,serverType);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation( String serverType, WebElement section ,List<WebElement> artList)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 5);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualTitle =webDriverActions.getAttribute("title", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actualTitle =webDriverActions.getAttribute("title", artList.get(i));
				webDriverActions.softClickJS(artList.get(i));
			}

			webDriverActions.waitForSecond(1000);
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

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(moviesArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moviesArticleBreadcrumb) ,  "Unable to Display Element "+moviesArticleBreadcrumb + " on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Movies Widget Image
	 */
	public void verifyMoviesWidgetImg(String serverType) {
		verifyImgNavigation(serverType,moviesWidgetSectionLnk,moviesWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Image
	 */
	public void verifyCricketNextWidgetImg(String serverType) {
		verifyImgNavigation(serverType,cricketNextWidgetSectionLnk,cricketNextWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	public void verifyIndiaWidgetImg(String serverType) {
		verifyImgNavigation(serverType,indiaWidgetSectionLnk,indiaWidgetImgLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Image
	 */
	public void verifyBusinessWidgetImg(String serverType) {
		verifyImgNavigation(serverType,businessWidgetSectionLnk,businessWidgetImgLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType, WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		String actual = webDriverActions.getTextFromElement(moreLnk);
		Logs.info(getClass(),"Actual text Before Click " + actual);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForSecond(1000);

		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 

		String expected = webDriverActions.getTextFromElement(breadcrumb);
		Logs.info(getClass(),"Actual text After Click " + expected);
		softAssert.assertTrue((genericUtility.compareTwoStrings(actual, expected)),"Failed to display after navigate from "+actual);
		softAssert.assertAll("Issue Found in HomePage Body More Link");	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Movies News
	 */
	public void verifyMoreMoviesLnk(String serverType) {
		verifyMoreLnks(serverType,moreMoviesWidgetLnk, moviesMoreBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More CricketNext News
	 */
	public void verifyMoreCricketNextLnk(String serverType) {
		verifyMoreLnks(serverType,moreCricketNextWidgetLnk, cricketNextBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	public void verifyMoreIndiaLnk(String serverType) {
		verifyMoreLnks(serverType,moreIndiaWidgetLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnks(serverType,moreBusinessWidgetLnk, businessBreadcrumb);
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	public void verifyVideoWallArticleNavigation(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetArticleLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetArticleLnk);
		String actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetArticleLnk);
		webDriverActions.softClickJS(videoWallWidgetArticleLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softScrollToElement(videoWallWidgetArticleLnk);
			actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetArticleLnk);
			webDriverActions.softClickJS(videoWallWidgetArticleLnk);
		}
		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		//		String expectedUrl = webDriverActions.getCurrentPageUrl();
		//		softAssert.assertEquals(actualUrl, expectedUrl , "Unable to Navigate "+actualUrl);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+ " on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Image
	 */
	public void verifyVideoWallImgNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetImgLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetImgLnk);
		String actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetImgLnk);
		webDriverActions.softClickJS(videoWallWidgetImgLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softScrollToElement(videoWallWidgetImgLnk);
			actualUrl =	webDriverActions.getAttribute("href", videoWallWidgetImgLnk);
			webDriverActions.softClickJS(videoWallWidgetImgLnk);
		}

		webDriverActions.waitForSecond(1000);
		String currentPage = webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		//		softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate to "+actualUrl);

		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		} 
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+ " on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Article
	 */
	public void verifyFromOurShowsArticleNavigation(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetLnk);
		webDriverActions.softMouseHover(videoWallWidgetLnk);
		softAssert.assertTrue(fromOurShowsWidgetArticleLnk.size()>0, " Possibly Element is Not Visible "+ fromOurShowsWidgetArticleLnk );
		for(int i=0; i<fromOurShowsWidgetArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(fromOurShowsWidgetArticleLnk.get(i));
			webDriverActions.softScrollToElement(fromOurShowsWidgetArticleLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetArticleLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(fromOurShowsWidgetArticleLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(fromOurShowsWidgetArticleLnk.get(i));
				webDriverActions.softScrollToElement(fromOurShowsWidgetArticleLnk.get(i));
				actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetArticleLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(fromOurShowsWidgetArticleLnk.get(i));
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate to "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+ " on "+currentPage);
			//			softAssert.assertEquals(actualUrl, expectedUrl , "Unable to Navigate "+actualUrl);
			//			softAssert.assertTrue(((genericUtility.compareStringsWithIgnoreCase(actualUrl, expectedUrl)) && (webDriverActions.isElementDisplayed(videoWallArticleBreadcrumb))),"Failed to navigate to"+actualUrl);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body From Our Shows Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Image
	 */
	public void verifyFromOurShowsImgNavigation(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videoWallWidgetLnk, 5);
		webDriverActions.softScrollToElement(videoWallWidgetLnk);
		webDriverActions.softMouseHover(videoWallWidgetLnk);
		softAssert.assertTrue(fromOurShowsWidgetImgLnk.size()>0, " Possibly Element is Not Visible "+ fromOurShowsWidgetImgLnk );
		for(int i=0; i<fromOurShowsWidgetImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(fromOurShowsWidgetImgLnk.get(i));
			webDriverActions.softScrollToElement(fromOurShowsWidgetImgLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetImgLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClickJS(fromOurShowsWidgetImgLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(fromOurShowsWidgetImgLnk.get(i));
				webDriverActions.softScrollToElement(fromOurShowsWidgetImgLnk.get(i));
				actualUrl =	webDriverActions.getAttribute("href", fromOurShowsWidgetImgLnk.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.softClickJS(fromOurShowsWidgetImgLnk.get(i));
			}

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate to "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+ " on "+currentPage);
			//			softAssert.assertEquals(actualUrl, expectedUrl , "Unable to Navigate "+actualUrl);
			//			softAssert.assertTrue(((genericUtility.compareStringsWithIgnoreCase(actualUrl, expectedUrl)) && (webDriverActions.isElementDisplayed(videoWallArticleBreadcrumb))),"Failed to navigate to"+actualUrl);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body From Our Show Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Jump to show Widget 
	 */
	public void verifyJumpToShowNavigation(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(jumpToShowWidgetLnk, 5);
		webDriverActions.mouseHoverAndClick(jumpToShowWidgetLnk);
		softAssert.assertTrue(jumpToShowOptionLnk.size()>0, " Possibly Element is Not Visible "+ jumpToShowOptionLnk );
		for(int i=1; i<jumpToShowOptionLnk.size() ;i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.softScrollToElement(jumpToShowOptionLnk.get(i));
			String actualUrl =	webDriverActions.getAttribute("value", jumpToShowOptionLnk.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.softClick(jumpToShowOptionLnk.get(i));

			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			softAssert.assertTrue(genericUtility.compareStringsWithIgnoreCase(actualUrl, currentPage),"Failed to navigate to "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
			//			String expectedUrl =webDriverActions.getCurrentPageUrl();
			//			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(jumpToShowOptionBreadcrumb);
			softAssert.assertTrue((webDriverActions.softIsElementDisplayed(jumpToShowOptionBreadcrumb)),"Failed to display "+jumpToShowOptionBreadcrumb+ " on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(1000);
			webDriverActions.mouseHoverAndClick(jumpToShowWidgetLnk);
		}
		softAssert.assertAll("Issue Found in HomePage Body Jump To Show Widget");
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate forward arrow button of horoscope section
	 */
	public void verifyHoroscopeForwardArrow()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		if(webDriverActions.softIsElementDisplayed(horoscopeSectionLnk))
		{
			String prevText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), prevText+" Text before forward tap");
			webDriverActions.softClickJS(forwardTapButton);
			webDriverActions.waitForSecond(1000);
			String currText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), currText+" Text after forward tap");
			softAssert.assertNotEquals(prevText, currText, "Forward Tap is not working");
		}
		else 
		{
			softAssert.fail("Possibly element is not present or visible ");
		}
		softAssert.assertAll("Issues found in horoscope section home page");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Backward arrow button of horoscope section
	 */
	public void verifyHoroscopeBackArrow()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		if(webDriverActions.softIsElementDisplayed(horoscopeSectionLnk))
		{
			String prevText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), prevText+" Text before backward tap");
			webDriverActions.softClickJS(backwardTapButton);
			webDriverActions.waitForSecond(1000);
			String currText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), currText+" Text after backward tap");
			softAssert.assertNotEquals(prevText, currText, "Backward Tap is not working");
		}
		else 
		{
			softAssert.fail("Possibly element is not present or visible ");
		}
		softAssert.assertAll("Issues found in horoscope section home page");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription()
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			String horoscopeText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), horoscopeText+" Text before forward tap");
			webDriverActions.waitForSecond(2000);
			webDriverActions.softHighlightElement(horoscopeInfo);
			Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(horoscopeInfo));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeInfo) , "Unable to Display description for "+horoscopeText);
			webDriverActions.softClickJS(forwardTapButton);
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}


	//*****************************Vipin Business Logic********************************

	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList )
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//			String homeUrl =webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(artList, 20);
		webDriverActions.waitForSecond(1000);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl = webDriverActions.getAttribute("href", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			if (currentPage.contains(expectedUrl)) {
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
	 * @param imgList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Image Navigation  
	 */
	public void verifyImageNavigation(String serverType , List<WebElement> imgList)
	{
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.continuousScrollTillAllElement(imgList, 20);
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
			webDriverActions.waitForPageToLoad();
			String currentPage =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), currentPage);
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.waitForPageToLoad();
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			// webDriverActions.navigateToUrl(homeUrl);
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
	 * @param moreLnk
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Widget News Navigation
	 */
	public void verifyMoreNewsNavigation(String serverType , WebElement moreLnk ) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 20);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, currentPage), "Possibly not navigate to same page "+actualUrl);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Title of the Section in Homepage
	 * @param serverType
	 * @param element
	 */
	public void verifyTitleNavigation(String serverType , WebElement element )
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(element, 20);
		webDriverActions.softMouseHover(element);
		String actualUrl = webDriverActions.getAttribute("href", element);
		webDriverActions.softClickJS(element);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.waitForPageToLoad();
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, currentPage), "Possibly not navigate to same page "+actualUrl);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingArticleNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(hotAndTrendingWidgetArticleLnk, 10);
		webDriverActions.softMouseHover(moreHotAndTrendingLnk);
		webDriverActions.softScrollToElement(moreHotAndTrendingLnk);
		int preSize = hotAndTrendingWidgetArticleLnk.size();
		webDriverActions.softClickJS(moreHotAndTrendingLnk);
		int newSize = hotAndTrendingWidgetArticleLnk.size();
		softAssert.assertTrue(newSize>preSize , "Unable To Click on More Hot and Trending Link ");
		verifyArticleNavigation(serverType,hotAndTrendingWidgetArticleLnk );
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,hotAndTrendingWidgetImgLnk );
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation for Webstories Section in Homepage
	 */
	public void verifyWebStoriesSlideNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webStoriesEle, 3);
		softAssert.assertTrue(webstoriesRightSlideBtn.size()>0, " Possibly WebStories Slider not present "+webDriverActions.getCurrentPageUrl());
//		webDriverActions.continuousScrollTillAllElement(webstoriesRightSlideBtn, 10);
		for(int i = 0; i<webstoriesRightSlideBtn.size() ; i++)
		{
			if(i==1 || i==3)
			{
				webDriverActions.softMouseHover(webstoriesRightSlideBtn.get(i));
				webDriverActions.softScrollToElement(webstoriesRightSlideBtn.get(i));
				String actual = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(webstoriesRightSlideBtn.get(i));
				webDriverActions.waitForSecond(1000);
				String expected = webDriverActions.getTextFromElement(activeWebstoriesArticleTxt);
				Logs.info(getClass(), expected);
				webDriverActions.waitForSecond(1000);
				softAssert.assertNotEquals(actual, expected , "Webstories Slider is Not Working");
			}
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the See More Link Navigation for Webstories Section in Homepage
	 */
	public void verifyWebstoriesSeeMoreLinkNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(webstoriesSeeMoreLnk, 10);
		webDriverActions.softMouseHover(webstoriesSeeMoreLnk);
		webDriverActions.softScrollToElement(webstoriesSeeMoreLnk);
		String actual = webDriverActions.getAttribute("href", webstoriesSeeMoreLnk);
		webDriverActions.clickJS(webstoriesSeeMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage, "Unable to Navigate");
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(webstoriesBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesBreadCrumbDiv), "Unable to Display Element "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Cricketnext Slider Navigation for Cricketnext Section in Homepage
	 */
	public void verifyCrickNextSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(0));
		webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(0));
		for(int i = 1; i<cricketnextRightSlideBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeCricketnextTxt);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(i));
			webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(i));
			webDriverActions.softClickJS(cricketnextRightSlideBtn.get(i));
			webDriverActions.waitForSecond(1000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeCricketnextTxt);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Cricket Next slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Cricketnext Tabs Navigation for Cricketnext Section in Homeoage
	 */
	public void verifyCricketNextTabNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(cricketnextTabLnk.get(0));
		webDriverActions.scrollToElement(cricketnextTabLnk.get(0));
		for(int i=0 ; i<cricketnextTabLnk.size() ; i++)
		{
			webDriverActions.softMouseHover(cricketnextTabLnk.get(i));
			webDriverActions.softScrollToElement(cricketnextTabLnk.get(i));
			String actual = webDriverActions.getAttribute("href", cricketnextTabLnk.get(i));
			webDriverActions.softClickJS(cricketnextTabLnk.get(i));
			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues Found in Homepage Body");

	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Photgallery Slider Navigation for Photogallery Section in Homepage
	 */
	public void verifyPhotogallerySliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(photogalleryRightSliderBtn.get(0));
		webDriverActions.softScrollToElement(photogalleryRightSliderBtn.get(0));
		for(int i = 0; i<photogalleryRightSliderBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activePhotgallerySlider);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(photogalleryRightSliderBtn.get(i));
			webDriverActions.softScrollToElement(photogalleryRightSliderBtn.get(i));
			webDriverActions.softClickJS(photogalleryRightSliderBtn.get(i));
			webDriverActions.waitForSecond(1000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activePhotgallerySlider);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Photo gallery slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Video Slider Navigation for Videos Section in Homepage
	 */
	public void verifyVideosSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(videosRightSliderBtn, 20);
		webDriverActions.softMouseHover(videosRightSliderBtn.get(0));
		webDriverActions.softScrollToElement(videosRightSliderBtn.get(0));
		for(int i = 0; i<videosRightSliderBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeVideosSlider);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(videosRightSliderBtn.get(i));
			webDriverActions.softScrollToElement(videosRightSliderBtn.get(i));
			webDriverActions.softClickJS(videosRightSliderBtn.get(i));
			webDriverActions.waitForSecond(1000);
			String sliderTitleAfterScroll = webDriverActions.getTextFromElement(activeVideosSlider);
			Logs.info(getClass(), sliderTitleAfterScroll);
			softAssert.assertNotEquals(sliderTitle, sliderTitleAfterScroll, "Videos Slider is not working");
			//			sliderTitle = sliderTitleAfterScroll;
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More From News18 Showsha Link Navigation for News18 Showsha Section in Homepage 
	 */
	public void verifyMoreFromNews18ShowshaLinkNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreFromNews18ShowshaLnk, 10);
		webDriverActions.softScrollToElement(moreFromNews18ShowshaLnk);
		webDriverActions.softMouseHover(moreFromNews18ShowshaLnk);
		String actual = webDriverActions.getAttribute("href", moreFromNews18ShowshaLnk);
		webDriverActions.softHighlightElement(moreFromNews18ShowshaLnk);
		webDriverActions.softClickJS(moreFromNews18ShowshaLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage =webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the News18 Showsha Logo Navigation for News18 Showsha Section In Homepage 
	 */
	public void verifyNews18ShowshaLogoNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(news18ShowshaLogoImgLnk, 10);
		webDriverActions.softScrollToElement(news18ShowshaLogoImgLnk);
		webDriverActions.softMouseHover(news18ShowshaLogoImgLnk);
		webDriverActions.softHighlightElement(news18ShowshaLogoImgLnk);
		webDriverActions.softClickJS(news18ShowshaLogoImgLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in  "+currentPage);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyMoreVideosLinkNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreVideosLnk);
	}

	public void verifyBuzzArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,buzzSectiontArticleLnk);
	}

	public void verifyBuzzImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,buzzSectiontImgLnk);
	}

	public void verifyMoreBuzzNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreBuzzLnk);
	}

	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,educationAndCareerSectiontArticleLnk);
	}

	public void verifyEducationAndCareerImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,educationAndCareerSectiontImgLnk);
	}

	public void verifyMoreEducationAndCareerNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreEducationAndCareerLnk);
	}

	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,techSectiontArticleLnk);
	}

	public void verifyTechImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,techSectiontImgLnk);
	}

	public void verifyMoreTechNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreTechLnk );
	}

	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, autoSectiontArticleLnk);
	}

	public void verifyAutoImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,autoSectiontImgLnk);
	}

	public void verifyMoreAutoNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreAutoLnk );
	}

	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,worldSectiontArticleLnk);
	}

	public void verifyWorldImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,worldSectiontImgLnk);
	}

	public void verifyMoreWorldNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType ,moreWorldLnk );
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,sportsSectiontArticleLnk);
	}

	public void verifySportsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,sportsSectiontImgLnk);
	}

	public void verifyMoreSportsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreSportsLnk );
	}

	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,lifestyleSectiontArticleLnk);
	}

	public void verifyLifestyleImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,lifestyleSectiontImgLnk);
	}

	public void verifyMoreLifestyleNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreLifestyleLnk );
	}

	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,healthAndFitnessSectiontArticleLnk);
	}

	public void verifyHealthAndFitnessImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,healthAndFitnessSectiontImgLnk);
	}

	public void verifyMoreHealthAndFitnessNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreHealthAndFitnessLnk );
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,explainersSectiontArticleLnk);
	}

	public void verifyExplainersImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,explainersSectiontImgLnk);
	}

	public void verifyMoreExplainersNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType,moreExplainersLnk );
	}

	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,opinionSectiontArticleLnk);
	}

	public void verifyOpinionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,opinionSectiontImgLnk);
	}

	public void verifyMoreOpinionNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType, moreOpinionLnk );
	}

	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,politicsSectiontArticleLnk);
	}

	public void verifyPoliticsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType,politicsSectiontImgLnk);
	}

	public void verifyMorePoliticsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType ,morePoliticsLnk );
	}

	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , footballSectiontArticleLnk);
	}

	public void verifyFootballImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,footballSectiontImgLnk);
	}

	public void verifyMoreFootballNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType ,moreFootballLnk );
	}

	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,news18ShowshaSectiontArticleLnk);
	}

	public void verifyNews18ShowshaImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,news18ShowshaSectiontImgLnk);
	}

	public void verifyMorePhotogalleryLnkNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType ,morePhotogalleryLnk);
	}

	public void verifyVideosSectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,videosSectiontArticleLnk);
	}

	public void verifyVideosSectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,videosSectiontImgLnk);
	}

	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,webstoriesArticleLnk);
	}

	public void verifyWebstoriesImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,webstoriesImgLnk);
	}

	public void verifyPhotogallerySectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,photogalleryWidgetArticleLnk);
	}

	public void verifyPhotogallerySectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,photogalleryWidgetImgLnk);
	}

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,priorityPanelArticleLnk);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,priorityPanelImgLnk);
	}

	public void verifyTopStoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType,topStoriesWidgetArticleLnk );
	}

	public void verifyCricketNextArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,cricketNextArticleLnk );
	}

	public void verifyCricketNextImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , cricketNextImgLnk);
	}

	public void verifyCricketNextNews18LogoNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, cricketNextNews18LogoLnk);
	}

	public void verifyCricketNextLogoNavigation(String serverType)
	{
		verifyTitleNavigation(serverType, cricketNextLogoLnk);
	}

	public void verifyCricketNextMoreNewsNavigation(String serverType)
	{
		verifyTitleNavigation( serverType , cricketNextMoreLnk);
	}


	//=========================================Rahul's Business Logics=================================//
	/**
	 * @author Rahul
	 * This method is used to click on the latest new article links present in the Homepage of 
	 * mobile mode navigate to their pages
	 */
	public void latestNewsArcticle(String serverType) {
		webDriverActions.waitForPageToLoad();
		if(latestNewsLnkList.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<latestNewsLnkList.size();i++)
			{  
				webDriverActions.softMouseHover(latestNewsLnkList.get(i));
				webDriverActions.softClickJS(latestNewsLnkList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(latestNewsLnkList.get(i));
					webDriverActions.softScrollToElement(latestNewsLnkList.get(i));
					String actual = webDriverActions.getAttribute("href", latestNewsLnkList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(latestNewsLnkList.get(i));
				}

				else {
					webDriverActions.getCurrentPageUrl();
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(LatestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.navigateBack();	
//				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsLnkList.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * @author Rahul.k
	 * This method is used to click on the More latest new article link present in the Homepage of 
	 * mobile mode navigate to their pages
	 */
	public void viewMoreLatestNews(String serverType) {
		webDriverActions.scrollToElement(viewMoreLatestNews);
		webDriverActions.softMouseHover(viewMoreLatestNews);
		webDriverActions.softClickJS(viewMoreLatestNews);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(viewMoreLatestNews);
			webDriverActions.softScrollToElement(viewMoreLatestNews);
			String actual = webDriverActions.getAttribute("href", viewMoreLatestNews);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(viewMoreLatestNews);
		}

		else {
			webDriverActions.getCurrentPageUrl();
		}
		Logs.info(getClass(),"Clicked on More Latest News Link");
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(LatestNewsBreadcrum),"Failed to display Element");
		webDriverActions.navigateBack();
		softAssert.assertAll("Issues found in this url  "+ webDriverActions.getCurrentPageUrl()); 
	}


	/**
	 * @author Rahul.k
	 * This method is used to click on air Quality Index links present in the home page of mobile mode
	 * and navigate their pages
	 */

	public void airQualityIndex(String serverType) {
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		if(airQualityWidgetLst.size()>0) {
			/* Below loop will fetch list of articles and navigate to each one by one*/ 
			for(int i=0;i<airQualityWidgetLst.size();i++)
			{
				webDriverActions.softMouseHover(airQualityWidgetLst.get(i));
				String actual = webDriverActions.getAttribute("href", airQualityWidgetLst.get(i));
				webDriverActions.softClickJS(airQualityWidgetLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(airQualityWidgetLst.get(i));
					webDriverActions.softScrollToElement(airQualityWidgetLst.get(i));
					actual = webDriverActions.getAttribute("href", airQualityWidgetLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(airQualityWidgetLst.get(i));
				}
				webDriverActions.switchToNewWindow();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				int response = genericUtility.checkLinks(currentPage);
				if (response==200) {
					boolean status=genericUtility.compareUrlSub(actual, currentPage);
					softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentPage);

				}
				else {
					softAssert.fail("Possibly Url is Invalid "+currentPage);	
				}
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityWidgetLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	/**
	 * @author Rahul
	 * This method is used to check the functionalities of Live Tv present in Homepage mobile mode
	 */
	public void liveTv() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
//		webDriverActions.softScrollToElement(liveTvHeadline);
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.waitForElement(2000);
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
}


