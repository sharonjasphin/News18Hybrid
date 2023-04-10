package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for States in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyStatesLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in States Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void statesBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in States Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void statesBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void statesPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void statesReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void statesCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void statesRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void statesTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyStatesTaboolaFeedValidation(serverType);
	}
}
