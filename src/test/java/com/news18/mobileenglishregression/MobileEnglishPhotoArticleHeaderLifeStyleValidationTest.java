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
public class MobileEnglishPhotoArticleHeaderLifeStyleValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_lifestyleWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_lifestyleWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_lifestyleWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_lifestyleWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_lifestyleWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}