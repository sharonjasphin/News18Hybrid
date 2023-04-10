package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyEducationAndCareerSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	@Test
	public void std_Article_Mweb_13_EducationSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_EducationSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_13_EducationSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_14_EducationSectionMoreNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_EducationSectionPhotoGalleryTitle() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	@Test
	public void std_Article_Mweb_15_EducationSectionPhotoGalleryArticles() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_educationArticleBreadCrumbNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_educationArticleAgencyNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_educationArticleDetailedBoxValidation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_educationArticleAuthorNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_educationArticleSocialMediaShareNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_educationArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_educationArticleReadMoreDescriptionValidation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_educationArticleRelatedNewsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_educationArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_educationArticleBodyTaboolaNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_10_VerifyEducationArticleTagsNavigation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyEducationTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_11_EducationArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyEducationArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_Mweb_09_VerifyEducationArticleAboutTheAuthorValidation()
	{
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.verifyEducationArticleAboutTheAuthorNavigation(serverType);
	}
}
