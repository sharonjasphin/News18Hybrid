package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyBlogWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Blog Video Article Consumption Page.
	 */
	@Test
	public void blogsVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in Blog Video Article Consumption Page.
	 */
	@Test
	public void blogsVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in Blog Video Article Consumption Page.
	 */
	@Test
	public void blogsVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigationin Blog Video Article Consumption Page.
	 */
	@Test
	public void blogsVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in Blog Video Article Consumption Page.
	 */
	@Test
	public void blogsVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Blog Video Consumption Page.
	 */
	@Test
	public void blogsVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogsVideoArticleRHSTaboolaValidation(serverType);
	}
}
