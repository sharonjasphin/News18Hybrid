package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne Nation Widget 
 */
public class DesktopHindiRevampArticleBodyLifestyleWidgetTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void lifestyleArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleGoogleNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleDetailedDescriptionNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Lifestyle ArticleConsumption Page. 
	 */
	@Test
	public void lifestyleArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleRHSTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Lifestyle ArticleConsumption Page.
	 */	
	@Test
	public void lifestyleArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleFooterReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Lifestyle ArticleConsumption Page.
	 */
	@Test
	public void lifestyleArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifestyleArticleFooterSocialMediaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Life Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLifeArticleConclusionNavigation(serverType);
	}
}
