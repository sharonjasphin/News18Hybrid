package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsIndiaSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_IndiaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_IndiaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_IndiaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_IndiaSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_IndiaSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_IndiaSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_IndiaSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_IndiaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
}
