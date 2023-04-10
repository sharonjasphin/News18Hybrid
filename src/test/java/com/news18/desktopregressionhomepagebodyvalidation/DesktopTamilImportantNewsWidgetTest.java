package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilImportantNewsWidgetTest extends DesktopCommonConfig{

	
	@Test
	public void importantNewsArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyImportantNewsArticleNavigation(serverType);
	}
	
	@Test
	public void importantNewsTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyImportantNewsTitleNavigation(serverType);
	}
}
