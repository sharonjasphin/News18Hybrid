package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne DharmSection Widget 
 */
public class DesktopHindiRevampArticleBodyDharmWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void dharmSectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void dharmSectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void dharmSectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void dharmSectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void dharmSectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmSectionArticleRHSTaboolaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmTagsNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmVideoBetweenArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Dharm Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyDharmArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoDharmSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDharmArticleConclusionNavigation(serverType);
	}
}
