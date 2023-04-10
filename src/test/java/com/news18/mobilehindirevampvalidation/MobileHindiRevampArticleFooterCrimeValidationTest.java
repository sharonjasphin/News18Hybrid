package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampArticleFooterCrimeValidationTest extends MobileCommonConfig {



	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void crimeArticleVerifyFooterFirstLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void crimeArticleVerifyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void crimeArticleVerifyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}



	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void crimeArticleVerifyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneCrimeLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstArticle();
		pages.mobileHindiLandingPage.verifyStickySection();
	}

}
