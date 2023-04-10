package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampCategoryHeaderNews18MinisLPWidgetTest extends DesktopCommonConfig {

	
	
//======================================Article================================================	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleLineOneSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void news18MinisArticleLineOneSectionArticleValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi News18 HomePage
	 */
	@Test
	public void news18MinisArticleLineTwoSectionValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineTwoSection(serverType);	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections Rajya Seher Chune In Hindi News18 HomePage
	 */
	@Test
	public void news18MinisArticleLineOneSectionRajyaChuneValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyRajyaSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void news18MinisArticleHeaderChangeLanguageValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyChangeLanguage();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header Chnage Langauge Section Presnt on Hindi header.
	 */
	@Test
	public void news18MinisArticleHeaderSearchButtonValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLineOneSearchButton();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void news18MinisArticleHeaderLiveTvValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyLiveTvSection();
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void news18MinisArticleHeaderDownloadAppValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate header LiveTv Presnt on Hindi header.
	 */
	@Test
	public void news18MinisArticleHeaderSocialShareValidation () {
		pages.desktopHindiRevampLandingPage.clickOnNews18MinisSectionLink();
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderSocialShareIconValidation();
	}
	
}