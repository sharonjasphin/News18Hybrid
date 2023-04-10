package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilAutomobileWidgetTest extends MobileCommonConfig {

	
	@Test
	public void automobileArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyAutomobileArticleNavigation(serverType);
	}
	
	@Test
	public void automobileImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyAutomobileImageNavigation(serverType);
	}
	
	@Test
	public void automobileReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyAutomobileReadMoreNavigation(serverType);
	}
	
	@Test
	public void automobileTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyAutomobileTitleNavigation(serverType);
	}
}
