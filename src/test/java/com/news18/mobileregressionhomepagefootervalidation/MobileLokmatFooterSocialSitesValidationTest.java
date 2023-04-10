package com.news18.mobileregressionhomepagefootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the Sections Present at Footer on Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class MobileLokmatFooterSocialSitesValidationTest extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate the footer Section Present at footer of Mobile Lokmat Home Page.
	 */
	@Test
	public void footerSocialSitesValidation () {
		pages.mobileLokmatLandingPage.verifyFooterSocialSection(serverType);
	}
}
