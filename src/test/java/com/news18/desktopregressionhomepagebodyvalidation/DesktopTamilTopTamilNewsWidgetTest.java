package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilTopTamilNewsWidgetTest extends DesktopCommonConfig{

	
	@Test
	public void topTamilNewsArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyTopTamilNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topTamilNewsImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyTopTamilNewsImageNavigation(serverType);
	}
}
