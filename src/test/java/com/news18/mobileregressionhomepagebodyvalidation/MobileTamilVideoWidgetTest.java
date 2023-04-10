package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilVideoWidgetTest extends MobileCommonConfig {

	
	@Test
	public void videoArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyVideoArticleNavigation(serverType);
	}
	
	@Test
	public void videoImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyVideoImageNavigation(serverType);
	}
	
	@Test
	public void videoReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyVideoReadMoreNavigation(serverType);
	}
	
	@Test
	public void videoTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyVideoTitleNavigation(serverType);
	}
}
