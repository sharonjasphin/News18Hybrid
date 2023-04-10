package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyCricketSectionValidationTest extends MobileCommonConfig {

//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}

	@Test
	public void verifyLineOneCricketSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoTitleNavigation(serverType);
	}

	@Test
	public void verifyLineOneCricketSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoArticleNavigation(serverType);
	}

	@Test
	public void verifyLineOneCricketSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoReadMoreNavigation(serverType);
	}

	@Test
	public void verifyLineOneCricketSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketTopStoryTitleNavigation(serverType);
	}

	@Test
	public void verifyLineOneCricketSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketTopStoryArticleNavigation(serverType);
	}

	@Test
	public void verifyLineOneCricketSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketTopStoryReadMoreNavigation(serverType);
	}

	/* Line One PhotoGallery Articles Validation Tests */

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}

	@Test
	public void lineOneCricketSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in cricket ArticleConsumption Page.
	 */
	@Test 
	public void cricketArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Related News in cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Highlights Section in cricket ArticleConsumption Page.
	 */
//	@Test
	public void cricketArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleHighlightValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Description HeaderLink in cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of Trending Widgets in cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleTrendingValidation(serverType);	
	}
	
	@Test
	public void cricketArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void cricketArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void cricketArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void cricketArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void cricketArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void cricketArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void cricketArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleTaboolaValidation(serverType);
	}
	
	//=====Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketTagsNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketArticleConclusionNavigation(serverType);
	}


}
