package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryHeaderMobileLPWidgetTest extends DesktopCommonConfig {

	
	
//======================================Article================================================	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void mobileArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void mobileArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void mobileArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void mobileArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnLineOneMobileLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}
	
}