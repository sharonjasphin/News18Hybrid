package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyLatestSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_LatestSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_LatestSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_LatestSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_LatestSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_LatestSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_LatestSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_latestArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_latestArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_latestArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_latestArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_latestArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_latestArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_latestArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_latestArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_latestArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_latestArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyLatestArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyLatestTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_LatestArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyLatestArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyLatestArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLatestLink();
		pages.mobileArticleConsumptionPage.verifyLatestArticleAboutTheAuthorNavigation(serverType);
	}
}
