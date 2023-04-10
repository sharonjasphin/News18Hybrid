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

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class AMPLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert=new SoftAssert();

	public AMPLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	/*list of sections present in Line One Section Bar present at the header of Homepage*/
	@FindBy(xpath ="//ul[contains(@class,'L1_menu')]//li/a")
	private List<WebElement> lineOneSectionELementLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'main_header')] | (//h1)[1]")
	private WebElement headerTxtLogoLnk;

	/*Amp Link */
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='amphtml']/following-sibling::a")
	private WebElement  ampLnk;

	/*AMP Home Page Header Logo */
	@FindBy(xpath ="//div[contains(@class,'logo_box')]" )
	private WebElement headerLogo;

	/*AMP Home Page Header Live Tv */
	@FindBy(xpath ="//div[contains(@class,'main_header')]//ul/li/a[contains(@href,'livetv')]")
	private WebElement headerLiveTv;

	/*AMP Home Page Header Page header text */
	@FindBy(xpath ="//div[contains(@class,'top')]/preceding-sibling::div")
	private WebElement pageContent;


	//	*************************Sanjeeb*****Webelements*****************************

	/*Homepage LiveBlog article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="(//a[contains(@href,'live-updates')])[1]")
	private WebElement homePageLiveBlogArticleLnks;

	/*live Blog Icon*/
	@FindBy(xpath ="(//div[contains(@class,'liveBlog')])[1]")
	private WebElement homepageLiveBlogIcon;

	/*AMP_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'socalWrap')]")
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
	@FindBy(xpath="//ul[contains(@class,'L1_menu')]//a")
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
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'section')]")
	private WebElement hamburgerMenuLHSSectionWidget;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion//h2[contains(text(),'section')]/ancestor::section//a")
	private List<WebElement> hamburgerMenuLHSSectionWidgetEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Nw18 Initiatives')]")
	private WebElement hamburgerMenuLHSNews18InitiativesWidget;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Nw18 Initiatives')]/ancestor::section//a")
	private List<WebElement> hamburgerMenuLHSNews18InitiativesWidgetEleList;

	/*groupsites*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Network18 Group Sites')]")
	private WebElement hamburgerMenuLHSGroupSitesWidget;

	/*groupsites*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Network18 Group Sites')]/ancestor::section//a")
	private List<WebElement> hamburgerMenuLHSGroupSitesWidgetEleList;

	/*Know Us*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Know Us')]")
	private WebElement hamburgerMenuLHSKnowUsWidget;

	/*Know us Ele*/
	@FindBy(xpath="//div[contains(@class,'left')]//amp-accordion/section/h2[contains(text(),'Know Us')]/ancestor::section//a")
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
	@FindBy(xpath="//ul[contains(@class,'nav_social')]//a")
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



	//	*****************************Rahul****Webelement***************

	/*More Latest news Headline*/
	@FindBy(xpath ="//div[contains(@class,'latestNewsWidget vspacer30')]//span")
	private WebElement latestNewsHeadline;

	/*Latest news article Link List*/
	@FindBy(xpath ="//div[contains(@class,'latestNewsWidget')]//div[contains(@class,'txt')]//a")
	private List<WebElement> latestNewsArticleLinkLst;

	/* Latest News Breadcrum*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[1]")
	private WebElement latestNewsBreadcrum;

	/*More Latest news Btn present in Latest News Section*/
	@FindBy(xpath ="//div[contains(@class,'more-listing')]//a[contains(@href,'/amp/news')]")
	private WebElement moreLatestNewsBtn;
	//	***************************Anupam***Webelement******************

	/* movie section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]" )
	private WebElement moviesWidgetSectionLnk;

	/*movie widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/ul/li/a")
	private List<WebElement> moviesWidgetArticleLnk;

	/*movie widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> moviesWidgetImgLnk;

	/*movie  article body Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'article-body')])[1]")
	private WebElement moviesArticleBody;

	/*article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/span)[1] | (//div[contains(@class,'breadcum')])[1] | //div[contains(@class,'brade_crum bnon')]")
	private WebElement articleBreadcrumb;

	/*breadcrum present in movies page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement moviesMoreBreadcrumb;

	/*more movies Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/movies/')]/parent::div/div/a")
	private WebElement moreMoviesWidgetLnk;

	////------cricketnext

	/* CricketNext section Link in Homepage */
	@FindBy(xpath ="//div[(@class='vspacer30')]/a[contains(@href,'/cricketnext/')]" )
	private WebElement cricketNextWidgetSectionLnk;

	/*CricketNext widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/ul/li/a")
	private List<WebElement> cricketNextWidgetArticleLnk;

	/*CricketNext widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> cricketNextWidgetImgLnk;

	/*more CricketNext Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/cricketnext/')]/parent::div/div/a")
	private WebElement moreCricketNextWidgetLnk;

	/*CricketNext  article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/p)[1] | //div[contains(@class,'breadcum')]")
	private WebElement cricketNextBreadcrumb;


	////------india

	/* india section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]" )
	private WebElement indiaWidgetSectionLnk;

	/*india widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/ul/li/a")
	private List<WebElement> indiaWidgetArticleLnk;

	/*india widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> indiaWidgetImgLnk;

	/*more india Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/india/')]/parent::div/div/a")
	private WebElement moreIndiaWidgetLnk;

	/*india article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[1]")
	private WebElement indiaBreadcrumb;


	////------business

	/* business section Link in Homepage */
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]" )
	private WebElement businessWidgetSectionLnk;

	/*business widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/ul/li/a")
	private List<WebElement> businessWidgetArticleLnk;

	/*business widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> businessWidgetImgLnk;

	/*more business Lnk present in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'vspacer30')]/a[contains(@href,'/business/')]/parent::div/div/a")
	private WebElement moreBusinessWidgetLnk;

	/*business article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'breadcum')]/h1)[1]")
	private WebElement businessBreadcrumb;

	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]")
	private WebElement horoscopeSectionLnk;

	/*Horoscope Active Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[(@aria-hidden='false')]//p")
	private WebElement horoscopeActiveText;

	/*Forward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[contains(@class,'carousel-arrows')]/div[contains(@class,'button-next')]")
	private WebElement forwardTapButton;

	/*Backward tap Button in Horoscope Section in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_slider')]//div[contains(@class,'carousel-arrows')]/div[contains(@class,'button-prev')]")
	private WebElement backwardTapButton;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'horoscope_section')]//div[contains(@class,'i-amphtml-carousel-slotted i-amphtml-carousel-wrapper i-amphtml-carousel-slide-item')]//a")
	private  List<WebElement> horoscopeSigns;

	/* Description for each astro sign present in horoscope page */
	@FindBy(xpath ="//p[@class='detail_intro']")
	private WebElement detailIntro;

	//videowall------
	/*video wall widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//a")
	private WebElement videoWallWidgetArticleLnk;

	/*video wall article breadcrumb Link in article page*/
	@FindBy(xpath ="(//div[contains(@class,'BreadCum')]/span)[1]|//div[contains(@class,'breadcum')]")
	private WebElement videoWallArticleBreadcrumb;

	/*video wall widget image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'videoWall')]//amp-img")
	private WebElement videoWallWidgetImgLnk;

	/*fromOurShows widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_left')]/a[contains(@href,'/ivideos/')]/parent::div//a[2]")
	private List<WebElement> fromOurShowsWidgetArticleLnk;

	/*fromOurShows widget Image Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story_listing_img')]//amp-img//parent::a")
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

	/*video wall widget Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'photo-gallery')]//h2[contains(.,'Videos Wall')]")
	private WebElement videoWallWidgetLnk;


	//	****************Vipin***Webelements**************************

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'mlead-story')]/h1/a | //div[contains(@class,'story')]/div[contains(@class,'mstory-thumb')]//div[contains(@class,'text')]//a")
	private List<WebElement> priorityPanelArticleLnk;

	/*Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//h1[contains(@class,'article_heading')] | //div[contains(@class,'article_main')]/h1 | //div[contains(@class,'TstoryHead')]/h1 | //div[contains(@class,'pht-artcl')]/h1 | //div[contains(@class,'article-container')]//h1")
	private WebElement articleHeaderTxt;

	/*List of Priority Article Links in News18 Homepage*/
	@FindBy(xpath = "//div[contains(@class,'mlead-story')]//amp-img | //div[contains(@class,'story')]/div[contains(@class,'mstory-thumb')]//div[contains(@class,'img')]//amp-img")
	private List<WebElement> priorityPanelImgLnk;

	/*Top Stories Widget article Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'story')]/div[contains(@class,'mtopstory')]/ul//a")
	private List<WebElement> topStoriesWidgetArticleLnk;

	/*List of Hot and Trending Widget articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'hntranding')]//ul//a[contains(@class,'story_title')]")
	private List<WebElement> hotAndTrendingWidgetArticleLnk;

	/*List of Hot and Trending Widget Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'hntranding')]//ul//amp-img")
	private List<WebElement> hotAndTrendingWidgetImgLnk;

	/*More Hot and Trending articles Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'host_trending')]//h2[.='Hot & Trending']/ancestor::div[contains(@class,'host_trending')]/ul/div[contains(@class,'more_story')]/a")
	private WebElement moreHotAndTrendingLnk;

	/* List Of WebStories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'scroll')]/a")
	private List<WebElement> webstoriesArticleLnk;

	/* WebStoreis Next Story Button */
	@FindBy(xpath = "//button[contains(@aria-label,'Next page')]")
	private WebElement nextWebstoriesBtn;

	/* List Of WebStories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'scroll')]/a//amp-img")
	private List<WebElement> webstoriesImgLnk;

	/* Right Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'arrows')]/div[contains(@class,'next')]")
	private WebElement webstoriesRightSlideBtn;

	/* Left Slide Button for Webstories Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'story_top')]//h2/a[contains(@href,'web-stories')]/ancestor::div[contains(@class,'story_list')]//div[contains(@class,'arrows')]/div[contains(@class,'prev')]")
	private WebElement webstoriesLeftSlideBtn;

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

	/* List of Slider Button for Cricknext in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button")
	private List<WebElement> cricketnextRightSlideBtn;

	/* Active Arrow Button for CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]/div[contains(@class,'glide')]//button[contains(@class,'active')]")
	private WebElement activeCricketnextBtn;

	/* Active Cricketnext Article for Cricketnext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_section')]//li[contains(@class,'active')]//h3")
	private WebElement activeCricketnextTxt;


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

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div//li/a")
	private List<WebElement> buzzSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div//li/a//img")
	private List<WebElement> buzzSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/buzz/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreBuzzLnk;

	/*List of Buzz Article Link for Buzz Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div//li/a")
	private List<WebElement> educationAndCareerSectiontArticleLnk;

	/*List of Buzz Image Links for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div//li/a//img")
	private List<WebElement> educationAndCareerSectiontImgLnk;

	/* More Buzz News Link for Buzz Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/education-career/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreEducationAndCareerLnk;

	/*List of Tech Article Link for Tech Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div//li/a")
	private List<WebElement> techSectiontArticleLnk;

	/*List of Tech Image Links for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div//li/a//img")
	private List<WebElement> techSectiontImgLnk;

	/* More Tech News Link for Tech Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/tech/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreTechLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div//li/a")
	private List<WebElement> healthAndFitnessSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div//li/a//img")
	private List<WebElement> healthAndFitnessSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/health-and-fitness/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreHealthAndFitnessLnk;

	/*List of Health and Fitness Article Link for Health and Fitness Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div//li/a")
	private List<WebElement> explainersSectiontArticleLnk;

	/*List of Health and Fitness Image Links for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div//li/a//img")
	private List<WebElement> explainersSectiontImgLnk;

	/* More Health and Fitness News Link for Health and Fitness Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/explainers/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreExplainersLnk;

	/*List of Opinion Article Link for Opinion Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div//li/a")
	private List<WebElement> opinionSectiontArticleLnk;

	/*List of Opinion Image Links for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div//li/a//amp-img")
	private List<WebElement> opinionSectiontImgLnk;

	/* More Opinion News Link for Opinion Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/opinion/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreOpinionLnk;

	/*List of politics Article Link for politics Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div//li/a")
	private List<WebElement> politicsSectiontArticleLnk;

	/*List of politics Image Links for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div//li/a//img")
	private List<WebElement> politicsSectiontImgLnk;

	/* More politics News Link for politics Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/politics/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement morePoliticsLnk;

	/*List of Football Article Link for Football Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div//li/a")
	private List<WebElement> footballSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div//li/a//img")
	private List<WebElement> footballSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'pacer')]/a[contains(@href,'/football/')]/parent::div/div[contains(@class,'more')]/a")
	private WebElement moreFootballLnk;

	/*List of News18 Showsha Article Link for News18 Showsha Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]")
	private List<WebElement> news18ShowshaSectiontArticleLnk;

	/*List of Football Image Links for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]//div[contains(@class,'ss_rows')]/a[contains(@class,'row')]//img")
	private List<WebElement> news18ShowshaSectiontImgLnk;

	/* More Football News Link for Football Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/a")
	private WebElement moreFromNews18ShowshaLnk;

	/* News18 Showsha Logo Image Link for News18 Showsha Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ss_widget')]/div[contains(@class,'header')]/a/img[contains(@src,'showsha')]")
	private WebElement news18ShowshaLogoImgLnk;

	/*List of Auto Article Link for Auto Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/ul/li/a")
	private List<WebElement> autoSectiontArticleLnk;

	/*List of Auto Image Links for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> autoSectiontImgLnk;

	/* More Auto News Link for Auto Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/auto/')]/parent::div/div/a")
	private WebElement moreAutoLnk;

	/*List of World Article Link for World Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/ul/li/a")
	private List<WebElement> worldSectiontArticleLnk;

	/*List of World Image Links for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> worldSectiontImgLnk;

	/* More World News Link for World Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/world/')]/parent::div/div/a")
	private WebElement moreWorldLnk;

	/*List of Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/ul/li/a")
	private List<WebElement> sportsSectiontArticleLnk;

	/*List of Sports Image Links for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/ul/li/a/amp-img")
	private List<WebElement> sportsSectiontImgLnk;

	/* More Sports News Link for Sports Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/sports/')]/parent::div/div/a")
	private WebElement moreSportsLnk;

	/*List of Lifestyle Article Link for Lifestyle Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/ul/li/a")
	private List<WebElement> lifestyleSectiontArticleLnk;

	/*List of Lifestyle Image Links for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/ul/li/a/amp-img")
	private List<WebElement> lifestyleSectiontImgLnk;

	/* More Lifestyle News Link for Lifestyle Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'vspacer30')]/a[contains(@href,'/lifestyle/') and not (contains(@href,'/health-and-fitness/'))]/parent::div/div/a")
	private WebElement moreLifestyleLnk;

	/*List of CricketNext Widget Article Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet-box')]//ul//li//a//img")
	private List<WebElement> cricketnextImgLnk;


	/* List of Cricknext Widget Article Text in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet-box')]//ul//li//a")
	private List<WebElement> cricketnextArticleLnk;

	/* List of Cricketnext Tabs Link in CricketNext Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'cricketnet_tab')]/a")
	private List<WebElement> cricketnextTabLnk;

	/*List of Photogallery Article Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspace')]//descendant::li/a[@class]")
	private List<WebElement> photogalleryWidgetArticleLnk;

	/* Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Photogalleries']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'next')]")
	private WebElement photogalleryRightSliderBtn;

	/* Slider Button in Photogallery Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Photogalleries']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'prev')]")
	private WebElement photogalleryLeftSliderBtn;

	/*List of Photogallery Image Links in Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspace')]//descendant::li/a//amp-img")
	private List<WebElement> photogalleryWidgetImgLnk;

	/* More Photogalleries Link for Photogallery Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer30 prelative photo-gallery-slider ')]//div[@class='load_more']//a[contains(@href,'/amp/photogallery')]")
	private WebElement morePhotogalleryLnk;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'next')]")
	private WebElement videosRightSliderBtn;

	/* List of Slider Button in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'prev')]")
	private WebElement videosLeftSliderBtn;

	/* More Video Button Breadcrum*/
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]")
	private WebElement moreVideosBreadcrum;

	/* More Videos Link for Videos Section in Homepage */
	@FindBy(xpath = "//div[@class='load_more']//a[@href='/amp/videos/']")
	private WebElement moreVideosLnk;

	/*List of Videos Image Links for Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'slider_row')]//amp-img")
	private List<WebElement> videosSectiontImgLnk;

	/*List of Videos Article Links in Videos Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'photo-gallery vspacer')]//span[.='Videos']/ancestor::div[contains(@class,'photo')]//div[contains(@class,'slider_row')]/a[@class]")
	private List<WebElement> videosSectiontArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'txt')]" )
	private List<WebElement> cricketNextArticleLnk;

	/* List of CricketNext Widget Article Links in Homepage */
	@FindBy(xpath ="//div[contains(@class,'cn_widget')]/a/div[contains(@class,'img')]/amp-img" )
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


	//======================================================AMP ENGLISH=============================================================

	//======================================= Web elements for Line One Sections ==================================

	/*Click On Movie Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/movies/']")
	private WebElement movieEle;

	/*Click On cricket Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/cricketnext/amp/']")
	private WebElement cricketEle;

	/*Click On india Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/india/']")
	private WebElement indiaEle;

	/*Click On showsha Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/entertainment/']")
	private WebElement showshaEle;

	/*Click On politics Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/politics/']")
	private WebElement politicsEle;

	/*Click On world Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/world/']")
	private WebElement worldEle;

	/*Click On education Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/education-career/']")
	private WebElement educationEle;

	/*Click On business Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/business/']")
	private WebElement businessEle;

	/*Click On buzz Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/buzz/']")
	private WebElement buzzEle;

	/*Click On opinion Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/opinion/']")
	private WebElement opnionEle;

	/*Click On photos Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/photogallery/']")
	private WebElement photosEle;

	/*Click On videos Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/videos/']")
	private WebElement videsoEle;

	/*Click On latest Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/news/']")
	private WebElement latestEle;

	/*Click On lifeStyle Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/lifestyle/']")
	private WebElement lifeStyleEle;

	/*Click On webStories Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/web-stories/']")
	private WebElement webStoriesEle;

	/*Click On expliners Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/explainers/']")
	private WebElement explinersEle;

	/*Click On sports Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/sports/']")
	private WebElement sportsEle;

	/*Click On tech Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/tech/']")
	private WebElement techEle;

	/*Click On auto Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/auto/']")
	private WebElement autoEle;

	/*Click On Astrology Section*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]/li/a[@href='/amp/astrology/']")
	private WebElement astrologyEle;


	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = webDriverActions.getCurrentPageUrl();
		String ampurl =getAmpHtml(currentUrl);
		if(!(ampurl==""))
		{
			webDriverActions.navigateToUrl(ampurl);
		}
		else
		{
			softAssert.fail("No AMP URL is available For This Url "+ currentUrl);	
		}
	}

	/**
	 * @author Abhishek Raj
	 * This Method is used to get AmpHtml urls present in respective pages
	 * @param url
	 * @return
	 */
	public String getAmpHtml(String url) {
		String amphHtmlLnk = "";
		webDriverActions.navigateToUrl(url);
		webDriverActions.waitForPageToLoad();
		webDriverActions.viewPageSource();
		webDriverActions.waitForPageToLoad();
		amphHtmlLnk = webDriverActions.getAttribute("href", ampLnk);
		if(! amphHtmlLnk.contains("amp") || amphHtmlLnk==" ") {
			Logs.error(getClass(), "Amp url is not present");	
		}
		Logs.info(getClass(), amphHtmlLnk);
		int count=0;
		if(amphHtmlLnk.contains("amp"))
		{
			count++;
			if(count==1)
			{
				Logs.info(getClass(), amphHtmlLnk  +" Amp  is  present  " + count);
			}
			else
			{
				Logs.info(getClass(), amphHtmlLnk  + "null" );
			}
		}
		return amphHtmlLnk;
	}

	/**
	 * @author DanishR
	 * This method is used to display News18 logo
	 */
	public void verifyHeaderLogo() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.softWaitForElementVisibility(headerLogo, 20);
		webDriverActions.mouseHoverAndClick(headerLogo);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(headerLogo);
			webDriverActions.softClick(headerLogo);
		}
		Logs.info(getClass(),"News18 Header Logo is displayed");
		softAssert.assertTrue(webDriverActions.isElementDisplayed(pageContent), "Possibly element not displayed "+ webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in Home Page Header Logo ");
	}

	/**
	 * @author DanishR
	 * This method is used to validate Header Live Tv
	 */
	public void verifyHeaderLiveTv(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softWaitForElementVisibility(headerLiveTv, 20);
		webDriverActions.mouseHoverAndClick(headerLiveTv);
		webDriverActions.waitForPageToLoad();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(headerLiveTv);
			webDriverActions.softClick(headerLiveTv);
		}
		if (serverType.contains("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		Logs.info(getClass(),"Navigated to Live TV page");
		softAssert.assertTrue(webDriverActions.isElementDisplayed(pageContent), "Possibly element not displayed "+ currentPageUrl);
		softAssert.assertAll("Issues found in Home Page Header Logo ");
	}

	//	*************************Sanjeeb**Business Logic********************************


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.continuousScrollTillElement(homepageLiveBlogIcon, 10);
			String title = webDriverActions.getAttribute("target", homepageLiveBlogIcon);
			if(webDriverActions.isElementDisplayed(homePageLiveBlogArticleLnks))
			{
				webDriverActions.clickJS(homePageLiveBlogArticleLnks);
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					webDriverActions.waitForSecond(1000);
				}
			}
			else
			{
				Logs.error(getClass(), "Exception in Live blog in HomePage Link");
				throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
			}
		}
		catch(Exception e) {
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());
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
		for(int i=1;i<hamburgerChnageLanguageSectionEleList.size();i++)
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
		webDriverActions.softClickJS(section);
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
					webDriverActions.softClickJS(section);
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
					webDriverActions.softClickJS(section);
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
	public void verfyhamburgerSecondMenu(String server,WebElement section , List<WebElement> sectionlist)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(section);
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
	public void verfyhamburgerLHSSection(String server)
	{
		verfyhamburgerSecondMenu(server, hamburgerMenuLHSSectionWidget, hamburgerMenuLHSSectionWidgetEleList);
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
		verfyhamburgerSecondMenu(server, hamburgerMenuLHSInTrendsWidget, hamburgerMenuLHSInTrendsWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerSocialShareValidation(String server)
	{
		verfyhamburgerSecondMenu(server, hamburgerMenuSocialShareSection, hamburgerMenuSocialShareSectionWidgetEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * KnowUs Section Validation
	 */
	public void verfyhamburgerHeaderValidation()
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
				boolean status=genericUtility.compareUrlSub(pageUrl, expected);
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

	//	***************Rahul**Business Logic****************

	/**
	 * This method contains the steps to verify Latest News article section navigation
	 */
	public void verifyLatestNews() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(latestNewsHeadline, 6);
		if(latestNewsArticleLinkLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */
			for(int i=0;i<latestNewsArticleLinkLst.size();i++)
			{
				webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
				webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(latestNewsBreadcrum),"Possibly Latest News Breadcrum is not present");
				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsArticleLinkLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}
	public void moreLatestNews() {		
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(moreLatestNewsBtn);
		String actual2 = webDriverActions.getAttribute("href", moreLatestNewsBtn);
		webDriverActions.softClickJS(moreLatestNewsBtn);
		Logs.info(getClass(),"Clicked on More Latest News Link");
		String expected2 = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual2,expected2 , "Failed to navigate "+actual2);
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}


	//	***************Rahul**Business Logic****************

	/**
	 * This method contains the steps to verify Latest News article section navigation
	 */
	public void verifyLatestNews(String serverType) {
		webDriverActions.waitForPageToLoad();
		if(latestNewsArticleLinkLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<latestNewsArticleLinkLst.size();i++)
			{  
				webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
				webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(latestNewsArticleLinkLst.get(i));
					webDriverActions.softScrollToElement(latestNewsArticleLinkLst.get(i));
					String actual = webDriverActions.getAttribute("href", latestNewsArticleLinkLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(latestNewsArticleLinkLst.get(i));
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
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.navigateBack();	
				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+latestNewsArticleLinkLst.size());
		}
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}
	public void moreLatestNews(String serverType) {	
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(moreLatestNewsBtn);
		webDriverActions.softClickJS(moreLatestNewsBtn);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(moreLatestNewsBtn);
			webDriverActions.softScrollToElement(moreLatestNewsBtn);
			String actual = webDriverActions.getAttribute("href", moreLatestNewsBtn);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(moreLatestNewsBtn);
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

		webDriverActions.waitForPageToLoad();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsBreadcrum),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues found in this url "+ webDriverActions.getCurrentPageUrl()); 
	}

	//	****************Anupam**Business Logic*****************

	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList)
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
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) , "Unable to Display Element "+articleBreadcrumb+" on "+currentPage);
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
		verifyArticlesNavigation(serverType,moviesWidgetSectionLnk,moviesWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	public void verifyCricketNextWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,cricketNextWidgetSectionLnk,cricketNextWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,indiaWidgetSectionLnk,indiaWidgetArticleLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	public void verifyBusinessWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,businessWidgetSectionLnk,businessWidgetArticleLnk);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType,WebElement section ,List<WebElement> artList)
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
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb) ,  "Unable to Display Element "+articleBreadcrumb + " on "+currentPage);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}			}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


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
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		String actualUrl = webDriverActions.getAttribute("href", moreLnk);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" on "+currentPage);
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
			webDriverActions.waitForSecond(1000);
			webDriverActions.softClickJS(forwardTapButton);
			webDriverActions.waitForSecond(1000);
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
	public void verifyHoroscopeDescription(String serverType)
	{
		SoftAssert softAssert=new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 6);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			webDriverActions.waitForSecond(2000);
			String horoscopeText = webDriverActions.getTextFromElement(horoscopeActiveText);
			Logs.info(getClass(), horoscopeText);
			webDriverActions.navigateToNewTab(horoscopeSigns.get(i));
			webDriverActions.switchToNewWindow();

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
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(detailIntro);
			Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(detailIntro));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(detailIntro) , "Unable to Display description after clicking on "+horoscopeText);
			webDriverActions.closeDriver();
			webDriverActions.waitForSecond(2000);
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(1000);
			webDriverActions.softClickJS(forwardTapButton);
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}

	//------

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	public void verifyVideoWallArticleNavigation(String serverType)
	{
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
		webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
		//		String expectedUrl = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb),"Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Video Wall Widget");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of From our shows Widget Article
	 */
	public void verifyFromOurShowsArticleNavigation(String serverType)
	{
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
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
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
			webDriverActions.softHighlightElement(videoWallArticleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(videoWallArticleBreadcrumb) , "Unable to Display Element "+videoWallArticleBreadcrumb+" on "+currentPage);
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
			String expectedUrl =webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			webDriverActions.softHighlightElement(jumpToShowOptionBreadcrumb);
			softAssert.assertTrue(((genericUtility.compareTwoStrings(expectedUrl, actualUrl)) && (webDriverActions.softIsElementDisplayed(jumpToShowOptionBreadcrumb))),"Failed to navigate to"+actualUrl);
			if (serverType.equalsIgnoreCase("preProd")) {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(2000);
			webDriverActions.mouseHoverAndClick(jumpToShowWidgetLnk);
		}
		softAssert.assertAll("Issue Found in HomePage Body Jump To Show Widget");
	}


	//	*****************************Vipin***Business Logic****************

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
		verifyArticleNavigation( serverType,hotAndTrendingWidgetArticleLnk);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to More Hot and Trending Link and Navigate to all 
	 * the Hot and Trending 
	 */
	public void verifyHotAndTrendingImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , hotAndTrendingWidgetImgLnk);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation for Webstories Section in Homepage
	 */
	public void verifyWebStoriesSlideNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(webstoriesRightSlideBtn);
		webDriverActions.softScrollToElement(webstoriesRightSlideBtn);
		if (webDriverActions.isElementDisplayed(webstoriesRightSlideBtn)) {
			for (int i = 0; i < webstoriesArticleLnk.size(); i++) {
				if(i==0 || i==1 || i==2 || i==3 )
				{
					softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesRightSlideBtn));
					webDriverActions.softMouseHover(webstoriesRightSlideBtn);
					webDriverActions.softScrollToElement(webstoriesRightSlideBtn);
					webDriverActions.softClickJS(webstoriesRightSlideBtn);
					webDriverActions.waitForSecond(1000);
				} 
			}
		}
		else
		{
			softAssert.fail("Webstories Right Slider is not Displayed or Not Clickable ");
		}
		if (webDriverActions.isElementDisplayed(webstoriesLeftSlideBtn)) {
			for (int i = 0; i < webstoriesArticleLnk.size(); i++) {
				if(i==0 || i==1 || i==2 || i==3 )
				{
					softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesLeftSlideBtn));
					webDriverActions.softMouseHover(webstoriesLeftSlideBtn);
					webDriverActions.softScrollToElement(webstoriesLeftSlideBtn);
					webDriverActions.softClickJS(webstoriesLeftSlideBtn);
					webDriverActions.waitForSecond(1000);
				} 
			}
		}
		else
		{
			softAssert.fail("Webstories Left Slider is not Displayed or Not Clickable ");
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
		webDriverActions.continuousScrollTillElement(webstoriesSeeMoreLnk, 20);
		webDriverActions.softMouseHover(webstoriesSeeMoreLnk);
		webDriverActions.softScrollToElement(webstoriesSeeMoreLnk);
		String actual = webDriverActions.getAttribute("href", webstoriesSeeMoreLnk);
		webDriverActions.clickJS(webstoriesSeeMoreLnk);
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertEquals(actual, currentPage, "Unable to Navigate "+actual);
		if (serverType.equalsIgnoreCase("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		else {
			currentPage = webDriverActions.getCurrentPageUrl();
		}
		webDriverActions.softHighlightElement(webstoriesBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.isElementDisplayed(webstoriesBreadCrumbDiv), "Unable to Display Element in "+currentPage);
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
		webDriverActions.continuousScrollTillAllElement(cricketnextRightSlideBtn, 20);
		webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(0));
		webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(0));
		for(int i = 1; i<cricketnextRightSlideBtn.size() ; i++)
		{
			String sliderTitle = webDriverActions.getTextFromElement(activeCricketnextTxt);
			Logs.info(getClass(), sliderTitle);
			webDriverActions.softMouseHover(cricketnextRightSlideBtn.get(i));
			webDriverActions.softScrollToElement(cricketnextRightSlideBtn.get(i));
			webDriverActions.softClickJS(cricketnextRightSlideBtn.get(i));
			webDriverActions.waitForSecond(2000);
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv));
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
		webDriverActions.continuousScrollTillAllElement(photogalleryWidgetImgLnk, 20);
		webDriverActions.softMouseHover(photogalleryRightSliderBtn);
		webDriverActions.softScrollToElement(photogalleryRightSliderBtn);
		if(webDriverActions.isElementDisplayed(photogalleryRightSliderBtn))
		{
			for(int i = 1; i<photogalleryWidgetImgLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(photogalleryRightSliderBtn);
				webDriverActions.softScrollToElement(photogalleryRightSliderBtn);
				webDriverActions.softClickJS(photogalleryRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(photogalleryRightSliderBtn), "Unable to Display Element "+photogalleryRightSliderBtn);
			}
		}
		else
		{
			softAssert.fail("Photogallery Right Slider is Not Displayed");
		}

		if(webDriverActions.isElementDisplayed(photogalleryLeftSliderBtn))
		{
			for(int i = 1; i<photogalleryWidgetImgLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(photogalleryLeftSliderBtn);
				webDriverActions.softScrollToElement(photogalleryLeftSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(photogalleryLeftSliderBtn), "Unable to Display Element "+photogalleryLeftSliderBtn);
				webDriverActions.softClickJS(photogalleryLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Photogallery Left Slider is Not Displayed");
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
		webDriverActions.continuousScrollTillElement(videosRightSliderBtn, 20);
		webDriverActions.softMouseHover(videosRightSliderBtn);
		webDriverActions.softScrollToElement(videosRightSliderBtn);
		if(webDriverActions.isElementDisplayed(videosRightSliderBtn))
		{
			for(int i = 0; i<videosSectiontArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(videosRightSliderBtn);
				webDriverActions.softScrollToElement(videosRightSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(videosRightSliderBtn), "Unable to Display Element "+videosRightSliderBtn);
				webDriverActions.softClickJS(videosRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Video Section Right Slider Button is not Displayed");
		}

		if(webDriverActions.isElementDisplayed(videosLeftSliderBtn))
		{
			for(int i = 0; i<videosSectiontArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(videosLeftSliderBtn);
				webDriverActions.softScrollToElement(videosLeftSliderBtn);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(videosLeftSliderBtn), "Unable to Display Element "+videosLeftSliderBtn);
				webDriverActions.softClickJS(videosLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
			}
		}
		else
		{
			softAssert.fail("Possibly Video Section Left Slider Button is not Displayed");
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
		webDriverActions.continuousScrollTillElement(moreFromNews18ShowshaLnk, 20);
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
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+articleBreadCrumbDiv);
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
		webDriverActions.continuousScrollTillElement(news18ShowshaLogoImgLnk, 20);
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
		softAssert.assertTrue(webDriverActions.isElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+articleBreadCrumbDiv);
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
		verifyMoreNewsNavigation( serverType , moreBuzzLnk);
	}

	public void verifyEducationAndCareerArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , educationAndCareerSectiontArticleLnk);
	}

	public void verifyEducationAndCareerImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , educationAndCareerSectiontImgLnk);
	}

	public void verifyMoreEducationAndCareerNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreEducationAndCareerLnk);
	}

	public void verifyTechArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,techSectiontArticleLnk);
	}

	public void verifyTechImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , techSectiontImgLnk);
	}

	public void verifyMoreTechNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreTechLnk);
	}

	public void verifyAutoArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , autoSectiontArticleLnk);
	}

	public void verifyAutoImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , autoSectiontImgLnk);
	}

	public void verifyMoreAutoNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreAutoLnk);
	}

	public void verifyWorldArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , worldSectiontArticleLnk);
	}

	public void verifyWorldImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , worldSectiontImgLnk);
	}

	public void verifyMoreWorldNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreWorldLnk);
	}

	public void verifySportsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , sportsSectiontArticleLnk);
	}

	public void verifySportsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , sportsSectiontImgLnk);
	}

	public void verifyMoreSportsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreSportsLnk);
	}

	public void verifyLifestyleArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , lifestyleSectiontArticleLnk);
	}

	public void verifyLifestyleImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , lifestyleSectiontImgLnk);
	}

	public void verifyMoreLifestyleNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreLifestyleLnk);
	}

	public void verifyHealthAndFitnessArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , healthAndFitnessSectiontArticleLnk);
	}

	public void verifyHealthAndFitnessImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , healthAndFitnessSectiontImgLnk);
	}

	public void verifyMoreHealthAndFitnessNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreHealthAndFitnessLnk);
	}

	public void verifyExplainersArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , explainersSectiontArticleLnk);
	}

	public void verifyExplainersImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , explainersSectiontImgLnk);
	}

	public void verifyMoreExplainersNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreExplainersLnk);
	}

	public void verifyOpinionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , opinionSectiontArticleLnk);
	}

	public void verifyOpinionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , opinionSectiontImgLnk);
	}

	public void verifyMoreOpinionNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreOpinionLnk);
	}

	public void verifyPoliticsArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , politicsSectiontArticleLnk);
	}

	public void verifyPoliticsImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , politicsSectiontImgLnk);
	}

	public void verifyMorePoliticsNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , morePoliticsLnk);
	}

	public void verifyFootballArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , footballSectiontArticleLnk);
	}

	public void verifyFootballImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , footballSectiontImgLnk);
	}

	public void verifyMoreFootballNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , moreFootballLnk);
	}

	public void verifyNews18ShowshaArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , news18ShowshaSectiontArticleLnk);
	}

	public void verifyNews18ShowshaImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , news18ShowshaSectiontImgLnk);
	}

	public void verifyMorePhotogalleryLnkNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , morePhotogalleryLnk);
	}

	public void verifyVideosSectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , videosSectiontArticleLnk);
	}

	public void verifyVideosSectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , videosSectiontImgLnk);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Navigate the Article Text Navigation for Webstories Navigation
	 */
	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 10);
		for(int i=0; i<webstoriesArticleLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
			webDriverActions.softScrollToElement(webstoriesArticleLnk.get(i));
			webDriverActions.softClickJS(webstoriesArticleLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			String currentPage =webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			}
			webDriverActions.softHighlightElement(nextWebstoriesBtn);
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebstoriesBtn) , "Unable to Display Element "+nextWebstoriesBtn+ " in "+webDriverActions.getCurrentPageUrl());;
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Navigate the Image Navigation for Webstories Navigation
	 */
	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 10);
		webDriverActions.softScrollToElement(webstoriesImgLnk.get(0));
		webDriverActions.softMouseHover(webstoriesImgLnk.get(0));
		for(int i=0; i<webstoriesImgLnk.size() ;i++)
		{
			webDriverActions.softMouseHover(webstoriesImgLnk.get(i));
			webDriverActions.softScrollToElement(webstoriesImgLnk.get(i));
			webDriverActions.softClickJS(webstoriesImgLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
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
			webDriverActions.softHighlightElement(nextWebstoriesBtn);
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebstoriesBtn) , "Unable to Display Element "+nextWebstoriesBtn+ " in "+webDriverActions.getCurrentPageUrl());;
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyPhotogallerySectionArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , photogalleryWidgetArticleLnk);
	}

	public void verifyPhotogallerySectionImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , photogalleryWidgetImgLnk);
	}

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , priorityPanelArticleLnk);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , priorityPanelImgLnk);
	}

	public void verifyTopStoriesArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , topStoriesWidgetArticleLnk );
	}

	public void verifyCricketNextArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType ,cricketNextArticleLnk);
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

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Astrology widget present on line one section.
	 */
	public void clickOnLineOneVideosLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(videsoEle);
		webDriverActions.waitForElement(200);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.clickJS(videsoEle);
			webDriverActions.waitForElement(1000);
		}
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
}
