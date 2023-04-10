package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyBusinessWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_businessLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_businessLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_businessLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_businessLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Business Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyBusinessLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyBusinessLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Business Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyBusinessLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyBusinessLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Business Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyBusinessLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyBusinessLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Business Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyBusinessLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyBusinessRHSTagsNavigation(serverType);
	}
}
