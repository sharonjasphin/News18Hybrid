package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishPhotogalleryArticleBodyHomepageWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_04_homepagePhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_homepagePhotogalleryArticleDetailedBoxValidation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_homepagePhotogalleryArticleAgencyNavigation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_homepagePhotogalleryArticleImageDescriptionValidation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_homepagePhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_05_homepagePhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_Mweb_07_homepagePhotogalleryArticleBodyTaboolaValidation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyHomepagePhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_homepageArticlePhotoCountValidation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyAutoSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_homepageSectionPhotoAdsBetweenArticleValidation()
	{
		pages.mobilePhotoGalleryConsumptionPage.verifyAutoSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
