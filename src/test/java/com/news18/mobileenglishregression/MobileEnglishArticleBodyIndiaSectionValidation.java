package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyIndiaSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_IndiaSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_IndiaSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_IndiaSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_IndiaSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_IndiaSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_IndiaSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_indiaArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_indiaArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_indiaArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_indiaArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_indiaArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_indiaArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_indiaArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_indiaArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_indiaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_indiaArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyIndiaArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.verifyIndiaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_IndiaArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyIndiaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyIndiaArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileArticleConsumptionPage.verifyIndiaArticleAboutTheAuthorNavigation(serverType);
	}
}
