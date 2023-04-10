package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodySportsWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_sportsLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_sportsLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_sportsLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_sportsLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifySportsLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifySportsLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifySportsLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifySportsLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifySportsLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifySportsLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifySportsLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifySportsRHSTagsNavigation(serverType);
	}
}
