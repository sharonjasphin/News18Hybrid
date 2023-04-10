package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsPhotoSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Photos Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryPhotosSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Photos Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryPhotosSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Photos Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryPhotosSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Photos Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryPhotosSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOnePhotosLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
