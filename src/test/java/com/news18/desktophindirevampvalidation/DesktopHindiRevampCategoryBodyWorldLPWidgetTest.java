package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyWorldLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in World Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void worldBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in World Category Body in Hindi Revamp Category Landing Page.
	 */
		@Test
	public void worldBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void worldPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void worldReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void worldCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void worldRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void worldTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyWorldTaboolaFeedValidation(serverType);
	}
}
