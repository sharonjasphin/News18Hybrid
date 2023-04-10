package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsTechSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneTechSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneTechSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneTechSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneTechSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneTechSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneTechSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneTechLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}
	
}
