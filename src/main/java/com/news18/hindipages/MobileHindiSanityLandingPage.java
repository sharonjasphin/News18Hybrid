package com.news18.hindipages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
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

public class MobileHindiSanityLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public MobileHindiSanityLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*Homepage List of article Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;

	/*Homepage List of Live article Link for news18 Hindi Page*/
	@FindBy(xpath ="//ul[contains(@class,'global-storylist')]//h3//span[contains(@class,'livenow_btn')]/ancestor::a")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in LineOne navigation bar in Hindi HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/photogallery/']")
	private WebElement photoSectionLnk;

	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//section[contains(@class,'photo_section_b')]//ul//li//a//img")
	private List<WebElement> photogalleryArticleLnk ;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[@href='/news/']")
	private WebElement latestSectionLnk;

	/*Line One Section Lnk present in Header of Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(@href,'/states')]")
	private WebElement sectionLnk;

	/*Cricket Next Lnk present in line one navigation bar of Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'mobile_nav_icon')]//a[contains(@class,'nav_icon')]")
	private WebElement hamburgerMenuLnk;

	/*Cricket Next Lnk present in line one navigation bar of Hindi Home Page*/
	@FindBy(xpath="//ul[contains(@id,'menu-news18-india-top-menu')]//li[contains(@rel,'videos')]//a")
	private WebElement videosLnk;

	/*Cricket Next Lnk present in line one navigation bar of Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'story_section_row')]//a[contains(@href,'videos')]")
	private WebElement videosAllLnk;

	/*Topics Links articles present on Homepage*/
	@FindBy(xpath ="//a[contains(@href,'https://hindi.news18.com/tag/') and not(contains(@href,'news18-hindi-originals'))]")
	private List<WebElement> topicslinks;

	/*Cricket Next Lnk present in line one navigation bar of Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'ftr_row')]//a[contains(@href,'/gold-price-today/')]")
	private WebElement trendingTopicsLnk;

	/*Cricket Next Lnk present in line one navigation bar of Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[contains(., 'क्रिकेट')]")
	private WebElement cricketNextLnk;

	/*Trending Topic link present at header section*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]/a[contains(@href,'tag')]")
	private List<WebElement> trendingTopicsfirstLnk;

	/*live Blog Icon*/
	@FindBy(xpath ="(//span[contains(@class,'livenow')])[1]")
	private WebElement homepageLiveBlogIcon;

	/*AMP_LiveBlogPage Social share Links*/
	@FindBy(xpath = "//div[contains(@class,'social_share_sec')]//a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'social_share_sec')]")
	private WebElement allShareIcons;


	//	************************Danish**WebElements*********************************************8

	/*Bhasha Chune(Change Language) section herader present at Header Hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'chs-tplng')]//ul//li//a[contains(@href,'#')]")
	private WebElement hamburgerLangSection;  

	/*Bhasha Chune(Change Language) links present at Header Hamburger Menu*/
	@FindBy(xpath ="//ul[contains(@class,'lng-subnav lng-scrlsbnv')]//li//a[contains(@href,'news18')]")
	private List<WebElement> hamburgerLangLnks; 

	/*Header Section Present After Clicking on any elements in Mobile Landing Page*/
	@FindBy(xpath ="//div[contains(@id,'header')] | //div[contains(@class,'new-header')]")
	private WebElement headerSection;

	/* Hamburger Menu links present at Header Hamburger Icon */
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//a//span[contains(@class,'')]")
	//	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li[contains(@rel,'') or contains(@class,'')]//a")
	private List<WebElement> hamburgerMenuLinks; 

	/* Hamburger Menu links present at Header Hamburger Icon */
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//a[contains(@href,'')]")
	private List<WebElement> hamburgerMenuLinks2; 

	/* Hamburger Menu links present at Header Hamburger Icon */
	@FindBy(xpath ="//div[contains(@class,'tpctlits')]//li//a")
	private List<WebElement> hamburgerCityLinks; 

	/* Hamburger Menu links present at Header Hamburger Icon */
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li[contains(@class,'chsstct')]//a")
	private WebElement hamburgerCityMenu; 

	/*Hamburger Menu Home Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'home')]//parent::a")
	private WebElement hamburgerHomeLnk;

	/*Hamburger Menu Home Section Links*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span//parent::a[not (contains(@href,'#')) and not (contains(@rel,'entertainment')) and not (contains(@rel,'tech')) and not (contains(@rel,'auto')) and not (contains(@rel,'states')) and not (contains(@rel,'world')) and not (contains(@rel,'photo')) and not (contains(@rel,'lifestyle'))]")
	private List<WebElement> hamburgerHomeSectionLnks;

	/*Hamburger Menu Live TV Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'livetv')]//parent::a")
	private WebElement hamburgerLiveTvLnk;

	/*Hamburger Menu Manoranjan Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'manoranjan')]//parent::a")
	private WebElement hamburgerManoranjanLnk;

	/*Hamburger Menu Mobile Tech Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'mobiletech')]//parent::a")
	private WebElement hamburgerMobileTechLnk;

	/*Hamburger Menu Pradesh Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'pradesh')]//parent::a")
	private WebElement hamburgerPradeshLnk;

	/*Hamburger Menu Auto Section Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'auto')]//parent::a")
	private WebElement hamburgerAutoLnk;

	/*Hamburger Menu Duniya Section Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'duniya')]//parent::a[contains(@rel,'newsworld')]")
	private WebElement hamburgerDuniyaLnk;

	/*Hamburger Menu Photo Section Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'photo')]//parent::a")
	private WebElement hamburgerPhotoLnk;

	/*Hamburger Menu Video Section Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'video')]//parent::a")
	private WebElement hamburgerVideoLnk;

	/*Hamburger Menu life style Section Link*/
	@FindBy(xpath ="//ul[contains(@id,'top-menu')]//li//span[contains(@class,'life')]//parent::a[contains(@rel,'lifestyle')]")
	private WebElement hamburgerLifeStyleLnk;

	/*Hamburger Menu LifeStyle Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'lifestyle')]//li//a[contains(@href,'lifestyle')]")
	private List<WebElement> hamburgerLifeStyleArtLnks;

	/*Hamburger Menu Video Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'video')]//li//a[contains(@href,'video')]")
	private List<WebElement> hamburgerVideoArtLnks;

	/*Hamburger Menu Photo Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'photo')]//li//a[contains(@href,'photo')]")
	private List<WebElement> hamburgerPhotoArtLnks;

	/*Hamburger Menu Duniya Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'newsworld')]//li//a[contains(@href,'world')]")
	private List<WebElement> hamburgerDuniyaArtLnks;

	/*Hamburger Menu Pradesh Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'states')]//li//a[contains(@href,'')]")
	private List<WebElement> hamburgerPradeshArtLnks;

	/*Hamburger Menu Auto Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'newsauto')]//li//a[contains(@href,'auto')]")
	private List<WebElement> hamburgerAutoArtLnks;

	/*Hamburger Menu Manoranjan Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'newsentertainment')]//li//a[contains(@href,'entertainment')]")
	private List<WebElement> hamburgerManoranjanArtLnks;

	/*Hamburger Menu Manoranjan Article Links*/
	@FindBy(xpath ="//ul[contains(@id,'newstech')]//li//a[contains(@href,'tech')]")
	private List<WebElement> hamburgerMobileTechArtLnks;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	//	**********************Rahul**WebElements**********************

	/*airQualityHeadline present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'aqiwidget kul')]//h2")
	private WebElement airQualityHeadline;

	/*airQualityWidgetLnkLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'aqiwidget kul')]//ul//li//a")
	private List<WebElement> airQualityWidgetLnkLst;

	/*airQualityBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'logo_wrap')]")
	private WebElement airQualityBreadcrum;

	/*jobHeadline present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'job')]")
	private WebElement jobHeadline;

	/*jobBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')]")
	private WebElement jobBreadcrum;

	/*jobTabsLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'jobs')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> jobTabsLst;

	/*jobArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'jobs')]//parent::h2//parent::div//following-sibling::div//ul//li//a")
	private List<WebElement> jobArticleLst;

	/*jobReadmoreBtn present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'jobs') and contains(@class,'aur')]")
	private WebElement jobReadmoreBtn;

	/*mobileTech present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd  clearfix')]//h2//a[contains(@href,'tech')]")
	private WebElement mobileTech;

	/*foodTitle present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd  clearfix')]//h2//a[contains(@href,'/recipe')]")
	private WebElement foodTitle;

	/*foodSectionArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/recipe')]//parent::h2//parent::div//following-sibling::div[1]//ul//li//a")
	private List<WebElement> foodSectionArticleLst;

	/*foodSectionImg present in the Hindi Home Page*/
	@FindBy(xpath ="(//a[contains(@href,'/recipe')]//parent::h2//parent::div//following-sibling::div//child::div[contains(@class,'bigstory')]//img)[1]")
	private WebElement foodSectionImg;

	/*foodSectionReadmore present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/recipe') and contains(@class,'aur')]")
	private WebElement foodSectionReadmore;

	/*foodSectionBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement foodSectionBreadcrum;

	/*healthFitnessTitle present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd  clearfix')]//h2//a[contains(@href,'/health')]")
	private WebElement healthFitnessTitle;

	/*healthFitnessImage present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')] //a[contains(@href,'/health')]//img")
	private WebElement healthFitnessImage;

	/*healthArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//ul[contains(@class,'global-storylist')]//li//a[contains(@href,'/health')]")
	private List<WebElement> healthArticleLst;

	/*airQualityHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/health') and contains(@class,'aur')]")
	private WebElement healthReadmore;

	/*healthSectionBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'top') or contains(@class,'article')]/preceding-sibling::div")
	private WebElement healthSectionBreadcrum;

	/*readMorePanchang present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'panchang')]//a")
	private WebElement readMorePanchang;

	/*airQualityHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'panchang')]//p)[1]")
	private WebElement todaysPanchangHeadline;

	/*todaysPanchangHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm_row_link')]")
	private WebElement panchangBreadcrum;

	/*autoSectionHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'auto')]//parent::h2//parent::div//a")
	private WebElement autoSectionHeadline;

	/*autoArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonknowledge')]//a")
	private List<WebElement> autoArticleLst;

	/*autoReadmore present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'auto') and contains(@class,'aur')]")
	private WebElement autoReadmore;

	/*autoSectionBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]| //ul[contains(@class, 'bread')])[1]")
	private WebElement autoSectionBreadcrum;

	/*blogHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'blog')]//parent::h2//parent::div")
	private WebElement blogHeadline;

	/*cartoonTitle present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'cartoon')]//parent::div[contains(@class,'cartoon')]//a")
	private WebElement cartoonTitle;

	/*cartoonBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="//h1[contains(@class,'br')]")
	private WebElement cartoonBreadcrum;

	/*cartoonStory present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'cartoonwrap')]//img")
	private List<WebElement> cartoonStory;

	/*cricketOption present in the Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'clue-box')])[1]//span")
	private WebElement cricketOption;

	/*cricketOptionNext present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'qus-pn-cont')]//a")
	private WebElement cricketOptionNext;

	/*cricketHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'quiz-container ')]//div")
	private WebElement cricketHeadline;

	/*cricketFrame present in the Hindi Home Page*/
	@FindBy(xpath ="//iframe[contains(@class,'contestIframe')]")
	private WebElement cricketFrame;

	/*cricketKaTestNxtBtn present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'qus-info clearfix')]//span")
	private List<WebElement> cricketKaTestNxtBtn;

	/*autoBlock present in the Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'/auto')]//parent::div[contains(@class,'lazyload-wrapper')] ")
	private WebElement autoBlock;

	/*airQualityHeadline present in the Hindi consumption Page*/
	@FindBy(xpath ="(//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]| //ul[contains(@class, 'bread')])[1]")
	private WebElement artcileBreadcrum;

	/* cricketKaTestNxtBtn present at the RHS*/
	@FindBy(xpath ="//div[@class='qus-layout']//div[contains(@class,'clue-box')][1]//span")
	private List<WebElement> cricket;

	/* Send Button in cricket Ka Test*/
	@FindBy(xpath ="//button[contains(@id,'saveUser')]")
	private WebElement sendButton;

	//==================================Sanjeeb's WebElement====================================//

	/*Header News 18 Logo*/
	@FindBy(xpath="//div[contains(@class,'header')]//a")
	private WebElement new18Logo;

	/*Line One Section Article Links Present in Mobile Hindi Homepage*/
	@FindBy(xpath ="//div[contains(@class,'top_links_cont')]//a")
	private List<WebElement> lineOneSectionELementLnk;  

	/*BreadCrumb Present on Article Header*/
	@FindBy(xpath="//div[contains(@class,'brda') or contains(@class,'bread') or contains(@class,'brd')] | //ul[contains(@class,'brdcrm') or contains(@class,'bread')]")
	private WebElement headerBreadcrumbLnk;

	/*minis Header Text*/
	@FindBy(xpath="//div[contains(@class,'minis_headWrap')] | //div[contains(@class,'bread')]")
	private WebElement miniHeaderTxtLnk;

	/*icici Header Text*/
	@FindBy(xpath="//div[contains(@class,'restart_right')]/div/img | //div[contains(@class,'breadcum')]")
	private WebElement iciciHeaderTxtLnk;

	/*Nerolac Header Text*/
	@FindBy(xpath="//div[contains(@class,'logo_sec')]")
	private WebElement nerolacHeaderTxtLnk;

	/*Krypto ki khojo Header Text*/
	@FindBy(xpath="(//div[contains(@class,'crypto_wrap')]//div/img)[1]")
	private WebElement kryptoTxtLnk;

	/*netra Suraksha Header Text*/
	@FindBy(xpath="(//div[contains(@class,'launch_info')]//img)[1]")
	private WebElement netraSurkshaTxtLnk;

	/*Search Icon Present On Header Section of hindi Homepage*/
	@FindBy(xpath="//div[contains(@class,'search_icon')]")
	private WebElement searchIconLnk;

	/*Input Box Present On Header Section of hindi Homepage after clicking on Search Button Present on the header*/
	@FindBy(xpath="//div[contains(@class,'gsc-input-box')]//input")
	private WebElement searchIconTxtField;

	/*Inside Search Button */
	@FindBy(xpath="//div[contains(@class,'gsc-control-wrapper-cse')]//button")
	private WebElement insideSearchBtn;

	/*Inside Close Button */
	@FindBy(xpath="//div[contains(@class,'close-btn')]")
	private WebElement insideCloseBtn;

	/*RajyaSeherChune Link Present on Line One Section Of Hindi Landing Page*/
	@FindBy(xpath="//div[contains(@class,'chs-stct')] | //div[contains(@class,'hdrrgt')]/button")
	private WebElement rajyaSeherChuneLnk;

	/*cancel Button Present After clicking Seher Chune Present on the Line One Section of Hindi homepage */
	@FindBy(xpath="//div[contains(@class,'tpchsstctpopup')]/a")
	private WebElement cancelBtn;

	/*Apna Seher Chune Input Box Present after Clicking on Seher Chune Present on the Line One Section of Hindi homepage*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]/input")
	private WebElement apnaSeherChuneBox;

	/*list Of elements present under apna Seher chune*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctnames')]//a")
	private List<WebElement> apnaSeherChuneEleList;

	/*list Of elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li/a")
	private List<WebElement> rajyaSectionEleList;

	/*list Of elements present under rajya Section Dropdown*/
	@FindBy(xpath="//li[contains(@class,'active')]//parent::li/child::div/a")
	private List<WebElement> rajyaSectionDropdwnEleList;

	/*list Of all elements present under rajya Section*/
	@FindBy(xpath="//div[contains(@class,'tpstatesnames')]//li")
	private List<WebElement> rajyaSectionEleDropDwn;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'headtop')]")
	private WebElement electralHydrationText;

	/*list of elements present under sticky Sections*/
	@FindBy(xpath="//ul[contains(@class,'btnvav')]/li/a")
	private List<WebElement> stickySectionEleList;

	/*Footer Sticky Sections*/
	@FindBy(xpath="//ul[contains(@class,'btnvav')]")
	private WebElement stickySection;


	//	**********************Anupam**WebElements**********************

	///------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/videos/')]")
	private WebElement videoSectionLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li[not (contains(@class,'slide--clone'))]/a")
	private List<WebElement> videoSectionArticleLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li[not (contains(@class,'slide--clone'))]//img")
	private List<WebElement> videoSectionImgLnk;

	/* Video section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreVideoSectionLnk;

	/* Video active slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div//ul/li[contains(@class,'active') and not (contains(@class,'slide--clone'))]/a")
	private WebElement videoActiveSliderLnk;

	/* Video Article slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div//ul/li[not (contains(@class,'slide--clone'))]/a")
	private List<WebElement> videoSliderArticleLnk;

	/* Video slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/videos/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div//button")
	private List<WebElement> videoSliderLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement videoBreadcrumb;

	//------horoscope
	/*Horoscope Section Link in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/astro/')]")
	private WebElement horoscopeSectionLnk;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em")
	private  List<WebElement> horoscopeSigns;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em/ancestor::a")
	private  List<WebElement> horoscopeSignsLnk;

	/*Horoscope Active Text in Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'astro_slides')]//div[contains(@class,'glide__slide--active')]//em/ancestor::a)[1]//p")
	private WebElement horoscopeActiveText;

	/*Horoscope Sign Text in Homepage*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//em/ancestor::a")
	private List<WebElement> horoscopeSignsTxt;

	/*horoscope info present in Horoscope page*/
	@FindBy(xpath ="//p[contains(@class,'detail_intro')]")
	private WebElement horoscopeInfo;

	/*horoscope Forward button present in Horoscope page*/
	@FindBy(xpath ="//div[contains(@class,'astro_slides')]//div[contains(@class,'glide__bullets')]/button[@data-glide-dir=\"=1\"]")
	private WebElement horoscopeForwardButton;



	//---------Lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a  |  //div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/lifestyle/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement lifestyleBreadcrumb;

	//---------Dharm
	/* Dharm section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]")
	private WebElement dharmSectionLnk;

	/* Dharm section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//a")
	private List<WebElement> dharmSectionArticleLnk;

	/* Dharm section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//img")
	private List<WebElement> dharmSectionImgLnk;

	/* Dharm section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/dharm/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreDharmSectionLnk;

	/*Dharm present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement dharmBreadcrumb;

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]")
	private WebElement nationSectionLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a")
	private List<WebElement> nationSectionArticleLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> nationSectionImgLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/nation/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreNationSectionLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement nationBreadcrumb;

	//---------world
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]")
	private WebElement worldSectionLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a")
	private List<WebElement> worldSectionArticleLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> worldSectionImgLnk;

	/* world section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/world/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreWorldSectionLnk;

	/*Breadcrumb present in world article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement worldBreadcrumb;

	//---------knowledge
	/* Knowledge section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]")
	private WebElement knowledgeSectionLnk;

	/* Knowledge section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//a")
	private List<WebElement> knowledgeSectionArticleLnk;

	/* Knowledge section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> knowledgeSectionImgLnk;

	/* Knowledge section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/knowledge/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreKnowledgeSectionLnk;

	/*Breadcrumb present in Knowledge article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement knowledgeBreadcrumb;

	//-----blog
	/* Blog section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]")
	private WebElement blogSectionLnk;

	/* Journalist profile link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newblogsection-home-slider')]//figure/parent::a")
	private List<WebElement> journalistProfileLnk;

	/* Journalist Article link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newblogsection-home-slider')]//h2/parent::a")
	private List<WebElement> journalistArticleLnk;

	/*Journalist Image link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newblogsection-home-slider')]//figure/parent::a//div[contains(@style,'display: inline-block')]/img")
	private List<WebElement> journalistImgLnk;

	/*Breadcrumb present in journalist page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')] | //div[contains(@class,'breadcrumb')]")
	private WebElement blogBreadcrumb;

	/* Blog section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::a")
	private WebElement readMoreBlogSectionLnk;


	/* Mobile Tech title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/news/tech/')]")
	private WebElement mobileTechTitleLnk;


	// --------------------------- Vipin Webelements --------------------------------------------//

	/*List of Priority Panel Articles in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/a)|//span[contains(@class,'pb')]/ancestor::div[contains(@class,'bigstory')]/a//img")
	private List<WebElement> tazaSamacharArticleLnk;

	/*List of Priority Panel Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/a//img[@data-src]")
	private List<WebElement> tazaSamacharImgLnk;

	/*Top Hindi News Article Link in Homepage */
	@FindBy(xpath = "//span[contains(@class,'pb')]/ancestor::div[contains(@class,'bigstory')]/a")
	private List<WebElement> topHindiNewsArticleLnk; 

	/*Top Hindi News Article Link in Homepage */
	@FindBy(xpath = "//span[contains(@class,'pb')]/ancestor::div[contains(@class,'bigstory')]/a//img")
	private List<WebElement> topHindiNewsImgLnk; 

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/* List of Related News Links in PriorityPanel in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/div[contains(@id,'right')]")
	private List<WebElement> relatedNewsLnk;

	/* List of Active Articles After Navigating to Related News Division */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]//div[contains(@class,'active')]//a")
	private List<WebElement> activeRelatedNewsLnk;

	/*List of News18 Hindi Plus Article Link in Homepage*/
	@FindBy(xpath = "(//div[contains(@class,'container')]//ul[contains(@class,'ayodhya')])[1]/li/a")
	private List<WebElement> news18HindiPlusArticleLnk;

	/*List of News18 Hindi Plus Article Link in Homepage*/
	@FindBy(xpath = "(//div[contains(@class,'container')]//ul[contains(@class,'ayodhya')])[1]/li/a//img")
	private List<WebElement> news18HindiPlusImgLnk;

	/* News18 Hindi Plus Banner Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'ayodhyabanner')]/a")
	private WebElement news18HindiPlusBannerLnk;

	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a/img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
	private WebElement activeWebstoriesImgLnk;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'web_stories')]//ul[contains(@class,'slick-dots')]/li[not (contains(@class,'active'))]/button")
	private List<WebElement> webstoriesSliderBtn;

	/* List of Cricket Section Article Links in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'container')]//ul[contains(@class,'ayodhya')])[2]/li/a")
	private List<WebElement> cricketArticleLnk; 

	/* List of Cricket Section Image Links in Homepage */
	@FindBy(xpath = "(//div[contains(@class,'container')]//ul[contains(@class,'ayodhya')])[2]/li/a//img")
	private List<WebElement> cricketImgLnk; 

	/* Cricket Dhamal Image Link in Cricket Widget in Homepage */
	@FindBy(xpath = "//a[contains(@href,'cricket')]/img[contains(@src,'DHAMAAL')]")
	private WebElement cricketDhamalImgLnk;

	/* Cricket Title Link In Homepage body*/
	@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'cricket')]")
	private WebElement cricketTitleLnk;

	/* Cricket Section Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'container')]/a[contains(@href,'/sports/cricket/')]")
	private WebElement moreCricketNewsLnk; 

	/* List of Latest Mobile News Article Links in Mobile Finder Section in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')]/ul/li/figcaption//a")
	private List<WebElement> latestMobileNewsArticleLnk;

	/* List of Mobile Finder Section Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')]/ul/li/figure/img")
	private List<WebElement> latestMobileNewsImgLnk;

	/* More News Link in Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')]/a")
	private WebElement mobileFinderMoreNewsLnk;

	/* Find Mobile by brand Banner Mobile brands Links for Mobile Finder Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spcmblfndr')]//div[contains(@class,'spcclickitems')]/a")
	private List<WebElement> mobileBrandsLnk;

	/*Mobile Finder Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]//ul[contains(@class,'spcnv')]/li[not (contains(@class,'active'))]/a")
	private List<WebElement> mobileFinderTabsLnk; 

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')]//li[not (contains(@class,'clone'))]/a")
	private List<WebElement> trendindAndRecommendedStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')]//li[not (contains(@class,'clone')) and contains(@class,'active')]/a//h2")
	private WebElement activeTrendindAndRecommendedStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox') and contains(@style,'visible')]//div[contains(@class,'phnlgblts')]/button")
	private List<WebElement> trendindAndRecommendedSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox') and contains(@style,'visible')]//li[not (contains(@class,'clone'))]//div/a")
	private List<WebElement> trendindAndRecommendedReadMoreLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')and contains(@style,'visible')]//li[not (contains(@class,'clone'))]/a")
	private List<WebElement> upcomingMobileStoriesLnk;

	/* Active Upcoming Mobile Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')and contains(@style,'visible')]//li[not (contains(@class,'clone')) and contains(@class,'active')]/a//h2")
	private WebElement activeUpcomingMobileStoriesLnk;

	/* Slider Button for Upcoming Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox')and contains(@style,'visible')]//div[contains(@class,'phnlgblts')]/button")
	private List<WebElement> upcomingMobileSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'spccontentbox') and contains(@style,'visible')]//li[not (contains(@class,'clone'))]//div/a")
	private List<WebElement> upcomingMobileReadMoreLnk;

	/*List of Tabs in Body Sports Tab Links for Sports Section In Homepage */
	@FindBy(xpath = "//h2/a[(@href='/news/sports/')]/ancestor::div[contains(@class,'global')]/following-sibling::ul[1]//li//a")
	private List<WebElement> bodySportsTabLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/news/sports/')]/ancestor::div[contains(@class,'global')]/following-sibling::div[contains(@id,'clkbuttonpradesh')][1]//a")
	private List<WebElement> bodySportsArticleLnk ;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/news/sports/')]/ancestor::div[contains(@class,'global')]/following-sibling::div[contains(@id,'clkbuttonpradesh')][1]//a//img")
	private List<WebElement> bodySportsImgLnk ;

	/*Body Sports Read More Link in Sports in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[@href='/news/sports/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/sports/')]")
	private WebElement bodySportsReadMoreLnk;

	/* Article Banner Link In homepage*/
	@FindBy(xpath = "//div[contains(@class,'exclusive-news')]/a")
	private List<WebElement> articleBannerLnk;

	/*News18 Minis Section A world of news at your fingertips Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'head')]/a")
	private WebElement worldOfNewsLnk;

	/*List of News18 Minis Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'imgBox')]//img")
	private List<WebElement> news18MinisImgLnk;

	/* List of News18 Minis Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'content')]//h2/a[not (@target)]")
	private List<WebElement> news18MinisArticleLnk;

	/*List of News18 Minis Read More link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'home_nw18_minis')]/div[contains(@class,'Minis_slider')]/div[contains(@class,'slick-list')]//div[contains(@class,'read')]/a")
	private List<WebElement> news18MinisReadMoreLnk;

	//=================================================Vipin/Sanjeeb =============================================//


	/*money link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/business/')]")
	private WebElement moneyLnk;

	/*moneyCongtrol link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'moneycontrol')]/a")
	private WebElement moneyControlLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//img[@alt='Moneycontrol'])[2]")
	private WebElement moneyControlLogoLnk;

	/*list Of elements present under Money Section*/
	@FindBy(xpath="(//ul[contains(@class,'news-home-tab')])[3]//a")
	private List<WebElement> moneyHeaderList;

	/*list Of elements present under Money Article Section*/
	@FindBy(xpath="(//div[contains(@id,'clkbuttonpradesh')])[3]//a")
	private List<WebElement> moneyArticleList;

	/*list Of elements present under Money Article Section*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[@href='/news/literature/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> sahityaArticleList;

	/*sahitya link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/literature/')]")
	private WebElement sahityaLnk;

	/*Aur bhi Padhe  link present on money Section of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[@href='/news/business/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/business/')]")
	private WebElement aurBhiPadheMoneyLnk;

	/*Aur bhi Padhe  link present on Sahitya Section of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[@href='/news/business/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/literature/')]")
	private WebElement aurBhiPadheSahityaLnk;

	/*list Of elements present under Money Article Section*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[@href='/news/ajab-gajab/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
	private List<WebElement> ajabGajabArticleList;

	/*sahitya link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/ajab-gajab/')]")
	private WebElement ajabGajabLnk;

	/*Aur bhi Padhe  link present on Sahitya Section of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'globalhd')]//a[@href='/news/business/']//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[contains(@href,'/news/ajab-gajab/')]")
	private WebElement aurBhiPadheAjabGajabLnk;

	/*superHitGalleryHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'superhitgallerywrap')]//h2//a")
	private WebElement superHitGalleryHeadline;

	/*superHitGalleryBreadcrum present in the Hindi Home Page*/
	@FindBy(xpath ="(//div[contains(@class,'brade_crum')] | //div[contains(@class,'br')]| //ul[contains(@class, 'bread')])[1]")
	private WebElement superHitGalleryBreadcrum;

	/*superHitGalleryReadmore present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'photo')]")
	private WebElement superHitGalleryReadmore;

	/*superHitGalleryArticleLink present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//ul[contains(@class,'photo')]//li//a")
	private List<WebElement> superHitGalleryArticleLink;

	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li//a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/news/career/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement careerBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]")
	private WebElement crimeSectionLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div/div/a  |  //div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//li/a")
	private List<WebElement> crimeSectionArticleLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div//img")
	private List<WebElement> crimeSectionImgLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[(@href='/news/crime/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a")
	private WebElement readMoreCrimeSectionLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//div[contains(@class,'brdcrm')] | //div[contains(@class,'breadcum')]")
	private WebElement crimeBreadcrumb;

	/*Pradesh News present after cricket next section*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//h2//a[contains(@href,'pradesh')]")
	private WebElement pradeshNews;

	/*Pradesh News state links*/
	@FindBy(xpath ="(//div[contains(@class,'globalhd')]//following-sibling::ul)[3]//li//a")
	private List<WebElement> pradeshStatesLnks;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@class,'forstatesection')]")
	private WebElement rajyaChuneLnk;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'tpchsstctnames')]//div[contains(@class,'state')]//ul//li//a")
	private List<WebElement> rajyaChuneStateList;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div//button")
	private List<WebElement> buttonLnks;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="(//div[contains(@id,'pradesh')])[1]//a")
	private List<WebElement> stateArticleLnks;

	/*Pradesh News aur bhi dekhu-more*/
	@FindBy(xpath ="//div//a[contains(@href,'pradesh') and contains(@class,'aur')]")
	private WebElement aurbhiDekhu;

	/*bollywoodTabLnk present in the Hindi Home Page*/
	@FindBy(xpath ="//a[contains(@href,'news/entertainment')]//parent::h2//parent::div//following-sibling::ul[1]//li//a")
	private List<WebElement> bollywoodTabLnk;

	/*bollywoodarticleLnk present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')]//following-sibling::ul//li//a[contains(@href,'entertainment')]")
	private List<WebElement> bollywoodarticleLnk;

	/*bollywoodReadmore present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'entertainment')]")
	private WebElement bollywoodReadmore;

	/*bollywoodHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd  clearfix')]//a[contains(@href,'entertainment')]")
	private WebElement bollywoodHeadline;

	/*mobileTechTabLnk present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'globalhd  clearfix')]//h2//a[contains(@href,'tech')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> mobileTechTabLnk;

	/*mobileTecharticleLnk present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'bigstory')]//following-sibling::ul//li//a[contains(@href,'tech')]")
	private List<WebElement> mobileTecharticleLnk;

	/*mobileTechReadmore present in the Hindi consumption Page*/
	@FindBy(xpath ="//div[contains(@id,'clkbuttonpradesh')]//following-sibling::a[contains(@class,'aur')and contains(@href,'tech')]")
	private WebElement mobileTechReadmore;

	/*Ad Link in priority panel*/
	@FindBy(xpath ="//div[contains(@id,'adunit')]")
	private List<WebElement> AdLink;

	/*popular category Section Present at Footer*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[3]")
	private WebElement popularCategorySection;

	/*list Of element Present Inside Hot On Social Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[3]/div/a")
	private List<WebElement> popularCategoryList;

	/*Language Sites Section Present at Footer*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[4]")
	private WebElement languageSitesSection;

	/*nw 18 Group Sites Sites Section Present at Footer*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[5]")
	private WebElement nws18GroupSitesSection;

	/*Footer Social Share Section Present at Footer of Mobile English Landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'social_icon')])")
	private WebElement nws18SocialAndDownloadAppSection;

	/*Footer Last Section Present at Footer of Mobile English Landing Page*/
	@FindBy(xpath ="(//section[contains(@class,'bottom_footer')])")
	private WebElement footerLastSection;

	/*list Of element Present inside  Footer layer Two of Mobile English Homepage*/
	@FindBy(xpath ="(//section[contains(@class,'bottom_footer')])//a")
	private List<WebElement> footerlayerTwoList;

	/*list Of element Present Inside footer Social Share Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'social_icon')])//a")
	private List<WebElement> socialShareAndDownloadAppList;

	/*list Of element Present Inside language Sites Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[4]/div/a")
	private List<WebElement> languageSitesList;

	/*list Of element Present Inside nws18 Group Sites Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[5]/div/a")
	private List<WebElement> nws18GroupSitesList;

	/*Header Text Present On pages after clicking on Language Sites Section Elements Present at Footer*/
	@FindBy(xpath ="(//div[contains(@id,'header')])[1] | //div[contains(@class,'new-header')] ")
	private WebElement headerTxtOfLanguageSites;

	/*list of Elements Presnt under Top Videos Section*/
	@FindBy(xpath ="(//div[contains(@class,'minute-tv-component-wrap')])//a")
	private List<WebElement> footerTopVideosEleList;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="//div[contains(@class,'news_page')] | //div[contains(@class,'brade_crum')] | //div[contains(@class,'CN-PageWrap')] | //div[contains(@class,'story_container')] | //div[contains(@class,'videosSliderWrapper')] | //div[contains(@class,'photoGalleryWrapper')] | //div[contains(@class,'main_header')]")
	private WebElement headerTxtLogoLnk;

	/*trending topic Section Present at Footer*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[1]")
	private WebElement trendingTopicSection;

	/*list Of element Present Inside Trending Topic Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[1]/div/a")
	private List<WebElement> trendingTopicsList;

	/*hot On Social Section Present at Footer*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[2]")
	private WebElement hotOnSocialSection;

	/*Header Text Present On pages after clicking on hot On Social Section Elements Present at Footer*/
	@FindBy(xpath ="(//h1)[1]")
	private WebElement headerTxtOfHotAndSocial;

	/*list Of element Present Inside Hot On Social Section Present On Footer of Mobile English Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'side_bar')])[2]/div/a")
	private List<WebElement> hotOnSocialList;

	@FindBy(xpath ="(//div[contains(@class,'extra_nws_hdng_sec')]//h4)[1]")
	private WebElement agliKhabar;

	@FindBy(xpath ="(//div[contains(@class,'breadcum')])[2]")
	private WebElement nextArticleBreadcrum;

	@FindBy(xpath ="//span[contains(text(),'__NEXT_DATA__')]")
	private WebElement newStackText;

	@FindBy(xpath ="//div[contains(@class,'link_table')]//a")
	private List<WebElement> trendingTopicLink;

	/*Live blog Headline*/
	@FindBy(xpath ="//div[contains(@class,'hd_heading')]//following-sibling::ul//li//a[contains(@href,'live')]")
	private List<WebElement> liveBlogHeadline;

	/*Live blog Headline*/
	@FindBy(xpath ="//div[contains(@class,'container')]//a[contains(@href,'live-updates')]")
	private List<WebElement> liveBlogImage;


	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/**
	 * @author Sanjeeb
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Page Link ", e);
		}
	}


	/**
	 * @author Anupam
	 * This method used to navigate to Line One Section in Hindi Home Page
	 */
	public void clickOnLineOneSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnk);
			Logs.info(getClass(),"Clicked on any Line One Section link");
		}catch (Exception e) {
			Logs.error(getClass(), "Exception in Section Page Link ", e);
		}
	}


	/**
	 * @author Abhishek
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(sectionLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Videos Section Homepage ", e);
		}
	}

	/**
	 * @author VipinKumarGawande 
	 * This method is used to click on the article in footer containing /topics/ in the URL
	 */
	public void clickOnFooterTopics()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		try {
			webDriverActions.mouseHover(trendingTopicsLnk);
			webDriverActions.highlightElement(trendingTopicsLnk);
			webDriverActions.click(trendingTopicsLnk);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Footer Topic Link Homepage ", e);
		}
		webDriverActions.switchToNewWindow();
	}

	/**
	 * @author Anupam
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnSportsSection()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(cricketNextLnk);
		} catch (Exception e) {
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


	/**
	 *@author SanjeebKumarPati
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			if(webDriverActions.isElementDisplayed(homepageLiveBlogIcon))
			{
				webDriverActions.clickJS(homepageLiveBlogIcon);
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

	//	****************************Danish****BusinessLogic***************


	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu
	 */
	public void HamburgerMenuAllSectionsNavigation(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parent = webDriverActions.getCurrentPageUrl();
		webDriverActions.stopPageLoading();
		webDriverActions.softHighlightElement(hamburgerMenuLnk);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.stopPageLoading();
			webDriverActions.softHighlightElement(hamburgerMenuLnk);
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		webDriverActions.softWaitForElementVisibility(hamburgerHomeSectionLnks.get(0), 3);
		webDriverActions.stopPageLoading();
		webDriverActions.softHighlightElement(hamburgerHomeSectionLnks.get(0));
		softAssert.assertTrue(hamburgerHomeSectionLnks.size()>0,"Possibly element not visible " +webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */     
		for (int i = 1; i < hamburgerHomeSectionLnks.size()-6;i++)
		{
			webDriverActions.softWaitForElementVisibility(hamburgerHomeSectionLnks.get(i), 3);
			webDriverActions.stopPageLoading();
			webDriverActions.softHighlightElement(hamburgerHomeSectionLnks.get(i));
			webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(hamburgerHomeSectionLnks.get(i), 3);
				webDriverActions.stopPageLoading();
				webDriverActions.softHighlightElement(hamburgerHomeSectionLnks.get(i));
				webDriverActions.softClickJS(hamburgerHomeSectionLnks.get(i));
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			System.out.println(currentPageUrl);
			String text = "https://hindi.news18.com/";
			String text2 = "https://hindi.news18.com/#/";
			if(serverType.contains("preProd"))
			{
				String betatext = "https://betaeng:v%T5ctTr%7BV~h%3CgQ8@betahindi.news18.com/";
				String betatext2 = "https://betaeng:v%T5ctTr%7BV~h%3CgQ8@betahindi.news18.com/#";
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
				if (! (currentPageUrl.equalsIgnoreCase(betatext) || currentPageUrl.equalsIgnoreCase(betatext2))) {	
					webDriverActions.stopPageLoading();
					webDriverActions.softHighlightElement(articleBreadcrumb);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb,1)," Possibly element not visible " +currentPageUrl);
				}
			}
			else {
				if (!(currentPageUrl.equals(text) || currentPageUrl.equals(text2))) {
					webDriverActions.stopPageLoading();
					webDriverActions.softHighlightElement(articleBreadcrumb);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb,1)," Possibly element not visible " +currentPageUrl);
				}
			}
			webDriverActions.navigateToUrl(parent);
			webDriverActions.stopPageLoading();
			webDriverActions.softHighlightElement(hamburgerMenuLnk);
			webDriverActions.softClickJS(hamburgerMenuLnk);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu All Section");
	}

	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu
	 */
	public void hamburgerMenuCitiesNavigations(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		webDriverActions.softClickJS(hamburgerCityMenu);
		softAssert.assertTrue(hamburgerCityLinks.size()>0,"Possibly element not visible " +webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */     
		for (int i = 0; i < 1; i++)
		{
			webDriverActions.softWaitForElementVisibility(hamburgerCityLinks.get(i), 3);
			webDriverActions.softMouseHover(hamburgerCityLinks.get(i));
			webDriverActions.softHighlightElement(hamburgerCityLinks.get(i));
			webDriverActions.softClickJS(hamburgerCityLinks.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(hamburgerCityLinks.get(i), 3);
				webDriverActions.softMouseHover(hamburgerCityLinks.get(i));
				webDriverActions.softHighlightElement(hamburgerCityLinks.get(i));
				webDriverActions.softClickJS(hamburgerCityLinks.get(i));
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Possibly element not visible " +currentPageUrl);
			//			if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
			//				webDriverActions.navigateBack();
			//			}
			//			else {
			//				webDriverActions.navigateBack();
			//				webDriverActions.navigateBack();
			//			}
			//			webDriverActions.waitForPageToLoad();
			//			webDriverActions.softClickJS(hamburgerMenuLnk);
			//			webDriverActions.softClickJS(hamburgerCityMenu);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu ");
	}




	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu Language Section By clicking on Hamburger Icon it.
	 */
	public void verifyHamburgerLanguageSection(String server)
	{

		webDriverActions.waitForPageToLoad();
		String pageURL = webDriverActions.getPageTitle();
		webDriverActions.softClickJS(hamburgerMenuLnk);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softClickJS(hamburgerLangSection);
		webDriverActions.waitForSecond(3000);
		softAssert.assertTrue(hamburgerLangLnks.size()>0,"Possibly element not visible " +webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */     
		for (int i = 0; i < hamburgerLangLnks.size(); i++)
		{
			webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(5000);
				webDriverActions.softClickJS(hamburgerMenuLnk);
				webDriverActions.softClickJS(hamburgerLangSection);
				webDriverActions.softClickJS(hamburgerLangLnks.get(i));
			}
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerSection), "possibly Header Section Of Language Section Is not Displayed "+webDriverActions.getCurrentPageUrl());
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(pageURL);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Language Section");
	}

	//	***************************Rahul**Business**Logic************************

	/**
	 * @author RahulJasphin
	 * @param serverType
	 * This method is used to click on Air Quality Index widgets present at the
	 * body of the home page and navigate their pages
	 */
	public void airQualityIndex(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		if(airQualityWidgetLnkLst.size()>0) {
			/* Below loop will fetch list of articles and navigate to each one by one*/ 
			for(int i=0;i<airQualityWidgetLnkLst.size();i++)
			{
				webDriverActions.softMouseHover(airQualityWidgetLnkLst.get(i));
				webDriverActions.softClickJS(airQualityWidgetLnkLst.get(i));
				Logs.info(getClass(),"Clicked on Air Quality Index Widget");
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(airQualityWidgetLnkLst.get(i));
					webDriverActions.softScrollToElement(airQualityWidgetLnkLst.get(i));
					String actual = webDriverActions.getAttribute("href", airQualityWidgetLnkLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(airQualityWidgetLnkLst.get(i));
				}
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(airQualityBreadcrum),"Unable to display Element "+webDriverActions.getCurrentPageUrl());
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityWidgetLnkLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}
	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the title of food Section present at the body of the
	 * home page
	 */
	public void verifyJobsTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline, 10);
		webDriverActions.softMouseHover(jobHeadline);
		webDriverActions.clickJS(jobHeadline);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(jobHeadline);
			webDriverActions.softScrollToElement(jobHeadline);
			String actual = webDriverActions.getAttribute("href", jobHeadline);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(jobHeadline);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Food section headline present in Job section
	 */
	public void verifyFoodSectionHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(foodTitle, 10);
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.softHighlightElement(foodTitle);
		webDriverActions.softClickJS(foodTitle);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(jobHeadline);
			webDriverActions.softScrollToElement(jobHeadline);
			String actual = webDriverActions.getAttribute("href", jobHeadline);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(jobHeadline);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Image of the food section present in the Hindi Home Page
	 */
	public void verifyFoodImgNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.clickJS(foodSectionImg);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(foodSectionImg);
			webDriverActions.softScrollToElement(foodSectionImg);
			String actual = webDriverActions.getAttribute("href", foodSectionImg);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(foodSectionImg);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the article of the food Section
	 */
	public void verifyFoodArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		if(foodSectionArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<1;i++)
			{  
				webDriverActions.softMouseHover(foodSectionArticleLst.get(i));
				webDriverActions.clickJS(foodSectionArticleLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(foodSectionArticleLst.get(i));
					webDriverActions.softScrollToElement(foodSectionArticleLst.get(i));
					String actual = webDriverActions.getAttribute("href", foodSectionArticleLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(foodSectionArticleLst.get(i));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta"))  {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+foodSectionArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}


	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Readmore Button of the Food Section
	 */
	public void verifyFoodReadMore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.clickJS(foodSectionReadmore);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(foodSectionReadmore);
			webDriverActions.softScrollToElement(foodSectionReadmore);
			String actual = webDriverActions.getAttribute("href", foodSectionReadmore);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(foodSectionReadmore);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Headline of the Health Section
	 */
	public void verifyHealthSectionHeadline(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.clickJS(healthFitnessTitle);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(healthFitnessTitle);
			webDriverActions.softScrollToElement(healthFitnessTitle);
			String actual = webDriverActions.getAttribute("href", healthFitnessTitle);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(healthFitnessTitle);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the image of the Health Section
	 */
	public void verifyHealthImgNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.mouseHoverAndClick(healthFitnessImage);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(healthFitnessImage);
			webDriverActions.softScrollToElement(healthFitnessImage);
			String actual = webDriverActions.getAttribute("href", healthFitnessImage);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(healthFitnessImage);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the articles of the Health section
	 */
	public void verifyhealthArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,13);
		webDriverActions.mobileScroll(6);
		if(healthArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<1;i++)
			{  
				webDriverActions.mouseHover(healthArticleLst.get(i));
				webDriverActions.softClickJS(healthArticleLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(healthArticleLst.get(i));
					webDriverActions.softScrollToElement(healthArticleLst.get(i));
					String actual = webDriverActions.getAttribute("href", healthArticleLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(healthArticleLst.get(i));
				}
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+healthArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the Read button in the Health Section
	 */
	public void verifyHealthReadMore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.continuousScrollTillElement(healthFitnessTitle,10);
		webDriverActions.clickJS(healthReadmore);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softMouseHover(healthReadmore);
			webDriverActions.softScrollToElement(healthReadmore);
			String actual = webDriverActions.getAttribute("href", healthReadmore);
			Logs.info(getClass(), actual);
			webDriverActions.waitForSecond(2000);
			webDriverActions.softClickJS(healthReadmore);
		}
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		webDriverActions.waitForSecond(000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the articles of the Auto section
	 */
	public void verifyAutoArticleNavigation(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(blogHeadline);
		webDriverActions.continuousScrollTillElement(autoSectionHeadline, 7);
		webDriverActions.softMouseHover(autoSectionHeadline);
		if(autoArticleLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<1;i++)
			{  
				webDriverActions.clickJS(autoArticleLst.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(autoArticleLst.get(i));
					String actual = webDriverActions.getAttribute("href", autoArticleLst.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(autoArticleLst.get(i));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(artcileBreadcrum),"Unable to display Element"+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+autoArticleLst.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author Rahul
	 * @param serverType
	 * This method is used to click on the article of the Job section 
	 */
	public void verifyJobArticleList(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(mobileTech);
		webDriverActions.continuousScrollTillElement(jobHeadline,5);
		if(cartoonStory.size()>0)
		{
			for (int i = 0; i < 1;i++) {
				webDriverActions.softHighlightElement(jobTabsLst.get(i));
				webDriverActions.softClickJS(jobTabsLst.get(i));
				for (int j = 0; j < 1;j++) {
					webDriverActions.softMouseHover(jobArticleLst.get(j));
					webDriverActions.softClickJS(jobArticleLst.get(j));
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softMouseHover(jobArticleLst.get(j));
						webDriverActions.softScrollToElement(jobArticleLst.get(j));
						String actual = webDriverActions.getAttribute("href", jobArticleLst.get(j));
						Logs.info(getClass(), actual);
						webDriverActions.waitForSecond(2000);
						webDriverActions.softClickJS(jobArticleLst.get(j));
					}
					String currentPage = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage = betaUrl;
					}
					else { 
						Logs.info(getClass(), "Navigated to "+currentPage);
					}
					webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
					webDriverActions.softHighlightElement(articleBreadcrumb);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element "+currentPage);
				}

			}
			softAssert.assertAll("Issues found in this url ");
		}
	}



	//==============================Sanjeeb's Business Logic=================================//

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSectionAndSearchIcon()
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElement(2000);
			//Validating the Line one section Except Search Button
			for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
			{
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
				Logs.info(getClass(), actual);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lineOneSectionELementLnk.get(i)), "possibly line One Element Is not Visible"+actual);
				webDriverActions.softClick(lineOneSectionELementLnk.get(i));
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
				}
				webDriverActions.waitForSecond(1000);
				String expected = webDriverActions.getCurrentPageUrl();				
				webDriverActions.waitForPageToLoad();
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

				// it will iterate the list and validate 
				if(actual.contains("icici-lombard") ||actual.contains("electral") ||actual.contains("crypto") || actual.contains("netrasuraksha") )
				{
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j)), "Possibly Element Is Not Visible For This URL "+expected);	
						}
					}
				}
				else
				{
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+expected);	
				}

				webDriverActions.navigateBack();
				for (int j = 1; j <= 2 ; j++) {
					lineOneSectionELementLnk.get(i).sendKeys(Keys.ARROW_RIGHT);
				}
			}
			//Validating Search Icon Present oN the Header
			webDriverActions.waitForPageToLoad();
			webDriverActions.softClickJS(searchIconLnk);
			webDriverActions.inputText(searchIconTxtField, "News 18");
			webDriverActions.softClickJS(insideSearchBtn);
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(insideCloseBtn), "Failed To verify Search Icon");	
			webDriverActions.softClickJS(insideCloseBtn);
		}
		catch(Exception e)
		{
			softAssert.assertTrue(false, "Possibly Element Is Not Clickable or Visible");	
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Line One Section Rajya Seher Chune Present in Hindi Desktop Landing Page.
	 */
	public void verifyLineOneSectionRajyaSeherChune(String server)
	{

		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.softHighlightElement(rajyaSeherChuneLnk);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cancelBtn), "possibly Icon Is Not Displayed");
		webDriverActions.inputText(apnaSeherChuneBox, "delhi");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cancelBtn), "possibly Icon Is Not Displayed");
		webDriverActions.softClickJS(cancelBtn);
		webDriverActions.softClickJS(rajyaSeherChuneLnk);
		for(int i=0;i<apnaSeherChuneEleList.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", apnaSeherChuneEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(apnaSeherChuneEleList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			softAssert.assertTrue(actual.contains(expected), "Possibly Not Navigated To This URL "+actual );
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
			Logs.info(getClass(), actual);
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(rajyaSeherChuneLnk);
		}

		//These Lines of Scripts use to Verify the links present under Rajya Section Of Rajya Seher Chune Popup Of Hindi Home Page.
		for(int i=0;i<rajyaSectionEleList.size();i++)
		{
			String title=webDriverActions.getAttribute("class", rajyaSectionEleDropDwn.get(i));
			if (title.contains("noarrow"))
			{
				String expected = webDriverActions.getAttribute("href", rajyaSectionEleList.get(i));
				Logs.info(getClass(), expected);
				webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				}
				String actual = webDriverActions.getCurrentPageUrl();
				if(server.contains("preProd"))
				{
					String betaUrl = genericUtility.replaceInUrl(actual);
					actual=betaUrl;
					webDriverActions.navigateToUrl(actual);
				}
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
				Logs.info(getClass(), actual);
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(rajyaSeherChuneLnk);
			}
			else
			{
				webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				for(int j=0;j<rajyaSectionDropdwnEleList.size();j++)
				{
					String expected = webDriverActions.getAttribute("href", rajyaSectionDropdwnEleList.get(j));
					Logs.info(getClass(), expected);
					webDriverActions.softClickJS(rajyaSectionDropdwnEleList.get(j));
					String currentPageUrl=webDriverActions.getCurrentPageUrl();
					if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softClickJS(rajyaSectionDropdwnEleList.get(i));
					}
					String actual = webDriverActions.getCurrentPageUrl();
					if(server.contains("preProd"))
					{
						String betaUrl = genericUtility.replaceInUrl(actual);
						actual=betaUrl;
						webDriverActions.navigateToUrl(actual);
					}
					softAssert.assertEquals(actual,expected, "Possibly Not Navigated To This URL "+actual );
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk), "Possibly Element Is Not Visible For This URL "+actual);
					Logs.info(getClass(), actual);
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(rajyaSeherChuneLnk);
					webDriverActions.softClickJS(rajyaSectionEleList.get(i));
				}
			}	
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");
	}

	//========================Anupam*Business Logic=================
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionLnk);
		webDriverActions.mobileScroll(6);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<1;i++)
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

			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 
			webDriverActions.waitForElementVisibility(element, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigationNewTab(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.navigateToNewTab(artList.get(i));
			webDriverActions.switchToNewWindow();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				webDriverActions.waitForSecond(1000);
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
			}


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

			webDriverActions.softWaitForElementVisibility(element, 60);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param sectionLnk
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionLnk);
		webDriverActions.continuousScrollTillElement(section, 20);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,videoSectionLnk,videoSectionArticleLnk, videoBreadcrumb);
	}


	public void verifyVideoWidgetSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionLnk);
		webDriverActions.continuousScrollTillElement(videoSectionLnk, 20);
		webDriverActions.softScrollToElement(videoSectionLnk);
		webDriverActions.softMouseHover(videoSectionLnk);
		webDriverActions.softHighlightElement(videoSectionLnk);
		webDriverActions.waitForSecond(2000);
		if(videoSliderArticleLnk.size()>0)
		{
			for(int i =1 ; i<videoSliderArticleLnk.size()-1;i++)
			{
				webDriverActions.softMouseHover(videoActiveSliderLnk);
				String beforeSlide = webDriverActions.getTextFromElement(videoActiveSliderLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(videoSliderLnk.get(i));
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(videoActiveSliderLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Video Section ");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+videoSectionArticleLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
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
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,dharmSectionLnk,dharmSectionArticleLnk, dharmBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	public void verifyNationWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationSectionLnk,nationSectionArticleLnk, nationBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	public void verifyBlogWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,blogSectionLnk,journalistArticleLnk, blogBreadcrumb);
	}



	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,worldSectionLnk,worldSectionArticleLnk,articleBreadCrumbDiv );
	}


	//--------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param section
	 * @param artList
	 */
	public void verifyArticlesNavigationBelowMobileTech(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleLnk);
		webDriverActions.mobileScroll(5);
		webDriverActions.continuousScrollTillElement(section, 8);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<1 ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
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
				//				webDriverActions.waitForPageToLoad();
			}
			String currentPage = webDriverActions.getCurrentPageUrl();
			softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

			if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			else {
				currentPage = webDriverActions.getCurrentPageUrl();
			} 
			webDriverActions.waitForElementVisibility(element, 3);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+actualUrl);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param sectionLnk
	 * @param breadcrumb
	 */
	public void verifySectionLnksBelowMobileTech(String serverType,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleLnk);
		webDriverActions.continuousScrollTillElement(section, 20);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		String actualUrl = webDriverActions.getAttribute("href", section);
		Logs.info(getClass(),"Actual text Before Click " + actualUrl);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClickJS(section);
		webDriverActions.waitForPageToLoad();

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

		webDriverActions.waitForElementVisibility(breadcrumb, 3);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+actualUrl);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	public void verifyKnowledgeWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,knowledgeSectionLnk,knowledgeSectionArticleLnk, knowledgeBreadcrumb);
	}



	// ------------------------- Vipin Business Logic  ---------------------------------------- //

	/**
	 * @param artList
	 * @param element
	 * @author VipinKumarGawande
	 * This method is used to Verify All The Widgets Article Text Navigation  
	 */
	public void verifyArticleNavigation(String serverType , List<WebElement> artList , WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		if(artList.size()>0)
		{
			webDriverActions.softScrollToElement(artList.get(0));
			webDriverActions.softMouseHover(artList.get(0));
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				String actual =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					actual = webDriverActions.getAttribute("href", artList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(artList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);;
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+artList.size());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}



	public void verifyTaazaSamacharArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(tazaSamacharArticleLnk, 15);
		if(tazaSamacharArticleLnk.size()>0)
		{
			webDriverActions.softScrollToElement(tazaSamacharArticleLnk.get(0));
			webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(0));
			for(int i=0; i<tazaSamacharArticleLnk.size();i++)
			{
				webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(i));
				webDriverActions.softScrollToElement(tazaSamacharArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", tazaSamacharArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(tazaSamacharArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(i));
					webDriverActions.softScrollToElement(tazaSamacharArticleLnk.get(i));
					webDriverActions.softClickJS(tazaSamacharArticleLnk.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softWaitForElementVisibility(articleHeaderTxt, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);
				webDriverActions.navigateBack();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+tazaSamacharArticleLnk.size());
		}

		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyTopHindiNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsArticleLnk, articleHeaderTxt);
	}

	public void verifyRelatedNewsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(relatedNewsLnk, 10);
		for(int i=0; i<relatedNewsLnk.size() ; i++)
		{
			webDriverActions.softScrollToElement(relatedNewsLnk.get(i));
			webDriverActions.softMouseHover(relatedNewsLnk.get(i));
			webDriverActions.softClickJS(relatedNewsLnk.get(i));
			webDriverActions.waitForSecond(5000);
			for(int j=0 ;j< activeRelatedNewsLnk.size() ; j++)
			{
				webDriverActions.scrollToElement(activeRelatedNewsLnk.get(j));
				webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
				webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeRelatedNewsLnk.get(j));
					webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForElementVisibility(articleHeaderTxt, 3);
				webDriverActions.softHighlightElement(articleHeaderTxt);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt), "Unable to Display Element in "+currentPage);
				webDriverActions.waitForSecond(2000);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.softClickJS(relatedNewsLnk.get(i));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}


	public void verifyNews18HindiPlusArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18HindiPlusArticleLnk, articleHeaderTxt);
	}


	public void verifyNews18HindiPlusBannerNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(news18HindiPlusBannerLnk, 10);
		webDriverActions.softClickJS(news18HindiPlusBannerLnk);
		webDriverActions.waitForSecond(2000);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable To Display Element in "+currentPage);
		softAssert.assertAll("Issue Found in Homepage Body ");	
	}


	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(webstoriesArticleLnk, 10);
		if(webstoriesArticleLnk.size()>0)
		{
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
					webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
					webDriverActions.softMouseHover(webstoriesArticleLnk.get(i));
					webDriverActions.mouseHoverAndClick(webstoriesArticleLnk.get(i));
				}
				webDriverActions.switchToNewWindow();
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
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextWebStoryBtn) , "Unable to Display Element in"+currentPage);;
				webDriverActions.closeDriver();
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+webstoriesArticleLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");

	}


	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softMouseHover(webstoriesTitleLnk);
		webDriverActions.softScrollToElement(webstoriesTitleLnk);
		if(webDriverActions.isElementDisplayed(activeWebstoriesArticleLnk))
		{
			for(int i = 0 ; i< webstoriesSliderBtn.size() ; i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
				webDriverActions.softClickJS(webstoriesSliderBtn.get(i));
				webDriverActions.waitForSecond(2000);
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


	public void verifyCricketArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , cricketArticleLnk, articleHeaderTxt);
	}

	public void verifyTopHindiNewsImageNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsImgLnk, articleHeaderTxt);
	}
	public void verifyTaazaSamacharImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, tazaSamacharImgLnk, articleHeaderTxt);
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
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(imgList, 15);
		if(imgList.size()>0)
		{
			webDriverActions.softScrollToElement(imgList.get(0));
			webDriverActions.softMouseHover(imgList.get(0));
			for(int i=0; i<imgList.size() ;i++)
			{
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				String actual =	webDriverActions.getAttribute("src", imgList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softHighlightElement(imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				webDriverActions.waitForPageToLoad();
				webDriverActions.waitForSecond(2000);
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(imgList.get(i));
					webDriverActions.softScrollToElement(imgList.get(i));
					actual = webDriverActions.getAttribute("href", imgList.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(imgList.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if(expectedUrl.equalsIgnoreCase(homeUrl))
				{
					softAssert.fail("Unable to Navigate in "+actual);
				}
				else if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForElementVisibility(element, 3);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
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
			softAssert.fail("Possibly Element is Not Visible or Size is "+imgList.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyCricketDhamalNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(cricketDhamalImgLnk);
		webDriverActions.softMouseHover(cricketDhamalImgLnk);
		webDriverActions.softClickJS(cricketDhamalImgLnk);
		webDriverActions.waitForPageToLoad();
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
		webDriverActions.waitForElementVisibility(articleBreadCrumbDiv, 3);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}


	public void verifyLatestMobileNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , latestMobileNewsArticleLnk, articleHeaderTxt);
	}


	public void verifyMobileBrandsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , mobileBrandsLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendingAndRecommendedSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(0));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
		if(trendindAndRecommendedStoriesLnk.size()>0)
		{
			for(int i =1 ; i<trendindAndRecommendedSlider.size();i++)
			{
				webDriverActions.softMouseHover(activeTrendindAndRecommendedStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(trendindAndRecommendedSlider.get(i));
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(activeTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Trending and Recommended Mobile Section ");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyTrendingAndRecommendedStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 30);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(0));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(0));
		if(trendindAndRecommendedStoriesLnk.size()>1)
		{
			for(int i=0; i<1 ;i++)
			{
				String actual =	webDriverActions.getAttribute("href", trendindAndRecommendedStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(trendindAndRecommendedStoriesLnk.get(i));
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
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyUpcomingMobileSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 10);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(1));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
		if(upcomingMobileSlider.size()>0)
		{
			for(int i =1 ; i<upcomingMobileSlider.size();i++)
			{
				webDriverActions.softMouseHover(upcomingMobileSlider.get(i));
				webDriverActions.softMouseHover(activeUpcomingMobileStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(activeUpcomingMobileStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(upcomingMobileSlider.get(i));
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(activeUpcomingMobileStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Soon Upcoming Mobile Section");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+upcomingMobileStoriesLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyUpcomingMobileStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(mobileFinderMoreNewsLnk, 30);
		webDriverActions.softHighlightElement(mobileFinderTabsLnk.get(1));
		webDriverActions.softClickJS(mobileFinderTabsLnk.get(1));
		if(upcomingMobileStoriesLnk.size()>1)
		{
			for(int i=0; i<1 ;i++)
			{
				webDriverActions.softMouseHover(upcomingMobileStoriesLnk.get(i));
				webDriverActions.softScrollToElement(upcomingMobileStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", upcomingMobileStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(upcomingMobileStoriesLnk.get(i));
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
				webDriverActions.waitForElementVisibility(articleBreadCrumbDiv, 3);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyBodyKhelTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(bodySportsTabLnk, 20);
		if(bodySportsTabLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bodySportsTabLnk.get(0));
			webDriverActions.softMouseHover(bodySportsTabLnk.get(0));
			for(int j =0 ; j<1 ; j++)
			{
				webDriverActions.softHighlightElement(bodySportsTabLnk.get(j));
				webDriverActions.softClickJS(bodySportsTabLnk.get(j));
				for(int i=0; i<1 ;i++)
				{
					webDriverActions.softMouseHover(bodySportsArticleLnk.get(i));
					webDriverActions.softScrollToElement(bodySportsArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", bodySportsArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(bodySportsArticleLnk.get(i));
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
					webDriverActions.waitForElementVisibility(articleBreadCrumbDiv, 3);
					webDriverActions.softHighlightElement(articleHeaderTxt);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
				}
			}
			softAssert.assertAll("Issue Found in Homepage Body ");
		}
	}
	public void verifyArticleBannerNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, articleBannerLnk, articleHeaderTxt);
	}

	public void verifyNews18MinisWorldOfNewsNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(worldOfNewsLnk, 20);
		webDriverActions.softClickJS(worldOfNewsLnk);
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
		webDriverActions.waitForElementVisibility(articleBreadCrumbDiv, 3);
		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18MinisArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyMoneyWidget(String serverType) 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(moneyLnk,GlobalVariables.sec60);
		webDriverActions.softMouseHover(moneyLnk);
		softAssert.assertTrue(moneyArticleList.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		/*Below loop validates the Pradesh news articles Navigations*/
		for (int i = 0; i < 2;i++) {
			webDriverActions.softMouseHover(moneyHeaderList.get(i));
			webDriverActions.softHighlightElement(moneyHeaderList.get(i));
			webDriverActions.softClickJS(moneyHeaderList.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(moneyHeaderList.get(i));
				webDriverActions.softHighlightElement(moneyHeaderList.get(i));
				webDriverActions.softClickJS(moneyHeaderList.get(i));
			}
			for (int j = 0; j < 1;j++) {
				webDriverActions.softMouseHover(moneyArticleList.get(j));
				webDriverActions.softHighlightElement(moneyArticleList.get(j));
				webDriverActions.softClickJS(moneyArticleList.get(j));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(moneyArticleList.get(j));
					webDriverActions.softHighlightElement(moneyArticleList.get(j));
					webDriverActions.softClickJS(moneyArticleList.get(j));
				}
				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				String expectedPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl=betaUrl;
				}
				webDriverActions.waitForElementVisibility(articleBreadCrumbDiv, 3);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
				if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softMouseHover(moneyHeaderList.get(i));
				webDriverActions.softClickJS(moneyHeaderList.get(i));
			}
		}
		softAssert.assertAll("Issues Found In Validating Pradesh News Articles Present on HomePage");
	}



	/**
	 * @author VipinKumarGawande
	 * This method used to verify Sahitya Section.
	 */
	public void verifySahityaArticleWidget(String server) 
	{
		verifyArticleNavigation(server, sahityaArticleList, headerBreadcrumbLnk);
	}

	/**
	 * @author VipinKumarGawande
	 * This method used to verify AjabGajab Section.
	 */
	public void verifyAjabGajabArticleWidget(String server) 
	{
		verifyArticleNavigation(server, ajabGajabArticleList, headerBreadcrumbLnk);
	}


	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on SuperHitGalleryArticleLnk Title in the Hindi Home page of mobile view
	 */
	public void verifySuperHitGalleryArticleLnk(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(superHitGalleryHeadline);

		if(superHitGalleryArticleLink.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<1;i++)
			{  
				webDriverActions.softMouseHover(superHitGalleryArticleLink.get(i));
				webDriverActions.softClickJS(superHitGalleryArticleLink.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(superHitGalleryArticleLink.get(i));
					webDriverActions.softScrollToElement(superHitGalleryArticleLink.get(i));
					webDriverActions.softClickJS(superHitGalleryArticleLink.get(i));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForElementVisibility(superHitGalleryBreadcrum, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element in "+currentPage);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+superHitGalleryArticleLink.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget
	 */
	public void verifyCrimeWidget(String serverType) {
		verifySectionLnks(serverType,crimeSectionLnk, crimeBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Crime Widget Article
	 */
	public void verifyCrimeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,crimeSectionLnk,crimeSectionArticleLnk, crimeBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}


	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void verifyPradeshNewsRajyaList(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softClickJS(pradeshNews);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
		{
			webDriverActions.navigateBack();
			webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
			webDriverActions.softClickJS(pradeshNews);
		}
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found In Validating Pradesh News Rajya List Present on HomePage");
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesWiseArticles(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softMouseHover(pradeshNews);
		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		/*Below loop validates the Pradesh news articles Navigations*/
		for (int i = 0; i < 2;i++) {
			webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
			webDriverActions.softHighlightElement(pradeshStatesLnks.get(i));
			webDriverActions.softClickJS(pradeshStatesLnks.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
				webDriverActions.softHighlightElement(pradeshStatesLnks.get(i));
				webDriverActions.softClickJS(pradeshStatesLnks.get(i));
			}
			for (int j = 0; j < 1;j++) {
				webDriverActions.softMouseHover(stateArticleLnks.get(j));
				webDriverActions.softHighlightElement(stateArticleLnks.get(j));
				webDriverActions.softClickJS(stateArticleLnks.get(j));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(stateArticleLnks.get(j));
					webDriverActions.softHighlightElement(stateArticleLnks.get(j));
					webDriverActions.softClickJS(stateArticleLnks.get(j));
				}
				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				String expectedPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl=betaUrl;
				}
				webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
				if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.waitForSecond(2000);
				webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
				webDriverActions.softClickJS(pradeshStatesLnks.get(i));
			}
		}
		softAssert.assertAll("Issues Found In Validating Pradesh News Articles Present on HomePage");
	}


	/**
	 * @author DanishR
	 * This method is used to verify Bollywood section article present on HomePage
	 */
	public void verifyBollywoodArticle(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(bollywoodHeadline,GlobalVariables.sec60);
		webDriverActions.softMouseHover(bollywoodHeadline);
		softAssert.assertTrue(bollywoodTabLnk.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		/*Below loop validates the Pradesh news articles Navigations*/
		for (int i = 0; i < 2;i++) {
			webDriverActions.softMouseHover(bollywoodTabLnk.get(i));
			webDriverActions.softHighlightElement(bollywoodTabLnk.get(i));
			webDriverActions.softClickJS(bollywoodTabLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(bollywoodTabLnk.get(i));
				webDriverActions.softHighlightElement(bollywoodTabLnk.get(i));
				webDriverActions.softClickJS(bollywoodTabLnk.get(i));
			}
			for (int j = 0; j < 1;j++) {
				webDriverActions.softMouseHover(bollywoodarticleLnk.get(j));
				webDriverActions.softHighlightElement(bollywoodarticleLnk.get(j));
				webDriverActions.softClickJS(bollywoodarticleLnk.get(j));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(bollywoodarticleLnk.get(j));
					webDriverActions.softHighlightElement(bollywoodarticleLnk.get(j));
					webDriverActions.softClickJS(bollywoodarticleLnk.get(j));
				}
				String currentPageUrl = webDriverActions.getCurrentPageUrl();
				String expectedPageUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPageUrl.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
					webDriverActions.navigateToUrl(betaUrl);
					currentPageUrl=betaUrl;
				}
				webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
				webDriverActions.softHighlightElement(articleBreadcrumb);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
				if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softMouseHover(bollywoodTabLnk.get(i));
				webDriverActions.softClickJS(bollywoodTabLnk.get(i));
			}
		}
		softAssert.assertAll("Issues Found In Validating Pradesh News Articles Present on HomePage");
	}


	/**
	 * @author 
	 * This method is used to verify mobile tech section article present on HomePage
	 */
	public void verifyMobileTechArticleList(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToElement(mobileTech);
		webDriverActions.softMouseHover(mobileTech);

		for (int i = 0; i < 2;i++) {
			webDriverActions.softScrollToElement(mobileTechTabLnk.get(i));
			webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
			webDriverActions.softHighlightElement(mobileTechTabLnk.get(i));
			webDriverActions.softClickJS(mobileTechTabLnk.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(photoSectionLnk, 3);
				webDriverActions.softClickJS(photoSectionLnk);
			}

			for (int j = 0; j < 1;j++) {
				webDriverActions.softScrollToElement(mobileTecharticleLnk.get(j));
				webDriverActions.softMouseHover(mobileTecharticleLnk.get(j));
				webDriverActions.softClickJS(mobileTecharticleLnk.get(j));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(photoSectionLnk, 3);
					webDriverActions.softClickJS(photoSectionLnk);
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expected = webDriverActions.getCurrentPageUrl();		
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				webDriverActions.waitForElementVisibility(articleBreadcrumb, 3);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibly element is not visible "+currentPage);
				if(currentPage.equals(expected))
				{
					webDriverActions.navigateBack();
				}
				else
				{
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
				webDriverActions.softClickJS(mobileTechTabLnk.get(i));
			}
		}
		softAssert.assertAll(" Issues found in Mobile Tech Section Atricles present on Home Page ");
	}

	//--------------horoscope--------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
//		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionLnk);
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 20);		
		webDriverActions.softMouseHover(horoscopeSectionLnk);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		webDriverActions.softHighlightElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			String horoscopeText = webDriverActions.getAttribute("id",horoscopeSignsTxt.get(i));
			Logs.info(getClass(), horoscopeText);
			webDriverActions.softMouseHover(horoscopeSigns.get(i));
			webDriverActions.navigateToNewTab(horoscopeSigns.get(i));
			webDriverActions.switchToNewWindow();
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
			webDriverActions.scrollToPoint(0, 80);
			webDriverActions.softWaitForElementVisibility(horoscopeInfo, 5);
			webDriverActions.softHighlightElement(horoscopeInfo);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeInfo) , "Unable to Display description after clicking on "+horoscopeText);
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}

	/**
	 * The below method is used validate count of Articles and Ad present in Priority Panel on Home Page
	 */
	public void verifyPriorityPanelArticleCount() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		SoftAssert softAssert = new SoftAssert();
		Logs.info(getClass(), tazaSamacharArticleLnk.size()+ " Articles present in Priority panel");
		softAssert.assertTrue(tazaSamacharArticleLnk.size()==14, "Articles count do not match the pre condition and Articles count is : "+tazaSamacharArticleLnk.size());
		webDriverActions.softWaitForAllElementsVisible(AdLink, 50);
		Logs.info(getClass(), AdLink.size()+ " Ad present in Priority panel");
		softAssert.assertTrue(AdLink.size()==1, "Possibily no Ad is present and Ad count is : "+AdLink.size());
		softAssert.assertAll("Issues Found in Homepage Body");
	}
	public void verifyFooterPopularCategorySection(String server)
	{
		verifyFooterSection(popularCategorySection, headerTxtLogoLnk, popularCategoryList,server);
	}
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to Verify Trending Topic Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifyFooterTrendingTopicSection(String server)
	{
		verifyFooterSection(trendingTopicSection, headerTxtLogoLnk, trendingTopicsList,server);
	}
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Footer Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifyFooterSection(WebElement section,WebElement headerText,List<WebElement> footerList, String server)
	{
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.mobileScroll(3);
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.softMouseHover(section);
		for(int i=0;i<1;i++)
		{
			webDriverActions.softMouseHover(section);
			webDriverActions.clickJS(footerList.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
		}
	}
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to Verify Hot On Social Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifyFooterLanguageSitesSection()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.softMouseHover(languageSitesSection);
		for(int i=0;i<1;i++)
		{
			webDriverActions.softScrollToElement(languageSitesList.get(i));
			String actual = webDriverActions.getAttribute("href",languageSitesList.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softClickJS(languageSitesList.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.softWaitForElementVisibility(headerTxtOfLanguageSites, 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerTxtOfLanguageSites), "Possibly Icon is not displayed "+ expected);
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to Verify Hot On Social Section Present In Footer Part Of Mobile English Home Page.
	 */
	public void verifyFooterHotOnSocialSection(String server)
	{
		verifyFooterSection(hotOnSocialSection, headerTxtOfHotAndSocial, hotOnSocialList,server);
	}

	public void verifyInfiniteScroll(String serverType) {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		if(tazaSamacharArticleLnk.size()>0)
		{
			webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(0));
			for(int i=0; i<1;i++)
			{
				webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", tazaSamacharArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(tazaSamacharArticleLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(tazaSamacharArticleLnk.get(i));
					actual = webDriverActions.getAttribute("href", tazaSamacharArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(tazaSamacharArticleLnk.get(i));
				}
				String currentPage =webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")&&!currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.waitForPageToLoad();
				webDriverActions.softScrollToElement(agliKhabar);
				//				webDriverActions.mobileScroll(15);
				webDriverActions.continuousScrollTillElement(agliKhabar, 5);
				webDriverActions.softWaitForElementVisibility(agliKhabar, 3);
				webDriverActions.softHighlightElement(nextArticleBreadcrum);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(nextArticleBreadcrum) , "Unable to Display Element in "+currentPage);
			}
			softAssert.assertAll("Issues Found In Validating Infinite Scroll");
		}
	}

	public void verifyHomepageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	public void verifyTagPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(trendingTopicLink.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}
	public void verifyPhotogalleryPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(cricketArticleLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");
	}

	public void verifyVideoPageNewStack() {
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softClickJS(videoSectionArticleLnk.get(1));
		webDriverActions.switchToNewWindow();
		webDriverActions.viewPageSource();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(newStackText) , "Unable to Display Element in "+webDriverActions.getCurrentPageUrl());
		softAssert.assertAll("Issues Found");	
	}

	public void verfyLiveBlogHeadline(String serverType)
	{
		verfyLiveBlog(serverType, liveBlogHeadline, articleBreadcrumb);
	}

	public void verfyLiveBlogImg(String serverType)
	{
		verfyLiveBlog(serverType, liveBlogImage, articleBreadcrumb);
	}


	/**
	 *@author 
	 * This method is used to click on LiveBlog Article of Hindi Home Page 
	 */

	public void verfyLiveBlog(String serverType, List<WebElement> image,WebElement breadcrum)
	{
		ArrayList<String>list=new ArrayList<>();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForElementVisibility(image.get(0), 3);
		if(image.size()>0)
		{
			String liveBlogUrl = webDriverActions.getAttribute("href", image.get(0));
			if (serverType.contains("preProd") && !liveBlogUrl.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(liveBlogUrl);
				liveBlogUrl=betaUrl;
			}
			list.add(liveBlogUrl);
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}
	}

	/**
	 * @author DanishR
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection(String serverType)
	{
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (webDriverActions.softIsElementDisplayed(photoSectionLnk, 1)) {
			webDriverActions.softClickJS(photoSectionLnk);
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(photoSectionLnk, 1);
				webDriverActions.softClickJS(photoSectionLnk);
			}
			if (photogalleryArticleLnk.size()>0) {
				webDriverActions.softClickJS(photogalleryArticleLnk.get(0));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softWaitForElementVisibility(photogalleryArticleLnk.get(0), 3);
					webDriverActions.softClickJS(photogalleryArticleLnk.get(0));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
			}
			else {
				Logs.error(getClass(),"Possibily element is not visible "+ webDriverActions.getCurrentPageUrl());
				softAssrt.fail("Possibily element is not visible "+ webDriverActions.getCurrentPageUrl());
			}
		}
		else {
			Logs.error(getClass(),"Possibily element is not visible "+ photoSectionLnk+" "+ webDriverActions.getCurrentPageUrl());
			softAssrt.fail("Possibily element is not visible "+ photoSectionLnk+" "+ webDriverActions.getCurrentPageUrl());
		}
		softAssrt.assertAll("Issue in photo section : ");
	}


	/**
	 * @author DanishR
	 * This method is used to click on First Article of HIndi Home Page 
	 */
	public void articleHomePage(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		if (homePageArticleLnk.size()>0) {
			webDriverActions.softClickJS(homePageArticleLnk.get(0));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(homePageArticleLnk.get(0), 3);
				webDriverActions.softClickJS(homePageArticleLnk.get(0));
			}
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
		}
		else {
			Logs.error(getClass(),"Possibily element is not visible "+ webDriverActions.getCurrentPageUrl());
			softAssrt.fail("Possibily element is not visible "+ webDriverActions.getCurrentPageUrl());
		}
		softAssrt.assertAll("Issue found in HomePage article : ");
	}

	/**
	 *@author DanishR
	 * This method is used to click on LiveBlog Article of Hindi Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHindiHomePage(String serverType) {
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		softAssrt.assertTrue(webDriverActions.softIsElementDisplayed(homePageLiveBlogArticleLnk.get(0)),  "Possibily element is not displayed "+webDriverActions.getCurrentPageUrl());
		if(homePageLiveBlogArticleLnk.size()>0)
		{
			webDriverActions.softClickJS(homePageLiveBlogArticleLnk.get(0));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(homePageLiveBlogArticleLnk.get(0), 3);
				webDriverActions.softClickJS(homePageLiveBlogArticleLnk.get(0));
			}
			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
			}
		}
		else
		{
			Logs.error(getClass(), "Exception in Live blog in HomePage Link");
			throw new SkipException("Unable to locate Live Blog Article element possibly no Live Blog Present "+webDriverActions.getCurrentPageUrl());	
		}
	}	

	/**
	 * @author DanishR
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnVideosSection(String serverType)
	{
		SoftAssert softAssrt = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softWaitForElementVisibility(hamburgerMenuLnk, 3);
		webDriverActions.softClickJS(hamburgerMenuLnk);
		if (webDriverActions.softIsElementDisplayed(hamburgerMenuLnk, 1)) {
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(hamburgerMenuLnk, 3);
				webDriverActions.softClickJS(hamburgerMenuLnk);
			}
			if (webDriverActions.softIsElementDisplayed(videosLnk, 1)) {
				webDriverActions.softClickJS(videosLnk);
				if (webDriverActions.softIsElementDisplayed(videosAllLnk, 1)) {
					webDriverActions.softClickJS(videosAllLnk);
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softWaitForElementVisibility(videosAllLnk, 3);
						webDriverActions.softClickJS(videosAllLnk);
					}
					String currentPage = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
					}
				}
				else {
					Logs.error(getClass(),"Possibily element is not visible "+ videosAllLnk+" "+webDriverActions.getCurrentPageUrl());
					softAssrt.fail("Possibily element is not visible "+  videosAllLnk+" "+webDriverActions.getCurrentPageUrl());
				}
			}
			else {
				Logs.error(getClass(),"Possibily element is not visible "+videosLnk+" "+ webDriverActions.getCurrentPageUrl());
				softAssrt.fail("Possibily element is not visible "+ webDriverActions.getCurrentPageUrl());
			}
		}
		else {
			Logs.error(getClass(),"Possibily element is not visible "+hamburgerMenuLnk+" "+ webDriverActions.getCurrentPageUrl());
			softAssrt.fail("Possibily element is not visible "+ hamburgerMenuLnk+" "+webDriverActions.getCurrentPageUrl());
		}
		softAssrt.assertAll("Issue found in Video section ");
	}

	/**
	 * @author DanishR
	 * This method used to validate Topics Links on Home Page
	 */
	public void topicsLinks(String serverType) {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(3);
		webDriverActions.scrollToLast();
		for (int i = 0; i < 1; i++) {

			webDriverActions.softWaitForElementVisibility(topicslinks.get(i), 3);
			String link = webDriverActions.getAttribute("target", topicslinks.get(i));
			if (link.contains("_blank")) {
				webDriverActions.softClickJS(topicslinks.get(i));
				webDriverActions.switchToNewWindow();
			}
			else {
				webDriverActions.softClickJS(topicslinks.get(i));
			}

			String currentPage = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(articleBreadcrumb, 3);
			webDriverActions.softHighlightElement(articleBreadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb)," Possibily element not visible "+currentPage);
		}
		softAssert.assertAll("Issues found in topics page : ");
	}

	/**
	 * @author DanishR
	 * This Method is use to verify Hamburger Menu Auto Section
	 */
	public void hamburgerMenuSection(String serverType,WebElement hambugerMenu,WebElement hamburgerSection,List<WebElement> hamburgerArticleLinks,WebElement breadcrumb)
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(hambugerMenu);
		webDriverActions.softClickJS(hamburgerSection);
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(hamburgerSection);
		}
		softAssert.assertTrue(hamburgerArticleLinks.size()>0,"Possibly element not visible " +webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */    
		for (int  i= 0; i < 1; i++) {
			webDriverActions.softWaitForElementVisibility(hamburgerArticleLinks.get(i), 3);
			webDriverActions.stopPageLoading();
			webDriverActions.softMouseHover(hamburgerArticleLinks.get(i));
			webDriverActions.softHighlightElement(hamburgerArticleLinks.get(i));
			webDriverActions.softClickJS(hamburgerArticleLinks.get(i));
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(hamburgerArticleLinks.get(i), 3);
				webDriverActions.stopPageLoading();
				webDriverActions.softMouseHover(hamburgerArticleLinks.get(i));
				webDriverActions.softHighlightElement(hamburgerArticleLinks.get(i));
				webDriverActions.softClickJS(hamburgerArticleLinks.get(i));
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			webDriverActions.softWaitForElementVisibility(breadcrumb, 3);
			webDriverActions.stopPageLoading();
			webDriverActions.softHighlightElement(breadcrumb);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Possibly element not visible " +currentPageUrl);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu Auto Section ");
	}

	public void hamburgerMenuAutoSection(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerAutoLnk, hamburgerAutoArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuDuniyaSection(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerDuniyaLnk, hamburgerDuniyaArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuPhotoSection(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerPhotoLnk, hamburgerPhotoArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuLifeStyleSection(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerLifeStyleLnk, hamburgerLifeStyleArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuManoranjanValidation(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerManoranjanLnk, hamburgerManoranjanArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuMobileTechLinks(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerMobileTechLnk, hamburgerMobileTechArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuVideoSection(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerVideoLnk, hamburgerVideoArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuPradeshLinks(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerPradeshLnk, hamburgerPradeshArtLnks, articleBreadcrumb);
	}

	public void hamburgerMenuVideoSectionValidation(String serverType)
	{
		hamburgerMenuSection(serverType, hamburgerMenuLnk, hamburgerVideoLnk, hamburgerVideoArtLnks, articleBreadcrumb);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify Line One section elements By clicking on it.
	 */
	public void verfyLineOneSection(String serverType)
	{
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElement(1000);
			//Validating the Line one section Except Search Button
			for (int i = 1; i < lineOneSectionELementLnk.size(); i++)
			{
				webDriverActions.softMouseHover(lineOneSectionELementLnk.get(i));
				String actual = webDriverActions.getAttribute("href", lineOneSectionELementLnk.get(i));
				Logs.info(getClass(), actual);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(lineOneSectionELementLnk.get(i)), "possibly line One Element Is not Visible"+actual);
				webDriverActions.softClick(lineOneSectionELementLnk.get(i));
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(lineOneSectionELementLnk.get(i));
				}
				webDriverActions.waitForSecond(1000);
				String currentPage = webDriverActions.getCurrentPageUrl();		
				String expected = webDriverActions.getCurrentPageUrl();		
				if (serverType.contains("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					currentPage=betaUrl;
				}

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

				// it will iterate the list and validate 
				if(actual.contains("icici-lombard") ||actual.contains("electral") ||actual.contains("crypto") || actual.contains("netrasuraksha") )
				{
					for(int j=0;j<list.size();j++)
					{
						if(actual.contains(list.get(j)))
						{
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(j), 1), "Possibly Element Is Not Visible For This URL "+expected);	
						}
					}
				}
				else
				{
					//					webDriverActions.softWaitForElementVisibility(headerBreadcrumbLnk, 3);
					//					webDriverActions.stopPageLoading();
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerBreadcrumbLnk, 1), "Possibly Element Is Not Visible For This URL "+expected);	

				}
				if(currentPage.equals(expected))
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
		catch(Exception e)
		{
			softAssert.assertTrue(false, "Possibly Element Is Not Clickable or Visible");	
		}
		softAssert.assertAll("Issues Found In Validating Line One Section");
	}
}

