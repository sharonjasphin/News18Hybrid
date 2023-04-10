package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyLatestNewsWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void latestNewsPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in LatestNews ArticleConsumption Page.
	 */
	@Test
	public void latestNewsPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in LatestNews ArticleConsumption Page.
	 */
	@Test
	public void latestNewsPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in LatestNews ArticleConsumption Page.
	 */
	@Test
	public void latestNewsPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestNewsPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestPhotogalleryArticleNewsAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void latestPhotogalleryArticleNewsAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void latestNewsPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoLatestPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoLatestPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsPhotoArticleUpArrowNavigation(serverType);
	}
}
