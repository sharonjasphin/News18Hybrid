package com.news18.mobileenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class MobileEnglishLiveBlogArticleBodyLifestyleWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_lifestyleLiveblogArticleBreadcrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_lifestyleLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleKeyEventValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_lifestyleLiveblogArticleHighlightValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyCommonLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam

	/***
	 * @author AnupamGupta
	 * This method is used to validate Load More present inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_06_VerifyLifeStyleLiveblogLoadMoreNavigation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyLifeStyleLiveblogLoadMoreNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void live_Blog_07_VerifyLifeStyleLiveBlogReadMoreSectionValidation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyLifeStyleLiveBlogReadMoreSectionValidation(serverType);
	}
}
