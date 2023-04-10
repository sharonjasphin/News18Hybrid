package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


public class DesktopHindiRevampArticleFooterFoodValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void foodArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstFoodArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void foodArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstFoodArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void foodArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneFoodLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstFoodArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
	
}
