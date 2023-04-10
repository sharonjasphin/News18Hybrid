package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilTamilNaduWidgetTest extends DesktopCommonConfig {

	
	@Test
	public void tamilnaduArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyTamilNaduArticleNavigation(serverType);
	}
	
	@Test
	public void tamilnaduImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyTamilNaduImageNavigation(serverType);
	}
	
	@Test
	public void tamilnaduTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyTamilNaduTitleNavigation(serverType);
	}
	
	@Test
	public void tamilnaduReadMoreNavigation()
	{
		pages.desktopTamilLandingPage.verifyTamilNaduReadMoreNavigation(serverType);
	}
}
