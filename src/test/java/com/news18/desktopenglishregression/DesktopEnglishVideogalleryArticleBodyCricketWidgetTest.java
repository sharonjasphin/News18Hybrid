package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyCricketWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_cricketVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_cricketVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_cricketVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	@Test
	public void vid_Consumption_05_cricketVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_cricketVideoArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_cricketVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketVideogalleryArticleRHSTaboolaValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyCricketSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopVideoConsumptionPage.verifyCricketSectionVideoArticleTopRhsAdsValidation(serverType);
	}
}
