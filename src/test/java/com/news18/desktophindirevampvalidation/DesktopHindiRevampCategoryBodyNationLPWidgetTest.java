package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Nation in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyNationLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Nation Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void nationBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Nation Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void nationBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void nationPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void nationReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void nationCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void nationRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void nationTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void nationBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationBodyTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Nation LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Nation LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Nation LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Nation LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Nation LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyNationPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyNationPaginationBtnValidation();
	}
	
}
