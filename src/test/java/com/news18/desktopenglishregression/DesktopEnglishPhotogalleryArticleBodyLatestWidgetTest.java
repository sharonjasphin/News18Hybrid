package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyLatestWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_latestPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_latestPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_latestPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_latestPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_latestPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_latestPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_latestPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_latestPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_LatestArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyLatestSectionPhotoArticleCountValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_LatestSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyLatestSectionPhotoArticleTopRhsAdsValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_LatestSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyLatestSectionPhotoAdsBetweenArticleValidation(serverType);
	}


}
