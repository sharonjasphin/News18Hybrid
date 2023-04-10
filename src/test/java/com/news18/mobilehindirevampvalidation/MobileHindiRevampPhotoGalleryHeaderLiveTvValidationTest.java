package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https:hindi.news18.com/
 */
public class MobileHindiRevampPhotoGalleryHeaderLiveTvValidationTest extends MobileCommonConfig {

	//===================================== Photo Article ================================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestSectionLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void liveTvSectionPhotoArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLiveTvLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnLiveTvSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
	
}
