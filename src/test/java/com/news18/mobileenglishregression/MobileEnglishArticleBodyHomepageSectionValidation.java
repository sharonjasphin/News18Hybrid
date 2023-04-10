package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishArticleBodyHomepageSectionValidation extends MobileCommonConfig{

	/**
	 * @author DanishR
	 * This method is used to verify HomePage TrendingNews Title
	 */
	@Test
	public void std_Article_Mweb_13_HomepageSectionTrendingNewsTitle() {
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify HomePage TrendingNews Articles
	 */
	@Test
	public void std_Article_Mweb_13_HomepageSectionTrendingNewsArticles() {
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify HomePage TrendingNews Readmore
	 */
	@Test
	public void std_Article_Mweb_13_HomepageSectionTrendingNewsReadMore() {
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify HomePage MoreNews Articles
	 */
	@Test
	public void std_Article_Mweb_14_HomepageSectionMoreNewsArticles() {
		pages.mobileArticleConsumptionPage.verifyMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify HomePage TrendingNews Title
	 */
	@Test
	public void std_Article_Mweb_15_HomepageSectionPhotoGalleryTitle() {
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify HomePage PhotoGallery Articles
	 */
	@Test
	public void std_Article_Mweb_15_HomepageSectionPhotoGalleryArticles() {
		pages.mobileArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_04_homepageArticleBreadCrumbNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_homepageArticleAgencyNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_homepageArticleDetailedBoxValidation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_homepageArticleAuthorNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_homepageArticleSocialMediaShareNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_08_homepageArticleFooterSocialMediaIconNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyCommonArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_05_homepageArticleReadMoreDescriptionValidation()
	{
		pages.mobileArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void std_Article_Mweb_06_homepageArticleRelatedNewsNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_07_homepageArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyHomepageArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void std_Article_Mweb_12_homepageArticleBodyTaboolaNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Common Widget in English Page.
	 */  

	@Test
	public void std_Article_Mweb_10_VerifyHomepageArticleTagsNavigation()
	{
		pages.mobileArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Common Widget in English Page.
	 */
	@Test				 
	public void std_Article_Mweb_11_homepageArticleFirstPublishedAndLastUpdated()
	{
		pages.mobileArticleConsumptionPage.verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Common Widget in English Page.
	 */
	@Test		
	public void std_Article_Mweb_09_VerifyHomepageArticleAboutTheAuthorValidation()
	{
		pages.mobileArticleConsumptionPage.verifyAutoArticleAboutTheAuthorNavigation(serverType);
	}
}
