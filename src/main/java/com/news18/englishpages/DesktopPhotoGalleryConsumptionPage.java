package com.news18.englishpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Anupam Gupta
 * This class contains WebElements and BusinessLogic of Desktop Photo Gallery Consumption Page 
 */

public class DesktopPhotoGalleryConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public WebDriver driver;
	public DesktopPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*common Element*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates')) and not(contains(@href,'livenews'))]")
	private List<WebElement> commonArticleLnks;

	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//child::div[contains(@class,'img_wrp')]//a")
	private List<WebElement> commonsPhotoCategoryArticleLnk;

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//parent::a")
	private WebElement trendingNewsTitle;

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul//li//a")
	private List<WebElement> trendingNewsArticles;

	/*Trending News Widget Read More Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'TRENDING')]//ancestor::div[contains(@class,'news')]//ul/a")
	private WebElement trendingNewsReadMore;

	/*Trending News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]/a")
	private WebElement photogalleryTitle; 

	/*Trending News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'Photogallery')]//ancestor::div[contains(@class,'photogellary_widget')]//following-sibling::ul//li//img//parent::a")
	private List<WebElement> photogalleryArticles;

	/*More News Widget Title Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'More News')]")
	private WebElement moreNewsTitle;

	/*More News Widget Articles Present in RHS*/
	@FindBy(xpath="//div//h2//span[contains(text(),'More News')]//parent::h2//following-sibling::ul//li//div//a")
	private List<WebElement> moreNewsArticles;

	@FindBy(xpath="//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> photogalleryArticlesLnk;

	/*Bid Ad Present in RHS Ad block*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//preceding-sibling::div[contains(@style,'600px')]")
	private WebElement rhsBigAdBlock;

	/*Bid Ad Present in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//preceding-sibling::div[contains(@style,'600px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsBigAd;

	/*Ad Present after MoreNews in RHS Ad block*/
	@FindBy(xpath="//div//span[contains(text(),'More News')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//child::div[contains(@class,'ad-d')]")
	private WebElement rhsMoreNewsDownAdBlock;

	/*Ad Present after MoreNews in RHS*/
	@FindBy(xpath="//div//span[contains(text(),'Photogallery')]//ancestor::div//following-sibling::div[contains(@style,'250px')]//iframe[(@aria-label='Advertisement')]")
	private WebElement rhsMoreNewsDownAd;

	/* Desktop_PhotoGalleryConsumption_Page List ofphotoGalleryFirstArticle*/
	@FindBy(xpath = "//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h3/a[not(text()='Cricketnext')]")
	private List<WebElement> photoGalleryFirstArticle;

	/* Desktop_PhotoGalleryConsumption_Page List of breadCrumLnk*/
	@FindBy(xpath = "//div[contains(@class,'bre')]//a//span")
	private List<WebElement> breadCrumLnk;

	/* Desktop_PhotoGalleryConsumption_Page fbShareIcon */
	@FindBy(xpath = "//div[contains(@class,'jsx-949867167 pht')]//a)[1]")
	private WebElement fbShareIcon;

	/* Desktop_PhotoGalleryConsumption_Page twitterIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[3]")
	private WebElement twitterIcon;

	/* Desktop_PhotoGalleryConsumption_Page whatsappIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[4]")
	private WebElement whatsappIcon;

	/* Desktop_PhotoGalleryConsumption_Page topGalleries */
	@FindBy(xpath =	"//h2[contains(@class,'photo')]")
	private WebElement topGalleries;

	/* Desktop_PhotoGalleryConsumption_Page List of rhsTopGalleriesList*/
	@FindBy(xpath = "//div[contains(@class,'jsx-1945834281 photogellary_widget')]//ul//li")
	private List<WebElement> rhsTopGalleriesList;

	/* Desktop_PhotoGalleryConsumption_Page List of htmlTag in browser source code page */
	@FindBy(xpath = "//span[@class='html-tag']")
	private List<WebElement> htmlTag;

	/* Desktop_PhotoGalleryConsumption_Page titleTag in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<title')]")
	private WebElement tileTag;

	/* Desktop_PhotoGalleryConsumption_Page titleText in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<titl')]/parent::td")
	private WebElement tileText;

	/* Desktop_PhotoGalleryConsumption_Page List of keywordsTag in browser source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywordsTag;

	/* Desktop_PhotoGalleryConsumption_Page ogImage in browser source code page  */
	@FindBy(xpath =	"//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private WebElement ogImage;	

	/* Desktop_PhotoGalleryConsumption_Page ampHtmlTag in browser source code page */
	@FindBy(xpath =	"//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlTag;

	/* Desktop_PhotoGalleryConsumption_Page List of outbrain*/
	@FindBy(xpath = "//a[normalize-space()='Recommended by']")
	private List<WebElement> outbrain;

	/* List of All social Icons present in PhotoGallery Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')]/ul")
	private List<WebElement> allSocialIcons;

	/* List of All social Icons like 1= fb 2 = getpocket 3 = twitter 4 = whatsapp*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')][1]/ul/li/a")
	private List<WebElement> socialIconsLnk;

	/*Outbrain Txt  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private WebElement outbrainTxt;

	/* List of Images present in photo page */
	@FindBy(xpath="//div[contains(@class,'heading_title')]/following-sibling::ul/li//img")
	private List<WebElement> listImg;

	/*List of down arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_bottom')]")
	private List<WebElement> downArrowLnk;

	/*List of Up arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_top')]")
	private List<WebElement> upArrowLnk;

	/* Article in photogallery page*/
	@FindBy(xpath = "//div//ul[contains(@class,'photoGalleryList')]//li//h3//a[contains(@href,'photo')]")
	private List<WebElement> articleLnks;

	/* First old Article in photogallery page*/
	@FindBy(xpath = "(//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'content_wrp')]//a[not(contains(@href,'photonews')) and not(contains(@href,'/cricketnext/'))])[1]")
	private WebElement oldArticleLnks;

	/* List of Promoted Content Ads in RHS of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]/div//ul/li/a/span[contains(@class,'text')]")
	private List<WebElement> promotedContentRHSLnk;

	/* List of Promoted Content Ads in body of PhotoGallery Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'OUTBRAIN')]//div[contains(@class,'items-container')]/div/a/section")
	private List<WebElement> promotedContentBodyLnk;

	/*Outbrain Logo Links in body of PhotoGallery Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'grid-layout')]/div/div/a/span[contains(@class,'logo')]" )
	private WebElement outbrainLogoLnkBody;

	/*Outbrain Logo Links in RHS of PhotoGallery Consumption Page*/
	@FindBy(xpath ="(//div[contains(@class,'ob_what')])[2]/a/span" )
	private WebElement outbrainLogoLnkRHS;

	/*Desktop_LiveBlogPage Social share Links*/
	@FindBy(xpath = "(//div[contains(@class,'pht-artcl-shr2')])[1]/a")
	private List<WebElement> socialShareIconsLnks;

	/*All share icons division*/
	@FindBy(xpath = "(//div[contains(@class,'pht-artcl-shr2')])[1]")
	private WebElement allShareIcons;

	//---------------Cricket Category-----------//

	/*Photogallery Article Links Present in HomePage*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> photogalleryCricketArticleLnk;

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw_wrp')]//div[contains(@class,'content')]//a[contains(@href,'photogallery')]")
	private List<WebElement> photoSectionArticleLnk;

	/* Article BreadCrumb Links in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'bredcrum')]//a")
	private List<WebElement> articleBreadcrumbLnk;

	/*News 18 Agency Text after Navigating to Agency Link */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h2")
	private WebElement news18AgencyTxt;

	/* Common Section Photogallery Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/')]")
	private List<WebElement> commonPhotogalleryArticleLnk;

	/*Photogallery_Article Header Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'photo_gallery_top')]/h1")
	private WebElement articlePhotogalleryHeaderTxt;

	/*Photogallery_Article Excerpt Text in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'photo_gallery_top')]/h2")
	private WebElement articlePhotogalleryExcerptTxt;

	/*Photogallery_Article Contents LAST UPDATED Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'share_span')]//p[contains(.,'Last')]")
	private WebElement articlePhotogalleryLastUpdatedTxt;

	/*Photogallery_Article Contents LAST UPDATED Time Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'share_span')]//p[contains(.,'Last')]/span")
	private WebElement articlePhotogalleryLastUpdatedTimeTxt;

	/*Photogallery_Article Contents Location_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'share_span')]//p/span[contains(@id,'location')]")
	private WebElement articlePhotogalleryLocationTxt;

	/*Photogallery_Article Contents Caption_Text in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'photo_gallery_top')]//h1/parent::div/following-sibling::div[not(contains(@class,'test'))]//p")
	private WebElement articlePhotogalleryCaptionTxt;

	/*Photogallery_Article Agency Link in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'share_span')]//span[contains(@class,'postby')]/a")
	private WebElement articlePhotogalleryAgencyLnk;

	/*Photogallery_Article Image Description in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'glrbox')]//p")
	private List<WebElement> photogalleryImageDescriptionTxt;

	/* Top Photogallery Article Story Social Share Icon Link in Photo Article Page */
	@FindBy(xpath = "//div[contains(@class,'photo_gallery_top')]/div[contains(@class,'share')]/div[contains(@class,'artcl-shr')]/a")
	private List<WebElement> topPhotoGallerySocialShareLnk;

	/* Photogallery Article Image Widget Social Share Icon Links in Photo Article Page */
	@FindBy(xpath = "(//div[contains(@id,'photo')])[1]//div[contains(@class,'pht-artcl-shr2')]/a")
	private List<WebElement> photoImageSocialShareLnk;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleLst;

	/*Promoted Content image is present inside Promoted Content Section in Homepage*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> rhsTaboolaArticleLnk;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> rhsTaboolaImgLnk;

	/*RHS Taboola Logo in Article Consumption Page*/
	@FindBy(xpath = "//div[contains(@id,'taboola-right')]//div[contains(@class,'link-attribution')]")
	private WebElement rhsTaboolaLogo;

	/*Article Body Taboola Logo in Article Consumption Page */
	@FindBy(xpath = "//div[contains(@id,'taboola-below')]//div[contains(@class,'header-logo')]")
	private WebElement articleBodyTaboolaLogo;


	//====================================PhotoGallery=======================================
	/* Photo article count in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'photgallery_left')]//div[contains(@class,'glrbox test')]//div[contains(@class,'phtcount')]/span")
	private List<WebElement> photoArticleCount;

	/* Photo article div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'photgallery_left')]//div[contains(@class,'glrbox test')]")
	private List<WebElement> photoArticleDiv;

	/* Photo Section Article Link in Line one and Line Two Landing Page*/
	@FindBy(xpath = "//div[contains(@class,'top_phgw')]//div[contains(@class,'img_wrp')]//a[(contains(@href,'/photogallery/')) and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> photoArticleLnks;

	/* RHS top ads present in Article page*/
	@FindBy(xpath = "//div[contains(@class,'photogellary_widget')]/preceding-sibling::div//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private WebElement rhsPhotoTopAds;

	/* Common Photo Article Element in Article page*/
	@FindBy(xpath = "//div[contains(@class,'top_story')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> commonPhotoArticleEle;

	/* Cricket Photo Article Element in Article page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'/photogallery/') and not(contains(@href,'/videos/')) and not(contains(@href,'live-news-updates')) and not(contains(@href,'live-updates'))]")
	private List<WebElement> cricketPhotoArticleEle;

	/* Photo article  Ads div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'photgallery_left')]//div[contains(@class,'dfp-ad')]")
	private List<WebElement> photoArticleAdsDiv;

	/* Photo article  Ads div in photogallery article Page*/
	@FindBy(xpath = "//div[contains(@class,'photgallery_left')]//div[contains(@class,'dfp-ad')]//iframe[(@aria-label='Advertisement') and (not(@width<'2'))]")
	private List<WebElement> photoArticleAds;

	public List<WebElement> getSocialShareIconsLnks() {
		return socialShareIconsLnks;
	}

	public WebElement getAllShareIcons() {
		return allShareIcons;
	}

	/**
	 * @author Abhishek raj
	 * This method is used to click on First photo article link
	 */
	public void navigateToOldPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.click(oldArticleLnks);
		} catch (Exception e) {
			Logs.error(getClass(), "Exception in Old PhotoGallery Article", e);
		}
	}

	/**
	 * @author Abhishek raj
	 * This method is used to click on First photo article link
	 */
	public void navigateToPhotogalleryFirstArticle() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForSecond(5000);
			webDriverActions.waitForAllElementsVisible(articleLnks, GlobalVariables.sec30);
			webDriverActions.click(articleLnks.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photo Section First Article", e);
		}
	}

	/**
	 * This method is used to click on the first article in the photogallery section
	 */
	public void clickOnFirstArt() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.clickJS(listImg.get(0));
		} catch (IndexOutOfBoundsException e) {
			Logs.error(getClass(), "Exception in Photo Section First Article", e);
		}
	}

	/**
	 * This method is used to verify RHS PhotoGallery Title
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle,commonArticleLnks);
	}

	/**
	 * This method is used to verify RHS PhotoGallery Article
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles,commonArticleLnks);
	}

	/**
	 * This method is used to verify RHS Movies Article
	 * @param serverType
	 */
	public void verifyRhsMoreNewsArticleConsumptionNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles,commonArticleLnks);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS MoreNews down ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSPhotoGalleryDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonArticleLnks,rhsMoreNewsDownAdBlock,rhsMoreNewsDownAd);
	}

	/**
	 * This method is used to verify RHS PhotoGallery Title
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryPhotoTitleNavigation(String serverType) {
		verifyRHSTitleNavigation(serverType,photogalleryTitle,commonsPhotoCategoryArticleLnk);
	}

	/**
	 * This method is used to verify RHS PhotoGallery Article
	 * @param serverType
	 */
	public void verifyRhsPhotoGalleryPhotoArticleConsumptionarticleNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,photogalleryTitle,photogalleryArticles,commonsPhotoCategoryArticleLnk);
	}

	/**
	 * This method is used to verify RHS Movies Article
	 * @param serverType
	 */
	public void verifyRhsMoreNewsArticlePhotoConsumptionNavigation(String serverType) {
		verifyRHSArticleNavigation(serverType,moreNewsTitle,moreNewsArticles,commonsPhotoCategoryArticleLnk);
	}

	/**
	 * @author DanishR
	 * This method calls verifyArticleRHSAdsNavigation for RHS MoreNews down ad validation 
	 * @param serverType
	 */
	public void verifyArticleRHSPhotoGalleryPhotoDownAdNavigation(String serverType)
	{
		verifyArticleRHSAdsNavigation(serverType, commonsPhotoCategoryArticleLnk,rhsMoreNewsDownAdBlock,rhsMoreNewsDownAd);
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
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(photogalleryArticlesLnk.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
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
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(photogalleryArticlesLnk.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
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
			webDriverActions.waitForAllElementsVisible(articlesLinks, 10);
			int response = genericUtility.checkLinks(currentPage);
			if (response==200) {
				boolean status=genericUtility.compareUrlSub(actual, expected);
				softAssert.assertTrue(status, "Possibly not Navigate to same Page "+" ---Actual--- "+actual+" ---Expected--- "+expected+" ---CurrentPage--- "+currentPage);
				webDriverActions.softScrollToElement(title);
				Assert.assertTrue(articlesLinks.size()>0," Possibily no articles found or size is " +articlesLinks.size()+" "+webDriverActions.getCurrentPageUrl());
				String categoryCPPage = webDriverActions.getCurrentPageUrl();
				/* Below loop will fetch list of articles and navigate to each one by one */ 
				System.out.println(articlesLinks.size());
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
					webDriverActions.navigateToUrl(categoryCPPage);
					webDriverActions.waitForSecond(3000);
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
	 * This method is used to validate RHS Ads present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyArticleRHSAdsNavigation(String serverType , List<WebElement> articleLst,WebElement adBlock, WebElement ad) {
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
			webDriverActions.waitForSecond(3000);
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
				webDriverActions.continuousScrollTillElement(ad, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(ad,10) , " Possibly RHS 2nd or 3rd Ad not visible "+"\t"+currentPageUrl);
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
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
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
	 * @param articleExcerpt
	 * @param articleLastUpdated
	 * @param articleLastUpdatedTime
	 * @param articleLocation
	 * @param captionTxt
	 * @author VipinKumarGawande
	 * This method is used to Validate the Photogallery_Article Detailed_Box Validation In Article Consumption Page
	 */
	public void verifyPhotogalleryArticleDetailedBoxValidation(String serverType , List<WebElement> articleLst , WebElement articleHeader, WebElement articleExcerpt , WebElement articleLastUpdated ,WebElement articleLastUpdatedTime, WebElement articleLocation,WebElement captionTxt)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleHeader, 1) , "Possibly Article Header Text is Not Visible "+currentPageUrl);
			webDriverActions.softHighlightElement(articleExcerpt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleExcerpt, 1) , "Possibly Article Excerpt Text is Not Visible "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdated);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdated) , "Possibly LAST UPDATED Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLastUpdatedTime);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLastUpdatedTime) , "Possibly LAST UPDATED TIME is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(articleLocation);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleLocation) , "Possibly Article Location Text is Not Visible in "+currentPageUrl);
			webDriverActions.softHighlightElement(captionTxt);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(captionTxt) , "Possibly Article Caption Text is Not Visible in "+currentPageUrl);
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
	 * @param description
	 *  @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation In Article Consumption Page
	 */
	public void verifyPhotogalleryArticleImageDescriptionValidation(String serverType , List<WebElement> articleLst , List<WebElement> description )
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
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
			softAssert.assertTrue(description.size()>0, "Possibly Article Detailed Description Is Not Visible in "+currentPageUrl);
			for(int j=0;j<description.size();j++)
			{
				webDriverActions.softMouseHover(description.get(j));
				webDriverActions.softHighlightElement(description.get(j));
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(description.get(j)), "Possibly Article Detailed Description is Not Visible in ---- "+currentPageUrl);
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
		softAssert.assertAll("Issues found in Article Body");
	}

	/**
	 * @param serverType
	 * @param articleLst
	 * @param taboolaFeedArticle
	 * This method is used to Validate the Article Taboola In Body and RHS in Article Consumption Page
	 */
	public void verifyArticleTaboolaNavigation(String serverType , List<WebElement> articleLst, List<WebElement>taboolaFeedArticle, List<WebElement>taboolaFeedImgElement, WebElement taboolaLogo)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
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
			webDriverActions.waitForSecond(500);
			webDriverActions.continuousScrollTillElement(taboolaLogo, 7);
			webDriverActions.waitForSecond(4000);
			webDriverActions.softHighlightElement(taboolaLogo);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(taboolaLogo), "Possibly Article Body Taboola Feed Logo is Not Visible in "+currentPageUrl);
			softAssert.assertTrue(taboolaFeedArticle.size()>0, "Possibly Taboola Feeds Is Not Visible in "+currentPageUrl);
			for(int j =0 ; j<taboolaFeedArticle.size() ; j++)
			{
				webDriverActions.softMouseHover(taboolaFeedArticle.get(j));
				webDriverActions.softMouseHover(taboolaFeedImgElement.get(j));
				webDriverActions.softHighlightElement(taboolaFeedArticle.get(j));
				webDriverActions.softHighlightElement(taboolaFeedImgElement.get(j));
				softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedArticle.get(j)) , "Possibly Taboola Feed Article Is not Visible in " +currentPageUrl);
				softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaFeedImgElement.get(j)) , "Possibly Taboola Feed Img Article Is not Visible in " +currentPageUrl);
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
	public void verifyArticleSocialMediaNavigation(String serverType , List<WebElement> articleLst ,List< WebElement> articleSocialMedia)
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		//		webDriverActions.continuousScrollTillAllElement(articleLst, 10);
		webDriverActions.waitForElement(1000);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Article is Not Visible in Category Page in "+expectedUrl);
		}
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
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleSocialMedia.get(j)), "Possibly Social Share Icon is Not Visible in "+currentPageUrl);
				webDriverActions.softMouseHover(articleSocialMedia.get(j));
				webDriverActions.softHighlightElement(articleSocialMedia.get(j));
				String actualShare = webDriverActions.getAttribute("href", articleSocialMedia.get(j));
				webDriverActions.softClickJS(articleSocialMedia.get(j));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String currentShare = webDriverActions.getCurrentPageUrl();
				int socialResponse = genericUtility.checkLinks(currentPageUrl);
				softAssert.assertTrue(socialResponse==200, "Possibly Url is Invalid "+currentShare+" And Status Code is "+socialResponse);
				//					softAssert.assertTrue(currentShare.contains(actualShare), "Possibly not navigate to same page "+actualShare);
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
		if(articleLst.size()==0){
			Logs.error(getClass(),  "Possibly Photogallery Article is Not Visible in Category Page in "+expectedUrl);
			throw new SkipException("Possibly Photogallery Article is Not Visible in Category Page in "+expectedUrl);
		}
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
			Assert.assertTrue(webDriverActions.softIsElementDisplayed(agencyLnk), "Possibly Agency Link is Not Visible in "+expectedUrl);
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
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(descriptionTxt));
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

	/*================Photo Section Photogallery Article Consumption Page=============*/
	public void verifyPhotoSectionPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, photoSectionArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyPhotoSectionPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, photoSectionArticleLnk, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyPhotoSectionPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, photoSectionArticleLnk, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyPhotoSectionPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, photoSectionArticleLnk, photogalleryImageDescriptionTxt);
	}

	public void verifyPhotoSectionPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, photoSectionArticleLnk, topPhotoGallerySocialShareLnk);
	}

	public void verifyPhotoSectionPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, photoSectionArticleLnk, photoImageSocialShareLnk);
	}

	public void verifyPhotoSectionPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photoSectionArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyPhotoSectionPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photoSectionArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	/*================Common Section Photogallery Article Consumption Page=============*/

	public void verifyCommonPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, commonPhotogalleryArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyCommonPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, commonPhotogalleryArticleLnk, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyCommonPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, commonPhotogalleryArticleLnk, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyCommonPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, commonPhotogalleryArticleLnk, photogalleryImageDescriptionTxt);
	}

	public void verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnk, topPhotoGallerySocialShareLnk);
	}

	public void verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, commonPhotogalleryArticleLnk, photoImageSocialShareLnk);
	}

	public void verifyCommonPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCommonPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, commonPhotogalleryArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}

	/*================Cricket__Photogallery Article Consumption Page=============*/
	public void verifyCricketPhotogalleryArticleBreadcrumbNavigation(String serverType)
	{
		verifyArticleBreadCrumbNavigation(serverType, photogalleryCricketArticleLnk, articleBreadcrumbLnk);
	}

	public void verifyCricketPhotogalleryArticleDetailedBoxValidation(String serverType)
	{
		verifyPhotogalleryArticleDetailedBoxValidation(serverType, photogalleryCricketArticleLnk, articlePhotogalleryHeaderTxt ,articlePhotogalleryExcerptTxt, articlePhotogalleryLastUpdatedTxt, articlePhotogalleryLastUpdatedTimeTxt, articlePhotogalleryLocationTxt, articlePhotogalleryCaptionTxt);
	}

	public void verifyCricketPhotogalleryArticleAgencyNavigation(String serverType)
	{
		verifyArticleAgencyNavigation(serverType, photogalleryCricketArticleLnk, articlePhotogalleryAgencyLnk , news18AgencyTxt);
	}

	public void verifyCricketPhotogalleryArticleImageDescriptionValidation(String serverType)
	{
		verifyPhotogalleryArticleImageDescriptionValidation(serverType, photogalleryCricketArticleLnk, photogalleryImageDescriptionTxt);
	}

	public void verifyCricketPhotogalleryArticleSocialMediaShareIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, photogalleryCricketArticleLnk, topPhotoGallerySocialShareLnk);
	}

	public void verifyCricketPhotogalleryArticleImageSocialMediaIconNavigation(String serverType) {
		verifyArticleSocialMediaNavigation(serverType, photogalleryCricketArticleLnk, photoImageSocialShareLnk);
	}

	public void verifyCricketPhotogalleryArticleTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photogalleryCricketArticleLnk , taboolaArticleLst ,taboolaImgLnk, articleBodyTaboolaLogo);
	}

	public void verifyCricketPhotogalleryArticleRHSTaboolaValidation(String serverType)
	{
		verifyArticleTaboolaNavigation(serverType, photogalleryCricketArticleLnk , rhsTaboolaArticleLnk ,rhsTaboolaImgLnk, rhsTaboolaLogo);
	}


	//=====================================Anupam Business Logic=======================================================
	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoArticleCountValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
		//			Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible");
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
				softAssert.assertTrue(photoArticleDiv.size()>0, "Possibly photo Article division is Not Visible");
				for(int j=0; j<photoArticleDiv.size(); j++) {
					webDriverActions.softScrollToElement(photoArticleDiv.get(j));
					webDriverActions.softMouseHover(photoArticleDiv.get(j));
					webDriverActions.softHighlightElement(photoArticleCount.get(j));
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(photoArticleCount.get(j), 4) , "Possibly photo count is Not Visible "+(j+1)+currentPageUrl);
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
		softAssert.assertAll("Issue Found in Photo Article Body");
	}

	public void verifyPhotoSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, photoArticleLnks);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoRHSTopAdsNavigation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
		//Assert.assertTrue(articleLst.size()>0, "Possibly section Article is Not Visible");
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
				webDriverActions.scrollDown();
				webDriverActions.waitForSecond(1000);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(rhsPhotoTopAds,10) , "Possibly RHS top Ads is not visible after 10 sec  "+"\t"+currentPageUrl);
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
		softAssert.assertAll("Issue Found in Photo Article Body");
	}


	public void verifyPhotoSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, photoArticleLnks);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Widgets in Hindi revamp Page.
	 * @param serverType
	 * @param articleLst
	 */
	public void verifyPhotoAdsBetweenArticleValidation(String serverType , List<WebElement> articleLst) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		String sectionPage = webDriverActions.getCurrentPageUrl();
		webDriverActions.scrollDown();
		if(articleLst.size()==0){
			Logs.error(getClass(), "Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
			throw new SkipException("Possibly PhotoGallery Article is Not Visible in Category Page in "+sectionPage);
		}
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
				softAssert.assertTrue(photoArticleDiv.size()>0, "Possibly photo Article division is Not Visible");
				for(int j=0; j<photoArticleDiv.size()-2; j+=2) {
					webDriverActions.softScrollToElement(photoArticleDiv.get(j));
					webDriverActions.softMouseHover(photoArticleDiv.get(j));
					int k=j/2;
					webDriverActions.softScrollToElement(photoArticleAdsDiv.get(k));
					webDriverActions.softHighlightElement(photoArticleAdsDiv.get(k));
					webDriverActions.waitForSecond(5000);
					try {
						webDriverActions.softIsElementDisplayed(photoArticleAds.get(k), 4);
					} catch (Exception e) {
						softAssert.fail("Possibly "+(k+1)+" Ads is Not loaded in 5 sec "+currentPageUrl);
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
		softAssert.assertAll("Issue Found in Photo Article Body");
	}


	public void verifyPhotoSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, photoArticleLnks);
	}

	//AUTO
	public void verifyAutoSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyAutoSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyAutoSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//BUSINESS
	public void verifyBusinessSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyBusinessSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyBusinessSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//BUZZ
	public void verifyBuzzSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyBuzzSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyBuzzSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//CRICKET
	public void verifyCricketSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, cricketPhotoArticleEle);
	}
	public void verifyCricketSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, cricketPhotoArticleEle);
	}
	public void verifyCricketSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, cricketPhotoArticleEle);
	}

	//EDUCATION
	public void verifyEducationSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyEducationSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyEducationSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//EXPLAINERS
	public void verifyExplainersSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyExplainersSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyExplainersSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//INDIA
	public void verifyIndiaSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyIndiaSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyIndiaSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}


	//LATEST
	public void verifyLatestSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyLatestSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyLatestSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//LIFESTYLE
	public void verifyLifeStyleSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyLifeStyleSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyLifeStyleSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//MOVIES
	public void verifyMoviesSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyMoviesSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyMoviesSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//OPINION
	public void verifyOpinionSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyOpinionSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyOpinionSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//POLITICS
	public void verifyPoliticsSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyPoliticsSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyPoliticsSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//SHOWSHA
	public void verifyShowshaSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyShowshaSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyShowshaSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//SPORTS
	public void verifySportsSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifySportsSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifySportsSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//TECH
	public void verifyTechSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyTechSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyTechSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

	//WORLD
	public void verifyWorldSectionPhotoArticleCountValidation(String serverType)
	{
		verifyPhotoArticleCountValidation(serverType, commonPhotoArticleEle);
	}
	public void verifyWorldSectionPhotoArticleTopRhsAdsValidation(String serverType)
	{
		verifyPhotoRHSTopAdsNavigation(serverType, commonPhotoArticleEle);
	}
	public void verifyWorldSectionPhotoAdsBetweenArticleValidation(String serverType)
	{
		verifyPhotoAdsBetweenArticleValidation(serverType, commonPhotoArticleEle);
	}

}