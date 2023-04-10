package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsMoviesSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_MovieSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_MovieSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_MovieSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_MovieSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_MovieSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_MovieSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
