package com.news18.hindipages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.commonpages.HomePageLinksValidation;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 * This Class Contains elements and business logics for AMP Hindi Revamp Desktop Landing  Page
 *
 */
public class DesktopHindiRevampLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public DesktopHindiRevampLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//--------------------DanishR----Webelements------------------------------
	/*Ajab-Gajab RHS Title*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'ajab-gajab')]")
	private WebElement ajabGajabRhsTitleLink;

	/* Ajab-Gajab RHS Article Links present at the RHS*/
	@FindBy(xpath ="//ul[contains(@class,'newajabgajab')]//li//a")
	private List<WebElement> ajabGajabRhsArticleLinks;

	/* Ajab-Gajab RHS more news link present at the RHS*/
	@FindBy(xpath ="//ul[contains(@class,'newajabgajab')]//following-sibling::div[contains(@class,'newpwhitebgbtn')]//a")
	private WebElement ajabGajabRhsReadMoreLink;

	/* Food Active Slider Article link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"फूड\")]//parent::div/following-sibling::div[contains(@class,'newfood')]//li[contains(@class,'glide__slide--active')]/a")
	private WebElement foodRhsActiveSliderLink;

	/* Food Slider Button link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"फूड\")]//parent::div/following-sibling::div[contains(@class,'newfood')]//button")
	private List<WebElement> foodRhsSliderButtonLink;

	/* Cartoon Active Slider Article link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"कॉर्टून कार्नर\")]//parent::div/following-sibling::div[contains(@class,'newfood')]//li[contains(@class,'glide__slide--active')]/a")
	private WebElement cartoonRhsActiveSliderLink;

	/* Cartoon Slider Button link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"कॉर्टून कार्नर\")]//parent::div/following-sibling::div[contains(@class,'newfood')]//button")
	private List<WebElement> cartoonRhsSliderButtonLink;

	/* jobArticleLst present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"नौकरी\")]//parent::div/following-sibling::div[contains(@class,'newnaukriwrap')]//li/a")
	private List<WebElement> jobArticleLst;

	/* jobMoreBtn present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newnaukriwrap')]//a[contains(@href,'/job')]")
	private WebElement jobMoreBtn;

	/* jobHeadline present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'job')]")
	private WebElement jobHeadline;

	/* autoHeadline present at the RHS*/
	@FindBy(xpath ="//div[(@class='newglblhdwrap')]//h2[(.=\"ऑटो\")]//a")
	private WebElement autoHeadline;

	/* autoArticleLst present at the RHS*/
	@FindBy(xpath ="//div[(@class='newglblhdwrap')]//h2[(.=\"ऑटो\")]//parent::div/following-sibling::div[contains(@class,'newnaukriwrap')]//li/a")
	private List<WebElement> autoArticleLst;

	/* autoMoreBtn present at the RHS*/
	@FindBy(xpath ="//div[(@class='newglblhdwrap')]//h2[(.=\"ऑटो\")]//parent::div/following-sibling::div[contains(@class,'newnaukriwrap')]//a[contains(@class,'moretrndstroy')]")
	private WebElement autoMoreBtn;

	/*Food title present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"फूड\")]//a")
	private WebElement foodTitle;

	/* cartoonStory present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"कॉर्टून कार्नर\")]//parent::div/following-sibling::div[contains(@class,'newcartooncorner')]//li[not (contains(@class,'clone'))]//figure//img[not (contains(@aria-hidden,'true'))]")
	private List<WebElement> cartoonStory;

	/* cartoonHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"कॉर्टून कार्नर\")]//a")
	private WebElement cartoonHeadline;

	/* cricketHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'quiz-container ')]//div")
	private WebElement cricketHeadline;

	/* cricketHeadline present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"हेल्थ & फिटनेस\")]//a")
	private WebElement healthAndFitnessHeadline;

	/* healthAndFitnessMoreBtn present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"हेल्थ & फिटनेस\")]//parent::div/following-sibling::div[contains(@class,'newhealthfitness')]//a[contains(@class,'moretrndstroy')]")
	private WebElement healthAndFitnessMoreBtn;

	/* healthAndFitnessArticleLst present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"हेल्थ & फिटनेस\")]//parent::div/following-sibling::div[contains(@class,'newhealthfitness')]//li/a")
	private List<WebElement> healthAndFitnessArticleLst;

	/*Air Quality Index HeadLine Text At RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(text(),'AIR QUALITY INDEX')]" )
	private WebElement airQualityIndexHeadline;

	/*Air Quality Index widgets at RHS*/
	@FindBy(xpath ="//ul[contains(@class,'aqiwidgetlist')]//li//a")
	private List<WebElement> airQualityIndexWidgetLst;

	/*Element in Air Quality Section*/
	@FindBy(xpath ="//div[contains(@class,'logo_wrap')]" )
	private WebElement aqiLogo;

	//===============================common Revamp Elements=======================================
	/*Line One Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/business/')]")
	private WebElement lineOneSectionMoneyELe;

	/*cricket Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/cricket/')]")
	private WebElement lineOneSectionCricketELe;

	/*Entertainment Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/entertainment/')]")
	private WebElement lineOneSectionEntertainmentELe;

	/*Food Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/lifestyle/recipe/')]")
	private WebElement lineOneSectionFoodELe;

	/*Mobile Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/mobiles')]")
	private WebElement lineOneSectionMobileELe;

	/*States Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/states/')]")
	private WebElement lineOneSectionStatesELe;

	/*Knowledge Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/knowledge/')]")
	private WebElement lineOneSectionKnowledgeELe;

	/*Job Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/jobs/')]")
	private WebElement lineOneSectionJobELe;

	/*Tech Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/tech/')]")
	private WebElement lineOneSectionTechELe;

	/*Nation Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/nation/')]")
	private WebElement lineOneSectionNationELe;

	/*Life Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/lifestyle') and not(contains(@href,'/lifestyle/recipe/'))]")
	private WebElement lineOneSectionLifeELe;

	/*World Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/world/')]")
	private WebElement lineOneSectionWorldELe;

	/*crime Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[contains(@href,'/crime/')]")
	private WebElement lineOneSectionCrimeELe;

	/*Latest Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/latest-news/')]")
	private WebElement lineTwoSectionLatesELe;

	/*Ajab Gajab Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/ajab-gajab/')]")
	private WebElement lineTwoAjabGajabSectionELe;

	/*Photo Gallaery Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/photogallery/')]")
	private WebElement lineTwoPhotoSectionELe;

	/*Photo Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/lifestyle/health/')]")
	private WebElement lineTwoHealthSectionELe;

	/*Astrology Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/astro/')]")
	private WebElement lineTwoRasiFalSectionELe;

	/*Vinan Shava Chunav Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/assembly-elections/')]")
	private WebElement lineTwoVidanSavaChunavSectionELe;

	/*Auto Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/auto/')]")
	private WebElement lineTwoAutoSectionELe;

	/*Dharm Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/dharm/')]")
	private WebElement lineTwoDharmSectionELe;

	/*Career Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/career/')]")
	private WebElement lineTwoCareerSectionELe;

	/*Sahitya Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/literature/')]")
	private WebElement lineTwoSahityaSectionELe;

	/*Blog Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/blogs/')]")
	private WebElement lineTwoBlogSectionELe;

	/*Photo Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//li/a[contains(@href,'/photogallery/')]")
	private WebElement lineTwoPhotoSectionPage;
	
	/*Blog Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//a[text()='टॉप वीडियो']")
	private WebElement videoSectionELe;

	/*Photo Section Link is present on Header Section Of Hindi Desktop landing Page*/
	@FindBy(xpath="//h2[text()='MINIS']/ancestor::div[contains(@class,'newglblhdwrap')]//a[contains(@class,'moretrndstroy')]")
	private WebElement news18Minis;



	// ------------------------ Rev-AMP Vipins Webelement ------------------------------//

	/*Article Banner Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newbreaking')]//a")
	private List<WebElement> articleBannerLnk;

	/*Priority Panel Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newtopnews')]//ul/li/a")
	private List<WebElement> repriorityPanelArticleLnk;

	/*Priority Panel Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newtopnews')]//ul/li/a")
	private List<WebElement> repriorityPanelImgLnk;

	/*Taaza Samachaar Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[contains(@href,'latest-news')]")
	private WebElement taazaSamachaarReadMoreLnk;

	@FindBy(xpath = "//div[contains(@class,'newhindiplus')]//ul//li[not (contains(@class,'clone'))]/a")
	private List<WebElement> reNews18HindiPlusArticleLnk;

	@FindBy(xpath = "//div[contains(@class,'newhindiplus')]//ul//li[not (contains(@class,'clone')) and contains(@class,'active')]/a")
	private WebElement reactiveNews18HindiPlusArticleLnk;

	@FindBy(xpath = "//div[contains(@class,'newhindiplus')]//ul//li[not (contains(@class,'clone'))]/a//img")
	private List<WebElement> reNews18HindiPlusImgLnk;

	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[contains(@href,'originals')]")
	private WebElement reNews18HindiPlusMoreLnk;

	/* News18 Hindi Plus Left Slider Button in News18 Hindi Plus in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newhindiplus')]/div[contains(@class,'newhindiplus-arrow')]/button[@data-glide-dir='<']")
	private WebElement reNews18HindiPlusLeftSliderBtn;

	/* News18 Hindi Plus Right Slider Button in News18 Hindi Plus in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newhindiplus')]/div[contains(@class,'newhindiplus-arrow')]/button[@data-glide-dir='>']")
	private WebElement reNews18HindiPlusRightSliderBtn;

	/* List of Cricket Section Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'क्रिकेट')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> reCricketArticleLnk; 

	//		/* Cricket Dhamal Image Link in Cricket Widget in Homepage */
	//		@FindBy(xpath = "//div[contains(@class,'cricket-news')]/div/a/img")
	//		private WebElement cricketDhamalImgLnk;

	/* Cricket Title Link In Homepage body*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'क्रिकेट')]//a")
	private WebElement recricketTitleLnk;

	/* List of Cricket Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'क्रिकेट')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> reCricketImgLnk;

	/* List of Cricket Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'क्रिकेट')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement reMoreCricketNewsLnk;

	/* List of Cricket Section Title Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'क्रिकेट')]//a")
	private WebElement reMoreCricketTitleLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news18minis')]/div[contains(@class,'newnews18minis')]//ul/li//a//img")
	private List<WebElement> renews18MinisImgLnk;

	/* List of News18 Minis Section Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'news18minis')]/div[contains(@class,'newnews18minis')]//ul/li//a")
	private List<WebElement> renews18MinisArticleLnk;

	/* News18 Minis See More Link Navigation in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/a[contains(@href,'/minis')]")
	private WebElement renews18MinisSeeMoreLnk;

	/*News18 Minis Previous Slide Button in HomePage */
	@FindBy(xpath = "//div[contains(@class,'newnews18minis')]//div[contains(@class,'trndstorynewarw')]//button[contains(@data-glide-dir,'<')]")
	private WebElement renews18MinisPrevBtn;

	/*News18 Minis Next Slide Button in HomePage */
	@FindBy(xpath = "//div[contains(@class,'newnews18minis')]//div[contains(@class,'trndstorynewarw')]//button[contains(@data-glide-dir,'>')]")
	private WebElement renews18MinisNextBtn;

	/* News18 Minis Read Full Story Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newnews18minis')]//ul/li//p/span")
	private List<WebElement> renews18MinisReadFullStoryLnk;

	/*News18 Minis Active Article Link in homepage */
	@FindBy(xpath = "//div[contains(@class,'newnews18minis')]//ul/li[contains(@class,'active')]/a")
	private WebElement reactiveNews18MinisArticleLnk;

	/*News18 Minis A world of News At YOur Fingertips Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]//h2/a[contains(@href,'minis')]")
	private List<WebElement> news18MinisWorldNewsLnk;

	/* List of Webstrories Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]/div[contains(@class,'webseries-slide')]//ul/li/a")
	private List<WebElement> rewebstoriesArticleLnk;

	/* List of Webstrories Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]/div[contains(@class,'webseries-slide')]//ul/li/a//img")
	private List<WebElement> rewebstoriesImgLnk;

	/* Active Webstories Article Link in Webstories Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'webseries')]/div[contains(@class,'webseries-slide')]//ul/li[contains(@class,'active')]/a")
	private WebElement reactiveWebstoriesArticleLnk;

	/* Webstories Title Link In HOmepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2/a[contains(@href,'web-stories')]")
	private WebElement rewebstoriesTitleLnk;

	/*Webstories Left Arrow Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'webseries')]//div[contains(@class,'trndstorynewarw')]/button[@data-glide-dir='<']")
	private WebElement webstoriesLeftArrowBtn;

	/*Webstories Right Arrow Button in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'webseries')]//div[contains(@class,'trndstorynewarw')]/button[@data-glide-dir='>']")
	private WebElement webstoriesRightArrowBtn;

	/*Webstories Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[contains(@href,'web-stories')]")
	private WebElement webstoriesReadMoreLnk;

	/* List of Mobile Tech Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मोबाइल-टेक')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> remobileTechArticleLnk;

	/* List of Mobile Tech Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मोबाइल-टेक')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> remobileTechImgLnk;

	/* List of Mobile Tech Tabs Link Navigation In Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मोबाइल-टेक')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> remobileTechTabsLnk;

	/* Mobile Tech Section Read More Link in homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मोबाइल-टेक')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement remobileTechReadMoreLnk;

	/* Mobile Tech title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मोबाइल-टेक')]//a")
	private WebElement remobileTechTitleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'newphotoslist')]/li/a")
	private List<WebElement> rephotoArticleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'newphotoslist')]/li/a//img[@data-src]")
	private List<WebElement> rephotoImgLnk;

	/* List of Photo Tabs Link Navigation In Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'फोटो')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> rephotoTabsLnk;

	/*Photo Read More Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newpradeshbtn')]/a[contains(@href,'photogallery')]")
	private WebElement rephotoReadMoreLnk;

	/*Photo Title Link in Body Photo Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'फोटो')]//a")
	private WebElement rephotoTitleLnk;

	/* List of Literature Article in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'साहित्य')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> reliteratureArticleLnk;

	/* List of Photos Article Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'साहित्य')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> reliteratureImgLnk;

	/* Aur bhe Padhe Link in Photo Section */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'साहित्य')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement reliteratureReadMoreLnk;

	/* Literature Title Link for Literature Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'साहित्य')]//a")
	private WebElement reliteratureTitleLnk;

	/* List of Bollywood Section Article Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'बॉलीवुड')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> rebollywoodArticleLnk;

	/* List of Bollywood Tabs Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'बॉलीवुड')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> rebollywoodTabsLnk;

	/* List of Bollywood Section Image Links in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'बॉलीवुड')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> rebollywoodImgLnk;

	/* Bollywood Read More Link in Bollywood Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'बॉलीवुड')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement rebollywoodReadMoreLnk;

	/* Bollywood Read More Link in Bollywood Widget in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'बॉलीवुड')]//a")
	private WebElement rebollywoodTitleLnk;

	/* List of Money Section Article Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मनी')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> remoneyArticleLnk;

	/* List of Money Image Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मनी')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> remoneyImgLnk;

	/* List of Money Section Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'मनी')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> remoneyTabsLnk;

	/* List of Money Section Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'मनी')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> reMoneyTabsLnk;

	/* Money Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'मनी')]//a")
	private WebElement remoneyTitleLnk;

	/* Money Control Link in Money Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'मनी')]/span[contains(@class,'money')]/a")
	private WebElement remoneyControlLnk;

	/*Money Control Logo Link in MoneyControl homepage after Navigating to MoneyControl Banner*/
	@FindBy(xpath = "//div[contains(@class,'headtop')  or contains(@class,'head_homepage') or contains(@class,'stmimg')]")
	private WebElement moneyControlLogo;

	/* List of Latest Mobile News Article Links in Mobile Finder Section in Homepage*/ 
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tabcontent')]//div[contains(@class,'lmn_wrp')]/div//a")
	private List<WebElement> latestMobileNewsArticleLnk;

	/* List of Mobile Finder Section Image in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@id,'tab_one')]//div[contains(@class,'lmn_wrp')]/div//a//img")
	private List<WebElement> latestMobileNewsImgLnk;

	/* More News Link in Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tabcontent')]//div[contains(@class,'lmn_wrp')]/a")
	private WebElement mobileFinderMoreNewsLnk;

	/* Find Mobile by brand Banner Mobile brands Links for Mobile Finder Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tabcontent')]//div[contains(@class,'find_wrp')]//div[contains(@class,'list')]//a")
	private List<WebElement> mobileBrandsLnk;

	/*Mobile Finder Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newmobilewrap')]/div[contains(@class,'newmobiletab')]/ul/li/a[contains(.,'ट्रेंडिंग और रिकमंडेड मोबाइल')]")
	private WebElement retrendingAndRecommendedMobileTabLnk; 

	/*Soon Upcoming Mobile Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newmobilewrap')]/div[contains(@class,'newmobiletab')]/ul/li/a[contains(.,'जल्‍द लॉन्‍च होने वाले मोबाइल')]")
	private WebElement resoonUpcomingMobileTabLnk; 

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> retrendindAndRecommendedStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement reactiveTrendindAndRecommendedStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'trndstorynewarw')]//button[@data-glide-dir='<']")
	private WebElement retrendindAndRecommendedBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'trndstorynewarw')]//button[@data-glide-dir='>']")
	private WebElement retrendindAndRecommendedForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]//ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> retrendindAndRecommendedReadMoreLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]//ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> reupcomingMobileStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]//ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement reactiveUpcomingMobileStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'trndstorynewarw')]//button[@data-glide-dir='<']")
	private WebElement reupcomingMobileBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'trndstorynewarw')]//button[@data-glide-dir='>']")
	private WebElement reupcomingMobileForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> reupcomingMobileReadMoreLnk;

	/* Read More Link in Money Section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'मनी')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement remoneyReadMoreNewsLnk;


	/* List of Body Sports Article Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'खेल')]/parent::div/following-sibling::div[1]/ul/li/a[not(contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> rebodySportsArticleLnk;

	/*Body Khel Title Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newleftwrap')]//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'खेल')]/a")
	private WebElement rebodySportsTitleLnk;

	/* List of Body Sports Image Links in Homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'खेल')]/parent::div/following-sibling::div[1]/ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> rebodySportsImgLnk;

	/* List of Body Khel Tabs Link in Khel section in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/h2[contains(.,'खेल')]/parent::div/div[contains(@class,'newbuttonlist')]/a")
	private List<WebElement> rebodyKhelTabsLnk;

	/*Read more News Link in Body Khel Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'newglblhd')]/h2[contains(.,'खेल')]/parent::div/following-sibling::div[1]/ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement rebodyKhelReadMoreLnk;

	/* List of Latest Mobile News Article Links in Mobile Finder Section in Homepage*/ 
	@FindBy(xpath = "//div[contains(@id,'tab_one')]//div[contains(@class,'newmobile')]//ul/li/a[not (contains(@class,'moretrndstroygrey'))]")
	private List<WebElement> relatestMobileNewsArticleLnk;

	/* List of Mobile Finder Section Image in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_one')]//div[contains(@class,'newmobile')]//ul/li/a[not (contains(@class,'moretrndstroygrey'))]//img")
	private List<WebElement> relatestMobileNewsImgLnk;

	/* More News Link in Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_one')]//div[contains(@class,'newmobile')]//ul/li/a[contains(@class,'moretrndstroygrey')]")
	private WebElement relatestMobileNewsMoreNewsLnk;

	/* Find Mobile by brand Banner Mobile brands Links for Mobile Finder Section in homepage */
	@FindBy(xpath = "//div[contains(@class,'find')]//div[contains(@class,'content')]//a")
	private List<WebElement> remobileBrandsLnk;

	/*Mobile Finder Tabs Link in Homepage */
	@FindBy(xpath = "//div[contains(@class,'single-tabs')]/div[contains(@class,'tab')]/a[not (contains(@class,'active'))]")
	private List<WebElement> mobileFinderTabsLnk; 

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> trendindAndRecommendedStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement activeTrendindAndRecommendedStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='<']")
	private WebElement trendindAndRecommendedBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='>']")
	private WebElement trendindAndRecommendedForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'tab_two')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> trendindAndRecommendedReadMoreLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]/a")
	private List<WebElement> upcomingMobileStoriesLnk;

	/* List of Trending and Recommended Mobile Stories Link for Mobile Finder Section in Homepage */
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone')) and contains(@class,'active')]/a/div[contains(@class,'ttl')]")
	private WebElement activeUpcomingMobileStoriesLnk;

	/* Backword Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='<']")
	private WebElement upcomingMobileBackwordSlider;

	/* Forward Slider Division for Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div[contains(@class,'ctrls')]//div[@data-glide-dir='>']")
	private WebElement upcomingMobileForwordSlider;

	/* Read More Stories Link in Trending and Recommended Mobile for Mobile Finder Section in homepage*/
	@FindBy(xpath = "//div[contains(@id,'upcomingMobile')]//div[contains(@class,'glide--swipeable')]/div/ul/li[not (contains(@class,'clone'))]//div[contains(@class,'trndbtn_wrp')]/a")
	private List<WebElement> upcomingMobileReadMoreLnk;

	/*List Of Ajab Gajab Article Links for Ajab Gajab Sections in Homeoage*/
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]//div[contains(@class,'bollywoodnews')]/ul/li/a")
	private List<WebElement> ajabGajabArticleLnk;

	/*List of Ajab Gajab Image Links for Ajab Gajba Section in Homepage*/
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]//div[contains(@class,'bollywoodnews')]/ul/li/a//img[@data-src]")
	private List<WebElement> ajabGajabImgLnk;

	/* Ajab Gajab Section Read More Link in Homepage */
	@FindBy(xpath = "//h2/a[contains(@href,'ajab-gajab')]/ancestor::div[contains(@class,'mobile-tech-wrap')]/div[contains(@class,'tech')]/div/a")
	private WebElement ajabGajabReadMoreLnk;

	/*Ajab Gajab Section Title Link in Homepage*/
	@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'ajab-gajab')]")
	private WebElement ajabGajabTitleLnk;

	/*Pradesh News present after cricket next section*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2//a[contains(@href,'/states/')]")
	private WebElement pradeshNews;

	/*Pradesh News state links*/
	@FindBy(xpath ="//div[contains(@class,'newpradeshlist ')]//ul//li//a")
	private List<WebElement> pradeshStatesLnks;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'newchoosecitywrap')]/a")
	private WebElement rajyaChuneLnk;

	/*Articles breadcrumb Header Text */
	@FindBy(xpath ="//div[contains(@class,'crum') or contains(@class,'breadcum') or contains(@class,'brdc')]  | //ul[contains(@class, 'bread') or contains(@class,'brdc')]")
	private WebElement articleBreadcrumb;

	/*Pradesh News aur bhi dekhu-more*/
	@FindBy(xpath ="//div[contains(@class,'newpradeshwrap')]/following-sibling::div[contains(@class,'newpradeshbtn')]/a")
	private WebElement pradeshNewsMoreLinks;

	/*Pradesh News rajya chune link*/
	@FindBy(xpath ="//div[contains(@class,'newchoosecitywrap')]//div//a")
	private List<WebElement> rajyaChuneStateList;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'globalhd large')]//div//button")
	private List<WebElement> buttonLnks;

	/*Pradesh News City Names right button*/
	@FindBy(xpath ="(//div[contains(@class,'citiesname')]//div//button)[2]")
	private WebElement citybuttonLnk;

	/*Pradesh News state left right buttons*/
	@FindBy(xpath ="//div[contains(@class,'newpradeshwrap')]//ul//li//a")
	private List<WebElement> stateArticleLnks;

	/*Pradesh News City Names Header Links*/
	@FindBy(xpath ="//div[contains(@class,'citiesname')]//ul//li//a")
	private List<WebElement> stateCityNamesLnks;


	// ------------------------ Rev-AMP Anupam's Webelement ------------------------------//

	/* Video section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"टॉप वीडियो\")]/a")
	private WebElement videoSectionRevAmpLnk;

	/* Video section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"टॉप वीडियो\")]//ancestor::div[contains(@class,'newcontainer')]//ul/li/a")
	private List<WebElement> videoSectionArticleRevAmpLnk;

	/* Video section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"टॉप वीडियो\")]//ancestor::div[contains(@class,'newcontainer')]//ul//figure/img")
	private List<WebElement> videoSectionImgRevAmpLnk;

	/*Breadcrumb present in article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum')] | //div[contains(@class,'breadcrumb')]")
	private WebElement videoRevAmpBreadcrumb;

	/* Video section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"टॉप वीडियो\")]//ancestor::div[contains(@class,'newcontainer')]//div/a")
	private WebElement readMoreVideoSectionRevAmpLnk;

	//---------nation
	/* Nation section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"देश\")]/a")
	private WebElement nationSectionRevAmpLnk;

	/* Nation section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"देश\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> nationSectionArticleRevAmpLnk;

	/* Nation section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"देश\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> nationSectionImgRevAmpLnk;

	/* Nation section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"देश\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreNationSectionRevAmpLnk;

	/*Breadcrumb present in nation article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement nationRevAmpBreadcrumb;


	//---------world
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"दुनिया\")]/a")
	private WebElement worldSectionRevAmpLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"दुनिया\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> worldSectionArticleRevAmpLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"दुनिया\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> worldSectionImgRevAmpLnk;

	/* world section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"दुनिया\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreWorldSectionRevAmpLnk;

	/*Breadcrumb present in world article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement worldRevAmpBreadcrumb;

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"लाइफ़\")]/a")
	private WebElement lifestyleSectionRevAmpLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"लाइफ़\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> lifestyleSectionArticleRevAmpLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"लाइफ़\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> lifestyleSectionImgRevAmpLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"लाइफ़\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreLifestyleSectionRevAmpLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement lifestyleRevAmpBreadcrumb;


	//---------dharm
	/* Dharm section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"धर्म\")]/a")
	private WebElement dharmSectionRevAmpLnk;

	/* Dharm section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"धर्म\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> dharmSectionArticleRevAmpLnk;

	/* Dharm section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"धर्म\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> dharmSectionImgRevAmpLnk;

	/* Dharm section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"धर्म\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreDharmSectionRevAmpLnk;

	/*Breadcrumb present in Dharm article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement dharmRevAmpBreadcrumb;

	//---------crime
	/* Crime section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"क्राइम\")]/a")
	private WebElement crimeSectionRevAmpLnk;

	/* Crime section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"क्राइम\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> crimeSectionArticleRevAmpLnk;

	/* Crime section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"क्राइम\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> crimeSectionImgRevAmpLnk;

	/* Crime section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"क्राइम\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreCrimeSectionRevAmpLnk;

	/*Breadcrumb present in Crime article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement crimeRevAmpBreadcrumb;


	//---------sportcricket
	/* Footer sport section present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"खेल\")]/a")
	private WebElement footerSportSectionRevAmpLnk;

	/*Footer sport section Article present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"खेल\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> footerSportSectionArticleRevAmpLnk;

	/* Footer sport section Image present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"खेल\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> footerSportSectionImgRevAmpLnk;

	/* Footer sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"खेल\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreFooterSportSectionRevAmpLnk;

	/*Breadcrumb present in Footer sport article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement footerSportRevAmpBreadcrumb;

	//---------knowledge
	/* Knowledge section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"नॉलेज\")]/a")
	private WebElement knowledgeSectionRevAmpLnk;

	/* Knowledge section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"नॉलेज\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> knowledgeSectionArticleRevAmpLnk;

	/* Knowledge section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"नॉलेज\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> knowledgeSectionImgRevAmpLnk;

	/* Knowledge section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"नॉलेज\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreKnowledgeSectionRevAmpLnk;

	/*Breadcrumb present in Knowledge article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement knowledgeRevAmpBreadcrumb;


	//---------career
	/* Career section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"करियर\")]/a")
	private WebElement careerSectionRevAmpLnk;

	/* Career section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"करियर\")]//ancestor::div[contains(@class,'newbottomsection')]/ul/li/a")
	private List<WebElement> careerSectionArticleRevAmpLnk;

	/* Career section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"करियर\")]//ancestor::div[contains(@class,'newbottomsection')]/ul//figure//img")
	private List<WebElement> careerSectionImgRevAmpLnk;

	/* Career section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newbottomsection')]//h2[(.=\"करियर\")]//ancestor::div[contains(@class,'newbottomsection')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreCareerSectionRevAmpLnk;

	/*Breadcrumb present in Career article page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum') ] | //div[contains(@class,'breadcrumb') ]")
	private WebElement careerRevAmpBreadcrumb;


	//-----blog
	/* Blog section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]/a")
	private WebElement blogSectionRevAmpLnk;

	/* Journalist profile link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]//parent::div/following-sibling::ul/li/a[1]")
	private List<WebElement> journalistProfileRevAmpLnk;

	/* Journalist profile link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]//parent::div/following-sibling::ul/li/a[1]/figcaption")
	private List<WebElement> journalistProfileRevAmpTxt;

	/* Journalist Article link in Blog section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]//parent::div/following-sibling::ul/li/a[2]")
	private List<WebElement> journalistArticleRevAmpLnk;

	/* Journalist readmore link in Blog section  present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]//parent::div/following-sibling::ul/li//em")
	private List<WebElement> readmoreJournalistRevAmpLnk;

	//			/*Journalist Image link in Blog section article present in homepage*/
	//			@FindBy(xpath ="//div[contains(@class,'globalhd large')]//a[contains(@href,'/blogs/')]/ancestor::div[contains(@class,'globalhd large')]/following-sibling::ul/li//div[contains(@style,'display: inline-block')]/img")
	//			private List<WebElement> journalistImgRevAmpLnk;

	/*Breadcrumb present in journalist page*/
	@FindBy(xpath ="//ul[contains(@class,'brdcrmb')] | //div[contains(@class,'brdcrmb')] | //div[contains(@class,'breadcum')] | //div[contains(@class,'breadcrumb')]")
	private WebElement blogRevAmpBreadcrumb;

	/*Author name present in journalist page*/
	@FindBy(xpath ="//div[contains(@class,'blogAuthor') or contains(@class,'authorBlogs') ]//h3/span")
	private WebElement authorNameRevAmpTxt;

	/* Blog section ReadMore present in homepage beside section*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//h2[(.=\"ब्लॉग\")]//parent::div/a")
	private WebElement readMoreBlogSectionRevAmpLnk;



	//=======================================SiteMap Google Trends Element=======================================//
//	/*Elements from Google Trends*/
//	@FindBy(xpath="//div[contains(@class,'homepage-trending-stories generic')]//md-list[contains(@class,'md-list-block')]//span[contains(@ng-repeat,'titlePart in titleArray')]//a")
//	private List<WebElement> googleTrendsEleList;
	
	/*Elements from Google Trends*/
	@FindBy(xpath="//div[contains(@class,'homepage-trending-stories generic')]//md-list[contains(@class,'md-list-block')]//span/a")
	private List<WebElement> googleTrendsEleList;
	
	/* all Section Ele*/
	@FindBy(xpath ="(//md-select-value[contains(@class,'_md-select-value')])[2]")
	private WebElement allSectionEle;

	public WebElement getAllSectionEle() {
		return allSectionEle;
	}

	public List<WebElement> getGoogleTrendsEleList() {
		return googleTrendsEleList;
	}

	//=======================================common Revamp Business Logics=====================

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneMoneyLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionMoneyELe);
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
		webDriverActions.clickJS(lineOneSectionCricketELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Cricket widget present on line one section.
	 */
	public void clickOnLineTwoPhotoLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoPhotoSectionELe);
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
		webDriverActions.clickJS(lineOneSectionEntertainmentELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Food widget present on line one section.
	 */
	public void clickOnLineOneFoodLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionFoodELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Mobile widget present on line one section.
	 */
	public void clickOnLineOneMobileLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionMobileELe);
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
		webDriverActions.clickJS(lineOneSectionStatesELe);
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
		webDriverActions.clickJS(lineOneSectionKnowledgeELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Jobs widget present on line one section.
	 */
	public void clickOnLineOneJobsLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionJobELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Entertainment widget present on line one section.
	 */
	public void clickOnLineOneTechLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionTechELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Entertainment widget present on line one section.
	 */
	public void clickOnLineOneNationLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionNationELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Life widget present on line one section.
	 */
	public void clickOnLineOneLifestyleLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionLifeELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Entertainment widget present on line one section.
	 */
	public void clickOnLineOneWorldLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionWorldELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Money widget present on line one section.
	 */
	public void clickOnLineOneCrimeSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineOneSectionCrimeELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoLatestSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoSectionLatesELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoAjabGajabSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoAjabGajabSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoHealthLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoHealthSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoAstrologySectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoRasiFalSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoAutoSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoAutoSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoDharmSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoDharmSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoCareerSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoCareerSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoSahityaSectionLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoSahityaSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoBlogLink()
	{
		webDriverActions.waitForElement(1000);
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(lineTwoBlogSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	/**
	 * @author DanishR
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnLineTwoPhotoSectionLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.clickJS(lineTwoPhotoSectionPage);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnVideoSectionLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(videoSectionELe, 10);
		webDriverActions.softWaitForElementVisibility(videoSectionELe, 10);
		webDriverActions.clickJS(videoSectionELe);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void clickOnNews18MinisSectionLink()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(news18Minis, 10);
		webDriverActions.softWaitForElementVisibility(news18Minis, 10);
		webDriverActions.clickJS(news18Minis);
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method is use to click on Crime widget present on line one section.
	 */
	public void navigateToPodcastSectionLink()
	{
		String pageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.navigateToUrl(pageUrl+"/podcast");
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		Assert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
	}

	//-------------DanishR--Business--Logic--Methods-------------------------------

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Ajab-Gajab section Title and navigate
	 */
	public void verifyAjabGajabRhsHeadlineNavigation(String serverType) {
		verifyRhsTitleNavigation(serverType,ajabGajabRhsTitleLink);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Ajab-Gajab section Title and navigate
	 */
	public void verifyAjabGajabRhsArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,ajabGajabRhsTitleLink,ajabGajabRhsArticleLinks);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Ajab-Gajab section Title and navigate
	 */
	public void verifyAjabGajabRhsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,ajabGajabRhsTitleLink,ajabGajabRhsReadMoreLink);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsJobHeadlineNavigation(String serverType) {
		verifyRhsTitleNavigation(serverType,jobHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsJobArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,jobHeadline,jobArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsJobReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,jobHeadline,jobMoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsAutoHeadlineNavigation(String serverType) {
		verifyRhsTitleNavigation(serverType,autoHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsAutoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,autoHeadline,autoArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsAutoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,autoHeadline,autoMoreBtn);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Food section Title and navigate
	 */
	public void verifyRhsFoodArticleNavigation(String serverType) {
		verifyRhsSlidingArticlesNavigation(serverType, foodTitle, foodRhsActiveSliderLink, foodRhsSliderButtonLink);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Cartoon section Title and navigate
	 */
	public void verifyRhsCartoonArticleNavigation(String serverType) {
		verifyRhsSlidingArticlesNavigation(serverType, cartoonHeadline, cartoonRhsActiveSliderLink, cartoonRhsSliderButtonLink);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsHealthAndFitnessHeadlineNavigation(String serverType) {
		verifyRhsTitleNavigation(serverType,healthAndFitnessHeadline);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsHealthAndFitnessArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,healthAndFitnessHeadline,healthAndFitnessArticleLst);
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on RHS Jobs section Title and navigate
	 */
	public void verifyRhsHealthAndFitnessReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,healthAndFitnessHeadline,healthAndFitnessMoreBtn);
	}



	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Air Quality Index widgets present at the
	 * RHS and navigate their pages
	 */
	public void verifyAirQualityIndex(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(airQualityIndexHeadline,5);
		webDriverActions.softScrollToElement(airQualityIndexHeadline);
		if(airQualityIndexWidgetLst.size()>0)
		{
			/* Below loop will fetch list of articles and navigate to each one by one */ 
			for(int i=0;i<1;i++)
			{
				webDriverActions.softClickJS(airQualityIndexWidgetLst.get(i));
				Logs.info(getClass(),"Clicked on Air Quality Index Widget");
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentPage = webDriverActions.getCurrentPageUrl();
				int response = genericUtility.checkLinks(currentPage);
				Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(aqiLogo),"Unable to display Element"+webDriverActions.getCurrentPageUrl());
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+airQualityIndexWidgetLst.size());
		}
		softAssert.assertAll("Issues found in this Url "); 
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the RHS section
	 */
	public void verifyRhsTitleNavigation(String serverType,WebElement title) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();

		webDriverActions.softWaitForElementVisibility(title, 2);
		//		webDriverActions.softScrollToElement(title);
		webDriverActions.continuousScrollTillElement(title, 10);
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
		softAssert.assertAll(" Issues found in money category section Title ");

	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();

		webDriverActions.softWaitForElementVisibility(title, 2);
		//		webDriverActions.softScrollToElement(title);
		webDriverActions.continuousScrollTillElement(title, 10);
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
		softAssert.assertAll("Issues found in money category section Articles ");
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on Read more button of RHS section
	 */
	public void verifyRHSReadMoreNavigation(String serverType,WebElement title, WebElement morelink) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();

		webDriverActions.softWaitForElementVisibility(title, 2);
		//		webDriverActions.softScrollToElement(title);
		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		webDriverActions.continuousScrollTillElement(morelink, 10);
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
		softAssert.assertAll("Issues found in money category section Read more ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of  section
	 */
	public void verifyRhsSlidingArticlesNavigation(String serverType,WebElement title,WebElement articleActiveLink,List<WebElement> buttonLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();

		webDriverActions.softWaitForElementVisibility(title, 2);
		//		webDriverActions.softScrollToElement(title);
		webDriverActions.continuousScrollTillElement(title, 10);
		webDriverActions.softScrollToElement(title);
		webDriverActions.softHighlightElement(title);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(title, 2)," Possibily no Photo section found " +title+" "+webDriverActions.getCurrentPageUrl());
		//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
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
		softAssert.assertAll("Issues found in money category section Articles ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the cartoon section
	 */
	public void verifyCartoonCornerTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(cartoonHeadline, 10);
		webDriverActions.softScrollToElement(cartoonHeadline);
		String actual = webDriverActions.getAttribute("href", cartoonHeadline);
		String expected = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(cartoonHeadline);
		String currentPage = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		int response = genericUtility.checkLinks(currentPage);
		Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
		boolean status=genericUtility.compareUrlSub(actual, expected);
		softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
		softAssert.assertAll("Issues found in this url ");
	}

	/**
	 * @author 	
	 * @param serverType
	 * This method is used to click on the title of food Section present at the RHS of the
	 * home page
	 */
	public void verifyHomePagefoodTitle(String serverType) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(foodTitle);
		webDriverActions.mouseHover(foodTitle);
		String actual =	webDriverActions.getAttribute("href", foodTitle);
		webDriverActions.softClickJS(foodTitle);
		String currentPage = webDriverActions.getCurrentPageUrl();
		String expected = webDriverActions.getCurrentPageUrl();
		if (serverType.equalsIgnoreCase("preprod")) {
			String betaUrl = genericUtility.replaceInUrl(currentPage);
			webDriverActions.navigateToUrl(betaUrl);
			currentPage=betaUrl;
		}
		int response = genericUtility.checkLinks(currentPage);
		Assert.assertTrue(response==200," Response Code is :"+response+" Possibly Url has issue "+ currentPage);
		boolean status=genericUtility.compareUrlSub(actual, expected);
		softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
		softAssert.assertAll("Issues found in RHS Food Section "); 
	}






	// ------------------------- Vipin Business Logic  ---------------------------------------- //

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

	public void verifyArticleBannerNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, articleBannerLnk);
	}

	public void verifyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType ,repriorityPanelArticleLnk);
	}

	public void verifyPriorityPanelImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType ,repriorityPanelImgLnk);
	}

	public void verifyCricketArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , reCricketArticleLnk);
	}

	public void verifyCricketImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , reCricketImgLnk);
	}

	public void verifyMoreCricketNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , reMoreCricketNewsLnk);
	}

	public void verifyNews18MinisArticleNavigation(String serverType)
	{
		verifyArticleNavigation( serverType , renews18MinisArticleLnk);
	}

	public void verifyNews18MinisImageNavigation(String serverType)
	{
		verifyImageNavigation( serverType , renews18MinisImgLnk);
	}

	public void verifyNews18MinisSeeMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation( serverType , renews18MinisSeeMoreLnk);
	}

	public void verifyNews18MinisSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(renews18MinisReadFullStoryLnk, 10);
		if(webDriverActions.softIsElementDisplayed(renews18MinisNextBtn))
		{
			String beforeSlide = webDriverActions.getTextFromElement(reactiveNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(renews18MinisNextBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getTextFromElement(reactiveNews18MinisArticleLnk);
			Logs.info(getClass(), afterSlide);
			softAssert.assertNotEquals(beforeSlide, afterSlide);
		}
		else
		{
			softAssert.fail("Possibly Next Button is Not Displayed in News18 Minis Section");
		}
		if(webDriverActions.softIsElementDisplayed(renews18MinisPrevBtn))
		{
			String beforeSlide = webDriverActions.getTextFromElement(reactiveNews18MinisArticleLnk);
			Logs.info(getClass(), beforeSlide);
			webDriverActions.softClickJS(renews18MinisPrevBtn);
			webDriverActions.waitForSecond(2000);
			String afterSlide = webDriverActions.getTextFromElement(reactiveNews18MinisArticleLnk);
			Logs.info(getClass(), afterSlide);
			softAssert.assertNotEquals(beforeSlide, afterSlide);
		}
		else
		{
			softAssert.fail("Possibly Previous Button is Not Displayed in News18 Minis Section");
		}
		softAssert.assertAll("Issue Found In Homepage Body");
	}

	public void verifyNews18MinisReadFullStoryNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();

		webDriverActions.continuousScrollTillAllElement(renews18MinisReadFullStoryLnk, 20);
		for(int i=0 ; i<renews18MinisReadFullStoryLnk.size() ; i++)
		{
			webDriverActions.softMouseHover(renews18MinisReadFullStoryLnk.get(i));
			String actual = webDriverActions.getAttribute("href", renews18MinisArticleLnk.get(i));
			webDriverActions.softHighlightElement(renews18MinisReadFullStoryLnk.get(i));
			webDriverActions.softClickJS(renews18MinisReadFullStoryLnk.get(i));
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
			// // webDriverActions.navigateToUrl(homeUrl);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}	
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}

	public void verifyNews18MinisWorldOfNewsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, news18MinisWorldNewsLnk);
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


	public void verifyWebstoriesArticleNavigation(String serverType)
	{
		List<String> list=new ArrayList<String>();
		//		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(rewebstoriesTitleLnk, 10);
		webDriverActions.softMouseHover(rewebstoriesTitleLnk);
		webDriverActions.scrollDown();
		for(int i=0 ; i<rewebstoriesArticleLnk.size() ; i++)
		{
			String attribute = rewebstoriesArticleLnk.get(i).getAttribute("href");
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
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillAllElement(rewebstoriesImgLnk, 10);
		if(rewebstoriesImgLnk.size()>0)
		{
			webDriverActions.softScrollToElement(rewebstoriesImgLnk.get(0));
			webDriverActions.softMouseHover(rewebstoriesImgLnk.get(0));
			String title = webDriverActions.getPageTitle();
			for(int i=0; i<rewebstoriesImgLnk.size() ;i++)
			{
				webDriverActions.softClick(rewebstoriesImgLnk.get(i));
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
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(title);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+rewebstoriesImgLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	//	public void verifyRelatedNewsArticleNavigation(String serverType)
	//	{
	//		SoftAssert softAssert =new SoftAssert();
	//		webDriverActions.waitForPageToLoad();
	//		// // String homeUrl = webDriverActions.getCurrentPageUrl();
	//		webDriverActions.continuousScrollTillAllElement(relatedNewsLnk, 10);
	//		for(int i=0; i<relatedNewsLnk.size() ; i++)
	//		{
	//			webDriverActions.softScrollToElement(relatedNewsLnk.get(i));
	//			webDriverActions.softMouseHover(relatedNewsLnk.get(i));
	//			webDriverActions.softClickJS(relatedNewsLnk.get(i));
	//			webDriverActions.waitForSecond(5000);
	//			for(int j=0 ;j< activeRelatedNewsLnk.size() ; j++)
	//			{
	//				webDriverActions.scrollToElement(activeRelatedNewsLnk.get(j));
	//				webDriverActions.softScrollToElement(activeRelatedNewsLnk.get(j));
	//				//					String actual = webDriverActions.getAttribute("href", activeRelatedNewsLnk.get(j));
	//				webDriverActions.softClickJS(activeRelatedNewsLnk.get(j));
	//				webDriverActions.waitForSecond(1000);
	//				String currentPage = webDriverActions.getCurrentPageUrl();
	//				String expectedUrl = webDriverActions.getCurrentPageUrl();
	//				if (serverType.equalsIgnoreCase("preProd")) {
	//					String betaUrl = genericUtility.replaceInUrl(currentPage);
	//					webDriverActions.navigateToUrl(betaUrl);
	//					currentPage=betaUrl;
	//				}
	//				else {
	//					currentPage = webDriverActions.getCurrentPageUrl();
	//				}
	//				webDriverActions.softHighlightElement(articleHeaderTxt);
	//				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeaderTxt), "Unable to Display Element in "+currentPage);
	//				webDriverActions.waitForSecond(2000);
	//				// webDriverActions.navigateToUrl(homeUrl);
	//				if (currentPage.contains(expectedUrl)) {
	//					webDriverActions.navigateBack();
	//				}
	//				else {
	//					webDriverActions.navigateBack();
	//					webDriverActions.navigateBack();
	//				}	
	//				webDriverActions.waitForSecond(1000);
	//				webDriverActions.continuousScrollTillElement(relatedNewsLnk.get(i), 10);
	//				webDriverActions.softClickJS(relatedNewsLnk.get(i));
	//				webDriverActions.waitForSecond(2000);
	//			}
	//		}
	//		softAssert.assertAll("Issue Found in Homepage Body ");
	//	}

	public void verifyTaazaSamachaarNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, taazaSamachaarReadMoreLnk);
	}

	public void verifyBodyKhelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , rebodySportsArticleLnk);
	}

	public void verifyBodyKhelImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , rebodySportsImgLnk);
	}

	public void verifyPhotoArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , rephotoArticleLnk);
	}

	public void verifyPhotoImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , rephotoImgLnk);
	}

	public void verifyLiteratureArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , reliteratureArticleLnk);
	}

	public void verifyLiteratureImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , reliteratureImgLnk);
	}

	public void verifyLiteratureReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , reliteratureReadMoreLnk);
	}

	public void verifyLiteratureTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , reliteratureTitleLnk);
	}

	public void verifyPhotoTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 10);
		webDriverActions.softScrollToElement(rephotoTabsLnk.get(0));
		webDriverActions.softMouseHover(rephotoTabsLnk.get(0));
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<rephotoTabsLnk.size() ; j++)
		{
			webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 10);
			webDriverActions.softMouseHover(rephotoTabsLnk.get(j));
			webDriverActions.softHighlightElement(rephotoTabsLnk.get(j));
			webDriverActions.softClickJS(rephotoTabsLnk.get(j));
			webDriverActions.waitForSecond(1500);
			for(int i=0; i<rephotoArticleLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(rephotoArticleLnk.get(i));
				webDriverActions.softScrollToElement(rephotoArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", rephotoArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(rephotoArticleLnk.get(i));
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

				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 10);
				webDriverActions.softClickJS(rephotoTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyPhotoTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 20);
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<rephotoTabsLnk.size() ; j++)
		{
			webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 20);
			webDriverActions.softMouseHover(rephotoTabsLnk.get(j));
			webDriverActions.softHighlightElement(rephotoTabsLnk.get(j));
			webDriverActions.softClickJS(rephotoTabsLnk.get(j));
			webDriverActions.waitForSecond(2000);
			for(int i=0; i<rephotoImgLnk.size() ;i++)
			{
				webDriverActions.continuousScrollTillAllElement(rephotoImgLnk, 20);
				webDriverActions.softMouseHover(rephotoImgLnk.get(i));
				webDriverActions.softScrollToElement(rephotoImgLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", rephotoArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(rephotoImgLnk.get(i));
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
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForSecond(2000);
				webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 20);
				webDriverActions.softClickJS(rephotoTabsLnk.get(j));
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyPhotoTitleNavigation(String serveType)
	{
		verifyTitleNavigation( serveType , rephotoTitleLnk);
	}

	public void verifyPhotoReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 10);
		if(rephotoTabsLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<rephotoTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(rephotoTabsLnk, 20);
				webDriverActions.softMouseHover(rephotoTabsLnk.get(j));
				webDriverActions.softHighlightElement(rephotoTabsLnk.get(j));
				webDriverActions.softClickJS(rephotoTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				String actual = webDriverActions.getAttribute("href", rephotoReadMoreLnk);
				webDriverActions.softClickJS(rephotoReadMoreLnk);
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
				webDriverActions.softHighlightElement(rebollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

		//		verifyMoreNewsNavigation(serverType , rebollywoodReadMoreLnk, articleBreadCrumbDiv);

	}

	public void verifyNews18HindiPlusArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType , reNews18HindiPlusArticleLnk);
	}

	public void verifyNews18HindiPlusImageNavigation(String serveType)
	{
		verifyImageNavigation(serveType , reNews18HindiPlusImgLnk);
	}

	public void verifyNews18HindiPlusSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(reactiveNews18HindiPlusArticleLnk, 10);
		webDriverActions.softMouseHover(reNews18HindiPlusRightSliderBtn);
		webDriverActions.softScrollToElement(reactiveNews18HindiPlusArticleLnk);
		if(webDriverActions.isElementDisplayed(reNews18HindiPlusRightSliderBtn))
		{
			for(int i = 0 ; i< reNews18HindiPlusArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(reactiveNews18HindiPlusArticleLnk);
				webDriverActions.softScrollToElement(reactiveNews18HindiPlusArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveNews18HindiPlusArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(reNews18HindiPlusRightSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveNews18HindiPlusArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Right Slider Button Is Not Displayed ");
		}

		if(webDriverActions.isElementDisplayed(reNews18HindiPlusLeftSliderBtn))
		{
			for(int i = 0 ; i< reNews18HindiPlusArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(reactiveNews18HindiPlusArticleLnk);
				webDriverActions.softScrollToElement(reactiveNews18HindiPlusArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveNews18HindiPlusArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(reNews18HindiPlusLeftSliderBtn);
				webDriverActions.waitForSecond(2000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveNews18HindiPlusArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Left Slider Button Is Not Displayed ");
		}
		softAssert.assertAll("Issue in Homepage Body ");
	}


	//	public void verifyNews18HindiPlusOriginalBannerNavigation(String serverType)
	//	{
	//		SoftAssert softAssert =new SoftAssert();
	//		webDriverActions.waitForPageToLoad();
	//		webDriverActions.softScrollToElement(news18HindiPlusOriginalBannerLnk);
	//		webDriverActions.softMouseHover(news18HindiPlusOriginalBannerLnk);
	//		webDriverActions.softClickJS(news18HindiPlusOriginalBannerLnk);
	//		webDriverActions.waitForSecond(2000);
	//		String currentPage = webDriverActions.getCurrentPageUrl();
	//		Logs.info(getClass(), currentPage);
	//		if (serverType.equalsIgnoreCase("preProd")) {
	//			String betaUrl = genericUtility.replaceInUrl(currentPage);
	//			webDriverActions.navigateToUrl(betaUrl);
	//			currentPage=betaUrl;
	//		}
	//		else {
	//			currentPage = webDriverActions.getCurrentPageUrl();
	//		}
	//		webDriverActions.waitForPageToLoad();
	//		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
	//		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in "+currentPage);
	//		softAssert.assertAll("Issue in Homepage Body ");
	//	}

	//	public void verifyCricketDhamalNavigation(String serverType)
	//	{
	//		SoftAssert softAssert =new SoftAssert();
	//		webDriverActions.waitForPageToLoad();
	//		webDriverActions.softScrollToElement(cricketDhamalImgLnk);
	//		webDriverActions.softMouseHover(cricketDhamalImgLnk);
	//		webDriverActions.softClickJS(cricketDhamalImgLnk);
	//		webDriverActions.waitForSecond(2000);
	//		String currentPage = webDriverActions.getCurrentPageUrl();
	//		Logs.info(getClass(), currentPage);
	//		if (serverType.equalsIgnoreCase("preProd")) {
	//			String betaUrl = genericUtility.replaceInUrl(currentPage);
	//			webDriverActions.navigateToUrl(betaUrl);
	//			currentPage=betaUrl;
	//		}
	//		else {
	//			currentPage = webDriverActions.getCurrentPageUrl();
	//		}
	//		webDriverActions.waitForPageToLoad();
	//		webDriverActions.softHighlightElement(articleBreadCrumbDiv);
	//		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element "+currentPage);
	//		softAssert.assertAll("Issue in Homepage Body ");
	//	}



	public void verifyCricketTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , recricketTitleLnk);
	}




	public void verifyBollywoodTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 10);
		if(rebollywoodTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(rebollywoodTabsLnk.get(0));
			webDriverActions.softMouseHover(rebollywoodTabsLnk.get(0));
			for(int j =0 ; j<rebollywoodTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 10);
				webDriverActions.softHighlightElement(rebollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				for(int i=0; i<rebollywoodArticleLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(rebollywoodArticleLnk, 10);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(rebollywoodArticleLnk.get(i));
					webDriverActions.softScrollToElement(rebollywoodArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", rebollywoodArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(rebollywoodArticleLnk.get(i));
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
					webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 10);
					webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
					webDriverActions.waitForSecond(2000);
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
		webDriverActions.continuousScrollTillAllElement(rebollywoodImgLnk, 20);
		if(rebollywoodTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(rebollywoodTabsLnk.get(0));
			webDriverActions.softMouseHover(rebollywoodTabsLnk.get(0));
			for(int j =0 ; j<rebollywoodTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 20);
				webDriverActions.softHighlightElement(rebollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(rebollywoodImgLnk.size()>0, "Possibly Article Size is Not Visible in Bollywood Tabs");
				for(int i=0; i<rebollywoodImgLnk.size() ;i++)
				{
					webDriverActions.continuousScrollTillAllElement(rebollywoodImgLnk, 20);
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(rebollywoodImgLnk.get(i));
					webDriverActions.softScrollToElement(rebollywoodImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", rebollywoodImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClick(rebollywoodImgLnk.get(i));
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
					webDriverActions.continuousScrollTillAllElement(rebollywoodImgLnk, 10);
					webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+rebollywoodTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBollywoodReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 10);
		if(rebollywoodTabsLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<rebollywoodTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(rebollywoodTabsLnk, 20);
				webDriverActions.softMouseHover(rebollywoodTabsLnk.get(j));
				webDriverActions.softHighlightElement(rebollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				String actual = webDriverActions.getAttribute("href", rebollywoodReadMoreLnk);
				webDriverActions.softClickJS(rebollywoodReadMoreLnk);
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
				webDriverActions.softHighlightElement(rebollywoodTabsLnk.get(j));
				webDriverActions.softClickJS(rebollywoodTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

		//		verifyMoreNewsNavigation(serverType , rebollywoodReadMoreLnk, articleBreadCrumbDiv);
	}

	public void verifyBollywoodTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , rebollywoodTitleLnk);
	}

	public void verifyWebstoriesSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.softMouseHover(rewebstoriesTitleLnk);
		webDriverActions.softScrollToElement(rewebstoriesTitleLnk);
		if(webDriverActions.isElementDisplayed(webstoriesLeftArrowBtn))
		{
			for(int i = 0 ; i< rewebstoriesArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(reactiveWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(reactiveWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesLeftArrowBtn);
				webDriverActions.softClickJS(webstoriesLeftArrowBtn);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveWebstoriesArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Webstories Left Slider Button Is Not Displayed ");
		}
		if(webDriverActions.isElementDisplayed(webstoriesRightArrowBtn))
		{
			for(int i = 0 ; i< rewebstoriesArticleLnk.size() ; i++)
			{
				webDriverActions.softMouseHover(reactiveWebstoriesArticleLnk);
				webDriverActions.softScrollToElement(reactiveWebstoriesArticleLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveWebstoriesArticleLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softHighlightElement(webstoriesRightArrowBtn);
				webDriverActions.softClickJS(webstoriesRightArrowBtn);
				webDriverActions.waitForSecond(000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveWebstoriesArticleLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working ");
			}
		}
		else
		{
			softAssert.fail("Possibly Webstories Right Slider Button Is Not Displayed ");
		}
	}

	public void verifyWebstoriesTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , rewebstoriesTitleLnk);
	}

	public void verifyWebstoriesReadMoreNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, webstoriesReadMoreLnk);
	}


	public void verifyMoneyTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(remoneyTabsLnk, 10);
		webDriverActions.softMouseHover(remoneyTitleLnk);
		webDriverActions.waitForSecond(2000);
		for(int j =0 ; j<remoneyTabsLnk.size() ; j++)
		{
			webDriverActions.softScrollToElement(remoneyTabsLnk.get(j));
			webDriverActions.softMouseHover(remoneyTabsLnk.get(j));
			webDriverActions.softHighlightElement(remoneyTabsLnk.get(j));
			webDriverActions.softClickJS(remoneyTabsLnk.get(j));
			webDriverActions.waitForSecond(000);
			for(int i=0; i<remoneyArticleLnk.size() ;i++)
			{
				webDriverActions.waitForSecond(1000);
				webDriverActions.softMouseHover(remoneyArticleLnk.get(i));
				webDriverActions.softScrollToElement(remoneyArticleLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", remoneyArticleLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(remoneyArticleLnk.get(i));
				webDriverActions.waitForPageToLoad();
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
				webDriverActions.waitForPageToLoad();
				int response = genericUtility.checkLinks(currentPage);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.continuousScrollTillAllElement(remoneyTabsLnk, 10);
				webDriverActions.softClickJS(remoneyTabsLnk.get(j));
				webDriverActions.waitForPageToLoad();
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , remoneyTitleLnk);
	}

	public void verifyMoneyTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// // String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(remoneyImgLnk, 20);
		if(remoneyTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(remoneyTabsLnk.get(0));
			webDriverActions.softMouseHover(remoneyTabsLnk.get(0));
			for(int j =0 ; j<remoneyTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(remoneyTabsLnk.get(j));
				webDriverActions.softClickJS(remoneyTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<remoneyImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(remoneyImgLnk.get(i));
					webDriverActions.softScrollToElement(remoneyImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", remoneyImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(remoneyImgLnk.get(i));
					webDriverActions.waitForPageToLoad();
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
					webDriverActions.waitForPageToLoad();
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
					webDriverActions.continuousScrollTillAllElement(remoneyImgLnk, 20);
					webDriverActions.softClickJS(remoneyTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+remoneyImgLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyMoneyControlNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(remoneyControlLnk, 20);
		webDriverActions.softScrollToElement(remoneyControlLnk);
		webDriverActions.softMouseHover(remoneyControlLnk);
		String actual = webDriverActions.getAttribute("href", remoneyControlLnk);
		webDriverActions.softClickJS(remoneyControlLnk);
		//		webDriverActions.switchToNewWindow();
		webDriverActions.waitForSecond(1000);
		String currentPage =webDriverActions.getCurrentPageUrl();
		Logs.info(getClass(), currentPage);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(moneyControlLogo), "Possibly Page Content is Not Visible in "+currentPage);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
		//		softAssert.assertTrue(genericUtility.compareUrlSub(actual, currentPage), "Possibly not navigate to same page "+actual);
		softAssert.assertAll("Issue in Homepage Body ");
	}

	public void verifyMoneyReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(reMoneyTabsLnk, 10);
		if(reMoneyTabsLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<reMoneyTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(reMoneyTabsLnk, 20);
				webDriverActions.softMouseHover(reMoneyTabsLnk.get(j));
				webDriverActions.softHighlightElement(reMoneyTabsLnk.get(j));
				String actual = webDriverActions.getAttribute("href", remoneyReadMoreNewsLnk);
				webDriverActions.softClickJS(reMoneyTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				webDriverActions.softClickJS(remoneyReadMoreNewsLnk);
				webDriverActions.waitForSecond(1000);
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
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelTitleNavigation(String serverType)
	{
		verifyTitleNavigation(serverType , rebodySportsTitleLnk);
	}

	public void verifyBodyKhelTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rebodyKhelTabsLnk, 20);
		if(rebodyKhelTabsLnk.size()>0)
		{
			webDriverActions.softScrollToElement(rebodyKhelTabsLnk.get(0));
			webDriverActions.softMouseHover(rebodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<rebodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(rebodyKhelTabsLnk, 20);
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(rebodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				for(int i=0; i<rebodySportsArticleLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(rebodySportsArticleLnk.get(i));
					webDriverActions.softScrollToElement(rebodySportsArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", rebodySportsArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(rebodySportsArticleLnk.get(i));
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
					softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.continuousScrollTillAllElement(rebodyKhelTabsLnk, 20);
					webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
					webDriverActions.waitForSecond(1000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyBodyKhelTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rebodySportsArticleLnk, 10);
		if(rebodyKhelTabsLnk.size()>1)
		{
			webDriverActions.softMouseHover(rebodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<rebodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(rebodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<rebodySportsImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(rebodySportsImgLnk.get(i));
					webDriverActions.softScrollToElement(rebodySportsImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", rebodySportsImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.waitForSecond(2000);
					webDriverActions.softClickJS(rebodySportsImgLnk.get(i));
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
					//					softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
					// webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.waitForPageToLoad();
					webDriverActions.continuousScrollTillAllElement(rebodySportsArticleLnk, 10);
					webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
					webDriverActions.waitForPageToLoad();
				}
			}
		}
		else
		{
			softAssert.fail("Possibly Element is not Visible or Size is "+rebodyKhelTabsLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body ");
	}

	public void verifyBodyKhelReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(rebodySportsArticleLnk, 10);
		if(rebodyKhelTabsLnk.size()>1)
		{
			webDriverActions.softMouseHover(rebodyKhelTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<rebodyKhelTabsLnk.size() ; j++)
			{
				webDriverActions.softHighlightElement(rebodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				String actual =webDriverActions.getAttribute("href", rebodyKhelReadMoreLnk);
				webDriverActions.softClickJS(rebodyKhelReadMoreLnk);
				webDriverActions.waitForSecond(2000);
				String currentPage =  webDriverActions.getCurrentPageUrl();
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
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillAllElement(rebodySportsArticleLnk, 10);
				webDriverActions.softHighlightElement(rebodyKhelTabsLnk.get(j));
				webDriverActions.softClickJS(rebodyKhelTabsLnk.get(j));
			}
		}
		softAssert.assertAll("Issue Found In Homepage Body ");
	}

	public void verifyLatestMobileNewsArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , relatestMobileNewsArticleLnk);
	}

	public void verifyLatestMobileNewsImageNavigation(String serverType)
	{
		verifyImageNavigation(serverType , relatestMobileNewsImgLnk);
	}

	public void verifyLatestMobileMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType , relatestMobileNewsMoreNewsLnk);
	}

	public void verifyMobileBrandsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType , remobileBrandsLnk);
	}

	public void verifyTrendingAndRecommendedSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(retrendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(retrendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.waitForSecond(1000);
		if(retrendindAndRecommendedStoriesLnk.size()>0)
		{
			for(int i =0 ; i<retrendindAndRecommendedStoriesLnk.size();i++)
			{
				webDriverActions.softMouseHover(reactiveTrendindAndRecommendedStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(retrendindAndRecommendedForwordSlider);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveTrendindAndRecommendedStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Trending and Recommended Mobile Section ");
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+retrendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyTrendingAndRecommendedStoriesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(retrendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(retrendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.waitForSecond(1000);
		if(retrendindAndRecommendedStoriesLnk.size()>0)
		{
			for(int i=0; i<retrendindAndRecommendedStoriesLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(retrendindAndRecommendedStoriesLnk.get(i));
				webDriverActions.softScrollToElement(retrendindAndRecommendedStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", retrendindAndRecommendedStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.waitForSecond(2000);
				webDriverActions.softClickJS(retrendindAndRecommendedStoriesLnk.get(i));
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(retrendingAndRecommendedMobileTabLnk, 10);
				webDriverActions.softClickJS(retrendingAndRecommendedMobileTabLnk);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+retrendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyTrendingAndRecommendedMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(retrendingAndRecommendedMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(retrendingAndRecommendedMobileTabLnk), "Possibly Trending and Recommended Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.softClickJS(retrendingAndRecommendedMobileTabLnk);
		webDriverActions.waitForSecond(1000);
		if(retrendindAndRecommendedReadMoreLnk.size()>0)
		{
			for(int i=0; i<retrendindAndRecommendedReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(retrendindAndRecommendedReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(retrendindAndRecommendedReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", retrendindAndRecommendedReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(retrendindAndRecommendedReadMoreLnk.get(i));
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(retrendingAndRecommendedMobileTabLnk, 10);
				webDriverActions.softClickJS(retrendingAndRecommendedMobileTabLnk);
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+retrendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}


	public void verifyUpcomingMobileSliderNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(resoonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(resoonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(resoonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(resoonUpcomingMobileTabLnk);
		webDriverActions.waitForSecond(2000);
		if(webDriverActions.softIsElementDisplayed(reupcomingMobileForwordSlider))
		{
			for(int i =0 ; i<reupcomingMobileStoriesLnk.size();i++)
			{
				webDriverActions.softMouseHover(reactiveUpcomingMobileStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveUpcomingMobileStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(reupcomingMobileForwordSlider);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveUpcomingMobileStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Soon Upcoming Mobile Section");
			}
		}
		else
		{
			softAssert.fail("Possibly Soon Upcoming Mobile Forward Slider is Not Working ");
		}
		if(webDriverActions.softIsElementDisplayed(reupcomingMobileBackwordSlider))
		{
			for(int i =0 ; i<reupcomingMobileStoriesLnk.size();i++)
			{
				webDriverActions.softMouseHover(reactiveUpcomingMobileStoriesLnk);
				String beforeSlide = webDriverActions.getTextFromElement(reactiveUpcomingMobileStoriesLnk);
				Logs.info(getClass(), beforeSlide);
				webDriverActions.softClickJS(reupcomingMobileBackwordSlider);
				webDriverActions.waitForSecond(1000);
				String afterSlide = webDriverActions.getTextFromElement(reactiveUpcomingMobileStoriesLnk);
				Logs.info(getClass(), afterSlide);
				softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Slider is Not Working for Soon Upcoming Mobile Section");
			}
		}
		else
		{
			softAssert.fail("Possibly Soon Upcoming Mobile Backword Slider is Not Working ");
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	public void verifyUpcomingMobileStoriesNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(resoonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(resoonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(resoonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(resoonUpcomingMobileTabLnk);
		if(reupcomingMobileStoriesLnk.size()>0)
		{
			for(int i=0; i<reupcomingMobileStoriesLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(reupcomingMobileStoriesLnk.get(i));
				webDriverActions.softScrollToElement(reupcomingMobileStoriesLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", reupcomingMobileStoriesLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(reupcomingMobileStoriesLnk.get(i));
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(resoonUpcomingMobileTabLnk, 10);
				webDriverActions.softClickJS(resoonUpcomingMobileTabLnk);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible or Size is "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyUpcomingMobileReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillElement(resoonUpcomingMobileTabLnk, 10);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(resoonUpcomingMobileTabLnk), "Possibly Soon Upcoming Mobile Tab is Not Visible ");
		webDriverActions.softHighlightElement(resoonUpcomingMobileTabLnk);
		webDriverActions.softClickJS(resoonUpcomingMobileTabLnk);
		webDriverActions.waitForSecond(1000);
		if(reupcomingMobileReadMoreLnk.size()>0)
		{
			for(int i=0; i<reupcomingMobileReadMoreLnk.size() ;i++)
			{
				webDriverActions.softMouseHover(reupcomingMobileReadMoreLnk.get(i));
				webDriverActions.softScrollToElement(reupcomingMobileReadMoreLnk.get(i));
				String actual =	webDriverActions.getAttribute("href", reupcomingMobileReadMoreLnk.get(i));
				Logs.info(getClass(), actual);
				webDriverActions.softClickJS(reupcomingMobileReadMoreLnk.get(i));
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
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(resoonUpcomingMobileTabLnk, 10);
				webDriverActions.softClickJS(resoonUpcomingMobileTabLnk);
			}
		}
		else
		{
			softAssert.fail("Possibly Trending and Recommended Mobile Read More is not Visible "+trendindAndRecommendedStoriesLnk.size());
		}
		softAssert.assertAll("Issues Found in Homepage Body");
	}

	public void verifyMobileTechTabsArticleNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(remobileTechTabsLnk, 10);
		if(remobileTechTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(remobileTechTabsLnk.get(0));
			webDriverActions.softMouseHover(remobileTechTabsLnk.get(0));
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<remobileTechTabsLnk.size() ; j++)
			{
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(remobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				softAssert.assertTrue(remobileTechArticleLnk.size()>0, "Possibly Mobile Tech Article Links is Not Visible ");
				for(int i=0; i<remobileTechArticleLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(remobileTechArticleLnk.get(i));
					webDriverActions.softScrollToElement(remobileTechArticleLnk.get(i));
					String actual =	webDriverActions.getAttribute("href", remobileTechArticleLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(remobileTechArticleLnk.get(i));
					webDriverActions.waitForSecond(1000);
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
					webDriverActions.waitForPageToLoad();
					webDriverActions.continuousScrollTillAllElement(remobileTechTabsLnk, 10);
					webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyMobileTechTabsImageNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(remobileTechTabsLnk, 20);
		if(remobileTechTabsLnk.size()>1)
		{
			webDriverActions.softScrollToElement(remobileTechTabsLnk.get(0));
			webDriverActions.softMouseHover(remobileTechTabsLnk.get(0));
			webDriverActions.waitForSecond(2000);
			for(int j =0 ; j<remobileTechTabsLnk.size() ; j++)
			{
				//			webDriverActions.softScrollToElement(photoTabsLnk.get(j));
				//			webDriverActions.softMouseHover(photoTabsLnk.get(j));
				webDriverActions.softHighlightElement(remobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(2000);
				for(int i=0; i<remobileTechImgLnk.size() ;i++)
				{
					webDriverActions.waitForSecond(1000);
					webDriverActions.softMouseHover(remobileTechImgLnk.get(i));
					webDriverActions.softScrollToElement(remobileTechImgLnk.get(i));
					String actual =	webDriverActions.getAttribute("src", remobileTechImgLnk.get(i));
					Logs.info(getClass(), actual);
					webDriverActions.softClickJS(remobileTechImgLnk.get(i));
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
					webDriverActions.waitForPageToLoad();
					int response = genericUtility.checkLinks(currentPage);
					softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
					// // webDriverActions.navigateToUrl(homeUrl);
					if (currentPage.contains(expectedUrl)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}	
					webDriverActions.waitForPageToLoad();
					webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
					webDriverActions.waitForSecond(2000);
				}
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

	}

	public void verifyMobileTechReadMoreNavigation(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		// String homeUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(remobileTechTabsLnk, 10);
		if(remobileTechTabsLnk.size()>1)
		{
			webDriverActions.waitForSecond(1000);
			for(int j =0 ; j<remobileTechTabsLnk.size() ; j++)
			{
				webDriverActions.continuousScrollTillAllElement(remobileTechTabsLnk, 20);
				webDriverActions.softMouseHover(remobileTechTabsLnk.get(j));
				webDriverActions.softHighlightElement(remobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
				String actual = webDriverActions.getAttribute("href", remobileTechReadMoreLnk);
				webDriverActions.softClickJS(remobileTechReadMoreLnk);
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
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentPage+" And Status Code is "+response);
				softAssert.assertTrue(genericUtility.compareUrlSub(actual, expectedUrl), "Possibly not navigate to same page "+actual);
				// webDriverActions.navigateToUrl(homeUrl);
				if (currentPage.contains(expectedUrl)) {
					webDriverActions.navigateBack();
				}
				else {
					webDriverActions.navigateBack();
					webDriverActions.navigateBack();
				}	
				webDriverActions.softHighlightElement(remobileTechTabsLnk.get(j));
				webDriverActions.softClickJS(remobileTechTabsLnk.get(j));
				webDriverActions.waitForSecond(1000);
			}
		}
		softAssert.assertAll("Issue Found in Homepage Body ");

		//		verifyMoreNewsNavigation(serverType , rebollywoodReadMoreLnk, articleBreadCrumbDiv);

		//		verifyMoreNewsNavigation(serveType , remobileTechReadMoreLnk);
	}

	public void verifyMobileTechTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , remobileTechTitleLnk);
	}

	public void verifyAjabGajabArticleNavigation(String serveType)
	{
		verifyArticleNavigation(serveType , ajabGajabArticleLnk);
	}

	public void verifyAjabGajabImageNavigation(String serveType) 
	{
		verifyImageNavigation(serveType , ajabGajabImgLnk);
	}

	public void verifyAjabGajabReadMoreNavigation(String serveType)
	{
		verifyMoreNewsNavigation(serveType , ajabGajabReadMoreLnk);
	}

	public void verifyAjabGajabTitleNavigation(String serveType)
	{
		verifyTitleNavigation(serveType , ajabGajabTitleLnk);
	}

	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void pradeshNewsCityNames(String serverType)
	{
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(stateCityNamesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < stateCityNamesLnks.size(); i++) {
			webDriverActions.mouseHoverAndClick(stateCityNamesLnks.get(i));
			webDriverActions.waitForPageToLoad();
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
				webDriverActions.mouseHoverAndClick(stateCityNamesLnks.get(i));
				webDriverActions.waitForPageToLoad();
			}
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			webDriverActions.navigateToUrl(parent);
			webDriverActions.waitForPageToLoad();
			webDriverActions.softScrollToElement(pradeshNews);
		}
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesWiseArticles(String serverType)
	{
		SoftAssert softAssert =new SoftAssert();
		HomePageLinksValidation http = new HomePageLinksValidation(driver);
		webDriverActions.waitForPageToLoad();
		webDriverActions.softScrollToElement(pradeshStatesLnks.get(0));
		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		ArrayList<String> articleList = new ArrayList<>();
		webDriverActions.waitForElement(1000);

		for (int i = 0; i <pradeshStatesLnks.size() ;i++) {
			webDriverActions.softMouseHover(pradeshStatesLnks.get(i));
			webDriverActions.softHighlightElement(pradeshStatesLnks.get(i));
			webDriverActions.softClickJS(pradeshStatesLnks.get(i));
			webDriverActions.waitForSecond(2000);
			for (int j = 0; j < stateArticleLnks.size();j++) {
				String aticleLink = stateArticleLnks.get(j).getAttribute("href");
				if (serverType.equalsIgnoreCase("preProd")) {
					String betaUrl = genericUtility.replaceInUrl(aticleLink);	
					articleList.add(betaUrl);
				}
			}
			//			webDriverActions.softClickJS(kannadaSectionNextBtn);
		}
		Logs.info(getClass(),"Total Links "+articleList.size());
		long startingTime= System.currentTimeMillis();
		articleList.parallelStream().forEach(e -> http.checkLinks(e));
		long endingTime= System.currentTimeMillis();
		Logs.info(getClass(),"  Total time  "+(endingTime-startingTime)/1000 +"s");
		softAssert.assertAll("Issue present in this Url : "+webDriverActions.getCurrentPageUrl()+" "+" are below ");
	}

	/**
	 * @author DanishR
	 * This method is used to click and navigate to pradesh news states and its articles
	 */
	public void pradeshNewsStatesArticleMoreNews(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softMouseHover(pradeshNews);
		softAssert.assertTrue(pradeshStatesLnks.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		webDriverActions.waitForSecond(2000);
		webDriverActions.softMouseHover(pradeshNewsMoreLinks);
		webDriverActions.softHighlightElement(pradeshNewsMoreLinks);
		webDriverActions.softClickJS(pradeshNewsMoreLinks);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		if (serverType.contains("preProd")) {
			String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
			webDriverActions.navigateToUrl(betaUrl);
			currentPageUrl=betaUrl;
		}
		webDriverActions.softHighlightElement(articleBreadcrumb);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
		softAssert.assertAll("Issues Found In Validating Pradesh News Articles More News Present on HomePage");
	}

	/**
	 * @author DanishR
	 * This method is used to click and naviagte to pradesh news and Rajya Lists
	 */
	public void verifyPradeshNewsRajyaList(String serverType)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(pradeshNews,GlobalVariables.sec60);
		webDriverActions.softScrollToElement(rajyaChuneLnk);
		webDriverActions.waitForSecond(1000);
		webDriverActions.softMouseHover(rajyaChuneLnk);
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(rajyaChuneStateList.size()>0, "Possibly Element is Not Visible "+webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < rajyaChuneStateList.size(); i++) {
			webDriverActions.softClickJS(rajyaChuneStateList.get(i));
			webDriverActions.waitForPageToLoad();
			String expectedPageUrl = webDriverActions.getCurrentPageUrl();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			if (serverType.contains("preProd")) {
				String betaUrl = genericUtility.replaceInUrl(currentPageUrl);
				webDriverActions.navigateToUrl(betaUrl);
				currentPageUrl=betaUrl;
			}
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadcrumb), "Possibly Element is Not Visible "+currentPageUrl);
			if (expectedPageUrl.equalsIgnoreCase(currentPageUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(2000);
			webDriverActions.softMouseHover(rajyaChuneLnk);
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}


	//-------------Anupam--Business--Logic--Methods-------------------------------

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
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);

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
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);

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
		}
		softAssert.assertAll("Issue Found in HomePage Body or RHS Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk, WebElement breadcrumb) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);

		webDriverActions.continuousScrollTillElement(moreLnk, 8);	
		//		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(moreLnk),"Unable to Display Element "+"\t"+moreLnk+ " in "+homePage);
		String actualUrl =	webDriverActions.getAttribute("href", moreLnk);
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
		//		webDriverActions.waitForSecond(2000);
		boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
		softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertFalse(currentPage.equalsIgnoreCase(homePage) , "Possibly it is on the home page"+"\t"+currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
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
	public void verifySectionLnks(String serverType,WebElement section, WebElement breadcrumb) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);
		webDriverActions.continuousScrollTillElement(section, 8);	
		//		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);

		Assert.assertTrue(webDriverActions.softIsElementDisplayed(section),"Unable to Display Element "+"\t"+section+ " in "+homePage);
		String actualUrl =	webDriverActions.getAttribute("href", section);
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
		boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
		softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
		int response = genericUtility.checkLinks(currentPage);
		softAssert.assertFalse(currentPage.equalsIgnoreCase(homePage) , "Possibly it is on the home page"+"\t"+currentPage);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		webDriverActions.waitForSecond(100);
		webDriverActions.navigateBack();

		softAssert.assertAll("Issue Found in HomePage Body or RHS Section Link");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation in home page
	 * @param serverType
	 * @param section
	 * @param artList
	 */
	public void verifyJournalistProfileNavigation(String serverType,WebElement section ,List<WebElement> artList, WebElement element)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
		webDriverActions.softScrollToElement(videoSectionRevAmpLnk);

		webDriverActions.continuousScrollTillElement(section, 8);
		//		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		//		webDriverActions.softHighlightElement(section);
		webDriverActions.waitForElement(1000);
		Assert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			//			webDriverActions.softMouseHover(artList.get(i));
			webDriverActions.softScrollToElement(artList.get(i));
			String actualUrl =	webDriverActions.getAttribute("href", artList.get(i));
			String name="";
			if(journalistProfileRevAmpTxt.size()>0) {
				name = webDriverActions.getTextFromElementJS(journalistProfileRevAmpTxt.get(i)) ;
			}
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
			int response = genericUtility.checkLinks(currentPage);
			boolean status=genericUtility.compareUrlSub(actualUrl, currentPage);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+actualUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
			if(response==200)
			{	softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +" in "+currentPage);
			softAssert.assertTrue((webDriverActions.getTextFromElement(authorNameRevAmpTxt)).equals(name), "Possibly Navigate to other page "+ "\t"+name+ "\t"+currentPage);
			}
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

	//---nation	

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


	//-----World

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	public void verifyWorldWidget(String serverType) {
		verifySectionLnks(serverType,worldSectionRevAmpLnk, worldRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,worldSectionRevAmpLnk,worldSectionArticleRevAmpLnk, worldRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigation(serverType,worldSectionRevAmpLnk,worldSectionImgRevAmpLnk, worldRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreWorldSectionRevAmpLnk, worldRevAmpBreadcrumb);
	}



	//-----Life

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


	//-----Dharm

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget
	 */
	public void verifyDharmWidget(String serverType) {
		verifySectionLnks(serverType,dharmSectionRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	public void verifyDharmWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,dharmSectionRevAmpLnk,dharmSectionArticleRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Image
	 */
	public void verifyDharmWidgetImg(String serverType) {
		verifyImgNavigation(serverType,dharmSectionRevAmpLnk,dharmSectionImgRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Dharm News
	 */
	public void verifyMoreDharmLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreDharmSectionRevAmpLnk, dharmRevAmpBreadcrumb);
	}


	//-----Crime

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget
	 */
	public void verifyCrimeWidget(String serverType) {
		verifySectionLnks(serverType,crimeSectionRevAmpLnk, crimeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	public void verifyCrimeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,crimeSectionRevAmpLnk,crimeSectionArticleRevAmpLnk, crimeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Image
	 */
	public void verifyCrimeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,crimeSectionRevAmpLnk,crimeSectionImgRevAmpLnk, crimeRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Crime News
	 */
	public void verifyMoreCrimeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCrimeSectionRevAmpLnk, crimeRevAmpBreadcrumb);
	}

	//-----FooterSport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	public void verifyFooterSportWidget(String serverType) {
		verifySectionLnks(serverType,footerSportSectionRevAmpLnk, footerSportRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	public void verifyFooterSportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,footerSportSectionRevAmpLnk,footerSportSectionArticleRevAmpLnk, footerSportRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	public void verifyFooterSportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,footerSportSectionRevAmpLnk,footerSportSectionImgRevAmpLnk, footerSportRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	public void verifyMoreFooterSportLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreFooterSportSectionRevAmpLnk, footerSportRevAmpBreadcrumb);
	}

	//-----Knowledge
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	public void verifyKnowledgeWidget(String serverType) {
		verifySectionLnks(serverType,knowledgeSectionRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	public void verifyKnowledgeWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,knowledgeSectionRevAmpLnk,knowledgeSectionArticleRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	public void verifyKnowledgeWidgetImg(String serverType) {
		verifyImgNavigation(serverType,knowledgeSectionRevAmpLnk,knowledgeSectionImgRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	public void verifyMoreKnowledgeLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreKnowledgeSectionRevAmpLnk, knowledgeRevAmpBreadcrumb);
	}


	//-----Career

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyCareerWidget(String serverType) {
		verifySectionLnks(serverType,careerSectionRevAmpLnk, careerRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	public void verifyCareerWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,careerSectionRevAmpLnk,careerSectionArticleRevAmpLnk, careerRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Image
	 */
	public void verifyCareerWidgetImg(String serverType) {
		verifyImgNavigation(serverType,careerSectionRevAmpLnk,careerSectionImgRevAmpLnk, careerRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	public void verifyMoreCareerLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreCareerSectionRevAmpLnk, careerRevAmpBreadcrumb);
	}
	//------Blog

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	public void verifyBlogWidget(String serverType) {
		verifySectionLnks(serverType,blogSectionRevAmpLnk, blogRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	public void verifyMoreBlogLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreBlogSectionRevAmpLnk, blogRevAmpBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Article
	 */
	public void verifyBlogWidgetArticle(String serverType) {
		verifyJournalistProfileNavigation(serverType,blogSectionRevAmpLnk,journalistArticleRevAmpLnk, blogRevAmpBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget Image
	 */
	public void verifyBlogWidgetJournalistProfileLnk(String serverType) {
		verifyJournalistProfileNavigation(serverType,blogSectionRevAmpLnk,journalistProfileRevAmpLnk, blogRevAmpBreadcrumb);
	}


	//video
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
	 * This method is used to validate navigation of More Nation News
	 */
	public void verifyMoreVideoLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreVideoSectionRevAmpLnk, videoRevAmpBreadcrumb);
	}


}
