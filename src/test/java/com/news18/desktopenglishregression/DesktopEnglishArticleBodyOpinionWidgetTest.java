package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyOpinionWidgetTest extends DesktopCommonConfig
{

	@Test
	public void opinionArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void opinionArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void opinionArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void opinionArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void opinionArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void opinionArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void opinionArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void opinionArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void opinionArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void opinionArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void opinionArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void opinionArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void verifyOpinionArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyOpinionTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void verifyOpinionArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyOpinionArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void verifyOpinionArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyOpinionArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Opinion Widget in English Page.
	 */
	@Test
	public void verifyOpinionArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.verifyOpinionArticleAboutTheAuthorNavigation(serverType);
	}

}
