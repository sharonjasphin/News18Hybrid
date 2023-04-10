package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyWorldSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
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
	 * This method is used to verify the navigation of Breadcrumb in World ArticleConsumption Page.
	 */
	@Test
	public void worldPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ArticleTitleAndLastUpdatedTimeb in World ArticleConsumption Page.
	 */
	@Test
	public void worldPhotogalleryArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in World ArticleConsumption Page.
	 */
	@Test
	public void worldPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleAgencyNavigation(serverType);
	}
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in World ArticleConsumption Page.
	 */
	
	@Test
	public void worldPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in World ArticleConsumption Page.
	 */
	@Test
	public void worldPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in World ArticleConsumption Page.
	 */
	@Test
	public void worldPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void worldPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void worldPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}	
	
	//===Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldPhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for World Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyWorldPhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyWorldPhotoArticleExpandNavigation(serverType);
	}
}
