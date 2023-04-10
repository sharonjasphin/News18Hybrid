package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotoGalleryRhsPhotoSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineTwoLineTwoPhotoSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoCategoryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoPhotoSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoCategoryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoPhotoSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoCategoryPhotoReadMoreNavigation(serverType);
	}
	
}
