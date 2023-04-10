package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyOpinionWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_opinionArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_opinionArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_opinionArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_opinionArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_opinionArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_opinionArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_opinionArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_opinionArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_opinionArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_opinionArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyOpinionArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyOpinionTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_OpinionArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyOpinionArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyOpinionArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyOpinionArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Opinion TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyOpinionSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyOpinionSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyOpinionSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyOpinionSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyOpinionSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyOpinionSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneOpinionLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
