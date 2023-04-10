package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyBuzzWidgetTest extends DesktopCommonConfig
{

	@Test
	public void buzzArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void buzzArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void buzzArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void buzzArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void buzzArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void buzzArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void buzzArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void buzzArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void buzzArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void buzzArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void buzzArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void buzzArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void verifyBuzzArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyBuzzTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void verifyBuzzArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyBuzzArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void verifyBuzzArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyBuzzArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Buzz Widget in English Page.
	 */
	@Test
	public void verifyBuzzArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopArticleConsumptionPage.verifyBuzzArticleAboutTheAuthorNavigation(serverType);
	}

}
