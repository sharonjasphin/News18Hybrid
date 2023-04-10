package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyLifestyleWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_lifestyleLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_lifestyleLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_lifestyleLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyLifeStyleLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyLifeStyleLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyLifeStyleLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyLifeStyleLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyLifeStyleLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyLifeStyleLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyLifeStyleLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyLifeStyleRHSTagsNavigation(serverType);
	}
}
