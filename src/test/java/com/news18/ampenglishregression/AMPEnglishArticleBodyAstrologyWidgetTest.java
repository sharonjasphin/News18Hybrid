package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyAstrologyWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_astrologyArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_astrologyArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_astrologyArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_astrologyArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_astrologyArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_astrologyArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_astrologyArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_astrologyArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_astrologyArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_astrologyArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyAstrologyArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_AstrologyArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Astrology Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyAstrologyArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyAstrologyArticleAboutTheAuthorNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Astrology TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyAstrologySectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsAstrologyTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Astrology TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyAstrologySectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsAstrologyArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Astrology TrendingNews ReadMore
	 */
	@Test
	public void std_Article_AMP_13_VerifyAstrologySectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsAstrologyReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Astrology MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyAstrologySectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsAstrologyArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Astrology Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyAstrologySectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryAstrologyTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Astrology Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyAstrologySectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneAstrologyLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryAstrologyArticleNavigation(serverType);
	}
}
