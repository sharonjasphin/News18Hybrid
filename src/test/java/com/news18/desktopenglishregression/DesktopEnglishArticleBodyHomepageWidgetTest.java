package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyHomepageWidgetTest extends DesktopCommonConfig
{

	@Test
	public void homepageArticleBreadcrumbNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void homepageArticleReadMoreAndHeaderLinkNavigation()
	{
		
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void homepageArticleBodyTaboolaNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void homepageArticleRHSTaboolaNavigation()
	{
		
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void homepageArticleSocialMediaNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void homepageArticleAgencyNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void homepageArticleDetailedBoxValidation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void homepageArticleAuthorNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void homepageArticleReadMoreDescriptionValidation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void homepageArticleRelatedNewsNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//    @Test
	public void homepageArticleHighlightValidation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void homepageArticleGoogleNewsNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}


	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyHomepageArticleTagsNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyHomepageArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopArticleConsumptionPage.verifyAutoArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyHomepageArticleTopRHSAdsValidation()
	{
		pages.desktopArticleConsumptionPage.verifyAutoArticleRHSTopAdsNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Auto Widget in English Page.
	 */
	@Test
	public void verifyHomepageArticleAboutTheAuthorNavigation()
	{
		pages.desktopArticleConsumptionPage.verifyAutoArticleAboutTheAuthorNavigation(serverType);
	}

}
