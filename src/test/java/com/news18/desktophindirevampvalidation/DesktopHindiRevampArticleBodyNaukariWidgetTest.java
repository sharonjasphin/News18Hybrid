package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne Money Widget 
 */
public class DesktopHindiRevampArticleBodyNaukariWidgetTest extends DesktopCommonConfig {


	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */

	public void naukariArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Naukari ArticleConsumption Page.
	 */

	@Test
	public void naukariArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleSocialMediaNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Naukari ArticleConsumption Page.
	 */

	@Test
	public void naukariArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleGoogleNewsNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleDetailedDescriptionNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Naukari ArticleConsumption Page. 
	 */
	@Test
	public void naukariArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleRHSTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleFooterReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Naukari ArticleConsumption Page.
	 */
	@Test
	public void naukariArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyNaukariArticleFooterSocialMediaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNaukariArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNaukariArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNaukariVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNaukariArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNaukariArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsArticleConclusionNavigation(serverType);
	}
}
