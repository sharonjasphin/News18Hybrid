package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampArticleBodyPodcastWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of breadCrumb in Podcast ArticleConsumption Page.
	 */
	@Test 
	public void podcastArticleBreadcrumbNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAgency in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleAgencyNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the  TitleAndLastUpdatedTime in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleTitleAndLastUpdatedTimeValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of SocialMedia in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleSocialMediaNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of GoogleNews in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleGoogleNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleGoogleNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of ArticleAuthor in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleAuthorNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleAuthorNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Description  in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleDescriptionHeaderLinkNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleDescriptionHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Related News in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleRelatedNewsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Highlights Section in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleHighlightsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleHighlightValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the navigation of Trending Widgets in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleTrendingNavigation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleTrendingValidation(serverType);	
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the ReadMore in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleDescriptionReadMoreValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the TaboolaFeeds in Podcast ArticleConsumption Page.
	 */
	@Test
	public void podcastArticleTaboolaValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleTaboolaValidation(serverType);
	}
	
	//====Anupam
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Tags present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPodcastArticleTagsNavigation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastTagsNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPodcastArticleFirstPublishedAndAuthorValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Video between articles present in consumption page for Podcast Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPodcastVideoBetweenArticleValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastVideoBetweenArticleNavigation(serverType);
	}
	/***
	 * @author Anupam Gupta
	 * @param serverType
	 * This method is used to validate Article Conclusion present inside article consumption page for Podcast Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyPodcastArticleConclusionValidation()
	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
		pages.mobileHindiRevampLandingPage.clickOnLineOnePodcastLink();
		pages.mobileHindiRevampArticleConsumptionPage.verifyPodcastArticleConclusionNavigation(serverType);
	}

}
