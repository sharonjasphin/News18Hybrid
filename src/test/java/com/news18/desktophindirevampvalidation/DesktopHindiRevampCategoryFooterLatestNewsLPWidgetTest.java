package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryFooterLatestNewsLPWidgetTest extends DesktopCommonConfig {

	//======================================Article==========================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer First Layer Validation
	 */
	@Test
	public void latestSectionWidgetFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer LiveTv Presnt on Hindi header.
	 */
	@Test
	public void latestSectionWidgetFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Last Layer Presnt on Hindi header.
	 */
	@Test
	public void latestSectionWidgetFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoLatestSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
}
