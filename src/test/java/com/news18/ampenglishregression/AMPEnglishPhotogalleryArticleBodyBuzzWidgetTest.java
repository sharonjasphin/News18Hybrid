package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyBuzzWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_04_buzzPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_buzzPhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_buzzPhotogalleryArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_buzzPhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_buzzPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_buzzPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_07_buzzPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_BuzzArticlePhotoCountValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyBuzzSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_BuzzSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampPhotoArticleConsumptionPage.verifyBuzzSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
