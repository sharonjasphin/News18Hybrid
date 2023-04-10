package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilTechnologyWidgetTest extends MobileCommonConfig {

	
	@Test
	public void technologyArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyTechnologyArticleNavigation(serverType);
	}
	
	@Test
	public void technologyImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyTechnologyImageNavigation(serverType);
	}
	
	@Test
	public void technologyReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyTechnologyReadMoreNavigation(serverType);
	}
	
	@Test
	public void technologyTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyTechnologyTitleNavigation(serverType);
	}
}
