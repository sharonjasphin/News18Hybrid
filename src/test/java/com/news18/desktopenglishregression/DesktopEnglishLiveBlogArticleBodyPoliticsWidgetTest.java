package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyPoliticsWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_polititcsLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_polititcsLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_polititcsLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_polititcsLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyPoliticsLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyPoliticsLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyPoliticsLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyPoliticsLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyPoliticsLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyPoliticsLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyPoliticsLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyPoliticsRHSTagsNavigation(serverType);
	}
}
