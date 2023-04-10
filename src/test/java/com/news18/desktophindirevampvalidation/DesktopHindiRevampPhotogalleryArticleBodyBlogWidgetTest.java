package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyBlogWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void blogPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the navigation of breadCrumb in Blog ArticleConsumption Page.
	 */
	@Test
	public void blogPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Blog ArticleConsumption Page.
	 */
	@Test
	public void blogPhotogalleryArticleTaboolaFeedsvalidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of RHSTaboolaFeeds in Blog ArticleConsumption Page.
	 */
	@Test
	public void blogPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	@Test
	public void blogPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void blogPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticlePhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void blogPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticlePhotogalleryArticleAuthorNavigation(serverType);
	}
	
//	@Test
	public void blogPhotogalleryArticleDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	//Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPhotoGalleryArticleTopRHSAdsValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPhotoGalleryArticleExpandValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogArticleExpandNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPhotogalleryDownArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Blog Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPhotogalleryUpArrowValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyBlogPhotoArticleUpArrowNavigation(serverType);
	}
}
