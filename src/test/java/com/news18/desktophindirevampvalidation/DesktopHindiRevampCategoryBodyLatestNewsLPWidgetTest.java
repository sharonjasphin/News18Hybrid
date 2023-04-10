package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyLatestNewsLPWidgetTest extends DesktopCommonConfig {

	@Test
	public void latestNewsPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsPriorityPanelArticleNavigation(serverType);
	}
	
	@Test
	public void latestNewsReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsReadMoreNewsNavigation(serverType);
	}
	
	@Test
	public void latestNewsCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsCategoryNameNavigation(serverType);
	}
	
	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	public void latestNewsBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in LatestNews Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void latestNewsBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void latestNewsRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestnewsRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void latestNewsTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsTaboolaFeedValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void latestNewsBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsBodyTaboolaFeedValidation(serverType);
	}
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsArticleBelowPriorityNavigation("preProd");
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsCategoryRHSAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsCategoryBelowPriorityPanelAdsValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in LatestNews LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLatestNewsPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLatestNewsPaginationBtnValidation();
	}
	
}
