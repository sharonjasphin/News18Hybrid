package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyLatestMobileSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobilePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLatestMobileSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileTopStoryReadMoreNavigation(serverType);
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
	
	//---Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobileArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobileArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobileVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Latest Mobile Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestMobileArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestMobileArticleConclusionNavigation(serverType);
	}


}
