package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Knowledge in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyKnowledgeLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Knowledge Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void knowledgeBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Knowledge Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void knowledgeBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void knowledgePriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgePriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void knowledgeReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void knowledgeCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void knowledgeRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void knowledgeTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void knowledgeBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeBodyTaboolaFeedValidation(serverType);
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeArticleBelowPriorityNavigation("preProd");
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgeCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgePaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgePaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Knowledge LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyKnowledgePaginationBtnValidation();
	}
	
}
