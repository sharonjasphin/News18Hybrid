package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyJobsLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Jobs Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void jobsPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Jobs Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void jobsReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void jobsCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Jobs Category Body in Hindi Revamp Category Landing Page.
	 */
	public void jobsBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Jobs Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void jobsBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void jobsTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void jobsBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToJobsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
