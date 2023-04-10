package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyAutoWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void autoPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void autoPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void autoPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleAgencyNavigation(serverType);
	}
	

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void autoPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleAuthorNavigation(serverType);
	}
	

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void autoPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Auto ArticleConsumption Page.
	 */
	@Test
	public void autoPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Auto ArticleConsumption Page.
	 */
	@Test
	public void autoPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Auto ArticleConsumption Page.
	 */
	@Test
	public void autoPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoAutoPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoAutoPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//--Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPhotoGalleryArticleTopRHSAdsValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotoArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoPhotoArticleUpArrowNavigation(serverType);
	}
	
}
