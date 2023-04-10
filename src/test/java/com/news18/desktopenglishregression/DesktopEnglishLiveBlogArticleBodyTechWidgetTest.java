package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishLiveBlogArticleBodyTechWidgetTest extends DesktopCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_04_techLiveblogArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleImageSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_08_techLiveblogArticleBodyTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RHS Taboola Feed Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void photo_Consumption_15_techLiveblogArticleRHSTaboolaValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleRHSTaboolaValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleKeyEventValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_techLiveblogArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}

	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyTechLiveblogLoadMoreNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyTechLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyTechLiveBlogReadMoreSectionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyTechLiveBlogReadMoreSectionValidation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_09_VerifyTechLiveBLogRHSTopAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyTechLiveBLogRHSTopAdsValidation(serverType);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside LiveBlog article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void live_Blog_14_VerifyTechLiveBLogRHSTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyTechRHSTagsNavigation(serverType);
	}
}
