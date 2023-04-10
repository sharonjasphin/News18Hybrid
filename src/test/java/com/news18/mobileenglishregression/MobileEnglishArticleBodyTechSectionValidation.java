package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyTechSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_TechSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_TechSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_TechSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_TechSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_TechSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_TechSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_techArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_techArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_techArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_techArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_techArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_techArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_techArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_techArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_techArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_techArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyTechArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTechTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_TechArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTechArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyTechArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.verifyTechArticleAboutTheAuthorNavigation(serverType);
	}

}
