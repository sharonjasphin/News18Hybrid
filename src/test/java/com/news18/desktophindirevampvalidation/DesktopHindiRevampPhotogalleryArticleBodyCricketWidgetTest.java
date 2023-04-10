package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyCricketWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void cricketPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void cricketPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void cricketPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleAuthorNavigation(serverType);
	}
	
//	@Test
	public void cricketPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Cricket ArticleConsumption Page.
	 */
	@Test
	public void cricketPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==-Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotoGalleryArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotoGalleryArticleExpandValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotoGalleryArticleExpandNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Cricket Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCricketPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCricketPhotoArticleUpArrowNavigation(serverType);
	}
}
