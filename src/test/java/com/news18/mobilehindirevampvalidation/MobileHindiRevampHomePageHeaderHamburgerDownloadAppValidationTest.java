package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * @author DanishR
 * This Class Contains scripts to verify the Hamburger Menu Header Section Present after Clicking On Hamburger Icon Present 
 * on Mobile Hindi HomePage.
 * @author DanishR
 */
public class MobileHindiRevampHomePageHeaderHamburgerDownloadAppValidationTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Language Drop down Present In Hamburger Menu of Mobile Hindi Home Page.
	 */
	@Test
	public void hamburgerLanguageSectionValidation () {
		pages.mobileHindiRevampArticleConsumptionPage.verfyhamburgerDownloadAppSection(); 
	}
}
