package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampArticleFooterCricketValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketArticleVerifyFooterFirstLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void cricketArticleVerifyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketArticleVerifyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}
	
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketArticleVrifyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCricketLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstArticle();
		pages.mobileHindiLandingPage.verifyStickySection(); 
	}

}
