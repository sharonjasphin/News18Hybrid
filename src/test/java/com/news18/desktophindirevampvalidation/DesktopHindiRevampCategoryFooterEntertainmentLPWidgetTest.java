package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryFooterEntertainmentLPWidgetTest extends DesktopCommonConfig {


	
	//=================================== Photo Article ============================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer First Layer Validation
	 */
	@Test
	public void entertainmentWidgetFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer LiveTv Presnt on Hindi header.
	 */
	@Test
	public void entertainmentWidgetFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Last Layer Presnt on Hindi header.
	 */
	@Test
	public void entertainmentWidgetFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
}
