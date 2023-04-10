package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatTopNewsWidgetTest extends MobileCommonConfig
{

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void topNewsArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyTopNewsArticleNavigation(serverType);
	}
	
	@Test
	public void topNewsImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyTopNewsImageNavigation(serverType);
	}
	
	@Test
	public void topNewsReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyTopNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void topNewsTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyTopNewsTitleNavigation(serverType);
	}
}
