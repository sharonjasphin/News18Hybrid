package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatMaharashtraCitiesWidgetTest extends MobileCommonConfig {


//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}

	@Test
	public void maharashtraCitiesArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyLokmatCitiesNavigations("preprod");
	}

	@Test
	public void maharashtraCitiesTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMaharashtraTitleNavigation("preprod");
	}

	@Test
	public void maharashtraCitiesReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMaharashtraReadMoreNavigation("preprod");
	}
}