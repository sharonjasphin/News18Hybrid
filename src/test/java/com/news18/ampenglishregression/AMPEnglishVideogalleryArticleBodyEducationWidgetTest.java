package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishVideogalleryArticleBodyEducationWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_04_educationVideoArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_educationVideoArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_educationVideoArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_07_educationVideoArticleTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampVideosArticlePage.verifyVideoSectionArticleTaboolaValidation(serverType);
	}

}
