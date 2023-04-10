package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodySahityaSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneSahityaSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneSahityaSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneSahityaSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneSahityaSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneSahityaSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneSahityaSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	

/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneSahityaSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Sahitya ArticleConsumption Page.
	 */
	@Test 
	public void sahityaArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleTrendingValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the TitleAndLastUpdatedTime in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of GoogleNewsin Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ReadMore in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the TaboolaFeeds in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleTaboolaValidation(serverType);
	}
	
	
	//====-Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneSahityaLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifySahityaArticleConclusionNavigation(serverType);
	}
}
