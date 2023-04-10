package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsCricketSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSPhotoTitleNavigation("");
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSPhotoArticleNavigation("");
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSPhotoReadMoreNavigation("");
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSTopStoryTitleNavigation("");
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSTopStoryArticleNavigation("");
	}
	
	@Test
	public void verifyLineOneCricketSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketRHSTopStoryReadMoreNavigation("");
	}
	
}
