package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopEnglishArticleHeaderCricketValidationTest extends DesktopCommonConfig {

	
	
//======================================Article================================================	
	/**
	 * This method is used to validate Home Page Change Language Section 
	 */
	@Test
	public void article_Consumption_01_cricketArticleHeaderChangeLanguage() {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifyChangeLanguage();
	}
	
	/**
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void article_Consumption_01_cricketArticleHeaderSocialShare() {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifySocialMedia();
	}
	

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_cricketArticleHeaderLineOneSectionValidation () {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifyCricketLineOneSection(serverType);
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Hamburger Menu Validation present at the Header Part In English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_cricketArticleHeaderHamburgerMenuValidation () {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifyLineOneHamburgerMenu(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of English News18 HomePage
	 */
	@Test
	public void article_Consumption_02_cricketArticleHeaderLineOneSectionArticleValidation () {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifyCricketLineOneSectionArticles(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void article_Consumption_01_cricketArticleHeaderLineOneSectionSearchValidation () {
		pages.desktopLandingPage.clickOnLineOneCricketLink();
		pages.desktopCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.desktopLandingPage.verifyLineOneSearchButton();
	}
}