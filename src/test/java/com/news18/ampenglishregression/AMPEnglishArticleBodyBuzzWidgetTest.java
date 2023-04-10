package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyBuzzWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_04_buzzArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_buzzArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_buzzArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_buzzArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_buzzArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_08_buzzArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_buzzArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void article_Consumption_06_buzzArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_07_buzzArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_12_buzzArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyBuzzArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyBuzzTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_BuzzArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyBuzzArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyBuzzArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyBuzzArticleAboutTheAuthorNavigation(serverType);
	}
	
	//--Danish
	/**
	 * @author DanishR
	 * This method is used to verify Buzz TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyBuzzSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyBuzzSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz TrendingNews Readmore
	 */
	@Test
	public void std_Article_AMP_13_VerifyBuzzSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyBuzzSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyBuzzSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyBuzzSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneBuzzLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
