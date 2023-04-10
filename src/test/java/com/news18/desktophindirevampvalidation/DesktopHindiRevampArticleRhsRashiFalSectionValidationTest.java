package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsRashiFalSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoAstrologySectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}

}
