package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterNationValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void nationArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstNationArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void nationArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstNationArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void nationArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneNationLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstNationArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
}
