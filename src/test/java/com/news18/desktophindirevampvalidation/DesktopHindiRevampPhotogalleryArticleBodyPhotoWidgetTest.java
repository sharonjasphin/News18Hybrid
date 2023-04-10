package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyPhotoWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void photoPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void photoPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void photoPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void photoPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoPhotogalleryArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void photoPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in PhotoSection ArticleConsumption Page.
	 */
	@Test
	public void photoSectionPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotosectionPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in PhotoSection ArticleConsumption Page.
	 */
	@Test
	public void photoSectionPhotogalleryArticleTaboolaFeeds() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotosectionPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in PhotoSection ArticleConsumption Page.
	 */
	@Test
	public void photoSectionPhotogalleryArticleRHSTaboolaFeeds() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotosectionPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwophotoSectionPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwophotoSectionPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoArticleTopRHSAdsValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoArticleDownArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Photo Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoArticleUpArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyPhotoArticleUpArrowNavigation(serverType);
	}
	
}
