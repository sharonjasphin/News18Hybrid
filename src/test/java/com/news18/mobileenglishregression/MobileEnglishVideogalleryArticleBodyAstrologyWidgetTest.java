package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishVideogalleryArticleBodyAstrologyWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_04_astrologyVideoArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileVideosArticlePage.verifyAstrologyVideoArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_astrologyVideoArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileVideosArticlePage.verifyAstrologyVideoArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_astrologyVideoArticleSocialMediaShareIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileVideosArticlePage.verifyAstrologyVideoArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_07_astrologyVideoArticleTaboolaValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileVideosArticlePage.verifyAstrologyVideoArticleTaboolaValidation(serverType);
	}

}
