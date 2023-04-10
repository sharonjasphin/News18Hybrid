package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyLatestWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_latestLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_latestLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_latestLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_latestLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyLatestLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyLatestLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyLatestLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyLatestLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyLatestLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyLatestLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyLatestLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyLatestRHSTagsNavigation(serverType);
	}
}
