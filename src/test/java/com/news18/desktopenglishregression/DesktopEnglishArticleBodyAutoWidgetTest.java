package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyAutoWidgetTest extends DesktopCommonConfig
{

	@Test
	public void autoArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void autoArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void autoArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void autoArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void autoArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void autoArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void autoArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void autoArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void autoArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void autoArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void autoArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void autoArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyAutoArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyAutoArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyAutoArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyAutoArticleRHSTopAdsNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyAutoArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopArticleConsumptionPage.verifyAutoArticleAboutTheAuthorNavigation(serverType);
	}

}
