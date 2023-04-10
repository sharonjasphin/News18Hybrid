package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyAjabGajabWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void ajabGajabPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in AjabGajab ArticleConsumption Page.
	 */
	@Test
	public void ajabGajabPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in AjabGajab ArticleConsumption Page.
	 */
	@Test
	public void ajabGajabPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleTaboolaFeedNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in AjabGajab ArticleConsumption Page.
	 */
	@Test
	public void ajabGajabPhotogalleryArticleTaboolaFeedsRHSValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleRHSTaboolaNavigation(serverType);
	}
	
	@Test
	public void ajabGajabPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void ajabGajabPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void ajabGajabPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleAuthorNavigation(serverType);
	}
	
//	@Test
	public void ajabGajabPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoAjabGajabPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoAjabGajabPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//---Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabPhotoGalleryArticleTopRHSAdsValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabPhotoGalleryArticleExpandValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotoArticleExpandNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabPhotogalleryDownArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabPhotogalleryUpArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabPhotoArticleUpArrowNavigation(serverType);
	}
	
}
