package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilAutomobileWidgetTest extends MobileCommonConfig {

	
	@Test
	public void automobileArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyAutomobileArticleNavigation(serverType);
	}
	
	@Test
	public void automobileImageNavigation()
	{
		pages.ampTamilLandingPage.verifyAutomobileImageNavigation(serverType);
	}
	
	@Test
	public void automobileReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyAutomobileReadMoreNavigation(serverType);
	}
	
	@Test
	public void automobileTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyAutomobileTitleNavigation(serverType);
	}
}
