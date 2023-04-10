package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Crime in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyCrimeLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Crime Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void crimePriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Crime Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void crimeReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Crime Category Body in Hindi Revamp Category Landing Page.
	 */
	public void crimeBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Crime Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void crimeBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void crimeCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void crimeTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void crimeBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
