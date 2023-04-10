package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyShowshaWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_showshaLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_showshaLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_showshaLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyShowshaLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyShowshaLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyShowshaLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampLiveblogPage.verifyShowshaLiveBlogReadMoreSectionValidation(serverType);
	}
}
