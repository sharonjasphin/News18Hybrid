package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodySportsSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_SportsSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_SportsSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_SportsSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_SportsSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_SportsSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_SportsSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_sportsArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_sportsArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_sportsArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_sportsArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_sportsArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_sportsArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_sportsArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_sportsArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_sportsArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_sportsArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifySportsArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifySportsTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_SportsArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifySportsArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifySportsArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileArticleConsumptionPage.verifySportsArticleAboutTheAuthorNavigation(serverType);
	}
}
