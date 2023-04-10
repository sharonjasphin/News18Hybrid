package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishPhotogalleryArticleBodyOpinionWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_04_opinionPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_opinionPhotogalleryArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_opinionPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_opinionPhotogalleryArticleImageDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_opinionPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_opinionPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_07_opinionPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_OpinionArticlePhotoCountValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyOpinionSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_OpinionSectionPhotoAdsBetweenArticleValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobilePhotoGalleryConsumptionPage.verifyOpinionSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
