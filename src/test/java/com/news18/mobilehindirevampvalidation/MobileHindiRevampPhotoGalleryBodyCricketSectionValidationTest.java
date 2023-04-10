package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyCricketSectionValidationTest extends MobileCommonConfig {

//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
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
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Breadcrumb in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TitleAndLastUpdatedTime in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleSocialMedia in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketPhotoArticleNumberingAndCaptionValidation () {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Expand Function present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotoGalleryExpandValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoArticleExpandNavigation(serverType);
	}
	/**
	 * @author Anupam Gupta
	 * This method is used to validate Top ads present inside article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotoGalleryHeaderAdsValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCricketPhotoArticleTopAdsNavigation(serverType);
	}

}
