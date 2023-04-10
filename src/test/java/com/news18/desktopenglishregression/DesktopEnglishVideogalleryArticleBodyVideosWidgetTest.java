package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyVideosWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_videosSectionVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_videosSectionVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_videosSectionVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	@Test
	public void vid_Consumption_05_videosSectionVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_videosSectionVideoArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_videosSectionVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleRHSTaboolaValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Videos Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyVideoSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopVideoConsumptionPage.verifyVideoSectionVideoArticleTopRhsAdsValidation(serverType);
	}


}
