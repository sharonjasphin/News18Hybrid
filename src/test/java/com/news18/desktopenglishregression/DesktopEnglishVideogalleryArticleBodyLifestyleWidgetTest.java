package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyLifestyleWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_lifestyleVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_lifestyleVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_lifestyleVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Show More Description Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_lifestyleVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_lifestyleVideoArticleTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_lifestyleVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleRHSTaboolaValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyLifeStyleSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopVideoConsumptionPage.verifyLifeStyleSectionVideoArticleTopRhsAdsValidation(serverType);
	}
}
