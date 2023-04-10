package com.news18.hindipages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author SanjeebKumarPati
 * This Class Contains elements and business logics for AMP Hindi Revamp Desktop Landing  Page
 *
 */
public class DesktopHindiRevampCategoryLandingPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	public SoftAssert softAssert = new SoftAssert();

	public DesktopHindiRevampCategoryLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//================================= Sanjeeb's Elements =======================================

	//=======Blog Category =======================

	/* Author list present on Blog Landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'list__items')]/li/div[contains(@class,'list__item--left')]/a")
	private List<WebElement> authorList;

	/* Author header Text list present on Blog Landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'list__items')]/li/div[contains(@class,'list__item--right')]/h2/a")
	private List<WebElement> authorheaderTextList;

	/* Read more Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'list__items')]/li/div[contains(@class,'list__item--right')]/p/a")
	private List<WebElement> authorTextBoxReadMoreList;

	/* Date Time Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'list__items')]/li/div[contains(@class,'list__item--right')]/span")
	private List<WebElement> dateTimeList;

	/* Txt Present on Blog Author Description Text Box of Blog Landing Page*/
	@FindBy(xpath ="//ul[contains(@class,'list__items')]/li/div[contains(@class,'list__item--right')]/p")
	private List<WebElement> textList;


	//============== States Category Elements 

	/*Choose Your City Btn Present On Header LineOne*/
	@FindBy(xpath="//div[contains(@class,'newtopctgrhd')]//a[contains(@class,'newchoosecitybtn')]")
	private WebElement apnaSeherChuneBtn;

	/*cancel Btn Present On Apna Seher Chune Box*/
	@FindBy(xpath="//div[contains(@class,'tpchsstctpopup-in')]/ancestor::div[contains(@class,'adclstpchsstctpopup')]/div/a")
	private WebElement cancelBtnSeherChuneBox;

	//===== delhi

	/*delhi Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> delhiArticleList;

	/* delhi readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement delhiReadMoreLnk;

	/*delhi title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']")
	private WebElement delhiTitleLnk;

	/*delhi Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement delhiSectionSeherChune;

	/*delhi Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']/ancestor::div[@class='newallstates']")
	private WebElement delhiSection;

	/*delhi Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/delhi-ncr']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> delhiSectionSeherChuneEleList;

	//===== uttarPradesh
	/*uttarPradesh title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']")
	private WebElement uttarPradeshTitleLnk;

	/* uttarPradesh readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement uttarPradeshReadMoreLnk;

	/*uttarPradesh Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement uttarPradeshSectionSeherChune;

	/*uttarPradesh Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']/ancestor::div[@class='newallstates']")
	private WebElement uttarPradeshSection;

	/*uttarPradesh Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> uttarPradeshSectionSeherChuneEleList;

	/*uttar pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttar-pradesh']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> uttarPradeshArticleList;

	//===== bihar
	/*bihar title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/bihar']")
	private WebElement biharTitleLnk;

	/* delhi readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/bihar']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement biharReadMoreLnk;

	/*bihar Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/bihar']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement biharSectionSeherChune;

	/*bihar Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/bihar']/ancestor::div[@class='newallstates']")
	private WebElement biharSection;

	/*bihar Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/bihar']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> biharSectionSeherChuneEleList;

	/* bihar Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> biharArticleList;

	//===== Madhya Pradesh
	/*madhyaPradesh title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']")
	private WebElement madhyaPradeshTitleLnk;

	/* madhya-pradesh readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement madhyaPradeshReadMoreLnk;

	/*madhya-pradesh Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement madhyaPradeshSectionSeherChune;

	/*madhya-pradesh Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[@class='newallstates']")
	private WebElement madhyaPradeshSection;

	/*madhya-pradesh Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> madhyaPradeshSectionSeherChuneEleList;

	/*madhya-pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/madhya-pradesh']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> madhyaPradeshArticleList;

	//===== rajasthan
	/*rajasthan title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']")
	private WebElement rajasthanTitleLnk;

	/* rajasthan readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement rajasthanReadMoreLnk;

	/*rajasthan Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement rajasthanSectionSeherChune;

	/*rajasthan Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']/ancestor::div[@class='newallstates']")
	private WebElement rajasthanSection;

	/*rajasthan Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> rajasthanSectionSeherChuneEleList;

	/*madhya-pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/rajasthan']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> rajasthanArticleList;

	//===== uttarakhand
	/*uttarakhand title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']")
	private WebElement uttarakhandTitleLnk;

	/* uttarakhand readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement uttarakhandReadMoreLnk;

	/*uttarakhand Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement uttarakhandSectionSeherChune;

	/*uttarakhand Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']/ancestor::div[@class='newallstates']")
	private WebElement uttarakhandSection;

	/*uttarakhand Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> uttarakhandSectionSeherChuneEleList;

	/*madhya-pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/uttarakhand']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> uttarakhandArticleList;

	//===== haryana
	/*haryana title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']")
	private WebElement haryanaTitleLnk;

	/* haryana readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement haryanaReadMoreLnk;

	/*haryana Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement haryanaSectionSeherChune;

	/*haryana Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']/ancestor::div[@class='newallstates']")
	private WebElement haryanaSection;

	/*haryana Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> haryanaSectionSeherChuneEleList;

	/*madhya-pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/haryana']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> haryanaArticleList;

	//===== jharkhand
	/*jharkhand title */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']")
	private WebElement jharkhandTitleLnk;

	/* jharkhand readMore */
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']/ancestor::div[@class='newallstates']/div[contains(@class,'moretrndstroy')]")
	private WebElement jharkhandReadMoreLnk;

	/*jharkhand Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']/ancestor::div[contains(@class,'newglblhdwrap')]/div/a")
	private WebElement jharkhandSectionSeherChune;

	/*jharkhand Seher chune*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']/ancestor::div[@class='newallstates']")
	private WebElement jharkhandSection;

	/*jharkhand Section Seher Chune Ele List*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']/ancestor::div[@class='newallstates']//div[contains(@class,'newhdrlnghover')]//a")
	private List<WebElement> jharkhandSectionSeherChuneEleList;

	/*madhya-pradesh Article*/
	@FindBy(xpath = "//div[contains(@class,'newglblhdwrap')]/a[@href='/jharkhand']/ancestor::div[@class='newallstates']/ul/li/a")
	private List<WebElement> jharkhandArticleList;

	//==========================Vipin's WebElements (Category Page)=============================//

	// Common Category Articles Links //
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a")
	private List<WebElement> commonsCategoryArticleLnk;

	//----------------------------Latest News---------------//

	/*BreadCrumb Links present in the category page*
		/*Latest News Read More Link in Category Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'newbotbrdrbtn')]/a")
	private WebElement latestNewsReadMoreLnk;

	/*Latest News Priority Panel Category Name Links in Landing Page*/
	@FindBy(xpath = "//ul[contains(@class,'topstories')]/li/a//span")
	private List<WebElement> latestNewsCategoryNameLnk;

	/*BreadCrumb Links present in the category page*/
	@FindBy(xpath="//div/ul[contains(@class,'brdcrmb')]/li/a[@href]")
	private List<WebElement> breadCrumbLnks;

	/*Breadcrumb Text present in Category Page*/
	@FindBy(xpath="//div/ul[contains(@class,'brdcrmb')]/li/a/h2")
	private WebElement breadCrumbTxt;

	/*Header Text present in Category Page*/
	@FindBy(xpath="//div[contains(@class,'newtopctgrhd')]/h1")
	private WebElement headerTxt;

	/*  List of Promoted Content Ads in RHS  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaArticleLnk;

	/*  List of Promoted Content Ads in RHS*/
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> rhsTaboolaImgLnk;

	/*RHS Taboola Logo in Landing Page*/
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'link-attribution')]")
	private WebElement rhsTaboolaLogo;

	/*List of Taboola Article Links in footer*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*List of Promoted Content image */
	@FindBy(xpath ="//div[contains(@id,'taboola-below') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]//div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*Article Body Taboola Logo in Landing*/
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'tbl-logo')]/div")
	private WebElement articleBodyTaboolaLogo;

	/*List of Taboola Article Links in footer*/
	@FindBy(xpath ="//div[contains(@id,'taboola-mid') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//a[contains(@class,'label-href')]//span[contains(@class,'video-title')]")
	private List<WebElement> bodyTaboolaArticleLst;

	/*List of Promoted Content image */
	@FindBy(xpath ="//div[contains(@id,'taboola-mid') and not(contains(@id,'taboola-right'))]//div[contains(@class,'content-sponsored')]//div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> bodyTaboolaImgLnk;

	/*Article Body Taboola Logo in Landing*/
	@FindBy(xpath = "//div[contains(@id,'taboola-mid')]//div[contains(@class,'logoDiv link-attribution')]")
	private WebElement bodyTaboolaLogo;

	/*Subcategory Tabs Links in Landing Page */
	@FindBy(xpath = "//div[contains(@class,'newtopctgrsubnav')]/a")
	private List<WebElement> subcategoryTabsLnk;

	/*Photogallery Priority Panel Article Links in Photo Landing Page */
	@FindBy(xpath = "//div[contains(@class,'pht-tp')]//ul/li[not(contains(@class,'clone'))]/a")
	private List<WebElement> photogalleryArticleLnk;

	/*Photogallery Priority Panel Article Left Article in Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-tp')]//ul/li[not(contains(@class,'clone')) and contains(@class,'active')]/h2[contains(@class,'lft')]")
	private WebElement activePhotogalleryArticleTxt;

	/*Photo category BreadCrumb Links present in the category page*/
	@FindBy(xpath="//div[contains(@class,'brdacrum')]/a[@href]")
	private List<WebElement> photoBreadCrumbLnks;

	/*Photo Breadcrumb Text present in Category Page*/
	@FindBy(xpath="//div[contains(@class,'brdacrum')]/span[text()='फोटो']")
	private WebElement photoBreadCrumbTxt;

	/*Photo Article Next Arrow Button in Photogallery Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-tp')]/div[contains(@class,'pht-tplft')]//div[contains(@class,'arrow')]/button[@data-glide-dir='>']")
	private WebElement photoArticleRightSliderBtn;

	/*gPhoto Article Next Arrow Button in Photogallery Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'pht-tp')]/div[contains(@class,'pht-tplft')]//div[contains(@class,'arrow')]/button[@data-glide-dir='<']")
	private WebElement photoArticleLeftSliderBtn;

	/*Blogs Category Webelement */

	/*Blog Breadcrumb Text present in Category Page*/
	@FindBy(xpath="//div//div[contains(@class,'breadcrumb')]/a[not(@href)]")
	private WebElement blogBreadCrumbTxt;

	/*Blog BreadCrumb Links present in the category page*/
	@FindBy(xpath="//div//div[contains(@class,'breadcrumb')]/a[@href]")
	private List<WebElement> blogBreadCrumbLnks;


	//------------------Anupam -Webelement----------------------------------------
	/* articles present below priority panel in section page*/
	@FindBy(xpath ="//ul[contains(@class,'newctgrstorylist2')]/li/a")
	private List<WebElement> articleBelowPriorityRevAmpLnk;

	/* articles present below priority panel in video section page*/
	@FindBy(xpath ="//div[contains(@class,'pht-sld swipe')]//div[contains(@class,'blog_list_row blog_photo')]/a")
	private List<WebElement> articleBelowPriorityPhotoCategoryLnk;

	/* division present below priority panel in section page*/
	@FindBy(xpath ="//ul[contains(@class,'newctgrstorylist2')]")
	private WebElement divisionBelowPriorityRevAmpLnk;

	/* division present below priority panel in section page*/
	@FindBy(xpath ="//div[contains(@class,'pht-sld swipe')]")
	private WebElement divisionBelowPriorityPhotoCategoryLnk;

	/* pagination Next button present below in section page*/
	@FindBy(xpath ="//div[contains(@class,'newpagination')]/a[(contains(@class,'forNext'))]")
	private WebElement paginationNextRevAmpBtnLnk;

	/* pagination Div present below in section page*/
	@FindBy(xpath ="//div[contains(@class,'newpagination')]")
	private WebElement paginationDiv;

	/* pagination present below in section page*/
	@FindBy(xpath ="//div[contains(@class,'newpagination')]/a[not(contains(@class,'forNext')) and not(contains(@class,'forPrev'))]")
	private List<WebElement> paginationRevAmpLnk;

	/* pagination present below in section page*/
	@FindBy(xpath ="//div[contains(@class,'newpagination')]/a[not(contains(@class,'forNext')) and not(contains(@class,'forPrev')) and contains(@class,'active')]")
	private WebElement paginationActiveRevAmpLnk;

	/* pagination Prev button present below in section page*/
	@FindBy(xpath ="//div[contains(@class,'newpagination')]/a[(contains(@class,'forPrev'))]")
	private WebElement paginationPrevRevAmpBtnLnk;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'sideTop rhs_common_side_top')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsTopAds;

	/* Ads below priority panelin category page*/
	@FindBy(xpath = "//div[contains(@class,'newadd')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement belowPriorityPanelAds;

	/* Ads below priority panelin category page*/
	@FindBy(xpath = "//div[contains(@class,'newadd')]")
	private WebElement belowPriorityPanelAdsDiv;

	/* Total article present in blog section page*/
	@FindBy(xpath ="//div[contains(@class,'list__item--right')]")
	private List<WebElement> articlesDivBlogSection;

	/* Ads division between article in category page*/
	@FindBy(xpath = "//div[contains(@class,'middlead')]")
	private List<WebElement> betweenArticleAdsDiv;

	/* Ads division between article in category page*/
	@FindBy(xpath = "//div[contains(@class,'middlead')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement betweenArticleAds;

	/* Ads division between article in category page*/
	@FindBy(xpath = "//div[contains(@class,'middlead')]//div[contains(@class,'adBox')]")
	private List<WebElement> betweenArticlesAds;

	//lifestyle-->health
	/* health section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'health')]")
	private WebElement healthSectionLifestyleLPLnk;

	/* health section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'health')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> healthSectionArticleLifestyleLPLnk;

	/* health section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'health')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreHealthSectionLifestyleLPLnk;

	//lifestyle-->relationship
	/* relationship section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'relationships')]")
	private WebElement relationshipSectionLifestyleLPLnk;

	/* relationship section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'relationships')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> relationshipSectionArticleLifestyleLPLnk;

	/* relationship section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'relationships')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreRelationshipSectionLifestyleLPLnk;

	//lifestyle-->foods
	/* foods section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'recipe')]")
	private WebElement foodsSectionLifestyleLPLnk;

	/* foods section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'recipe')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> foodsSectionArticleLifestyleLPLnk;

	/* foods section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'recipe')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreFoodsSectionLifestyleLPLnk;

	//lifestyle--->parenting
	/* parenting section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'parenting')]")
	private WebElement parentingSectionLifestyleLPLnk;

	/* parenting section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'parenting')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> parentingSectionArticleLifestyleLPLnk;

	/* parenting section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'parenting')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreParentingSectionLifestyleLPLnk;

	//lifestyle-->fashion
	/* fashion section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'fashion')]")
	private WebElement fashionSectionLifestyleLPLnk;

	/* fashion section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'fashion')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> fashionSectionArticleLifestyleLPLnk;

	/* fashion section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'fashion')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreFashionSectionLifestyleLPLnk;

	//lifestyle-->book-review
	/* book-review section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'book-review')]")
	private WebElement bookreviewSectionLifestyleLPLnk;

	/* book-review section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'book-review')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> bookreviewSectionArticleLifestyleLPLnk;

	/* book-review section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'book-review')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreBookreviewSectionLifestyleLPLnk;

	//lifestyle-->women-special
	/* women-special section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'women-special')]")
	private WebElement womenspecialSectionLifestyleLPLnk;

	/* women-special section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'women-special')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> womenspecialSectionArticleLifestyleLPLnk;

	/* women-special section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'women-special')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreWomenspecialSectionLifestyleLPLnk;

	//lifestyle-->photogallery
	/* photogallery section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'photogallery')]")
	private WebElement photogallerySectionLifestyleLPLnk;

	/* photogallery section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'photogallery')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> photogallerySectionArticleLifestyleLPLnk;

	/* photogallery section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'photogallery')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMorePhotogallerySectionLifestyleLPLnk;

	//lifestyle-->videos
	/* women-special section present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/videos')]")
	private WebElement videosSectionLifestyleLPLnk;

	/* women-special section article present in lifestyle page*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/videos')]//ancestor::div[contains(@class,'newallstates')]/ul//a")
	private List<WebElement> videosSectionArticleLifestyleLPLnk;

	/* women-special section ReadMore present in lifestyle page at bottom*/
	@FindBy(xpath ="//div[contains(@class,'newglblhdwrap')]//a[contains(@href,'/videos')]//ancestor::div[contains(@class,'newallstates')]/div[contains(@class,'moretrndstroy')]/a")
	private WebElement readMoreVideosSectionLifestyleLPLnk;


	//============== States Category Business Logics





	//=================================Sanjeeb's Business Logics================================

	//============== Blog Category
	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verifyAuthorTextBoxPresntOnBody(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(authorheaderTextList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < authorheaderTextList.size(); i++)
		{
			webDriverActions.softScrollToElement(authorheaderTextList.get(i));
			webDriverActions.softHighlightElement(authorheaderTextList.get(i));
			webDriverActions.softMouseHover(authorheaderTextList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", authorheaderTextList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", authorheaderTextList.get(i));
			webDriverActions.softWaitForElementVisibility(authorheaderTextList.get(i), 3);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorheaderTextList.get(i)),"header Text is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(dateTimeList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(dateTimeList.get(i)),"date Time is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(authorTextBoxReadMoreList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(authorTextBoxReadMoreList.get(i)),"Read more Box is not visible for this Url "+pageUrl);
			webDriverActions.softHighlightElement(textList.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(textList.get(i)),"text list is not visible for this Url "+pageUrl);
			webDriverActions.softClick(authorList.get(i));
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
				webDriverActions.softWaitForElementVisibility(authorheaderTextList.get(i), 3);
				webDriverActions.softClickJS(authorheaderTextList.get(i));
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
			boolean status=genericUtility.manageUrl(pageUrl, currentUrl);
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
		softAssert.assertAll("Author Text Box Presnt On Body Validation Failed ");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verifyAuthorListPresntOnBody(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(authorList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < authorList.size(); i++)
		{
			webDriverActions.softScrollToElement(authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softMouseHover(authorList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", authorList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
			webDriverActions.softClick(authorList.get(i));
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
				webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
				webDriverActions.softClickJS(authorList.get(i));
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
			boolean status=genericUtility.manageUrl(pageUrl, currentUrl);
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
		softAssert.assertAll("Author List Presnt On Body Validation Failed ");
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
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verifyBodyCitySeherChune(String server,WebElement citySectionSeherChune,List<WebElement> citySectionSeherChuneEleList)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(citySectionSeherChune, 40);
		webDriverActions.softWaitForElementVisibility(citySectionSeherChune, 10);
		webDriverActions.softHighlightElement(citySectionSeherChune);
		webDriverActions.softMouseHover(citySectionSeherChune);
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(citySectionSeherChuneEleList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < citySectionSeherChuneEleList.size(); i++)
		{
			webDriverActions.softHighlightElement(citySectionSeherChuneEleList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", citySectionSeherChuneEleList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", citySectionSeherChuneEleList.get(i));
			webDriverActions.softClickJS(citySectionSeherChuneEleList.get(i));
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
				webDriverActions.continuousScrollTillElement(citySectionSeherChune, 40);
				webDriverActions.softHighlightElement(citySectionSeherChune);
				webDriverActions.softMouseHover(citySectionSeherChune);
				webDriverActions.softScrollToElement(citySectionSeherChuneEleList.get(i));
				webDriverActions.softHighlightElement(citySectionSeherChuneEleList.get(i));
				webDriverActions.softMouseHover(citySectionSeherChuneEleList.get(i));
				webDriverActions.softClickJS(authorList.get(i));
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
			boolean status=genericUtility.manageUrl(pageUrl, expected);
			softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentUrl + " and Status Code is "+response);
			softAssert.assertTrue(status, "Possibly not Navigate to same Page "+currentUrl);
			if(title.contains("_blank"))
			{
				webDriverActions.closeDriver();
				webDriverActions.waitForSecond(1000);
				webDriverActions.switchToWindow(pageTitle);
			}
			else
			{	
				webDriverActions.navigateToUrl(actualUrl);
			}
			webDriverActions.continuousScrollTillElement(citySectionSeherChune, 40);
			webDriverActions.softScrollToElement(citySectionSeherChune);
			webDriverActions.softWaitForElementVisibility(citySectionSeherChune, 10);
			webDriverActions.softHighlightElement(citySectionSeherChune);
			webDriverActions.softMouseHover(citySectionSeherChune);
		}
		softAssert.assertAll("Body City Seher Chune Validation Failed ");
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method is Used to verify Rajya Section Present on Line One section Of hindi revamp Landing Page.
	 */
	public void verifyRajyaSection()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.softScrollToElement(apnaSeherChuneBtn);
		webDriverActions.softHighlightElement(apnaSeherChuneBtn);
		webDriverActions.softClick(apnaSeherChuneBtn);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(cancelBtnSeherChuneBox), "possibly apnaseher chune block is not displayed after clicking on Body Seher section");
		softAssert.assertAll("Rajya Seher Chune Verification Failed");	
	}

	//================================  Delhi ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate Delhi City Article VAlidation.
	 */
	public void verifyBodyDelhiCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, delhiArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate Delhi City Article VAlidation.
	 */
	public void verifyBodyDelhiCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, delhiReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate Delhi City Article VAlidation.
	 */
	public void verifyBodyDelhiCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, delhiTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate Delhi City Article VAlidation.
	 */
	public void verifyBodyDelhiCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, delhiSectionSeherChune,delhiSectionSeherChuneEleList);
	}

	//================================  UttarPradesh ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate UttarPradesh City Article VAlidation.
	 */
	public void verifyBodyUttarPradeshCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, uttarPradeshArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate UttarPradesh City Article VAlidation.
	 */
	public void verifyBodyUttarPradeshCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, uttarPradeshReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate UttarPradesh City Article VAlidation.
	 */
	public void verifyBodyUttarPradeshCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, uttarPradeshTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate UttarPradesh City Article VAlidation.
	 */
	public void verifyBodyUttarPradeshCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, uttarPradeshSectionSeherChune,uttarPradeshSectionSeherChuneEleList);
	}

	//================================  bihar ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate UttarPradesh City Article VAlidation.
	 */
	public void verifyBodyBiharCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, biharArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate bihar City Article VAlidation.
	 */
	public void verifyBodyBiharCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, biharReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate bihar City Article VAlidation.
	 */
	public void verifyBodyBiharCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, biharTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate bihar City Article VAlidation.
	 */
	public void verifyBodyBiharCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, biharSectionSeherChune,biharSectionSeherChuneEleList);
	}

	//================================  madhya Pradesh ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate MadhyaPradesh City Article VAlidation.
	 */
	public void verifyBodyMadhyaPradeshCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, madhyaPradeshArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate madhyaPradesh City Article VAlidation.
	 */
	public void verifyBodyMadhyaPradeshCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, madhyaPradeshReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate madhyaPradesh City Article VAlidation.
	 */
	public void verifyBodyMadhyaPradeshCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, madhyaPradeshTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate madhyaPradesh City Article VAlidation.
	 */
	public void verifyBodyMadhyaPradeshCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, madhyaPradeshSectionSeherChune,madhyaPradeshSectionSeherChuneEleList);
	}

	//================================  rajasthan ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate rajasthan City Article VAlidation.
	 */
	public void verifyBodyRajasthanCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, rajasthanArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validrajasthandesh City Article VAlidation.
	 */
	public void verifyBodyRajasthanCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, rajasthanReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate rajasthan City Article VAlidation.
	 */
	public void verifyBodyRajasthanCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, rajasthanTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate rajasthan City Article VAlidation.
	 */
	public void verifyBodyRajasthanCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, rajasthanSectionSeherChune,rajasthanSectionSeherChuneEleList);
	}

	//================================  uttarakhand ==========================
	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate Uttarakhand City Article VAlidation.
	 */
	public void verifyBodyUttarakhandCityArticleNavigation(String server)
	{
		verifyArticleNavigation(server, uttarakhandArticleList);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate uttarakhand City Article VAlidation.
	 */
	public void verifyBodyUttarakhandCityReadMoreNavigation(String server)
	{
		verifyMoreNewsNavigation(server, uttarakhandReadMoreLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate uttarakhand City Article VAlidation.
	 */
	public void verifyBodyUttarakhandCityTitleNavigation(String server)
	{
		verifyTitleNavigation(server, uttarakhandTitleLnk);
	}

	/**
	 * @author SanjeebKumarPati
	 * This Method use to validate uttarakhand City Article VAlidation.
	 */
	public void verifyBodyUttarakhandCitySeherChuneNavigation(String server)
	{
		verifyBodyCitySeherChune(server, uttarakhandSectionSeherChune,uttarakhandSectionSeherChuneEleList);
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

	/*--------------------Vipin's Business Logic (Category Page ) -------------------------*/

	/**
	 * @author VipinKumarGawande 
	 * @param serverType
	 *  This method is used to Validate the Breadcrumb Navigation For 
	 */
	public void verifyBreadCrumbNavigation(String serverType  , List<WebElement> articleBreadCrumb)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		softAssert.assertTrue(articleBreadCrumb.size()>0, "Possibly Breadcrumb is Not Visible in "+expectedUrl);
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
		webDriverActions.waitForPageToLoad();
		softAssert.assertAll("Issues found in Category Page Body ");
	}

	public void verifyCategoryNameNavigation(String serverType,List<WebElement> latestNewsCategoryNameLnk)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		Assert.assertTrue(latestNewsCategoryNameLnk.size()>0, "Possibly Priority Panel Category Names Links is Not Visible in "+expectedUrl);
		for(int i=0;i<latestNewsCategoryNameLnk.size();i++)
		{
			webDriverActions.softMouseHover(latestNewsCategoryNameLnk.get(i));
			webDriverActions.softScrollToElement(latestNewsCategoryNameLnk.get(i));
			webDriverActions.softHighlightElement(latestNewsCategoryNameLnk.get(i));
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(latestNewsCategoryNameLnk.get(i)), "Possibly Category Name is Not Visible in "+expectedUrl);
		}
		softAssert.assertAll("Issue Found in Landing Page Body");
	}

	/**
	 * @param serverType
	 * @param headerText
	 * @author VipinKumarGawande
	 * This method is used to verify the breadcrumb and header text from Category page.
	 * @param serverType
	 */
	public void verifyBreadcrumbAndHeaderTextValidation(String serverType, WebElement breadcrumbText , WebElement headerText  )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.softHighlightElement(breadcrumbText);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumbText, 1) , "Unable to Display Breadcrumb Text in "+currentPageUrl);
		webDriverActions.softHighlightElement(headerText);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(headerText, 1) , "Unable to Display Header Text in "+currentPageUrl);
		softAssert.assertAll("Issue Found in Landing Page Body ");
	}

	public void verifyArticleTaboolaNavigation(String serverType ,List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImglement, WebElement taboolaLogo)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(taboolaLogo, 7);
		webDriverActions.softMouseHover(taboolaLogo);
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
		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in Landing Page Body");
	}

	public void verifySubCategoryTabsNavigation(String serverType )
	{
		verifyArticleNavigation(serverType, subcategoryTabsLnk);
	}


	//========================== LatestNews ( CATEGORY PAGE ) ====================================//

	public void verifyLatestNewsPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyLatestNewsReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyLatestNewsBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyLatestNewsBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyLatestnewsRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyLatestNewsTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyLatestNewsCategoryNameNavigation(String serverType)
	{
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyLatestNewsBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Auto LP------------------//

	public void verifyAutoCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyAutoPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyAutoReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyAutoBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyAutoBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyAutoRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyAutoTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	} 

	//----------------Category Photo LP------------------//

	public void verifyPhotoPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,photogalleryArticleLnk );
	}

	public void verifyPhotoBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, photoBreadCrumbLnks);
	}

	public void verifyPhotoBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, photoBreadCrumbTxt, photoBreadCrumbTxt);
	}

	public void verifyPhotoPriorityPanelArrowButtonNavigation()
	{
		SoftAssert softAssert =new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String currentPageUrl =webDriverActions.getCurrentPageUrl();
		webDriverActions.continuousScrollTillAllElement(photogalleryArticleLnk, 20);
		webDriverActions.waitForSecond(1000);
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(photoArticleRightSliderBtn), "Possibly Photogallery Article Right Arrow Button is Not Visible in "+currentPageUrl);
		for(int i=0; i<photogalleryArticleLnk.size() ;i++)
		{
			String beforeClick = webDriverActions.getTextFromElement(activePhotogalleryArticleTxt);
			webDriverActions.softClickJS(photoArticleRightSliderBtn);
			webDriverActions.waitForSecond(500);
			String afterClick = webDriverActions.getTextFromElement(activePhotogalleryArticleTxt);
			softAssert.assertNotEquals(beforeClick, afterClick , "Possibly Right Slider Is Not Working or Article is Duplicate in "+currentPageUrl);
		}
		Assert.assertTrue(webDriverActions.softIsElementDisplayed(photoArticleLeftSliderBtn), "Possibly Photogallery Article Left Arrow Button is Not Visible in "+currentPageUrl);
		for(int i=0; i<photogalleryArticleLnk.size() ;i++)
		{
			String beforeClick = webDriverActions.getTextFromElement(activePhotogalleryArticleTxt);
			webDriverActions.softClickJS(photoArticleRightSliderBtn);
			webDriverActions.waitForSecond(500);
			String afterClick = webDriverActions.getTextFromElement(activePhotogalleryArticleTxt);
			softAssert.assertNotEquals(beforeClick, afterClick , "Possibly Right Slider Is Not Working or Article is Duplicate in "+currentPageUrl);
		}
		softAssert.assertAll("Issues Found in Landing Page Body");
	}

	public void verifyPhotoSubCategoryTabsNavigation(String serverType)
	{
		verifyArticleNavigation(serverType, subcategoryTabsLnk);
	}


	//----------------Category Dharm LP------------------//

	public void verifyDharmCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyDharmPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyDharmReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyDharmBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyDharmBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyDharmRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyDharmTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	} 

	public void verifyDharmBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}


	//----------------Category Career LP------------------//

	public void verifyCareerCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyCareerPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyCareerReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyCareerBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyCareerBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyCareerRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCareerTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCareerBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Sahitya LP------------------//

	public void verifySahityaCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifySahityaPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifySahityaReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifySahityaBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifySahityaBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifySahityaRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifySahityaTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifySahityaBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Blog LP------------------//

	public void verifyBlogsBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, blogBreadCrumbLnks);
	}

	public void verifyBlogsBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, blogBreadCrumbTxt, blogBreadCrumbTxt);
	}

	public void verifyBlogRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	//=================================Sanjeeb's Business Logics================================



	/**
	 * @author SanjeebKumarPati
	 * This method is used to verify author list present on body part of Blog Secton.
	 */
	public void verfyAuthorListPresntOnBody(String server)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String actualUrl =webDriverActions.getCurrentPageUrl();
		String pageTitle = webDriverActions.getPageTitle();
		//Validating the Line one section Except Search Button
		softAssert.assertTrue(authorList.size()>0,"Unable To Display the Element"+ webDriverActions.getCurrentPageUrl());
		for (int i = 0; i < authorList.size(); i++)
		{
			webDriverActions.softScrollToElement(authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softMouseHover(authorList.get(i));
			String pageUrl = webDriverActions.getAttribute("href", authorList.get(i));
			Logs.info(getClass(), pageUrl);
			String title = webDriverActions.getAttribute("target", authorList.get(i));
			webDriverActions.softHighlightElement(authorList.get(i));
			webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
			webDriverActions.softClick(authorList.get(i));
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
				webDriverActions.softWaitForElementVisibility(authorList.get(i), 3);
				webDriverActions.softClickJS(authorList.get(i));
			}
			webDriverActions.waitForPageToLoad();
			//			String expected = webDriverActions.getCurrentPageUrl();	
			//			if(server.contains("preProd") && !expected.contains("//beta"))
			//			{
			//				String betaUrl = genericUtility.replaceInUrl(expected);
			//				expected=betaUrl;
			//				webDriverActions.navigateToUrl(expected);
			//			}
			String currentUrl = webDriverActions.getCurrentPageUrl();
			int response = genericUtility.checkLinks(currentUrl);
			boolean status=genericUtility.manageUrl(pageUrl, currentUrl);
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
		softAssert.assertAll("Author List Presnt On Body Validation Failed ");
	}
	//----------------Category Jobs LP------------------//

	public void verifyJobsCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyJobsPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyJobsReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyJobsBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyJobsBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyJobsRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyJobsTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyJobsBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category LifeStyle LP------------------//

	public void verifyLifeStyleCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyLifeStylePriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyLifeStyleReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyLifeStyleBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyLifeStyleBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyLifeStyleRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyLifeStyleTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//----------------Category World LP------------------//

	public void verifyWorldCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyWorldPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyWorldReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyWorldBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyWorldBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyWorldRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyWorldTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//----------------Category Crime LP------------------//

	public void verifyCrimeCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyCrimePriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyCrimeReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyCrimeBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyCrimeBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyCrimeRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyCrimeTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCrimeBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Tech LP------------------//

	public void verifyTechCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyTechPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyTechReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyTechBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyTechBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyTechRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyTechTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//----------------Category Nation LP------------------//

	public void verifyNationCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyNationPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyNationReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyNationBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyNationBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyNationRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyNationTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyNationBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Entertainment LP------------------//

	public void verifyEntertainmentCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyEntertainmentPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyEntertainmentReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyEntertainmentBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyEntertainmentBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyEntertainmentRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyEntertainmentTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//----------------Category Knowledge LP------------------//

	public void verifyKnowledgeCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyKnowledgePriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyKnowledgeReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyKnowledgeBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyKnowledgeBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyKnowledgeRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyKnowledgeTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyKnowledgeBodyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,bodyTaboolaArticleLst ,bodyTaboolaImgLnk, bodyTaboolaLogo);
	}

	//----------------Category Money LP------------------//

	public void verifyMoneyCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyMoneyPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyMoneyReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyMoneyBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyMoneyBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyMoneyRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyMoneyTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	//----------------Category States LP------------------//

	public void verifyStatesCategoryNameNavigation(String serverType) {
		verifyCategoryNameNavigation(serverType, latestNewsCategoryNameLnk);
	}

	public void verifyStatesPriorityPanelArticleNavigation(String serverType)
	{
		verifyArticleNavigation(serverType,commonsCategoryArticleLnk );
	}

	public void verifyStatesReadMoreNewsNavigation(String serverType)
	{
		verifyMoreNewsNavigation(serverType, latestNewsReadMoreLnk);
	}

	public void verifyStatesBreadCrumbNavigation(String serverType)
	{
		verifyBreadCrumbNavigation(serverType, breadCrumbLnks);
	}

	public void verifyStatesBreadcrumbAndHeaderTextValidation(String serverType)
	{
		verifyBreadcrumbAndHeaderTextValidation(serverType, breadCrumbTxt, headerTxt);
	}

	public void verifyStatesRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyStatesTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyPhototRhsTaboolaFeedsValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	public void verifyPhotoTaboolaFeedValidation(String serverType) {
		verifyArticleTaboolaNavigation(serverType,taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}


	//-------------------------Anupam Business Logic--------------------
	public void verifyArticlesNavigation(String serverType,WebElement section ,List<WebElement> artList)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(500);
		webDriverActions.scrollToPoint(0, 0);
		String categoryPage = webDriverActions.getCurrentPageUrl();
		String categoryPageTitle = webDriverActions.getPageTitle();
		webDriverActions.continuousScrollTillElement(section, 4);
		webDriverActions.softScrollToElement(section);
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			webDriverActions.softHighlightElement(artList.get(i));
			webDriverActions.mouseHover(artList.get(i));

			String actualCP =	webDriverActions.getAttribute("href", artList.get(i));
			String target = webDriverActions.getAttribute("target", artList.get(i));
			Logs.info(getClass(), actualCP);
			webDriverActions.softClickJS(artList.get(i));

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

			webDriverActions.waitForSecond(500);

			int responseCP = genericUtility.checkLinks(currentCPPage);
			softAssert.assertTrue(responseCP==200," Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
			if (responseCP==200) {
				boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
				softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
			}
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(categoryPageTitle);
			webDriverActions.waitForSecond(1000);
			break;
			default:currentCPPage = webDriverActions.getCurrentPageUrl();
			expectedCP = webDriverActions.getCurrentPageUrl();
			if (serverType.equalsIgnoreCase("preprod")) {
				String betaUrl = genericUtility.replaceInUrl(currentCPPage);
				webDriverActions.navigateToUrl(betaUrl);
				currentCPPage = betaUrl;
			}
			webDriverActions.waitForSecond(500);

			responseCP = genericUtility.checkLinks(currentCPPage);
			softAssert.assertTrue(responseCP==200," Status Code is "+responseCP+" Possibly Url is Invalid "+currentCPPage);
			if (responseCP==200) {
				boolean statusCP=genericUtility.compareUrlSub(actualCP, expectedCP);
				softAssert.assertTrue(statusCP, " Possibly not Navigate to same Page "+" ---Actual--- "+actualCP+" ---Expected--- "+expectedCP+" ---CurrentPage--- "+currentCPPage);
			}
			webDriverActions.navigateToUrl(categoryPage);
			}
		}
		softAssert.assertAll("Issue Found in HomePage Body or RHS Article Navigation");	
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside category landing page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyCategoryRHSAdsValidation(WebElement rhstopads) {
		SoftAssert softAssert = new SoftAssert();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(rhstopads,10) , "Possibly RHS top Ads is not present "+"\t"+currentPageUrl);
		softAssert.assertAll("Issue Found in Article Body");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPanel present inside category landing page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyCategoryBelowPriorityPanelAdsValidation(WebElement belowPriorityPanelAds,WebElement adsDiv,WebElement section ) {
		SoftAssert softAssert = new SoftAssert();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(section);
		webDriverActions.softMouseHover(adsDiv);
		webDriverActions.waitForSecond(1000);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(belowPriorityPanelAds,10) , "Possibly Ads is not present Below priority panel "+"\t"+currentPageUrl);
		softAssert.assertAll("Issue Found in category page Body");
	}

	public void verifyCategoryNextArrowPaginationValidation(WebElement paginationDiv,WebElement nextArrow) {
		SoftAssert softAssert = new SoftAssert();
		String actualPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(paginationDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(paginationDiv,3),"Possibly Pagination Division is not present in "+ actualPageUrl);
		if(webDriverActions.softIsElementDisplayed(paginationDiv,1)) {
			webDriverActions.softClick(nextArrow);
			webDriverActions.waitForPageToLoad();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue((currentPageUrl.contains(actualPageUrl) && !currentPageUrl.equalsIgnoreCase(actualPageUrl)), "Possibly next button is not working" + actualPageUrl);
		}
		softAssert.assertAll("Issue Found in category page Body");
	}

	public void verifyCategoryPrevArrowPaginationValidation(WebElement paginationDiv,WebElement nextArrow,WebElement prevArrow) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(paginationDiv);
		webDriverActions.softClick(nextArrow);
		webDriverActions.waitForPageToLoad();
		String actualPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(paginationDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(paginationDiv,3),"Possibly Pagination Division is not present in "+ actualPageUrl);
		if(webDriverActions.softIsElementDisplayed(paginationDiv,1)) {
			webDriverActions.softClick(prevArrow);
			webDriverActions.waitForPageToLoad();
			String currentPageUrl = webDriverActions.getCurrentPageUrl();
			softAssert.assertTrue((actualPageUrl.contains(currentPageUrl) && !currentPageUrl.equalsIgnoreCase(actualPageUrl)), "Possibly Prev button is not working " + actualPageUrl);
		}
		softAssert.assertAll("Issue Found in category page Body");
	}

	public void verifyCategoryPaginationBtnValidation(WebElement paginationDiv, List<WebElement> paginationLnks,WebElement nextArrow) {
		SoftAssert softAssert = new SoftAssert();
		int count=1;
		int last;
		int responseCP;
		String actualPageUrl = webDriverActions.getCurrentPageUrl();
		String categoryPageUrl = webDriverActions.getCurrentPageUrl();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		webDriverActions.softMouseHover(paginationDiv);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(paginationDiv,3),"Possibly Pagination Division is not present in "+ categoryPageUrl);
		if(webDriverActions.softIsElementDisplayed(paginationDiv,1)) {
			last=paginationLnks.size();
			softAssert.assertTrue(paginationLnks.size()>0,"Possibly Pagination Links are not present in "+ categoryPageUrl);
			for(int i=1; i<paginationLnks.size() ;i++)
			{
				actualPageUrl = webDriverActions.getCurrentPageUrl();
				webDriverActions.softClickJS(paginationLnks.get(i));
				count++;
				currentPageUrl = webDriverActions.getCurrentPageUrl();
				responseCP = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(responseCP==200," Status Code is "+responseCP+" Possibly Url is Invalid "+currentPageUrl);
				softAssert.assertTrue((currentPageUrl.contains(categoryPageUrl) && currentPageUrl.contains("page-"+count)), "Possibly not navigated to page-"+count+"\t" + actualPageUrl);
				webDriverActions.waitForPageToLoad();
				webDriverActions.scrollDown();
				webDriverActions.softMouseHover(paginationDiv);
				if(count==last){
					i=(paginationLnks.size()+1)/2;
					while(webDriverActions.softIsElementDisplayed(nextArrow,2) && paginationLnks.size()>0 ){
						actualPageUrl = webDriverActions.getCurrentPageUrl();
						webDriverActions.softClickJS(paginationLnks.get(i));
						count++;
						currentPageUrl = webDriverActions.getCurrentPageUrl();
						responseCP = genericUtility.checkLinks(currentPageUrl);
						softAssert.assertTrue(responseCP==200," Status Code is "+responseCP+" Possibly Url is Invalid "+currentPageUrl);
						softAssert.assertTrue((currentPageUrl.contains(categoryPageUrl) && currentPageUrl.contains("page-"+count)), "Possibly not navigated to page-"+count+"\t"  + actualPageUrl);
						webDriverActions.waitForPageToLoad();
						webDriverActions.scrollDown();
						webDriverActions.softMouseHover(paginationDiv);
					}
				}
			}
		}
		softAssert.assertTrue(count<=30,"Possibly pagination exceeds 30 Links  "+ count+" Links present");
		softAssert.assertAll("Issue Found in category page Body");
	}

	//blog

	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPanel present inside category landing page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyBetweenArticleAdsValidation(List<WebElement> betweenArticleAds,List<WebElement> betweenArticleAdsDiv,List<WebElement> articlesDivBlogSection ) {
		SoftAssert softAssert = new SoftAssert();
		String currentPageUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForElement(1000);
		for(int i=0; i<betweenArticleAdsDiv.size() ;i++) {
			webDriverActions.scrollDown();
			webDriverActions.softMouseHover(betweenArticleAdsDiv.get(i));
			String id=webDriverActions.getAttribute("data-google-query-id", betweenArticleAds.get(i));
			if(id==null) {
				webDriverActions.waitForSecond(2000);
				id=webDriverActions.getAttribute("data-google-query-id", betweenArticleAds.get(i));
			}if(id==null) {
				webDriverActions.waitForSecond(3000);
				id=webDriverActions.getAttribute("data-google-query-id", betweenArticleAds.get(i));
			}if(id==null) {
				webDriverActions.waitForSecond(4000);
				id=webDriverActions.getAttribute("data-google-query-id", betweenArticleAds.get(i));
			}
			System.out.println(id);
			softAssert.assertNotEquals(id, null ,"Possibly Ads is not present After 9 sec at "+(i+1)+"\t"+currentPageUrl);
			softAssert.assertNotEquals(id, "" ,"Possibly Ads is not present After 9 sec at "+(i+1)+"\t"+currentPageUrl);

		}
		softAssert.assertAll("Issue Found in category page Body");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,WebElement moreLnk) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToPoint(0, 0);

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
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		//		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ " in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body or RHS More Link");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,WebElement section) 
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		String homePage=webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(1000);
		webDriverActions.scrollToPoint(0, 0);
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
		softAssert.assertTrue(response==200 , "Possibly Url is Invalid "+currentPage+" status code"+response);
		//		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+" in "+currentPage);
		webDriverActions.waitForSecond(100);
		webDriverActions.navigateBack();

		softAssert.assertAll("Issue Found in HomePage Body or RHS Section Link");
	}


	//Auto

	public void verifyAutoCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyAutoArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyAutoCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyAutoPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyAutoPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyAutoPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//Blog

	public void verifyBlogBetweenArticleAdsValidation() {
		verifyBetweenArticleAdsValidation(betweenArticlesAds, betweenArticleAdsDiv, articlesDivBlogSection);
	}

	public void verifyBlogCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyBlogPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyBlogPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}


	public void verifyBlogPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//Career

	public void verifyCareerCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyCareerArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyCareerCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyCareerPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyCareerPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyCareerPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//Crime

	public void verifyCrimeCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyCrimeArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyCrimeCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyCrimePaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyCrimePaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyCrimePaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//Dharm

	public void verifyDharmCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyDharmArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyDharmCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyDharmPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyDharmPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyDharmPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//Entertainment

	public void verifyEntertainmentCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyEntertainmentArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyEntertainmentCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyEntertainmentPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyEntertainmentPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyEntertainmentPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//jobs

	public void verifyJobsCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyJobsArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyJobsCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyJobsPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyJobsPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyJobsPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//Knowledge

	public void verifyKnowledgeCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyKnowledgeArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyKnowledgeCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyKnowledgePaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyKnowledgePaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyKnowledgePaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//Latest
	public void verifyLatestNewsCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyLatestNewsArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyLatestNewsCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyLatestNewsPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyLatestNewsPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyLatestNewsPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//lifestyle


	public void verifyLifestyleCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyLifestyleCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyLifestylePaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyLifestylePaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyLifestylePaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//lifestyle-->health
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of lifestyle-->health Widget
	 */
	public void verifyHealthSectionLifestyleLPWidget(String serverType) {
		verifySectionLnks(serverType,healthSectionLifestyleLPLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of lifestyle-->health Widget Article
	 */
	public void verifyHealthSectionLifestyleLPArticle(String serverType) {
		verifyArticlesNavigation(serverType,healthSectionLifestyleLPLnk,healthSectionArticleLifestyleLPLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More lifestyle-->health News
	 */
	public void verifyMoreHealthSectionLifestyleLPLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreHealthSectionLifestyleLPLnk);
	}


	//lifestyle-->Relationship

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of lifestyle-->Relationship Widget
	 */
	public void verifyHealthSectionRelationshipLPWidget(String serverType) {
		verifySectionLnks(serverType,healthSectionLifestyleLPLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of lifestyle-->Relationship Widget Article
	 */
	public void verifyHealthSectionRelationshipLPArticle(String serverType) {
		verifyArticlesNavigation(serverType,healthSectionLifestyleLPLnk,healthSectionArticleLifestyleLPLnk);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More lifestyle-->Relationship News
	 */
	public void verifyMoreHealthSectionRelationshipLPLnk(String serverType) {
		verifyMoreLnks(serverType,readMoreHealthSectionLifestyleLPLnk);
	}


	//Money

	public void verifyMoneyCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyMoneyArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyMoneyCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyMoneyPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyMoneyPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyMoneyPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//Nation

	public void verifyNationCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyNationArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyNationCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyNationPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyNationPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyNationPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//photo

	public void verifyPhotoArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityPhotoCategoryLnk ,articleBelowPriorityPhotoCategoryLnk);
	}

	public void verifyPhotoPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyPhotoPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyPhotoPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}

	//Literature

	public void verifyLiteratureCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyLiteratureArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyLiteratureCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyLiteraturePaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyLiteraturePaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyLiteraturePaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


	//Tech

	public void verifyTechCategoryRHSAdsValidation()
	{
		verifyCategoryRHSAdsValidation(rhsTopAds);
	}

	public void verifyTechArticleBelowPriorityNavigation(String serverType)
	{
		verifyArticlesNavigation(serverType, divisionBelowPriorityRevAmpLnk ,articleBelowPriorityRevAmpLnk);
	}

	public void verifyTechCategoryBelowPriorityPanelAdsValidation()
	{
		verifyCategoryBelowPriorityPanelAdsValidation(belowPriorityPanelAds,belowPriorityPanelAdsDiv,divisionBelowPriorityRevAmpLnk);
	}

	public void verifyTechPaginationNextArrowValidation()
	{
		verifyCategoryNextArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk);
	}

	public void verifyTechPaginationPrevArrowValidation()
	{
		verifyCategoryPrevArrowPaginationValidation(paginationDiv,paginationNextRevAmpBtnLnk,paginationPrevRevAmpBtnLnk);
	}

	public void verifyTechPaginationBtnValidation()
	{
		verifyCategoryPaginationBtnValidation(paginationDiv,paginationRevAmpLnk,paginationNextRevAmpBtnLnk);
	}


}
