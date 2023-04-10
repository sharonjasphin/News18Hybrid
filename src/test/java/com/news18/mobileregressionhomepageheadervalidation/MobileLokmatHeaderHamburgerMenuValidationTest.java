package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatHeaderHamburgerMenuValidationTest extends MobileCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Header Part Hamburger Menu Section Present In the Header Part of Mobile 
	 * Lokmat Homepage.
	 */
	@Test
	public void headerHamburgerSectionValidation()
	{
		pages.mobileLokmatLandingPage.verifyHeaderHamburgerSection(serverType);
	}
}
