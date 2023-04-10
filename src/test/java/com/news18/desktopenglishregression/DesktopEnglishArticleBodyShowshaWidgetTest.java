package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyShowshaWidgetTest extends DesktopCommonConfig
{

	@Test
	public void showshaArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void showshaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void showshaArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void showshaArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void showshaArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void showshaArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void showshaArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void showshaArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void showshaArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void showshaArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void showshaArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void showshaArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void verifyShowshaArticleTagsNavigation()
	{
		//	navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyShowshaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void verifyShowshaArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyShowshaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void verifyShowshaArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyShowshaArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Showsha Widget in English Page.
	 */
	@Test
	public void verifyShowshaArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopArticleConsumptionPage.verifyShowshaArticleAboutTheAuthorNavigation(serverType);
	}

}
