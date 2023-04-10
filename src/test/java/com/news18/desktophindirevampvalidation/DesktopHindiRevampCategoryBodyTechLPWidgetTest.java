package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyTechLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Tech Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void techBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Tech Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void techBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void techPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void techReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void techCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void techRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void techTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Tech LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyTechRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechCategoryRHSAdsValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Tech LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyTechPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechPaginationNextArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Tech LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyTechBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Tech LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyTechPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Tech LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyTechPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyTechPaginationBtnValidation();
	}
	
}
