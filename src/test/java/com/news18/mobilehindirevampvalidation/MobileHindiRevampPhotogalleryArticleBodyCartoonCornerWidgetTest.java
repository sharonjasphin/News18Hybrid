package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotogalleryArticleBodyCartoonCornerWidgetTest extends MobileCommonConfig {

	
	@Test
	public void cartoonPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void cartoonPhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	@Test
	public void cartoonPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void cartoonPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void cartoonPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in cartoon ArticleConsumption Page.
	 */
	@Test
	public void cartoonPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCartoonPhotogalleryArticleTaboolaFeedNavigation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void cartoonCornerPhotoArticleNumberingAndCaptionValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cartoonCornerPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCartoonCornerLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
	}
}
