package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyEntertainmentWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Entertainment Video Consumption Page.
	 */
	@Test
	public void entertainmentVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Entertainment Video Consumption Page.
	 */
	@Test
	public void entertainmentVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Entertainment Video Consumption Page.
	 */
	@Test
	public void entertainmentVideoArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Entertainment Video Consumption Page.
	 */
	@Test
	public void entertainmentVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleRHSTaboolaValidation(serverType);
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation in Line one Article Consumption Page
	 */
	@Test
	public void entertainmentVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Line one Article Consumption Page
	 */
	@Test
	public void entertainmentVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyEntertainmentVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	
}
