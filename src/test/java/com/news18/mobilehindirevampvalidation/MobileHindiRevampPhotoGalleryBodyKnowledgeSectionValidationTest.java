package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyKnowledgeSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneKnowledgeSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Breadcrumb in health ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ArticleTitleAndLastUpdatedTime in health ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in health ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in health ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in health ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Food ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void knowledgePhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void knowledgePhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyKnowledgePhotoArticleTopAdsNavigation(serverType);
	}

}
