package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author DanishR
 * This class validates Desktop Hindi HomePage Download App
 */
public class DesktopHindiRevampHomePageHeaderDownloadApp extends DesktopCommonConfig {

	/**
	 * This method is used to navigate to Hindi News18 Home Page URL which is fetched from Property File
	 * URL-https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to validate Download App link present in HomePage Header
	 */
	@Test
	public void downloadApp() {
		pages.desktopHindiRevampArticleConsumptionPage.verifyDownloadApp();
	}

}
