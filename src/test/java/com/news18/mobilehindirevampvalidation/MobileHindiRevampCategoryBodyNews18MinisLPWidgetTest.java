package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for News18Minis in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyNews18MinisLPWidgetTest extends MobileCommonConfig {
	 
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in News18Minis Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void news18MinisBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyNews18MinisCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in News18Minis Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void news18MinisBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyNews18MinisCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
}
