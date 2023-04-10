package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsOpinionSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_OpinionSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_OpinionSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_OpinionSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_OpinionSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_OpinionSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_OpinionSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_OpinionSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_OpinionSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
