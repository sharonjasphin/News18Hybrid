package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampPhotoGalleryHeaderLineTwoPhotoValidationTest extends DesktopCommonConfig {


	//========================photo Article=====================================
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void photoPhotoArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void photoPhotoArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void photoPhotoArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void photoPhotoArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void photoPhotoArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void photoPhotoArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photoPhotoArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photoPhotoArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void photoPhotoArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoPhotoLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnPhotoSectionFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}

}