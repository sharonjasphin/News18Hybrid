package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyShowshaWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_showshaArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_showshaArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_showshaArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_showshaArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_showshaArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_showshaArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_showshaArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_showshaArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_showshaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_showshaArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyShowshaArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyShowshaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Poilitics Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_ShowshaArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyShowshaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Poilitics Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyShowshaArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyShowshaArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Showsha TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyShowshaSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyShowshaSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyShowshaSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyShowshaSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyShowshaSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyShowshaSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneShowshaLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
