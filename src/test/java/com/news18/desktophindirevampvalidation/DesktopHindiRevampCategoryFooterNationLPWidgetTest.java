package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryFooterNationLPWidgetTest extends DesktopCommonConfig {


	
	//=================================== Photo Article ============================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer First Layer Validation
	 */
	@Test
	public void nationWidgetFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer LiveTv Presnt on Hindi header.
	 */
	@Test
	public void nationWidgetFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Last Layer Presnt on Hindi header.
	 */
	@Test
	public void nationWidgetFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
}
