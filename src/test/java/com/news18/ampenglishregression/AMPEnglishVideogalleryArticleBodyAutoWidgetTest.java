package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinaKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishVideogalleryArticleBodyAutoWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_04_autoVideoArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampVideosArticlePage.verifyCommonVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_autoVideoArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampVideosArticlePage.verifyCommonVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_autoVideoArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampVideosArticlePage.verifyCommonVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_07_autoVideoArticleTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampVideosArticlePage.verifyCommonVideogalleryArticleTaboolaValidation(serverType);
	}

}
