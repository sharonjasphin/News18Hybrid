package com.news18.desktopregressionhomepagefootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the  footer Section elements Present of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopTamilFooterLastLayerSocialSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Trending Topic Sections present In Tamil News18 HomePage
	 */
	@Test
	public void footerLastLayerSocialSectionValidation () {
		pages.desktopTamilLandingPage.verifyFooterLastLayerSocialSection();
	}
}
