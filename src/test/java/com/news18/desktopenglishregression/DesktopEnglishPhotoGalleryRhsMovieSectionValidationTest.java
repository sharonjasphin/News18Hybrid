package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsMovieSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryMovieSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryMovieSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryMovieSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryMovieSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
