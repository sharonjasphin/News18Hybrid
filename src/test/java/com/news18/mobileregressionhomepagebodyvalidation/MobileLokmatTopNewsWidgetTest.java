package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatTopNewsWidgetTest extends MobileCommonConfig
{

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void topNewsArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyTopNewsArticleNavigation("preprod");
	}
	
	@Test
	public void topNewsImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyTopNewsImageNavigation(serverType);
	}
	
	@Test
	public void topNewsReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyTopNewsReadMoreNavigation(serverType);
	}
	
	@Test
	public void topNewsTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyTopNewsTitleNavigation(serverType);
	}
}
