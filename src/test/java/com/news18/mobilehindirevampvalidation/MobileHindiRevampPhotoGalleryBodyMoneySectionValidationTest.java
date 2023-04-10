package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyMoneySectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneMoneySectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	@Test
	public void moneyPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void moneyPhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	@Test
	public void moneyPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void moneyPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void moneyPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Food ArticleConsumption Page.
	 */
	@Test
	public void moneyPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleTaboolaFeedNavigation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void moneyPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void moneyPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyPhotoArticleTopAdsNavigation(serverType);
	}
}
