package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampVideoGalleryHeaderLifeValidationTest extends DesktopCommonConfig {

	//===========================Photo Article ===============================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void lifeVideoArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void lifeVideoArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void lifeVideoArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void lifeVideoArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void lifeVideoArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void lifeVideoArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifeVideoArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifeVideoArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void lifeVideoArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneLifestyleLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnCommonSectionFirstVideoArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}

}