package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatMarathiNewsWidgetTest extends MobileCommonConfig {

	
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	
	@Test
	public void marathiNewsArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMarathiNewsArticleNavigation(serverType);
	}
	
	@Test
	public void marathiNewsImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMarathiNewsImageNavigation(serverType);
	}
}
