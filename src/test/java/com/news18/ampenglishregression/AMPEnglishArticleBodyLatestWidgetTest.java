package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyLatestWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_04_latestArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_latestArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_latestArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_latestArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_latestArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_08_latestArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_latestArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void article_Consumption_06_latestArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_07_latestArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_12_latestArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyLatestArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyLatestTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_LatestArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyLatestArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyLatestArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampArticleConsumptionPage.verifyLatestArticleAboutTheAuthorNavigation(serverType);
	}
	
	//--DanishR
		/**
		 * @author DanishR
		 * This method is used to verify Latest TrendingNews Title
		 */
		@Test
		public void std_Article_AMP_13_VerifyLatestSectionTrendingNewsTitle() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify Latest TrendingNews Articles
		 */
		@Test
		public void std_Article_AMP_13_VerifyLatestSectionTrendingNewsArticles() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify Latest TrendingNews Title
		 */
		@Test
		public void std_Article_AMP_13_VerifyLatestSectionTrendingNewsReadMore() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
		}

		/**
		 * @author DanishR
		 * This method is used to verify Latest MoreNews Articles
		 */
		@Test
		public void std_Article_AMP_14_VerifyLatestSectionMoreNewsArticles() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify Latest Photogallery Title
		 */
		@Test
		public void std_Article_AMP_15_VerifyLatestSectionPhotoGalleryTitle() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify Latest Photogallery Articles
		 */
		@Test
		public void std_Article_AMP_15_VerifyLatestSectionPhotoGalleryArticles() {
			pages.ampLandingPage.clickOnLineOneLatestLink();
			pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
		}
}
