package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyExplainersWidgetTest extends MobileCommonConfig {
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_explainersArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_explainersArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_explainersArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_explainersArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_explainersArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_explainersArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_explainersArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_explainersArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_explainersArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_explainersArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyExplainersArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyExplainersTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_ExplainersArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyExplainersArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyExplainersArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyExplainersArticleAboutTheAuthorNavigation(serverType);
	}
	
	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Explainers TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyExplainersSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyExplainersSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyExplainersSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Explainers MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyExplainersSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyExplainersSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyExplainersSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneExplainersLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
