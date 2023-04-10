package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyMoviesWidgetTest extends DesktopCommonConfig
{

	@Test
	public void moviesArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void moviesArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	@Test
	public void moviesArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	@Test
	public void moviesArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void moviesArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void moviesArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void moviesArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void moviesArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void moviesArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void moviesArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void moviesArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void moviesArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void verifyMoviesArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyMoviesTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void verifyMoviesArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyMoviesArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void verifyMoviesArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyMoviesArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Movies Widget in English Page.
	 */
	@Test
	public void verifyMoviesArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopArticleConsumptionPage.verifyMoviesArticleAboutTheAuthorNavigation(serverType);
	}

}
