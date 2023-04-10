package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsEducationSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("engUrl"));
	}
	
	@Test
	public void article_Consumption_14_EducationSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_EducationSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_14_EducationSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_16_EducationSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_EducationSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_18_EducationSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_15_EducationSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	@Test
	public void article_Consumption_17_EducationSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}

}
