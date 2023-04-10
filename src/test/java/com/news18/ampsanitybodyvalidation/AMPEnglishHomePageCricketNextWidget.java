package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of CricketNext widget article ,Image and More Link
 */
public class AMPEnglishHomePageCricketNextWidget extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of CricketNext Widget Article
	 */
	@Test
	public void verifyEnglishHomePageCricketNextWidgetArticle() {
		pages.ampSanityLandingPage.verifyCricketNextWidgetArticle(serverType);        
	}
	
}
