package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyLifestyleWidgetTest extends DesktopCommonConfig
{

	@Test
	public void lifestyleArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}

	@Test
	public void lifestyleArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}

	@Test
	public void lifestyleArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}

	@Test
	public void lifestyleArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}

	@Test
	public void lifestyleArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void lifestyleArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void lifestyleArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void lifestyleArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}


	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void lifestyleArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
	//	@Test
	public void lifestyleArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
	//   @Test
	public void lifestyleArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void lifestyleArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void verifyLifeStyleArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyLifeStyleTagsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void verifyLifeStyleArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyLifeStyleArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}


	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void verifyLifeStyleArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyLifeStyleArticleRHSTopAdsNavigation(serverType);
	}

	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for LifeStyle Widget in English Page.
	 */
	@Test
	public void verifyLifeStyleArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.verifyLifeStyleArticleAboutTheAuthorNavigation(serverType);
	}

}
