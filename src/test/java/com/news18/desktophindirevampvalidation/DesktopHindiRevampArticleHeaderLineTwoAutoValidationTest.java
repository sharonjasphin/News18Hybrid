package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampArticleHeaderLineTwoAutoValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void autoArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void autoArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void autoArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void autoArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void autoArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void autoArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void autoArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void autoArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void autoArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineTwoAutoSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnLineTwoPriorityFirstArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}
}