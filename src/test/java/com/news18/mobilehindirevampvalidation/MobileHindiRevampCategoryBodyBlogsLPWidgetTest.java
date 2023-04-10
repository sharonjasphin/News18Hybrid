package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyBlogsLPWidgetTest extends MobileCommonConfig {

	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Blog Category Body in Hindi Revamp Category Landing Page.
	 */
	public void blogsBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.navigateToBlogsLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyBlogsBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Blog Section Author List.
	 */
	@Test
	public void blogsSectionAuthorListValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToBlogsLink();
		pages.mobileHindiRevampCategoryLandingPage.verfyAuthorListPresntOnBody(serverType);;
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Blog Section Author List.
	 */
	@Test
	public void blogsSectionAuthorTextBoxValidation()
	{
		pages.mobileHindiRevampLandingPage.navigateToBlogsLink();
		pages.mobileHindiRevampCategoryLandingPage.verfyAuthorTextBoxPresntOnBody(serverType);;
	}
}
