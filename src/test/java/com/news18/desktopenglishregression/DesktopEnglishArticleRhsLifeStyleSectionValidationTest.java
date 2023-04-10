package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsLifeStyleSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_LifeStyleSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_LifeStyleSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_LifeStyleSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_LatestSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_LatestSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_LatestSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_RhsLineTwoLifeStyleSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_RhsLineTwoLifeStyleSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
