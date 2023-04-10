package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotoGalleryRhsKnowledgeSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneKnowledgeSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneKnowledgeSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneKnowledgeSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoReadMoreNavigation(serverType);
	}
	
}
