package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileEnglishArticleBodyBusinessSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_BusinessSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_BusinessSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_BusinessSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_BusinessSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_BusinessSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_BusinessSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_businessArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_businessArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_businessArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_businessArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_businessArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_businessArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_businessArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_businessArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_businessArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_businessArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyBusinessArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyBusinessTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_BusinessArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyBusinessArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyBusinessArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.verifyBusinessArticleAboutTheAuthorNavigation(serverType);
	}
}
