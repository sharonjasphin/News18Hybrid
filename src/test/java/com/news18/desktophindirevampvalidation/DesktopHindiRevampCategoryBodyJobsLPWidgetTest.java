package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyJobsLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Dharm Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void jobsBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Jobs Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void jobsBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void jobsPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void jobsCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsCategoryNameNavigation(serverType);
	}
	
	@Test
	public void dharmReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void jobsRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void jobsTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void jobsBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsBodyTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Jobs LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Jobs LP in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Jobs LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Jobs LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Jobs LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Jobs LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyJobsPaginationBtnValidation();
	}
}
