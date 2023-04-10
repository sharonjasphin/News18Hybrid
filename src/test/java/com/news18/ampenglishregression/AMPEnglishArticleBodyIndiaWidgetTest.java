package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyIndiaWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_indiaArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_indiaArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_indiaArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_indiaArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_indiaArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_indiaArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_indiaArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_indiaArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_indiaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_indiaArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyIndiaArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyIndiaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_IndiaArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyIndiaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyIndiaArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampArticleConsumptionPage.verifyIndiaArticleAboutTheAuthorNavigation(serverType);
	}
	
	//--DanishR
		/**
		 * @author DanishR
		 * This method is used to verify India TrendingNews Title
		 */
		@Test
		public void std_Article_AMP_13_VerifyIndiaSectionTrendingNewsTitle() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify India TrendingNews Articles
		 */
		@Test
		public void std_Article_AMP_13_VerifyIndiaSectionTrendingNewsArticles() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify India TrendingNews Title
		 */
		@Test
		public void std_Article_AMP_13_VerifyIndiaSectionTrendingNewsReadMore() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
		}

		/**
		 * @author DanishR
		 * This method is used to verify India MoreNews Articles
		 */
		@Test
		public void std_Article_AMP_14_VerifyIndiaSectionMoreNewsArticles() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify India Photogallery Title
		 */
		@Test
		public void std_Article_AMP_15_VerifyIndiaSectionPhotoGalleryTitle() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
		}
		
		/**
		 * @author DanishR
		 * This method is used to verify India Photogallery Articles
		 */
		@Test
		public void std_Article_AMP_15_VerifyIndiaSectionPhotoGalleryArticles() {
			pages.ampLandingPage.clickOnLineOneIndiaLink();
			pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
		}
}
