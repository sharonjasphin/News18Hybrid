package com.news18.tamilpages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class AMPTamilLandingPage {
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert softAssert = new SoftAssert();

	public AMPTamilLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//-------------------Anupam*Webelement-------------

	//---------lifestyle
	/* Lifestyle section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/lifestyle')]")
	private WebElement lifestyleSectionLnk;

	/* Lifestyle section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> lifestyleSectionArticleLnk;

	/* Lifestyle section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> lifestyleSectionImgLnk;

	/* Lifestyle section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/lifestyle')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreLifestyleSectionLnk;

	/*Breadcrumb present in Lifestyle article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement lifestyleBreadcrumb;


	//---------India
	/* India section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/national/')]")
	private WebElement indiaSectionLnk;

	/* India section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> indiaSectionArticleLnk;

	/* India section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> indiaSectionImgLnk;

	/* India section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/national/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreIndiaSectionLnk;

	/*Breadcrumb present in India article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement indiaBreadcrumb;

	//---------World
	/* World section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/international/')]")
	private WebElement worldSectionLnk;

	/* World section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> worldSectionArticleLnk;

	/* World section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> worldSectionImgLnk;

	/* World section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/international/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreWorldSectionLnk;

	/* Breadcrumb present in World article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement worldBreadcrumb;


	//---------Employment
	/* Employment section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/employment/')]")
	private WebElement employmentSectionLnk;

	/* Employment section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> employmentSectionArticleLnk;

	/* Employment section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> employmentSectionImgLnk;

	/* Employment section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/employment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreEmploymentSectionLnk;

	/* Breadcrumb present in Employment article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement employmentBreadcrumb;

	//---------Business
	/* Business section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/business/')]")
	private WebElement businessSectionLnk;

	/* Business section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> businessSectionArticleLnk;

	/* Business section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> businessSectionImgLnk;

	/* Business section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/business/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreBusinessSectionLnk;

	/* Breadcrumb present in Business article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement businessBreadcrumb;

	//---------Sport
	/* Sport section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/sports/')]")
	private WebElement sportSectionLnk;

	/* Sport section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> sportSectionArticleLnk;

	/* Sport section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> sportSectionImgLnk;

	/* Sport section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/sports/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreSportSectionLnk;

	/* Breadcrumb present in Sport article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement sportBreadcrumb;

	//---------Featured Article
	/* Featured Article section present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd ')]//a[contains(@href,'/special-articles/')]")
	private WebElement featuredArticleSectionLnk;

	/* Featured Article section article present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]/div/a  |  //div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//li/a")
	private List<WebElement> featuredArticleSectionArticleLnk;

	/* Featured Article section Image present in homepage*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//amp-img")
	private List<WebElement> featuredArticleSectionImgLnk;

	/* Featured Article section ReadMore present in homepage at bottom*/
	@FindBy(xpath ="//div[contains(@class,'globalhd')]//a[contains(@href,'/special-articles/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
	private WebElement readMoreFeaturedArticleSectionLnk;

	/* Breadcrumb present in Featured Article page*/
	@FindBy(xpath ="//div[contains(@class,'breadcum')] |  //div[contains(@class,'brade_crum')] | //div[contains(@class,'brdcrm')]  | //div[contains(@class,'breadcrumbs')]")
	private WebElement featuredArticleBreadcrumb;
	
	
	// ---------------------------------------- Vipin's Webelemnts ----------------------------------------------//
	
			/* Article Header Text in Article Consumption Page */
			@FindBy(xpath ="//h1[contains(@class,'article_heading') or contains(@class,'live_blog') or contains(@class,'gallery_tilte')] | //div[contains(@class,'art') or contains(@class,'TstoryHead')]/h1" )
			private WebElement articleHeaderTxt;

			/* Article BreadCrumb Division */
			@FindBy(xpath = "//div[contains(@class,'brd') or contains(@class,'bread') or contains(@class,'brade')]  | //ul[contains(@class, 'bread')]")
			private WebElement articleBreadCrumbDiv;
			
			/* List of Top Tamil News Article Link in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'top-news')]/h2/a")
			private List<WebElement> topTamilNewsArticleLnk;
			
			/*List of Top Tamil News Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'top-news bigstory')]/a//amp-img")
			private List<WebElement> topTamilNewsImgLnk;
			
			/*List of Important News Article Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/ul/li/a//h3")
			private List<WebElement> importantNewsArticleLnk;
			
			/*List of Important News Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/ul/li/a//amp-img")
			private List<WebElement> importantNewsImgLnk;
			
			/*Important News ReadMore Link in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'container')]//div[contains(@class,'newstrendvideo')]/a")
			private WebElement importantNewsReadMoreLnk;
			
			/*TamilNadu Section City Links*/
			@FindBy(xpath="//ul[contains(@class,'news-home-tab')]/li/a")
			private List<WebElement> tamilnaduCitiesLnks;

			/*TamilNadu Section City Article Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
			private List<WebElement> tamilnaduArticleLnks;
			
			/*TamilNadu Section City Article Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//amp-img")
			private List<WebElement> tamilnaduImgLnks;

			/* TamilNadu Section Title Link in Homepage*/ 
			@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/tamil-nadu/')]")
			private WebElement tamilnaduTitleLnk;

			/*TamilNadu Section City Title Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'tamil-nadu')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
			private WebElement tamilnaduCitiesReadMoreLnk;
			
			/* Webstories Section  Title Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories')]//h2/a")
			private WebElement webstoriesTitleLnk;

			/* List of Webstrories Article Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a")
			private List<WebElement> webstoriesArticleLnk;

			/* List of Webstrories Image Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'slick-slide') and not (contains(@class,'slick-cloned'))]//a//amp-img")
			private List<WebElement> webstoriesImgLnk;

			/* Active Webstories Article Link in Webstories Section in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a")
			private WebElement activeWebstoriesArticleLnk;

			/* Active Webstories Image Link in Webstories Section in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]/div[contains(@class,'gallery_details')]//div[@class='slick-list']//div[contains(@class,'current') and not (contains(@class,'slick-cloned'))]//a//amp-img")
			private WebElement activeWebstoriesImgLnk;

			/* Webstories Slider Button in Homepage */
			@FindBy(xpath = "//div[contains(@class,'web_stories') and not (contains(@class,'news_story'))]//ul[contains(@class,'slick-dots')]/li/button")
			private List<WebElement> webstoriesSliderBtn;

			/* WebStories Next Story Button after navigation of WebStories Article */
			@FindBy(xpath = "//div[contains(@class,'next-container')]")
			private WebElement nextWebStoryBtn;
			
			/*Entertainment Section Article Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
			private List<WebElement> entertainmentArticleLnks;
			
			/*Entertainment Section City Image Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//amp-img")
			private List<WebElement> entertainmentImgLnks;

			/* Entertainment Section Title Link in Homepage*/ 
			@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/entertainment/')]")
			private WebElement entertainmentTitleLnk;

			/*Entertainment Title Links in Homepage*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/entertainment/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
			private WebElement entertainmentReadMoreLnk;
			
			/*List of Photogallery Article Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
			private List<WebElement> photogalleryArticleLnk;
			
			/*List of Photogallery Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//amp-img")
			private List<WebElement> photogalleryImgLnk;
			
			/*Photogallery Read More Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'photogallery')]/ancestor::div[contains(@class,'superhitgallery')]/a")
			private WebElement photogalleryReadMoreLnk;
			
			/*Photogallery Title in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'globalhd')]//a[contains(@href,'/photogallery')]")
			private WebElement photogalleryTitleLnk;
			
			/*List of Technology Article Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
			private List<WebElement> technologyArticleLnk;
			
			/*List of Technology Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//amp-img")
			private List<WebElement> technologyImgLnk;
			
			/*Technology Read More Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]/ancestor::div[contains(@class,'superhitgallery')]/a")
			private WebElement technologyReadMoreLnk;
			
			/*Technology Title in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'technology')]")
			private WebElement technologyTitleLnk;
			
			/*List of Videos Article Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
			private List<WebElement> videosArticleLnk;
			
			/*List of Videos Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//amp-img")
			private List<WebElement> videosImgLnk;
			
			/*Videos Read More Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]/ancestor::div[contains(@class,'superhitgallery')]/a")
			private WebElement videosReadMoreLnk;
			
			/*Videos Title in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'videos')]")
			private WebElement videosTitleLnk;
			
			/*List of Automobiles Article Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a/h3")
			private List<WebElement> automobileArticleLnk;
			
			/*List of Automobiles Image Links in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]//ul/li/a//amp-img")
			private List<WebElement> automobileImgLnk;
			
			/*Automobiles Read More Link in Homepage */
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]/ancestor::div[contains(@class,'superhitgallery')]/a")
			private WebElement automobileReadMoreLnk;
			
			/*Automobiles Title in Homepage*/
			@FindBy(xpath = "//div[contains(@class,'global')]/h2/a[contains(@href,'automobile')]")
			private WebElement automobileTitleLnk;
			
			/*Education Section Article Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a")
			private List<WebElement> educationArticleLnks;
			
			/*Education Section Image Links*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::div[1]//a//amp-img")
			private List<WebElement> educationImgLnks;

			/* Education Section Title Link in Homepage*/ 
			@FindBy(xpath = "//div[contains(@class,'global')]//h2/a[contains(@href,'/education/')]")
			private WebElement educationTitleLnk;

			/*Education Title Links in Homepage*/
			@FindBy(xpath="//div[contains(@class,'globalhd')]//a[contains(@href,'/education/')]//ancestor::div[contains(@class,'globalhd')]/following-sibling::a[1]")
			private WebElement educationReadMoreLnk;
		


	//--------------------------Anupam*Business Logic------------------

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
		webDriverActions.continuousScrollTillElement(section, 6);
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
		webDriverActions.waitForElement(1000);
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

			//			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element "+element +"in "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}		
		}
		softAssert.assertAll("Issue Found in HomePage Body Article Navigation");	
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
		webDriverActions.continuousScrollTillElement(section, 6);		
		webDriverActions.softScrollToElement(section);
		webDriverActions.softMouseHover(section);
		webDriverActions.softHighlightElement(section);
		webDriverActions.waitForElement(1000);
		softAssert.assertTrue(artList.size()>0, " Possibly Element is Not Visible "+ artList );
		for(int i=0; i<artList.size() ;i++)
		{
			//			webDriverActions.softMouseHover(artList.get(i));
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

			//			webDriverActions.waitForPageToLoad();
			//			webDriverActions.waitForSecond(2000);
			//			webDriverActions.softHighlightElement(element);
			softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) ,  "Unable to Display Element "+element + " on "+currentPage);
			if (currentPage.contains(expectedUrl)) {
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.navigateBack();
				webDriverActions.navigateBack();
			}
			webDriverActions.waitForSecond(100);
		}
		softAssert.assertAll("Issue Found in HomePage Body Image Navigation");	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param section
	 * @param breadcrumb
	 */
	public void verifySectionLnks(String serverType,String page,WebElement section, WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(section, 6);	
		webDriverActions.softMouseHover(section);
		webDriverActions.softScrollToElement(section);
		webDriverActions.softHighlightElement(section);
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

		//		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(currentPage.contains("/amp/"), "Possibly not Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+"in "+currentPage);
		//		webDriverActions.waitForSecond(1000);
		softAssert.assertAll("Issue Found in HomePage Body Section Link");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to Verify the More Widget News Navigation
	 * @param serverType
	 * @param moreLnk
	 * @param breadcrumb
	 */
	public void verifyMoreLnks(String serverType,String page, WebElement moreLnk ,WebElement breadcrumb) {
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(moreLnk, 6);	
		webDriverActions.softMouseHover(moreLnk);
		webDriverActions.softScrollToElement(moreLnk);
		webDriverActions.softHighlightElement(moreLnk);
		webDriverActions.softClickJS(moreLnk);
		webDriverActions.waitForElement(1000);
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

		//		webDriverActions.waitForPageToLoad();
		//		webDriverActions.waitForSecond(2000);
		softAssert.assertTrue(currentPage.contains("/amp/"), "Possibly not Navigated to AMP Link "+currentPage);
		softAssert.assertTrue(currentPage.contains(page), "Possibly not able to naviagte "+page.substring(1).toUpperCase()+" page");
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb),"Unable to Display Element "+breadcrumb+ "in "+currentPage);
		softAssert.assertAll("Issue Found in HomePage Body More Link");
	}
	//-----Life

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	public void verifyLifeWidget(String serverType) {
		verifySectionLnks(serverType,"/lifestyle",lifestyleSectionLnk, lifestyleBreadcrumb);
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
	 * This method is used to validate navigation of More Lifestyle News
	 */
	public void verifyMoreLifeLnk(String serverType) {
		verifyMoreLnks(serverType,"/lifestyle",readMoreLifestyleSectionLnk, lifestyleBreadcrumb);
	}

	//-----India

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget
	 */
	public void verifyIndiaWidget(String serverType) {
		verifySectionLnks(serverType,"/national",indiaSectionLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	public void verifyIndiaWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,indiaSectionLnk,indiaSectionArticleLnk, indiaBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Image
	 */
	public void verifyIndiaWidgetImg(String serverType) {
		verifyImgNavigation(serverType,indiaSectionLnk,indiaSectionImgLnk, indiaBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	public void verifyMoreIndiaLnk(String serverType) {
		verifyMoreLnks(serverType,"/national",readMoreIndiaSectionLnk, indiaBreadcrumb);
	}


	//-----World

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	public void verifyWorldWidget(String serverType) {
		verifySectionLnks(serverType,"/international",worldSectionLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	public void verifyWorldWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,worldSectionLnk,worldSectionArticleLnk, worldBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	public void verifyWorldWidgetImg(String serverType) {
		verifyImgNavigation(serverType,worldSectionLnk,worldSectionImgLnk, worldBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	public void verifyMoreWorldLnk(String serverType) {
		verifyMoreLnks(serverType,"/international",readMoreWorldSectionLnk, worldBreadcrumb);
	}

	//----Employment

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget
	 */
	public void verifyEmploymentWidget(String serverType) {
		verifySectionLnks(serverType,"/employment",employmentSectionLnk, employmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget Article
	 */
	public void verifyEmploymentWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,employmentSectionLnk,employmentSectionArticleLnk, employmentBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget Image
	 */
	public void verifyEmploymentWidgetImg(String serverType) {
		verifyImgNavigation(serverType,employmentSectionLnk,employmentSectionImgLnk, employmentBreadcrumb);
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Employment News
	 */
	public void verifyMoreEmploymentLnk(String serverType) {
		verifyMoreLnks(serverType,"/employment",readMoreEmploymentSectionLnk, employmentBreadcrumb);
	}

	//---------Business
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	public void verifyBusinessWidget(String serverType) {
		verifySectionLnks(serverType,"/business",businessSectionLnk, businessBreadcrumb);
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
	 * This method is used to validate navigation of More Business News
	 */
	public void verifyMoreBusinessLnk(String serverType) {
		verifyMoreLnks(serverType,"/business",readMoreBusinessSectionLnk, businessBreadcrumb);
	}

	//---------Sport
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget
	 */
	public void verifySportWidget(String serverType) {
		verifySectionLnks(serverType,"/sports",sportSectionLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget Article
	 */
	public void verifySportWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,sportSectionLnk,sportSectionArticleLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget Image
	 */
	public void verifySportWidgetImg(String serverType) {
		verifyImgNavigation(serverType,sportSectionLnk,sportSectionImgLnk, sportBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Sport News
	 */
	public void verifyMoreSportLnk(String serverType) {
		verifyMoreLnks(serverType,"/sports",readMoreSportSectionLnk, sportBreadcrumb);
	}

	//---------Featured Article
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget
	 */
	public void verifyFeaturedArticleWidget(String serverType) {
		verifySectionLnks(serverType,"/special-articles",featuredArticleSectionLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget Article
	 */
	public void verifyFeaturedArticleWidgetArticle(String serverType) {
		verifyArticlesNavigation(serverType,featuredArticleSectionLnk,featuredArticleSectionArticleLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Featured Article Widget Image
	 */
	public void verifyFeaturedArticleWidgetImg(String serverType) {
		verifyImgNavigation(serverType,featuredArticleSectionLnk,featuredArticleSectionImgLnk, featuredArticleBreadcrumb);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Featured Article News
	 */
	public void verifyMoreFeaturedArticleLnk(String serverType) {
		verifyMoreLnks(serverType,"/special-articles",readMoreFeaturedArticleSectionLnk, featuredArticleBreadcrumb);
	}

	
	//----------------------------- Vipin's Business Logic -------------------------------//
	
	
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
				webDriverActions.continuousScrollTillAllElement(artList, 30);
				for(int i=0; i<artList.size() ;i++)
				{
					webDriverActions.softMouseHover(artList.get(i));
					webDriverActions.softScrollToElement(artList.get(i));
					webDriverActions.softClickJS(artList.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(artList.get(i));
						webDriverActions.softScrollToElement(artList.get(i));
						webDriverActions.softClickJS(artList.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(element);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in " +currentPage);
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
			public void verifyImageNavigation(String serverType,List<WebElement> imgList, WebElement element)
			{
				SoftAssert softAssert = new SoftAssert(); 
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillAllElement(imgList, 30);
				for(int i=0; i<imgList.size() ;i++)
				{
					webDriverActions.softMouseHover(imgList.get(i));
					webDriverActions.softScrollToElement(imgList.get(i));
					webDriverActions.softClickJS(imgList.get(i));
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.navigateBack();
						webDriverActions.softMouseHover(imgList.get(i));
						webDriverActions.softScrollToElement(imgList.get(i));
						webDriverActions.softClickJS(imgList.get(i));
					}
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expected =webDriverActions.getCurrentPageUrl();
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
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
					if (currentPage.contains(expected)) {
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
			public void verifyMoreNewsNavigation(String serverType,WebElement moreLnk , WebElement element ,  String section) {
				SoftAssert softAssert = new SoftAssert(); 
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(moreLnk, 30);
				webDriverActions.softMouseHover(moreLnk);
				webDriverActions.softScrollToElement(moreLnk);
				String actual = webDriverActions.getAttribute("href", moreLnk);
				webDriverActions.softClickJS(moreLnk);
				String currentPage = webDriverActions.getCurrentPageUrl();
				Logs.info(getClass(), currentPage);
				//				softAssert.assertEquals(actual, currentPage , "Unable to Navigate "+actual);
				if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
					String betaUrl = genericUtility.replaceInUrl(currentPage);
					webDriverActions.navigateToUrl(betaUrl);
					currentPage=betaUrl;
				}
				else {
					currentPage = webDriverActions.getCurrentPageUrl();
				}
				Logs.info(getClass(), currentPage);
				webDriverActions.softHighlightElement(element);
				softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(element) , "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issues Found in Homepage Body");
			}


			/**
			 * @author VipinKumarGawande
			 * @param serverType
			 * @param element
			 * @param breadcrumb
			 * This method is used to Validate the Title Navigation for All Sections
			 */
			public void verifyTitleNavigation(String serverType , WebElement element , WebElement breadcrumb)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(element, 10);
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
				webDriverActions.continuousScrollTillElement(breadcrumb, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(breadcrumb), "Unable to Display Element in"+currentPage);
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
			
			public void verifyImportantNewsImageNavigation(String serverType)
			{
				verifyImageNavigation(serverType, importantNewsImgLnk, articleBreadCrumbDiv);
			}
			
			public void verifyImportantNewsReadMoreNavigation(String serverType)
			{
				verifyMoreNewsNavigation(serverType, importantNewsReadMoreLnk, articleBreadCrumbDiv , "/news");
			}
			
			public void checkLinks(String links)  {
				//		SoftAssert softAssert = new SoftAssert();
				try {
					String authStr = fileUtility.readDataFromPropertyFile("username")+":"+fileUtility.readDataFromPropertyFile("password");
			        String encoded = Base64.getEncoder().encodeToString(authStr.getBytes());  //Java 8
			        
			        HttpURLConnection httpUrlConnection = (HttpURLConnection) new URL(links).openConnection();
			        httpUrlConnection.setRequestProperty("Authorization", "Basic "+encoded);
//					URL url=new URL(links);
					httpUrlConnection.connect();
					int responseCode = httpUrlConnection.getResponseCode();
					Logs.info(getClass(), responseCode + "--------------- "  +links);
					softAssert.assertTrue((responseCode<400), "URL has issue in "+links);
				}
				catch (Exception e) {
					Logs.error(getClass(), "Unable to fetch the link response ", e );
				} 
			}
			
			public void verifyTamilNaduArticleNavigations(String serverType)
			{
				verifyArticleNavigation(serverType, tamilnaduArticleLnks, articleBreadCrumbDiv);
			}
			
			public void verifyTamilNaduImageNavigation(String serverType)
			{
				verifyImageNavigation(serverType, tamilnaduImgLnks, articleBreadCrumbDiv);
			}
			
			public void verifyTamilNaduTitleNavigation(String serverType)
			{
				verifyTitleNavigation(serverType, tamilnaduTitleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyTamilNaduReadMoreNavigation(String serverType)
			{
				verifyMoreNewsNavigation(serverType, tamilnaduCitiesReadMoreLnk, articleBreadCrumbDiv, "tamil-nadu");
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
			
			public void verifyWebstoriesSliderNavigation()
			{
				SoftAssert softAssert =new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.softMouseHover(webstoriesTitleLnk);
				webDriverActions.softScrollToElement(webstoriesTitleLnk);
				if(webDriverActions.softIsElementDisplayed(webstoriesSliderBtn.get(0)))
				{
					for(int i = 1 ; i< 6 ; i++)
					{
						webDriverActions.softMouseHover(activeWebstoriesArticleLnk);
						webDriverActions.softScrollToElement(activeWebstoriesArticleLnk);
						String beforeSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
						Logs.info(getClass(), beforeSlide);
						webDriverActions.softHighlightElement(webstoriesSliderBtn.get(i));
						webDriverActions.mouseHoverAndClick(webstoriesSliderBtn.get(i));
						webDriverActions.waitForSecond(1000);
						String afterSlide = webDriverActions.getTextFromElement(activeWebstoriesArticleLnk);
						Logs.info(getClass(), afterSlide);
						softAssert.assertNotEquals(beforeSlide, afterSlide , "Possibly Webstories Slider is Not Working ");
					}
				}
				else
				{
					softAssert.fail("Possibly Webstories Slider Button Is Not Displayed ");
				}
				softAssert.assertAll("Issue Found in Homepage Body");
			}

			public void verifyWebstoriesTitleNavigation(String serverType)
			{
				verifyTitleNavigation(serverType , webstoriesTitleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyEntertainmentArticleNavigation(String serverType)
			{
				verifyArticleNavigation(serverType, entertainmentArticleLnks, articleBreadCrumbDiv);
			}
			
			public void verifyEntertainmentImageNavigation(String serverType)
			{
				verifyImageNavigation(serverType, entertainmentImgLnks, articleBreadCrumbDiv);
			}
			
			public void verifyEntertainmentTitleNavigation(String serverType)
			{
				verifyTitleNavigation(serverType, entertainmentTitleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyEntertainmentReadMoreNavigation(String serverType)
			{
				verifyMoreNewsNavigation(serverType, entertainmentReadMoreLnk, articleBreadCrumbDiv , "/entertainment");
			}
			
			public void verifyPhotogalleryArticleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(photogalleryTitleLnk , 10);
				softAssert.assertTrue(photogalleryArticleLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<photogalleryArticleLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(photogalleryArticleLnk.get(i));
					webDriverActions.softScrollToElement(photogalleryArticleLnk.get(i));
					webDriverActions.softClickJS(photogalleryArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(photogalleryArticleLnk.get(i));
						webDriverActions.softScrollToElement(photogalleryArticleLnk.get(i));
						webDriverActions.softClickJS(photogalleryArticleLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			
			
			public void verifyPhotogalleryImageNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(photogalleryTitleLnk , 10);
				softAssert.assertTrue(photogalleryImgLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<photogalleryImgLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(photogalleryImgLnk.get(i));
					webDriverActions.softScrollToElement(photogalleryImgLnk.get(i));
					webDriverActions.softClickJS(photogalleryImgLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(photogalleryImgLnk.get(i));
						webDriverActions.softScrollToElement(photogalleryImgLnk.get(i));
						webDriverActions.softClickJS(photogalleryImgLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			public void verifyPhotogalleryReadMoreNavigation(String serverType)
			{
				String section = "/photogallery";
				SoftAssert softAssert = new SoftAssert(); 
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(photogalleryReadMoreLnk , 10);
				String actual = webDriverActions.getAttribute("href", photogalleryReadMoreLnk);
				webDriverActions.softClickJS(photogalleryReadMoreLnk);
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
				Logs.info(getClass(), currentPage);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issues Found in Homepage Body");
			}
			
			public void verifyPhotogalleryTitleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(photogalleryTitleLnk, 10);
				webDriverActions.softClickJS(photogalleryTitleLnk);
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
				webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issue in Homepage Body ");
			
			}
			
			public void verifyTechnologyArticleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(technologyTitleLnk , 10);
				softAssert.assertTrue(technologyArticleLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<technologyArticleLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(technologyArticleLnk.get(i));
					webDriverActions.softScrollToElement(technologyArticleLnk.get(i));
					webDriverActions.softClickJS(technologyArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(technologyArticleLnk.get(i));
						webDriverActions.softScrollToElement(technologyArticleLnk.get(i));
						webDriverActions.softClickJS(technologyArticleLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			public void verifyTechnologyImageNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(technologyTitleLnk , 10);
				softAssert.assertTrue(technologyImgLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<technologyImgLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(technologyImgLnk.get(i));
					webDriverActions.softScrollToElement(technologyImgLnk.get(i));
					webDriverActions.softClickJS(technologyImgLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(technologyImgLnk.get(i));
						webDriverActions.softScrollToElement(technologyImgLnk.get(i));
						webDriverActions.softClickJS(technologyImgLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			public void verifyTechnologyTitleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(technologyTitleLnk, 10);
				webDriverActions.softClickJS(technologyTitleLnk);
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
				webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issue in Homepage Body ");
			
			
			}
			
			public void verifyTechnologyReadMoreNavigation(String serverType)
			{
				String section = "/technology";
				SoftAssert softAssert = new SoftAssert(); 
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(technologyReadMoreLnk , 10);
				String actual = webDriverActions.getAttribute("href", technologyReadMoreLnk);
				webDriverActions.softClickJS(technologyReadMoreLnk);
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
				Logs.info(getClass(), currentPage);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issues Found in Homepage Body");
			}
			
			public void verifyAutomobileArticleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(automobileTitleLnk , 10);
				softAssert.assertTrue(automobileArticleLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<automobileArticleLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(automobileArticleLnk.get(i));
					webDriverActions.softScrollToElement(automobileArticleLnk.get(i));
					webDriverActions.softClickJS(automobileArticleLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(automobileArticleLnk.get(i));
						webDriverActions.softScrollToElement(automobileArticleLnk.get(i));
						webDriverActions.softClickJS(automobileArticleLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			public void verifyAutomobileImageNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(automobileTitleLnk , 10);
				softAssert.assertTrue(automobileImgLnk.size()>1, "Possibly Element is not Visible");
				for(int i=0; i<automobileImgLnk.size() ;i++)
				{
					webDriverActions.softMouseHover(automobileImgLnk.get(i));
					webDriverActions.softScrollToElement(automobileImgLnk.get(i));
					webDriverActions.softClickJS(automobileImgLnk.get(i));
					String currentPage =webDriverActions.getCurrentPageUrl();
					String expectedUrl =webDriverActions.getCurrentPageUrl();
					if(webDriverActions.getCurrentPageUrl().contains("google_vignette") || webDriverActions.getCurrentPageUrl().contains("PWA_ROS_INSTL/"))
					{
						webDriverActions.refreshPage();
						webDriverActions.softMouseHover(automobileImgLnk.get(i));
						webDriverActions.softScrollToElement(automobileImgLnk.get(i));
						webDriverActions.softClickJS(automobileImgLnk.get(i));
					}
					if (serverType.equalsIgnoreCase("preProd") && !currentPage.contains("//beta")) {
						String betaUrl = genericUtility.replaceInUrl(currentPage);
						webDriverActions.navigateToUrl(betaUrl);
						currentPage=betaUrl;
					}
					else {
						currentPage = webDriverActions.getCurrentPageUrl();
					}
					webDriverActions.waitForPageToLoad();
					webDriverActions.softHighlightElement(articleBreadCrumbDiv);
					softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in " +currentPage);
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
			
			public void verifyAutomobileTitleNavigation(String serverType)
			{
				SoftAssert softAssert = new SoftAssert();
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 10);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(automobileTitleLnk, 10);
				webDriverActions.softClickJS(automobileTitleLnk);
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
				webDriverActions.continuousScrollTillElement(articleBreadCrumbDiv, 5);
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv), "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issue in Homepage Body ");
			
			
			}
			
			public void verifyAutomobileReadMoreNavigation(String serverType)
			{
				String section = "/automobile";
				SoftAssert softAssert = new SoftAssert(); 
				webDriverActions.waitForPageToLoad();
				webDriverActions.continuousScrollTillElement(employmentSectionLnk, 30);
				webDriverActions.softMouseHover(employmentSectionLnk);
				webDriverActions.continuousScrollTillElement(automobileReadMoreLnk , 10);
				webDriverActions.softClickJS(automobileReadMoreLnk);
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
				Logs.info(getClass(), currentPage);
				webDriverActions.softHighlightElement(articleBreadCrumbDiv);
				softAssert.assertTrue(currentPage.contains(section), "Possibly not able to naviagte "+section.substring(1).toUpperCase()+" page");
				softAssert.assertTrue(webDriverActions.softIsElementDisplayed(articleBreadCrumbDiv) , "Unable to Display Element in"+currentPage);
				softAssert.assertAll("Issues Found in Homepage Body");
			}
			
			public void verifyEducationArticleNavigation(String serverType)
			{
				verifyArticleNavigation(serverType, educationArticleLnks, articleBreadCrumbDiv);
			}
			
			public void verifyEducationImageNavigation(String serverType)
			{
				verifyImageNavigation(serverType, educationImgLnks, articleBreadCrumbDiv);
			}
			
			public void verifyEducationTitleNavigation(String serverType)
			{
				verifyTitleNavigation(serverType, educationTitleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyEducationReadMoreNavigation(String serverType)
			{
				verifyMoreNewsNavigation(serverType, educationReadMoreLnk, articleBreadCrumbDiv , "/education");
			}
			
			public void verifyVideoArticleNavigation(String serverType)
			{
				verifyArticleNavigation(serverType, videosArticleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyVideoImageNavigation(String serverType)
			{
				verifyImageNavigation(serverType, videosImgLnk, articleBreadCrumbDiv);
			}
			
			public void verifyVideoTitleNavigation(String serverType)
			{
				verifyTitleNavigation(serverType, videosTitleLnk, articleBreadCrumbDiv);
			}
			
			public void verifyVideoReadMoreNavigation(String serverType)
			{
				verifyMoreNewsNavigation(serverType, videosReadMoreLnk, articleBreadCrumbDiv , "/video");
			}
}
