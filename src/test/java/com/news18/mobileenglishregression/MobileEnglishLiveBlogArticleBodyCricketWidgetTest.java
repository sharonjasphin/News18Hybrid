package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyCricketWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_cricketLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_cricketLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_cricketLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyCricketLiveblogLoadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyCricketLiveBlogReadMoreSectionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneCricketLink();
		pages.mobileLiveblogPage.verifyCricketLiveBlogReadMoreSectionValidation(serverType);
	}
}
