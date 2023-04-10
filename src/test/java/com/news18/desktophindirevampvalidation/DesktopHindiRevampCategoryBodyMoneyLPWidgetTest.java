package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Money in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyMoneyLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Money Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void moneyBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Money Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void moneyBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void moneyPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void moneyCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void moneyRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void moneyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Money LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Money LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Money LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Money LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Money LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoneyPaginationBtnValidation();
	}
}
