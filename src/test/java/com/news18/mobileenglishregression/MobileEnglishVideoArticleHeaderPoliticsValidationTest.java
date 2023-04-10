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
public class MobileEnglishVideoArticleHeaderPoliticsValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_politicsWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_politicsWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_politicsWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_politicsWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_politicsWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstVideoArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}