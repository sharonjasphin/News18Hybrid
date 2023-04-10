package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiRevampVideoGalleryArticleBodyAjabGajabWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in AjabGajab Video Article Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Date-Time-Channel Description in AjabGajab Video Article Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleDateTimeChannelValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDateTimeChannelDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify Article Description in AjabGajab Video Article Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Social Share Navigationin AjabGajab Video Article Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleSocialShareValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleSocialShareValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Body Taboola Feeds Validation in AjabGajab Video Article Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleTaboolaFeedsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in AjabGajab Video Consumption Page.
	 */
	@Test
	public void ajabGajabVideoArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCommonVideoArticleRHSTaboolaValidation(serverType);
	}
}
