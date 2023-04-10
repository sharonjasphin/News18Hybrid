package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class AMPTamilTopTamilNewsWidgetTest extends MobileCommonConfig{

	@Test
	public void topTamilNewsAArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyTopTamilNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topTamilNewsImageNavigation()
	{
		pages.ampTamilLandingPage.verifyTopTamilNewsImageNavigation(serverType);
	}
}
