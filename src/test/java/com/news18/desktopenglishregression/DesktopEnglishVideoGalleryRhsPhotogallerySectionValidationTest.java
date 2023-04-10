package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishVideoGalleryRhsPhotogallerySectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Photogallery Section Trending Videos Articles
	 */
	@Test
	public void vid_Consumption_09_VerifyRhsLineOnePhotogallerySectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Photogallery Section Trending Photos Articles
	 */
	@Test
	public void vid_Consumption_11_VerifyRhsLineOnePhotogallerySectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Photogallery Section Trending Video Down Ad
	 */
	@Test
	public void vid_Consumption_10_VerifyRhsLineOnePhotogallerySectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
}
