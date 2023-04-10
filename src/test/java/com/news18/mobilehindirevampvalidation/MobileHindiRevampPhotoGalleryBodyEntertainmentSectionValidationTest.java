package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyEntertainmentSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
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
	
	@Test
	public void entertainmentPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void entertainmentPhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	@Test
	public void entertainmentPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test(priority = -1)
	public void entertainmentPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void entertainmentPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Food ArticleConsumption Page.
	 */
	@Test
	public void entertainmentPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleTaboolaFeedNavigation(serverType);
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
	
	//Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentPhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Entertainment Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyEntertainmentPhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotoArticleTopAdsNavigation(serverType);
	}


}
