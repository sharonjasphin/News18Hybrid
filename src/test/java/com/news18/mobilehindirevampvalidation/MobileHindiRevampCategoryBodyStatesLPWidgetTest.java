package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for States in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyStatesLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Money Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void statesPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the States Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void statesReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in States Category Body in Hindi Revamp Category Landing Page.
	 */
	public void statesBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in States Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void statesBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void statesCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
}
