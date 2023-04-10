package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishVideogalleryArticleBodyAstrologyWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_04_astrologyVideoArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampVideosArticlePage.verifyAstrologyVideoArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_astrologyVideoArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampVideosArticlePage.verifyAstrologyVideoArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_05_astrologyVideoArticleSocialMediaShareIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampVideosArticlePage.verifyAstrologyVideoArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_AMP_07_astrologyVideoArticleTaboolaValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampVideosArticlePage.verifyAstrologyVideoArticleTaboolaValidation(serverType);
	}

}
