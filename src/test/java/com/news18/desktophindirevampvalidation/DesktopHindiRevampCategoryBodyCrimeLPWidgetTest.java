package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyCrimeLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Crime Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void crimeBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Crime Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void crimeBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void crimePriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimePriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void crimeReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void crimeCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void crimeRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void crimeTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void crimeNewsBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeBodyTaboolaFeedValidation(serverType);
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Crime LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Crime LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimeRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimeCategoryRHSAdsValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Crime LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimePaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Crime LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimePaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Crime LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyCrimePaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyCrimePaginationBtnValidation();
	}
}
