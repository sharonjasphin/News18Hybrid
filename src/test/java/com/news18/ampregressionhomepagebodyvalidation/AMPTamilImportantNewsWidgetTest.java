package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilImportantNewsWidgetTest extends MobileCommonConfig {

	
	@Test
	public void importantNewsArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyImportantNewsArticleNavigation(serverType);
	}
	
	@Test
	public void importantNewsImageNavigation()
	{
		pages.ampTamilLandingPage.verifyImportantNewsImageNavigation(serverType);
	}
	
	@Test
	public void importantNewsReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyImportantNewsReadMoreNavigation(serverType);
	}
}
