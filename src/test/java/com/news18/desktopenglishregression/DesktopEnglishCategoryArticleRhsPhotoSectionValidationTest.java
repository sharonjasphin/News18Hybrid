package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsPhotoSectionValidationTest extends DesktopCommonConfig{
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section PhotoGallery Title
	 */
	@Test
	public void  photo_Landing_14_AutoSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Auto Section PhotoGallery Articles
	 */
	@Test
	public void  photo_Landing_14_AutoSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	} 

	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Live Tv Functionality
	 */
	@Test
	public void  photo_Landing_13_AutoSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
}
