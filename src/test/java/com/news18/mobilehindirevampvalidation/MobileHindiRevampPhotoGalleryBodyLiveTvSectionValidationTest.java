package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyLiveTvSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLiveTvSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLiveTvPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}


}
