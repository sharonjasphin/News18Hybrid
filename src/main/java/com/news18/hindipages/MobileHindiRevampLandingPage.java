package com.news18.hindipages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.commonpages.HomePageLinksValidation;
import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 * This Class Contains elements and business logics for AMP Hindi Revamp Mobile Landing  Page
 *
 */
public class MobileHindiRevampLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public MobileHindiRevampLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//===============================common Revamp Elements=======================================
	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'latest')]")
	private WebElement lineOneLatestSectionELe;

	/*Line One Money Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'business')]")
	private WebElement lineOneMoneySectionELe;

	/*Line One Food  Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/lifestyle/recipe/')]")
	private WebElement lineOneFoodSectionELe;

	/*Line One Entertainment Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'entertainment')]")
	private WebElement lineOneEntertainmentSectionELe;

	/*Line One Photo Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'photogallery')]")
	private WebElement lineOnePhotoSectionELe;

	/*Line One Career Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'career')]")
	private WebElement lineOneCareerSectionELe;

	/*Line One Cricket Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'cricket')]")
	private WebElement lineOneCricketSectionELe;

	/*Line One Life Style Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[@href='/lifestyle/']")
	private WebElement lineOneLifeStyleSectionELe;

	/*Line One Health Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/lifestyle/health/')]")
	private WebElement lineOneHealthSectionELe;

	/*Line One Knowledge Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'knowledge')]")
	private WebElement lineOneKnowledgeSectionELe;

	/*Line One Latest Mobile Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'mobiles')]")
	private WebElement lineOneLatestMobileSectionELe;

	/*Line One States Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/states/')]")
	private WebElement lineOneStatesSectionELe;

	/*Line One Podcast Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/podcast/')]")
	private WebElement lineOnePodcastSectionELe;

	/*Line One World Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/world/')]")
	private WebElement lineOneWorldSectionELe;

	/*Line One Astrology Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/astrology/')]")
	private WebElement lineOneAstrologySectionELe;

	/*Line One News18Minis Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/minis/')]")
	private WebElement lineOneNews18MinisSectionELe;

	/*Line One Sahitya Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/literature/')]")
	private WebElement lineOneSahityaSectionELe;

	/*Line One Nation Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/nation/')]")
	private WebElement lineOneNationSectionELe;

	/*Line One Crime Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/crime/')]")
	private WebElement lineOneCrimeSectionELe;

	/*Line One LiveTv Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'/livetv/')]")
	private WebElement lineOneLiveTvSectionELe;

	/*Line One Cartoon Corner Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a[contains(@href,'cartoon-corner')]")
	private WebElement lineOneCartoonCornerSectionELe;
	
	/*auto Section element*/
	@FindBy(xpath="//a[text()='ऑटो']/ancestor::div[contains(@class,'newglblhdwrap')]//a")
	private WebElement autoSectionELe;

	//================================DanishR---WebElements==========================================

	/*jobArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'jobs')]//parent::h2//parent::div//following-sibling::div//ul//li//a")
	private List<WebElement> jobArticleLst;

	/*jobReadmoreBtn present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.='नौकरी')]//parent::div//parent::div//following-sibling::a")
	private WebElement jobReadmoreBtn;

	/*jobHeadline present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'newglblhdwrap')]//h2[(.='नौकरी')]//a")
	private WebElement jobHeadline;

	/*duniya present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'world')]//parent::h2//parent::div//following-sibling::div//ul//li//a")
	private List<WebElement> duniyaArticleLst;

	/*duniya present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.='दुनिया')]//parent::div//parent::div//following-sibling::a")
	private WebElement duniyaReadmoreBtn;

	/*duniya present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'newglblhdwrap')]//h2[(.='दुनिया')]//a")
	private WebElement duniyaHeadline;

	/*healthAndFitness present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'हेल्थ & फिटनेस')]//parent::h2//parent::div//following-sibling::ul//a")
	private List<WebElement> healthAndFitnessArticleLst;

	/*healthAndFitness present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'हेल्थ & फिटनेस')]//parent::h2//parent::div/following-sibling::a")
	private WebElement healthAndFitnessReadmoreBtn;

	/*healthAndFitness present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'हेल्थ & फिटनेस')]")
	private WebElement healthAndFitnessHeadline;

	/*ajabGajab present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'अजब-गजब')]//parent::h2//parent::div//following-sibling::ul//a")
	private List<WebElement> ajabGajabArticleLst;

	/*ajabGajab present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'अजब-गजब')]//parent::h2//parent::div/following-sibling::a")
	private WebElement ajabGajabReadmoreBtn;

	/*ajabGajab present in the Hindi Home Page*/
	@FindBy(xpath="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'अजब-गजब')]")
	private WebElement ajabGajabHeadline;

	/*autoSectionHeadline present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'auto')]//parent::h2//parent::div//a")
	private WebElement autoSectionHeadline;

	/*autoArticleLst present in the Hindi Home Page*/
	@FindBy(xpath ="//div//a[contains(@href,'/auto')]//parent::h2//parent::div//following-sibling::div[1]//ul//li//a")
	private List<WebElement> autoArticleLst;

	/*autoReadmore present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'ऑटो')]//parent::h2//parent::div/following-sibling::div/a")
	private WebElement autoReadmore;

	/*cartoonTitle present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(.,'कॉर्टून कार्नर')]")
	private WebElement cartoonTitle;

	/*cartoon present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'कॉर्टून कार्नर')]//parent::h2//parent::div//following-sibling::div[contains(@class,'cartoon')]//div//following-sibling::div//a")
	private WebElement cartoonReadMore;

	/*cartoonStory present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'कॉर्टून कार्नर')]//parent::h2//parent::div//following-sibling::div[contains(@class,'cartoon')]//li[contains(@class,'glide__slide--active')]/a")
	private WebElement cartoonActiveArticleLnk;

	/*cartoonStory present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'कॉर्टून कार्नर')]//parent::h2//parent::div//following-sibling::div[contains(@class,'cartoon')]//button")
	private List<WebElement> cartoonSliderButtonLnk;

	/*food present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(.,'फूड')]")
	private WebElement foodTitle;

	/*food present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फूड')]//parent::h2//parent::div//following-sibling::div[contains(@class,'food')]//div/a")
	private WebElement foodReadMore;

	/*food present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फूड')]//parent::h2//parent::div//following-sibling::div[contains(@class,'food')]//li[contains(@class,'glide__slide--active')]/a")
	private WebElement foodActiveArticleLnk;

	/*food  present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फूड')]//parent::h2//parent::div//following-sibling::div[contains(@class,'food')]//button")
	private List<WebElement> foodSliderButtonLnk;

	/*Photo present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(.,'फोटो')]")
	private WebElement photoTitle;

	/*Photo present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फूड')]//parent::h2//parent::div//following-sibling::div[contains(@class,'photo')]//div/a")
	private WebElement photoReadMore;

	/*Photo present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फोटो')]//parent::h2//parent::div//following-sibling::div[contains(@class,'photo')]//li[contains(@class,'glide__slide--active')]/a")
	private WebElement photoActiveArticleLnk;

	/*Photo  present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फोटो')]//parent::h2//parent::div//following-sibling::div[contains(@class,'photo')]//button")
	private List<WebElement> photoSliderButtonLnk;

	/*Photo  present in the Hindi Home Page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'फूड')]//parent::h2//parent::div//following-sibling::ul//li//a")
	private List<WebElement> photoTabLnk;


	//---------------------------Vipin Web Elements( HomePage_MOBILE )-------------------------------------------//

	/* Article Header Text in Article Consumption Page */
	@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
	private WebElement articleHeaderTxt;

	/*List of Body Sports Article Link for Cricket Section in Mobile Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/cricket/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a")
	private List<WebElement> cricketArticleLnk ;

	/*List of Body Sports Article Link for Cricket Section in Mobile Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/cricket/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> cricketImgLnk ;

	/*Body Sports Read More Link in Cricket in Mobile Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/cricket/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement cricketReadMoreLnk;

	/* Cricket Title Link In Mobile Homepage body*/
	@FindBy(xpath = "//div[contains(@class,'wrap')]/h2/a[contains(@href,'cricket')]")
	private WebElement cricketTitleLnk;

	/*list Of elements present under Sahitya Article Section*/
	@FindBy(xpath="//h2/a[(@href='/literature/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a")
	private List<WebElement> sahityaArticleLnk;

	/*List of Body Sports Article Link for Sahitya Section in Mobile Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/literature/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> sahityaImgLnk ;

	/*Aur bhi Padhe  link present on Sahitya Section of mobile hindi landing page*/
	@FindBy(xpath="//h2/a[(@href='/literature/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement sahityaReadMoreLnk;

	/*Sahitya link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'wrap')]/h2/a[contains(@href,'literature')]")
	private WebElement sahityaTitleLnk;

	/*TazaSamachar Articles in Homepage */
	@FindBy(xpath = "//h2/a[(@href='/latest-news/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]/li/a")
	private List<WebElement> tazaSamacharArticleLnk;

	/*TazaSamachar Image in Homepage */
	@FindBy(xpath = "//h2/a[(@href='/latest-news/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img[@data-src]")
	private List<WebElement> tazaSamacharImgLnk;

	/*Top Hindi News Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnew')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live'))] | //ul[contains(@class,'fortopstories')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live'))]")
	private List<WebElement> topHindiNewsArticleLnk; 

	/*Top Hindi News Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'topnew')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live'))]//img | //ul[contains(@class,'fortopstories')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live'))]//img")
	private List<WebElement> topHindiNewsImgLnk;

	/*Aur bhi Padhe  link present on PriorityPanel Section of mobile hindi landing page*/
	@FindBy(xpath="//h2/a[(@href='/latest-news/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]/a")
	private WebElement priorityPanelReadMoreLnk;

	/*TazaSamachar link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'wrap')]/h2/a[contains(@href,'latest-news')]")
	private WebElement tazaSamacharTitleLnk;

	/* List of Related News Links in PriorityPanel in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]/ul[contains(@class,'global-storylist')]/li/div[contains(@id,'right')]")
	private List<WebElement> relatedNewsLnk;

	/* List of Active Articles After Navigating to Related News Division */
	@FindBy(xpath = "//div[contains(@class,'newstrendvideo')]//div[contains(@class,'active')]//a")
	private List<WebElement> activeRelatedNewsLnk;


	/* Article BreadCrumb Division */
	@FindBy(xpath = "//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement articleBreadCrumbDiv;

	/*List of News18 Hindi Plus Article Link in Homepage*/
	@FindBy(xpath = " //h2/a[(@href='/tag/cryptocurrency/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'newhindiplus')]//li//a")
	private List<WebElement> news18HindiPlusArticleLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/tag/cryptocurrency/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'newhindiplus')]//a//img")
	private List<WebElement> news18HindiPlusImgLnk ;

	/*News18 Hindi Plus Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[(@href='/tag/cryptocurrency/')]")
	private WebElement news18HindiPlusTitleLnk;

	/* Read More Link in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/tag/cryptocurrency/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a[contains(@href,'cryptocurrency')]")
	private WebElement news18HindiPlusReadMoreLnk;

	/* Cricket Dhamal Image Link in Cricket Widget in Homepage */
	@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/cricket/')]/ancestor::div[contains(@class,'globalhd')]/following-sibling::div/a/img")
	private WebElement cricketDhamalImgLnk;

	/* Cricket Section Read More Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'container')]/a[contains(@href,'/sports/cricket/')]")
	private WebElement moreCricketNewsLnk; 

	/* List of Latest Mobile News Article Links in Mobile Finder Section in Homepage*/ 
	@FindBy(xpath = "//div[contains(@id,'tab_one')]//ul/li/a")
	private List<WebElement> latestMobileNewsArticleLnk;

	/* List of Mobile Finder Section Image in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_one')]//ul/li/a//img")
	private List<WebElement> latestMobileNewsImgLnk;

	/* More News Link in Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_one')]/a")
	private WebElement latestMobileNewsReadMoreLnk;

	/* Find Mobile by brand Banner Mobile brands Links for Mobile Finder Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'spcmblwrap')]/div[contains(@class,'find_wrp')]//a")
	private List<WebElement> mobileBrandsLnk;

	/*Mobile Finder Tabs Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'listnavitem')]/li/a[contains(.,'ट्रेंडिंग और रिकमंडेड मोबाइल')]")
	private WebElement trendingAndRecommendedMobileTabLnk; 

	/*Soon Upcoming Mobile Tabs Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'listnavitem')]/li/a[contains(.,'जल्‍द लॉन्‍च होने वाले मोबाइल')]")
	private WebElement soonUpcomingMobileTabLnk; 

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> trendindAndRecommendedStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//ul//li[not (contains(@class,'clone')) and contains(@class,'active')]/a//h2")
	private WebElement activeTrendindAndRecommendedStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'trndstorynewbullet')]/button")
	private List<WebElement> trendindAndRecommendedSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//ul/li[not (contains(@class,'clone'))]//div/a")
	private List<WebElement> trendindAndRecommendedReadMoreLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_three')]//ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> upcomingMobileStoriesLnk;

	/* Active Upcoming Mobile Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_three')]//ul//li[not (contains(@class,'clone')) and contains(@class,'active')]/a//h2")
	private WebElement activeUpcomingMobileStoriesLnk;

	/* Slider Button for Upcoming Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_three')]//div[contains(@class,'trndstorynewbullet')]/button")
	private List<WebElement> upcomingMobileSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_three')]//ul/li[not (contains(@class,'clone'))]//div/a")
	private List<WebElement> upcomingMobileReadMoreLnk;

	/*List of Tabs in Body Sports Tab Links for Sports Section In Homepage */
	@FindBy(xpath = "//h2/a[(@href='/sports/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'listnavitem')]/li//a")
	private List<WebElement> bodySportsTabLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/sports/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//li//a")
	private List<WebElement> bodySportsArticleLnk ;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/sports/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> bodySportsImgLnk ;

	/*Body Sports Read More Link in Sports in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/sports/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement bodySportsReadMoreLnk;

	/*List of Tabs in Body Sports Tab Links for Sports Section In Homepage */
	@FindBy(xpath = "//h2/a[(@href='/tech/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'listnavitem')]/li//a")
	private List<WebElement> mobileTechTabLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/tech/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//li//a")
	private List<WebElement> mobileTechArticleLnk ;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/tech/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> mobileTechImgLnk ;

	/*Body Sports Read More Link in Sports in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/tech/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement mobileTechReadMoreLnk;

	/*Bollywood Title Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[(@href='/tech/')]")
	private WebElement mobileTechTitleLnk;

	/*List of Tabs in Body Sports Tab Links for Sports Section In Homepage */
	@FindBy(xpath = "//h2/a[(@href='/entertainment/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'listnavitem')]/li//a")
	private List<WebElement> bollywoodTabLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/entertainment/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//li//a")
	private List<WebElement> bollywoodArticleLnk ;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/entertainment/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> bollywoodImgLnk ;

	/*Body Sports Read More Link in Sports in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/entertainment/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement bollywoodReadMoreLnk;

	/*Bollywood Title Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[(@href='/entertainment/')]")
	private WebElement bollywoodTitleLnk;

	/* Article Banner Link In homepage*/
	@FindBy(xpath = "//div[contains(@class,'newbreaking')]//a")
	private List<WebElement> articleBannerLnk;

	/*News18 Minis Section A world of news at your fingertips Link in Homepage */
	@FindBy(xpath = "//h2/a[(@href='/minis/')]/em")
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

	/*News18 MINIS Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[(@href='/minis/')]")
	private WebElement news18MinisTitleLnk;


	/*List of Tabs in Body Sports Tab Links for Sports Section In Homepage */
	@FindBy(xpath = "//h2/a[(@href='/business/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'listnavitem')]/li//a")
	private List<WebElement> moneyTabLnk;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/business/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//li//a")
	private List<WebElement> moneyArticleLnk ;

	/*List of Body Sports Article Link for Sports Section in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/business/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::ul[contains(@class,'photo')]//a//img")
	private List<WebElement> moneyImgLnk ;

	/*Body Sports Read More Link in Sports in Homepage*/
	@FindBy(xpath = "//h2/a[(@href='/business/')]/ancestor::div[contains(@class,'newglblhdwrap')]/following-sibling::a")
	private WebElement moneyReadMoreLnk;

	/*Money Title Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[(@href='/business/')]")
	private WebElement moneyTitleLnk;

	/*moneyCongtrol link present on the body part of mobile hindi landing page*/
	@FindBy(xpath="//div[contains(@class,'newglblhdwrap')]//h2//span//a[contains(@href,'moneycontrol')]")
	private WebElement moneyControlLnk;

	/*header Text Link Present RHS of News 18 Logo*/
	@FindBy(xpath ="(//img[@alt='Moneycontrol'])[2]")
	private WebElement moneyControlLogoLnk;

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

	/* Webstories Section  Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2/a[contains(@href,'/web-stories/')]")
	private WebElement webstoriesTitleLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]//ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> webstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]//ul/li[not (contains(@class,'clone'))]/a//img")
	private List<WebElement> webstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]//ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a")
	private WebElement activeWebstoriesArticleLnk;

	/* Active Webstories Image Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]//ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a//img")
	private WebElement activeWebstoriesImgLnk;

	/* WebStories Next Story Button after navigation of WebStories Article */
	@FindBy(xpath = "//div[contains(@class,'next-container')]")
	private WebElement nextWebStoryBtn;

	/* Webstories Slider Button in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]//div[contains(@class,'trndstorynewbullet')]/button")
	private List<WebElement> webstoriesSliderBtn;

	/*Whatsapp Banner in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'align')]//a[contains(@id,'whatsappBanner')]")
	private WebElement whatsappBannerLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@alt,'Profile Picture')]")
	private WebElement whatsAppHeader;

	//===============================Anupam---WebElements==========================================

	///------------video
	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]/a")
	private WebElement videoSectionRevAmpLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div[1]//li[not (contains(@class,'glide__slide--clone'))]//a")
	private List<WebElement> videoSectionArticleRevAmpLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div[1]//li[not (contains(@class,'glide__slide--clone'))]//img")
	private List<WebElement> videoSectionImgRevAmpLnk;

	/* Video section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreVideoSectionRevAmpLnk;

	/* Video active slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div[1]//li[contains(@class,'active') and not (contains(@class,'glide__slide--clone'))]//a")
	private WebElement videoActiveSliderRevAmpLnk;

	/* Video Article slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div[1]//li[not (contains(@class,'glide__slide--clone'))]//a")
	private List<WebElement> videoSliderArticleRevAmpLnk;

	/* Video slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'टॉप वीडियो')]/ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//button")
	private List<WebElement> videoSliderRevAmpLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement videoRevAmpBreadcrumb;

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
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[contains(.,'लाइफ़')]/a")
	private WebElement lifestyleSectionRevAmpLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='लाइफ़')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> lifestyleSectionArticleRevAmpLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='लाइफ़')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> lifestyleSectionImgRevAmpLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='लाइफ़')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreLifestyleSectionRevAmpLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement lifestyleRevAmpBreadcrumb;

	//---------Dharm
	/* Dharm section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='धर्म')]/a")
	private WebElement dharmSectionRevAmpLnk;

	/* Dharm section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='धर्म')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> dharmSectionArticleRevAmpLnk;

	/* Dharm section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='धर्म')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> dharmSectionImgRevAmpLnk;

	/* Dharm section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='धर्म')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreDharmSectionRevAmpLnk;

	/*Dharm present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement dharmRevAmpBreadcrumb;

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='देश')]/a")
	private WebElement nationSectionRevAmpLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='देश')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> nationSectionArticleRevAmpLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='देश')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> nationSectionImgRevAmpLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='देश')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreNationSectionRevAmpLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement nationRevAmpBreadcrumb;

	//---------world
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='दुनिया')]/a")
	private WebElement worldSectionRevAmpLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='दुनिया')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> worldSectionArticleRevAmpLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='दुनिया')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> worldSectionImgRevAmpLnk;

	/* world section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='दुनिया')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreWorldSectionRevAmpLnk;

	/*Breadcrumb present in world article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement worldRevAmpBreadcrumb;

	//---------knowledge
	/* Knowledge section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='नॉलेज')]/a")
	private WebElement knowledgeSectionRevAmpLnk;

	/* Knowledge section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='नॉलेज')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> knowledgeSectionArticleRevAmpLnk;

	/* Knowledge section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='नॉलेज')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> knowledgeSectionImgRevAmpLnk;

	/* Knowledge section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='नॉलेज')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreKnowledgeSectionRevAmpLnk;

	/*Breadcrumb present in Knowledge article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement knowledgeRevAmpBreadcrumb;


	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='करियर')]/a")
	private WebElement careerSectionLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='करियर')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> careerSectionArticleLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='करियर')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> careerSectionImgLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='करियर')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreCareerSectionLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement careerBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='क्राइम')]/a")
	private WebElement crimeSectionLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='क्राइम')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li//a")
	private List<WebElement> crimeSectionArticleLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='क्राइम')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//img")
	private List<WebElement> crimeSectionImgLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='क्राइम')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div/a")
	private WebElement readMoreCrimeSectionLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement crimeBreadcrumb;


	//-----blog
	/* Blog section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='ब्लॉग')]/a")
	private WebElement blogSectionRevAmpLnk;

	/* Journalist profile link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='ब्लॉग')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li[not (contains(@class,'glide__slide--clone'))]/a[1]")
	private List<WebElement> journalistProfileRevAmpLnk;

	/* Journalist Article link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='ब्लॉग')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//li[not (contains(@class,'glide__slide--clone'))]/a[2]")
	private List<WebElement> journalistArticleRevAmpLnk;

	/*Journalist Image link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newblogsection-home-slider')]//figure/parent::a//div[contains(@style,'display: inline-block')]/img")
	private List<WebElement> journalistImgRevAmpLnk;

	/*Breadcrumb present in journalist page*/
	@FindBy(xpath ="//div[contains(@class,'brd')] | //div[contains(@class,'bread')]  | //ul[contains(@class, 'bread')]")
	private WebElement blogRevAmpBreadcrumb;

	/* Blog section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='ब्लॉग')]//ancestor::div[contains(@class,'newglblhd')]/a")
	private WebElement readMoreBlogSectionRevAmpLnk;

	/* Blog slider present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhd')]//h2[(.='ब्लॉग')]//ancestor::div[contains(@class,'newglblhd')]/following-sibling::div//button")
	private List<WebElement> blogSliderRevAmpLnk;


	/* Mobile Tech title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]//h2/a[contains(@href,'/tech/')]")
	private WebElement mobileTechTitleRevAmpLnk;



	//===============================common Business Logics=======================================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Latest Section widget present on line one section.
	 */
	public void clickOnLineOneLatestSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneLatestSectionELe);
		webDriverActions.clickJS(lineOneLatestSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneMoneyLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneMoneySectionELe);
		webDriverActions.clickJS(lineOneMoneySectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on food widget present on line one section.
	 */
	public void clickOnLineOneFoodLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneFoodSectionELe);
		webDriverActions.clickJS(lineOneFoodSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Entertainment widget present on line one section.
	 */
	public void clickOnLineOneEntertainmentLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneEntertainmentSectionELe);
		webDriverActions.clickJS(lineOneEntertainmentSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Entertainment widget present on line one section.
	 */
	public void clickOnLineOnePhotoLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOnePhotoSectionELe);
		webDriverActions.clickJS(lineOnePhotoSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on career widget present on line one section.
	 */
	public void clickOnLineOneCareerLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneCareerSectionELe);
		webDriverActions.clickJS(lineOneCareerSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void clickOnLineOneCricketLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneCricketSectionELe);
		webDriverActions.clickJS(lineOneCricketSectionELe);
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
		webDriverActions.softHighlightElement(lineOneLifeStyleSectionELe);
		webDriverActions.clickJS(lineOneLifeStyleSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Health widget present on line one section.
	 */
	public void clickOnLineOneHealthLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneHealthSectionELe);
		webDriverActions.clickJS(lineOneHealthSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Knowledge widget present on line one section.
	 */
	public void clickOnLineOneKnowledgeLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneKnowledgeSectionELe);
		webDriverActions.clickJS(lineOneKnowledgeSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Latest Mobile widget present on line one section.
	 */
	public void clickOnLineOneLatestMobileLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneLatestMobileSectionELe);
		webDriverActions.clickJS(lineOneLatestMobileSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on States widget present on line one section.
	 */
	public void clickOnLineOneStatesLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneStatesSectionELe);
		webDriverActions.clickJS(lineOneStatesSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Podcast widget present on line one section.
	 */
	public void clickOnLineOnePodcastLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOnePodcastSectionELe);
		webDriverActions.clickJS(lineOnePodcastSectionELe);
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
		webDriverActions.softHighlightElement(lineOneWorldSectionELe);
		webDriverActions.clickJS(lineOneWorldSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneAstrologyLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneAstrologySectionELe);
		webDriverActions.clickJS(lineOneAstrologySectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneNews18MinisLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneNews18MinisSectionELe);
		webDriverActions.clickJS(lineOneNews18MinisSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneSahityaLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneSahityaSectionELe);
		webDriverActions.clickJS(lineOneSahityaSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneNationLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneNationSectionELe);
		webDriverActions.clickJS(lineOneNationSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneCrimeLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneCrimeSectionELe);
		webDriverActions.clickJS(lineOneCrimeSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneLiveTvLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneLiveTvSectionELe);
		webDriverActions.clickJS(lineOneLiveTvSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void clickOnLineOneCartoonCornerLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softHighlightElement(lineOneCartoonCornerSectionELe);
		webDriverActions.clickJS(lineOneCartoonCornerSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void clickOnAutoLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.scrollToPoint(0, 650);
		webDriverActions.continuousScrollTillElement(autoSectionELe, 40);
		webDriverActions.softWaitForElementVisibility(autoSectionELe, 10);
		webDriverActions.softHighlightElement(autoSectionELe);
		webDriverActions.clickJS(autoSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void navigateToDharmLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.navigateToUrl(webDriverActions.getCurrentPageUrl()+"dharm/");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void navigateToBlogsLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.navigateToUrl(webDriverActions.getCurrentPageUrl()+"blogs/");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void navigateToVideoLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.navigateToUrl(webDriverActions.getCurrentPageUrl()+"videos/");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to navigate jobs widget present on line one section.
	 */
	public void navigateToJobsLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.navigateToUrl(webDriverActions.getCurrentPageUrl()+"jobs/");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to navigate Tech Section present on line one section.
	 */
	public void navigateToTechLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.navigateToUrl(webDriverActions.getCurrentPageUrl()+"tech/");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the RHS section
	 */
	public void verifyTitleNavigation(String serverType,WebElement title) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(50);
		//		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		webDriverActions.mouseHover(title);
		String actual=webDriverActions.getAttribute("href", title);
		webDriverActions.softClickJS(title);
		String currentPage = webDriverActions.getCurrentPageUrl();
		String expected = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		int response = genericUtility.checkLinks(currentPage);
		Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
		boolean status=genericUtility.compareUrlSub(actual, expected);
		softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
		softAssert.assertAll(" Issues found in ");

	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of section
	 */
	public void verifyArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(50);;
		//		webDriverActions.continuousScrollTillElement(title, 50);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */ 
		for(int j=0;j<1;j++) {
			webDriverActions.softHighlightElement(articlesLinks.get(j));
			webDriverActions.mouseHover(articlesLinks.get(j));
			String actual=webDriverActions.getAttribute("href", articlesLinks.get(j));
			webDriverActions.softClickJS(articlesLinks.get(j));
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expected = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preprod")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage = betaUrl;
			}
			int response = genericUtility.checkLinks(currentPage);
			Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
			boolean statusCP=genericUtility.compareUrlSub(actual, expected);
			softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
			if (currentPage.equalsIgnoreCase(expected)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues found in ");
	}



	/**
	 * @author DanishR
	 * @param serverType
	 * This metod is used to click on Read more button of section
	 */
	public void verifyReadMoreNavigation(String serverType,WebElement title, WebElement morelink) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(50);
		//		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		webDriverActions.softScrollToElement(morelink);
		String actual=webDriverActions.getAttribute("href", morelink);
		webDriverActions.softClickJS(morelink);
		String currentPage = webDriverActions.getCurrentPageUrl();
		String expected = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		int response = genericUtility.checkLinks(currentPage);
		Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
		boolean status=genericUtility.compareUrlSub(actual, expected);
		softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
		softAssert.assertAll("Issues found in ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of section
	 */
	public void verifySlidingArticlesNavigation(String serverType,WebElement title,WebElement articleActiveLink,List<WebElement> buttonLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(50);
		//		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		Assert.assertTrue(buttonLinks.size()>0," Possibily no articles found or size is " +buttonLinks.size()+" "+webDriverActions.getCurrentPageUrl());
		/* Below loop will fetch list of articles and navigate to each one by one */ 
		for(int j=0;j<buttonLinks.size();j++) {
			webDriverActions.softIsElementDisplayed(buttonLinks.get(j), 2);
			webDriverActions.softHighlightElement(buttonLinks.get(j));
			webDriverActions.softMouseHover(buttonLinks.get(j));
			webDriverActions.softClickJS(buttonLinks.get(j));
			webDriverActions.softIsElementDisplayed(articleActiveLink, 2);
			webDriverActions.softHighlightElement(articleActiveLink);
			webDriverActions.softMouseHover(articleActiveLink);
			String actualCP=webDriverActions.getAttribute("href", articleActiveLink);
			webDriverActions.softClickJS(articleActiveLink);
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
				softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
			}
			if (currentCPPage.equalsIgnoreCase(expectedCP)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
		}
		softAssert.assertAll("Issues found in ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of section
	 */
	public void verifyPhotoSliderArticlesNavigation(String serverType,WebElement title,WebElement articleActiveLink,List<WebElement> buttonLinks,List<WebElement> tabLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.mobileScroll(50);
		//		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		softAssert.assertTrue(tabLinks.size()>0," Possibily no articles found or size is " +buttonLinks.size()+" "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < tabLinks.size(); i++) {
			webDriverActions.softIsElementDisplayed(tabLinks.get(i), 2);
			webDriverActions.softHighlightElement(tabLinks.get(i));
			webDriverActions.softMouseHover(tabLinks.get(i));
			webDriverActions.softClickJS(tabLinks.get(i));
			Assert.assertTrue(buttonLinks.size()>0," Possibily no articles found or size is " +buttonLinks.size()+" "+webDriverActions.getCurrentPageUrl());
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int j=0;j<buttonLinks.size();j++) {
				webDriverActions.softIsElementDisplayed(buttonLinks.get(j), 2);
				webDriverActions.softHighlightElement(buttonLinks.get(j));
				webDriverActions.softMouseHover(buttonLinks.get(j));
				webDriverActions.softClickJS(buttonLinks.get(j));
				webDriverActions.softIsElementDisplayed(articleActiveLink, 2);
				webDriverActions.softHighlightElement(articleActiveLink);
				webDriverActions.softMouseHover(articleActiveLink);
				String actualCP=webDriverActions.getAttribute("href", articleActiveLink);
				webDriverActions.softClickJS(articleActiveLink);
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
					softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
				}
				if (currentCPPage.equalsIgnoreCase(expectedCP)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}
				webDriverActions.softHighlightElement(tabLinks.get(i));
				webDriverActions.softMouseHover(tabLinks.get(i));
				webDriverActions.softClickJS(tabLinks.get(i));
			}
		}
		softAssert.assertAll("Issues found in Photo section ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Naukri section Title and navigate
	 */
	public void verifyJobHeadlineNavigation(String serverType) {
		verifyTitleNavigation(serverType,jobHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Naukri section Articles and navigate
	 */
	public void verifyJobArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,jobHeadline,jobArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Naukri section ReadMore and navigate
	 */
	public void verifyJobReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,jobHeadline,jobReadmoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Duniya section Title and navigate
	 */
	public void verifyDuniyaHeadlineNavigation(String serverType) {
		verifyTitleNavigation(serverType,duniyaHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Duniya section Articles and navigate
	 */
	public void verifyDuniyaArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,duniyaHeadline,duniyaArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Duniya section ReadMore and navigate
	 */
	public void verifyDuniyaReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,duniyaHeadline,duniyaReadmoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on HealthFitness section Title and navigate
	 */
	public void verifyHealthFitnessHeadlineNavigation(String serverType) {
		verifyTitleNavigation(serverType,healthAndFitnessHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on HealthFitness section Articles and navigate
	 */
	public void verifyHealthFitnessArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,healthAndFitnessHeadline,healthAndFitnessArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on HealthFitness section ReadMore and navigate
	 */
	public void verifyHealthFitnessReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,healthAndFitnessHeadline,healthAndFitnessReadmoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on AjabGajab section Title and navigate
	 */
	public void verifyAjabGajabHeadlineNavigation(String serverType) {
		verifyTitleNavigation(serverType,ajabGajabHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on AjabGajab section Articles and navigate
	 */
	public void verifyAjabGajabArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,ajabGajabHeadline,ajabGajabArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on AjabGajab section ReadMore and navigate
	 */
	public void verifyAjabGajabReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,ajabGajabHeadline,ajabGajabReadmoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Auto section Title and navigate
	 */
	public void verifyAutoHeadlineNavigation(String serverType) {
		verifyTitleNavigation(serverType,autoSectionHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Auto section Articles and navigate
	 */
	public void verifyAutoArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,autoSectionHeadline,autoArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Auto section ReadMore and navigate
	 */
	public void verifyAutoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,autoSectionHeadline,autoReadmore);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Cartoon Title and navigate
	 */
	public void verifyCartoonTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType, cartoonTitle);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Cartoon section Articles and navigate
	 */
	public void verifyCartoonArticleNavigation(String serverType) {
		verifySlidingArticlesNavigation(serverType, cartoonTitle, cartoonActiveArticleLnk, cartoonSliderButtonLnk);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Cartoon ReadMore Link and navigate
	 */
	public void verifyCartoonReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType, cartoonTitle,cartoonReadMore);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Food Title and navigate
	 */
	public void verifyFoodTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType, foodTitle);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Food section Articles and navigate
	 */
	public void verifyFoodArticleNavigation(String serverType) {
		verifySlidingArticlesNavigation(serverType, foodTitle, foodActiveArticleLnk, foodSliderButtonLnk);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Food ReadMore Link and navigate
	 */
	public void verifyFoodReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType, foodTitle,foodReadMore);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Photo Title and navigate
	 */
	public void verifyPhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType, photoTitle);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Photo section Articles and navigate
	 */
	public void verifyPhotoArticleNavigation(String serverType) {
		verifyPhotoSliderArticlesNavigation(serverType, photoTitle, photoActiveArticleLnk, photoSliderButtonLnk,photoTabLnk);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Photo ReadMore Link and navigate
	 */
	public void verifyPhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType, photoTitle,photoReadMore);
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
		webDriverActions.continuousScrollTillAllElement(artList, 15);
		webDriverActions.waitForSecond(1000);
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actual =	webDriverActions.getAttribute("href", artList.get(i));
			webDriverActions.softClickJS(artList.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(artList.get(i));
				webDriverActions.softScrollToElement(artList.get(i));
				actual = webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(artList.get(i));
				webDriverActions.waitForPageToLoad();
			}
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
			softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
			// // webDriverActions.navigateToUrl(homeUrl);
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
	public void verifyImageNavigation(String serverType , List<WebElement> imgList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(imgList, 15);
		for(int i=0; i<imgList.size() ;i++)
		{
			webDriverActions.softMouseHover(imgList.get(i));
			webDriverActions.softScrollToElement(imgList.get(i));
			String actual =	webDriverActions.getAttribute("src", imgList.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.softHighlightElement(imgList.get(i));
			webDriverActions.softClickJS(imgList.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softMouseHover(imgList.get(i));
				webDriverActions.softScrollToElement(imgList.get(i));
				actual = webDriverActions.getAttribute("href", imgList.get(i));
				webDriverActions.softClickJS(imgList.get(i));
				webDriverActions.waitForPageToLoad();
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
			webDriverActions.waitForPageToLoad();
			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element in "+currentPage);
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
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
	public void verifyMoreNewsNavigation(String serverType , WebElement moreLnk , WebElement element) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 15);
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moreLnk), "Possibly Read More Link is Not Visibale");
		String actual = webDriverActions.getAttribute("href", moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForPageToLoad();
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
		webDriverActions.highlightElement(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in "+currentPage);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(element);
		webDriverActions.softMouseHover(element);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element), "Possibly Title Link is Not Visible ");
		String actual = webDriverActions.getAttribute("href", element);
		webDriverActions.softClickJS(element);
		webDriverActions.waitForPageToLoad();
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
		softAssert.assertAll("Issue in Homepage Body ");
	}



	public void verifyRelatedNewsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(relatedNewsLnk, 10);
		for(int i=0; i<relatedNewsLnk.size() ; i++)
		{
			webDriverActions.softScrollToElement(relatedNewsLnk.get(i));
			webDriverActions.softMouseHover(relatedNewsLnk.get(i));
			webDriverActions.softClickJS(relatedNewsLnk.get(i));
			webDriverActions.waitForSecond(2000);
			for(int j=0 ;j< activeRelatedNewsLnk.size() ; j++)
			{
				webDriverActions.scrollToElement(activeRelatedNewsLnk.get(j));
				webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
				webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
				webDriverActions.waitForPageToLoad();
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeRelatedNewsLnk.get(j));
					webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
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
				webDriverActions.softHighlightElement(articleHeaderTxt);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt), "Unable to Display Element in "+currentPage);
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

	//-----News18HindiPlus----//

	public void verifyNews18HindiPlusArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18HindiPlusArticleLnk, articleHeaderTxt);
	}

	public void verifyNews18HindiPlusImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, news18HindiPlusImgLnk, articleHeaderTxt);
	}

	public void verifyNews18HindiPlusTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , news18HindiPlusTitleLnk , articleBreadCrumbDiv);
	}

	public void verifyNews18HindiPlusReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , news18HindiPlusReadMoreLnk , articleBreadCrumbDiv);
	}


	public void checkLinks(String links)  {
		//		SoftAssert softAssert = new SoftAssert();
		try {
			String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8

			HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
			httpUrlConnection.connect();
			int responseCode = httpUrlConnection.getResponseCode();
			Logs.info(getClass(), responseCode + "--------------- "  +links);
			softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
		}
		catch (Exception e) {
			Logs.error(getClass(), "Unable to fetch the link response ", e );
		} 
	}

	public void verifyCricketDhamalNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(cricketDhamalImgLnk ,5);
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
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyBollywoodTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 10);
		if(bollywoodTabLnk.size()>0)
		{
			webDriverActions.softScrollToElement(bollywoodTabLnk.get(0));
			webDriverActions.softMouseHover(bollywoodTabLnk.get(0));
			for(int j =0 ; j<bollywoodTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 10);
				webDriverActions.softHighlightElement(bollywoodTabLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
				for(int i=0; i<bollywoodArticleLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(bollywoodArticleLnk, 10);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bollywoodArticleLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", bollywoodArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(bollywoodArticleLnk.get(i));
					webDriverActions.waitForSecond(1000);
					String currentPage =webDriverActions.getCurrentPageUrl();
					Logs.info(getClass(), currentPage);
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else 
					{
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					int response = genericUtility.checkLinks(currentPage);
					softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
					softAssert.assertTrue(genericUtility.compareUrlSub(actual, currentPage), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 10);
					webDriverActions.softClickJS(bollywoodTabLnk.get(j));
					webDriverActions.waitForSecond(1000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 20);
		if(bollywoodTabLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bollywoodTabLnk.get(0));
			webDriverActions.softMouseHover(bollywoodTabLnk.get(0));
			for(int j =0 ; j<bollywoodTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 20);
				webDriverActions.softHighlightElement(bollywoodTabLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabLnk.get(j));
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(bollywoodImgLnk.size()>0, "Possibly Article Size is Not Visible in Bollywood Tabs");
				for(int i=0; i<bollywoodImgLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 20);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(bollywoodImgLnk.get(i));
					webDriverActions.softScrollToElement(bollywoodImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", bollywoodImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClick(bollywoodImgLnk.get(i));
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
					softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
					softAssert.assertTrue(genericUtility.compareUrlSub(actual, currentPage), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(bollywoodImgLnk, 10);
					webDriverActions.softClickJS(bollywoodTabLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+bollywoodTabLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 10);
		if(bollywoodTabLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<bollywoodTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(bollywoodTabLnk, 20);
				webDriverActions.softMouseHover(bollywoodTabLnk.get(j));
				webDriverActions.softHighlightElement(bollywoodTabLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
				String actual = webDriverActions.getAttribute("href", bollywoodReadMoreLnk);
				webDriverActions.softClickJS(bollywoodReadMoreLnk);
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.softHighlightElement(bollywoodTabLnk.get(j));
				webDriverActions.softClickJS(bollywoodTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

		//		verifyMoreNewsNavigation(serverType , rebollywoodReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyBollywoodTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , bollywoodTitleLnk , articleBreadCrumbDiv);
	}


	public void verifyLatestMobileNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , latestMobileNewsArticleLnk, articleHeaderTxt);
	}

	public void verifyLatestMobileNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , latestMobileNewsImgLnk, articleHeaderTxt);
	}

	public void verifyLatestMobileMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , latestMobileNewsReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyMobileBrandsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , mobileBrandsLnk, articleBreadCrumbDiv);
	}

	public void verifyTrendingAndRecommendedSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(trendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Tab is Not Visible");
		webDriverActions.softHighlightElement(trendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(trendingAndRecommendedMobileTabLnk);

		if(trendindAndRecommendedSlider.size()>0)
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
			softAssert.fail("Possibly Trending and Recommended Mobile Slider  is Not Visible ");
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyTrendingAndRecommendedStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(trendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible");
		webDriverActions.softHighlightElement(trendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(trendingAndRecommendedMobileTabLnk);
		if(trendindAndRecommendedStoriesLnk.size()>0)
		{
			for(int i=0; i<trendindAndRecommendedStoriesLnk.size() ;i++)
			{
				String actual =	webDriverActions.getAttribute("href", trendindAndRecommendedStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(trendindAndRecommendedStoriesLnk.get(i));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.waitForSecond(2000);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Poosibly Page Content is Not Visible in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillElement(trendingAndRecommendedMobileTabLnk, 10);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible");
				webDriverActions.softHighlightElement(trendingAndRecommendedMobileTabLnk);
				webDriverActions.softClickJS(trendingAndRecommendedMobileTabLnk);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTrendingAndRecommendedMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(trendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(trendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible");
		webDriverActions.softHighlightElement(trendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(trendingAndRecommendedMobileTabLnk);
		if(trendindAndRecommendedReadMoreLnk.size()>1)
		{
			for(int i=0; i<trendindAndRecommendedReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(trendindAndRecommendedReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(trendindAndRecommendedReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", trendindAndRecommendedReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(trendindAndRecommendedReadMoreLnk.get(i));
				webDriverActions.waitForSecond(2000);
				String currentPage =webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				webDriverActions.waitForSecond(1000);
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Poosibly Page Content is Not Visible in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillElement(trendingAndRecommendedMobileTabLnk, 10);
				webDriverActions.softHighlightElement(trendingAndRecommendedMobileTabLnk);
				webDriverActions.softClickJS(trendingAndRecommendedMobileTabLnk);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Trending and Recommended Mobile Read More Links is Not Visible ");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyUpcomingMobileSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(soonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(soonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible");
		webDriverActions.softHighlightElement(soonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(soonUpcomingMobileTabLnk);
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
			softAssert.fail("Possibly Soon Upcoming Mobile Slider Button is Not Visible");
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyUpcomingMobileStoriesNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(soonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(soonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible");
		webDriverActions.softHighlightElement(soonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(soonUpcomingMobileTabLnk);
		if(upcomingMobileStoriesLnk.size()>1)
		{
			for(int i=0; i<upcomingMobileStoriesLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(upcomingMobileStoriesLnk.get(i));
				webDriverActions.softScrollToElement(upcomingMobileStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", upcomingMobileStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(upcomingMobileStoriesLnk.get(i));
				webDriverActions.waitForSecond(2000);
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
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Poosibly Page Content is Not Visible in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(soonUpcomingMobileTabLnk, 10);
				webDriverActions.softHighlightElement(soonUpcomingMobileTabLnk);
				webDriverActions.softClickJS(soonUpcomingMobileTabLnk);
			}
		}
		else
		{
			softAssert.fail("Possibly Soon Upcoming Mobile Article Link is Not Visible");
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyUpcomingMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(soonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(soonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible");
		webDriverActions.softHighlightElement(soonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(soonUpcomingMobileTabLnk);
		if(upcomingMobileReadMoreLnk.size()>1)
		{
			for(int i=0; i<upcomingMobileReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(upcomingMobileReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(upcomingMobileReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", upcomingMobileReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(upcomingMobileReadMoreLnk.get(i));
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
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Poosibly Page Content is Not Visible in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(soonUpcomingMobileTabLnk, 10);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(soonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible");
				webDriverActions.softHighlightElement(soonUpcomingMobileTabLnk);
				webDriverActions.softClickJS(soonUpcomingMobileTabLnk);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyArticleBannerNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, articleBannerLnk, articleHeaderTxt);
	}


	public void verifyNews18MinisImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, news18MinisImgLnk, articleBreadCrumbDiv);
	}

	public void verifyNews18MinisWorldOfNewsNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(worldOfNewsLnk, 20);
		webDriverActions.softClickJS(worldOfNewsLnk);
		webDriverActions.waitForSecond(2000);
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

	public void verifyNews18MinisTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , news18MinisTitleLnk , articleBreadCrumbDiv);
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
			webDriverActions.waitForSecond(2000);
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
			webDriverActions.softHighlightElement(articleBreadCrumbDiv);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Poosibly Page Content is Not Visible in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 10);
		if(moneyTabLnk.size()>1)
		{
			webDriverActions.softScrollToElement(moneyTabLnk.get(0));
			webDriverActions.softMouseHover(moneyTabLnk.get(0));
			for(int j =0 ; j<moneyTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 10);
				webDriverActions.softHighlightElement(moneyTabLnk.get(j));
				webDriverActions.softClickJS(moneyTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
				for(int i=0; i<moneyArticleLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(moneyArticleLnk, 10);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(moneyArticleLnk.get(i));
					webDriverActions.softScrollToElement(moneyArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", moneyArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(moneyArticleLnk.get(i));
					webDriverActions.waitForSecond(1000);
					String currentPage =webDriverActions.getCurrentPageUrl();
					Logs.info(getClass(), currentPage);
					String expectedUrl = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else 
					{
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					int response = genericUtility.checkLinks(currentPage);
					softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
					softAssert.assertTrue(genericUtility.compareUrlSub(actual, currentPage), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 10);
					webDriverActions.softClickJS(moneyTabLnk.get(j));
					webDriverActions.waitForSecond(1000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(moneyImgLnk, 20);
		if(moneyTabLnk.size()>1)
		{
			webDriverActions.softScrollToElement(moneyTabLnk.get(0));
			webDriverActions.softMouseHover(moneyTabLnk.get(0));
			for(int j =0 ; j<moneyTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 20);
				webDriverActions.softHighlightElement(moneyTabLnk.get(j));
				webDriverActions.softClickJS(moneyTabLnk.get(j));
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(moneyImgLnk.size()>0, "Possibly Article Size is Not Visible in money Tabs");
				for(int i=0; i<moneyImgLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(moneyImgLnk, 20);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(moneyImgLnk.get(i));
					webDriverActions.softScrollToElement(moneyImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", moneyImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(moneyImgLnk.get(i));
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
					softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
					//						softAssert.assertTrue(genericUtility.compareUrlSub(actual, currentPage), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(moneyImgLnk, 10);
					webDriverActions.softClickJS(moneyTabLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+moneyTabLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 10);
		if(moneyTabLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<moneyTabLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(moneyTabLnk, 20);
				webDriverActions.softMouseHover(moneyTabLnk.get(j));
				webDriverActions.softHighlightElement(moneyTabLnk.get(j));
				webDriverActions.softClickJS(moneyTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
				String actual = webDriverActions.getAttribute("href", moneyReadMoreLnk);
				webDriverActions.softClickJS(moneyReadMoreLnk);
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.softHighlightElement(moneyTabLnk.get(j));
				webDriverActions.softClickJS(moneyTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , moneyTitleLnk , articleBreadCrumbDiv);
	}

	public void verifyMoneyBannerNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moneyTitleLnk, 10);
		webDriverActions.softClickJS(moneyControlLnk);
		//			webDriverActions.switchToNewWindow();
		String currentUrl=webDriverActions.getCurrentPageUrl();
		if(currentUrl.contains("google_vignette") || currentUrl.contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.continuousScrollTillElement(moneyControlLnk, 10);
			webDriverActions.softClickJS(moneyControlLnk);
			//				webDriverActions.switchToNewWindow();
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moneyControlLogoLnk), "Possibly Element Is Not Visible For This URL "+currentUrl);
		softAssert.assertAll("Issue Found in Homepage Body");
	}




	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on Super Hit Gallery Title in the Hindi Home page of mobile view
	 */

	public void verifySuperHitGalleryTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryHeadline);
		webDriverActions.softHighlightElement(superHitGalleryHeadline);
		webDriverActions.clickJS(superHitGalleryHeadline);
		webDriverActions.softClickJS(superHitGalleryHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element in "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on SuperHitGalleryReadmore Title in the Hindi Home page of mobile view
	 */
	public void verifySuperHitGalleryReadmore(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryReadmore);
		webDriverActions.softHighlightElement(superHitGalleryReadmore);
		webDriverActions.clickJS(superHitGalleryHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage = betaUrl;
		}
		else {
			Logs.info(getClass(), "Navigated to "+currentPage);
		}
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element in "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to click on SuperHitGalleryArticleLnk Title in the Hindi Home page of mobile view
	 */
	public void verifySuperHitGalleryArticleLnk(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(superHitGalleryHeadline);

		if(superHitGalleryArticleLink.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<superHitGalleryArticleLink.size();i++)
			{  
				webDriverActions.softMouseHover(superHitGalleryArticleLink.get(i));
				webDriverActions.softClickJS(superHitGalleryArticleLink.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(superHitGalleryArticleLink.get(i));
					webDriverActions.softScrollToElement(superHitGalleryArticleLink.get(i));
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(superHitGalleryArticleLink.get(i));
				}
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(superHitGalleryBreadcrum),"Unable to display Element in "+currentPage);
				Logs.info(getClass(),"Clicked Latest News articles link");
				webDriverActions.waitForPageToLoad();
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
			softAssert.fail("Possibly Element is Not Visible Or Size is "+superHitGalleryArticleLink.size());
		}
		softAssert.assertAll("Issues found in this url "); 
	}

	public void verifyBodyKhelTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodySportsTabLnk, 20);
		softAssert.assertTrue(bodySportsTabLnk.size()>0 , "Possibly Body Khel Tabs is Not Visible");
		webDriverActions.waitForSecond(1000);
		for(int j =0 ; j<bodySportsTabLnk.size() ; j++)
		{
			webDriverActions.softScrollToElement(bodySportsTabLnk.get(j));
			webDriverActions.softMouseHover(bodySportsTabLnk.get(j));
			webDriverActions.softHighlightElement(bodySportsTabLnk.get(j));
			webDriverActions.softClickJS(bodySportsTabLnk.get(j));
			webDriverActions.waitForSecond(1000);
			softAssert.assertTrue(bodySportsArticleLnk.size()>0, "Possibly Body Khel Articles is Not Visible");
			for(int i=0; i<bodySportsArticleLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(bodySportsArticleLnk.get(i));
				webDriverActions.softScrollToElement(bodySportsArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", bodySportsArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(bodySportsArticleLnk.get(i));
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
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in "+currentPage);;
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillAllElement(bodySportsTabLnk, 10);
				webDriverActions.softScrollToElement(bodySportsTabLnk.get(j));
				webDriverActions.softMouseHover(bodySportsTabLnk.get(j));
				webDriverActions.softHighlightElement(bodySportsTabLnk.get(j));
				webDriverActions.softClickJS(bodySportsTabLnk.get(j));
				webDriverActions.waitForSecond(1000);

			}
		}

		softAssert.assertAll("Issue Found in Homepage Body ");
	}


	public void verifyBodyKhelTabsImageNavigation(String serverType )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodySportsTabLnk, 20);
		softAssert.assertTrue(bodySportsTabLnk.size()>0 , "Possibly Body Khel Tabs is Not Visible");
		webDriverActions.softScrollToElement(bodySportsTabLnk.get(0));
		webDriverActions.softMouseHover(bodySportsTabLnk.get(0));
		webDriverActions.waitForSecond(1000);
		for(int j =0 ; j<bodySportsTabLnk.size() ; j++)
		{
			webDriverActions.softHighlightElement(bodySportsTabLnk.get(j));
			webDriverActions.softClickJS(bodySportsTabLnk.get(j));
			for(int i=0; i<bodySportsImgLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(bodySportsImgLnk.get(i));
				webDriverActions.softScrollToElement(bodySportsImgLnk.get(i));
				String actual =	webDriverActions.getAttribute("src", bodySportsImgLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(bodySportsImgLnk.get(i));
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
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt) , "Unable to Display Element in "+currentPage);;
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillElement(bodySportsTabLnk.get(j) , 5);
				webDriverActions.softClickJS(bodySportsTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(bodySportsTabLnk, 20);
		if(bodySportsTabLnk.size()>1)
		{
			webDriverActions.softScrollToElement(bodySportsTabLnk.get(0));
			webDriverActions.softMouseHover(bodySportsTabLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<bodySportsTabLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(bodySportsTabLnk.get(j));
				webDriverActions.softClickJS(bodySportsTabLnk.get(j));
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(bodySportsReadMoreLnk);
				String actual = webDriverActions.getAttribute("href", bodySportsReadMoreLnk);
				webDriverActions.softClickJS(bodySportsReadMoreLnk);
				webDriverActions.waitForPageToLoad();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display to Element in "+currentPage);
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// // webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillElement(bodySportsTabLnk.get(j) , 5);
				webDriverActions.softClickJS(bodySportsTabLnk.get(j));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	/**
	 * @author DanishR
	 * This method is used to verify mobile tech section title present on HomePage
	 */
	public void verifyMobileTechTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType, mobileTechTitleLnk, articleBreadCrumbDiv);
	}

	/**
	 * @author DanishR
	 * This method is used to verify mobile tech section article present on HomePage
	 */
	public void verifyMobileTechArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(mobileTechArticleLnk, 10);
		webDriverActions.scrollToElement(mobileTechReadMoreLnk);
		webDriverActions.softMouseHover(mobileTechReadMoreLnk);
		softAssert.assertTrue(mobileTechTabLnk.size()>0, "Possibly Mobile Tech Tabs is Not Visible ");
		for (int i = 0; i < mobileTechTabLnk.size();i++) {
			webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
			webDriverActions.softHighlightElement(mobileTechTabLnk.get(i));
			webDriverActions.softClickJS(mobileTechTabLnk.get(i));
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(mobileTechArticleLnk.size()>0, "Possibly Mobile Tech Article is Not Visible ");
			for (int j = 0; j < mobileTechArticleLnk.size();j++) {
				webDriverActions.softMouseHover(mobileTechArticleLnk.get(j));
				String actual = webDriverActions.getAttribute("href", mobileTechArticleLnk.get(j));
				webDriverActions.softClickJS(mobileTechArticleLnk.get(j));
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
				String expectedUrl = webDriverActions.getCurrentPageUrl();
				if (serverType.equalsIgnoreCase("preprod")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage = betaUrl;
				}
				else {
					Logs.info(getClass(), "Navigated to "+currentPage);
				}
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv)," Possibly element is not visible "+currentPage);
				webDriverActions.navigateBack();
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
				webDriverActions.softClickJS(mobileTechTabLnk.get(i));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll(" Issues found in Mobile Tech Section Atricles present on Home Page ");
	}

	public void verifyMobileTechReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(mobileTechArticleLnk, 10);
		webDriverActions.scrollToElement(mobileTechReadMoreLnk);
		webDriverActions.softMouseHover(mobileTechReadMoreLnk);
		softAssert.assertTrue(mobileTechTabLnk.size()>0, "Possibly Mobile Tech Tabs is Not Visible ");
		for (int i = 0; i < mobileTechTabLnk.size();i++) {
			webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
			webDriverActions.softHighlightElement(mobileTechTabLnk.get(i));
			webDriverActions.softClickJS(mobileTechTabLnk.get(i));
			webDriverActions.waitForSecond(2000);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(mobileTechReadMoreLnk), "Possibly Mobile Tech Read More Link is Not Visible ");
			webDriverActions.softMouseHover(mobileTechReadMoreLnk);
			String actual = webDriverActions.getAttribute("href", mobileTechReadMoreLnk);
			webDriverActions.softClickJS(mobileTechReadMoreLnk);
			webDriverActions.waitForPageToLoad();
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preprod")) {
				String betaUrl = genericUtility.replaceInUrl(currentPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentPage = betaUrl;
			}
			else {
				Logs.info(getClass(), "Navigated to "+currentPage);
			}
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv)," Possibly element is not visible "+currentPage);
			webDriverActions.navigateBack();
			webDriverActions.waitForSecond(1000);
			webDriverActions.softMouseHover(mobileTechTabLnk.get(i));
			webDriverActions.softClickJS(mobileTechTabLnk.get(i));
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll(" Issues found in Mobile Tech Section Atricles present on Home Page ");

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
			else
			{
				list.add(attribute);
			}
		}
		Logs.info(getClass(),"Total Links "+list.size());
		list.parallelStream().forEach(e -> checkLinks(e));
		softAssert.assertAll("Issue Found in Homepage ");
	}

	public void verifyWebstoriesImageNavigation(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(webstoriesImgLnk, 10);
		if(webstoriesImgLnk.size()>0)
		{
			webDriverActions.softMouseHover(activeWebstoriesImgLnk);
			String title = webDriverActions.getPageTitle();
			for(int i=0; i<webstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
				webDriverActions.softMouseHover(webstoriesImgLnk.get(i));
				webDriverActions.mouseHoverAndClick(webstoriesImgLnk.get(i));
				if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
					webDriverActions.softMouseHover(webstoriesImgLnk.get(i));
					webDriverActions.mouseHoverAndClick(webstoriesImgLnk.get(i));
				}
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
				webDriverActions.softHighlightElement(nextWebStoryBtn);
				webDriverActions.waitForSecond(2000);
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
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
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

	public void verifyWebstoriesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , webstoriesTitleLnk, articleBreadCrumbDiv);
	}

	public void verifyWhatsappBannerNavigation(String serverType)
	{
		//		verifyArticleNavigation(serverType, whatsappBannerLnk, whatsAppHeader);
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(whatsappBannerLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(whatsappBannerLnk) , "Possibly Whatsapp Banner is Not Visible ");
		webDriverActions.softMouseHover(whatsappBannerLnk);
		webDriverActions.softScrollToElement(whatsappBannerLnk);
		String actual = webDriverActions.getAttribute("href", whatsappBannerLnk);
		webDriverActions.softClickJS(whatsappBannerLnk);
		webDriverActions.waitForPageToLoad();
		String currentPage = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(whatsAppHeader), "Possibly Page Content is Not Visible in "+currentPage);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		softAssert.assertTrue((actual.contains(currentPage)), "Possibly not navigate to same page "+actual);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	/*--------------Cricket (Business Libraries)------------------*/

	public void verifyCricketArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , cricketArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , cricketImgLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , cricketReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyCricketTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , cricketTitleLnk, articleBreadCrumbDiv);
	}

	/*--------------Sahitya (Business Libraries)------------------*/

	public void verifySahityaArticleWidget(String server) 
	{
		verifyArticleNavigation(server, sahityaArticleLnk, articleBreadCrumbDiv);
	}

	public void verifySahityaImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , sahityaImgLnk, articleBreadCrumbDiv);
	}

	public void verifySahityaMoreNewsWidget(String server) 
	{
		verifyMoreNewsNavigation(server, sahityaReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifySahityaTitleWidget(String server) 
	{
		verifyTitleNavigation(server, sahityaTitleLnk, articleBreadCrumbDiv);
	}

	/*--------------Priority Panel (Business Libraries)------------------*/

	public void verifyTaazaSamacharArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, tazaSamacharArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTaazaSamacharImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType, tazaSamacharImgLnk, articleBreadCrumbDiv);
	}

	public void verifyTopHindiNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsArticleLnk, articleBreadCrumbDiv);
	}

	public void verifyTopHindiNewsImageNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, topHindiNewsImgLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelMoreNewsNavigation(String server) 
	{
		verifyMoreNewsNavigation(server, priorityPanelReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyPriorityPanelTaazaSamacharTitleNavigation(String server) 
	{
		verifyTitleNavigation(server, tazaSamacharTitleLnk, articleBreadCrumbDiv);
	}
	
	
	// ------------------------- Anupam Business Logic  ---------------------------------------- //

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
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
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

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);			
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(200);
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
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 20);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			Logs.info(getClass(), actualUrl);
			webDriverActions.navigateToNewTab(artList.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				webDriverActions.waitForSecond(2000);
				actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
				Logs.info(getClass(), actualUrl);
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
			}


			webDriverActions.waitForSecond(1000);
			String currentPage = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			//			softAssert.assertEquals(actualUrl, currentPage , "Unable to Navigate "+actualUrl);

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
			webDriverActions.softWaitForElementVisibility(element, 60);
			Logs.info(getClass(), expectedUrl);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigation(String serverType,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 15);		
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

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);		
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
			webDriverActions.waitForSecond(200);
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	
	}

	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigationNewTab(String serverType,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 15);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			//			String actualTitle =	webDriverActions.getAttribute("title", artList.get(i));
			webDriverActions.navigateToNewTab(artList.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();

			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
				webDriverActions.waitForSecond(2000);
				//				actualTitle =	webDriverActions.getAttribute("title", artList.get(i));
				webDriverActions.navigateToNewTab(artList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
			}

			webDriverActions.waitForSecond(1000);
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
			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " on "+currentPage);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(title);
			webDriverActions.waitForSecond(2000);
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}



	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(moreLnk, 12);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.waitForElement(1000);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(moreLnk),"Unable to Display Element "+"\t"+moreLnk+ " in "+homePage);
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

		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		//		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
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
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(section),"Unable to Display Element "+"\t"+section+ " in "+homePage);
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

		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		//		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	//------video
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget
	 */
	public void verifyVideoWidget(String serverType) {
		verifySectionLnks(serverType,videoSectionRevAmpLnk, videoRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	public void verifyVideoWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,videoSectionRevAmpLnk,videoSectionArticleRevAmpLnk, videoRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Image
	 */
	public void verifyVideoWidgetImg(String serverType) {
		verifyImgNavigation(serverType,videoSectionRevAmpLnk,videoSectionImgRevAmpLnk, videoRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	public void verifyMoreVideoLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreVideoSectionRevAmpLnk, videoRevAmpBreadcrumb);
	}


	public void verifyVideoWidgetSliderNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(videoSectionRevAmpLnk, 20);
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);
		webDriverActions.softMouseHover(videoSectionRevAmpLnk);
		webDriverActions.softHighlightElement(videoSectionRevAmpLnk);
		webDriverActions.waitForSecond(2000);
		if(videoSliderArticleRevAmpLnk.size()>0)
		{
			for(int i =1 ; i<videoSliderArticleRevAmpLnk.size()-1;i++)
			{
				webDriverActions.softMouseHover(videoActiveSliderRevAmpLnk);
				String beforeSlide = webDriverActions.getTextFromElement(videoActiveSliderRevAmpLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(videoSliderRevAmpLnk.get(i));
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(videoActiveSliderRevAmpLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Video Section ");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+videoSectionArticleRevAmpLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	//------Lifestyle
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,lifestyleSectionRevAmpLnk, lifestyleRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyLifeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,lifestyleSectionRevAmpLnk,lifestyleSectionArticleRevAmpLnk, lifestyleRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	public void verifyLifeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,lifestyleSectionRevAmpLnk,lifestyleSectionImgRevAmpLnk, lifestyleRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreLifeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreLifestyleSectionRevAmpLnk, lifestyleRevAmpBreadcrumb);
	}


	//----Dharm
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyDharmWidget(String serverType) {
		verifySectionLnks(serverType,dharmSectionRevAmpLnk, dharmRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigationNewTab(serverType,dharmSectionRevAmpLnk,dharmSectionArticleRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	public void verifyDharmWidgetImg(String serverType) {
		verifyImgNavigationNewTab(serverType,dharmSectionRevAmpLnk,dharmSectionImgRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreDharmLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreDharmSectionRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	//----Nation
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget
	 */
	public void verifyNationWidget(String serverType) {
		verifySectionLnks(serverType,nationSectionRevAmpLnk, nationRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	public void verifyNationWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,nationSectionRevAmpLnk,nationSectionArticleRevAmpLnk, nationRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	public void verifyNationWidgetImg(String serverType) {
		verifyImgNavigation(serverType,nationSectionRevAmpLnk,nationSectionImgRevAmpLnk, nationRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreNationLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreNationSectionRevAmpLnk, nationRevAmpBreadcrumb);
	}

	//--------------horoscope--------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate horoscope description for each sign in horoscope section
	 */
	public void verifyHoroscopeDescription(String serverType) {
		webDriverActions.waitForPageToLoad();
		String title = webDriverActions.getPageTitle();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(blogSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(horoscopeSectionLnk, 20);		
		webDriverActions.softMouseHover(horoscopeSectionLnk);
		webDriverActions.softScrollToElement(horoscopeSectionLnk);
		webDriverActions.softHighlightElement(horoscopeSectionLnk);
		softAssert.assertTrue(horoscopeSigns.size()>0, " Possibly Element is Not Visible "+ horoscopeSigns );
		for(int i=0; i<horoscopeSigns.size() ;i++)
		{
			webDriverActions.waitForSecond(2000);
			String horoscopeText = webDriverActions.getAttribute("id",horoscopeSignsTxt.get(i));
			Logs.info(getClass(), horoscopeText);
			webDriverActions.softMouseHover(horoscopeSigns.get(i));
			webDriverActions.navigateToNewTab(horoscopeSigns.get(i));
			webDriverActions.switchToNewWindow();

			webDriverActions.waitForSecond(1000);
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

			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(1000);
			webDriverActions.scrollToPoint(0, 80);
			webDriverActions.softWaitForElementVisibility(horoscopeInfo, 5);
			webDriverActions.softHighlightElement(horoscopeInfo);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(horoscopeInfo) , "Unable to Display description after clicking on "+horoscopeText);
			//			if(webDriverActions.softIsElementDisplayed(horoscopeInfo)) {
			//				Logs.info(getClass(), "horoscope description  : "+webDriverActions.getTextFromElement(horoscopeInfo));
			//			}
			webDriverActions.waitForSecond(1000);
			webDriverActions.closeDriver();
			webDriverActions.waitForSecond(1000);
			webDriverActions.switchToWindow(title);
			if(i==5) {
				webDriverActions.clickJS(horoscopeForwardButton);
			}
		}
		softAssert.assertAll("Issues found in horoscope section home page ");
	}

	//-----blog-------------------
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget
	 */
	public void verifyBlogWidget(String serverType) {
		verifySectionLnks(serverType,blogSectionRevAmpLnk, blogRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	public void verifyBlogWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,blogSectionRevAmpLnk,journalistArticleRevAmpLnk, blogRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	public void verifyMoreBlogLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreBlogSectionRevAmpLnk, blogRevAmpBreadcrumb);
	}


	//----World
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	public void verifyWorldWidget(String serverType) {
		verifySectionLnksBelowMobileTech(serverType,worldSectionRevAmpLnk, worldRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,worldSectionRevAmpLnk,worldSectionArticleRevAmpLnk, worldRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigationBelowMobileTech(serverType,worldSectionRevAmpLnk,worldSectionImgRevAmpLnk, worldRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnksBelowMobileTech(serverType,readMoreWorldSectionRevAmpLnk, worldRevAmpBreadcrumb);
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
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 10);
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

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);			
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
			webDriverActions.waitForSecond(200);
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to verify image navigation of section in home page	
	 * @param section
	 * @param artList
	 */
	public void verifyImgNavigationBelowMobileTech(String serverType,WebElement section ,List<WebElement> artList ,WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 10);		
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

			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			int response = genericUtility.checkLinks(currentPage);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);		
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
			webDriverActions.waitForSecond(200);
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");
	}



	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnksBelowMobileTech(String serverType,WebElement moreLnk, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleRevAmpLnk);
		webDriverActions.continuousScrollTillElement(moreLnk, 12);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.waitForElement(1000);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(moreLnk),"Unable to Display Element "+"\t"+moreLnk+ " in "+homePage);
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

		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		//		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		webDriverActions.navigateBack();
		softAssert.assertAll("Issue Found in HomePage Body More Link");
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
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.softScrollToElement(mobileTechTitleRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 12);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(section),"Unable to Display Element "+"\t"+section+ " in "+homePage);
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

		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		softAssert.assertFalse(currentPage.contains("/amp/"), "Possibly Navigated to AMP Link "+currentPage);
		//		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		webDriverActions.navigateBack();

		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	//----Knowledge
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	public void verifyKnowledgeWidget(String serverType) {
		verifySectionLnksBelowMobileTech(serverType,knowledgeSectionRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	public void verifyKnowledgeWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,knowledgeSectionRevAmpLnk,knowledgeSectionArticleRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	public void verifyKnowledgeWidgetImg(String serverType) {
		verifyImgNavigationBelowMobileTech(serverType,knowledgeSectionRevAmpLnk,knowledgeSectionImgRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	public void verifyMoreKnowledgeLnk(String serverType) {
		verifyMoreLnksBelowMobileTech(serverType,readMoreKnowledgeSectionRevAmpLnk, knowledgeRevAmpBreadcrumb);
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
	 * This method is used to validate navigation of Crime Widget Image
	 */
	public void verifyCrimeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,crimeSectionLnk,crimeSectionImgLnk, crimeBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Crime News
	 */
	public void verifyMoreCrimeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCrimeSectionLnk, crimeBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyCareerWidget(String serverType) {
		verifySectionLnksBelowMobileTech(serverType,careerSectionLnk, careerBreadcrumb);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigationBelowMobileTech(serverType,careerSectionLnk,careerSectionArticleLnk, careerBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of Career Widget Image
	 */
	public void verifyCareerWidgetImg(String serverType) {
		verifyImgNavigationBelowMobileTech(serverType,careerSectionLnk,careerSectionImgLnk, careerBreadcrumb);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to validate navigation of More Career News
	 */
	public void verifyMoreCareerLnk(String serverType) {
		verifyMoreLnksBelowMobileTech(serverType,readMoreCareerSectionLnk, careerBreadcrumb);
	}



}
