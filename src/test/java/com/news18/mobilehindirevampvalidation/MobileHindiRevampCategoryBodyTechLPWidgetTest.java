package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page forTech in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyTechLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates theTech Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void techPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates theTech Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void techReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation inTech Category Body in Hindi Revamp Category Landing Page.
	 */
	public void techBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present inTech Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void techBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void techTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void techBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToTechLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
