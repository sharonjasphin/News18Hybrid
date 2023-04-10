package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilVideoWidgetTest extends MobileCommonConfig {

	
	@Test
	public void videoArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyVideoArticleNavigation(serverType);
	}
	
	@Test
	public void videoImageNavigation()
	{
		pages.ampTamilLandingPage.verifyVideoImageNavigation(serverType);
	}
	
	@Test
	public void videoReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyVideoReadMoreNavigation(serverType);
	}
	
	@Test
	public void videoTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyVideoTitleNavigation(serverType);
	}
}
