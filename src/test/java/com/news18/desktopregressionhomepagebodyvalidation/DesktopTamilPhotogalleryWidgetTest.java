package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilPhotogalleryWidgetTest extends DesktopCommonConfig{

	@Test
	public void photogalleryArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyPhotogalleryArticleNavigation(serverType);
	}
	
	@Test
	public void photogalleryImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyPhotogalleryImageNavigation(serverType);
	}
	
	@Test
	public void photogalleryTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyPhotogalleryTitleNavigation(serverType);
	}
}
