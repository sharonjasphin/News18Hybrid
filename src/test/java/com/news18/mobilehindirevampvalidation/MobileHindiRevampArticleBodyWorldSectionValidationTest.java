package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyWorldSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneWorldSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneWorldSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneWorldSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneWorldSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneWorldSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneWorldSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneWorldSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in World ArticleConsumption Page.
	 */
	@Test 
	public void worldArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleTrendingValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the  TitleAndLastUpdatedTim in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of GoogleNews in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ReadMore in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the TaboolaFeeds in World ArticleConsumption Page.
	 */
	@Test
	public void worldArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleTaboolaValidation(serverType);
	}
	
	//=====Anupam

	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldTagNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldArticleConclusionNavigation(serverType);
	}
}
