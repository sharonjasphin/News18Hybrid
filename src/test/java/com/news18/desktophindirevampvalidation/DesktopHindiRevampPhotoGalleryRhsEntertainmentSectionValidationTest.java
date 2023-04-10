package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotoGalleryRhsEntertainmentSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneEntertainmentSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneEntertainmentSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneEntertainmentSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoReadMoreNavigation(serverType);
	}
}
