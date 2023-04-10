package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyMoviesWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_moviesVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_moviesVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_moviesVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	@Test
	public void vid_Consumption_05_moviesVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_moviesVideoArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_moviesVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleRHSTaboolaValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyMoviesSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopVideoConsumptionPage.verifyMoviesSectionVideoArticleTopRhsAdsValidation(serverType);
	}



}
