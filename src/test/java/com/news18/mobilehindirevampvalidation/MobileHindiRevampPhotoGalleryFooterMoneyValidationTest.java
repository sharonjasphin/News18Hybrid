package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampPhotoGalleryFooterMoneyValidationTest extends MobileCommonConfig {

	//======================================== Photo Article =================================

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void moneySectionPhotoArticleVerifyFooterFirstLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void moneySectionPhotoArticleVerfyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void moneySectionPhotoArticleVerfyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}



	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void moneySectionPhotoArticleVerfyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneMoneyLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiLandingPage.verifyStickySection();
	}


}
