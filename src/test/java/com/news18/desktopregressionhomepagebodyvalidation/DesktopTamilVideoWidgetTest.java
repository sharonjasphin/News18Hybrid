package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilVideoWidgetTest extends DesktopCommonConfig{

	@Test
	public void videoArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyVideoArticleNavigation(serverType);
	}
	
	@Test
	public void videoImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyVideoImageNavigation(serverType);
	}
	
	@Test
	public void videoTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyVideoTitleNavigation(serverType);
	}
}
