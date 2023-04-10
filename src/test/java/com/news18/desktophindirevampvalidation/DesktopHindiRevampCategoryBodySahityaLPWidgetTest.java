package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodySahityaLPWidgetTest extends DesktopCommonConfig {

	@Test
	public void sahityaPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaPriorityPanelArticleNavigation(serverType);
	}

	@Test
	public void sahityaReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaReadMoreNewsNavigation(serverType);
	}

	@Test
	public void sahityaCategoryNamesNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaCategoryNameNavigation(serverType);
	}

	@Test
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Sahitya Category Body in Hindi Revamp Category Landing Page.
	 */
	public void sahityaBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Sahitya Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void sahityaBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaBreadcrumbAndHeaderTextValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void sahityaRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaRhsTaboolaFeedsValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page.
	 */
	@Test
	public void sahityaTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaTaboolaFeedValidation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void sahityaBodyTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifySahityaBodyTaboolaFeedValidation(serverType);
	}


	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteratureArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteratureArticleBelowPriorityNavigation("preProd");
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteratureRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteratureCategoryRHSAdsValidation();
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate BelowPriorityPaneAd ad present in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteratureBelowPriorityPaneAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteratureCategoryBelowPriorityPanelAdsValidation();
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteraturePaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteraturePaginationNextArrowValidation();
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteraturePaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteraturePaginationPrevArrowValidation();
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Literature LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyLiteraturePaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoSahityaSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyLiteraturePaginationBtnValidation();
	}

}
