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
public class MobileEnglishPhotoArticleHeaderMoviesValidationTest extends MobileCommonConfig {

	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerChangeLangaugeValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerChangeLanguageValidation("live");
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerLHSGroupSitesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSGroupSites(serverType);
	}
	

	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerLHSKnowUSWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSKnowUs(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerLHSNews18InititivesWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSNews18Initiatives(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerRHSIntrendsValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerIntrendsValidation(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerLHSSectionWidgetValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerLHSSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void article_Consumption_02_moviesWidgetHamburgerSocialShareSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_moviesWidgetGoogleSearch() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyGoogleSearch();
	}
	
	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void article_Consumption_01_moviesWidgetHompageHeaderLiveTv() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
	
	/**
	 * This method is used to validate Home Page Header News18 Logo
	 */
	@Test
	public void article_Consumption_01_moviesWidgetNews18Logo() {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verifyHeaderLogo();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_moviesWidgetLineOneSectionValidation () {
		pages.mobileLandingPage.clickOnLineOneMovieLink();
		pages.mobileArticleConsumptionPage.clickOnCommonFirstPhotoArticle();
		pages.mobileLandingPage.verfyLineOneSection(serverType);
	}
	
}