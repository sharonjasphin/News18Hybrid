package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line One Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopTamilLineOneSearchIconValidationTest extends DesktopCommonConfig {
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line Two Sections In Tamil News18 HomePage
	 */
	@Test
	public void lineTwoSectionValidation () {
		pages.desktopTamilLandingPage.verifyLineOneSearchSection();
	}
}
