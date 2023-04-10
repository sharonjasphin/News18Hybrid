package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyPradeshWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void pradeshPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void pradeshPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void pradeshPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void pradeshPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void pradeshPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Pradesh ArticleConsumption Page.
	 */
	@Test
	public void pradeshPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void statesPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void statesPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshPhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Pradesh Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPradeshPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneStatesLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPradeshPhotoArticleUpArrowNavigation(serverType);
	}
}
