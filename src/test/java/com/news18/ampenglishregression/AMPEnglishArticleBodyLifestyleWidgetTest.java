package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyLifestyleWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_lifestyleArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_lifestyleArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_lifestyleArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_lifestyleArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_lifestyleArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test(priority = -1)
	public void std_Article_AMP_08_lifestyleArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_lifestyleArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_lifestyleArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_lifestyleArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_lifestyleArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyLifeStyleArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyLifeStyleTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_LifeStyleArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyLifeStyleArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyLifeStyleArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyLifeStyleArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyLifeStyleSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyLifeStyleSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyLifeStyleSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyLifeStyleSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyLifeStyleSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify LifeStyle Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyLifeStyleSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneLifeStyleLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
