package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyJobWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void jobPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Jobs ArticleConsumption Page.
	 */
	@Test
	public void jobPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Job ArticleConsumption Page.
	 */
	@Test
	public void jobPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Job ArticleConsumption Page.
	 */
	@Test
	public void jobPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	@Test
	public void jobPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void jobPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void jobPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleAuthorNavigation(serverType);
	}
	
//	@Test
	public void jobPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void jobsPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void jobsPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Jobs Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyJobsPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneJobsLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyJobsPhotoArticleUpArrowNavigation(serverType);
	}
	
}
