package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsBuzzSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryBuzzSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryBuzzSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryBuzzSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryBuzzSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
