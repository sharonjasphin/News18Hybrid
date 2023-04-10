package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsLifestyleSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryLifeStyleSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryLifeStyleSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryLifeStyleSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryLifeStyleSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
