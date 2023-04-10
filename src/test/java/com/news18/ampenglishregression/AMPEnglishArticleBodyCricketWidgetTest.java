package com.news18.ampenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishArticleBodyCricketWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_04_cricketArticleBreadCrumbNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_cricketArticleAgencyNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_cricketArticleDetailedBoxValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_cricketArticleAuthorNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_cricketArticleSocialMediaShareNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleSocialMediaShareNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article footer SocialMedia And Google News Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_08_cricketArticleFooterSocialMediaIconNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleFooterSocialMediaIconNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_05_cricketArticleReadMoreDescriptionValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Mobile Page.
	 */
	//	@Test
	public void article_Consumption_06_cricketArticleRelatedNewsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_07_cricketArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Mobile Page.
	 */
	@Test
	public void article_Consumption_12_cricketArticleBodyTaboolaNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleTaboolaNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_10_VerifyCricketArticleTagsNavigation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_11_CricketArticleFirstPublishedAndLastUpdated()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate AboutTheAuthor present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void std_Article_AMP_09_VerifyCricketArticleAboutTheAuthorValidation()
	{
		pages.ampLandingPage.clickOnLineOneCricketLink();
		pages.ampArticleConsumptionPage.verifyCricketArticleAboutTheAuthorNavigation(serverType);
	}
}
