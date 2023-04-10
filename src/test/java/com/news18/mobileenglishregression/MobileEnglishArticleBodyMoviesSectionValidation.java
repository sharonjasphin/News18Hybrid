package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyMoviesSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_MoviesSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_MoviesSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_MoviesSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_MoviesSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_MoviesSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_MoviesSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_moviesArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_moviesArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_moviesArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_moviesArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_moviesArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_moviesArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_moviesArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_moviesArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_moviesArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_moviesArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyMoviesArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyMoviesTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_MoviesArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyMoviesArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyMoviesArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.verifyMoviesArticleAboutTheAuthorNavigation(serverType);
	}
}
