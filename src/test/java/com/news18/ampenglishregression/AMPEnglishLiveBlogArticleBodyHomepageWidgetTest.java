package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class AMPEnglishLiveBlogArticleBodyHomepageWidgetTest extends MobileCommonConfig
{
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadCrumb navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_04_homepageLiveblogArticleBreadcrumbNavigation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleBreadcrumbNavigation(serverType);
	} 

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleDetailedBoxValidation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleAgencyNavigation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleAuthorNavigation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleImageSocialMediaIconNavigation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleISocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Read More Link in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleDescriptionReadMoreValidation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleDescriptionReadMoreValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Image Social Media Icon Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_Mweb_05_homepageLiveblogArticleLiveFeedsReadMoreNavigation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleLiveFeedsReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Keyevents Text Validation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void live_Blog_05_homepageLiveblogArticleKeyEventValidation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleKeyEventsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlight Section Validation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void live_Blog_05_homepageLiveblogArticleHighlightValidation()
	{
		pages.ampLiveblogPage.verifyHomepageLiveblogArticleHighlightValidation(serverType);
	}
	
	//--Anupam
	
		/***
		 * @author AnupamGupta
		 * This method is used to validate Load More present inside LiveBlog article consumption page for Explainers Widget in English Page.
		 */
		@Test
		public void live_Blog_06_VerifyHomePageLiveblogLoadMoreNavigation()
		{
			pages.ampLiveblogPage.verifyExplainersLiveblogLoadMoreNavigation(serverType);
		}
		
		
		/***
		 * @author AnupamGupta
		 * This method is used to validate Read more present at bottom inside LiveBlog article consumption page for Explainers Widget in English Page.
		 */
		@Test
		public void live_Blog_07_VerifyHomePageLiveBlogReadMoreSectionValidation()
		{
			pages.ampLiveblogPage.verifyExplainersLiveBlogReadMoreSectionValidation(serverType);
		}
}
