package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampCategoryFooterLatesetSectionLPWidgetTest extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void latestSectionArticleVerifyFooterFirstLayerSection () {
//		navigateToUrl("https://betahindirev:wdHj4PJxs0fHoEIBUHZ@beta-hindi-revamp.news18.com/");
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void latestSectionArticleVerifyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void latestSectionArticleVerifyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}
	
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void latestSectionArticleVrifyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiLandingPage.verifyStickySection();
	}
}
