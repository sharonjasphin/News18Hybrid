package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotoGalleryRhsNaukriSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSTrendingArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingArticleNavigation(serverType);
	}
	
	@Test
	public void verifyPhotoGalleryRhsLineOneJobsSectionRHSTrendingReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoGalleryRhsTrendingReadMoreNavigation(serverType);
	}
	
}
