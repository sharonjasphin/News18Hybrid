package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyMoneySectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
	@Test
	public void verifyLineOneMoneySectionPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneMoneySectionPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneMoneySectionPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneMoneySectionTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneMoneySectionTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void verifyLineOneMoneySectionTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyTopStoryReadMoreNavigation(serverType);
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
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Money ArticleConsumption Page.
	 * 
	 */
	@Test 
	public void moneyArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleHighlightValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description HeaderLink in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleDescriptionHeaderLinkNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTrendingValidation(serverType);	
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the  Title And LastUpdatedTime in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Agency Navigation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the SocialMedia Navigation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the GoogleNews Navigation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleGoogleNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Author Navigation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the DescriptionReadMore Navigation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Taboola Validation in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleTaboolaValidation(serverType);
	}
	

	//----Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Latest News widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyLatestNewsTagsNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyMoneyArticleConclusionNavigation(serverType);
	}
}
