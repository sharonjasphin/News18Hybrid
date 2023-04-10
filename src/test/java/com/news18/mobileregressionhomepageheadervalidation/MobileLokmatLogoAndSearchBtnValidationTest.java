package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


public class MobileLokmatLogoAndSearchBtnValidationTest extends MobileCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Header Part logo and Search Section Present In the Header Part of Mobile 
	 * Lokmat Homepage.
	 */
	@Test
	public void headerLogoAndSearchValidation()
	{
		pages.mobileLokmatLandingPage.verifyHeaderLogoAndSearchSection();
	}
}
