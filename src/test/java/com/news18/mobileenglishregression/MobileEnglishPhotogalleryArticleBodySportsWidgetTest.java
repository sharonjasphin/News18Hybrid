package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishPhotogalleryArticleBodySportsWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_04_sportsPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_sportsPhotogalleryArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_sportsPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_sportsPhotogalleryArticleImageDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_sportsPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_sportsPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_07_sportsPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_SportsArticlePhotoCountValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifySportsSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_SportsSectionPhotoAdsBetweenArticleValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobilePhotoGalleryConsumptionPage.verifySportsSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
