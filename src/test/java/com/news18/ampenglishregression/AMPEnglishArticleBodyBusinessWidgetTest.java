package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyBusinessWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_businessArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_businessArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_businessArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_businessArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_businessArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_businessArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_businessArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_businessArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_businessArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_businessArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyBusinessArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyBusinessTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_BusinessArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyBusinessArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyBusinessArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyBusinessArticleAboutTheAuthorNavigation(serverType);
	}
	
	//---DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Business TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyBusinessSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyBusinessSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business TrendingNews Readmore
	 */
	@Test
	public void std_Article_AMP_13_VerifyBusinessSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyBusinessSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Photogalley Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyBusinessSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Photogalley Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyBusinessSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
