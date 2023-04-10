package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyDharmLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Dharm Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void dharmPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Latest News Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void dharmReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void dharmCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	public void dharmBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void dharmBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void dharmTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	@Test
	public void dharmBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToDharmLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
