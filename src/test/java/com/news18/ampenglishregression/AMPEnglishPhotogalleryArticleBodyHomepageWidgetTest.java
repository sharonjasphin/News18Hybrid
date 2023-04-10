package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyHomepageWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English AMP Page.
	 */
	@Test
	public void photo_Consumption_AMP_04_homepagePhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English AMP Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_homepagePhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English AMP Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_homepagePhotogalleryArticleAgencyNavigation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_homepagePhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_homepagePhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_homepagePhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_07_homepagePhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyHomepagePhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_homepageArticlePhotoCountValidation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyAutoSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_homepageSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampPhotoArticleConsumptionPage.verifyAutoSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
