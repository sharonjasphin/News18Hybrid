package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyPoliticsWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_politicsLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_politicsLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_politicsLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_politicsLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyPoliticsLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyPoliticsLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyPoliticsLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampLiveblogPage.verifyPoliticsLiveBlogReadMoreSectionValidation(serverType);
	}
}
