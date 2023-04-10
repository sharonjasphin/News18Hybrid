package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterMobileValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMobileArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMobileArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMobileArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}

	
}
