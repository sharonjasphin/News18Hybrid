package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampVideoGalleryHeaderCrimeValidationTest extends DesktopCommonConfig {



	//===============================================Photo Article=========================================

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void cricketVideoArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void cricketVideoArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void cricketVideoArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void cricketVideoArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void cricketVideoArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void cricketVideoArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketVideoArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketVideoArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void cricketVideoArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneCrimeSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstCrimeArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}




}