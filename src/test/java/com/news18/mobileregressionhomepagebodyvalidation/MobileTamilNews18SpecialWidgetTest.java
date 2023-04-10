package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilNews18SpecialWidgetTest extends MobileCommonConfig{

	@Test
	public void news18SpecialArticleNavigation()
	{
		pages.mobileTamilLandingPage.verifyNews18SpecialArticleNavigation(serverType);
	}
	
	@Test
	public void news18SpecialImageNavigation()
	{
		pages.mobileTamilLandingPage.verifyNews18SpecialImageNavigation(serverType);
	}
	
	@Test
	public void news18SpecialTitleNavigation()
	{
		pages.mobileTamilLandingPage.verifyNews18SpecialTitleNavigation(serverType);
	}
	
	@Test
	public void news18SpecialReadMoreNavigation()
	{
		pages.mobileTamilLandingPage.verifyNews18SpecialReadMoreNavigation(serverType);
	}
}
