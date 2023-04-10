package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsTechSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_TechSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_TechSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_TechSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_TechSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_TechSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_TechSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_RhsLineTwoTechSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_RhsLineTwoTechSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
}
