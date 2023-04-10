package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyOpinionSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_OpinionSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_OpinionSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_OpinionSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_OpinionSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_OpinionSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_OpinionSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_opinionArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_opinionArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_opinionArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_opinionArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_opinionArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_opinionArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_opinionArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_opinionArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_opinionArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_opinionArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyOpinionArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyOpinionTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_OpinionArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyOpinionArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyOpinionArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.verifyOpinionArticleAboutTheAuthorNavigation(serverType);
	}
}
