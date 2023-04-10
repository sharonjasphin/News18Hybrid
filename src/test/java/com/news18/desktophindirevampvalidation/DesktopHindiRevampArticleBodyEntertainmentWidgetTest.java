package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne Money Widget 
 */
public class DesktopHindiRevampArticleBodyEntertainmentWidgetTest extends DesktopCommonConfig {


	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */

	public void entertainmentArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Entertainment ArticleConsumption Page.
	 */
	
	@Test
	public void entertainmentArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleHighlightNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleDetailedDescriptionNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleTaboolaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Entertainment ArticleConsumption Page. 
	 */

	@Test
	public void entertainmentArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleRHSTaboolaNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Entertainment ArticleConsumption Page.
	 */
	
	@Test
	public void entertainmentArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleFooterReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Entertainment ArticleConsumption Page.
	 */

	@Test
	public void entertainmentArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleFooterSocialMediaNavigation(serverType);
	}
	
	//---Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentTagsNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentArticleConclusionNavigation(serverType);
	}
}
