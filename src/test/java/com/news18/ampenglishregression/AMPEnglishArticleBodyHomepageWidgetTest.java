package com.news18.ampenglishregression;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyHomepageWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_homepageArticleBreadCrumbNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_homepageArticleAgencyNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_homepageArticleDetailedBoxValidation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_homepageArticleAuthorNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_homepageArticleSocialMediaShareNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_homepageArticleFooterSocialMediaIconNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_homepageArticleReadMoreDescriptionValidation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_homepageArticleRelatedNewsNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_homepageArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_homepageArticleBodyTaboolaNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomepageArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyAutoArticleTagsNavigation()
	{
		pages.ampArticleConsumptionPage.verifyHomePageTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_homepageArticleFirstPublishedAndLastUpdated()
	{
		pages.ampArticleConsumptionPage.verifyHomePageArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyHomepageArticleAboutTheAuthorValidation()
	{
		pages.ampArticleConsumptionPage.verifyHomePageArticleAboutTheAuthorNavigation(serverType);
	}

	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyHomepageSectionTrendingNewsTitle() {
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyHomepageSectionTrendingNewsArticles() {
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto TrendingNews Readmore
	 */
	@Test
	public void std_Article_AMP_13_VerifyHomepageSectionTrendingNewsReadMore() {
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Auto MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyAutoSectionMoreNewsArticles() {
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto PhotoGallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyHomepageSectionPhotoGalleryTitle() {
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto PhotoGallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyHomepageSectionPhotoGalleryArticles() {
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
