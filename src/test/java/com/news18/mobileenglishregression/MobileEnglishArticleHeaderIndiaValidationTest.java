package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mongodb.connection.Server;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileEnglishArticleHeaderIndiaValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_indiaWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_indiaWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_indiaWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_indiaWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_indiaWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnIndiaSection();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}