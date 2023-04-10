package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatMaharashtraCitiesWidgetTest extends MobileCommonConfig {


//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}

	@Test
	public void maharashtraArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyMaharashtraArticleNavigation(serverType);
	}
	
	@Test
	public void maharashtraImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyMaharashtraImageNavigation(serverType);
		
	}

	@Test
	public void maharashtraTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyMaharashtraTitleNavigation(serverType);
	}

	@Test
	public void maharashtraReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyMaharashtraReadMoreNavigation(serverType);
	}
}