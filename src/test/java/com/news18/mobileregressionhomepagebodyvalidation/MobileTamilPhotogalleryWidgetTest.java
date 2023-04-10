package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilPhotogalleryWidgetTest extends MobileCommonConfig {

	@Test
	public void photogalleryArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyPhotogalleryArticleNavigation(serverType);
	}
	
	@Test
	public void photogalleryImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyPhotogalleryImageNavigation(serverType);
	}
	
	@Test(priority = -1)
	public void photogalleryTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyPhotogalleryTitleNavigation(serverType);
	}
	
	@Test
	public void photogalleryReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyPhotogalleryReadMoreNavigation(serverType);
	}
}
