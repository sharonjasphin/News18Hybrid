package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsBusinessSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_BusinessSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_BusinessSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_BusinessSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_BusinessSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_BusinessSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_BusinessSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_BusinessSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_BusinessSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
}
