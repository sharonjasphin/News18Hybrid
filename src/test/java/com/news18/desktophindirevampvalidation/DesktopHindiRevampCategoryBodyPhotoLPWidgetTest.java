package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class is used for verification of Category Page for Photo in Hindi Revamp Category Landing Page.
 */
public class DesktopHindiRevampCategoryBodyPhotoLPWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to validate the Breadcrumb Navigation in Photo Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void photoBreadCrumbNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoBreadCrumbNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the breadcrumb text and header text present in Photo Category Body in Hindi Revamp Category Landing Page.
	 */
	@Test
	public void photoBreadcrumbAndHeaderTextValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoBreadcrumbAndHeaderTextValidation(serverType);
	}
	
	@Test
	public void photoPriorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoPriorityPanelArticleNavigation(serverType);
	}

	@Test
	public void photoPriorityPanelArrowsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoPriorityPanelArrowButtonNavigation();
	}

	@Test(priority = -1)
	public void photoSubCategoryTabsValidation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoSubCategoryTabsNavigation(serverType);
	}
	
	
	//Anupam
	/**
	 * @author AnupamGupta
	 * This method is used to validate article navigation present below priority panel in Photo LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoArticleBelowPriorityNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoArticleBelowPriorityNavigation("preProd");
	}
	
		
	/**
	 * @author AnupamGupta
	 * This method is used to validate Next Arrow  in pagination Div present in Photo LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoPaginationNextArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoPaginationNextArrowValidation();
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Prev Arrow  in pagination Div present in Photo LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoPaginationPrevArrowNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoPaginationPrevArrowValidation();
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate Links in pagination Div present in Photo LP  in Hindi revamp Page.
	 */
	@Test
	public void verifyPhotoPaginationBtnNavigation()
	{
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoSectionLink();
		pages.desktopHindiRevampCategoryLandingPage.verifyPhotoPaginationBtnValidation();
	}

 

 
}
