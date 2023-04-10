package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyAstrologySectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_AstrologySectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsAstrologyTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_AstrologySectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsAstrologyArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_AstrologySectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsAstrologyReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_AstrologySectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsAstrologyArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_AstrologySectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryAstrologyTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_AstrologySectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryAstrologyArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_astrologyArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_astrologyArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_astrologyArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_astrologyArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_astrologyArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_astrologyArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_astrologyArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_astrologyArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_astrologyArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_astrologyArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Astrology Widget in English Page.
	 */  

	@Test
	public void std_Article_Mweb_10_VerifyAstrologyArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Astrology Widget in English Page.
	 */
	@Test				 
	public void std_Article_Mweb_11_AstrologyArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Astrology Widget in English Page.
	 */
	@Test		
	public void std_Article_Mweb_09_VerifyAstrologyArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneAstrologyLink();
		pages.mobileArticleConsumptionPage.verifyAstrologyArticleAboutTheAuthorNavigation(serverType);
	}
}
