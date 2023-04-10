package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsVideoSectionValidationTest extends DesktopCommonConfig{
	
	/**
	 * @author DanishR
	 * This method is used to verify Video Section TrendingVideo Article
	 */
	@Test
	public void video_Landing_18_VideoSectionRHSTrendingVideosArticles() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSTrendingVideoNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Videos Section TrendingNews Article
	 */
	@Test
	public void video_Landing_19_VideoSectionRHSTrendingPhotosArticle() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSTrendingPhotoNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Videos Section Live Tv Functionality
	 */
	@Test
	public void  video_Landing_16_VideosSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneVideosLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
}
