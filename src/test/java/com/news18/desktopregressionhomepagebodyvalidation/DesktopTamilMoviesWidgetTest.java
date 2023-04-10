package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilMoviesWidgetTest extends DesktopCommonConfig{

	
	@Test(priority = 0)
	public void moviesArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyMoviesArticleNavigation(serverType);
	}
	
	@Test(priority = -1)
	public void moviesImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyMoviesImageNavigation(serverType);
	}
	
	@Test(priority = -2)
	public void moviesTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyMoviesTitleNavigation(serverType);
	}
}
