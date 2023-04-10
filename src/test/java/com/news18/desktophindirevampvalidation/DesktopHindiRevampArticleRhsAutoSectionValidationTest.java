package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsAutoSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAutoSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneAutoSectionRHSTrendingTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingTitleNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneAutoSectionRHSTrendingArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingArticleNavigation(serverType);
	}
	
	@Test
	public void verifyRhsLineOneAutoSectionRHSTrendingReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTrendingReadMoreNavigation(serverType);
	}
	
}
