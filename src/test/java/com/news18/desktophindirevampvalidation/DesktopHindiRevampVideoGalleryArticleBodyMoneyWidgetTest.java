package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyMoneyWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Money Video Consumption Page.
	 */
	@Test
	public void moneyVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Money Video Consumption Page.
	 */
	@Test
	public void moneyVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Money Video Consumption Page.
	 */
	@Test
	public void moneyVideoArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Money Video Consumption Page.
	 */
	@Test
	public void moneyVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleRHSTaboolaValidation(serverType);
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation in Line one Article Consumption Page
	 */
	@Test
	public void moneyVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Line one Article Consumption Page
	 */
	@Test
	public void moneyVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	
}
