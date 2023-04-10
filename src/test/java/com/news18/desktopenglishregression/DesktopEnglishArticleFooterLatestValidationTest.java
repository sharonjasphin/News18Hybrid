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
public class DesktopEnglishArticleFooterLatestValidationTest extends DesktopCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void article_Consumption_19_latestArticlefooterFirstLayerValidation () {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void article_Consumption_19_latestArticlefooterLiveTvValidation () {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.desktopLandingPage.verifyLiveTvIcon();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void article_Consumption_19_latestArticlefooterLastLayerValidation () {

		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void article_Consumption_20_latestArticlefooterStickySectionValidation () {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.desktopArticleConsumptionPage.verifyStickySection();
	}
	
}