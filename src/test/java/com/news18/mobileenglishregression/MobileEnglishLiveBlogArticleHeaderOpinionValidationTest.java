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
public class MobileEnglishLiveBlogArticleHeaderOpinionValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_opinionWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_opinionWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_opinionWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_opinionWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_opinionWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}