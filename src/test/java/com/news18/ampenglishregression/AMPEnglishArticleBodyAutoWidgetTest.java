package com.news18.ampenglishregression;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyAutoWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_autoArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_autoArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_autoArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_autoArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_autoArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_autoArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_autoArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_autoArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_autoArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_autoArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyAutoArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_AutoArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyAutoArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyAutoArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyAutoSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyAutoSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Readmore
	 */
	@Test
	public void std_Article_AMP_13_VerifyAutoSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Auto MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyAutoSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto PhotoGallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyAutoSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto PhotoGallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyAutoSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneAutoLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
