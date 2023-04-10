package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyIndiaWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_indiaLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_indiaLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_indiaLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_indiaLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for India Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyIndiaLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyIndiaLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for India Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyIndiaLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyIndiaLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for India Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyIndiaLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyIndiaLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for India Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyIndiaLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyIndiaRHSTagsNavigation(serverType);
	}
}
