package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyNationSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneNationSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNationSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneNationSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test 
	public void nationArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in nation ArticleConsumption Page.
	 */
	@Test
	public void nationArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in nation ArticleConsumption Page.
	 */
	@Test
	public void nationArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in nation ArticleConsumption Page.
	 */
	@Test
	public void nationArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in nation ArticleConsumption Page.
	 */
	@Test
	public void nationArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void nationArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void nationArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void nationArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void nationArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void nationArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void nationArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void nationArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleTaboolaValidation(serverType);
	}
	
	//=====Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNationArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNationArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Nation Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNationVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Nation Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyNationArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNationArticleConclusionNavigation(serverType);
	}
}
