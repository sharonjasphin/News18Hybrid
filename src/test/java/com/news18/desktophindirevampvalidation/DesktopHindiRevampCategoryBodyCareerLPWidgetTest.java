package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyCareerLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Career Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void careerBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Career Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void careerBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerBreadCrumbNavigation(serverType);
	}
	
	@Test
	public void careerPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void careerCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerCategoryNameNavigation(serverType);
	}
	
	@Test
	public void careerReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void careerRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void careerTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void careerBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerBodyTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Career LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCareerPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoCareerSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCareerPaginationBtnValidation();
	}
	
}
