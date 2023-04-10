package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampArticleFooterCricketValidationTest extends DesktopCommonConfig {

	//======================================Article==========================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketWidgetArticleFooterFirstLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCricketArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterFirstLayer(serverType);
	}
	
	@Test
	public void cricketWidgetArticleFooterLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCricketArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLiveTVSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketWidgetArticleFooterLastLayerValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCricketArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyFooterLineTwoSocialShareSection(serverType);
	}
	
}
