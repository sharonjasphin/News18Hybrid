package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class MobileTamilTopTamilNewsWidgetTest extends DesktopCommonConfig{

	@Test
	public void topTamilNewsAArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyTopTamilNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topTamilNewsImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyTopTamilNewsImageNavigation(serverType);
	}
}
