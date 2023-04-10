package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotogalleryArticleBodyPhotoWidgetTest extends MobileCommonConfig {

	
	@Test
	public void photoSectionPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void photoSectionPhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	@Test
	public void photoSectionPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void photoSectionPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void photoSectionPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Food ArticleConsumption Page.
	 */
	@Test
	public void photoSectionPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyEntertainmentPhotogalleryArticleTaboolaFeedNavigation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photoSectionPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
	
	
}
