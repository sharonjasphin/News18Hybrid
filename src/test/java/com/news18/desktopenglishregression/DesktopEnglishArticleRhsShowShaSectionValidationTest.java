package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsShowShaSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_ShowShaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_ShowShaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_ShowShaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_ShowshaSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_ShowshaSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_ShowshaSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_ShowshaSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_ShowshaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
