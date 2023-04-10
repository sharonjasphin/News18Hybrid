package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyKnowledgeWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	@Test
	public void knowledgePhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void knowledgePhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void knowledgePhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleAuthorNavigation(serverType);
	}
	
//	@Test
	public void knowledgePhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Knowledge ArticleConsumption Page.
	 */
	@Test
	public void knowledgePhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void knowledgePhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void knowlegdePhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//==Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotoGalleryArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotoArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgeArticleExpandNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Knowledge Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyKnowledgePhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyKnowledgePhotoArticleUpArrowNavigation(serverType);
	}
}
