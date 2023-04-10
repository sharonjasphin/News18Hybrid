package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages Validation 
 */
public class DesktopHindiRevampArticleBodyAjabGajabWidgetTest extends DesktopCommonConfig {

	@Test
	public void ajabGajabArticleBreadcrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleBreadCrumbNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleTitleAndLastUpdatedTimeValidation(serverType);	
	}
	
	@Test
	public void ajabGajabArticleReadMoreDescription()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void ajabGajabArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleBodyTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void ajabGajabArticleRHSTaboolaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleRHSTaboolaNavigation(serverType);
	}
	
	
	//anupam
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabArticleTagNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Author Name present at bottom inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabArticleFirstPublishedAndAuthorValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabVideoBetweenArticleValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for AjabGajab Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyAjabGajabArticleConclusionValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoAjabGajabSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyAjabGajabArticleConclusionNavigation(serverType);
	}
}
