package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinaKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishVideogalleryArticleBodyAutoWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_04_autoVideoArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileVideosArticlePage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_autoVideoArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileVideosArticlePage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_autoVideoArticleSocialMediaShareIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileVideosArticlePage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_07_autoVideoArticleTaboolaValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileVideosArticlePage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

}
