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
public class MobileEnglishLiveBlogArticleHeaderBuzzValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_buzzWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_buzzWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_buzzWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_buzzWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_buzzWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneBuzzLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}