package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne Money Widget 
 */
public class DesktopHindiRevampArticleBodyMoneyWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void moneyArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void moneyArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void moneyArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleHighlightNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleDetailedDescriptionNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleTaboolaValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Money ArticleConsumption Page. 
	 */
	@Test
	public void moneyArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleFooterReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleFooterSocialMediaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleTagsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoBetweenArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyArticleConclusionNavigation(serverType);
	}
}
