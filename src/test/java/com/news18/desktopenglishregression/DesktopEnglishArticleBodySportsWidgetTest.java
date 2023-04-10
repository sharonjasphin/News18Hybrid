package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodySportsWidgetTest extends DesktopCommonConfig
{

	@Test
	public void sportsArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void sportsArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void sportsArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void sportsArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void sportsArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void sportsArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void sportsArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void sportsArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void sportsArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void sportsArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void sportsArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void sportsArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void verifySportsArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifySportsTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void verifySportsArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifySportsArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void verifySportsArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifySportsArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Sports Widget in English Page.
	 */
	@Test
	public void verifySportsArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopArticleConsumptionPage.verifySportsArticleAboutTheAuthorNavigation(serverType);
	}

}
