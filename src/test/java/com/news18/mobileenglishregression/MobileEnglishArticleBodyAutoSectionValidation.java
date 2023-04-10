package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyAutoSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_AutoSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_AutoSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_AutoSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_AutoSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_AutoSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_AutoSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_autoArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_autoArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_autoArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_autoArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_autoArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_autoArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_autoArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_autoArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_autoArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_autoArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyAutoArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_AutoArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyAutoArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAutoLink();
		pages.mobileArticleConsumptionPage.verifyAutoArticleAboutTheAuthorNavigation(serverType);
	}
}
