package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampPhotoGalleryBodyCareerSectionValidationTest extends MobileCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}
	
/* Line One PhotoGallery Articles Validation Tests */
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesPhotoReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticlePhotoReadMoreNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryTitle() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryTitleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryArticles() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryArticleNavigation(serverType);
	}
	
	@Test
	public void lineOneCareerSectionPhotoGalleryArticlesTopStoryReadMore() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPhotoGalleryArticleTopStoryReadMoreNavigation(serverType);
	}

	@Test
	public void careerPhotogalleryArticleBreadcrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void careerPhotogalleryArticleArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleTitleLastUpdatedTimeAndDescriptionValidation(serverType);
	}	
	
	@Test
	public void careerPhotogalleryArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void careerPhotogalleryArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void careerPhotogalleryArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleAuthorNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the validation of TaboolaFeeds in Career ArticleConsumption Page.
	 */
	@Test
	public void careerPhotogalleryArticleTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotogalleryArticleTaboolaFeedNavigation(serverType);
	}
	
	//============================ Career
	
		/**
		 * @author SanjeebKumarPati
		 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
		 */
		@Test
		public void careerPhotoArticleNumberingAndCaptionValidation () {
			
			pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
			pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
			pages.mobileHindiRevampArticleConsumptionPage.verfyNumberingAndCaptionsOfPhotos(); 
		}
		
		/**
		 * @author SanjeebKumarPati
		 * This method is used to validate header LiveTv Presnt on Hindi header.
		 */
		@Test
		public void careerPhotoArticlePhotosDescriptionsInExpandedViewValidation () {
			
			pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
			pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
			pages.mobileHindiRevampArticleConsumptionPage.verfyPhotosDescriptionsInExpandedView();
		}
		
		//==Anupam
		/**
		 * @author Anupam Gupta
		 * This method is used to validate Expand Function present inside article consumption page for Career Widget in Hindi revamp Page.
		 */
		@Test
		public void verifyCareerPhotogalleryExpandValidation()
		{
//			navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
			pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
			pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotoArticleExpandNavigation(serverType);
		}
		/**
		 * @author Anupam Gupta
		 * This method is used to validate Top ads present inside article consumption page for Career Widget in Hindi revamp Page.
		 */
		@Test
		public void verifyCareePhotogalleryHeaderAdsValidation()
		{
//			navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
			pages.mobileHindiRevampLandingPage.clickOnLineOneCareerLink();
			pages.mobileHindiRevampArticleConsumptionPage.verifyCareerPhotoArticleTopAdsNavigation(serverType);
		}

}
