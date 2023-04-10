package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsExplainerSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_ExplainerSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_ExplainerSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_ExplainerSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_ExplainerSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_ExplainerSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_ExplainerSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_RhsLineTwoExplainersSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_RhsLineTwoExplainersSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
}
