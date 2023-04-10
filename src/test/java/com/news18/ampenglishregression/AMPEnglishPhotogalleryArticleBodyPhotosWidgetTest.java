package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyPhotosWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_04_photoSectionPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_photoSectionPhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_photoSectionPhotogalleryArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_photoSectionPhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_photoSectionPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_photoSectionPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_07_photoSectionPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Photo Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_PhotoArticlePhotoCountValidation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Photo Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_PhotoSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampLandingPage.clickOnLineOnePhotosLink();
		pages.ampPhotoArticleConsumptionPage.verifyPhotoSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
