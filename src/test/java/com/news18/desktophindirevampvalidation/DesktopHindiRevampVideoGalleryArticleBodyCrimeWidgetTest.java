package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyCrimeWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Crime Video Consumption Page.
	 */
	@Test
	public void crimeVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Crime Video Consumption Page.
	 */
	@Test
	public void crimeVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Crime Video Consumption Page.
	 */
	@Test
	public void crimeVideoArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Crime Video Consumption Page.
	 */
	@Test
	public void crimeVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleRHSTaboolaValidation(serverType);
	}

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation in Line one Article Consumption Page
	 */
	@Test
	public void crimeVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Line one Article Consumption Page
	 */
	@Test
	public void crimeVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	
}
