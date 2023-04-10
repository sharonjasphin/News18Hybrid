package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyCricketWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	@Test
	public void cricketArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyCricketArticleNavigation(serverType);
	}
	
	@Test
	public void cricketImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyCricketImageNavigation(serverType);
	}
	
	@Test
	public void cricketReadMoreNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoreCricketNewsNavigation(serverType);
	}
	
//	@Test
	public void cricketDhamalNavigation()
	{
//		pages.desktopHindiRevampLandingPage.verifyCricketDhamalNavigation(serverType);
	}
	
	@Test
	public void cricketTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyCricketTitleNavigation(serverType);
	}
}
