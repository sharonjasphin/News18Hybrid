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
public class MobileEnglishLiveBlogArticleHeaderBusinessValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02__businessWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02__businessWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02__businessWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_businessWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_businessWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_businessWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_businessWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_businessWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_businessWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_businessWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_businessWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstLiveBlogArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}