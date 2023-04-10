package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsLatestSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryLatestSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryLatestSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryLatestSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryLatestSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
