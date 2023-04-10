package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne AutoSection Widget 
 */
public class DesktopHindiRevampArticleBodyAutoWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void autoSectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void autoSectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void autoSectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void autoSectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void autoSectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoSectionArticleRHSTaboolaNavigation(serverType);
	}
	
	
	//--Anupam---
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoArticleTagNavigation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoTagsNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Auther Name present at bottom inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoArticleFirstPublishedAndAuthorValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoVideoBetweenArticleValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoVideoBetweenArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Auto Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAutoArticleConclusionValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAutoArticleConclusionNavigation(serverType);
	}
}
