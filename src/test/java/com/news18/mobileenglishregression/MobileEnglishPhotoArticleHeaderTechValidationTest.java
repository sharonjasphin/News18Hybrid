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
public class MobileEnglishPhotoArticleHeaderTechValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_techWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_techWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_techWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_techWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_techWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneTechLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}