package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the LineOne CareerSection Widget 
 */
public class DesktopHindiRevampArticleBodyCareerWidgetTest extends DesktopCommonConfig {

	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	public void careerSectionArticleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Breadcrumb Navigation in Line one Article Consumption Page
	 */
	@Test
	public void careerSectionArticleTitleAndLastUpdatedTimeValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleTitleAndLastUpdatedTimeValidation(serverType);
	}
	
	@Test
	public void careerSectionArticleReadMoreDescriptionValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleReadMoreDescription(serverType);
	}
	
	@Test
	public void careerSectionArticleAgencyNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleAgencyNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleSocialMediaNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleSocialMediaNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleGoogleNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleGoogleNewsNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleAuthorNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleAuthorNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleRelatedNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleRelatedNewsNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleHighlightValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleHighlightNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleDetailedDescriptionAndHeaderLinkValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleDetailedDescriptionNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleBodyTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleTaboolaNavigation(serverType);
	}
	
	@Test
	public void careerSectionArticleRHSTaboolaValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerSectionArticleRHSTaboolaNavigation(serverType);
	}
	
	//--Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Tags present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleTagNavigation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerTagsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate First Published and Auther Name present at bottom inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleFirstPublishedAndAuthorValidation()
	{
		
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerArticleFirstPublishedAndAuthorNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Video between articles present in consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerVideoBetweenArticleValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerVideoBetweenArticleNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate TopRHSAds present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleTopRHSAdsValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerArticleRHSAdsNavigation(serverType);
	}
	
	/***
	 * @author AnupamGupta
	 * This method is used to validate Article Conclusion present inside article consumption page for Career Widget in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleConclusionValidation()
	{

		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyCareerArticleConclusionNavigation(serverType);
	}
}
