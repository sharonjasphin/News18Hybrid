package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsWorldSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_WorldSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_WorldSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_WorldSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_WorldSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_WorldSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
