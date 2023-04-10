package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mongodb.connection.Server;
import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopEnglishVideoArticleFooterOpinionValidationTest extends DesktopCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void photo_Consumption_13_OpinionArticlefooterFirstLayerValidation () {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.clickOnVideoFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photo_Consumption_13_OpinionArticlefooterLiveTvValidation () {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.clickOnVideoFirstArticle();
		pages.desktopLandingPage.verifyLiveTvIcon();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photo_Consumption_13_OpinionArticlefooterLastLayerValidation () {

		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.clickOnVideoFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photo_Consumption_13_OpinionArticlefooterStickySectionValidation () {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopArticleConsumptionPage.clickOnVideoFirstArticle();
		pages.desktopArticleConsumptionPage.verifyStickySection();
	}
	
}