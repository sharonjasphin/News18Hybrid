package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Entertainment in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyEntertainmentLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates theEntertainment Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void entertainmentPriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates theEntertainment Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Entertainment Category Body in Hindi Revamp Category Landing Page.
	 */
	public void entertainmentBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present inEntertainment Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void entertainmentBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void entertainmentTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void entertainmentBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
