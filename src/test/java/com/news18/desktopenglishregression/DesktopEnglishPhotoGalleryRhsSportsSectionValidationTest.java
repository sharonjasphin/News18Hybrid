package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsSportsSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogallerySportsSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogallerySportsSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogallerySportsSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogallerySportsSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
