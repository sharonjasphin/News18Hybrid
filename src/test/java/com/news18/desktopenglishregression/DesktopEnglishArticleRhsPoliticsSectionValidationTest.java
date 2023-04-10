package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsPoliticsSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void Article_Consumption_14_PoliticsSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_14_PoliticsSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_14_PoliticsSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_16_PoliticsSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_18_PoliticsSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_18_PoliticsSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_15_PoliticsSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void Article_Consumption_17_PoliticsSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
