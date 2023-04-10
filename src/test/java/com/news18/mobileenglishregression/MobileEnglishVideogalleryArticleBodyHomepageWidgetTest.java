package com.news18.mobileenglishregression;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinaKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishVideogalleryArticleBodyHomepageWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_04_homepageVideoArticleBreadcrumbNavigation()
	{
		pages.mobileVideosArticlePage.verifyHomepageVideogalleryArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Video Consumption Page in English Desktop Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_homepageVideoArticleDetailedBoxValidation()
	{
		pages.mobileVideosArticlePage.verifyHomepageVideogalleryArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Social Media Share_Icon in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_05_homepageVideoArticleSocialMediaShareIconNavigation()
	{
		pages.mobileVideosArticlePage.verifyHomepageVideogalleryArticleSocialMediaShareIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Validation in Video Consumption Page in English Mobile Page.
	 */
	@Test
	public void vid_Consumption_Mweb_07_homepageVideoArticleTaboolaValidation()
	{
		pages.mobileVideosArticlePage.verifyHomepageVideogalleryArticleTaboolaValidation(serverType);
	}

}
