package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyBusinessWidgetTest extends DesktopCommonConfig
{

	@Test
	public void businessArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void businessArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void businessArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void businessArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void businessArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void businessArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void businessArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void businessArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void businessArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void businessArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void businessArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void businessArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void verifyBusinessArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyBusinessTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void verifyBusinessArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyBusinessArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void verifyBusinessArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyBusinessArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Business Widget in English Page.
	 */
	@Test
	public void verifyBusinessArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopArticleConsumptionPage.verifyBusinessArticleAboutTheAuthorNavigation(serverType);
	}

}
