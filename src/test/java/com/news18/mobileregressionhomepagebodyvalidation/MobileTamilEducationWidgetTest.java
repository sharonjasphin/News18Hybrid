package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilEducationWidgetTest extends MobileCommonConfig {

	
	@Test
	public void educationArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyEducationArticleNavigation(serverType);
	}
	
	@Test
	public void educationImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyEducationImageNavigation(serverType);
	}
	
	@Test
	public void educationReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyEducationReadMoreNavigation(serverType);
	}
	
	@Test
	public void educationTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyEducationTitleNavigation(serverType);
	}
}
