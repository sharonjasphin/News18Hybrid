package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyCricketWidgetTest extends DesktopCommonConfig
{

	@Test
	public void cricketArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void cricketArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void cricketArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleTaboolaNavigation(serverType);
	}

	@Test
	public void cricketArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void cricketArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void cricketArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void cricketArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void cricketArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void cricketArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void cricketArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void cricketArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void cricketArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void verifyCricketArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void verifyCricketArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void verifyCricketArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Cricket Widget in English Page.
	 */
	@Test
	public void verifyCricketArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopArticleConsumptionPage.verifyCricketArticleAboutTheAuthorNavigation(serverType);
	}

}
