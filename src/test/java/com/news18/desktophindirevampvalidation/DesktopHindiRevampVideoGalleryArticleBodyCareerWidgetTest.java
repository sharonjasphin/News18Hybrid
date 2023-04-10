package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyCareerWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigation Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body RHS Taboola Feeds Validation in Career Video Article Consumption Page.
	 */
	@Test
	public void careerVideoArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleRHSTaboolaValidation(serverType);
	}
	
	
}
