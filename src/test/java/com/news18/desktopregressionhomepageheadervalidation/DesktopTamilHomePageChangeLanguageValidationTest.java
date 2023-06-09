package com.news18.desktopregressionhomepageheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;


/**
 * @author SanjeebKumarPati
 * This Class Contains Methods for Validating Change Language Section Present on Desktop tamil Landing Page.
 */
public class DesktopTamilHomePageChangeLanguageValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This Method is use to validate Chnage Language Section.
	 */
	@Test
	public void changeLanguageSectionValidation() {
		pages.desktopLokmatLandingPage.verifyChangeLanguage();
	}

}

