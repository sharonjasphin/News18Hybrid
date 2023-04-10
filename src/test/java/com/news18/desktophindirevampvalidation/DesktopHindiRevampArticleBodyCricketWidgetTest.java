package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Desktop Hindi Revamp Article Consumption Body Cricket Validation
 */
public class DesktopHindiRevampArticleBodyCricketWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleTitleAndLastUpdatedTimeValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleReadMoreDescription() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of agency Link  in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleAgencyNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMediaNavigation present in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleSocialMediaNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of Google News in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleGoogleNewsNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of footer ReadMore Link in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleFooterReadMoreLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleFooterReadMoreLnk(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of social media in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleFooterSocialMediaNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleFooterSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Article's Author in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleAuthorNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleRelatedNewsNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlights  in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleHighlightValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Header Link in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleDescriptionHeaderLinkNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleTaboolaValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Money ArticleConsumption Page. 
	 */
	@Test
	public void cricketArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleRHSTaboolaValidation(serverType);
	}
	
	//--Anupam
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleTagNavigation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketTagsNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Auther Name present at bottom inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleFirstPublishedAndAuthorValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketVideoBetweenArticleValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleConclusionValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketArticleConclusionNavigation(serverType);
	}
}
