package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyCrimeWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void crimePhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimePhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimePhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void crimePhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void crimePhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Crime ArticleConsumption Page.
	 */
	@Test
	public void crimePhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Crime ArticleConsumption Page.
	 */
	@Test
	public void crimePhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Crime ArticleConsumption Page.
	 */
	@Test
	public void crimePhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void crimePhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void crimePhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==-Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePhotoGalleryArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPhotoGalleryArticleExpandValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimeArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotoArticleDownArrowNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Crime Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCrimePhotoArticleUpArrowNavigation(serverType);
	}
}
