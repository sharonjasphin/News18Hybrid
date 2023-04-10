package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https:hindi.news18.com/
 */
public class MobileHindiRevampPhotoGalleryHeaderWorldValidationTest extends MobileCommonConfig {

	//==================================== Photo Article ========================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void worldSectionPhotoArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneWorldLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
	
}
