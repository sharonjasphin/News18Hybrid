package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsShowshaSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryShowshaSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryShowshaSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryShowshaSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryShowshaSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
