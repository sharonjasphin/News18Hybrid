package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyCricketWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_04_cricketLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_AMP_05_cricketLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyCricketLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyCricketLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampLiveblogPage.verifyCricketLiveBlogReadMoreSectionValidation(serverType);
	}

}
