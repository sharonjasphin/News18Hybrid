package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyExplainersWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_explainersPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_explainersPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_explainersPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_explainersPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_explainersPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_explainersPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_explainersPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_explainersPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleRHSTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Education Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_ExplainersArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyExplainersSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_ExplainersSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyExplainersSectionPhotoArticleTopRhsAdsValidation(serverType);
	}
	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_ExplainersSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyExplainersSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
