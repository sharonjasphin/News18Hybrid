package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyHealthSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneHealthSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneHealthSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneHealthSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneHealthSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneHealthSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneHealthSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneHealthSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test 
	public void healthArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in health ArticleConsumption Page.
	 */
	@Test
	public void healthArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in health ArticleConsumption Page.
	 */
	@Test
	public void healthArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in health ArticleConsumption Page.
	 */
	@Test
	public void healthArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in health ArticleConsumption Page.
	 */
	@Test
	public void healthArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void healthArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void healthArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void healthArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void healthArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void healthArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void healthArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void healthArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleTaboolaValidation(serverType);
	}
	
	//---Anupam
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneHealthLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyHealthArticleConclusionNavigation(serverType);
	}

}
