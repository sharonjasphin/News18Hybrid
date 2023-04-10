package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyAstrologyWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Astrology Video Article Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Astrology Video Article Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Astrology Video Article Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigationin Astrology Video Article Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Astrology Video Article Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Astrology Video Consumption Page.
	 */
	@Test
	public void astrologyVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleRHSTaboolaValidation(serverType);
	}
}
