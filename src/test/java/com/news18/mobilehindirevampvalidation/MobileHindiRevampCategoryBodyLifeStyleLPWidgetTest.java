package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for LifeStyle in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyLifeStyleLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the LifeStyle Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void lifeStylePriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the LifeStyle Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void lifeStyleReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in LifeStyle Category Body in Hindi Revamp Category Landing Page.
	 */
	public void lifeStyleBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in LifeStyle Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void lifeStyleBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void lifeStyleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void lifeStyleBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
