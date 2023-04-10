package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishPhotogalleryArticleBodyShowshaWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_04_showshaPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_showshaPhotogalleryArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_showshaPhotogalleryArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_showshaPhotogalleryArticleImageDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_showshaPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer Social Media Follow_Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_05_showshaPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_AMP_07_showshaPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_ShowshaArticlePhotoCountValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyShowshaSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_ShowshaSectionPhotoAdsBetweenArticleValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampPhotoArticleConsumptionPage.verifyShowshaSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
