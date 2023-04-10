package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyAstrologyWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_astrologyLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_astrologyLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_astrologyLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_astrologyLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyAstrologyLiveblogLoadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveblogLoadMoreNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyAstrologyLiveBlogReadMoreSectionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileLiveblogPage.verifyAstrologyLiveBlogReadMoreSectionValidation(serverType);
	}
}
