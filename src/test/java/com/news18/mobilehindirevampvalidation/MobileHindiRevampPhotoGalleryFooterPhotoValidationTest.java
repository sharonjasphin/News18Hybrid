package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampPhotoGalleryFooterPhotoValidationTest extends MobileCommonConfig {

	//======================================== Photo Article =======================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topics In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyFooterFirstLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyFooterFirstLayerSection(); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate footer Live Tv Section
	 */
	@Test
	public void photoSectionPhotoArticleVerfyFooterLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLiveTvSection(); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerfyFooterLastLayerSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyfooterLastLayerSection(); 
	}
	
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void careerPhotoArticleVerfyFooterStickySection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstPhotoArticle();
		pages.mobileHindiLandingPage.verifyStickySection();
	}
	
	
}
