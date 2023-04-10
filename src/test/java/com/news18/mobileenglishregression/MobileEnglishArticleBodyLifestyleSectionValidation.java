package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyLifestyleSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_LifestyleSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_LifestyleSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_LifestyleSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_LifestyleSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_LifestyleSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_LifestyleSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_lifestyleArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_lifestyleArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_lifestyleArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_lifestyleArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_lifestyleArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_lifestyleArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_lifestyleArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_lifestyleArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_lifestyleArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_lifestyleArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyLifeStyleArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyLifeStyleTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_LifeStyleArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyLifeStyleArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyLifeStyleArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.verifyLifeStyleArticleAboutTheAuthorNavigation(serverType);
	}
}
