package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishVideogalleryArticleBodyVideosWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_04_videosSectionVideoArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneVideosLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_videosSectionVideoArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneVideosLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_videosSectionVideoArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneVideosLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_07_videosSectionVideoArticleTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneVideosLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleTaboolaValidation(serverType);
	}

}
