package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyFoodSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneFoodSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneFoodSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneFoodSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneFoodSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneFoodSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneFoodSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	

/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneFoodSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Food ArticleConsumption Page.
	 */
	@Test 
	public void foodArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTrendingValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Title And LastUpdatedTime in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Google News in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Article Authorin Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ReadMore in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of TaboolaFeeds in Food ArticleConsumption Page.
	 */
	@Test
	public void foodArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void foodPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void foodPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}

	
	//----Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyFoodArticleTagsNavigation()
	{
		//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyFoodTagsNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyFoodArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyFoodArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Food Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyFoodVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyFoodVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Food Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyFoodArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyFoodArticleConclusionNavigation(serverType);
	}

}
