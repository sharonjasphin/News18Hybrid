package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyTechWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_techLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_techLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyTechLiveblogLoadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyTechLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyTechLiveBlogReadMoreSectionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileLiveblogPage.verifyTechLiveBlogReadMoreSectionValidation(serverType);
	}
}
