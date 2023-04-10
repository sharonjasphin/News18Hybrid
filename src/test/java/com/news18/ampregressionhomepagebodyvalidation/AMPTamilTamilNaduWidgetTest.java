package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilTamilNaduWidgetTest extends MobileCommonConfig{

	
	@Test
	public void tamilnaduArticleNavigation()
	{
		pages.ampTamilLandingPage.verifyTamilNaduArticleNavigations(serverType);	
	}
	
	@Test
	public void tamilnaduTitleNavigation()
	{
		pages.ampTamilLandingPage.verifyTamilNaduTitleNavigation(serverType);
	}
	
	@Test
	public void tamilnaduReadMoreNavigation()
	{
		pages.ampTamilLandingPage.verifyTamilNaduReadMoreNavigation(serverType);
	}
}
