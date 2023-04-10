package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyLatestMobileSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLatestMobileSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	//==Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Latest Mobiles Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobilePhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobilePhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyFoodPhotoArticleTopAdsNavigation(serverType);
	}


}
