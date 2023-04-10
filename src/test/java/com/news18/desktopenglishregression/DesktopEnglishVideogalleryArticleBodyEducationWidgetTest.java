package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishVideogalleryArticleBodyEducationWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_04_educationVideoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_05_educationVideoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_05_educationVideoArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	@Test
	public void vid_Consumption_05_educationVideoArticleShowMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleShowMoreDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_07_educationVideoArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_12_educationVideoArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyCommonVideogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void vid_Consumption_08_VerifyEducationSectionVideoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopVideoConsumptionPage.verifyEducationSectionVideoArticleTopRhsAdsValidation(serverType);
	}
}
