package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyDharmWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void dharmPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void dharmPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void dharmPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void dharmPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * 
	 */
//	@Test
	public void dharmPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleDescriptionValidation(serverType);
	}
	

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Dharm ArticleConsumption Page.
	 */
	@Test
	public void dharmPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Dharm ArticleConsumption Page.
	 */
	@Test
	public void dharmPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Dharm ArticleConsumption Page.
	 */
	@Test
	public void dharmPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoDharmPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoDharmPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//---Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmPhotoArticleUpArrowNavigation(serverType);
	}
}
