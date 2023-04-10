package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyBuzzSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_BuzzSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_BuzzSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_BuzzSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_BuzzSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_BuzzSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_BuzzSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_buzzArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_buzzArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test(priority = -1)
	public void std_Article_Mweb_05_buzzArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_buzzArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_buzzArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_buzzArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_buzzArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_buzzArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_buzzArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_buzzArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyBuzzArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyBuzzTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_BuzzArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyBuzzArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyBuzzArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.verifyBuzzArticleAboutTheAuthorNavigation(serverType);
	}
}
