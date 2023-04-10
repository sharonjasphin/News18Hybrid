package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilPhotogalleryWidgetTest extends MobileCommonConfig {

	@Test
	public void photogalleryArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyPhotogalleryArticleNavigation(serverType);
	}
	
	@Test
	public void photogalleryImageNavigation()
	{
		pages.ampTamilLandingPage.verifyPhotogalleryImageNavigation(serverType);
	}
	
	@Test(priority = -1)
	public void photogalleryTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyPhotogalleryTitleNavigation(serverType);
	}
	
	@Test
	public void photogalleryReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyPhotogalleryReadMoreNavigation(serverType);
	}
}
