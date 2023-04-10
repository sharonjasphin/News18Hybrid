package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class DesktopHindiRevampPhotogalleryArticleBodyCareerWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void careerPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void careerPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void careerPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void careerPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void careerPhotogalleryArticleDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Career ArticleConsumption Page.
	 */
	@Test
	public void careerPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Career ArticleConsumption Page.
	 */
	@Test
	public void careerPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Career ArticleConsumption Page.
	 */
	@Test
	public void careerPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoCareerPhotoArticleNumberingAndCaptionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lineTwoCareerPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	//===Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPhotoGalleryArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPhotoGalleryArticleExpandValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerPhotoArticleUpArrowNavigation(serverType);
	}
}
