package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyEntertainmentSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneEntertainmentSectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneEntertainmentSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Entertainment ArticleConsumption Page.
	 */
	@Test 
	public void entertainmentArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleTrendingValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of TitleAndLastUpdatedTime in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Article Agency in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Social Media in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Google News in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ReadMore in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Taboola in Entertainment ArticleConsumption Page.
	 */
	@Test
	public void entertainmentArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void entertainmentPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void entertainmentPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentTagsNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentArticleConclusionNavigation(serverType);
	}
	


}
