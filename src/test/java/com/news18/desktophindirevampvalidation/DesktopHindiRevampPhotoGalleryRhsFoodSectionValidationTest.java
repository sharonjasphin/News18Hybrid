package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotoGalleryRhsFoodSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSTrendingArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneFoodSectionRHSTrendingReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingReadMoreNavigation(serverType);
	}
	
}
