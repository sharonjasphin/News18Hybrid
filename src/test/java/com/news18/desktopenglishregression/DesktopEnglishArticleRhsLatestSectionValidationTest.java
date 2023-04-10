package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsLatestSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_LatestSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_LatestSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_LatestSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_LifeStyleSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_LifeStyleSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_LifeStyleSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_RhsLineTwoLatestSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_RhsLineTwoLatestSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
