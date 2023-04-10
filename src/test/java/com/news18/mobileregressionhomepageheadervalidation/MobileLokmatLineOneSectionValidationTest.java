package com.news18.mobileregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the  MObile line One Sections Present at the Header Part of Mobile English HomePage.
 * @author SanjeebKumarPati
 */
public class MobileLokmatLineOneSectionValidationTest extends MobileCommonConfig {
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Sections In lokmat News18 HomePage
	 */
	@Test
	public void lineOneSectionValidation () {
		pages.mobileLokmatLandingPage.verifyLineOneSection(serverType);
	}
}
