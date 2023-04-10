package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopEnglishPhotoArticleHeaderLifeStyleValidationTest extends DesktopCommonConfig {

	
	
//======================================Article================================================	
	/**
	 * This method is used to validate Home Page Change Language Section 
	 */
	@Test
	public void article_Consumption_01_lifeStyleArticleHeaderChangeLanguage() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyChangeLanguage();
	}
	
	/**
	 * This method is used to validate Download App link present in HomePage Header
	 */
	@Test
	public void article_Consumption_01_lifeStyleArticleHeaderDownloadApp() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyDownloadApp(serverType);
	}
	
	/**
	 * This method is used to validate Home Page Header Live TV
	 */
	@Test
	public void article_Consumption_01_lifeStyleArticleHeaderLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyHeaderLiveTv(serverType);
	}
	
	/**
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void article_Consumption_01_lifeStyleArticleHeaderSocialShare() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifySocialMedia();
	}
	
	/**
	 * This method is used to validate Trending Topics Home Page Header
	 */
	@Test
	public void article_Consumption_01_lifeStyleArticleHeaderTrendingTopics() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyTrendingTopics(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_lifeStyleArticleHeaderLineOneSectionValidation () {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void article_Consumption_03_lifeStyleArticleHeaderLineTwoSectionValidation () {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyLineTwoSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Hamburger Menu Validation present at the Header Part In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_lifeStyleArticleHeaderHamburgerMenuValidation () {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyLineOneHamburgerMenu(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_lifeStyleArticleHeaderLineOneSectionArticleValidation () {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyLineOneSectionArticles(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_lifeStyleArticleHeaderLineOneSectionSearchValidation () {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopArticleConsumptionPage.clickOnPhotoFirstArticle();
		pages.desktopLandingPage.verifyLineOneSearchButton();
	}
}