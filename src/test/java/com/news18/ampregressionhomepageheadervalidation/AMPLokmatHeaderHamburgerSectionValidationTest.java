package com.news18.ampregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Header Part of Mobile Lokmat HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class AMPLokmatHeaderHamburgerSectionValidationTest extends MobileCommonConfig {

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Header District Section In Lokmat News18 HomePage
	 */
	@Test
	public void headerHamburgerLanguageSection() {
		pages.ampLokmatLandingPage.verifyHeaderHamburgerLanguageSection();
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Header District Section In Lokmat News18 HomePage
	 */
	@Test
	public void headerHamburgerSection() {
		pages.ampLokmatLandingPage.verifyHeaderHamburgerSection(serverType);
	}
}
