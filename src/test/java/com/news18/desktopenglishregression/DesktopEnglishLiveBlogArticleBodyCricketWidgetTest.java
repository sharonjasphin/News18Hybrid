package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyCricketWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_cricketLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_cricketLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_cricketLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogArticleHighlightValidation(serverType);
	}


	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyCricketLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyCricketLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyCricketLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyCricketLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopLiveblogPage.verifyCricketRHSTagsNavigation(serverType);
	}
}
