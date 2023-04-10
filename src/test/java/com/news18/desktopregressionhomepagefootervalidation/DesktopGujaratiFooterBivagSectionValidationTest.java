package com.news18.desktopregressionhomepagefootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *  * This Class Contains scripts to verify the  footer Section elements Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 */
public class DesktopGujaratiFooterBivagSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer bivag Sections present In Gujarati News18 HomePage
	 */
	@Test
	public void footerBivagSectionValidation () {
		pages.desktopGujaratiLandingPage.verifyFooterBivagSection(serverType);
	}
}