package com.news18.commonpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.DriverUtility;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MobileHindiRevampArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public MobileHindiRevampArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	//===============================common Elements =======================================

	/*common Section Articles */
	@FindBy(xpath="//div[contains(@class,'topnew')]/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))] | //ul[contains(@class,'topstories')]/li/a[ (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement>  commonsectionArticleELeList;

	/*Cricket Section Articles */
	@FindBy(xpath="(//div[contains(@class,'CN-storyWrap')])[1]//a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  cricketSectionArticleELeList;

	/*LifeStyle Section Articles */
	@FindBy(xpath="(//ul[contains(@class,'spcnwslist')])[1]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement> mobileSectionArticleELeList;

	/*Podcast Section Articles */
	@FindBy(xpath="//div[contains(@class,'podcast_box')]/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  podcastSectionArticleELeList;

	/*LiveTv Section Articles */
	@FindBy(xpath="(//div[contains(@class,'newtdwdgt-story')])[1]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  liveTvSectionArticleELeList;

	//===============================common Photo Elements =======================================

	/*common Section Articles */
	@FindBy(xpath="//div[contains(@class,'topnew')]/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))] | //ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement>  commonsectionPhotoArticleELeList;

	/*Photo Section Articles */
	@FindBy(xpath="//div[contains(@class,'chmpntpnwshd')]//a")
	private List<WebElement>  photoSectionPhotoArticleELeList;

	/*Cricket Section Articles */
	@FindBy(xpath="(//div[contains(@class,'CN-Topstory')])[1]//li/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  cricketSectionPhotoArticleELeList;

	/*LifeStyle Section Articles */
	@FindBy(xpath="(//ul[contains(@class,'spcnwslist')])[1]/li/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement> mobileSectionPhotoArticleELeList;

	/*Podcast Section Articles */
	@FindBy(xpath="//div[contains(@class,'podcast_box')]/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  podcastSectionPhotoArticleELeList;

	/*LiveTv Section Articles */
	@FindBy(xpath="(//div[contains(@class,'newtdwdgt-story')])[1]//a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) ]")
	private List<WebElement>  liveTvSectionPhotoArticleELeList;

	//================================DanishR Elements----------------------------------

	/*common Section PhotoGallery Articles */
	@FindBy(xpath="//div[contains(@class,'topnew')]/a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))]")
	private List<WebElement>  commonLineOnePhotoGalleryArticleELeList;

	/*MobileSection Section PhotoGallery Articles */
	@FindBy(xpath="(//ul[contains(@class,'spcnwslist')])[1]/li/a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))]")
	private List<WebElement> mobileLineOnePhotoGalleryArticleELeList;

	/*Cricket Section Articles */
	@FindBy(xpath="(//div[contains(@class,'CN-Topstory')])[1]//li/a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))]")
	private List<WebElement>  cricketLineOnePhotoGalleryArticleELeList;

	/*LiveTv Section Articles */
	@FindBy(xpath="(//div[contains(@class,'newtdwdgt-story')])[1]//a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))]")
	private List<WebElement>  liveTvLineOnePhotoGalleryArticleELeList;

	/*Podcast Section Articles */
	@FindBy(xpath="(//div[contains(@class,'podcast_section_left')])[1]//a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))]")
	private List<WebElement>  podcastLineOnePhotoGalleryArticleELeList;

	/*Photo Section Articles Button in Article Consumption Page */
	@FindBy(xpath="//div[contains(@class,'glide__bullets ')]//button")
	private List<WebElement>  photoSectionArticleButton;

	/*Photo Section Articles in Article Consumption Page */
	@FindBy(xpath="//ul[contains(@class,'custom_glide__slides ')]/li[contains(@class,'active')]//div[contains(@class,'heading')]//a")
	private WebElement  photoSectionActiveArticle;

	// Money Article Links in Money Page //
	@FindBy(xpath = "(//ul[contains(@class,'nwctgrnewsstorieswithphoto')])[2]//li//a[contains(@href,'/nation/')]")
	private List<WebElement> latestArticleLnk;

	// Money Article Links in Money Page //
	@FindBy(xpath = "(//ul[contains(@class,'nwctgrnewsstorieswithphoto')])[1]//li//a[contains(@href,'/business/')]")
	private List<WebElement> moneyArticleLnk;

	/* photo Title present at the */
	@FindBy(xpath ="//div//h2//a[contains(@href,'/photo')]")
	private WebElement photoTitle;

	/* photo Article Links present at the */
	@FindBy(xpath ="//ul[contains(@class,'newrgtphotolist')]//li//a")
	private List<WebElement> photoArticleLinks;

	/* photo more news link present at the */
	@FindBy(xpath ="//div[contains(@class,'newpwhitebgbtn')]//a")
	private WebElement photoMoreLink;

	/* Top Story Title present at the */
	@FindBy(xpath ="//div//h2//a[contains(@href,'latest-news')]")
	private WebElement topStoryTitle;

	/* Top Story Article Links present at the */
	@FindBy(xpath ="//div[contains(@class,'story_widget')]//ul//li//a")
	private List<WebElement> topStoryArticleLinks;

	/* Top Story more news link present at the */
	@FindBy(xpath ="//div[contains(@class,'story_widget')]/a")
	private WebElement topStoryMoreLink;

	/* Trending Title present at the */
	@FindBy(xpath ="//div//h2[contains(@class,'trndstoryhd')]")
	private WebElement trendingTitle;

	/* Trending Article Links present at the */
	@FindBy(xpath ="//div[contains(@class,'trndstory')]//ul//li//a")
	private List<WebElement> trendingArticleLinks;

	/* Trending more news link present at the */
	@FindBy(xpath ="//div[contains(@class,'trndstory')]/a")
	private WebElement trendingMoreLink;

	/* You may like content Ads in  of Article Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]//span[contains(text(),'You May Like')]")
	private List<WebElement> taboolaArticleLnk;

	/* You may like content Ads in  of Article Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]")
	private WebElement promotedContent;

	//===============================Sanjeeb's  Elements =======================================

	/*Latest Section Articles */
	@FindBy(xpath="//div[contains(@class,'wapper')]/descendant::div[@class='nwnav']//a")
	private List<WebElement>  lineOneSectionElementsList;

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//div[contains(@class,'nwhdrrgt')]/a[contains(@id,'search-top-goog')]")
	private WebElement searchBtnLnk;

	/*Search Box Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'gsc-results')])[1]/div[contains(@class,'gsc-results')]")
	private WebElement closeBtn;

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
	@FindBy(xpath="//div[contains(@class,'nwhdrlft')]/a[contains(@id,'clickhambrgrbtn')]")
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
	@FindBy(xpath="//ul[contains(@class,'nwmainnav')]")
	private WebElement hamburgerMenuLHSSection;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//ul[contains(@class,'nwmainnav')]/li[not (contains(@class,'chsstct'))]//a")
	private List<WebElement> hamburgerMenuLHSSectionEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="(//div[contains(@class,'nwchnglngbtn')])[1]")
	private WebElement hamburgerMenuChangeLanguageSection;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'newhdrlnghover showLag')]//a")
	private List<WebElement> hamburgerMenuChangeLanguageSectionEleList;

	/*hamburger Menu Right hand Side Section*/
	@FindBy(xpath="(//div[contains(@class,'nwchnglngbtn')])[2]")
	private WebElement hamburgerMenuLiveTvSection;

	/*list Of all elements present on Hamburger Menu Header Social Sections*/
	@FindBy(xpath="//div[contains(@class,'newlvtvboxhover')]//a")
	private List<WebElement> hamburgerMenuLiveTvSectionEleList;

	/*hamburger Menu Download App Section*/
	@FindBy(xpath="//div[contains(@class,'nwnavpopu-insidenv-left')]/a")
	private WebElement hamburgerMenuDownloadAppBtn;

	/*list Of all elements present on app down load section after clicking on download app btn present on footer */
	@FindBy(xpath="//div[contains(@class,'newhdrlnghover showLag')]//a")
	private List<WebElement> hamburgerMenuDownloadAppSectionEleList;

	/*Choose Your City Btn Present On Header LineOne*/
	@FindBy(xpath="//ul[contains(@class,'nwmainnav')]/li[ (contains(@class,'chsstct'))]//a")
	private WebElement hamburgerApnaSeherChuneBtn;

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
	@FindBy(xpath="//footer[contains(@class,'common-footer')]/section/div[contains(@class,'social_icon') or contains(@class,'ftr_container') ]//a")
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

	//----------------------------------Vipin's Webelement ------------------------------//

	//===============================common Elements =======================================


	/*common Section Photogallery Articles Link */
	@FindBy(xpath="//div[contains(@class,'topnew')]/a[contains(@href,'/photogallery/')] | //ul[contains(@class,'topstories')]/li/a[contains(@href,'/photogallery/')]")
	private List<WebElement>  commonsectionPhotogalleryArticleELeList;

	/*Cartoon Photogallery Articles Link */
	@FindBy(xpath="//div[contains(@class,'swipeable')]//ul//h3//a[contains(@href,'/photogallery/')]  |  //ul[contains(@class,'listview-story')]//div//a[contains(@href,'/photogallery/')]")
	private List<WebElement>  cartoonPhotogalleryArticleELeList;

	//-----------Photogallery_Cricket WebElements-----------------------------------------//

	/*Cricket Section Article Links */
	@FindBy(xpath="//div[contains(@class,'Topstory')]//a[not (contains(@href,'/videos/'))]")
	private List<WebElement> cricketPhotogalleryArticleELeList;

	/*BreadCrumb Links present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'bread') or contains(@class,'brdc')]//a[@href]")
	private List<WebElement> breadCrumbLnks;

	/*Article Tags Links in Article Consumption Page*/
	@FindBy(xpath = "//p[contains(@class,'tag')]/a")
	private List<WebElement> articleTagsLnk;

	/*Article Related News Links in LHS Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'related')]/ul/li/a")
	private List<WebElement> articleRelatedNewsLnk;

	/*Article Highlight Section Division in Article Consumption page*/
	@FindBy(xpath = "//div[contains(@class,'artclhglght')]")
	private WebElement articleHighlightDiv;

	/*Article Footer Read More Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'read-more')]/a")
	private WebElement articleFooterReadMoreLnk;

	/*Article Detailed Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article_section')]//div[contains(@class,'content_sec')]/p")
	private List<WebElement> articleDetailedDescriptionTxt;

	/*Article Detailed Description Header Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article_section')]/div//p//a[contains(@href,'news18')]")
	private List<WebElement> articleDetailedHighlightLnk;

	/*Article Trending Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'rgt')]/h2")
	private WebElement articleTrendingLnk;

	/*Article Detailed Description Header Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'rgt-ts')]//ul/li/a")
	private List<WebElement> allTrendingWidgetsLnks;

	/*News18 minis Links Present in ArticleBody*/
	@FindBy(xpath="//div[contains(@class,'ftr_box')]/a[contains(@href,'/photogallery/')] | //ul[contains(@class,'topstories')]/li/a[contains(@href,'/photogallery/')]")
	private List<WebElement> news18MinisArticleELeList;	

	/*--------------------------------------------Podcast(Web-Elements)------------------------------------------*/

	/* Podcast Article Links Present in ArticleBody */
	@FindBy(xpath="//div[contains(@class,'topbar')]//a[contains(@href,'/news-bulletin/')]/ancestor::div[contains(@class,'container')]//div[contains(@class,'podcast_page_section')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> podcastArticleELeList;

	/*Podcast Article Description Lists Present in ArticleBody*/
	@FindBy(xpath="//div[contains(@class,'podcast-consumption-content')]//p")
	private List<WebElement> podcastArticleDetailedDescriptionTxt;

	/*Podcast Article Last Updated And Time Text in Article Consumption Page */
	@FindBy(xpath = "//div//ul[contains(@class,'time_location')]/li")
	private WebElement podcastArticleLastUpdatedDateTxt;

	/*Podcast Article Last Updated And Time Text in Article Consumption Page */
	@FindBy(xpath = "//div//ul[contains(@class,'time_location')]/li")
	private WebElement podcastArticleLastUpdatedTimeTxt;

	/*Podcast Article Share on Social Media Link in Article Consumption Page*/
	@FindBy(xpath = "//div//div[contains(@class,'share')]//ul/li/a")
	private List<WebElement> podcastArticleSocialMediaIconLnk;

	//--------------------- Article Body Webelements  --------------------//

	/*HeaderText present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artcl') or contains(@class,'left')]//h1")
	private WebElement articleHeaderTxt;

	/*HeaderText present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'pht')]//h2[contains(@class,'newpht')]")
	private WebElement photogalleryArticleHeaderTxt;

	//------------ Cricket----------//

	/*Cricket Article Links Present in ArticleBody*/
	@FindBy(xpath="//div[contains(@class,'Topstory')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))] | //ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> cricketArticleLnk;

	//------------ Pradesh ----------//

	/*Pradesh Article Links Present in ArticleBody*/
	@FindBy(xpath="//div[contains(@class,'Topstory')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))] | //ul[contains(@class,'newsstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> pradeshArticleLnk;


	/*Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'byline')]//ul[contains(@class,'byeline')]/li/b")
	private WebElement articleLastUpdatedTxt;

	/*Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'pht')]//ul[contains(@class,'byline')]/li/span[contains(.,'Updated')]")
	private WebElement photogalleryArticleLastUpdatedTxt;

	/*Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'byline')]//ul[contains(@class,'byeline')]/li//time")
	private WebElement articleLastUpdatedTimeTxt;

	/*Read More Description link in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'short_desc')]/span")
	private WebElement articleDescriptionReadMoreLnk;

	/*Read More Description link in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'pht')]//h2[contains(@class,'newpht')]/following-sibling::p")
	private WebElement photogalleryArticleDescriptionTxt;

	/*Read More Description Text in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'short_desc')]/h3")
	private WebElement articleDescriptionTxt;

	/*News18 Agency Link in Article Content Division*/
	@FindBy(xpath = "//div[contains(@class,'byline')]/ul/li/span/a")
	private WebElement articleAgencyLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'tagtop-new-intro')]/h1")
	private WebElement news18AgencyTxt;

	/*Article Share on Social Media Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl')]//div[contains(@class,'share')]/ul/li/a")
	private List<WebElement> articleSocialMediaIconLnk;

	/*Article Share on Social Media Link in Article Consumption Page*/
	@FindBy(xpath = "(//div[contains(@class,'newphtcnsmnbox')])[1]/div[contains(@class,'share')]//a")
	private List<WebElement> photogalleryArticleSocialMediaIconLnk;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//img[contains(@alt,'WhatsApp')]")
	private WebElement whatsAppHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[@id='header']")
	private WebElement facebookHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'tgme_head_wrap')]")
	private WebElement telegramHeader;

	/*Header Text Link Present in social media page*/
	@FindBy(xpath ="//div[contains(@class,'loto')]")
	private WebElement twitterHeader;

	/*Article Content Google News Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl')]//div[contains(@class,'share')]/ul/li//div/a")
	private List<WebElement> articleGoogleNewsLnk;

	/*News18 Google Header */
	@FindBy(xpath = "//div/h2[contains(.,'News18 हिंदी')]")
	private WebElement googleNews18Logo;

	/*Article Description Author Name Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'byline')]//ul[contains(@class,'byeline')]//div[contains(@class,'author-intro')]/a")
	private WebElement articleAuthorLnk;

	/*News18Minis Photogallery Articles Link */
	@FindBy(xpath="//div[contains(@class,'ftr_box')]/a[contains(@href,'/photogallery/')] | //ul[contains(@class,'topstories')]/li/a[contains(@href,'/photogallery/')]")
	private List<WebElement>  news18MinisPhotogalleryArticleELeList;

	/*Author Name Text In article By Line */
	@FindBy(xpath = "//div[contains(@class,'author')]/h1")
	private WebElement authorNameTxt;

	/*Promoted Content All Article List present inside Outbrain in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleList;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'logo')]/div[contains(@class,'logo')]")
	private WebElement taboolaLogo;

	/*News18 Agency Link in Article Content Division*/
	@FindBy(xpath = "//div[contains(@class,'pht')]//ul[contains(@class,'byline')]/li/span/a[contains(@href,'/agency/')]")
	private WebElement photogalleryArticleAgencyLnk;

	/*Article Description Author Name Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'pht')]//ul[contains(@class,'byline')]/li/a")
	private WebElement photogalleryArticleAuthorLnk;


	//=========================================Sanjeeb Hindi Body Part Validation=====================

	/*Photos Count*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]//div[contains(@class,'newphtcount')]")
	private List<WebElement> photosCountLnks;

	/*Photos Image Count*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]//img")
	private List<WebElement> photosImgCountLnks;

	/*Photos Captions Links*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]//p")
	private List<WebElement> photosCaptionsLnks;

	/*Photos Section Links*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]")
	private List<WebElement> photosSectionEleLnks;


	/*Photos Count*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]//div[contains(@class,'newphtcount')]//span[1]")
	private List<WebElement> photosCountLink;

	/*Photos Section Links*/
	@FindBy(xpath="//div[contains(@class,'newphtcnsmnbox')]//span[contains(@class,'newphtfullviewbtn')]")
	private List<WebElement> photosSectionExpandViewLnks;

	/*Numbering Present under Expanded View*/
	@FindBy(xpath="(//div[contains(@class,'adcls')]//li[not(contains(@class,'clone'))]//div[contains(@class,'phtcntnmbr')]/span[1])")
	private List<WebElement> numberingExpandedView;

	/*Expanded View Inside Close Btn*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodelhdr')]//span[contains(@class,'phtcloswglr')]")
	private WebElement expandedViewCloseBtn;

	/*Expanded View Play and Pause Btn*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodelhdr')]//div[contains(@class,'phtplaytn')]")
	private WebElement expandedViewPlayAndPauseBtn;

	/*Expanded View photo Captions*/
	@FindBy(xpath="//div[contains(@class,'adcls')]//li[not(contains(@class,'clone'))]//p")
	private List<WebElement> expandedViewPhotosCaption;

	/*Expanded View Social Media Share Btn*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodelhdr')]//span[contains(@class,'clkwhlshrs')]")
	private WebElement expandedViewSocialShareBtn;

	/*Photos Section Extended view Social share Links*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodelhdr')]//div[contains(@class,'nwphpshr')]//a")
	private List<WebElement> photosSectionExpandViewSocialShareLnks;

	/*Expanded View Read More Link*/
	@FindBy(xpath="//div[contains(@class,'adcls')]//li[not(contains(@class,'clone'))]//p/span")
	private List<WebElement> expandedViewReadMoreLnk;

	/*full View After Clicking on read more*/
	@FindBy(xpath="//div[contains(@class,'adcls')]//li[not(contains(@class,'clone'))]//div[contains(@class,'fullView')]")
	private List<WebElement> expandedViewFullViewReadMoreLnk;




	//====-------------------Anupam WebElements------------------------
	//anupam
	/* read more present in article page*/
	@FindBy(xpath ="//div[contains(@class,'read-more-box')]/a")
	private WebElement readMoreBox;

	/* first published present in article page*/
	@FindBy(xpath ="//div[contains(@class,'post_date')]")
	private WebElement firstpublished;

	/* author  present in bottom of article page*/
	@FindBy(xpath ="//div[contains(@class,'post_info')]//div[contains(@class,'author-intro')]/a")
	private WebElement authorNameLnk;

	/* video present between article page*/
	@FindBy(xpath ="//div[contains(@data-video-event,'Article_Youtube')]//iframe")
	private WebElement videoBetweenArticle;

	/* video large play button present between article page*/
	@FindBy(xpath ="//button[contains(@class,'large-play-button')]")
	private WebElement videoLargePlayButton;

	/*video player container displaying in below of video player*/
	@FindBy(xpath ="//div[contains(@id,'player')]")
	private WebElement videoPlayerContainer;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//div[contains(@class,'ytp-left-controls')]//button[contains(@class,'play-button') and contains(@data-title-no-tooltip,'Pause') ]")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//div[contains(@class,'ytp-left-controls')]//button[contains(@class,'play-button') and contains(@data-title-no-tooltip,'Play') ]")
	private WebElement playBtn;

	/* tags present in article page*/
	@FindBy(xpath ="//p[contains(.,'Tags:')] | //div[contains(@class,'consumption-tag')]/p")
	private WebElement liveTagsKey;

	/* tags present in article page*/
	@FindBy(xpath ="//p[contains(@class,'tag')]/a | //div[contains(@class,'consumption-tag')]//a")
	private List<WebElement> tagsValue;

	/* tags breadcrumb present in Tags page*/
	@FindBy(xpath ="//div[contains(@class,'brdacrum')] |  //div[contains(@class,'brdcrm')]")
	private WebElement tagBreadcrumb;

	/* conclusion present in bottom of article page*/
	@FindBy(xpath ="//p[contains(@class,'read_more_links')]")
	private WebElement conclusionDiv;

	//photo
	// Expand photo in photogallery article link//
	@FindBy(xpath = "//div[contains(@class,'newphtcnsmnbox')]//span[contains(@class,'newphtfullviewbtn')]")
	private List<WebElement> expandLnk;

	// Expand photo in photogallery article link//
	@FindBy(xpath = "//div[contains(@class,'pflhdrrgt')]//span[contains(@class,'phtcloswglr')]")
	private WebElement closeExpandLnk;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,' phtcnsmpnad')]//div[contains(@id,'google_ads_iframe') and not(contains(@id,'1x1'))]//iframe[(not(@width<'2'))]")
	private WebElement topAds;

	/*Mobile Section Articles*/
	@FindBy(xpath="//ul[contains(@class,'spcnwslist')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement>  mobilesectionArticleELeList;

	/*Photo Section Articles */
	@FindBy(xpath="//div[contains(@class,'tpnews')]//ul[contains(@class,'listview-story')]//div//a")
	private List<WebElement>  photoSectionPhotoGalleryArticleELeList;




	//===============================common Business logics=======================================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(commonsectionArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(commonsectionArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCricketSectionFirstArticle()
	{

		webDriverActions.waitForPageToLoad();
		if(cricketSectionArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(cricketSectionArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnMobileSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(mobileSectionArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(mobileSectionArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnLiveTvSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(liveTvSectionArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(liveTvSectionArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPodcastSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(podcastSectionArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(podcastSectionArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	//===============================common Photo Article Business logics=======================================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(commonsectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(commonsectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
		webDriverActions.softClickJS(commonsectionPhotoArticleELeList.get(0));
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPhotoSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(photoSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(photoSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCricketSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(cricketSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(cricketSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
		webDriverActions.softClickJS(cricketSectionPhotoArticleELeList.get(0));
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnMobileSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(mobileSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(mobileSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnLiveTvSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(liveTvSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(liveTvSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPodcastSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(podcastSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(podcastSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	//===============================Sanjeeb's Business Logics=======================================
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
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
				String currentPageUrl=webDriverActions.getCurrentPageUrl();
				if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
				{
					webDriverActions.navigateBack();
					webDriverActions.softClickJS(lineOneSectionElementsList.get(i));
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


	/**
	 * This method is used to verify Search Button Present on Header
	 * @author SanjeebKumarPati
	 */
	public void verfySearchButton()
	{
		//validating Search Icon
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.softHighlightElement(searchBtnLnk);
		webDriverActions.softClickJS(searchBtnLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.softWaitForElementVisibility(searchBoxBtn, 3);
		webDriverActions.inputText(searchBoxBtn, "News 18");
		webDriverActions.softHighlightElement(insideSearchIcon);
		webDriverActions.softClick(insideSearchIcon);
		webDriverActions.softHighlightElement(closeBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeBtn), "Posibly Search Box is not displayed");	
		softAssert.assertAll("Issues Found In Validating Search Button");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Rajya Section Present on Line One section Of hindi revamp Landing Page.
	 */
	public void verfyRajyaSection(String server)
	{
		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(apnaSeherChuneBtn);
		webDriverActions.softClick(apnaSeherChuneBtn);
		softAssert.assertTrue(chooseYourCitySectionHeaderEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<chooseYourCitySectionHeaderEleList.size();i++)
		{
			webDriverActions.softHighlightElement(chooseYourCitySectionHeaderEleList.get(i));
			String expected = webDriverActions.getAttribute("href", chooseYourCitySectionHeaderEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(chooseYourCitySectionHeaderEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(apnaSeherChuneBtn);
				webDriverActions.softClickJS(chooseYourCitySectionHeaderEleList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(expected, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
			webDriverActions.navigateToUrl(mainUrl);
			webDriverActions.softClick(apnaSeherChuneBtn);
		}

		//These Lines of Scripts use to Verify the links present under Rajya Section Of Rajya Seher Chune Popup Of Hindi Home Page.
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<chooseYourCitySectionFooterEleList.size();i++)
		{
			String title=webDriverActions.getAttribute("class", chooseYourCitySectionFooterEleList.get(i));
			if (title.contains("noarrow"))
			{
				webDriverActions.softHighlightElement(chooseYourCitySectionFooterSectionEleList.get(i));
				String expected = webDriverActions.getAttribute("href", chooseYourCitySectionFooterSectionEleList.get(i));
				list.add(expected);
			}
			else
			{
				webDriverActions.softClickJS(chooseYourCitySectionFooterEleList.get(i));
				for(int j=0;j<rajyaSectionFooterEleDropDwn.size();j++)
				{
					webDriverActions.softHighlightElement(rajyaSectionFooterEleDropDwn.get(j));
					String expected = webDriverActions.getAttribute("href", rajyaSectionFooterEleDropDwn.get(j));
					list.add(expected);
				}
			}
		}
		Logs.info(getClass(), list);
		for(int k=0;k<list.size();k++)
		{
			webDriverActions.navigateToUrl(list.get(k));
			String actual= webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(list.get(k), currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");	
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
		softAssert.assertTrue(sectionlist.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=1;i<sectionlist.size();i++)
		{
			webDriverActions.softHighlightElement(sectionlist.get(i));
			String pageUrl = webDriverActions.getAttribute("href",sectionlist.get(i));
			String title = webDriverActions.getAttribute("target", sectionlist.get(i));
			webDriverActions.softClick(sectionlist.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), pageUrl);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerMenuBtn);
				webDriverActions.softHighlightElement(sectionlist.get(i));
				webDriverActions.softClickJS(sectionlist.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
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
		softAssert.assertAll("Issues Found In Validating Hamburger Menu header Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerSecondLayerMenu(String server,WebElement section , List<WebElement> sectionlist)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(section);
		webDriverActions.softClick(section);
		softAssert.assertTrue(sectionlist.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=1;i<sectionlist.size();i++)
		{
			webDriverActions.softHighlightElement(sectionlist.get(i));
			String pageUrl = webDriverActions.getAttribute("href",sectionlist.get(i));
			String title = webDriverActions.getAttribute("target", sectionlist.get(i));
			webDriverActions.softClick(sectionlist.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), pageUrl);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerMenuBtn);
				webDriverActions.softHighlightElement(sectionlist.get(i));
				webDriverActions.softClickJS(sectionlist.get(i));
			}
			String expected = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				webDriverActions.navigateToUrl(betaUrl);
				expected=betaUrl;
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and Status Code Is "+response);
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
			webDriverActions.softHighlightElement(section);
			webDriverActions.softClick(section);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu header Section");	
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLHSSection(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuLHSSection, hamburgerMenuLHSSectionEleList);
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerRHSSection(String server)
	{
		verfyhamburgerMenu(server, hamburgerMenuRHSSection, hamburgerMenuRHSSectionEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerChangeLanguageSection(String server)
	{
		verfyhamburgerSecondLayerMenu(server, hamburgerMenuChangeLanguageSection, hamburgerMenuChangeLanguageSectionEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLiveTvSection(String server)
	{
		verfyhamburgerSecondLayerMenu(server, hamburgerMenuLiveTvSection, hamburgerMenuLiveTvSectionEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerDownloadAppSection()
	{

		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerMenuDownloadAppBtn);
		String pageUrl = webDriverActions.getAttribute("href",hamburgerMenuDownloadAppBtn);
		String title = webDriverActions.getAttribute("target", hamburgerMenuDownloadAppBtn);
		webDriverActions.softClickJS(hamburgerMenuDownloadAppBtn);
		if(title.contains("_blank"))
		{
			webDriverActions.switchToNewWindow();
		}
		else
		{
			Logs.info(getClass(), pageUrl);
		}
		if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
		{
			webDriverActions.navigateBack();
			webDriverActions.softClickJS(hamburgerMenuBtn);
			webDriverActions.softHighlightElement(hamburgerMenuDownloadAppBtn);
			webDriverActions.softClickJS(hamburgerMenuDownloadAppBtn);
		}
		webDriverActions.stopPageLoading();
		String currentUrl = webDriverActions.getCurrentPageUrl();
		int response = genericUtility.checkLinks(currentUrl);
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and Status Code Is "+response);
		if(title.contains("_blank"))
		{
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(pageTitle);

		}
		else {
			webDriverActions.navigateToUrl(mainUrl);
		}
		softAssert.assertAll("Issues Found In Validating Hamburger Menu header Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerLHSSectionRajyaSeherCHune(String server)
	{
		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerApnaSeherChuneBtn);
		webDriverActions.softClick(hamburgerApnaSeherChuneBtn);
		softAssert.assertTrue(chooseYourCitySectionHeaderEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<chooseYourCitySectionHeaderEleList.size();i++)
		{
			webDriverActions.softHighlightElement(chooseYourCitySectionHeaderEleList.get(i));
			String expected = webDriverActions.getAttribute("href", chooseYourCitySectionHeaderEleList.get(i));
			Logs.info(getClass(), expected);
			webDriverActions.softClickJS(chooseYourCitySectionHeaderEleList.get(i));
			String currentPageUrl=webDriverActions.getCurrentPageUrl();
			if(currentPageUrl.contains("google_vignette") || currentPageUrl.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerApnaSeherChuneBtn);
				webDriverActions.softHighlightElement(hamburgerMenuBtn);
				webDriverActions.softClick(hamburgerMenuBtn);
				webDriverActions.softClickJS(chooseYourCitySectionHeaderEleList.get(i));
			}
			String actual = webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(expected, currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
			webDriverActions.navigateToUrl(mainUrl);
			webDriverActions.softHighlightElement(hamburgerMenuBtn);
			webDriverActions.softClick(hamburgerMenuBtn);
			webDriverActions.softClick(hamburgerApnaSeherChuneBtn);
		}

		//These Lines of Scripts use to Verify the links present under Rajya Section Of Rajya Seher Chune Popup Of Hindi Home Page.
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<chooseYourCitySectionFooterEleList.size();i++)
		{
			String title=webDriverActions.getAttribute("class", chooseYourCitySectionFooterEleList.get(i));
			if (title.contains("noarrow"))
			{
				webDriverActions.softHighlightElement(chooseYourCitySectionFooterSectionEleList.get(i));
				String expected = webDriverActions.getAttribute("href", chooseYourCitySectionFooterSectionEleList.get(i));
				list.add(expected);
			}
			else
			{
				webDriverActions.softClickJS(chooseYourCitySectionFooterEleList.get(i));
				for(int j=0;j<rajyaSectionFooterEleDropDwn.size();j++)
				{
					webDriverActions.softHighlightElement(rajyaSectionFooterEleDropDwn.get(j));
					String expected = webDriverActions.getAttribute("href", rajyaSectionFooterEleDropDwn.get(j));
					list.add(expected);
				}
			}
		}
		Logs.info(getClass(), list);
		for(int k=0;k<list.size();k++)
		{
			webDriverActions.navigateToUrl(list.get(k));
			String actual= webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(list.get(k), currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
		}
		softAssert.assertAll("Rajya Seher Chune Verification Failed");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Hamburger Section Section Present on header Part of mobile hindi revamp Landing Page.
	 */
	public void verfyhamburgerSocialShareSection(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(hamburgerMenuBtn);
		webDriverActions.softClick(hamburgerMenuBtn);
		webDriverActions.softHighlightElement(hamburgerMenuSocialSection);
		softAssert.assertTrue(hamburgerMenuSocialSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<hamburgerMenuSocialSectionEleList.size();i++)
		{
			webDriverActions.softHighlightElement(hamburgerMenuSocialSectionEleList.get(i));
			String pageUrl = webDriverActions.getAttribute("href",hamburgerMenuSocialSectionEleList.get(i));
			String title = webDriverActions.getAttribute("target", hamburgerMenuSocialSectionEleList.get(i));
			webDriverActions.softClick(hamburgerMenuSocialSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), pageUrl);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(hamburgerMenuBtn);
				webDriverActions.softHighlightElement(hamburgerMenuSocialSectionEleList.get(i));
				webDriverActions.softClickJS(hamburgerMenuSocialSectionEleList.get(i));
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
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
		softAssert.assertAll("Issues Found In Validating Hamburger Menu header Section");
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
		webDriverActions.continuousScrollTillElement(section, 10);
		webDriverActions.softHighlightElement(section);
		softAssert.assertTrue(sectionlist.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<sectionlist.size();i++)
		{
			webDriverActions.softHighlightElement(sectionlist.get(i));
			String pageUrl = webDriverActions.getAttribute("href",sectionlist.get(i));
			String title = webDriverActions.getAttribute("target", sectionlist.get(i));
			webDriverActions.softClickJS(sectionlist.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), pageUrl);
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.scrollToLast();
				webDriverActions.continuousScrollTillElement(section, 10);
				webDriverActions.softHighlightElement(section);
				webDriverActions.softHighlightElement(sectionlist.get(i));
				webDriverActions.softClickJS(sectionlist.get(i));
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
			webDriverActions.scrollToLast();
			webDriverActions.softWaitForElementVisibility(section, 1000);
			webDriverActions.softHighlightElement(section);
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

	//========================================DanishR-Business-Logic-----------------------------

	/*  Photo Validation Methods */

	public void verifyPhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,commonsectionArticleELeList);
	}

	public void verifyPhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,commonsectionArticleELeList);
	}

	public void verifyPhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,commonsectionArticleELeList);
	}

	/*  Top Story Validation Methods */

	public void verifyTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,commonsectionArticleELeList);
	}

	public void verifyTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,commonsectionArticleELeList);
	}

	public void verifyTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,commonsectionArticleELeList);
	} 

	public void verifyPromotedContent(String serverType) {
		verifyPromotedContent(serverType,promotedContent,commonsectionArticleELeList);
	} 

	/*  Cricket Validation Methods */

	public void verifyCricketPhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,cricketSectionArticleELeList);
	}

	public void verifyCricketPhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,cricketSectionArticleELeList);
	}

	public void verifyCricketPhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,cricketSectionArticleELeList);
	}

	/*  Cricket Top Story Validation Methods */

	public void verifyCricketTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,cricketSectionArticleELeList);
	}

	public void verifyCricketTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,cricketSectionArticleELeList);
	}

	public void verifyCricketTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,cricketSectionArticleELeList);
	} 

	/*  Latest Mobile Validation Methods */

	public void verifyLatestMobilePhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,mobileSectionArticleELeList);
	}

	public void verifyLatestMobilePhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,mobileSectionArticleELeList);
	}

	public void verifyLatestMobilePhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,mobileSectionArticleELeList);
	}

	/*  Latest Mobile Top Story Validation Methods */

	public void verifyLatestMobileTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,mobileSectionArticleELeList);
	}

	public void verifyLatestMobileTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,mobileSectionArticleELeList);
	}

	public void verifyLatestMobileTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,mobileSectionArticleELeList);
	} 

	/*  Podcast Photo Validation Methods */

	public void verifyPodcastPhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,podcastSectionArticleELeList);
	}

	public void verifyPodcastPhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,podcastSectionArticleELeList);
	}

	public void verifyPodcastPhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,podcastSectionArticleELeList);
	}

	/*  Podcast Top Story Validation Methods */

	public void verifyPodcastTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,podcastSectionArticleELeList);
	}

	public void verifyPodcastTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,podcastSectionArticleELeList);
	}

	public void verifyPodcastTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,podcastSectionArticleELeList);
	} 

	/*  Live TV Photo Validation Methods */

	public void verifyLiveTvPhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,liveTvSectionArticleELeList);
	}

	public void verifyLiveTvPhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,liveTvSectionArticleELeList);
	}

	public void verifyLiveTvPhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,liveTvSectionArticleELeList);
	}

	/*  Live TV Top Story Validation Methods */

	public void verifyLiveTvTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,liveTvSectionArticleELeList);
	}

	public void verifyLiveTvTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,liveTvSectionArticleELeList);
	}

	public void verifyLiveTvTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,liveTvSectionArticleELeList);
	} 


	/* Photo Articles Photo section Validation Methods */

	public void verifyPhotoGalleryArticlePhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,commonLineOnePhotoGalleryArticleELeList);
	}

	public void verifyPhotoGalleryArticlePhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,commonLineOnePhotoGalleryArticleELeList);
	}

	public void verifyPhotoGalleryArticlePhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,commonLineOnePhotoGalleryArticleELeList);
	}

	/*   Photo Articles Top Story Validation Methods */

	public void verifyPhotoGalleryArticleTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,commonLineOnePhotoGalleryArticleELeList);
	}

	public void verifyPhotoGalleryArticleTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,commonLineOnePhotoGalleryArticleELeList);
	}

	public void verifyPhotoGalleryArticleTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,commonLineOnePhotoGalleryArticleELeList);
	} 

	/*  Cricket PhotoGalleryArticle Validation Methods */

	public void verifyCricketPhotoGalleryArticlePhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,cricketLineOnePhotoGalleryArticleELeList);
	}

	public void verifyCricketPhotoGalleryArticlePhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,cricketLineOnePhotoGalleryArticleELeList);
	}

	public void verifyCricketPhotoGalleryArticlePhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,cricketLineOnePhotoGalleryArticleELeList);
	}

	/*  Cricket PhotoGalleryArticle Top Story Validation Methods */

	public void verifyCricketPhotoGalleryArticleTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,cricketLineOnePhotoGalleryArticleELeList);
	}

	public void verifyCricketPhotoGalleryArticleTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,cricketLineOnePhotoGalleryArticleELeList);
	}

	public void verifyCricketPhotoGalleryArticleTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,cricketLineOnePhotoGalleryArticleELeList);
	} 

	/*  LatestMobile PhotoGalleryArticle Validation Methods */

	public void verifyLatestMobilePhotoGalleryArticlePhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,mobileLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLatestMobilePhotoGalleryArticlePhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,mobileLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLatestMobilePhotoGalleryArticlePhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,mobileLineOnePhotoGalleryArticleELeList);
	}

	/*  LatestMobile PhotoGalleryArticle Top Story Validation Methods */

	public void verifyLatestMobilePhotoGalleryArticleTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,mobileLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLatestMobilePhotoGalleryArticleTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,mobileLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,mobileLineOnePhotoGalleryArticleELeList);
	} 

	/*  LiveTv PhotoGalleryArticle Validation Methods */

	public void verifyLiveTvPhotoGalleryArticlePhotoTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,photoTitle,liveTvLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLiveTvPhotoGalleryArticlePhotoArticleNavigation(String serverType) {
		verifyPhotoArticleNavigation(serverType,photoTitle,photoSectionActiveArticle,photoSectionArticleButton,liveTvLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLiveTvPhotoGalleryArticlePhotoReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,photoTitle,photoMoreLink,liveTvLineOnePhotoGalleryArticleELeList);
	}

	/*  LiveTv PhotoGalleryArticle Top Story Validation Methods */

	public void verifyLiveTvPhotoGalleryArticleTopStoryTitleNavigation(String serverType) {
		verifyTitleNavigation(serverType,topStoryTitle,liveTvLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLiveTvPhotoGalleryArticleTopStoryArticleNavigation(String serverType) {
		verifyArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,liveTvLineOnePhotoGalleryArticleELeList);
	}

	public void verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(String serverType) {
		verifyReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,liveTvLineOnePhotoGalleryArticleELeList);
	} 



	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the title of the  section
	 */
	public void verifyTitleNavigation(String serverType,WebElement title,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String moneyPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(categoryPageLinks.size()>0,"Possibly no articles present or size is "+categoryPageLinks.size() +" In this Url "+moneyPage);
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
				softAssert.assertTrue(status," Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);

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
			webDriverActions.navigateToUrl(moneyPage);
		}
		softAssert.assertAll(" Issues found in money category section Title ");

	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of  section
	 */
	public void verifyArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
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
				//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
				Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				for(int j=0;j<1;j++) {
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
					if (currentCPPage.equalsIgnoreCase(expectedCP)) {
						webDriverActions.navigateBack();
					}
					else {
						webDriverActions.navigateBack();
						webDriverActions.navigateBack();
					}
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(moneyPage);
		}
		softAssert.assertAll("Issues found in money category section Articles ");
	}

	/**
	 * @author DanishR
	 * @param serverType
	 * This method is used to click on the articles of  section
	 */
	public void verifyPhotoArticleNavigation(String serverType,WebElement title,WebElement articleActiveLink,List<WebElement> buttonLinks,List<WebElement> categoryPageLinks) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(title, 2)," Possibily no Photo section found " +title+" "+webDriverActions.getCurrentPageUrl());
				//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
				softAssert.assertTrue(buttonLinks.size()>0," Possibily no articles found or size is " +buttonLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				for(int j=0;j<buttonLinks.size();j++) {
					webDriverActions.softIsElementDisplayed(buttonLinks.get(j), 2);
					webDriverActions.softHighlightElement(buttonLinks.get(j));
					webDriverActions.softMouseHover(buttonLinks.get(j));
					webDriverActions.softClickJS(buttonLinks.get(j));
					webDriverActions.softIsElementDisplayed(photoSectionActiveArticle, 2);
					webDriverActions.softHighlightElement(photoSectionActiveArticle);
					webDriverActions.softMouseHover(photoSectionActiveArticle);
					String actualCP=webDriverActions.getAttribute("href", photoSectionActiveArticle);
					webDriverActions.softClickJS(photoSectionActiveArticle);
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
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(moneyPage);
		}
		softAssert.assertAll("Issues found in money category section Articles ");
	}


	/**
	 * @author DanishR
	 * @param serverType
	 * This metod is used to click on Read more button of  section
	 */
	public void verifyReadMoreNavigation(String serverType,WebElement title, WebElement morelink,List<WebElement> categoryPageLinks) {
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
					softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
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
	 * @param serverType
	 * This method is used to click on the title of the  section
	 */
	public void verifyPromotedContent(String serverType,WebElement title,List<WebElement> categoryPageLinks) {
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
			boolean status=genericUtility.compareUrlSub(actual, expected);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage);
			softAssert.assertTrue(status, " Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
			//			webDriverActions.scrollToElement(title);
			webDriverActions.continuousScrollTillElement(title, 5);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(title, 2),"Possibly You May Also Like Promoted Content not present "+currentPage);
			webDriverActions.navigateToUrl(moneyPage);
		}
	}

	//------------------------------------Vipin's Business Logic ------------------------------------//


	/*-------------------------Vipin's Article Body Business Logics-------------------------------*/
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 *  This method is used to Validate the Breadcrumb Navigation For Article
	 */
	public void verifyArticleBreadCrumbNavigation(String serverType , List<WebElement> articleLst , List<WebElement> articleBreadCrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
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
			//			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			webDriverActions.waitForPageToLoad();
			softAssert.assertTrue(articleBreadCrumb.size()>0, "Possibly Breadcrumb is Not Visible in "+expectedUrl);
			webDriverActions.continuousScrollTillAllElement(articleBreadCrumb, 10);
			for(int j=0; j<articleBreadCrumb.size(); j++) {
				String actualUrlCP = webDriverActions.getAttribute("href", articleBreadCrumb.get(j));
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
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues found in Article Body ");
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
		for(int i=1; i<1; i++) {
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
				Logs.error(getClass(), "No TAGS FOUND");
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
			webDriverActions.waitForSecond(1000);
		}
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param description
	 * @param headerLnk
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Description and Article Header Link in Article Consumption Page
	 */
	public void verifyArticleDescriptionHeaderLinkNavigation(String serverType,List<WebElement> articleLst ,WebElement footerReadMoreLnk,  List<WebElement> description , List<WebElement> headerLnk  )
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
			if(webDriverActions.softIsElementDisplayed(footerReadMoreLnk))
			{
				webDriverActions.softMouseHover(footerReadMoreLnk);
				webDriverActions.softHighlightElement(footerReadMoreLnk);
				webDriverActions.softClickJS(footerReadMoreLnk);
				webDriverActions.waitForPageToLoad();
			}
			softAssert.assertTrue(description.size()>0, "Possibly Article Detailed Description Is Not Visible in "+currentPageUrl);
			for(int j=0;j<description.size();j++)
			{
				webDriverActions.softMouseHover(description.get(j));
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
			}
			if(headerLnk.size()>0) {
				String articlePageTitle = webDriverActions.getPageTitle();
				for(int k=0;k<headerLnk.size();k++)
				{
					webDriverActions.softMouseHover(headerLnk.get(k));
					webDriverActions.softScrollToElement(headerLnk.get(k));
					webDriverActions.softHighlightElement(headerLnk.get(k));
					String actualHeaderUrl = webDriverActions.getAttribute("href", headerLnk.get(k));
					webDriverActions.scrollUp();
					webDriverActions.navigateToNewTab(headerLnk.get(k));
					webDriverActions.switchToNewWindow();
					webDriverActions.waitForPageToLoad();
					String currentHeaderUrl = webDriverActions.getCurrentPageUrl();
					String expectedHeaderUrl = webDriverActions.getCurrentPageUrl();
					if(serverType.equalsIgnoreCase("hindiRevamp") && !currentHeaderUrl.contains("//beta") && currentHeaderUrl.contains("news18")) {
						String betaUrl = genericUtility.replaceInUrl(currentHeaderUrl);
						webDriverActions.navigateToUrl(betaUrl);
						currentHeaderUrl = betaUrl;
					}
					webDriverActions.waitForPageToLoad();
					int headerResponse = genericUtility.checkLinks(currentHeaderUrl);
					softAssert.assertTrue(headerResponse==200, "Possibly Url is Invalid "+expectedHeaderUrl+" And Status Code is "+headerResponse);
					softAssert.assertTrue(genericUtility.compareUrlSub(actualHeaderUrl, expectedHeaderUrl), "Possibly not navigate to same page "+actualHeaderUrl);
					webDriverActions.waitForPageToLoad();
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(articlePageTitle);
				}
			}
			else
			{
				Logs.error(getClass(), "NO ARTICLE HEADER PRESENT ");
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
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param trending
	 * @param allTrendingArticleWidgets
	 * @author VipinKumarGawande
	 * This method is used for navigation of Trending Widget Articles in Article Consumption Page.
	 */
	public void verifyArticleTrendingValidation(String serverType , List<WebElement> articleLst, WebElement trending, List<WebElement> allTrendingArticleWidgets )
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
			webDriverActions.waitForElement(1000);
			if(webDriverActions.softIsElementDisplayed(trending)) {
				webDriverActions.softMouseHover(trending);
				webDriverActions.softHighlightElement(trending);
				softAssert.assertTrue(allTrendingArticleWidgets.size()>0, "Possibly trending widget Article Is Not Visible in "+currentPageUrl);
				for(int j=0; j<allTrendingArticleWidgets.size(); j++) {
					webDriverActions.softMouseHover(allTrendingArticleWidgets.get(j));
					webDriverActions.softScrollToElement(allTrendingArticleWidgets.get(j));
					String actualUrlCP = webDriverActions.getAttribute("href", allTrendingArticleWidgets.get(j));
					webDriverActions.softClickJS(allTrendingArticleWidgets.get(j));
					webDriverActions.waitForPageToLoad();
					String currentPageUrlCP =webDriverActions.getCurrentPageUrl();		
					String expectedUrlCP =webDriverActions.getCurrentPageUrl();		
					if (serverType.equalsIgnoreCase("preProd") && !currentPageUrlCP.contains("//beta")){
						String betaUrl = genericUtility.replaceInUrl(currentPageUrlCP);
						webDriverActions.navigateToUrl(betaUrl);
						currentPageUrlCP=betaUrl;
					}
					webDriverActions.waitForPageToLoad();
					int responseCP = genericUtility.checkLinks(currentPageUrlCP);
					softAssert.assertTrue(responseCP==200, "Possibly Url is Invalid "+expectedUrlCP+" And Status Code is "+responseCP);
					softAssert.assertTrue(genericUtility.compareUrlSub(actualUrlCP, expectedUrlCP), "Possibly not navigate to same page "+actualUrlCP);
					softAssert.assertEquals(actualUrlCP, currentPageUrlCP, "Unable to navigate to "+currentPageUrlCP);
					if (currentPageUrlCP.equalsIgnoreCase(expectedUrlCP)) {
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
				Logs.error(getClass(), "NO TRENDING WIDGET IS VISIBLE IN "+expectedUrl);
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
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param articleHeader
	 * @param articleLastUpdated
	 * @param articleLastUpdatedTime
	 * @author VipinKumarGawande
	 * This method is used to verify the header text and LAST UPDATED Time from Article consumption page.
	 * @param serverType
	 */
	public void verifyArticleTitleAndLastUpdatedTimeValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime )
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Possibly Article Header Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
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
			webDriverActions.softMouseHover(readMoreLnk);
			webDriverActions.softHighlightElement(readMoreLnk);
			webDriverActions.mouseHoverAndClick(readMoreLnk);
			webDriverActions.waitForSecond(5000);
			if (currentPageUrl.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(2000);
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
			if(webDriverActions.softIsElementDisplayed(agencyLnk))
			{
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
			}
			else
			{
				softAssert.fail("Possibly Agency Link is Not Visible in "+currentPageUrl);
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
		webDriverActions.waitForElement(1000);
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("whatsApp"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));

		//Below list adds webelements of social share icons
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(whatsAppHeader);
		listEle.add(facebookHeader);
		listEle.add(telegramHeader);
		listEle.add(twitterHeader);
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
			//			String articlePageTitle = webDriverActions.getPageTitle();
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
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				//				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(response==200, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				softAssert.assertTrue(genericUtility.compareUrlSub(actualShare, currentShare), "Possibly not navigate to same page "+actualShare);

				// it will iterate the list and validate social media
				for(int k=0;k<list.size();k++)
				{
					if(currentShare.contains(list.get(k)))
					{
						webDriverActions.softWaitForElementVisibility(listEle.get(k), 2);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(k)), "Possibly Element Is Not Visible For This URL "+currentShare);	
					}
				}
				webDriverActions.navigateBack();
			}
			//				webDriverActions.closeDriver();
			//				webDriverActions.switchToWindow(articlePageTitle);
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
	 * @param articleSocialMedia\
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Media Icons Navigation In Article Consumption Page
	 */
	public void verifyPhotogalleryArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,List< WebElement> articleSocialMedia)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		webDriverActions.waitForElement(1000);
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("whatsApp"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));

		//Below list adds webelements of social share icons
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(whatsAppHeader);
		listEle.add(facebookHeader);
		listEle.add(telegramHeader);
		listEle.add(twitterHeader);
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
			String articlePageTitle = webDriverActions.getPageTitle();
			int response = genericUtility.checkLinks(currentPageUrl);
			softAssert.assertTrue(response==200, "Possibly Url is Invalid "+expectedUrl+" And Status Code is "+response);
			softAssert.assertTrue(genericUtility.compareUrlSub(actualUrl, expectedUrl), "Possibly not navigate to same page "+actualUrl);
			//			webDriverActions.continuousScrollTillAllElement(articleSocialMedia, 5);
			Assert.assertTrue(articleSocialMedia.size()>0, "Possibly Social Media Icon is Not Visible "+currentPageUrl);	
			for(int j=0 ; j<articleSocialMedia.size();j++ )
			{
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				if(actualShare.contains("whatsapp")|| actualShare.contains("facebook")||actualShare.contains("twitter")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else
				{
					softAssert.fail("Possibly Social Share Icons are Not displayed in "+currentPageUrl);
				}
			}
		}
		softAssert.assertAll("Issue Found in Article Body ");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param googleLnk
	 * @param news18Logo
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News In Article Consumption Page
	 */
	public void verifyArticleGoogleNewsNavigation(String serverType ,List<WebElement> articleLst , List<WebElement> googleLnk , WebElement news18Logo)
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
			softAssert.assertTrue(googleLnk.size()>0, "Possibly Google Link is Not Visible or Size is "+googleLnk.size());
			for(int j=0;j<googleLnk.size();j++)
			{
				webDriverActions.softHighlightElement(googleLnk.get(j));
				String googleUrl = webDriverActions.getAttribute("href", googleLnk.get(j));
				webDriverActions.softClickJS(googleLnk.get(j));
				webDriverActions.waitForPageToLoad();
				String currentGoogleUrl = webDriverActions.getCurrentPageUrl();
				String expectedGoogleUrl = webDriverActions.getCurrentPageUrl();
				int googleResponse = genericUtility.checkLinks(currentGoogleUrl);
				softAssert.assertTrue(genericUtility.compareUrlSub(googleUrl, expectedGoogleUrl), "Possibly Navigating to Different Page "+googleUrl);
				softAssert.assertTrue(googleResponse==200, "Possibly Url is Invalid "+currentGoogleUrl + " Response Code "+googleResponse);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(news18Logo) , "Possibly Page is Not Visible "+currentGoogleUrl);
				if(currentGoogleUrl.contains(expectedGoogleUrl)) {
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
		}
		softAssert.assertAll("Issue Found in Article Body");
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
			if(webDriverActions.softIsElementDisplayed(authorLnk))
			{
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
			}
			else
			{
				softAssert.fail("Possibly Author Name Link is Not Visible in "+currentPageUrl);
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
	 * @param taboolaFeedArticle
	 * This method is used to Validate the Article Taboola In Body and RHS in Article Consumption Page
	 */
	public void verifyArticleTaboolaNavigation(String serverType , List<WebElement> articleLst, List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImglement, WebElement taboolaLogo)
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

	//----------  Career ---------//

	public void verifyCareerArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyCareerArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyCareerArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyCareerArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyCareerArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyCareerArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyCareerArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyCareerArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCareerArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyCareerArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCareerArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyCareerArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//----------  Cricket ---------//

	public void verifyCricketArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, cricketArticleLnk, breadCrumbLnks);
	}

	public void verifyCricketArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , cricketArticleLnk, articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyCricketArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , cricketArticleLnk , articleHighlightDiv );
	}

	public void verifyCricketArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,cricketArticleLnk , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyCricketArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,cricketArticleLnk, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyCricketArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, cricketArticleLnk ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyCricketArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, cricketArticleLnk, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyCricketArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cricketArticleLnk, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCricketArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketArticleLnk, articleSocialMediaIconLnk);
	}

	public void verifyCricketArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, cricketArticleLnk,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCricketArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, cricketArticleLnk, articleAuthorLnk, authorNameTxt);
	}

	public void verifyCricketArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	public void verifyLatestNewsArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyLatestNewsArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyLatestNewsArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyLatestNewsArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyLatestNewsArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyLatestNewsArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyLatestNewsArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyLatestNewsArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLatestNewsArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyLatestNewsArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyLatestNewsArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyLatestNewsArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}


	// --------------------------------- Vipin's Photogallery Business Logic --------------------------------//

	public void verifyFoodPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyFoodPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyFoodPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyFoodPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyFoodPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyFoodPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------------------------------------------- Latest News Photogallery Logic------------------------------------//
	public void verifyLatestNewsPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyLatestNewsPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyLatestNewsPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//--- Money Photogallery Logic------------------//
	public void verifyMoneyPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyMoneyPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyMoneyPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyMoneyPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyMoneyPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyMoneyPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//--- Entertainment Photogallery Logic------------------//
	public void verifyEntertainmentPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyEntertainmentPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyEntertainmentPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//--------------------------------------- Photo Photogallery Logic--------------------------------------------//
	public void verifyPhotoPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyPhotoPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyPhotoPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPhotoPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyPhotoPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyPhotoPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//----------------------------------------- Career Photogallery Logic----------------------------------------------//
	public void verifyCareerPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyCareerPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyCareerPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCareerPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyCareerPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCareerPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}


	//-------------------------------------Lifestyle( Photogallery )-------------------------------------------------//
	public void verifyLifestylePhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyLifestylePhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyLifestylePhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLifestylePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyLifestylePhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyLifestylePhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-----------------------------------------Health ( Photogallery )------------------------------------------------//
	public void verifyHealthPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyHealthPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyHealthPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyHealthPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyHealthPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyHealthPhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------------------------------------------Knowledge ( Photogallery )------------------------------------------------//
	public void verifyKnowledgePhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyKnowledgePhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyKnowledgePhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyKnowledgePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyKnowledgePhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyKnowledgePhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------------------------------------------Pradesh ( Photogallery )----------------------------------------------//
	public void verifyPradeshPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyPradeshPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyPradeshPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPradeshPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyPradeshPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyPradeshPhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------------Cricket( Photogallery )----------------------------//
	public void verifyCricketPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyCricketPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, cricketPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyCricketPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cricketPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCricketPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, cricketPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyCricketPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, cricketPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCricketPhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//----------------------------------------------Podcast ( Photogallery )-------------------------------------------------//
	public void verifyPodcastPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyPodcastPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyPodcastPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPodcastPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyPodcastPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyPodcastPhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-----------------------------------------------------World ( Photogallery )-----------------------------------------------------//
	public void verifyWorldPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyWorldPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyWorldPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyWorldPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyWorldPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyWorldPhotogalleryArticleTaboolaFeedValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*-------------------------------- Vipin's Business Logics ( Money )--------------------------------------------------*/

	public void verifyMoneyArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyMoneyArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyMoneyArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyMoneyArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyMoneyArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyMoneyArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyMoneyArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyMoneyArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyMoneyArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyMoneyArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyMoneyArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyMoneyArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}


	/*--------------------------------Vipin's Business Logics ( Food )--------------------------------------------------*/
	public void verifyFoodArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyFoodArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyFoodArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyFoodArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyFoodArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyFoodArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyFoodArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyFoodArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyFoodArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyFoodArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyFoodArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyFoodArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*--------------------------------Vipin's Business Logics ( Entertainment )--------------------------------------------------*/
	public void verifyEntertainmentArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyEntertainmentArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyEntertainmentArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyEntertainmentArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyEntertainmentArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyEntertainmentArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyEntertainmentArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyEntertainmentArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyEntertainmentArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyEntertainmentArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyEntertainmentArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyEntertainmentArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*--------------------------------Vipin's Business Logics ( Podcast )--------------------------------------------------*/

	public void verifyPodcastArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, podcastArticleELeList, breadCrumbLnks);
	}

	public void verifyPodcastArticleDescriptionValidation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,podcastArticleELeList ,articleFooterReadMoreLnk, podcastArticleDetailedDescriptionTxt,articleDetailedHighlightLnk );
	}

	public void verifyPodcastArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, podcastArticleELeList ,articleHeaderTxt ,podcastArticleLastUpdatedDateTxt, podcastArticleLastUpdatedTimeTxt);
	}

	public void verifyPodcastArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, podcastArticleELeList, podcastArticleSocialMediaIconLnk);
	}

	public void verifyPodcastArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , podcastArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyPodcastArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,podcastArticleELeList ,articleFooterReadMoreLnk, podcastArticleDetailedDescriptionTxt,articleDetailedHighlightLnk );
	}

	public void verifyPodcastArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , podcastArticleELeList , articleHighlightDiv );
	}

	public void verifyPodcastArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,podcastArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyPodcastArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, podcastArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyPodcastArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, podcastArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPodcastArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, podcastArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyPodcastArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, podcastArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyPodcastArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, podcastArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- LifeStyle ---------//

	public void verifyLifeStyleArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyLifeStyleArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyLifeStyleArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyLifeStyleArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyLifeStyleArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyLifeStyleArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyLifeStyleArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyLifeStyleArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLifeStyleArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyLifeStyleArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyLifeStyleArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyLifeStyleArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- Health ---------//

	public void verifyHealthArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyHealthArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyHealthArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyHealthArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyHealthArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyHealthArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyHealthArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyHealthArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyHealthArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyHealthArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyHealthArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyHealthArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- Knowledge ---------//

	public void verifyKnowledgeArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyKnowledgeArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyKnowledgeArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyKnowledgeArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyKnowledgeArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyKnowledgeArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyKnowledgeArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyKnowledgeArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyKnowledgeArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyKnowledgeArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyKnowledgeArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyKnowledgeArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- News18Minis ---------//

	public void verifyNews18MinisArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, news18MinisArticleELeList, breadCrumbLnks);
	}

	public void verifyNews18MinisArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , news18MinisArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyNews18MinisArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , news18MinisArticleELeList , articleHighlightDiv );
	}

	public void verifyNews18MinisArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,news18MinisArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyNews18MinisArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,news18MinisArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyNews18MinisArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, news18MinisArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyNews18MinisArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, news18MinisArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyNews18MinisArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, news18MinisArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyNews18MinisArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, news18MinisArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyNews18MinisArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, news18MinisArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyNews18MinisArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, news18MinisArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyNews18MinisArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, news18MinisArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}


	//----------Pradesh ---------//

	public void verifyPradeshArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, pradeshArticleLnk, breadCrumbLnks);
	}

	public void verifyPradeshArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , pradeshArticleLnk , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyPradeshArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , pradeshArticleLnk , articleHighlightDiv );
	}

	public void verifyPradeshArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,pradeshArticleLnk , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyPradeshArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,pradeshArticleLnk, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyPradeshArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, pradeshArticleLnk ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyPradeshArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, pradeshArticleLnk, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyPradeshArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, pradeshArticleLnk, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPradeshArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, pradeshArticleLnk, articleSocialMediaIconLnk);
	}

	public void verifyPradeshArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, pradeshArticleLnk,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyPradeshArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, pradeshArticleLnk, articleAuthorLnk, authorNameTxt);
	}

	public void verifyPradeshArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, pradeshArticleLnk , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*--------------------------------Vipin's Business Logics ( World )--------------------------------------------------*/
	public void verifyWorldArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyWorldArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyWorldArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyWorldArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyWorldArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyWorldArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyWorldArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyWorldArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyWorldArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyWorldArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyWorldArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyWorldArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*--------------------------------Vipin's Business Logics ( Astrology )--------------------------------------------------*/
	public void verifyAstrologyArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyAstrologyArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyAstrologyArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyAstrologyArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyAstrologyArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifyAstrologyArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyAstrologyArticleReadMoreValidation(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyAstrologyArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyAstrologyArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyAstrologyArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyAstrologyArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyAstrologyArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	/*--------------------------------Vipin's Business Logics ( Sahitya )--------------------------------------------------*/
	public void verifySahityaArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifySahityaArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifySahityaArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifySahityaArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifySahityaArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}

	public void verifySahityaArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifySahityaArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifySahityaArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifySahityaArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifySahityaArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifySahityaArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifySahityaArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- Nation ---------//

	public void verifyNationArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyNationArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyNationArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyNationArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyNationArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyNationArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyNationArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyNationArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyNationArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyNationArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyNationArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyNationArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//---------- Crime ---------//

	public void verifyCrimeArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, commonsectionArticleELeList, breadCrumbLnks);
	}

	public void verifyCrimeArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , commonsectionArticleELeList , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyCrimeArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , commonsectionArticleELeList , articleHighlightDiv );
	}

	public void verifyCrimeArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,commonsectionArticleELeList , articleFooterReadMoreLnk, articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyCrimeArticleTrendingValidation(String serverType)
	{
		verifyArticleTrendingValidation(serverType ,commonsectionArticleELeList, articleTrendingLnk, allTrendingWidgetsLnks);
	}


	public void verifyCrimeArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionArticleELeList ,articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyCrimeArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonsectionArticleELeList, articleDescriptionReadMoreLnk, articleDescriptionTxt);
	}

	public void verifyCrimeArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionArticleELeList, articleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCrimeArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonsectionArticleELeList, articleSocialMediaIconLnk);
	}

	public void verifyCrimeArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonsectionArticleELeList,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCrimeArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionArticleELeList, articleAuthorLnk, authorNameTxt);
	}

	public void verifyCrimeArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------Astrology------------//

	public void verifyAstrologyPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyAstrologyPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyAstrologyPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyAstrologyPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyAstrologyPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyAstrologyPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------News18 Minis------------//

	public void verifyNews18MinisPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, news18MinisPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyNews18MinisPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, news18MinisPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyNews18MinisPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, news18MinisPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyNews18MinisPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, news18MinisPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyNews18MinisPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, news18MinisPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyNews18MinisPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, news18MinisPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------Sahitya------------//

	public void verifySahityaPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifySahityaPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifySahityaPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifySahityaPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifySahityaPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifySahityaPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//-------------Nation------------//

	public void verifyNationPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyNationPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyNationPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyNationPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyNationPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyNationPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}
	//-------------Crime------------//

	public void verifyCrimePhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonsectionPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyCrimePhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonsectionPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyCrimePhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCrimePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyCrimePhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonsectionPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCrimePhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonsectionPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}

	//------------- Cartoon   -----------//

	public void verifyCartoonPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cartoonPhotogalleryArticleELeList, breadCrumbLnks);
	}

	public void verifyCartoonPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, cartoonPhotogalleryArticleELeList ,photogalleryArticleHeaderTxt ,photogalleryArticleLastUpdatedTxt , photogalleryArticleDescriptionTxt);
	}

	public void verifyCartoonPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, cartoonPhotogalleryArticleELeList, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCartoonPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyPhotogalleryArticleSocialMediaNavigation(serverType, cartoonPhotogalleryArticleELeList, photogalleryArticleSocialMediaIconLnk);
	}

	public void verifyCartoonPhotogalleryArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, cartoonPhotogalleryArticleELeList, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCartoonPhotogalleryArticleTaboolaFeedNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cartoonPhotogalleryArticleELeList , taboolaArticleList ,taboolaImgLnk, taboolaLogo);
	}


	//------------------------- Sanjeeb Photogallery Method ------------------------------------//




	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Numbering Of Photos With Photo Captions of body of Hindi Desktop Landing Page.
	 */
	public void verfyNumberingAndCaptionsOfPhotos()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		String mainURL = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(photosSectionEleLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());	
		for(int i=0;i<photosSectionEleLnks.size();i++)
		{
			webDriverActions.scrollDown();
			webDriverActions.softScrollToElement(photosSectionEleLnks.get(i));
			webDriverActions.softWaitForElementVisibility(photosSectionEleLnks.get(i), 1000);
			webDriverActions.softHighlightElement(photosCountLnks.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photosCountLnks.get(i)) , "Possibly Photos Count Is not There ");
			webDriverActions.softHighlightElement(photosImgCountLnks.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photosImgCountLnks.get(i)) , "Possibly Photos Image Count Is not There ");
			webDriverActions.softHighlightElement(photosCaptionsLnks.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photosCaptionsLnks.get(i)) , "Possibly Photos Captions Is not There ");	
		}
		softAssert.assertAll("Issues Found In Validating numbering And Captions Of Photos "+mainURL);
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Numbering Of Photos With Photo Captions of body of Hindi Desktop Landing Page.
	 */
	public void verfyPhotosDescriptionsInExpandedView()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		String mainURL = webDriverActions.getCurrentPageUrl();	
		softAssert.assertTrue(photosSectionExpandViewLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());	
		for(int i=0;i<photosSectionExpandViewLnks.size();i++)
		{
			webDriverActions.scrollDown();
			webDriverActions.softScrollToElement(photosSectionExpandViewLnks.get(i));
			webDriverActions.softWaitForElementVisibility(photosSectionExpandViewLnks.get(i), 1000);
			webDriverActions.softHighlightElement(photosSectionExpandViewLnks.get(i));
			String numbering = webDriverActions.getTextFromElement(photosCountLink.get(i));
			webDriverActions.softClickJS(photosSectionExpandViewLnks.get(i));
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(numberingExpandedView.get(i));
			String text = webDriverActions.getTextFromElement(numberingExpandedView.get(i));

			//------ validating the Numbers Present in Expended View with The Ouside Photo Numbering-----------
			softAssert.assertTrue(numbering.equals(text) , "Possibly Counting mismatch");

			//------ validating social share Icons in extended View ---------------
			webDriverActions.waitForSecond(500);
			webDriverActions.softHighlightElement(expandedViewSocialShareBtn);
			webDriverActions.softClickJS(expandedViewSocialShareBtn);
			softAssert.assertTrue(photosSectionExpandViewSocialShareLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
			for(int k=0;k<photosSectionExpandViewSocialShareLnks.size();k++)
			{
				webDriverActions.softHighlightElement(photosSectionExpandViewSocialShareLnks.get(k));
				String actual = webDriverActions.getAttribute("href", photosSectionExpandViewSocialShareLnks.get(k));
				if(actual.contains("whatsapp")|| actual.contains("facebook")||actual.contains("twitter")) {
					Logs.info(getClass(), "Social Share Verification Passed");
				}
				else
				{
					softAssert.fail("Possibly Social Share Icons are Not displayed on Extended Mode ");
				}
			}

			//------ validating Header Title and Captions ---------------
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(expandedViewPhotosCaption.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewPhotosCaption.get(i)), "Possibly Captions not visible");	

			//------ validating Read More in extended View ---------------
			webDriverActions.waitForSecond(500);
			webDriverActions.softHighlightElement(expandedViewReadMoreLnk.get(i));
			webDriverActions.softClickJS(expandedViewReadMoreLnk.get(i));
			webDriverActions.waitForSecond(1000);
			webDriverActions.softHighlightElement(expandedViewFullViewReadMoreLnk.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewFullViewReadMoreLnk.get(i)) , "Possibly ReadMore Link Is not Working Fine");

			//------ validating Play and Pause Btn ---------------
			webDriverActions.softHighlightElement(expandedViewPlayAndPauseBtn);
			webDriverActions.softClickJS(expandedViewPlayAndPauseBtn);
			String text1="";
			boolean status =true;
			for(int j=0;j<3;j++)
			{
				webDriverActions.waitForSecond(1000);
				text1 = webDriverActions.getTextFromElement(numberingExpandedView.get(i));
				status = text.equals(text1);
				if(status==false)
				{
					break;
				}
			}
			softAssert.assertTrue(status==false , "Possibly Play Or Pause Button is Not Working ");
			webDriverActions.softClickJS(expandedViewPlayAndPauseBtn);
			webDriverActions.softHighlightElement(expandedViewCloseBtn);
			webDriverActions.softClickJS(expandedViewCloseBtn);
		}
		softAssert.assertAll("Issue Found In Validating Photos Descriptions In Expanded View "+mainURL);
	}

	//=======-----Anupam Business Logic=======================
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page in Hindi revamp Page.
	 */
	public void verifyArticleFirstPublishedAndAuthorNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 2);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 1))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(firstpublished, 1);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(firstpublished, 1) , "Possibly firstpublished is Not Visible "+currentPageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorNameLnk, 1) , "Possibly author Name is Not Visible in bottom "+currentPageUrl);

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
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Latest News widget in Hindi revamp Page.
	 */
	public void verifyLatestNewsArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page in Hindi revamp Page.
	 */
	public void verifyVideoBetweenArticleNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
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
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 1))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				if(webDriverActions.softIsElementDisplayed(videoBetweenArticle, 2)) {
					webDriverActions.softScrollToElement(videoBetweenArticle);
					webDriverActions.waitForSecond(1000);
					DriverUtility.getDriver().switchTo().frame(videoBetweenArticle);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(pauseBtn, 2) , "Possibly play button is not working in video between article"+currentPageUrl);
					webDriverActions.softWaitForElementVisibility(pauseBtn, 5);
					webDriverActions.softClickJS(pauseBtn);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(playBtn, 2) , "Possibly pause button is not working in video between article"+currentPageUrl);


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
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Latest News widget in Hindi revamp Page.
	 */
	public void verifyLatestNewsVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page in Hindi revamp Page.
	 */
	public void verifyTagsNavigation(String serverType , List<WebElement> articleLst, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
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
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 1))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(liveTagsKey, 2);
				//				webDriverActions.continuousScrollTillAllElement(tagsValue, 10);
				//				softAssert.assertTrue(tagsValue.size()>0, "Possibly Tags is Not Visible"+"\t"+currentPageUrl);

				if(webDriverActions.softIsElementDisplayed(liveTagsKey, 1)) {
					softAssert.assertTrue(tagsValue.size()>0,"Possibly Tag links are not present in"+"\t"+currentPageUrl);
					for(int j=0; j<tagsValue.size(); j++) {
						webDriverActions.softScrollToElement(tagsValue.get(j));
						webDriverActions.softMouseHover(tagsValue.get(j));
						webDriverActions.softHighlightElement(tagsValue.get(j));
						String actualTagUrl = webDriverActions.getAttribute("href", tagsValue.get(j));
						webDriverActions.softClickJS(tagsValue.get(j));
						String currentPageTagUrl = webDriverActions.getCurrentPageUrl();
						String expectedTagUrl = webDriverActions.getCurrentPageUrl();
						if(serverType.equalsIgnoreCase("preProd") && !currentPageTagUrl.contains("//beta")) {
							String betaUrl = genericUtility.replaceInUrl(currentPageTagUrl);
							webDriverActions.navigateToUrl(betaUrl);
							currentPageTagUrl = betaUrl;
						}

						int tagPageResponse = genericUtility.checkLinks(currentPageTagUrl);
						softAssert.assertTrue(genericUtility.compareUrlSub(actualTagUrl, expectedTagUrl), "Possibly Navigating to Different Page "+actualTagUrl);
						softAssert.assertTrue(tagPageResponse==200, "Possibly Url is Invalid "+currentPageTagUrl + " Response Code "+tagPageResponse);
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb, 1) , "Possibly Page is Not Visible "+currentPageTagUrl);
						if (currentPageTagUrl.contains(expectedTagUrl)) {
							webDriverActions.navigateBack();
						}
						else {
							webDriverActions.navigateBack();
							webDriverActions.navigateBack();
						}
					}
				}
				else {
					softAssert.fail("Possibly Tag is not present in"+"\t"+currentPageUrl);
				}
			}
			webDriverActions.waitForSecond(1000);
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
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Latest News widget in Hindi revamp Page.
	 */
	public void verifyLatestNewsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page in Hindi revamp Page.
	 */
	public void verifyArticleConclusionNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 2);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 1))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(conclusionDiv, 2);
				//				webDriverActions.softMouseHover(conclusionDiv);
				//				webDriverActions.softHighlightElement(conclusionDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(conclusionDiv, 1) , "Possibly Conclusion Division is Not Visible "+currentPageUrl);

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
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Latest News widget in Hindi revamp Page.
	 */
	public void verifyLatestNewsArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	public void verifyMoneyTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	public void verifyMoneyArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Money Widget in Hindi revamp Page.
	 */
	public void verifyMoneyVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	public void verifyMoneyArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	public void verifyFoodTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	public void verifyFoodArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Food Widget in Hindi revamp Page.
	 */
	public void verifyFoodVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	public void verifyFoodArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	public void verifyEntertainmentTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	public void verifyEntertainmentArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	public void verifyEntertainmentVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	public void verifyEntertainmentArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	public void verifyCareerTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	public void verifyCareerArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Career Widget in Hindi revamp Page.
	 */
	public void verifyCareerVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	public void verifyCareerArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	public void verifyLifeStyleTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	public void verifyLifeStyleArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	public void verifyLifeStyleVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	public void verifyLifeStyleArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	public void verifyHealthTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	public void verifyHealthArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Health Widget in Hindi revamp Page.
	 */
	public void verifyHealthVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	public void verifyHealthArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	public void verifyKnowledgeTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	public void verifyKnowledgeArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	public void verifyKnowledgeVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	public void verifyKnowledgeArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	public void verifyLatestMobileTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, mobilesectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	public void verifyLatestMobileArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, mobilesectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	public void verifyLatestMobileVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, mobilesectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	public void verifyLatestMobileArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, mobilesectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	public void verifyPradeshTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	public void verifyPradeshArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	public void verifyPradeshVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	public void verifyPradeshArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	public void verifyWorldTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for World Widget in Hindi revamp Page.
	 */
	public void verifyWorldArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for World Widget in Hindi revamp Page.
	 */
	public void verifyWorldVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	public void verifyWorldArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	public void verifyAstrologyTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	public void verifyAstrologyArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Astrology Widget in Hindi revamp Page.
	 */
	public void verifyAstrologyVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	public void verifyAstrologyArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	public void verifySahityaTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	public void verifySahityaArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	public void verifySahityaVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	public void verifySahityaArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	public void verifyNationTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	public void verifyNationArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Nation Widget in Hindi revamp Page.
	 */
	public void verifyNationVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	public void verifyNationArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	public void verifyCrimeTagNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, commonsectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	public void verifyCrimeArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Crime Widget in Hindi revamp Page.
	 */
	public void verifyCrimeVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, commonsectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	public void verifyCrimeArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, commonsectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	public void verifyCricketTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, cricketSectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	public void verifyCricketArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, cricketSectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Cricket Widget in Hindi revamp Page.
	 */
	public void verifyCricketVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, cricketSectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	public void verifyCricketArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, cricketSectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	public void verifyPodcastTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, podcastSectionArticleELeList,tagBreadcrumb);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	public void verifyPodcastArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, podcastSectionArticleELeList);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Podcast Widget in Hindi revamp Page.
	 */
	public void verifyPodcastVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, podcastSectionArticleELeList);
	}

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	public void verifyPodcastArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, podcastSectionArticleELeList);
	}


	//photo

	public void verifyPhotoArticleExpandNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		Assert.assertTrue(articleLst.size()>0, "Possibly  Article is Not Visible");
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
				softAssert.assertTrue(expandLnk.size()>0, "Possibly Money Article is Not Visible");
				for(int j=0; j<expandLnk.size(); j++) {
					webDriverActions.softScrollToElement(expandLnk.get(j));
					webDriverActions.softMouseHover(expandLnk.get(j));
					webDriverActions.softHighlightElement(expandLnk.get(j));
					webDriverActions.softClickJS(expandLnk.get(j));
					webDriverActions.waitForSecond(1000);
					Logs.info(getClass(), "Expand button count"+"\t"+(j+1));
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeExpandLnk,3) , "Possibly Expand button is Not working  "+(j+1)+"\t"+currentPageUrl);
					if(webDriverActions.softIsElementDisplayed(closeExpandLnk, 3)) {
						webDriverActions.softClickJS(closeExpandLnk);
						webDriverActions.waitForSecond(1000);
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

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyKnowledgePhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	public void verifyPhotoArticleTopAdsNavigation(String serverType , List<WebElement> articleLst) {
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

				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(topAds,10) , "Possibly Header Ads is not present "+"\t"+currentPageUrl);
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

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyKnowledgePhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Health Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyHealthPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Health Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyHealthPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyAstrologyPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyAstrologyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Career Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCareerPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Career Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCareerPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Photo Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,photoSectionPhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Photo Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,photoSectionPhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCricketPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,cricketLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCricketPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,cricketLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Crime Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCrimePhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Crime Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyCrimePhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyEntertainmentPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyEntertainmentPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Food Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyFoodPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Food Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyFoodPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Latest Mobiles Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLatestMobilePhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,mobileLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Latest Mobiles Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLatestMobilePhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,mobileLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Latest News Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLatestNewsPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Latest News Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLatestNewsPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Life Style Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLifeStylePhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Life Style Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyLifeStylePhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Money Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyMoneyPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Money Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyMoneyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Nation Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyNationPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Nation Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyNationPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPodcastPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,podcastLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPodcastPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,podcastLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPradeshPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyPradeshPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifySahityaPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType, commonLineOnePhotoGalleryArticleELeList);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifySahityaPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for World Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyWorldPhotoArticleTopAdsNavigation(String serverType)
	{
		verifyPhotoArticleTopAdsNavigation(serverType, commonLineOnePhotoGalleryArticleELeList);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for World Widget in Hindi revamp Page.
	 * @param serverType
	 */
	public void verifyWorldPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonLineOnePhotoGalleryArticleELeList );
	}

}
