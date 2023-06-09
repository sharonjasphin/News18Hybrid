package com.news18.commonpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author VipinKumarGawande
 * This class contains WebElements and Business Logics which is used to verify the Promoted Content and Outbrain is 
 * displayed/Loading in Desktop Mode which is common for All the Languages 
 * verifyHomepageOutbrainContent - Verify the Promoted Content and OutBrain only in HomePage for All Languages
 * verifyArticleOutbarinContent - Verify the Promoted Content and OutBrain for Article,LiveBlog,PhotoGallery
 */
public class DesktopOutbrainValidation {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();

	public DesktopOutbrainValidation(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*OutBrain Division Block present at the Footer Portion*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]")
	private WebElement outbrainBlock;

	/*List of Promoted Content Article text present inside Promoted Content Section */
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'rec-text')]")
	private List<WebElement> promotedContentArticleLst;

	/*List of Promoted Content Image present inside Promoted Content Section*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'rec-image')]")
	private List<WebElement> promotedContentImgLst;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob_logo')]")
	private WebElement outbrainTxt;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs')]//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob-unit ob-rec-text')]")
	private List<WebElement> promotedContentRHSLnk;

	/*  List of Promoted Content Ads in body of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'left') or contains(@class,'lft') or contains(@class,'art') or contains(@class,'outBrainWrapper')]//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob-unit ob-rec-text')]")
	private List<WebElement> promotedContentBodyLnk;


	/*Outbrain Logo Links in body of PhotoGallery Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'OUTBRAIN')]//span[contains(@class,'ob_logo')]")
	private List<WebElement> outbrainLogoLnks;

	/*OutBrain Division Block present at the Footer Portion*/
	@FindBy(xpath ="//div[contains(@id,'taboola')]")
	private WebElement taboolaBlock;

	/*List of Promoted Content Image present inside Promoted Content Section*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'thumbBlock')]")
	private List<WebElement> taboolaImgLst;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]/div[contains(@class,'logo')]/div[contains(@class,'logo')]")
	private List<WebElement> taboolaLogoLnks;

	/*  List of Promoted Content Ads in RHS of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'right') or contains(@id,'right') or contains(@class,'rhs') or contains(@class,'rght')]//div[contains(@id,'taboola-right')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleRHSLnk;

	/*  List of Promoted Content Ads in body of PhotoGallery Consumption Page  */
	@FindBy(xpath = "//div[contains(@class,'left') or contains(@class,'lft') or contains(@class,'art')]//div[contains(@id,'taboola-below')]//div[contains(@class,'content-sponsored')]/div[contains(@class,'outer')]//span[contains(@class,'video-title')]")
	private List<WebElement> taboolaArticleBodyLnk;
	
	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@id,'taboola-below')]/div[contains(@class,'logo')]/div[contains(@class,'logo')]")
	private WebElement taboolaLogoLnk;
	
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
	private WebElement bodyTaboolaLogo;


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OubtBrain is displayed in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyHomepageTaboolaContent()
	{
		webDriverActions.waitForPageToLoad();
//		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(taboolaBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(taboolaArticleLst.size()>=1)
		{
			for(int i =0 ; i<taboolaArticleLst.size() ; i++)
			{
				Assert.assertTrue(webDriverActions.isElementDisplayed(taboolaArticleLst.get(i)) , "Failed to Display " +taboolaArticleLst);
				Assert.assertTrue(webDriverActions.isElementDisplayed(taboolaImgLst.get(i)),"Failed To Display "+taboolaImgLst);
				webDriverActions.mouseHover(taboolaArticleLst.get(i));
				webDriverActions.highlightElement(taboolaArticleLst.get(i));
				webDriverActions.mouseHover(taboolaImgLst.get(i));
				webDriverActions.highlightElement(taboolaImgLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(taboolaArticleLst.get(i)));
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			Assert.fail("Unable to Verify Promoated Content Article in "+webDriverActions.getCurrentPageUrl());
		}
				Assert.assertTrue(webDriverActions.isElementDisplayed(taboolaLogoLnk) , "Failed to display "+taboolaLogoLnk);
				webDriverActions.mouseHover(taboolaLogoLnk);
				webDriverActions.highlightElement(taboolaLogoLnk);
				webDriverActions.waitForSecond(1000);
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OubtBrain is displayed in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyHomepageOutbrainContent()
	{

		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(promotedContentArticleLst.size()>=1)
		{
			for(int i =0 ; i<promotedContentArticleLst.size() ; i++)
			{
				Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentArticleLst.get(i)) , "Failed to Display " +promotedContentArticleLst);
				Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentImgLst.get(i)),"Failed To Display "+promotedContentImgLst);
				webDriverActions.mouseHover(promotedContentArticleLst.get(i));
				webDriverActions.highlightElement(promotedContentArticleLst.get(i));
				webDriverActions.mouseHover(promotedContentImgLst.get(i));
				webDriverActions.highlightElement(promotedContentImgLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleLst.get(i)));
				webDriverActions.waitForSecond(1000);
			}
		}
		else
		{
			Assert.fail("Unable to Verify Promoated Content Article in "+webDriverActions.getCurrentPageUrl());
		}
		//		Assert.assertTrue(webDriverActions.isElementDisplayed(outbrainTxt , GlobalVariables.sec30) , "Failed to display "+outbrainTxt);
		//		webDriverActions.mouseHover(outbrainTxt);
		//		webDriverActions.highlightElement(outbrainTxt);
		//		webDriverActions.waitForSecond(1000);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads and OutBrain in Consumption Page for Article ,
	 * LiveBlog,PhotoGallery for all the Languages in Desktop Mode
	 */
	public void verifyArticleOutbarinContent()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.mouseHover(outbrainBlock);
		webDriverActions.waitForSecond(5000);
		//		assrt.assertTrue(webDriverActions.isElementDisplayed(outbrainBlock) , "");
		//		if(outbrainLogoLnks.size()>=1)
		//		{
		//			for(int i=0 ; i<outbrainLogoLnks.size() ; i++)
		//			{
		//				webDriverActions.waitForSecond(4000);
		//				webDriverActions.waitForElementVisibility(outbrainLogoLnks.get(i), 30);
		//				Assert.assertTrue(webDriverActions.isElementDisplayed(outbrainLogoLnks.get(i)), "Failed to Display "+outbrainLogoLnks);
		//				webDriverActions.highlightElement(outbrainLogoLnks.get(i));
		//				webDriverActions.mouseHover(outbrainLogoLnks.get(i));
		//			}
		//		}
		//		else {
		//			Assert.fail("Failed to Display Outbrain Logo "+outbrainLogoLnks);
		//		}
		if(promotedContentRHSLnk.size()>=1)
		{
			for(int i=0 ; i<promotedContentRHSLnk.size() ; i++)
			{
				webDriverActions.waitForSecond(2000);
				Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentRHSLnk.get(i)) , "Possibly RHS Promoted Content is Not Visible in "+webDriverActions.getCurrentPageUrl() +promotedContentRHSLnk);
				webDriverActions.scrollToElement(promotedContentRHSLnk.get(i));
				webDriverActions.highlightElement(promotedContentRHSLnk.get(i));
			}
		}
		else {
			Assert.fail("Failed to Display RHS Promoted Content in " +webDriverActions.getCurrentPageUrl() + promotedContentRHSLnk);
		}
		if(promotedContentBodyLnk.size()>=1)
		{
			for(int i=0 ; i<promotedContentBodyLnk.size() ; i++)
			{
				webDriverActions.waitForSecond(2000);
				Assert.assertTrue(webDriverActions.isElementDisplayed(promotedContentBodyLnk.get(i)) , "Possibly Body Promoted Content is Not Visible in "+webDriverActions.getCurrentPageUrl() +promotedContentBodyLnk);
				webDriverActions.mouseHover(promotedContentBodyLnk.get(i));
				webDriverActions.highlightElement(promotedContentBodyLnk.get(i));
			}
		}
		else {
			Assert.fail("Failed to Display Last Promoted Content Article in "+webDriverActions.getCurrentPageUrl() +promotedContentBodyLnk);
		}
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads Article Navigation in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyPromotedContentArticleNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(promotedContentArticleLst.size()>=1)
		{
			for(int i =0 ; i<promotedContentArticleLst.size() ; i++)
			{
				softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContentArticleLst.get(i)) , "Failed to Display " +promotedContentArticleLst);
				webDriverActions.softMouseHover(promotedContentArticleLst.get(i));
				webDriverActions.softHighlightElement(promotedContentArticleLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentArticleLst.get(i)));
				webDriverActions.softClickJS(promotedContentArticleLst.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String title = webDriverActions.getPageTitle();
				softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Unable to Verify Promoated Content Article in "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Promoted Content Ads Image Navigation in HomePage
	 * for All The Languages in Desktop Mode
	 */
	public void verifyPromotedContentImageNavigation()
	{
		SoftAssert softAssert = new SoftAssert();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.continuousScrollTillElement(outbrainBlock, 10);
		webDriverActions.waitForSecond(5000);
		if(promotedContentImgLst.size()>=1)
		{
			for(int i =0 ; i<promotedContentImgLst.size() ; i++)
			{
				softAssert.assertTrue(webDriverActions.isElementDisplayed(promotedContentImgLst.get(i)) , "Failed to Display " +promotedContentImgLst);
				webDriverActions.softMouseHover(promotedContentImgLst.get(i));
				webDriverActions.softHighlightElement(promotedContentImgLst.get(i));
				Logs.info(getClass(), webDriverActions.getTextFromElement(promotedContentImgLst.get(i)));
				webDriverActions.softClickJS(promotedContentImgLst.get(i));
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForSecond(2000);
				String currentPage = webDriverActions.getCurrentPageUrl();
				String title = webDriverActions.getPageTitle();
				softAssert.assertFalse(title.contains("400") || title.contains("500") || title.contains("502") , "Issue Found in this URL : "+currentPage);
				webDriverActions.closeDriver();
				webDriverActions.switchToWindow(parentTitle);
			}
		}
		else
		{
			softAssert.fail("Unable to Verify Promoated Content Article in "+webDriverActions.getCurrentPageUrl());
		}
		softAssert.assertAll("Issue Found in Homepage Body");
	}
	
	public void verifyHomepageTaboolaValidation()
	{
		SoftAssert softAssert = new SoftAssert();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElement(1000);
		webDriverActions.continuousScrollTillElement(bodyTaboolaLogo, 7);
		String expectedUrl = webDriverActions.getCurrentPageUrl();
		webDriverActions.waitForSecond(2000);
		webDriverActions.softHighlightElement(bodyTaboolaLogo);
		softAssert.assertTrue(webDriverActions.softIsElementDisplayed(bodyTaboolaLogo), "Possibly Article Body Taboola Feed Logo is Not Visible in "+expectedUrl);
		softAssert.assertTrue(taboolaArticleLst.size()>0, "Possibly Taboola Feeds Is Not Visible in "+expectedUrl);
		for(int j =0 ; j<taboolaArticleLst.size() ; j++)
		{
			webDriverActions.softMouseHover(taboolaArticleLst.get(j));
			webDriverActions.softMouseHover(taboolaImgLnk.get(j));
			webDriverActions.softHighlightElement(taboolaArticleLst.get(j));
			webDriverActions.softHighlightElement(taboolaImgLnk.get(j));
			softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaArticleLst.get(j)) , "Poosibly Taboola Feed Article Is not Visible in " +expectedUrl);
			softAssert.assertTrue(webDriverActions.isElementDisplayed(taboolaImgLnk.get(j)) , "Poosibly Taboola Feed Img Article Is not Visible in " +expectedUrl);
			Logs.info(getClass(), webDriverActions.getTextFromElement(taboolaArticleLst.get(j)));
		}
		softAssert.assertAll("Issue Found in Article Body");
	}
}
