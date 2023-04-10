package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyShowshaSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_ShowshaSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_ShowshaSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_ShowshaSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_ShowshaSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_ShowshaSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_ShowshaSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_showshaArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_showshaArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_showshaArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_showshaArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_showshaArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_showshaArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_showshaArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_showshaArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_showshaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_showshaArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyShowshaArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyShowshaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Poilitics Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_ShowshaArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyShowshaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Poilitics Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyShowshaArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileArticleConsumptionPage.verifyShowshaArticleAboutTheAuthorNavigation(serverType);
	}
}
