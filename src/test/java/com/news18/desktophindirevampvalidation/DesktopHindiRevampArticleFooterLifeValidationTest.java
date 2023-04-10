package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterLifeValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void lifeArticlefooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstLifeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifeArticlefooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstLifeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifeArticlefooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstLifeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}


}
