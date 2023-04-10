package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyPoliticsWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_politicsArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_politicsArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_politicsArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_politicsArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_politicsArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_politicsArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_politicsArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_politicsArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_politicsArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_politicsArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyPoliticsArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyPoliticsTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_PoliticsArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyPoliticsArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyPoliticsArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyPoliticsArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Politics TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyPoliticsSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyPoliticsSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyPoliticsSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyPoliticsSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyPoliticsSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyPoliticsSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOnePoliticsLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
