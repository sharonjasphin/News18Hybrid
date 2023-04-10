package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyPoliticsWidgetTest extends DesktopCommonConfig
{

	@Test
	public void politicsArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void politicsArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void politicsArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void politicsArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void politicsArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void politicsArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void politicsArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void politicsArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void politicsArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void politicsArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void politicsArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void politicsArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void verifyPoliticsArticleTagsNavigation()
	{
		//	navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyPoliticsTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void verifyPoliticsArticleFirstPublishedAndLastUpdatedValidation()
	{
		//	navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyPoliticsArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void verifyPoliticsArticleTopRHSAdsValidation()
	{
		//	navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyPoliticsArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Politics Widget in English Page.
	 */
	@Test
	public void verifyPoliticsArticleAboutTheAuthorNavigation()
	{
		//	navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopArticleConsumptionPage.verifyPoliticsArticleAboutTheAuthorNavigation(serverType);
	}

}
