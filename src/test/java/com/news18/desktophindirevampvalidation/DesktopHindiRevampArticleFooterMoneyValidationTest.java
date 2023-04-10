package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterMoneyValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void moneyArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMoneyArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void moneyArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMoneyArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void moneyArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstMoneyArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}

	
}
