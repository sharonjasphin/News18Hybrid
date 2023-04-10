package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampPhotoGalleryHeaderCrimeValidationTest extends DesktopCommonConfig {



	//===============================================Photo Article=========================================

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketPhotoArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void cricketPhotoArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void cricketPhotoArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstPhotoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void cricketPhotoArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketPhotoArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}




}