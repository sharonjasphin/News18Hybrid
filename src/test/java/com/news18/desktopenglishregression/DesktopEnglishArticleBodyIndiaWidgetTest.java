package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Desktop.
 */
public class DesktopEnglishArticleBodyIndiaWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the BreadCrumb Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleBreadCrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article SocialMedia And Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
//	@Test
	public void indiaArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
//	@Test
	public void indiaArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article ReadMore And HeaderLink Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article TaboolaFeed Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RhsTaboolaFeed Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void indiaArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void verifyIndiaArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyIndiaTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void verifyIndiaArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyIndiaArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void verifyIndiaArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyIndiaArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for India Widget in English Page.
	 */
	@Test
	public void verifyIndiaArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopArticleConsumptionPage.verifyIndiaArticleAboutTheAuthorNavigation(serverType);
	}


}
