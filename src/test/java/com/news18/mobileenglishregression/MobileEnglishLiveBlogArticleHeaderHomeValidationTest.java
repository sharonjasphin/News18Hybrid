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
public class MobileEnglishLiveBlogArticleHeaderHomeValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_latestWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_latestWidgetGoogleSearch() {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_latestWidgetHompageHeaderLiveTv() {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_latestWidgetNews18Logo() {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_latestWidgetLineOneSectionValidation () {
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}