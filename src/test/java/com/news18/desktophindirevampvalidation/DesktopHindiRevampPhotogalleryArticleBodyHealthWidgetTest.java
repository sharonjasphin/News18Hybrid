package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyHealthWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void healthPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void healthPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void healthPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void healthPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void healthPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Health ArticleConsumption Page.
	 */
	@Test
	public void healthPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Health ArticleConsumption Page.
	 */
	@Test
	public void healthPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Health ArticleConsumption Page.
	 */
	@Test
	public void healthPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoHealthPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoHealthPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//--Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthPhotoArticleUpArrowNavigation(serverType);
	}
}
