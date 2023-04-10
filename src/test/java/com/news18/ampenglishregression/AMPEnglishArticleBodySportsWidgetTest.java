package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodySportsWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_sportsArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_sportsArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_sportsArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_sportsArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_sportsArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_sportsArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_sportsArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_sportsArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_sportsArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_sportsArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifySportsArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifySportsTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_SportsArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifySportsArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifySportsArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifySportsArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Sports TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifySportsSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifySportsSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifySportsSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifySportsSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifySportsSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifySportsSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
