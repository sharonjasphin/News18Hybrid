package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilEducationWidgetTest extends MobileCommonConfig {

	
	@Test
	public void educationArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyEducationArticleNavigation(serverType);
	}
	
	@Test
	public void educationImageNavigation()
	{
		pages.ampTamilLandingPage.verifyEducationImageNavigation(serverType);
	}
	
	@Test
	public void educationReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyEducationReadMoreNavigation(serverType);
	}
	
	@Test
	public void educationTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyEducationTitleNavigation(serverType);
	}
}
