package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampCategoryHeaderLifeStyleLPWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void lifestyleArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLifeStyleLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
}
