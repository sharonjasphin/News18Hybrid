package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsPoliticsSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryPoliticsSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryPoliticsSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryPoliticsSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryPoliticsSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
