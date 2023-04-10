package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatEntertainmentWidgetTest extends MobileCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
}
