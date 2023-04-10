package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilLocalNewsWidgetTest extends DesktopCommonConfig {

	
	@Test
	public void localNewsArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyLocalNewsArticleNavigation(serverType);
	}
	
	@Test
	public void localNewsReadMoreNavigation()
	{
		pages.desktopTamilLandingPage.verifyLocalNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void localNewsSliderNavigation()
	{
		pages.desktopTamilLandingPage.verifyLocalNewsSliderNavigation();
	}
	
	@Test
	public void localNewsTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyLocalNewsTitleNavigation(serverType);
	}
}
