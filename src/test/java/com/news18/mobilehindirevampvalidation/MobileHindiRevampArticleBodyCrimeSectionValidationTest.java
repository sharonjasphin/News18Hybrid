package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyCrimeSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneCrimeSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCrimeSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCrimeSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCrimeSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCrimeSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneCrimeSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCrimeSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test 
	public void crimeArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in crime ArticleConsumption Page.
	 */
	@Test
	public void crimeArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in crime ArticleConsumption Page.
	 */
	@Test
	public void crimeArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleHighlightValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in crime ArticleConsumption Page.
	 */
	@Test
	public void crimeArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleDescriptionHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in crime ArticleConsumption Page.
	 */
	@Test
	public void crimeArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleTrendingValidation(serverType);	
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleGoogleNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimeArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleTaboolaValidation(serverType);
	}
	
	
	//====Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeTagNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCrimeArticleConclusionNavigation(serverType);
	}

}
