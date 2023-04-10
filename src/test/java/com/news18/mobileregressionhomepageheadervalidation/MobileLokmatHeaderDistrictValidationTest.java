package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatHeaderDistrictValidationTest extends MobileCommonConfig{

	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Header Part District Section Present In the Header Part of Mobile 
	 * Lokmat Homepage.
	 */
	@Test
	public void headerDistrictValidation()
	{
		pages.mobileLokmatLandingPage.verifyHeaderDistrictSection(serverType);
	}
}
