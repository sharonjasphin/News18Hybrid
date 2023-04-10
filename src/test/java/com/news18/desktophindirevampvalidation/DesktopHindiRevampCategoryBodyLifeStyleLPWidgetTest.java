package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyLifeStyleLPWidgetTest extends DesktopCommonConfig {

	@Test
	public void lifeStylePriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStylePriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void lifeStyleReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void lifeStyleCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in LifeStyle Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void lifeStyleBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in LifeStyle Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void lifeStyleBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void lifeStyleRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void lifeStyleTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifeStyleTaboolaFeedValidation(serverType);
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Life LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifestyleCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Life LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLifeBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifestyleCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Life LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLifePaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifestylePaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Life LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLifePaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifestylePaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Life LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLifePaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLifestylePaginationBtnValidation();
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	@Test(priority = 1)
	public void verifyHealthSectionLifestyleLPArticle() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyHealthSectionLifestyleLPArticle("preProd");        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	@Test
	public void verifyHealthSectionLifestyleLPMoreLnk() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyMoreHealthSectionLifestyleLPLnk("preProd");        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	@Test
	public void verifyHealthSectionLifestyleLPWidget() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyHealthSectionLifestyleLPWidget("preProd");        
	}
}
