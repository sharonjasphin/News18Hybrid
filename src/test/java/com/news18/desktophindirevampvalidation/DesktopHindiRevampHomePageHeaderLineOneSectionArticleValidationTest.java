package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the line One Article Sections Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://hindi.news18.com/
 */
public class DesktopHindiRevampHomePageHeaderLineOneSectionArticleValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://hindi.news18.com/
	 */
	//@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Line One Section Articles Present In Header of Hindi News18 HomePage
	 */
	@Test
	public void lineOneSectionArticleValidation () {
		pages.desktopHindiRevampArticleConsumptionPage.verifyHeaderlineOneArticleSectionValidation();
	}
}
