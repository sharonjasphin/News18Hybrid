package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyKnowledgeSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneKnowledgeSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	

/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
 	@Test 
	public void knowledgeArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgeArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void knowledgeArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void knowledgeArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void knowledgeArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void knowledgeArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void knowledgeArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void knowledgeArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void knowledgeArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTaboolaValidation(serverType);
	}
	
	//----Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgeArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleConclusionNavigation(serverType);
	}

}
