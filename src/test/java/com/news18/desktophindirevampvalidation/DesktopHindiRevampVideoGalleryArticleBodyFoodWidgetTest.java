package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyFoodWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Food Video Consumption Page.
	 */
	@Test
	public void foodVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Food Video Consumption Page.
	 */
	@Test
	public void foodVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Food Video Consumption Page.
	 */
	@Test
	public void foodVideoArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Food Video Consumption Page.
	 */
	@Test
	public void foodVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleRHSTaboolaValidation(serverType);
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation in Line one Article Consumption Page
	 */
	@Test
	public void foodVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Line one Article Consumption Page
	 */
	@Test
	public void foodVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFoodVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	
}
