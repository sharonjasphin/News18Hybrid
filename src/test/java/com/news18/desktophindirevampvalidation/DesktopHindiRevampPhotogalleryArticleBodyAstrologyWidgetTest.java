package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampPhotogalleryArticleBodyAstrologyWidgetTest  extends DesktopCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Social Media Icons Navigation inside the Money ArticleConsumption Page.
	 */
	@Test
	public void astrologyPhotogalleryArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void astrologyPhotogalleryArticleTitleAndLastUpdateTimeNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void astrologyPhotogalleryArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void astrologyPhotogalleryArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void astrologyDescriptionNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleDescriptionValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Astrology ArticleConsumption Page.
	 */
	@Test
	public void astrologyPhotogalleryArticleBreadcrumbNavigation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Astrology ArticleConsumption Page.
	 */
	@Test
	public void astrologyPhotogalleryArticleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Astrology ArticleConsumption Page.
	 */
	@Test
	public void astrologyPhotogalleryArticleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotogalleryArticleRHSTaboolaValidation(serverType);
	}
	
	//---Anupam
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyPhotoGalleryArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotoGalleryArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Expand function in article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleExpandValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotoArticleExpandNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate DownArrow function in article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyPhotogalleryDownArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotoArticleDownArrowNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate UpArrow function in article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyPhotogalleryUpArrowValidation()
	{
	//	navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyPhotoArticleUpArrowNavigation(serverType);
	}
}
