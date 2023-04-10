package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyWorldWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_04_worldPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_worldPhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_worldPhotogalleryArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_worldPhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_worldPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_worldPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_07_worldPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for World Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_WorldArticlePhotoCountValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyWorldSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for World Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_WorldSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampPhotoArticleConsumptionPage.verifyWorldSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
