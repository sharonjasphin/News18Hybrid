package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyAstrologyWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_astrologyLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_astrologyLiveblogArticleKeyEventValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_astrologyLiveblogArticleHighlightValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyAstrologyLiveblogLoadMoreNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyAstrologyLiveBlogReadMoreSectionValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampLiveblogPage.verifyAstrologyLiveBlogReadMoreSectionValidation(serverType);
	}
}
