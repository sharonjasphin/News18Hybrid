package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilImportantNewsWidgetTest extends MobileCommonConfig {

	
	@Test
	public void importantNewsArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyImportantNewsArticleNavigation(serverType);
	}
	
	@Test
	public void importantNewsImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyImportantNewsImageNavigation(serverType);
	}
	
	@Test
	public void importantNewsReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyImportantNewsReadMoreNavigation(serverType);
	}
}
