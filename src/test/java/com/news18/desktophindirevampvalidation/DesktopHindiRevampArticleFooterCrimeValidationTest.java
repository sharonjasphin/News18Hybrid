package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampArticleFooterCrimeValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void crimeWidgetArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void crimeWidgetArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void crimeWidgetArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
}
