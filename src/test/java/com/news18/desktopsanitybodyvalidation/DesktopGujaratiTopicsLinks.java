package com.news18.desktopsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author DanishR
 * This class validate URLs present on the Desktop Gujarati HomePage 
 */
public class DesktopGujaratiTopicsLinks extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Gujarati News18 Home Page URL which is fetching from Property File
	 * URL-https://betagujarati.news18.com/
	 */
//	@BeforeMethod
	public void navigateToGujaratiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("gujaratiUrl"));
	}
	
	/**
	 * This method is used to validate Home Page Urls
	 */
	@Test
	public void gujaratiHomePage() throws Throwable {
		pages.desktopGujaratiSanityLandingPage.verifyTrendingTopics(serverType);
	}
}

