package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsNationSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneNationSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}
	
}
