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
public class MobileEnglishArticleHeaderExplainersValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_explainersWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_explainersWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_explainersWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_explainersWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_explainersWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneExplainersLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}