package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyEducationWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_04_educationArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_educationArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_educationArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_educationArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_educationArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_08_educationArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_05_educationArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_AMP_06_educationArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_07_educationArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_AMP_12_educationArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyEducationArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyEducationTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_EducationArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyEducationArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyEducationArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyEducationArticleAboutTheAuthorNavigation(serverType);
	}
	
	//--DanishR
	/**
	 * @author DanishR
	 * This method is used to verify Education TrendingNews Title
	 */
	@Test
	public void std_Article_AMP_13_VerifyEducationSectionTrendingNewsTitle() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education TrendingNews Articles
	 */
	@Test
	public void std_Article_AMP_13_VerifyEducationSectionTrendingNewsArticles() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education TrendingNews Readmore
	 */
	@Test
	public void std_Article_AMP_13_VerifyEducationSectionTrendingNewsReadMore() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education MoreNews Articles
	 */
	@Test
	public void std_Article_AMP_14_VerifyEducationSectionMoreNewsArticles() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Photogallery Title
	 */
	@Test
	public void std_Article_AMP_15_VerifyEducationSectionPhotoGalleryTitle() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Education Photogallery Articles
	 */
	@Test
	public void std_Article_AMP_15_VerifyEducationSectionPhotoGalleryArticles() {
		pages.ampLandingPage.clickOnLineOneEducationLink();
		pages.ampArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
}
