package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyDharmLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Dharm Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void dharmBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Dharm Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void dharmBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void dharmPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void dharmCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmCategoryNameNavigation(serverType);
	}
	
	@Test
	public void dharmReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void dharmRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void dharmTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void dharmBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmBodyTaboolaFeedValidation(serverType);
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Dharm LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyDharmPaginationBtnValidation();
	}
	
}
