package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyCricketWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_cricketPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_cricketPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_cricketPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_cricketPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_cricketPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_cricketPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_cricketPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_cricketPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_CricketArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_CricketSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketSectionPhotoArticleTopRhsAdsValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_CricketSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCricketSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
