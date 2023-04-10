package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilEntertainmentWidgetTest extends MobileCommonConfig {

	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
}
