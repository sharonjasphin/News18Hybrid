package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyAstrologySectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneAstrologySectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneAstrologySectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneAstrologySectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneAstrologySectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneAstrologySectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneAstrologySectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
	/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneAstrologySectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
 //===Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyAstrologyTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyAstrologyArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyAstrologyVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyAstrologyArticleConclusionNavigation(serverType);
	}
}
