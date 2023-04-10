package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsAutoSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_AutoSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_AutoSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_AutoSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	

	@Test
	public void article_Consumption_16_AutoSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_AutoSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_AutoSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_AutoSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_AutoSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
