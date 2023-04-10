package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyAutoWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_autoVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_autoVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_autoVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Show More Description Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_autoVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_autoVideoArticleTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_autoVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleRHSTaboolaValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyAutoSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopVideoConsumptionPage.verifyAutoSectionVideoArticleTopRhsAdsValidation(serverType);
	}

}
