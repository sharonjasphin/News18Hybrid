package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyAutoWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_autoLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_autoLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_autoLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_autoLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyAutoLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyAutoLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyAutoLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyAutoLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyAutoLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyAutoLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyAutoLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyAutoRHSTagsNavigation(serverType);
	}
}
