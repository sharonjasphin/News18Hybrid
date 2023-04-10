package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyExplainersSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_ExplainersSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_ExplainersSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_ExplainersSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_ExplainersSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_ExplainersSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_ExplainersSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_explainersArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_explainersArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_explainersArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_explainersArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_explainersArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_explainersArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_explainersArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_explainersArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_explainersArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_explainersArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyExplainersArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyExplainersTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_ExplainersArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyExplainersArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyExplainersArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.verifyExplainersArticleAboutTheAuthorNavigation(serverType);
	}
}
