package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyMoneyWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void moneyPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Money ArticleConsumption Page.
	 */
	@Test
	public void moneyPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void moneyPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void moneyPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void moneyPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void moneyPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void moneyPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void moneyPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotoGalleryArticleTopRHSAdsValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotoGalleryArticleExpandValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotoArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Money Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyMoneyPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyMoneyPhotoArticleUpArrowNavigation(serverType);
	}
}
