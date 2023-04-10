package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodySahityaWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void sahityaPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void sahityaPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void sahityaPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void sahityaPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void sahityaPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of BreadCrumb in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Sahitya ArticleConsumption Page.
	 */
	@Test
	public void sahityaPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoSahityaPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoSahityaPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaNewsArticleExpandNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Sahitya Widget in Hindi revamp Page.
	 */
	@Test
	public void verifySahityaPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifySahityaPhotoArticleUpArrowNavigation(serverType);
	}
}
