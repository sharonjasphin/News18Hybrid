package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilTechnologyWidgetTest extends MobileCommonConfig {

	
	@Test
	public void technologyArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyTechnologyArticleNavigation(serverType);
	}
	
	@Test
	public void technologyImageNavigation()
	{
		pages.ampTamilLandingPage.verifyTechnologyImageNavigation(serverType);
	}
	
	@Test
	public void technologyReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyTechnologyReadMoreNavigation(serverType);
	}
	
	@Test
	public void technologyTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyTechnologyTitleNavigation(serverType);
	}
}
