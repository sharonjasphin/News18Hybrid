package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishPhotogalleryArticleBodyTechWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_04_techPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_techPhotogalleryArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_techPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_techPhotogalleryArticleImageDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_techPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_techPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_07_techPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_TechArticlePhotoCountValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyTechSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_TechSectionPhotoAdsBetweenArticleValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyTechSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
