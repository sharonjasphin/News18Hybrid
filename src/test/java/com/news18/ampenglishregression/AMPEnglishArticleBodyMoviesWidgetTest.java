package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyMoviesWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_04_moviesArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_05_moviesArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_05_moviesArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_05_moviesArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_05_moviesArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_08_moviesArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_05_moviesArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English amp Page.
	 */
	//	@Test
	public void std_Article_AMP_06_moviesArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_07_moviesArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English amp Page.
	 */
	@Test
	public void std_Article_AMP_12_moviesArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyMoviesArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyMoviesTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_MoviesArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyMoviesArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyMoviesArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyMoviesArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Movie TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyMovieSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Movie TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyMovieSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Movie TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyMovieSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Movie MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyMovieSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Movie Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyMovieSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Movie Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyMovieSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
