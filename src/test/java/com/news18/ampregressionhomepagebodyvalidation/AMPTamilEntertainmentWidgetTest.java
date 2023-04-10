package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilEntertainmentWidgetTest extends MobileCommonConfig {

	
	@Test
	public void entertainmentArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyEntertainmentArticleNavigation(serverType);
	}
	
	@Test
	public void entertainmentImageNavigation()
	{
		pages.ampTamilLandingPage.verifyEntertainmentImageNavigation(serverType);
	}
	
	@Test
	public void entertainmentTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyEntertainmentTitleNavigation(serverType);
	}
	
	@Test
	public void entertainmentReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyEntertainmentReadMoreNavigation(serverType);
	}
}
