package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilWebstoriesWIdgetTest extends MobileCommonConfig{
	
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
	
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.mobileTamilLandingPage.verifyWebstoriesSliderNavigation();
	}
}
