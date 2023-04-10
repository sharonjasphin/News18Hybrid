package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsBuzzSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_BuzzSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_BuzzSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_BuzzSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_BuzzSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_BuzzSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_BuzzSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_BuzzSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation("live");
	}
	
	@Test
	public void article_Consumption_17_BuzzSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
