package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyShowshaWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_showshaLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_showshaLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_showshaLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_showshaLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyShowshaLiveblogLoadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyShowshaLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyShowshaLiveBlogReadMoreSectionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyShowshaLiveBlogReadMoreSectionValidation(serverType);
	}
}
