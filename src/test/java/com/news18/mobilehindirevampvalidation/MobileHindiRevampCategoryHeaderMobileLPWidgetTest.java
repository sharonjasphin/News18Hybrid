package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampCategoryHeaderMobileLPWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void mobileArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneLatestMobileLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
}
