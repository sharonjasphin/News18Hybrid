package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryFooterVideosLPWidgetTest extends DesktopCommonConfig {


	
	//=================================== Photo Article ============================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer First Layer Validation
	 */
	@Test
	public void videosWidgetFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnVideoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer LiveTv Presnt on Hindi header.
	 */
	@Test
	public void videosWidgetFooterLiveTvValidation () {
//		navigateToUrl("https://betahindirev:wdHj4PJxs0fHoEIBUHZ@beta-hindi-revamp.news18.com/");
		pages.desktopHindiRevampLandingPage.clickOnVideoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Last Layer Presnt on Hindi header.
	 */
	@Test
	public void videosWidgetFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnVideoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
}
