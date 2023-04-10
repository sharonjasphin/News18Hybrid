package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyMoviesWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_moviesLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_moviesLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyMoviesLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyMoviesLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyMoviesLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOneMovieLink();
		pages.ampLiveblogPage.verifyMoviesLiveBlogReadMoreSectionValidation(serverType);
	}
}
