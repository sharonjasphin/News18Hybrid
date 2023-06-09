package com.news18.ampregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the  AMP line One Sections Present at the Header Part of Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class AMPEnglishHamburgerSocialShareSectionValidationTest extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	//@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate hamburger Menu Header Section In English News18 HomePage In AMP View.
	 */
	@Test
	public void hamburgerMenuHeaderChangeLanguageSectionValidation () {
		pages.ampLandingPage.verfyhamburgerSocialShareValidation(serverType);
	}
}
