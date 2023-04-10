package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatEntertainmentWidgetTest extends MobileCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
}
