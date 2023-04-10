package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyAutoLPWidgetTest extends DesktopCommonConfig {

	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Auto Category Body in Hindi Revamp Category Landing Page.
	 */
	public void autoBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Auto Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void autoBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void autoPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void autoReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void autoCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void autoRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void autoTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Subcategory Tabs Navigation in Landing Page.
	 */
	@Test
	public void autoSubCategoryTabsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySubCategoryTabsNavigation(serverType);
	}
	
	//Anupam
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Auto LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Auto LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Auto LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Auto LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Auto LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAutoPaginationBtnValidation();
	}
	
}
