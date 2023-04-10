package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyLatestNewsWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in LatestNews Video Article Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in LatestNews Video Article Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in LatestNews Video Article Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigationin LatestNews Video Article Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in LatestNews Video Article Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Lifestyle Video Consumption Page.
	 */
	@Test
	public void latestNewsVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleRHSTaboolaValidation(serverType);
	}
	
	
}
