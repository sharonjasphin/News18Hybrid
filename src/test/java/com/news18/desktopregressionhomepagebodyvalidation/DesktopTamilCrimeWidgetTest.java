package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilCrimeWidgetTest extends DesktopCommonConfig {

	
	@Test
	public void crimeArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyCrimeArticleNavigation(serverType);
	}
	
	@Test
	public void crimeImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyCrimeImageNavigation(serverType);
	}
	
	@Test
	public void crimeTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyCrimeTitleNavigation(serverType);
	}
	
	@Test
	public void crimeReadMoreNavigation()
	{
		pages.desktopTamilLandingPage.verifyCrimeReadMoreNavigation(serverType);
	}
}
