package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyLifestyleWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_lifestyleLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyLifeStyleLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyLifeStyleLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyLifeStyleLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampLiveblogPage.verifyLifeStyleLiveBlogReadMoreSectionValidation(serverType);
	}
}
