package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodySportsWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_sportsPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_sportsPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_sportsPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_sportsPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_sportsPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_sportsPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_sportsPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_sportsPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_SportsArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifySportsSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_SportsSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifySportsSectionPhotoArticleTopRhsAdsValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_SportsSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifySportsSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
