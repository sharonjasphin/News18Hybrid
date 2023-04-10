package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne LatestSection Widget 
 */
public class DesktopHindiRevampArticleBodyLatestWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void latestSectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void latestSectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void latestSectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void latestSectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void latestSectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestSectionArticleRHSTaboolaNavigation(serverType);
	}
	
	
	//--Anupam
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for LatestNews Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLatestNewsArticleConclusionNavigation(serverType);
	}
}
