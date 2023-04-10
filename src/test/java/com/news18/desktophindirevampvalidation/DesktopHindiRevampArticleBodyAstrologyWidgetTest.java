package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne AstrologySection Widget 
 */
public class DesktopHindiRevampArticleBodyAstrologyWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void astrologySectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void astrologySectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void astrologySectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void astrologySectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void astrologySectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologySectionArticleRHSTaboolaNavigation(serverType);
	}
	
	//--Anupam
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleTagNavigation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Auther Name present at bottom inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleFirstPublishedAndAuthorValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyVideoBetweenArticleValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyVideoBetweenArticleNavigation(serverType);
	}
	
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Astrology Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAstrologyArticleConclusionValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAstrologySectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAstrologyArticleConclusionNavigation(serverType);
	}
}
