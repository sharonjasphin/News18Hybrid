package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampArticleHeaderEntertainmentValidationTest extends DesktopCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void entertainmentArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void entertainmentArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void entertainmentArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void entertainmentArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void entertainmentArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void entertainmentArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void entertainmentArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void entertainmentArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void entertainmentArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneEntertainmentLink();
		pages.desktopHindiRevampArticleConsumptionPage.clickOnFirstEntertainmentArticle();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}

}