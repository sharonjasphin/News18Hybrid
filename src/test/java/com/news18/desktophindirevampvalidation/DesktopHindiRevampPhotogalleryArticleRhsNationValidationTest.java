package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleRhsNationValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSTrendingArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneNationSectionRHSTrendingReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingReadMoreNavigation(serverType);
	}
	
}
