package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampPhotoGalleryHeaderPhotoValidationTest extends MobileCommonConfig {

	//============================================= Photo Article ===============================================

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void photoSectionPhotoArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOnePhotoLink();
		pages.mobileHindiRevampArticleConsumptionPage.clickOnCricketSectionFirstPhotoArticle();
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}

}
