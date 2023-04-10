package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Knowledge in Hindi Revamp Category Landing Page.
 */
public class MobileHindiRevampCategoryBodyKnowledgeLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method validates the Knowledge Priority Panel Article Navigation in Landing Page
	 */
	@Test
	public void knowledgePriorityPanelArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryPriorityPanelArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Knowledge Read More News Link Navigation in Landing Page 
	 */
	@Test
	public void knowledgeReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryReadMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method Validates the Category Names Of Every Priority Panel Article in Landing Page
	 */
	@Test
	public void knowledgeCategoryNamesNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryNameNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Knowledge Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void knowledgeBreadCrumbNavigation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadCrumbNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Knowledge Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void knowledgeBreadcrumbAndHeaderTextValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of TaboolaFeeds in Landing Page.
	 */
	@Test
	public void knowledgeTaboolaFeedsValidation() {
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryTaboolaFeedValidation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the validation of Body TaboolaFeeds in Landing Page.
	 */
	@Test
	public void knowledgeBodyTaboolaFeedsValidation()
	{
		pages.mobileHindiRevampLandingPage.clickOnLineOneKnowledgeLink();
		pages.mobileHindiRevampCategoryLandingPage.verifyCategoryBodyTaboolaFeedValidation(serverType);
		
	}
}
