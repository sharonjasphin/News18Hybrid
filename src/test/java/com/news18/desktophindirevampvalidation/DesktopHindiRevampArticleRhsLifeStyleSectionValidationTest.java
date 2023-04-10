package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsLifeStyleSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifestyleSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneLifestyleSectionRHSTrendingTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingTitleNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneLifestyleSectionRHSTrendingArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingArticleNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneLifestyleSectionRHSTrendingReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingReadMoreNavigation(serverType);
	}
	
}
