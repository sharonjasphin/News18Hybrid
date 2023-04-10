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
public class MobileEnglishVideoArticleHeaderEducationValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_educationWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_educationWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_educationWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_educationWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_educationWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneEducationLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}