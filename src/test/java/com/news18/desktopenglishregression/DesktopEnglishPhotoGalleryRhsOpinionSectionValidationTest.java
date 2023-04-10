package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsOpinionSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryOpinionSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryOpinionSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryOpinionSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryOpinionSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
