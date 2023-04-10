package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Article Body Consumption Content and Navigations
 */
public class DesktopEnglishArticleBodyExplainersWidgetTest extends DesktopCommonConfig
{

	@Test
	public void explainersArticleBreadcrumbNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleBreadcrumbNavigation(serverType);
	}
	
	@Test
	public void explainersArticleReadMoreAndHeaderLinkNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreAndHeaderLinkNavigation(serverType);
	}
	
	@Test
	public void explainersArticleBodyTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void explainersArticleRHSTaboolaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRHSTaboolaNavigation(serverType);
	}
	
	@Test
	public void explainersArticleSocialMediaNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleSocialMediaNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Agency Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void explainersArticleAgencyNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAgencyNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Detailed Box in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void explainersArticleDetailedBoxValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleDetailedBoxValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Author Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void explainersArticleAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleAuthorNavigation(serverType);
	}
	
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Read More And Article Description Beside FeaturedImage in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void explainersArticleReadMoreDescriptionValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleReadMoreDescription(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article RelatedNews And Tags Navigation in Article Consumption Page in English Desktop Page.
	 */
//	@Test
	public void explainersArticleRelatedNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleRelatedNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Article Highlights validation in Article Consumption Page in English Desktop Page.
	 */
 //   @Test
	public void explainersArticleHighlightValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleHighlightNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Google News Navigation in Article Consumption Page in English Desktop Page.
	 */
	@Test
	public void explainersArticleGoogleNewsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyCommonArticleGoogleNewsNavigation(serverType);
	}
	

	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void verifyExplainersArticleTagsNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyExplainersTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and LastUpdated present at bottom inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void verifyExplainersArticleFirstPublishedAndLastUpdatedValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyExplainersArticleFirstPublishedAndLastUpdatedNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void verifyExplainersArticleTopRHSAdsValidation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyExplainersArticleRHSTopAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate "About the Author" navigation button present inside article consumption page for Explainers Widget in English Page.
	 */
	@Test
	public void verifyExplainersArticleAboutTheAuthorNavigation()
	{
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopArticleConsumptionPage.verifyExplainersArticleAboutTheAuthorNavigation(serverType);
	}

}
