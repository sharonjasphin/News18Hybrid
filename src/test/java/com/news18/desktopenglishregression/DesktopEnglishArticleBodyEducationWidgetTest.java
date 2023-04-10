package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyEducationWidgetTest extends DesktopCommonConfig
{

	@Test
	public void educationArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void educationArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void educationArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void educationArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void educationArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void educationArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void educationArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void educationArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void educationArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void educationArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void educationArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void educationArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void verifyEducationArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyEducationTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void verifyEducationArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyEducationArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void verifyEducationArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyEducationArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Education Widget in English Page.
	 */
	@Test
	public void verifyEducationArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopArticleConsumptionPage.verifyEducationArticleAboutTheAuthorNavigation(serverType);
	}

}
