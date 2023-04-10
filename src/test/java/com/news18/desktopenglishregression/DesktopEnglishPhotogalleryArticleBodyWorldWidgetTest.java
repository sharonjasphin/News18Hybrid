package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyWorldWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_worldPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_worldPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_worldPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_worldPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_worldPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_worldPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_worldPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_worldPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for World Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_WorldArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyWorldSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_WorldSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyWorldSectionPhotoArticleTopRhsAdsValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for World Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_WorldSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopphotoGalleryConsumptionPage.verifyWorldSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
