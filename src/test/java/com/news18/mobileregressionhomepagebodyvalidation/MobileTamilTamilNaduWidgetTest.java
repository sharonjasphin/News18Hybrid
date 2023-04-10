package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilTamilNaduWidgetTest extends MobileCommonConfig{

	
	@Test
	public void tamilnaduArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyTamilNaduArticleNavigations(serverType);	
	}
	
	@Test
	public void tamilnaduTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyTamilNaduTitleNavigation(serverType);
	}
	
	@Test
	public void tamilnaduReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyTamilNaduReadMoreNavigation(serverType);
	}
}
