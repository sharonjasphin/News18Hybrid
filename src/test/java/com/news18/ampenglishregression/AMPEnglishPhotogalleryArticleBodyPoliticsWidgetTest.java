package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyPoliticsWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_04_politicsPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_politicsPhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_politicsPhotogalleryArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_politicsPhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_politicsPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_politicsPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_07_politicsPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_PoliticsArticlePhotoCountValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyPoliticsSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_PoliticsSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampPhotoArticleConsumptionPage.verifyPoliticsSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
