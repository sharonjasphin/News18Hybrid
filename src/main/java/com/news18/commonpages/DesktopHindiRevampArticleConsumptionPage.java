package com.news18.commonpages;

import java.util.ArrayList;
import java.util.List;

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

public class DesktopHindiRevampArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;

	public DesktopHindiRevampArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//================================CommonCategory Article Elements ==================

	// Common Category Articles Links //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/video'))]")
	private List<WebElement> commonsCategoryArticleLnk;

	//================================CommonCategory Article Elements ==================

	// Cricket Article Links in Cricket Page //
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[not(contains(@href,'/photo')) and not(contains(@href,'/video'))]")
	private List<WebElement> cricketCategoryArticleLnk;


	//================================Common Photo Article Elements =====================================================

	/*Latest Section Articles */
	@FindBy(xpath="//div[contains(@class,'topnew')]/a[contains(@href,'/photogallery/') and not(contains(@href,'/video'))] | //ul[contains(@class,'topstories')]/li/a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement>  commonPhotoArticleELeList;

	/*Latest Section Articles */
	@FindBy(xpath="//div[contains(@class,'pht-tp')]//ul[contains(@class,'rgt')]//li[not(contains(@class,'glide__slide--clone'))]/a[not(contains(@href,'/video')) and (contains(@href,'/photogallery/'))]")
	private List<WebElement>  photoSectionPhotoArticleELeList;

	/*Cricket Articles photogallery category */
	@FindBy(xpath="//div[contains(@class,'CN-section') ]//a[not(contains(@href,'/video')) and (contains(@href,'/photogallery/'))]")
	private List<WebElement>  cricketSectionPhotoArticleELeList;

	//================================Common Video Article Elements =====================================================

	// Common Article Links in Money Page //   //==money | Entertainment | Pradesh | Knowledge | Jobs | Tech | Nation | Life | World | Crime ==//
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/')]")
	private List<WebElement> commonVideoArticleLnk;  

	// Cricket Article Links in Cricket Page //
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/'))]")
	private List<WebElement> cricketVideoArticleLink;
	
	// Blogs Article Links in Cricket Page //
	@FindBy(xpath = "//div[contains(@class,'list__item')]//h2//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/')]")
	private List<WebElement> blogsVideoArticleLink;

	/*Video Article Description Text in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videobox')]/p")
	private WebElement videoArticleDescription;

	/*Video Article Read More Link in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videobox')]//a[contains(@class,'readmorebtn')]")
	private WebElement videoArticleReadMoreDescriptionBtn;

	//---------------Vipin Videos Webelement -------------------------------------//

	/* Common Video Article Links in Line one and Line two Tab */
	@FindBy(xpath = "//ul[contains(@class,'newctgrtopstories')]/li/a[contains(@href,'/videos/')]")
	private List<WebElement> commonVideoArticleLnks ;

	/*Video Article Title In Video Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'videobox')]/h2")
	private WebElement videoArticleTitleTxt;

	/*Video Article Date Time Text in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videobox')]/div[contains(@class,'videobxupdtshare')]/ul[contains(@class,'video')]/li[contains(.,':')]")
	private WebElement videoArticleDateTime;

	/*Video Article Channel Name Text in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videobox')]/div[contains(@class,'videobxupdtshare')]/ul[contains(@class,'video')]/li[contains(.,'18')]")
	private WebElement videoArticleChannel;

	/*Video Article Social Share Icons Link in Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'videobox')]//div[contains(@class,'videobxshare')]/a")
	private List<WebElement> videoArticleSocialShareIcon;


	//===============================common Category Articles Elements=======================================

	/*Money Section Articles */
	@FindBy(xpath="//div[contains(@class,'newleftwrap')]/ul[contains(@class,'newctgrtopstories')]//a[not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionMoneyELeList;

	/*cricket Section Articles */
	@FindBy(xpath="//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/sports/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionCricketELeList;

	/*Entertainment Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/entertainment/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionEntertainmentELeList;

	/*Food Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/lifestyle/recipe/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionFoodELeList;

	/*Mobile Section Articles */
	@FindBy(xpath="//div[contains(@class,'lmn_wrp')]//a[contains(@href,'/tech/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionMobileELeList;

	/*States Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[ not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionStatesELeList;

	/*Knowledge Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/knowledge/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionKnowledgeELeList;

	/*Jobs Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/jobs/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionJobsELeList;

	/*Tech Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/tech/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionTechELeList;

	/*Nation Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionNationELeList;

	/*LifeStyle Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionLifestyleELeList;

	/*World Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionWorldELeList;

	/*Crime Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineOneSectionCrimeELeList;

	/*Latest Section Articles */
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[not(contains(@href,'/videos/')) and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineTwoSectionPriorityELeList;


	//=============================     Sanjeeb's Elements     ===================================================================

	/*Change Language ele List Present On Header part of home page */
	@FindBy(xpath ="//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> changeLanguageEleList; 

	/*LineOne Section Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'newhdrlng')])[1]")
	private WebElement changeLanguageSection;  

	/*Search Button Link Present on Line One Section of Homepage*/
	@FindBy(xpath ="//ul[contains(@class,'newhdrrgttoprgt')]//a[contains(@id,'search-click')]")
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

	/*Change Language ele List Present On Header part of home page */
	@FindBy(xpath ="//div[contains(@class,'newlvtvboxhover')]//a")
	private List<WebElement> liveTvEleList; 

	/*LineOne Section Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="(//div[contains(@class,'newlvtvbox')])[1]")
	private WebElement liveTvSection; 

	/*LineOne Section Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'nav_bar')]")
	private WebElement lineOneSection; 

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//ul[contains(@class,'newhdrrgttoprgt')]//a[contains(@class,'newappdnwld')]")
	private WebElement downloadNews18AppLnk;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'gpaimg')]//a//img")
	private List<WebElement> appStore;

	/*follow Us Icon Present on Header Of Hindi Landing page*/
	@FindBy(xpath ="//div[contains(@class,'newtopsocial')]")
	private WebElement followUsSection;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'newtopsocial')]//a")
	private List<WebElement> followUsSectionEleList;

	//changes
	/*LineOne Section Elements except states Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li[not (contains(@class,'add-logo'))]/a[not (contains(@title,'होम'))]")
	private List<WebElement> lineOneSectionEleList; 

	/*LineOne Section Elements except states Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]/li/a[(contains(@href,'states'))]")
	private List<WebElement> lineOneSectionStatesEleList; 

	/*Linetwo Section Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'sub_navigation_ul')]")
	private WebElement lineTwoSection;  

	/*Linetwo Section Elements Present on header Part of Hindi Desktop landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'sub_navigation_ul')]//a")
	private List<WebElement> lineTwoSectionEleList; 

	/*Choose Your City Btn Present On Header LineOne*/
	@FindBy(xpath="//div[contains(@class,'header_search')]//a")
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

	/*Footer Trending Topics Links Present on Hindi Desktop landing Page*/
	@FindBy(xpath="//footer[contains(@class,'common-footer')]/section[contains(@class,'ftr_container')]/div/div[not (contains(@class,'live_tv'))]//a")
	private List<WebElement> footerFirstLayerLnks;

	/*Footer Trending Topic Section  Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="//footer[contains(@class,'common-footer')]/section[contains(@class,'ftr_container')]")
	private WebElement footerFirstLayerLnk;

	/*Footer Live Tv Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'live_tv')]")
	private WebElement footerliveTVLnk;

	/*Footer Live Tv Link Present on Hindi Desktop landing Page*/
	@FindBy(xpath="((//div[contains(@class,'ftr_row')])[2]/div)[2]//a")
	private List<WebElement> footerliveTVEleLnks;

	/*Footer LineTwo Section Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]//a")
	private List<WebElement> footerLineTwoEleLnks;

	/*Footer Line Two Links Present in footer Section of News 18 Home Page*/
	@FindBy(xpath="//div[contains(@class,'bottom_row')]")
	private WebElement footerLineTwoLnk;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//ul[contains(@class,'nav_bar')]//a[not (contains(@href,'/entertainment/')) and not (contains(@href,'/states/'))and not (contains(@href,'/tech/'))]")
	private List<WebElement> lineOneEleListForArticle;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div//ul[contains(@class,'nav_bar')]//li[contains(@class,'nav_bar_li')]//a[((@href='/entertainment/')) or (@href='/states/')or(@href='/tech/')]")
	private List<WebElement> lineOneContainsEleListForArticle;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'outterSubmenu')]/a")
	private List<WebElement> lineOneArticleEleListForArticle;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'newnavnews')]/ul/li/a")
	private List<WebElement> lineOneSubSectionEleListForArticle;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'innerSubmenu')]//a")
	private List<WebElement> lineOneInnerSubSectionEleListForArticle;

	/*Footer LineTwo Section Hindi Desktop landing Page*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]//a")
	private List<WebElement> footerLineTwoSocialEleLnks;

	/*Footer Line Two Links Present in footer Section of News 18 Home Page*/
	@FindBy(xpath="//div[contains(@class,'social_icon')]")
	private WebElement footerLineTwoSocialSectionLnk;

	/*---------------------------------DanishR WebElments----------------------------------------------------------*/

	/* photo Title present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'/photo')]")
	private WebElement photoTitle;

	/* photo Article Links present at the RHS*/
	@FindBy(xpath ="//ul[contains(@class,'newrgtphotolist')]//li//a")
	private List<WebElement> photoArticleLinks;

	/* photo more news link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'moretrndstroy')]//a|//div[contains(@class,'newphtcnsmpn-right')]/a")
	private WebElement photoMoreLink;

	/* Top Story Title present at the RHS*/
	@FindBy(xpath ="//div//h2//a[contains(@href,'latest-news')]")
	private WebElement topStoryTitle;

	/* Top Story Article Links present at the RHS*/
	@FindBy(xpath ="//ul[contains(@class,'newrgttopstory')]//li//a")
	private List<WebElement> topStoryArticleLinks;

	/* Top Story more news link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newpwhitebgbtn')]//a")
	private WebElement topStoryMoreLink;

	/* Trending Title present at the RHS*/
	@FindBy(xpath ="//div//h2[contains(@class,'trndstoryhd')]")
	private WebElement trendingTitle;

	/* Trending Article Links present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'trndstory')]//ul//li//a")
	private List<WebElement> trendingArticleLinks;

	/* Trending more news link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'trndstory')]/a")
	private WebElement trendingMoreLink;

	/* You may like content Ads in RHS of Article Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]//span[contains(text(),'You May Like')]")
	private List<WebElement> taboolaArticleRHSLnk;

	/* You may like content Ads in RHS of Article Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]")
	private WebElement rhsPromotedContent;


	// ---------------------------Vipin's Webelement ------------------------------------------//

	/*BreadCrumb Links present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'bread') or contains(@class,'brdc')]//a[@href]")
	private List<WebElement> breadCrumbLnks;

	/*Read More Description link in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//h2/span[contains(@class,'readmoreintro')]")
	private WebElement articleDescriptionReadMoreLnk;

	/*Read More Description Text in Article Description Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//h2")
	private WebElement articleDescriptionTxt;

	/*HeaderText present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'artcl_lft') or contains(@class,'blog')]//h1")
	private WebElement articleHeaderTxt;

	/*Photogallery Article Header Text in Photogallery Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'newphtcnsmpn')]//h1/parent::div/p")
	private WebElement photogalleryArticleHeaderTxt;

	/*News18 Agency Link in photogallery Article Content Division*/
	@FindBy(xpath = "//div[contains(@class,'brdcrmb')]/following-sibling::ul[contains(@class,'newphtbyline')]/li/span/a")
	private WebElement photogalleryArticleAgencyLnk;

	/*photogallery Article Description Author Name Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'brdcrmb')]/following-sibling::ul[contains(@class,'newphtbyline')]/li/following-sibling::li/a")
	private WebElement photogalleryArticleAuthorLnk;

	/*Photogallery Article Detailed Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'newphtbox')]/div[contains(@class,'newphtbox-in')]/p")
	private List<WebElement> photogalleryArticleDetailedDescriptionTxt;

	/*Photogallery Article Info Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'newphtbox')]/div[contains(@class,'newphtbox-in')]/p")
	private WebElement photogalleryArticleInfoDescriptionTxt;

	/*Photogallery Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'brdcrmb')]/following-sibling::ul[contains(@class,'newphtbyline')]/li/time")
	private WebElement photogalleryArticleLastUpdatedTxt;

	/*News18 Agency Link in Article Content Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'agency')]/li/span/a")
	private WebElement articleAgencyLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'author-brief')]/h1")
	private WebElement news18AgencyTxt;

	/*Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'agency')]/li/b")
	private WebElement articleLastUpdatedTxt;

	/*Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'agency')]/li/time")
	private WebElement articleLastUpdatedTimeTxt;

	/*Article Share on Social Media Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'share')]/li/a")
	private List<WebElement> articleSocialMediaIconLnk;

	/*Photogallery Article Social Media Icons Link in Photogallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'newphtbox')][1]/div[contains(@class,'share')]/a")
	private List<WebElement> photogalleryArticleSocialMediaLnk; 

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
	@FindBy(xpath ="//div[contains(@class,'r-')]//h1")
	private WebElement twitterHeader;

	/*Article Content Google News Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'share')]/li/div//a")
	private WebElement articleGoogleNewsLnk;

	/*News18 Google Header */
	@FindBy(xpath = "//div/h2[contains(.,'News18 हिंदी')]")
	private WebElement googleNews18Logo;

	/*Article Description Author Name Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'article_content_row')]//ul[contains(@class,'author')]//div[contains(@class,'author-intro')]/a")
	private WebElement articleAuthorLnk;

	/*Author Name Text In article By Line */
	@FindBy(xpath = "//div[contains(@class,'author')]/h1")
	private WebElement authorNameTxt;

	/*Article Tags Links in Article Consumption Page*/
	@FindBy(xpath = "//p[contains(@class,'tag')]/a")
	private List<WebElement> articleTagsLnk;

	/*Article Related News Links in LHS Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'related')]/ul/li/a")
	private List<WebElement> articleRelatedNewsLnk;

	/*Article Highlight Section Division in Article Consumption page*/
	@FindBy(xpath = "//div[contains(@class,'artclhglght')]")
	private WebElement articleHighlightDiv;

	/*Article Detailed Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article_section')]/div//p/strong/parent::p")
	private List<WebElement> articleDetailedDescriptionTxt;

	/*Article Detailed Description Header Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'khbren_section')]//p//a[contains(@href,'news18')]")
	private List<WebElement> articleDetailedHighlightLnk;

	/*Article Footer Read More Link in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'read-more')]/a")
	private WebElement articleFooterReadMoreLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaArticleLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaImgLnk;

	/*RHS Taboola Logo in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'link-attribution')]")
	private WebElement rhsTaboolaLogo;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*Article After Click Aur Padhe in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'article-active')]")
	private WebElement activeReadMoreDiv;

	/*Read More Link in Footer Body Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'read-more')]/a")
	private WebElement footerReadMoreLnk;

	/*Footer SocialMedia Icon Links present in the article consumption page*/
	@FindBy(xpath="//div[contains(@class,'insideShare')]/ul/li/a")
	private List<WebElement> reFooterSocialMediaLnks;

	/*Article Contents Food LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'newbyeline recipe-newbyeline')]//ul[contains(@class,'artclbyeline-agency')]/li/b")
	private WebElement foodArticleLastUpdatedTxt;


	/*Article Contents Food LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'newbyeline recipe-newbyeline')]//ul[contains(@class,'artclbyeline-agency')]/li/time")
	private WebElement foodArticleLastUpdatedTimeTxt;

	/*Article Share on Social Media Link in Food Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'newbyeline recipe-newbyeline')]//ul[contains(@class,'share')]/li/a")
	private List<WebElement> foodArticleSocialMediaIconLnk;

	/*News18 Agency Link in Food Article Content Division*/
	@FindBy(xpath = "//div[contains(@class,'artcl_contents')]//div[contains(@class,'newbyeline recipe-newbyeline')]//ul[contains(@class,'agency')]/li/span/a")
	private WebElement foodArticleAgencyLnk;


	//---------------------- Ajab-Gajab ----------------------//

	/* Common Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//ul[contains(@class,'newctgrtopstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> commonArticleLnks ;


	/* Common Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//ul[contains(@class,'newctgrtopstories')]//li//a[contains(@href,'/photogallery/')]")
	private List<WebElement> commonPhotogalleryArticleLnks ;

	/*Photo Section Photogallery Article Link in Homepage */
	@FindBy(xpath = "//ul[contains(@class,'pht-tp')]/li/a[contains(@href,'/photogallery/')]")
	private List<WebElement> photoSectionPhotogalleryArticleLnk;


	//---------------Cricket Category-----------//
	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a")
	private List<WebElement> cricketArticleLnk;

	/*Cricket Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> cricketPhotogalleryArticleLnk;

	/*----------------- Blogs Category -----------------------------*/

	/*Blogs Photogallery Article Link in Line two Blogs Category Page */
	@FindBy(xpath = "//ul[contains(@class,'list__items')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> blogsPhotogalleryArticleLnk;

	// ---------------------- Sanjeeb Photogallery Webelement ----------------------------//

	/*Photos Count*/
	@FindBy(xpath="//div[contains(@class,'newphtbox-in')]//span")
	private List<WebElement> photosCountLnks;

	/*Photos Image Count*/
	@FindBy(xpath="//div[contains(@class,'newphtbox-in')]//img")
	private List<WebElement> photosImgCountLnks;

	/*Photos Captions Links*/
	@FindBy(xpath="//div[contains(@class,'newphtbox-in')]//p")
	private List<WebElement> photosCaptionsLnks;

	/*Photos Section Links*/
	@FindBy(xpath="//div[contains(@class,'newphtbox-in')]")
	private List<WebElement> photosSectionEleLnks;


	/*Photos Section Links*/
	@FindBy(xpath="//div[contains(@class,'newphtbox')]/a")
	private List<WebElement> photosSectionExpandViewLnks;

	/*Numbering Present under Expanded View*/
	@FindBy(xpath="(//div[contains(@class,'phtcntnmbr')]/span)[1]")
	private WebElement numberingExpandedView;

	/*Expanded View Inside Close Btn*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodelwrap')]/a")
	private WebElement expandedViewCloseBtn;

	/*Expanded View Play and Pause Btn*/
	@FindBy(xpath="//div[contains(@class,'phtplaytn')]")
	private WebElement expandedViewPlayAndPauseBtn;

	/*Expanded View Header Text*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodel-right')]//h2")
	private WebElement expandedViewHeaderTxt;

	/*Expanded View photo Captions*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodel-right')]//p")
	private WebElement expandedViewPhotosCaption;

	/*Photos Section Extended view Social share Links*/
	@FindBy(xpath="//div[contains(@class,'phtfullviewmodel')]/div[contains(@class,'newphtshare')]//a")
	private List<WebElement> photosSectionExpandViewSocialShareLnks;

	/*Expanded View Header Text*/
	@FindBy(xpath="(//div[contains(@class,'phtfullviewmodelarrow')]/button)[2]")
	private WebElement expandedViewRightArrowBtn;

	/*Expanded View photo Captions*/
	@FindBy(xpath="(//div[contains(@class,'phtfullviewmodelarrow')]/button)[1]")
	private WebElement expandedViewLeftArrowBtn;


	// ---------------------------Anupam's Webelement ------------------------------------------//
	/* read more present in article page*/
	@FindBy(xpath ="//div[contains(@class,'read-more-box')]/a")
	private WebElement readMoreBox;


	/* tags present in article page*/
	@FindBy(xpath ="//p[contains(.,'Tags:')]")
	private WebElement liveTagsKey;

	/* tags present in article page*/
	@FindBy(xpath ="//p[contains(@class,'tag')]/a")
	private List<WebElement> tagsValue;

	/* tags breadcrumb present in Tags page*/
	@FindBy(xpath ="//div[contains(@class,'brdacrum')]")
	private WebElement tagBreadcrumb;

	/* first published present in article page*/
	@FindBy(xpath ="//div[contains(@class,'post_date')] | //div[contains(@class,'bynow-text')]")
	private WebElement firstpublished;

	/* author  present in bottom of article page*/
	@FindBy(xpath ="//div[contains(@class,'ps_col')]//div[contains(@class,'author-intro')]/a")
	private WebElement authorNameLnk;

	/* video present between article page*/
	@FindBy(xpath ="//div[contains(@data-video-event,'Article_Youtube')]//iframe | //div[contains(@class,'youTubeVideoPlayer')]//iframe")
	private WebElement videoBetweenArticle;

	/* video large play button present between article page*/
	@FindBy(xpath ="//button[contains(@class,'large-play-button')]")
	private WebElement videoLargePlayButton;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//div[contains(@class,'ytp-left-controls')]//button[contains(@class,'play-button') and contains(@data-title-no-tooltip,'Pause') ]")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//div[contains(@class,'ytp-left-controls')]//button[contains(@class,'play-button') and contains(@data-title-no-tooltip,'Play') ]")
	private WebElement playBtn;

	//	/* RHS top ads present in Article page*/
	//	@FindBy(xpath = "//div[contains(@class,'sideTop rhs_common_side_top')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	//	private WebElement rhsTopAds;
	//	
	//	/* RHS top ads video link present in Article page*/
	//	@FindBy(xpath = "//gwd-video[@id=\"Discovery_video\"]")
	//	private WebElement rhsTopAdsVideoLink;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'sideTop rhs_common_side_top')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsTopAds;

	/* RHS top ads video link present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'GoogleActiveViewElement')]//a | //gwd-video[@id='Discovery_video']")
	private WebElement rhsTopAdsLink;
	//div[contains(@class,'GoogleActiveViewElement')]//a | //gwd-video[@id='Discovery_video']
	/* conclusion present in bottom of article page*/

	@FindBy(xpath ="//p[contains(@class,'read_more_links')]")
	private WebElement conclusionDiv;


	// Expand photo in photogallery article link//
	@FindBy(xpath = "//div[contains(@class,'newphtbox')]//a[contains(@class,'fullviewbtn')]")
	private List<WebElement> expandLnk;

	// Expand photo in photogallery article link//
	@FindBy(xpath = "//div[contains(@class,'phtfullviewmodelwrap')]/a")
	private WebElement closeExpandLnk;

	// up and down arrow in photogallery article link//
	@FindBy(xpath = "//div[contains(@class,'newphtbtn')]/div")
	private List<WebElement> upAndDownArrow;

	//==Article present in section

	// Cricket Article Links in Cricket Page //
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> cricketArticleLink;

	// Crime Article Links in Crime Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> crimeArticleLink;

	// Entertainment Article Links in Entertainment Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> entertainmentArticleLink;

	// Food Article Links in Food Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> foodArticleLink;

	// Knowledge Article Links in Knowledge Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> knowledgeArticleLink;

	// Life Article Links in Life Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> lifeArticleLink;

	// Nation Article Links in Nation Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> nationArticleLink;

	// Jobs Article Links in Jobs Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> jobsArticleLink;

	// Pradesh Article Links in Pradesh Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> pradeshArticleLink;

	// Tech Article Links in Tech Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> techArticleLink;

	// World Article Links in World Page //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a[not (contains(@href,'/photogallery/')) and not(contains(@href,'/videos/'))]")
	private List<WebElement> worldArticleLink;

	//---photo article
	/*Cricket PhotoGallery Articles common categories */
	@FindBy(xpath="//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/'))]")
	private List<WebElement>  cricketPhotoArticleELeList;


	//rhs
	/* entertainment Title present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/entertainment')]")
	private WebElement entertainmentTitle;

	/* entertainment Article Links present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/entertainment')]//ancestor::div/following-sibling::ul[contains(@class,'photostorylist')][1]//li/a")
	private List<WebElement> entertainmentArticleLinks;

	/* entertainment more news link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/entertainment')]//ancestor::div/following-sibling::a[contains(@href,'/entertainment')]")
	private WebElement entertainmentMoreLink;


	/* sports Title present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/sports')]")
	private WebElement sportsTitle;

	/* sports Article Links present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/sports')]//ancestor::div/following-sibling::ul[contains(@class,'photostorylist')][1]//li/a")
	private List<WebElement> sportsArticleLinks;

	/* sports more news link present at the RHS*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/sports')]//ancestor::div/following-sibling::a[contains(@href,'/sports')]")
	private WebElement sportsMoreLink;

	//===============================common Video Elements ======================================

	// mobiles Article Links in Mobiles Page //
	@FindBy(xpath = "//div[contains(@class,'lmn_wrp')]//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/') and not(starts-with(@href,'/mobiles/'))] | //div[(@class='lmn_wrp')]//a[not (contains(@href,'/photogallery/')) and contains(@href,'/videos/')]")
	private List<WebElement> mobilesVideoArticleLink;

	/*Line Two Section Common Video Articles Elements*/ 
	//===Latest news | Ajab Gajab | Health | Astro | Auto | Dharm | Career | Sahitya |  
	@FindBy(xpath="//ul[contains(@class,'newctgrtopstories')]//a[contains(@href,'/videos/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineTwoSectionPriorityCommonVideoELeList;

	/*Line Two Section Blog Articles  */
	@FindBy(xpath="//div[contains(@class,'list__item--right')]/h2/a[contains(@href,'/videos/') and not (contains(@href,'/photogallery/'))]")
	private List<WebElement>  lineTwoSectionBlogPriorityVideoELeList;

	/*Line Two Section Photo Articles  */
	@FindBy(xpath="//div[contains(@class,'pht-tp')]//ul[contains(@class,'rgt')]//li[not(contains(@class,'glide__slide--clone'))]/a[contains(@href,'/videos/')]")
	private List<WebElement>  lineTwoSectionPhotoPriorityVideoELeList;







	//======================================Common Business Logic================================================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnFirstMoneyArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionMoneyELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionMoneyELeList.get(0));
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
	public void clickOnFirstCricketArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionCricketELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionCricketELeList.get(0));
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
	public void clickOnFirstEntertainmentArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionEntertainmentELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionEntertainmentELeList.get(0));
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
	public void clickOnFirstFoodArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionCricketELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionCricketELeList.get(0));
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
	public void clickOnFirstMobileArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionMobileELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionMobileELeList.get(0));
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
	public void clickOnFirstStatesArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionStatesELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionStatesELeList.get(0));
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
	public void clickOnFirstKnowledgeArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionKnowledgeELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionKnowledgeELeList.get(0));
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
	public void clickOnFirstJobsArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionJobsELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionJobsELeList.get(0));
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
	public void clickOnFirstTechArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionTechELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionTechELeList.get(0));
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
	public void clickOnFirstNationArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionNationELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionNationELeList.get(0));
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
	public void clickOnFirstLifeArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionLifestyleELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionLifestyleELeList.get(0));
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
	public void clickOnFirstWorldArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionWorldELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionWorldELeList.get(0));
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
	public void clickOnFirstCrimeArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineOneSectionCrimeELeList.size()>0)
		{
			webDriverActions.softClickJS(lineOneSectionCrimeELeList.get(0));
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
	public void clickOnLineTwoPriorityFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForPageToLoad();
		if(lineTwoSectionPriorityELeList.size()>0)
		{
			webDriverActions.softClickJS(lineTwoSectionPriorityELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Articles Found "+webDriverActions.getCurrentPageUrl());
		}

	}

	//==================================== common Photo Article business Logics ====================================

	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonSectionFirstPhotoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(commonPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(commonPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Photo Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnPhotoSectionFirstArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(photoSectionPhotoArticleELeList.size()>0)
		{
			webDriverActions.softClickJS(photoSectionPhotoArticleELeList.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Cricket Articles Found "+webDriverActions.getCurrentPageUrl());
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
			Assert.fail("No Cricket Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}

	//==================================== common Videos Article business Logics ====================================
	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCommonSectionFirstVideoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(commonVideoArticleLnk.size()>0)
		{
			webDriverActions.softClickJS(commonVideoArticleLnk.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Photo Gallery Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method Is Use to Click On first Article.
	 */
	public void clickOnCricketSectionFirstVideoArticle()
	{
		webDriverActions.waitForPageToLoad();
		if(webDriverActions.isElementDisplayed(cricketVideoArticleLink.get(0)))
		{
			webDriverActions.softClickJS(cricketVideoArticleLink.get(0));
		}
		else
		{
			Logs.error(getClass(), "No Photo Gallery Articles Found ");
			Assert.fail("No Photo Gallery Articles Found "+webDriverActions.getCurrentPageUrl());
		}
	}




	//==================================== Sanjeeb's Business Logics   ========================================================


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verifyLineOneAndLineTwoSection(String server,WebElement lineOneSection,List<WebElement> lineOneSectionEleList)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(lineOneSectionEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < lineOneSectionEleList.size(); i++)
		{
			webDriverActions.softHighlightElement(lineOneSection);
			String pageUrl = webDriverActions.getAttribute("href", lineOneSectionEleList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", lineOneSectionEleList.get(i));
			webDriverActions.softHighlightElement(lineOneSectionEleList.get(i));
			webDriverActions.softWaitForElementVisibility(lineOneSectionEleList.get(i), 3);
			webDriverActions.softClick(lineOneSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softWaitForElementVisibility(lineOneSectionEleList.get(i), 3);
				webDriverActions.softClickJS(lineOneSectionEleList.get(i));
			}
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();	
			if(server.contains("preProd") && !expected.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(expected);
				expected=betaUrl;
				webDriverActions.navigateToUrl(expected);
			}
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.compareUrlSub(pageUrl, currentUrl);
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
		softAssert.assertAll("LineOne Or LineTwo Validation Failed ");
	}


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line Two Section By Clicking On It.
	 */
	public void verifyLineTwoSection(String server)
	{
		verifyLineOneAndLineTwoSection(server, lineTwoSection, lineTwoSectionEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is use to verify elements Present In Line One Section By Clicking On It.
	 */
	public void verifyLineOneSection(String server)
	{
		verifyLineOneAndLineTwoSection(server, lineOneSection, lineOneSectionEleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Rajya Section Present on Line One section Of hindi revamp Landing Page.
	 */
	public void verifyRajyaSection(String server)
	{
		//This line of Script to verify RajyaSeher Chune Icon Present in the Linone Section of Hindi News 18 Home Page.
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String mainUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softClickJS(apnaSeherChuneBtn);
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
			webDriverActions.softClickJS(apnaSeherChuneBtn);
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
	 * This method used to navigate to All News18 Languages present in Home Page Header
	 * @author SanjeebKumarPati
	 */
	public void verifyChangeLanguage() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.softHighlightElement(changeLanguageSection);
		webDriverActions.softMouseHover(changeLanguageSection);
		if (changeLanguageEleList.size()>0) {
			for (int i = 1; i < changeLanguageEleList.size(); i++) {
				webDriverActions.softHighlightElement(changeLanguageEleList.get(i));
				webDriverActions.softMouseHover(changeLanguageEleList.get(i));
				String pageUrl=webDriverActions.getAttribute("href", changeLanguageEleList.get(i));
				webDriverActions.softHighlightElement(changeLanguageEleList.get(i));
				webDriverActions.softClickJS(changeLanguageEleList.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.stopPageLoading();
				String currentUrl = webDriverActions.getCurrentPageUrl();
				int response = genericUtility.checkLinks(currentUrl);
				boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
				softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and Status Code Is "+response);
				softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
				webDriverActions.softHighlightElement(changeLanguageSection);
				webDriverActions.softMouseHover(changeLanguageSection);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+changeLanguageEleList.size());
		}

		softAssert.assertAll("Issues found in this Url "+ webDriverActions.getCurrentPageUrl());
	}


	/**
	 * This method is used to verify Search Button Present on Header
	 * @author SanjeebKumarPati
	 */
	public void verifyLineOneSearchButton()
	{
		//validating Search Icon
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.softClick(searchBtnLnk);
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
	 * This method used to navigate to All News18 Languages present in Home Page Header
	 * @author SanjeebKumarPati
	 */
	public void verifyLiveTvSection() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String parentUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.softMouseHover(liveTvSection);
		if (liveTvEleList.size()>0) {
			for (int i = 0; i < liveTvEleList.size(); i++) {
				webDriverActions.softHighlightElement(liveTvEleList.get(i));
				webDriverActions.softMouseHover(liveTvEleList.get(i));
				String pageUrl=webDriverActions.getAttribute("href", liveTvEleList.get(i));
				String title = webDriverActions.getAttribute("target", liveTvEleList.get(i));
				webDriverActions.softClickJS(liveTvEleList.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
				webDriverActions.stopPageLoading();
				String currentUrl = webDriverActions.getCurrentPageUrl();
				int response = genericUtility.checkLinks(currentUrl);
				boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
				softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and Status Code Is "+response);
				softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);
				}
				else
				{	
					webDriverActions.navigateToUrl(parentUrl);
				}
				webDriverActions.softMouseHover(liveTvSection);
			}
		}
		else
		{
			softAssert.fail("Possibly Element is Not Visible Or Size is "+liveTvEleList.size());
		}

		softAssert.assertAll("Issues found in this Url "+ webDriverActions.getCurrentPageUrl());
	}


	/**
	 * This method validates Download App navigation from HomaPage
	 * @author SanjeebKumarPati
	 */
	public void verifyDownloadApp() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softClickJS(downloadNews18AppLnk);
		webDriverActions.switchToNewWindow();
		Logs.info(getClass(), "Navigated to " + webDriverActions.getCurrentPageUrl());
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(appStore.size()>0," Possibly element is not visible "+parent);
		for (int i = 0; i < appStore.size(); i++) 
		{
			webDriverActions.softHighlightElement(appStore.get(i));
			webDriverActions.softClickJS(appStore.get(i));
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
			webDriverActions.navigateBack();
		}
		softAssert.assertAll("Issues found in Home Page Header Download App ");
	}


	/**
	 * This method validates Download App navigation from HomaPage
	 * @author SanjeebKumarPati
	 */
	public void verifyHeaderSocialShareIconValidation() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softHighlightElement(followUsSection);
		String parentUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		softAssert.assertTrue(followUsSectionEleList.size()>0," Possibly element is not visible "+parentUrl);
		for (int i = 0; i < followUsSectionEleList.size(); i++) 
		{
			webDriverActions.softHighlightElement(followUsSectionEleList.get(i));
			String pageUrl=webDriverActions.getAttribute("href", followUsSectionEleList.get(i));
			String title = webDriverActions.getAttribute("target", followUsSectionEleList.get(i));
			webDriverActions.softClickJS(followUsSectionEleList.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and Status Code Is "+response);
			softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{	
				webDriverActions.navigateToUrl(parentUrl);
			}
		}
		softAssert.assertAll("Issues found in Home Page Header Social Share Validation ");
	}


	/**
	 * This method validates Download App navigation from HomaPage
	 * @author SanjeebKumarPati
	 */
	public void verifyHeaderlineOneArticleSectionValidation() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softHighlightElement(lineOneSection);
		String parentUrl = webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//This lines of Script used for validate the article except Entertainment, states and tech
		softAssert.assertTrue(lineOneEleListForArticle.size()>0," Possibly element is not visible "+parentUrl);
		for (int i =2; i < lineOneEleListForArticle.size(); i++) 
		{
			webDriverActions.softHighlightElement(lineOneEleListForArticle.get(i));
			webDriverActions.softMouseHover(lineOneEleListForArticle.get(i));
			for (int j =0; j < lineOneArticleEleListForArticle.size(); j++) 
			{
				webDriverActions.softHighlightElement(lineOneArticleEleListForArticle.get(j));
				String pageUrl=webDriverActions.getAttribute("href", lineOneArticleEleListForArticle.get(j));
				String title = webDriverActions.getAttribute("target", lineOneArticleEleListForArticle.get(j));
				webDriverActions.softClickJS(lineOneArticleEleListForArticle.get(j));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
				webDriverActions.stopPageLoading();
				String currentUrl = webDriverActions.getCurrentPageUrl();
				int response = genericUtility.checkLinks(currentUrl);
				boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
				softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
				softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
				if(title.contains("_blank"))
				{
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(pageTitle);
				}
				else
				{	
					webDriverActions.navigateToUrl(parentUrl);
				}
				webDriverActions.softHighlightElement(lineOneEleListForArticle.get(i));
				webDriverActions.softMouseHover(lineOneEleListForArticle.get(i));
			}
		}

		//This lines of Script used for validate the article Entertainment, states and tech
		ArrayList<String>list=new ArrayList<String>();
		for (int i =0; i < lineOneContainsEleListForArticle.size(); i++) 
		{
			webDriverActions.softHighlightElement(lineOneContainsEleListForArticle.get(i));
			webDriverActions.softMouseHover(lineOneContainsEleListForArticle.get(i));
		}
		for(int j=0;j<lineOneContainsEleListForArticle.size();j++)
		{
			webDriverActions.softHighlightElement(lineOneContainsEleListForArticle.get(j));
			webDriverActions.softMouseHover(lineOneContainsEleListForArticle.get(j));
			for(int k=0;k<lineOneSubSectionEleListForArticle.size();k++)
			{
				webDriverActions.softHighlightElement(lineOneSubSectionEleListForArticle.get(k));
				webDriverActions.softMouseHover(lineOneSubSectionEleListForArticle.get(k));
				for(int l=0;l<lineOneInnerSubSectionEleListForArticle.size();l++)
				{
					webDriverActions.softHighlightElement(lineOneInnerSubSectionEleListForArticle.get(l));
					webDriverActions.softMouseHover(lineOneInnerSubSectionEleListForArticle.get(l));
					String previousURL= webDriverActions.getAttribute("href", lineOneInnerSubSectionEleListForArticle.get(l));
					Logs.info(getClass(), previousURL);
					list.add(previousURL);	
				}
			}
		}
		for(int m=0;m<list.size();m++)
		{
			webDriverActions.navigateToUrl(list.get(m));
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl);
		}
		softAssert.assertAll("Issues Found In Validating LineOne Article Section");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Sections present on Footer of Hindi Desktop Landing Page.
	 */
	public void verifyFooterSection(List<WebElement> footerLinks,WebElement footerSection, String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerSection, 3);
		webDriverActions.softHighlightElement(footerSection);
		String pageTitle = webDriverActions.getPageTitle();
		String mainURL = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(footerLinks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerLinks.size()-1;i++)
		{
			String expected = webDriverActions.getAttribute("href", footerLinks.get(i));
			Logs.info(getClass(), expected);
			String pageUrl=webDriverActions.getAttribute("href", footerLinks.get(i));
			String title = webDriverActions.getAttribute("target", footerLinks.get(i));
			webDriverActions.softClickJS(footerLinks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageURL = webDriverActions.getCurrentPageUrl();
			if(currentPageURL.contains("google_vignette") || currentPageURL.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(footerLinks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			String currentUrl = webDriverActions.getCurrentPageUrl();
			String actual= webDriverActions.getCurrentPageUrl();
			if(server.contains("preProd")&& !actual.contains("//beta"))
			{
				String betaUrl = genericUtility.replaceInUrl(actual);
				actual=betaUrl;
				webDriverActions.navigateToUrl(actual);
			}
			webDriverActions.stopPageLoading();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
			softAssert.assertTrue(response==200 | response==429  , "Possibly Url is Invalid "+currentUrl+ " and Status Code is "+response);
			softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(mainURL);
			}
			webDriverActions.scrollToLast();
			webDriverActions.softWaitForElementVisibility(footerSection, 3);
			webDriverActions.softHighlightElement(footerSection);
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}

	/**
	 * This method validates social Media navigation present on Footer
	 */
	public void verifySocialMedia() {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String parent = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(footerLineTwoSocialEleLnks.size()>0, " Possibly Element is not Visible "+ footerLineTwoSocialSectionLnk );
		for (int i = 0; i < footerLineTwoSocialEleLnks.size(); i++) {
			webDriverActions.softHighlightElement(footerLineTwoSocialEleLnks.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", footerLineTwoSocialEleLnks.get(i));
			if(actual.contains("news18dotcom")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("facebook")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("instagram")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("youtube")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("play.google.com")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("apps.apple")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("twitter")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else if (actual.contains("telegram")) {
				Logs.info(getClass(), "Social Share Verification Passed");
			}
			else
			{
				Logs.error(getClass(), "Social Share Verification Failed "+actual);
				softAssert.fail("Social Share Verification Failed "+actual);	
			}
			webDriverActions.clickJS(footerLineTwoSocialEleLnks.get(i));
			webDriverActions.navigateToUrl(parent);

		}
		softAssert.assertAll("Issues found in Home Page Header Social Media ");
	}



	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Trending Topics present on Footer of Hindi Desktop Landing Page.
	 */
	public void verifyFooterFirstLayer(String server)
	{
		verifyFooterSection(footerFirstLayerLnks, footerFirstLayerLnk,server);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Footer Line Two Social Share Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verifyFooterLineTwoSocialShareSection(String server)
	{
		verifyFooterSection(footerLineTwoEleLnks, footerLineTwoLnk,server);
		verifySocialMedia();

	}

	/**
	 * @author SanjeebKumarPati
	 * This method used to verify Live TV Section present on Footer of Hindi Desktop Landing Page.
	 */
	public void verifyFooterLiveTVSection(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(2000);
		webDriverActions.scrollToLast();
		webDriverActions.softWaitForElementVisibility(footerliveTVLnk, 3);
		webDriverActions.softHighlightElement(footerliveTVLnk);
		webDriverActions.softMouseHover(footerliveTVLnk);
		String pageTitle = webDriverActions.getPageTitle();
		String mainURL = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(footerliveTVEleLnks.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for(int i=0;i<footerliveTVEleLnks.size();i++)
		{
			String expected = webDriverActions.getAttribute("href", footerliveTVEleLnks.get(i));
			Logs.info(getClass(), expected);
			String pageUrl=webDriverActions.getAttribute("href", footerliveTVEleLnks.get(i));
			String title = webDriverActions.getAttribute("target", footerliveTVEleLnks.get(i));
			webDriverActions.mouseHoverAndClick(footerliveTVEleLnks.get(i));
			if(title.contains("_blank"))
			{
				webDriverActions.switchToNewWindow();
			}
			else
			{
				Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
			}
			String currentPageURL = webDriverActions.getCurrentPageUrl();
			if(currentPageURL.contains("google_vignette") || currentPageURL.contains("PWA_ROS_INSTL"))
			{
				webDriverActions.navigateBack();
				webDriverActions.softClickJS(footerliveTVEleLnks.get(i));
				if(title.contains("_blank"))
				{
					webDriverActions.switchToNewWindow();
				}
				else
				{
					Logs.info(getClass(), webDriverActions.getCurrentPageUrl());
				}
			}
			webDriverActions.stopPageLoading();
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(currentUrl, pageUrl);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl+" and the status code is "+response);
			softAssert.assertTrue(status==true,pageUrl+ " Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{
				webDriverActions.navigateToUrl(mainURL);
			}
			webDriverActions.scrollToLast();
			webDriverActions.softWaitForElementVisibility(footerliveTVLnk, 3);
			webDriverActions.softHighlightElement(footerliveTVLnk);
			webDriverActions.softMouseHover(footerliveTVLnk);
		}
		softAssert.assertAll("Issues Found In Validating Footer Section");
	}

	//------------------------DanishR--Methods----------------------------------//

	/* Common Categories RHS Photo Validation Methods */

	public void verifyRhsPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photoTitle,commonsCategoryArticleLnk);
	}

	public void verifyRhsPhotoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photoTitle,photoArticleLinks,commonsCategoryArticleLnk);
	}

	public void verifyRhsPhotoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,photoTitle,photoMoreLink,commonsCategoryArticleLnk);
	}

	/* Common Categories RHS Top Story Validation Methods */

	public void verifyRhsTopStoryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,topStoryTitle,commonsCategoryArticleLnk);
	}

	public void verifyRhsTopStoryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,commonsCategoryArticleLnk);
	}

	public void verifyRhsTopStoryReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,commonsCategoryArticleLnk);
	} 

	/* Common Categories RHS Trending Validation Methods */

	public void verifyRhsTrendingTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingTitle,commonsCategoryArticleLnk);
	}

	public void verifyRhsTrendingArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingTitle,trendingArticleLinks,commonsCategoryArticleLnk);
	}

	public void verifyRhsTrendingReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingTitle,trendingMoreLink,commonsCategoryArticleLnk);
	} 

	/* Common Categories RHS Promoted Content Validation */

	public void verifyRhsPromotedContent(String serverType) {
		verifyRHSPromotedContent(serverType,rhsPromotedContent,commonsCategoryArticleLnk);
	} 

	/* Cricket RHS Photo Validation Methods */

	public void verifyCricketRHSPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photoTitle,cricketCategoryArticleLnk);
	}

	public void verifyCricketRHSPhotoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photoTitle,photoArticleLinks,cricketCategoryArticleLnk);
	}

	public void verifyCricketRHSPhotoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,photoTitle,photoMoreLink,cricketCategoryArticleLnk);
	}

	/* Cricket RHS Top Story Validation Methods */

	public void verifyCricketRHSTopStoryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,topStoryTitle,cricketCategoryArticleLnk);
	}

	public void verifyCricketRHSTopStoryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,cricketCategoryArticleLnk);
	}

	public void verifyCricketRHSTopStoryReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,cricketCategoryArticleLnk);
	} 


	/* Cricket RHS Trending Validation Methods */

	public void verifyCricketTrendingTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingTitle,cricketCategoryArticleLnk);
	}

	public void verifyCricketTrendingArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingTitle,trendingArticleLinks,cricketCategoryArticleLnk);
	}

	public void verifyCricketTrendingReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingTitle,trendingMoreLink,cricketCategoryArticleLnk);
	} 

	/* Cricket RHS Promoted Content Validation */

	public void verifyCricketRHSPromotedContent(String serverType) {
		verifyRHSPromotedContent(serverType,rhsPromotedContent,cricketCategoryArticleLnk);
	} 

	/* Common Categories PhotoGallery Articles,RHS Photo Validation Methods */

	public void verifyPhotoGalleryRhsPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photoTitle,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsPhotoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photoTitle,photoArticleLinks,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsPhotoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,photoTitle,photoMoreLink,commonPhotoArticleELeList);
	}

	/* Common Categories PhotoGallery Articles,RHS Top Story Validation Methods */

	public void verifyPhotoGalleryRhsTopStoryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,topStoryTitle,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsTopStoryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsTopStoryReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,commonPhotoArticleELeList);
	} 

	/*  Common Categories PhotoGallery Articles, RHS Trending Validation Methods */

	public void verifyPhotoGalleryRhsTrendingTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingTitle,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsTrendingArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingTitle,trendingArticleLinks,commonPhotoArticleELeList);
	}

	public void verifyPhotoGalleryRhsTrendingReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingTitle,trendingMoreLink,commonPhotoArticleELeList);
	} 

	/* Photo Category PhotoGallery Articles,RHS Photo Validation Methods */

	public void verifyPhotoCategoryRhsPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photoTitle,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryRhsPhotoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photoTitle,photoArticleLinks,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryPhotoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,photoTitle,photoMoreLink,photoSectionPhotoArticleELeList);
	}

	/* Photo Category PhotoGallery Articles,RHS Top Story Validation Methods */

	public void verifyPhotoCategoryRhsTopStoryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,topStoryTitle,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryRhsTopStoryArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,topStoryTitle,topStoryArticleLinks,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryRhsTopStoryReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,topStoryTitle,topStoryMoreLink,photoSectionPhotoArticleELeList);
	} 

	/*  Photo Category PhotoGallery Articles, RHS Trending Validation Methods */

	public void verifyPhotoCategoryRhsTrendingTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,trendingTitle,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryRhsTrendingArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,trendingTitle,trendingArticleLinks,photoSectionPhotoArticleELeList);
	}

	public void verifyPhotoCategoryRhsTrendingReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,trendingTitle,trendingMoreLink,photoSectionPhotoArticleELeList);
	} 

	/* Cricket Category PhotoGallery Articles,RHS Photo Validation Methods */

	public void verifyCricketCategoryRhsPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photoTitle,cricketSectionPhotoArticleELeList);
	}

	public void verifyCricketCategoryRhsPhotoArticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photoTitle,photoArticleLinks,cricketSectionPhotoArticleELeList);
	}

	public void verifyCricketCategoryPhotoReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,photoTitle,photoMoreLink,cricketSectionPhotoArticleELeList);
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
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, "Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);

				webDriverActions.softScrollToElement(title);
				//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
				Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				for(int j=0;j<articlesLinks.size();j++) {
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
					//					if (currentCPPage.equalsIgnoreCase(expectedCP)) {
					//						webDriverActions.navigateBack();
					//					}
					//					else {
					//						webDriverActions.navigateBack();
					//						webDriverActions.navigateBack();
					//					}
					webDriverActions.navigateToUrl(categoryPage);
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
	 * @param serverType
	 * This method is used to click on the title of the RHS section
	 */
	public void verifyRHSPromotedContent(String serverType,WebElement title,List<WebElement> categoryPageLinks) {
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

	//----------------------- Vipin's Business Logic Methods ----------------------------------------//

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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Unable to Display Element in "+currentPageUrl);
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
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		list.add(fileUtility.readDataFromPropertyFile("whatsApp"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));

		//Below list adds webelements of social share icons
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
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
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
			//			softAssert.assertEquals(actualAuthorName.toLowerCase(), expectedAuthorName.toLowerCase() , "Possibly Navigating to Different Author "+currentAuthorUrl);
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
	public void verifyArticleDescriptionHeaderLinkNavigation(String serverType , List<WebElement> articleLst , List<WebElement> description , List<WebElement> headerLnk  )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		for(int i=0; i<articleLst.size(); i++) {
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
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
			}
			if(headerLnk.size()>0) {
				String articlePageTitle = webDriverActions.getPageTitle();
				for(int k=0;k<headerLnk.size();k++)
				{
					webDriverActions.softScrollToElement(headerLnk.get(k));
					webDriverActions.softMouseHover(headerLnk.get(k));
					webDriverActions.softHighlightElement(headerLnk.get(k));
					String actualHeaderUrl = webDriverActions.getAttribute("href", headerLnk.get(k));
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
	 * @param taboolaFeedArticle
	 * This method is used to Validate the Article Taboola In Body and RHS in Article Consumption Page
	 */
	public void verifyArticleTaboolaNavigation(String serverType , List<WebElement> articleLst, List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImglement, WebElement taboolaLogo)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
		for(int i=0; i<1; i++) {
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softScrollToElement(articleLst.get(i));
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
	 * This method is used to click the read more link present in Footer in Money Landing Page
	 * @param serverType
	 * @param articleLst
	 * @param secondReadMoreLnk
	 */
	public void articleBannerReadMoreLnk(String serverType , List<WebElement> articleLst,WebElement activeMoreLnk ,  WebElement secondReadMoreLnk) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);

		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i+1));
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
			webDriverActions.continuousScrollTillElement(secondReadMoreLnk, 3);
			if(webDriverActions.softIsElementDisplayed(secondReadMoreLnk)) {
				webDriverActions.softClickJS(secondReadMoreLnk);
				softAssert.assertFalse(webDriverActions.softIsElementDisplayed(activeMoreLnk) , "Possibly Footer Read More Link is Not Working in "+expectedUrl);
			}
			else
			{
				Logs.info(getClass(), "NO READ MORE LINK");
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
	 * This method is used to verify whether the social media icons present in footer are able to navigate.
	 * @param serverType
	 * @param articleLst
	 * @param articleSocialMedia
	 */
	public void verifyFooterArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,WebElement footerReadMoreLnk , List< WebElement> articleSocialMedia) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		ArrayList<String> list=new ArrayList<String>();
		list.add(fileUtility.readDataFromPropertyFile("whatsApp"));
		list.add(fileUtility.readDataFromPropertyFile("facebook"));
		list.add(fileUtility.readDataFromPropertyFile("telegram"));
		list.add(fileUtility.readDataFromPropertyFile("twitter"));

		//Below list adds webElements of social share icons
		ArrayList<WebElement> listEle=new ArrayList<WebElement>();
		listEle.add(whatsAppHeader);
		listEle.add(facebookHeader);
		listEle.add(telegramHeader);
		listEle.add(twitterHeader);
		softAssert.assertTrue(articleLst.size()>0, "Possibly Money Article is Not Visible");
		for(int i=0; i<1; i++) {
			webDriverActions.softScrollToElement(articleLst.get(i));
			webDriverActions.softMouseHover(articleLst.get(i));
			webDriverActions.softHighlightElement(articleLst.get(i));
			String actualUrl = webDriverActions.getAttribute("href", articleLst.get(i));
			webDriverActions.softClickJS(articleLst.get(i+1));
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
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
			webDriverActions.waitForSecond(500);
			webDriverActions.continuousScrollTillElement(footerReadMoreLnk, 3);
			if(webDriverActions.softIsElementDisplayed(footerReadMoreLnk))
			{
				webDriverActions.softMouseHover(footerReadMoreLnk);
				webDriverActions.softClickJS(footerReadMoreLnk);
				softAssert.assertTrue(articleSocialMedia.size()>0, "Possibly Social Share Icon is not visible in"+currentPageUrl);
				for(int j=0; j< articleSocialMedia.size(); j++) {
					webDriverActions.softScrollToElement(articleSocialMedia.get(j));
					webDriverActions.softMouseHover(articleSocialMedia.get(j));
					webDriverActions.softHighlightElement(articleSocialMedia.get(j));
					String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
					webDriverActions.mouseHoverAndClick(articleSocialMedia.get(j));
					webDriverActions.switchToNewWindow();
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
							webDriverActions.softHighlightElement(listEle.get(k));
							softAssert.assertTrue(webDriverActions.softIsElementDisplayed(listEle.get(k)), "Possibly Element Is Not Visible For This URL "+currentShare);	
						}
					}
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(articlePageTitle);
				}
			}
			else {
				Logs.info(getClass(), "No Read More Link");
				softAssert.assertTrue(articleSocialMedia.size()>0, "Possibly Social Share Icon is not visible in"+currentPageUrl);
				for(int j=0; j< articleSocialMedia.size(); j++) {
					webDriverActions.softScrollToElement(articleSocialMedia.get(j));
					webDriverActions.softMouseHover(articleSocialMedia.get(j));
					webDriverActions.softHighlightElement(articleSocialMedia.get(j));
					String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
					webDriverActions.mouseHoverAndClick(articleSocialMedia.get(j));
					webDriverActions.switchToNewWindow();
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
					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(articlePageTitle);
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
		softAssert.assertAll("Issue Found in Article Body ");
	}	

	/**
	 * @param serverType
	 * @param articleLst
	 * @param description
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Description and Article Header Link in Article Consumption Page
	 */
	public void verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(String serverType , List<WebElement> articleLst , List<WebElement> description)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(articleLst.size()>0, "Possibly Article is Not Visible in "+expectedUrl);
		for(int i=0; i<articleLst.size(); i++) {
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
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
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


	public void verifyMoneyArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketArticleLnk, breadCrumbLnks);
	}

	public void verifyMoneyArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyMoneyArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyMoneyArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	//	public void verifyMoneyArticleLastUpdatedTimeValidation(String serverType)
	//	{
	//		verifyArticleLastUpdatedTime(serverType, commonArticleLnks, articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	//	}

	public void verifyMoneyArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyMoneyArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyMoneyArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyMoneyArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyMoneyArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyMoneyArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyMoneyArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk ,  articleBodyTaboolaLogo);
	}

	public void verifyMoneyArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk , rhsTaboolaLogo);
	}

	public void verifyMoneyArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyMoneyArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}


	//------------------- Ajab Gajab ------------------------//

	public void verifyAjabGajabArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyAjabGajabArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyAjabGajabArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyAjabGajabArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyAjabGajabArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyAjabGajabArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyAjabGajabArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyAjabGajabArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyAjabGajabArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyAjabGajabArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyAjabGajabArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyAjabGajabArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	/*------------------Cricket Category Consumption Page Validation------------------------*/
	public void verifyCricketArticleBreadCrumbNavigation(String serverType) {
		verifyArticleBreadCrumbNavigation(serverType, cricketArticleLnk, breadCrumbLnks);
	}

	public void verifyCricketArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, cricketArticleLnk, articleHeaderTxt, articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	} 

	public void verifyCricketArticleReadMoreDescription(String serverType) {
		verifyArticleReadMoreDescription(serverType , cricketArticleLnk , articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyCricketArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType , cricketArticleLnk , articleAgencyLnk , news18AgencyTxt );
	}

	public void verifyCricketArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType , cricketArticleLnk ,articleSocialMediaIconLnk);
	}

	public void verifyCricketArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, cricketArticleLnk , articleGoogleNewsLnk, googleNews18Logo);
	}

	public void verifyCricketArticleFooterReadMoreLnk(String serverType) {
		articleBannerReadMoreLnk(serverType, cricketArticleLnk, footerReadMoreLnk,activeReadMoreDiv);
	}

	public void verifyCricketArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, cricketArticleLnk, footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	public void verifyCricketArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType , cricketArticleLnk, articleAuthorLnk , authorNameTxt);
	}

	public void verifyCricketArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType , cricketArticleLnk , articleTagsLnk , articleRelatedNewsLnk);
	}

	public void verifyCricketArticleHighlightValidation(String serverType)
	{
		verifyArticleHighlightValidation(serverType , cricketArticleLnk , articleHighlightDiv );
	}

	public void verifyCricketArticleDescriptionHeaderLinkNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType ,cricketArticleLnk , articleDetailedDescriptionTxt ,  articleDetailedHighlightLnk);
	}

	public void verifyCricketArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , taboolaArticleLst ,taboolaImgLnk ,  articleBodyTaboolaLogo);
	}

	public void verifyCricketArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//-------------------------------------------------------------------------------//

	//====================================Latest Section===========================================================

	public void verifyLatestSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyLatestSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyLatestSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyLatestSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyLatestSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyLatestSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyLatestSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyLatestSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyLatestSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyLatestSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyLatestSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk ,  articleBodyTaboolaLogo);
	}

	public void verifyLatestSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}


	//====================================Health===========================================================

	public void verifyHealthSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyHealthSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyHealthSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyHealthSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyHealthSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyHealthSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyHealthSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyHealthSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyHealthSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyHealthSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyHealthSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyHealthSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//====================================Astrology===========================================================

	public void verifyAstrologySectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyAstrologySectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyAstrologySectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyAstrologySectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyAstrologySectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyAstrologySectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyAstrologySectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyAstrologySectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyAstrologySectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyAstrologySectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyAstrologySectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyAstrologySectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//====================================Auto Section===========================================================

	public void verifyAutoSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyAutoSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyAutoSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyAutoSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyAutoSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyAutoSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyAutoSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyAutoSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyAutoSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyAutoSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyAutoSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyAutoSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}


	//====================================Dharm Section===========================================================

	public void verifyDharmSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyDharmSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyDharmSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyDharmSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyDharmSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyDharmSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyDharmSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyDharmSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyDharmSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyDharmSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyDharmSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyDharmSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}


	//====================================Career Section===========================================================

	public void verifyCareerSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyCareerSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyCareerSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyCareerSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCareerSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyCareerSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCareerSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyCareerSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyCareerSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyCareerSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCareerSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCareerSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//====================================Career Section===========================================================

	public void verifySahityaSectionArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifySahityaSectionArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifySahityaSectionArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifySahityaSectionArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifySahityaSectionArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifySahityaSectionArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifySahityaSectionArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifySahityaSectionArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifySahityaSectionArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifySahityaSectionArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifySahityaSectionArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifySahityaSectionArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}


	// ----------------------------- Vipin's Photogallery Business Logic --------------------------------//

	//-------- Money_Photogallery ------------//
	public void verifyMoneyPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyMoneyPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}
	// ----------------------------------- Money Photogallery ------------------------------------//
	public void verifyMoneyPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyMoneyPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyMoneyPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyMoneyPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyMoneyPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}
	public void verifyMoneyPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	//--------Cricket Photogallery ------------//
	public void verifyCricketPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, cricketPhotogalleryArticleLnk, breadCrumbLnks);
	}

	public void verifyCricketPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, cricketPhotogalleryArticleLnk, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCricketPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, cricketPhotogalleryArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCricketPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,cricketPhotogalleryArticleLnk, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyCricketPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, cricketPhotogalleryArticleLnk, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCricketPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, cricketPhotogalleryArticleLnk, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCricketPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, cricketPhotogalleryArticleLnk, photogalleryArticleDetailedDescriptionTxt);
	}
	public void verifyCricketPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, cricketPhotogalleryArticleLnk, photogalleryArticleSocialMediaLnk);
	}

	//----------------------------------------Food Photogallery---------------------------------------//
	public void verifyFoodPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyFoodPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyFoodPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyFoodPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyFoodPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyFoodPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyFoodPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyFoodPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	//--------Entertainment_Photogallery------------//
	public void verifyEntertainmentPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyEntertainmentPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyEntertainmentPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyEntertainmentPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyEntertainmentPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	//--------Pradesh_Photogallery ------------//
	public void verifyPradeshPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyPradeshPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyPradeshPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyPradeshPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyPradeshPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyPradeshPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPradeshPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyPradeshPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}


	//--------Knowledge_Photogallery------------//
	public void verifyKnowledgePhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyKnowledgePhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyKnowledgePhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyKnowledgePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}


	public void verifyKnowledgePhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyKnowledgePhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyKnowledgePhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyKnowledgePhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	//--------Jobs_Photogallery------------//
	public void verifyJobPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyJobPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyJobPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyJobPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyJobPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyJobPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyJobPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyJobPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	//---------------------------------------------- Tech_Photogallery ------------------------------------------//
	public void verifyTechPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyTechPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyTechPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyTechPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyTechPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyTechPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyTechPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyTechPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	//--------------------------------------------------Nation Photogallery------------------------------------------//

	public void verifyNationPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyNationPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyNationPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyNationPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyNationPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyNationPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyNationPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyNationPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//----------------------------------------Lifestyle Photogallery---------------------------------------//

	public void verifyLifestylePhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyLifestylePhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLifestylePhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyLifestylePhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}
	public void verifyLifestylePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyLifestylePhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyLifestylePhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyLifestylePhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//----------------------------------------------------World Photogallery ------------------------------------//

	public void verifyWorldPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyWorldPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyWorldPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyWorldPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}
	public void verifyWorldPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyWorldPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyWorldPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyWorldPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//---------------------------Crime Photogallery ---------------------------//

	public void verifyCrimePhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyCrimePhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCrimePhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCrimePhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}
	public void verifyCrimePhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyCrimePhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyCrimePhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCrimePhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//--------LatestNews_Photogallery------------//
	public void verifyLatestNewsPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyLatestNewsPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyLatestNewsPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}
	public void verifyLatestNewsPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyLatestNewsPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyLatestNewsPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}



	// ------------------- Ajab Gajab Photogallery ---------------------//

	public void verifyAjabGajabPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyAjabGajabPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyAjabGajabPhotogalleryArticleTaboolaFeedNavigation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyAjabGajabPhotogalleryArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyAjabGajabPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleInfoDescriptionTxt);
	}

	public void verifyAjabGajabPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyAjabGajabPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyAjabGajabPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	//--------Photosection_Photogallery------------//
	public void verifyPhotosectionPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, photoSectionPhotogalleryArticleLnk, breadCrumbLnks);
	}

	public void verifyPhotosectionPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, photoSectionPhotogalleryArticleLnk, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyPhotosectionPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photoSectionPhotogalleryArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}
	public void verifyPhotoPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, photoSectionPhotogalleryArticleLnk, photogalleryArticleSocialMediaLnk);
	}

	public void verifyPhotoPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,photoSectionPhotogalleryArticleLnk, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyPhotoPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, photoSectionPhotogalleryArticleLnk, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyPhotoPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, photoSectionPhotogalleryArticleLnk, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyPhotoPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, photoSectionPhotogalleryArticleLnk, photogalleryArticleDetailedDescriptionTxt);
	}



	//--------Health_Photogallery------------//
	public void verifyHealthPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyHealthPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyHealthPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}
	public void verifyHealthPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyHealthPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyHealthPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyHealthPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyHealthPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	//------------------------- Astrology Photogallery ---------------------------------//
	public void verifyAstrologyPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyAstrologyPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyAstrologyPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyAstrologyPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyAstrologyPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyAstrologyPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyAstrologyPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk , articleBodyTaboolaLogo);
	}

	public void verifyAstrologyPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	// ------------------------ Auto Photogallery ---------------------------------------//
	public void verifyAutoPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyAutoPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyAutoPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyAutoPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyAutoPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyAutoPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyAutoPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyAutoPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}


	//--------------------------- Dharm_Photogallery------------------------//
	public void verifyDharmPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyDharmPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyDharmPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyDharmPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	public void verifyDharmPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyDharmPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyDharmPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyDharmPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}


	//------------ Career ---------//

	public void verifyCareerPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}
	public void verifyCareerPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyCareerPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyCareerPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyCareerPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyCareerPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifyCareerPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCareerPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//---------------------------------------Sahitya Photogallery---------------------------------------//

	public void verifySahityaPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonPhotogalleryArticleLnks, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifySahityaPhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifySahityaPhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifySahityaPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifySahityaPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnks, breadCrumbLnks);
	}

	public void verifySahityaPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifySahityaPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnks, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}
	public void verifySahityaPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnks, photogalleryArticleSocialMediaLnk);
	}

	//--------Blog Photogallery------------//
	public void verifyBlogPhotogalleryArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, blogsPhotogalleryArticleLnk, breadCrumbLnks);
	}

	public void verifyBlogPhotogalleryArticleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType, blogsPhotogalleryArticleLnk, taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyBlogPhotogalleryArticleTitleAndLastUpdatedTimeValidation(String serverType) {
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,blogsPhotogalleryArticleLnk, photogalleryArticleHeaderTxt, photogalleryArticleLastUpdatedTxt, photogalleryArticleLastUpdatedTxt);
	}

	public void verifyBlogPhotogalleryArticlePhotogalleryArticleAgencyNavigation(String serverType) {
		verifyArticleAgencyNavigation(serverType, blogsPhotogalleryArticleLnk, photogalleryArticleAgencyLnk, news18AgencyTxt);
	}

	public void verifyBlogPhotogalleryArticlePhotogalleryArticleAuthorNavigation(String serverType) {
		verifyArticleAuthorNavigation(serverType, blogsPhotogalleryArticleLnk, photogalleryArticleAuthorLnk, authorNameTxt);
	}

	public void verifyBlogPhotogalleryArticleDescriptionValidation(String serverType) {
		verifyPhotogalleryArticleDescriptionHeaderLinkNavigation(serverType, blogsPhotogalleryArticleLnk, photogalleryArticleDetailedDescriptionTxt);
	}

	public void verifyBlogPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, blogsPhotogalleryArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyBlogPhotogalleryArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, blogsPhotogalleryArticleLnk, photogalleryArticleSocialMediaLnk);
	}

	//------------------- Entertainment ------------------------//

	public void verifyEntertainmentArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyEntertainmentArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyEntertainmentArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyEntertainmentArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyEntertainmentArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyEntertainmentArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyEntertainmentArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyEntertainmentArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyEntertainmentArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyEntertainmentArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyEntertainmentArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyEntertainmentArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyEntertainmentArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyEntertainmentArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}


	//------------------- Food ------------------------//

	public void verifyFoodArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyFoodArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,foodArticleLastUpdatedTxt, foodArticleLastUpdatedTimeTxt);
	}

	public void verifyFoodArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyFoodArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, foodArticleAgencyLnk , news18AgencyTxt);
	}

	public void verifyFoodArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, foodArticleSocialMediaIconLnk);
	}

	public void verifyFoodArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyFoodArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyFoodArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyFoodArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyFoodArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyFoodArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyFoodArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyFoodArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyFoodArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Pradesh ------------------------//

	public void verifyPradeshArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyPradeshArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyPradeshArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyPradeshArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyPradeshArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyPradeshArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyPradeshArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyPradeshArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyPradeshArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyPradeshArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyPradeshArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyPradeshArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyPradeshArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyPradeshArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Knowledge ------------------------//

	public void verifyKnowledgeArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyKnowledgeArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyKnowledgeArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyKnowledgeArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyKnowledgeArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyKnowledgeArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyKnowledgeArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyKnowledgeArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyKnowledgeArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyKnowledgeArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyKnowledgeArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyKnowledgeArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyKnowledgeArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyKnowledgeArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Naukari ------------------------//

	public void verifyNaukariArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyNaukariArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyNaukariArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyNaukariArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyNaukariArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyNaukariArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyNaukariArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyNaukariArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyNaukariArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyNaukariArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyNaukariArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyNaukariArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyNaukariArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyNaukariArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Tech ------------------------//

	public void verifyTechArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyTechArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyTechArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyTechArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyTechArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyTechArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyTechArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyTechArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyTechArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyTechArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyTechArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyTechArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyTechArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyTechArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Nation ------------------------//

	public void verifyNationArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyNationArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyNationArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyNationArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyNationArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyNationArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyNationArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyNationArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyNationArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyNationArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyNationArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyNationArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyNationArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyNationArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Lifestyle ------------------------//

	public void verifyLifestyleArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyLifestyleArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyLifestyleArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyLifestyleArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	//	public void verifyFoodArticleLastUpdatedTimeValidation(String serverType)
	//	{
	//		verifyArticleLastUpdatedTime(serverType, moneyArticleLnk, articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	//	}

	public void verifyLifestyleArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyLifestyleArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyLifestyleArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyLifestyleArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyLifestyleArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyLifestyleArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyLifestyleArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyLifestyleArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyLifestyleArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyLifestyleArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- World ------------------------//

	public void verifyWorldArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyWorldArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyWorldArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyWorldArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyWorldArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyWorldArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyWorldArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyWorldArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyWorldArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyWorldArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyWorldArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyWorldArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyWorldArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyWorldArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}

	//------------------- Crime ------------------------//

	public void verifyCrimeArticleBreadCrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonArticleLnks, breadCrumbLnks);
	}

	public void verifyCrimeArticleTitleAndLastUpdatedTimeValidation(String serverType)
	{
		verifyArticleTitleAndLastUpdatedTimeValidation(serverType,commonArticleLnks, articleHeaderTxt ,articleLastUpdatedTxt, articleLastUpdatedTimeTxt);
	}

	public void verifyCrimeArticleReadMoreDescription(String serverType)
	{
		verifyArticleReadMoreDescription(serverType, commonArticleLnks, articleDescriptionReadMoreLnk , articleDescriptionTxt);
	}

	public void verifyCrimeArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonArticleLnks, articleAgencyLnk , news18AgencyTxt);
	}

	public void verifyCrimeArticleSocialMediaNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType,commonArticleLnks, articleSocialMediaIconLnk);
	}

	public void verifyCrimeArticleGoogleNewsNavigation(String serverType) {
		verifyArticleGoogleNewsNavigation(serverType, commonArticleLnks,articleGoogleNewsLnk ,  googleNews18Logo);
	}

	public void verifyCrimeArticleAuthorNavigation(String serverType)
	{
		verifyArticleAuthorNavigation(serverType, commonArticleLnks, articleAuthorLnk, authorNameTxt);
	}

	public void verifyCrimeArticleRelatedNewsNavigation(String serverType)
	{
		verifyArticleRelatedNewsNavigation(serverType, commonArticleLnks, articleTagsLnk, articleRelatedNewsLnk);
	}

	public void verifyCrimeArticleHighlightNavigation(String serverType)
	{
		verifyArticleHighlightValidation(serverType, commonArticleLnks, articleHighlightDiv);
	}

	public void verifyCrimeArticleDetailedDescriptionNavigation(String serverType)
	{
		verifyArticleDescriptionHeaderLinkNavigation(serverType, commonArticleLnks, articleDetailedDescriptionTxt, articleDetailedHighlightLnk);
	}

	public void verifyCrimeArticleTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCrimeArticleRHSTaboolaNavigation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonArticleLnks , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCrimeArticleFooterReadMoreNavigation(String serverType)
	{
		articleBannerReadMoreLnk(serverType, commonArticleLnks, activeReadMoreDiv ,  footerReadMoreLnk);
	}

	public void verifyCrimeArticleFooterSocialMediaNavigation(String serverType) {
		verifyFooterArticleSocialMediaNavigation(serverType, commonArticleLnks,footerReadMoreLnk, reFooterSocialMediaLnks);
	}


	//-------------------- Sanjeeb Photogallery Methods ---------------------------------//




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
			String numbering = webDriverActions.getTextFromElement(photosCountLnks.get(i));
			webDriverActions.softClickJS(photosSectionExpandViewLnks.get(i));
			String text = webDriverActions.getTextFromElement(numberingExpandedView);

			//------ validating the Numbers Present in Expended View with The Ouside Photo Numbering-----------
			softAssert.assertTrue(numbering.equals(text) , "Possibly Counting mismatch");	

			//------ validating Play and Pause Btn ---------------
			webDriverActions.softHighlightElement(expandedViewPlayAndPauseBtn);
			webDriverActions.softClickJS(expandedViewPlayAndPauseBtn);
			String text1="";
			boolean status =true;
			for(int j=0;j<3;j++)
			{
				webDriverActions.waitForSecond(1000);
				text1 = webDriverActions.getTextFromElement(numberingExpandedView);
				status = text.equals(text1);
				if(status==false)
				{
					break;
				}
			}
			softAssert.assertTrue(status==false , "Possibly Play Or Pause Button is Not Working ");
			webDriverActions.softClickJS(expandedViewPlayAndPauseBtn);

			//------ validating Header Title and Captions ---------------
			webDriverActions.waitForSecond(500);
			webDriverActions.softHighlightElement(expandedViewHeaderTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewHeaderTxt) , "Possibly Header Title is not visible");	
			webDriverActions.softHighlightElement(expandedViewPhotosCaption);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewPhotosCaption), "Possibly Captions not visible");	

			//------ validating social share Icons in extended View ---------------
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

			//------ validating Arrow key in extended View ---------------
			webDriverActions.waitForSecond(500);
			String firstTxt = webDriverActions.getTextFromElement(numberingExpandedView);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewRightArrowBtn),"Possibly Photogallery Right Arrow Button Is Not Visisble in "+mainURL );
			webDriverActions.softHighlightElement(expandedViewRightArrowBtn);
			webDriverActions.softClickJS(expandedViewRightArrowBtn);
			String secondTxt = webDriverActions.getTextFromElement(numberingExpandedView);
			softAssert.assertTrue(!firstTxt.equals(secondTxt) , "Possibly Right Arrow Key Not Working in Extended View");

			//------ validating Arrow key in extended View ---------------
			webDriverActions.waitForSecond(500);
			String firstTxt1 = webDriverActions.getTextFromElement(numberingExpandedView);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(expandedViewLeftArrowBtn),"Possibly Photogallery Right Arrow Button Is Not Visisble in "+mainURL );
			webDriverActions.softHighlightElement(expandedViewLeftArrowBtn);
			webDriverActions.softClickJS(expandedViewLeftArrowBtn);
			String secondTxt1 = webDriverActions.getTextFromElement(numberingExpandedView);
			softAssert.assertTrue(!firstTxt1.equals(secondTxt1) , "Possibly Left Arrow Key Not Working in Extended View");

			webDriverActions.softHighlightElement(expandedViewCloseBtn);
			webDriverActions.softClickJS(expandedViewCloseBtn);

		}
		softAssert.assertAll("Issue Found In Validating Photos Descriptions In Expanded View "+mainURL);
	}


	//========================Anupam -Business Logic===================================

	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 * @param breadcrumb
	 */
	public void verifyTagsNavigation(String serverType , List<WebElement> articleLst, WebElement breadcrumb) {
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(liveTagsKey, 2);
				//				webDriverActions.continuousScrollTillAllElement(tagsValue, 10);
				//				softAssert.assertTrue(tagsValue.size()>0, "Possibly Tags is Not Visible"+"\t"+currentPageUrl);

				if(webDriverActions.softIsElementDisplayed(liveTagsKey, 2)) {
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
						softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb) , "Possibly Page is Not Visible "+currentPageTagUrl);
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
					softAssert.fail("Possibly Tag is not present"+"\t"+currentPageUrl);
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

	public void verifyMoneyTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineOneSectionMoneyELeList,tagBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleFirstPublishedAndAuthorNavigation(String serverType , List<WebElement> articleLst) {
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(liveTagsKey, 2);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(firstpublished, 2) , "Possibly firstpublished is Not Visible "+currentPageUrl);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorNameLnk, 2) , "Possibly author Name is Not Visible in bottom "+currentPageUrl);

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

	public void verifyMoneyArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineOneSectionMoneyELeList);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyVideoBetweenArticleNavigation(String serverType , List<WebElement> articleLst) {
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				if(webDriverActions.softIsElementDisplayed(videoBetweenArticle, 3)) {
					webDriverActions.softMouseHover(videoBetweenArticle);
					webDriverActions.waitForSecond(1000);
					DriverUtility.getDriver().switchTo().frame(videoBetweenArticle);
					webDriverActions.softClick(videoLargePlayButton);
					webDriverActions.waitForSecond(2000);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(pauseBtn,2) , "Possibly play button is not working in video between article"+currentPageUrl);
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

	public void verifyMoneyVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineOneSectionMoneyELeList);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsVideoNavigation(String serverType , List<WebElement> articleLst) {
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 1);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(rhsTopAds,5) , "Possibly RHS top Ads is not present "+"\t"+currentPageUrl);
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


	public void verifyMoneyArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineOneSectionMoneyELeList);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleConclusionNavigation(String serverType , List<WebElement> articleLst) {
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
				webDriverActions.continuousScrollTillElement(readMoreBox, 2);
				if(webDriverActions.softIsElementDisplayed(readMoreBox, 3))
					webDriverActions.softClickJS(readMoreBox);
				webDriverActions.waitForSecond(1000);
				webDriverActions.continuousScrollTillElement(conclusionDiv, 2);
				webDriverActions.softMouseHover(conclusionDiv);
				webDriverActions.softHighlightElement(conclusionDiv);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(conclusionDiv, 2) , "Possibly Conclusion Division is Not Visible "+currentPageUrl);

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

	public void verifyMoneyArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineOneSectionMoneyELeList);
	}


	// AJAB GAJAB
	public void verifyAjabGajabTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyAjabGajabArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAjabGajabVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAjabGajabArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyAjabGajabArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// ASTROLOGY	
	public void verifyAstrologyTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyAstrologyArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAstrologyVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAstrologyArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyAstrologyArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// AUTO	
	public void verifyAutoTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyAutoArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAutoVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyAutoArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyAutoArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// CAREER		
	public void verifyCareerTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyCareerArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyCareerVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyCareerArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyCareerArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// CRICKET
	public void verifyCricketTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, cricketArticleLink,tagBreadcrumb);
	}

	public void verifyCricketArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, cricketArticleLink);
	}

	public void verifyCricketVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, cricketArticleLink);
	}

	public void verifyCricketArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, cricketArticleLink);
	}
	public void verifyCricketArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, cricketArticleLink);
	}


	// Crime
	public void verifyCrimeTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, crimeArticleLink,tagBreadcrumb);
	}

	public void verifyCrimeArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, crimeArticleLink);
	}

	public void verifyCrimeVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, crimeArticleLink);
	}

	public void verifyCrimeArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, crimeArticleLink);
	}
	public void verifyCrimeArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, crimeArticleLink);
	}


	// DHARM	
	public void verifyDharmTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyDharmArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyDharmVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyDharmArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyDharmArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// ENTERTAINMENT
	public void verifyEntertainmentTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, entertainmentArticleLink,tagBreadcrumb);
	}

	public void verifyEntertainmentArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, entertainmentArticleLink);
	}

	public void verifyEntertainmentVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, entertainmentArticleLink);
	}

	public void verifyEntertainmentArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, entertainmentArticleLink);
	}
	public void verifyEntertainmentArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, entertainmentArticleLink);
	}


	// FOOD
	public void verifyFoodTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, foodArticleLink,tagBreadcrumb);
	}

	public void verifyFoodArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, foodArticleLink);
	}

	public void verifyFoodVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, foodArticleLink);
	}

	public void verifyFoodArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, foodArticleLink);
	}
	public void verifyFoodArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, foodArticleLink);
	}


	// HEALTH
	public void verifyHealthTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyHealthArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyHealthVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyHealthArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyHealthArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// KNOWLEDGE
	public void verifyKnowledgeTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, knowledgeArticleLink,tagBreadcrumb);
	}

	public void verifyKnowledgeArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, knowledgeArticleLink);
	}

	public void verifyKnowledgeVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, knowledgeArticleLink);
	}

	public void verifyKnowledgeArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, knowledgeArticleLink);
	}
	public void verifyKnowledgeArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, knowledgeArticleLink);
	}


	// LATEST NEWS
	public void verifyLatestNewsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifyLatestNewsArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyLatestNewsVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifyLatestNewsArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifyLatestNewsArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// LIFE
	public void verifyLifeTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lifeArticleLink,tagBreadcrumb);
	}

	public void verifyLifeArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lifeArticleLink);
	}

	public void verifyLifeVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lifeArticleLink);
	}

	public void verifyLifeArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lifeArticleLink);
	}
	public void verifyLifeArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lifeArticleLink);
	}


	// NATION
	public void verifyNationTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, nationArticleLink,tagBreadcrumb);
	}

	public void verifyNationArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, nationArticleLink);
	}

	public void verifyNationVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, nationArticleLink);
	}

	public void verifyNationArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, nationArticleLink);
	}
	public void verifyNationArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, nationArticleLink);
	}

	// JOBS
	public void verifyJobsTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, jobsArticleLink,tagBreadcrumb);
	}

	public void verifyJobsArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, jobsArticleLink);
	}

	public void verifyJobsVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, jobsArticleLink);
	}

	public void verifyJobsArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, jobsArticleLink);
	}
	public void verifyJobsArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, jobsArticleLink);
	}


	// PRADESH
	public void verifyPradeshTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, pradeshArticleLink,tagBreadcrumb);
	}

	public void verifyPradeshArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, pradeshArticleLink);
	}

	public void verifyPradeshVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, pradeshArticleLink);
	}

	public void verifyPradeshArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, pradeshArticleLink);
	}
	public void verifyPradeshArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, pradeshArticleLink);
	}

	// SAHITYA		
	public void verifySahityaTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, lineTwoSectionPriorityELeList,tagBreadcrumb);
	}

	public void verifySahityaArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifySahityaVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, lineTwoSectionPriorityELeList);
	}

	public void verifySahityaArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, lineTwoSectionPriorityELeList);
	}
	public void verifySahityaArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, lineTwoSectionPriorityELeList);
	}


	// TECH
	public void verifyTechTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, techArticleLink,tagBreadcrumb);
	}

	public void verifyTechArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, techArticleLink);
	}

	public void verifyTechVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, techArticleLink);
	}

	public void verifyTechArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, techArticleLink);
	}
	public void verifyTechArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, techArticleLink);
	}

	// WORLD
	public void verifyWorldTagsNavigation(String serverType)
	{
		verifyTagsNavigation(serverType, worldArticleLink,tagBreadcrumb);
	}

	public void verifyWorldArticleFirstPublishedAndAuthorNavigation(String serverType)
	{
		verifyArticleFirstPublishedAndAuthorNavigation(serverType, worldArticleLink);
	}

	public void verifyWorldVideoBetweenArticleNavigation(String serverType)
	{
		verifyVideoBetweenArticleNavigation(serverType, worldArticleLink);
	}

	public void verifyWorldArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, worldArticleLink);
	}
	public void verifyWorldArticleConclusionNavigation(String serverType)
	{
		verifyArticleConclusionNavigation(serverType, worldArticleLink);
	}



	//===---Photogallery

	/**
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
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
					webDriverActions.softClick(expandLnk.get(j));
					webDriverActions.waitForSecond(1000);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(closeExpandLnk,3) , "Possibly Expand button is Not working  "+(j+1)+"\t"+currentPageUrl);
					if(webDriverActions.softIsElementDisplayed(closeExpandLnk, 3)) {
						webDriverActions.softClick(closeExpandLnk);
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

	public void verifyKnowledgePhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoArticleDownArrowNavigation(String serverType , List<WebElement> articleLst) {
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
				softAssert.assertTrue(upAndDownArrow.size()>0, "Possibly Down arrow is Not Visible");
				for(int j=0; j<upAndDownArrow.size(); j += 2) {
					int count=((j+2)/2);
					webDriverActions.softScrollToElement(upAndDownArrow.get(j));
					webDriverActions.softMouseHover(upAndDownArrow.get(j));
					webDriverActions.softHighlightElement(upAndDownArrow.get(j));
					webDriverActions.softClickJS(upAndDownArrow.get(j));
					webDriverActions.waitForSecond(1000);
					Logs.info(getClass(), "Down Arrow count"+"\t"+count);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(upAndDownArrow.get(j),3) , "Possibly Down Arrow button is Not working  "+count+"\t"+currentPageUrl);
					if(webDriverActions.softIsElementDisplayed(upAndDownArrow.get(j), 3) ) {
						webDriverActions.softClick(upAndDownArrow.get(j));
						webDriverActions.waitForSecond(1500);
						String url=webDriverActions.getCurrentPageUrl();
						softAssert.assertTrue(url.contains("page-"+(count+1)) , "Possibly down button is Not working  "+count+"\t"+url);	
					}
					webDriverActions.waitForSecond(100);
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

	public void verifyKnowledgePhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for AjabGajab Widget in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoArticleUpArrowNavigation(String serverType , List<WebElement> articleLst) {
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
				softAssert.assertTrue(upAndDownArrow.size()>0, "Possibly Up arrow is Not Visible");
				for(int j=upAndDownArrow.size()-1; j>1; j -= 2) {
					int count=((j+1)/2);
					webDriverActions.softScrollToElement(upAndDownArrow.get(j));
					webDriverActions.softMouseHover(upAndDownArrow.get(j));
					webDriverActions.softHighlightElement(upAndDownArrow.get(j));
					webDriverActions.softClickJS(upAndDownArrow.get(j));
					webDriverActions.waitForSecond(1000);
					Logs.info(getClass(), "Up Arrow count"+"\t"+count);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(upAndDownArrow.get(j),3) , "Possibly Up Arrow is Not visible  "+count+"\t"+currentPageUrl);
					if(webDriverActions.softIsElementDisplayed(upAndDownArrow.get(j), 3) ) {
						webDriverActions.softClick(upAndDownArrow.get(j));
						webDriverActions.waitForSecond(1500);
						String url = webDriverActions.getCurrentPageUrl();
						softAssert.assertTrue(url.contains("page-"+(count)) , "Possibly up Arrow is Not working  "+count+"\t"+url);
					}
					webDriverActions.waitForSecond(100);
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

	public void verifyKnowledgePhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}


	//MONEY PHOTOGALLERY
	public void verifyMoneyPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}

	public void verifyMoneyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyMoneyPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyMoneyPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//AJAB GAJAB PHOTOGALLERY
	public void verifyAjabGajabPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyAjabGajabPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAjabGajabPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAjabGajabPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}


	//ASTROLOGY PHOTOGALLERY
	public void verifyAstrologyPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyAstrologyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAstrologyPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAstrologyPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//AUTO 
	public void verifyAutoPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyAutoPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAutoPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyAutoPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//PHOTO 
	public void verifyPhotoArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, photoSectionPhotoArticleELeList);
	}
	public void verifyPhotoArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,photoSectionPhotoArticleELeList );
	}
	public void verifyPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,photoSectionPhotoArticleELeList );
	}
	public void verifyPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,photoSectionPhotoArticleELeList );
	}

	//BLOG
	public void verifyBlogPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyBlogArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyBlogPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyBlogPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//CAREER
	public void verifyCareerPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyCareerArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyCareerPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyCareerPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//CRICKET
	public void verifyCricketPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, cricketPhotoArticleELeList);
	}
	public void verifyCricketPhotoGalleryArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,cricketPhotoArticleELeList );
	}
	public void verifyCricketPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,cricketPhotoArticleELeList );
	}
	public void verifyCricketPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,cricketPhotoArticleELeList );
	}

	//CRIME
	public void verifyCrimePhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyCrimeArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyCrimePhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyCrimePhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//DHARM
	public void verifyDharmPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyDharmArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyDharmPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyDharmPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//ENTERTAINMENT
	public void verifyEntertainmentPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyEntertainmentArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyEntertainmentPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyEntertainmentPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//FOOD
	public void verifyFoodPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyFoodArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyFoodPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyFoodPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//HEALTH
	public void verifyHealthPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyHealthArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyHealthPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyHealthPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//JOBS
	public void verifyJobsPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyJobsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyJobsPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyJobsPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//KNOWLEDGE
	public void verifyKnowledgePhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyKnowledgeArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}

	//LatestNews
	public void verifyLatestNewsPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyLatestNewsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyLatestNewsPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyLatestNewsPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//LIFE
	public void verifyLifeNewsPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyLifeNewsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyLifePhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyLifePhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//MOBILES
	public void verifyMobilesPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyMobilesArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyMobilesPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyMobilesPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//NATION
	public void verifyNationPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyNationNewsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyNationPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyNationtPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//PRADESH
	public void verifyPradeshPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyPradeshArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyPradeshPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyPradeshPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//SAHITYA
	public void verifySahityaPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifySahityaNewsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifySahityaPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifySahityaPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//TECH
	public void verifyTechPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyTechNewsArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyTechPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyTechPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}

	//WORLD
	public void verifyWorldPhotoGalleryArticleRHSAdsNavigation(String serverType)
	{
		verifyArticleRHSAdsVideoNavigation(serverType, commonPhotoArticleELeList);
	}
	public void verifyWorldArticleExpandNavigation(String serverType)
	{
		verifyPhotoArticleExpandNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyWorldPhotoArticleDownArrowNavigation(String serverType)
	{
		verifyPhotoArticleDownArrowNavigation(serverType,commonPhotoArticleELeList );
	}
	public void verifyWorldPhotoArticleUpArrowNavigation(String serverType)
	{
		verifyPhotoArticleUpArrowNavigation(serverType,commonPhotoArticleELeList );
	}


	/**
	 * @author AnupamGupta
	 * @param serverType
	 * This method is used to click on the articles of RHS section
	 */
	public void verifyRHSNewTabArticleNavigation(String serverType,WebElement title,List<WebElement> articlesLinks,List<WebElement> categoryPageLinks) {
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
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, "Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);

				String articlePage = webDriverActions.getCurrentPageUrl();
				webDriverActions.softScrollToElement(title);
				String articlePageTitle = webDriverActions.getPageTitle();
				//		webDriverActions.continuousScrollTillElement(autoHeadline, 10);
				Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				for(int j=0;j<articlesLinks.size();j++) {
					webDriverActions.softHighlightElement(articlesLinks.get(j));
					webDriverActions.mouseHover(articlesLinks.get(j));

					String actualCP =	webDriverActions.getAttribute("href", articlesLinks.get(j));
					String target = webDriverActions.getAttribute("target", articlesLinks.get(j));
					Logs.info(getClass(), actualCP);
					webDriverActions.softClickJS(articlesLinks.get(j));

					switch(target) {
					case "_blank":			webDriverActions.waitForSecond(2000);
					webDriverActions.switchToNewWindow();
					webDriverActions.waitForPageToLoad();

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

					webDriverActions.closeDriver();
					webDriverActions.switchToWindow(articlePageTitle);
					webDriverActions.waitForSecond(2000);
					break;
					default:currentCPPage = webDriverActions.getCurrentPageUrl();
					expectedCP = webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preprod")) {
						String betaUrl = genericUtility.replaceInUrl(currentCPPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentCPPage = betaUrl;
					}
					responseCP = genericUtility.checkLinks(currentCPPage);
					if (responseCP==200) {
						boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
						softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
					}
					else {
						softAssert.fail(" Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
					}
					webDriverActions.navigateToUrl(articlePage);

					}
				}
			}
			else {
				softAssert.fail(" Status Code is "+response+" Possibly Url is Invalid "+currentPage);
			}
			webDriverActions.navigateToUrl(categoryPage);
		}
		softAssert.assertAll("Issues found in Rhs section Articles ");
	}

	//=================================RHS ==================================
	//Cricket RHS
	public void verifyCricketRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,cricketVideoArticleLink);
	}

	public void verifyCricketRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,cricketVideoArticleLink);
	}

	public void verifyCricketRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,cricketVideoArticleLink);
	}
	//Entertainment RHS
	public void verifyEntertainmentRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}

	public void verifyEntertainmentRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}

	public void verifyEntertainmentRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Food RHS
	public void verifyFoodRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}

	public void verifyFoodRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}

	public void verifyFoodRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}
	//Mobiles RHS
	public void verifyMobilesRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,mobilesVideoArticleLink);
	}
	public void verifyMobilesRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,mobilesVideoArticleLink);
	}
	public void verifyMobilesRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,mobilesVideoArticleLink);
	}

	//Pradesh RHS
	public void verifyPradeshRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyPradeshRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyPradeshRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Knowledge RHS
	public void verifyKnowledgeRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyKnowledgeRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyKnowledgeRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Life
	public void verifyLifeRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyLifeRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyLifeRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Jobs RHS	
	public void verifyJobsRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyJobsRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyJobsRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Tech RHS
	public void verifyTechRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyTechRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyTechRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//World RHS
	public void verifyWorldRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyWorldRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyWorldRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Nation RHS
	public void verifyNationRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyNationRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyNationRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Crime RHS
	public void verifyCrimeRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}
	public void verifyCrimeRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}
	public void verifyCrimeRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//Linetwo LatestNews
	public void verifyLatestNewsRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyLatestNewsRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyLatestNewsRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo AjabGajab
	public void verifyAjabGajabRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAjabGajabRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAjabGajabRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Photo
	public void verifyPhotoRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPhotoPriorityVideoELeList);
	}
	public void verifyPhotoRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPhotoPriorityVideoELeList);
	}
	public void verifyPhotoRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPhotoPriorityVideoELeList);
	}

	//Linetwo Health
	public void verifyHealthRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyHealthRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyHealthRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Astrology
	public void verifyAstrologyRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAstrologyRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAstrologyRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Auto
	public void verifyAutoRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAutoRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAutoRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Dharm
	public void verifyDharmRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyDharmRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyDharmRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Career
	public void verifyCareerRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyCareerRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyCareerRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Sahitya
	public void verifySahityaRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifySahityaRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifySahityaRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Blog
	public void verifyBlogRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,lineTwoSectionBlogPriorityVideoELeList);
	}
	public void verifyBlogRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,lineTwoSectionBlogPriorityVideoELeList);
	}
	public void verifyBlogRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,lineTwoSectionBlogPriorityVideoELeList);
	}

	// Money Categories RHS sports Validation Methods /
	public void verifyMoneyRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyMoneyRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyMoneyRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	// CRICKET	
	public void verifyCricketRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,cricketVideoArticleLink);
	}
	public void verifyCricketRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,cricketVideoArticleLink);
	}
	public void verifyCricketRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,cricketVideoArticleLink);
	}

	// ENTERTAINMENT
	public void verifyEntertainmentRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyEntertainmentRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyEntertainmentRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	// FOOD
	public void verifyFoodRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyFoodRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyFoodRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	// MOBILES
	public void verifyMobilesRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,mobilesVideoArticleLink);
	}
	public void verifyMobilesRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,mobilesVideoArticleLink);
	}
	public void verifyMobilesRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,mobilesVideoArticleLink);
	}

	//Pradesh RHS
	public void verifyPradeshRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyPradeshRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyPradeshRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Knowledge RHS
	public void verifyKnowledgeRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyKnowledgeRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyKnowledgeRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Jobs RHS
	public void verifyJobsRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyJobsRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyJobsRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Tech RHS	
	public void verifyTechRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyTechRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyTechRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//World RHS
	public void verifyWorldRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyWorldRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyWorldRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Nation RHS
	public void verifyNationRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyNationRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyNationRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Crime RHS
	public void verifyCrimeRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyCrimeRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyCrimeRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Linetwo LatestNews
	public void verifyLatestNewsRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyLatestNewsRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyLatestNewsRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Life
	public void verifyLifeRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,commonVideoArticleLnk);
	}
	public void verifyLifeRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,commonVideoArticleLnk);
	}
	public void verifyLifeRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,commonVideoArticleLnk);
	}

	//Linetwo AjabGajab
	public void verifyAjabGajabRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAjabGajabRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAjabGajabRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Photo
	public void verifyPhotoRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPhotoPriorityVideoELeList);
	}
	public void verifyPhotoRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPhotoPriorityVideoELeList);
	}
	public void verifyPhotoRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPhotoPriorityVideoELeList);
	}

	//Linetwo Health
	public void verifyHealthRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyHealthRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyHealthRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Astrology
	public void verifyAstrologyRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAstrologyRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAstrologyRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Auto
	public void verifyAutoRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAutoRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyAutoRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Dharm
	public void verifyDharmRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyDharmRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyDharmRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Career
	public void verifyCareerRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyCareerRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifyCareerRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Sahitya
	public void verifySahityaRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifySahityaRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionPriorityCommonVideoELeList);
	}
	public void verifySahityaRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionPriorityCommonVideoELeList);
	}

	//Linetwo Blog
	public void verifyBlogRhsSportsTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,sportsTitle,lineTwoSectionBlogPriorityVideoELeList);
	}
	public void verifyBlogRhsSportsArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,sportsTitle,sportsArticleLinks,lineTwoSectionBlogPriorityVideoELeList);
	}
	public void verifyBlogRhsSportsReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,sportsTitle,sportsMoreLink,lineTwoSectionBlogPriorityVideoELeList);
	}

	//money
	public void verifyMoneyRhsEntertainmentTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,entertainmentTitle,commonVideoArticleLnk);
	}

	public void verifyMoneyRhsEntertainmentArticleNavigation(String serverType) {
		verifyRHSNewTabArticleNavigation(serverType,entertainmentTitle,entertainmentArticleLinks,commonVideoArticleLnk);
	}

	public void verifyMoneyRhsEntertainmentReadMoreNavigation(String serverType) {
		verifyRHSReadMoreNavigation(serverType,entertainmentTitle,entertainmentMoreLink,commonVideoArticleLnk);
	}

	//--------------------------------    knowledge --------------------//

		public void verifyKnowledgeVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyKnowledgeVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyKnowledgeVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyKnowledgeVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyKnowledgeVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyKnowledgeVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Money  -------------------------//

		public void verifyMoneyVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyMoneyVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyMoneyVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyMoneyVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyMoneyVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyMoneyVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Cricket  -------------------------//

		public void verifyCricketVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, cricketVideoArticleLink, videoArticleSocialShareIcon);
		}

		public void verifyCricketVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, cricketVideoArticleLink,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyCricketVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, cricketVideoArticleLink, breadCrumbLnks);
		}

		public void verifyCricketVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, cricketVideoArticleLink, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyCricketVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, cricketVideoArticleLink, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyCricketVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, cricketVideoArticleLink, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Entertainment  -------------------------//

		public void verifyEntertainmentVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyEntertainmentVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyEntertainmentVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyEntertainmentVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyEntertainmentVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyEntertainmentVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Food  -------------------------//

		public void verifyFoodVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyFoodVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyFoodVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyFoodVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyFoodVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyFoodVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Pradesh  -------------------------//

		public void verifyPradeshVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyPradeshVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyPradeshVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyPradeshVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyPradeshVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyPradeshVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Jobs  -------------------------//

		public void verifyJobsVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyJobsVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyJobsVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyJobsVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyJobsVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyJobsVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Tech  -------------------------//

		public void verifyTechVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyTechVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyTechVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyTechVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyTechVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyTechVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Nation  -------------------------//

		public void verifyNationVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyNationVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyNationVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyNationVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyNationVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyNationVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Lifestyle  -------------------------//

		public void verifyLifestyleVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyLifestyleVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyLifestyleVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyLifestyleVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyLifestyleVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyLifestyleVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- World  -------------------------//

		public void verifyWorldVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyWorldVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyWorldVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyWorldVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyWorldVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyWorldVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}

		// --------------------------- Crime  -------------------------//

		public void verifyCrimeVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyCrimeVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyCrimeVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyCrimeVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyCrimeVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyCrimeVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}
		
		/* Common Video Article Business Logic */
		

		public void verifyCommonVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, commonVideoArticleLnk, videoArticleSocialShareIcon);
		}

		public void verifyCommonVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyCommonVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, commonVideoArticleLnk, breadCrumbLnks);
		}

		public void verifyCommonVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, commonVideoArticleLnk, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyCommonVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, commonVideoArticleLnk, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyCommonVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, commonVideoArticleLnk, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}
		
		// --------------------------- Blogs  -------------------------//

		public void verifyBlogsVideoArticleSocialShareValidation(String serverType)
		{
			verifyPhotogalleryArticleSocialMediaNavigation(serverType, blogsVideoArticleLink, videoArticleSocialShareIcon);
		}

		public void verifyBlogsVideoArticleTaboolaFeedsValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, blogsVideoArticleLink,taboolaArticleLst, taboolaImgLnk, articleBodyTaboolaLogo);
		}

		public void verifyBlogsVideoArticleBreadCrumbNavigation(String serverType)
		{
			verifyArticleBreadCrumbNavigation(serverType, blogsVideoArticleLink, breadCrumbLnks);
		}

		public void verifyBlogsVideoArticleDateTimeChannelDescription(String serverType)
		{
			verifyArticleTitleAndLastUpdatedTimeValidation(serverType, blogsVideoArticleLink, videoArticleTitleTxt, videoArticleDateTime, videoArticleChannel);
		}

		public void verifyBlogsVideoArticleDescriptionValidation(String serverType) {
			verifyArticleReadMoreDescription(serverType, blogsVideoArticleLink, videoArticleReadMoreDescriptionBtn, videoArticleDescription);
		}

		public void verifyBlogsVideoArticleRHSTaboolaValidation(String serverType)
		{
			verifyArticleTaboolaNavigation(serverType, blogsVideoArticleLink, rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
		}



}
