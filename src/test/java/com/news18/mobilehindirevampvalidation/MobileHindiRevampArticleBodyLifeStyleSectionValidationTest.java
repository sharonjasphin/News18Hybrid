package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyLifeStyleSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneLifeStyleSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneLifeStyleSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test 
	public void lifeStyleArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in lifeStyle ArticleConsumption Page.
	 */
	@Test
	public void lifeStyleArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in lifeStyle ArticleConsumption Page.
	 */
	@Test
	public void lifeStyleArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in lifeStyle ArticleConsumption Page.
	 */
	@Test
	public void lifeStyleArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in lifeStyle ArticleConsumption Page.
	 */
	@Test
	public void lifeStyleArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void lifeStyleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void lifeStyleArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void lifeStyleArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void lifeStyleArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void lifeStyleArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void lifeStyleArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void lifeStyleArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleTaboolaValidation(serverType);
	}
	
	//====Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeStyleArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeStyleArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeStyleVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Life-Style Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeStyleArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLifeStyleArticleConclusionNavigation(serverType);
	}

}
