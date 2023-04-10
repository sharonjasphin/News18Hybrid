package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampArticleRhsSahityaSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSPhotoTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSPhotoArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSPhotoReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSTopStoryTitle() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSTopStoryArticles() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineTwoLineTwoSahityaSectionRHSTopStoryReadMore() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRhsTopStoryReadMoreNavigation(serverType);
	}

}
