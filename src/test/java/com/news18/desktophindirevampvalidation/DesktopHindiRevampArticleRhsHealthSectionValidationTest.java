package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsHealthSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoHealthSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}
	
}
