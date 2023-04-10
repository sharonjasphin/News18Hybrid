package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages Validation 
 */
public class DesktopHindiRevampArticleBodyKnowledgeWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void knowledgeArticleBreadcrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleBreadCrumbNavigation(serverType);;
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the verify header text, last updated date and time  in Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTitleAndLastUpdatedTimeValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link in Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleReadMoreDescription()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify News18 Agency Link Navigation inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Google News Link inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleGoogleNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Name Link inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the LHS Related News inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Highlight WIdget inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Detailed Description And Header Links inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleDetailedDescriptionNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Body Taboola Feeds Validation inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the RHS Taboola Feeds Validation inside the Knowledge ArticleConsumption Page. 
	 */
	@Test
	public void knowledgeArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleRHSTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of ReadMore Link present inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleFooterReadMoreValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleFooterReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the clicking of SocialMedia Link present inside the Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleFooterSocialMediaNavigationLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleFooterSocialMediaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeTagsNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleConclusionNavigation(serverType);
	}
}
