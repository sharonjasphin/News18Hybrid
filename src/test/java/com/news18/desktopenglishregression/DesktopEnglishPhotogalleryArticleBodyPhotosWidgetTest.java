package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyPhotosWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_photosPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_photosPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_photosPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_photosPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_photosPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_photosPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_photosPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_photosPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Photo Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_PhotoArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_PhotoSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotoArticleTopRhsAdsValidation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Photo Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_PhotoSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyPhotoSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
