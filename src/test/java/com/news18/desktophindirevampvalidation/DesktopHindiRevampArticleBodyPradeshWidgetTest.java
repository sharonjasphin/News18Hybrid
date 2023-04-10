package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne Pradesh Widget 
 */
public class DesktopHindiRevampArticleBodyPradeshWidgetTest extends DesktopCommonConfig {


	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void pradeshArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleGoogleNewsNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleAuthorNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleHighlightNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleDetailedDescriptionNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleTaboolaNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Pradesh ArticleConsumption Page. 
	 */

	@Test
	public void pradeshArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleRHSTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Pradesh ArticleConsumption Page.
	 */

	@Test
	public void pradeshArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleFooterReadMoreNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Pradesh ArticleConsumption Page.
	 */


	@Test
	public void pradeshArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleFooterSocialMediaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleConclusionNavigation(serverType);
	}
}
