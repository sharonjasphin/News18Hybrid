package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyOpinionWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_opinionLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_opinionLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_opinionLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_opinionLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyOpinionLiveblogLoadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyOpinionLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyOpinionLiveBlogReadMoreSectionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyOpinionLiveBlogReadMoreSectionValidation(serverType);
	}
}
