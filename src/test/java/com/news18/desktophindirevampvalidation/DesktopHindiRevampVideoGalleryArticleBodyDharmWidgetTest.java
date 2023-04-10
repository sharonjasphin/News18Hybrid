package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyDharmWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body RHS Taboola Feeds Validation in dharm Video Article Consumption Page.
	 */
	@Test
	public void dharmVideoArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleRHSTaboolaValidation(serverType);
	}
}
