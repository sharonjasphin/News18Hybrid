package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyTechWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_techArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_techArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_techArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_techArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_techArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_techArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_techArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_techArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_techArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_techArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_erifyTechArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTechTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_TechArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTechArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_erifyTechArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTechArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Tech TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyTechSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Tech TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyTechSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Tech TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyTechSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Tech MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyTechSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Tech Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyTechSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Tech Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyTechSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneTechLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
