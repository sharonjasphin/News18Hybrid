package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line Two Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopEnglishHomePageHeaderLineTwoValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections present under Line One section In English News18 HomePage
	 */
	@Test
	public void lineTwoSectionValidation () {
		pages.desktopLandingPage.verifyLineTwoSection(serverType);
	}
}
