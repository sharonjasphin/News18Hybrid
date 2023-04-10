package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishPhotoGalleryRhsExplainersSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section MoreNews Articles
	 */
	@Test
	public void photo_Consumption_11_VerifyPhotogalleryExplainersSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsMoreNewsArticleConsumptionNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section PhotoGallery Title
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryExplainersSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section PhotoGallery Articles
	 */
	@Test
	public void photo_Consumption_09_VerifyPhotogalleryExplainersSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyRhsPhotoGalleryArticleConsumptionarticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section PhotoGallery Ad
	 */
	@Test
	public void photo_Consumption_10_VerifyPhotogalleryExplainersSectionRHSPhotogalleryDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopphotoGalleryConsumptionPage.verifyArticleRHSPhotoGalleryDownAdNavigation(serverType);
	}
}
