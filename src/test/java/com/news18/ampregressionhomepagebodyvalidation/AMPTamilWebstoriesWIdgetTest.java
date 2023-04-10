package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilWebstoriesWIdgetTest extends MobileCommonConfig{

	
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
	
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.ampTamilLandingPage.verifyWebstoriesSliderNavigation();
	}
}
