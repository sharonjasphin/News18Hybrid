package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify header Section of Hindi Revamp Article consumption Page.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class MobileHindiRevampCategoryHeaderNews18MinisLPWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHeaderLineOneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyLineOneSection(serverType);
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHeaderSearchSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfySearchButton(); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHeaderSeherChuneSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyRajyaSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuLHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuLHSSectionRajyaSeherChune () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLHSSectionRajyaSeherCHune(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuRHSSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerRHSSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuSocialShareSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerSocialShareSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuChnageLanguageSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerChangeLanguageSection(serverType); 
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuLiveTvSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerLiveTvSection(serverType); 
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Search Icon In Hindi revamp Article consumption page
	 */
	@Test
	public void news18MinisArticleVerifyHamburgerMenuDownloadAppSection () {
		pages.mobileHindiRevampLandingPage.clickOnLineOneNews18MinisLink();
		
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
}
