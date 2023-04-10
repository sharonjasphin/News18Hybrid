package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyWorldWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in World Video Consumption Page.
	 */
	@Test
	public void worldVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in World Video Consumption Page.
	 */
	@Test
	public void worldVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in World Video Consumption Page.
	 */
	@Test
	public void worldVideoArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in World Video Consumption Page.
	 */
	@Test
	public void worldVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleRHSTaboolaValidation(serverType);
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation in Line one Article Consumption Page
	 */
	@Test
	public void worldVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Line one Article Consumption Page
	 */
	@Test
	public void worldVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyWorldVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	
}
