package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyLatestWidgetTest extends DesktopCommonConfig
{

	@Test
	public void latestArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void latestArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void latestArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void latestArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void latestArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void latestArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void latestArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void latestArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void latestArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void latestArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void latestArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void latestArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void verifyLatestArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyLatestTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void verifyLatestArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyLatestArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void verifyLatestArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyLatestArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Latest Widget in English Page.
	 */
	@Test
	public void verifyLatestArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.verifyLatestArticleAboutTheAuthorNavigation(serverType);
	}

}
