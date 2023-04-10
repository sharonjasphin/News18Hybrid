package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyNews18MinisSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneNews18MinisSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	

/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneNews18MinisSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
 	@Test 
	public void news18MinisArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in knowledge ArticleConsumption Page.
	 */
	@Test
	public void news18MinisArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in knowledge ArticleConsumption Page.
	 */
	@Test
	public void news18MinisArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in knowledge ArticleConsumption Page.
	 */
	@Test
	public void news18MinisArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in knowledge ArticleConsumption Page.
	 */
	@Test
	public void news18MinisArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void news18MinisArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void news18MinisArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgeArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void news18MinisArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void news18MinisArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void news18MinisArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void news18MinisArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void news18MinisArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyNews18MinisArticleTaboolaValidation(serverType);
	}

}
