package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyMoviesWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_moviesLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_moviesLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_moviesLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_moviesLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyMoviesLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyMoviesLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyMoviesLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyMoviesLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyMoviesLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyMoviesLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyMoviesLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyMoviesRHSTagsNavigation(serverType);
	}
}
