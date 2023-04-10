package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopEnglishLiveBlogArticleHeaderWorldValidationTest extends DesktopCommonConfig {

	
	
//======================================Article================================================	
	/**
	 * This method is used to validate Home Page Change Language Section 
	 */
	@Test
	public void article_Consumption_01_worldArticleHeaderChangeLanguage() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyChangeLanguage();
	}
	
	/**
	 * This method is used to validate Download App link present in HomePage Header
	 */
	@Test
	public void article_Consumption_01_worldArticleHeaderDownloadApp() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyDownloadApp(serverType);
	}
	
	/**
	 * This method is used to validate Home Page Header Live TV
	 */
	@Test
	public void article_Consumption_01_worldArticleHeaderLiveTv() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyHeaderLiveTv(serverType);
	}
	
	/**
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void article_Consumption_01_worldArticleHeaderSocialShare() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifySocialMedia();
	}
	
	/**
	 * This method is used to validate Trending Topics Home Page Header
	 */
	@Test
	public void article_Consumption_01_worldArticleHeaderTrendingTopics() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyTrendingTopics(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_worldArticleHeaderLineOneSectionValidation () {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_worldArticleHeaderLineTwoSectionValidation () {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyLineTwoSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Hamburger Menu Validation present at the Header Part In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_worldArticleHeaderHamburgerMenuValidation () {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyLineOneHamburgerMenu(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_worldArticleHeaderLineOneSectionArticleValidation () {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyLineOneSectionArticles(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_worldArticleHeaderLineOneSectionSearchValidation () {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopArticleConsumptionPage.clickOnFirstLiveBlogArticle();
		pages.desktopLandingPage.verifyLineOneSearchButton();
	}
}