package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyWorldWidgetTest extends DesktopCommonConfig
{

	@Test
	public void worldArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void worldArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void worldArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void worldArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void worldArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void worldArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void worldArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void worldArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void worldArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void worldArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void worldArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void worldArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void verifyWorldArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyWorldTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void verifyWorldArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyWorldArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void verifyWorldArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyWorldArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for World Widget in English Page.
	 */
	@Test
	public void verifyWorldArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.verifyWorldArticleAboutTheAuthorNavigation(serverType);
	}

}
