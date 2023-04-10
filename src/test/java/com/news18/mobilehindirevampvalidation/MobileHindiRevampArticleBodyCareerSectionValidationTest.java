package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyCareerSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneCareerSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCareerSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCareerSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCareerSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCareerSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCareerSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test 
	public void careerArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in Career ArticleConsumption Page.
	 */
	@Test
	public void careerArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in Career ArticleConsumption Page.
	 */
	@Test
	public void careerArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in Career ArticleConsumption Page.
	 */
	@Test
	public void careerArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in Career ArticleConsumption Page.
	 */
	@Test
	public void careerArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void careerArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void careerArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void careerArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void careerArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void careerArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void careerArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void careerArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleTaboolaValidation(serverType);
	}
	
	//Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerTagsNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerArticleConclusionNavigation(serverType);
	}

	
}
