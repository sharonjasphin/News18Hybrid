package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop English HomePage 
 */
public class DesktopEnglishHomePageLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to English News18 Home Page URL which is fetching from Property File
	 * URL-https://news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void englishHomePageLinksValidation() throws Throwable {
		pages.homePageLinksValidation.verifyAllBetaLinks(serverType);
	}
}

