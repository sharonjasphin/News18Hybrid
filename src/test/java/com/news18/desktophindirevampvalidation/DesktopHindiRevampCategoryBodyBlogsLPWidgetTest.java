package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Latest News in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyBlogsLPWidgetTest extends DesktopCommonConfig {
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Blog Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void blogsBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogsBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Blog Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void blogsBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogsBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of RHSTaboolaFeeds in Landing Page
	 */
	@Test
	public void blogRHSTaboolaFeedsValidation() {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogRhsTaboolaFeedsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Blog Section Author List.
	 */
	@Test
	public void blogsSectionAuthorListValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verfyAuthorListPresntOnBody(serverType);;
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Blog Section Author List.
	 */
	@Test
	public void blogsSectionAuthorTextBoxValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyAuthorTextBoxPresntOnBody(serverType);;
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate BetweenArticle ad present in Blog LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogBetweenArticleAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogBetweenArticleAdsValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Top RHS ad present in Blog LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogRHSTopAdsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogCategoryRHSAdsValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Blog LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Blog LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Blog LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyBlogPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoBlogLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyBlogPaginationBtnValidation();
	}
	
 
}
