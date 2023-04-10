package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Nation in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyEntertainmentLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Entertainment Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void entertainmentBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Entertainment Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void entertainmentBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void entertainmentPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void entertainmentCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void entertainmentRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void entertainmentTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Entertainment LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Entertainment LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Entertainment LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Entertainment LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Entertainment LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyEntertainmentPaginationBtnValidation();
	}
}
