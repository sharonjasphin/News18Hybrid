package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne HealthSection Widget 
 */
public class DesktopHindiRevampArticleBodyHealthWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void healthSectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void healthSectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void healthSectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void healthSectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void healthSectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthSectionArticleRHSTaboolaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleFirstPublishedAndAuthorValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthVideoBetweenArticleValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleTopRHSAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Health Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyHealthArticleConclusionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoHealthLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHealthArticleConclusionNavigation(serverType);
	}
}
