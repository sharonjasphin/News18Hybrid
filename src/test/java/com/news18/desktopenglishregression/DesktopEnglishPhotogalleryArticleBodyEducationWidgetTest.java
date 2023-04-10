package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishPhotogalleryArticleBodyEducationWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_04_educationPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_educationPhotogalleryArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void photo_Consumption_05_educationPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Description Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_educationPhotogalleryArticleImageDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageDescriptionValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_educationPhotogalleryArticleSocialMediaShareIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_05_educationPhotogalleryArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_07_educationPhotogalleryArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHSTaboolaFeed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_12_educationPhotogalleryArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyCommonPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Photo count present inside photo article consumption page for Education Widget in English Page.
	 */
	@Test
	public void photo_Consumption_05_EducationArticlePhotoCountValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyEducationSectionPhotoArticleCountValidation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void photo_Consumption_08_EducationSectionPhotoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyEducationSectionPhotoArticleTopRhsAdsValidation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate ads present between photo article consumption page for Education Widget in English Page.
	 */
	@Test
	public void photo_Consumption_06_EducationSectionPhotoAdsBetweenArticleValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopphotoGalleryConsumptionPage.verifyEducationSectionPhotoAdsBetweenArticleValidation(serverType);
	}

}
