package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyLatestNewsLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Latest News Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void latestNewsPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Latest News Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void latestNewsReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void latestNewsCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	public void latestNewsBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void latestNewsBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void latestnewsTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	@Test
	public void latestNewsBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
