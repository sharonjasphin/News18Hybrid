package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyStatesSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneStatesSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneStatesSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneStatesSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneStatesSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneStatesSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneStatesSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneStatesSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Pradesh ArticleConsumption Page.
	 */
	@Test 
	public void pradeshArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void pradeshArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void pradeshArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void pradeshArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void pradeshArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void pradeshArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void pradeshArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void pradeshArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleTaboolaValidation(serverType);
	}
	
	//===---Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyStateArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyStateArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyStateVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyStateArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPradeshArticleConclusionNavigation(serverType);
	}


}
