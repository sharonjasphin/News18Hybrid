package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyWorldWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_04_worldArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_worldArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_worldArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_worldArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_worldArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_08_worldArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_worldArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void article_Consumption_06_worldArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_07_worldArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_12_worldArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyWorldArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyWorldTagsNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_WorldArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyWorldArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyWorldArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyWorldArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify World TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyWorldSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify World TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyWorldSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify World TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyWorldSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify World MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyWorldSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify World Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyWorldSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify World Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyWorldSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneWorldLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
