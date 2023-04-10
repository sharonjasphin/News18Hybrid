package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatMarathiNewsWidgetTest extends MobileCommonConfig{

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void marathiNewsArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyMarathiNewsArticleNavigation(serverType);
	}
	
	@Test
	public void marathiNewsImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyMarathiNewsImageNavigation(serverType);
	}
}
