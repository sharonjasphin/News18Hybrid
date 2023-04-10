package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyTechWidgetTest extends DesktopCommonConfig
{

	@Test
	public void techArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void techArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void techArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void techArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void techArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void techArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void techArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void techArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void techArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void techArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void techArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void techArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void verifyTechArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyTechTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void verifyTechArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyTechArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void verifyTechArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyTechArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Tech Widget in English Page.
	 */
	@Test
	public void verifyTechArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopArticleConsumptionPage.verifyTechArticleAboutTheAuthorNavigation(serverType);
	}

}
