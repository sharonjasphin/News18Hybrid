package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyBollywoodWidgetTest extends DesktopCommonConfig {

	
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
	
//	@Test
	public void bollywoodArticleNavigation()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
//		pages.desktopHindiRevampLandingPage.verifyBollywoodArticleNavigation("preProd");
	}
	
//	@Test
	public void bollywoodImageNavigation()
	{
//		pages.desktopHindiRevampLandingPage.verifyBollywoodImageNavigation(serverType);
	}
	
	@Test
	public void bollywoodTabsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBollywoodTabsArticleNavigation(serverType);
	}
	
	@Test
	public void bollywoodTabsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBollywoodTabsImageNavigation(serverType);
	}
	
	@Test
	public void bollywoodRaedMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBollywoodReadMoreNavigation(serverType);
	}
	
	@Test
	public void bollywoodTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBollywoodTitleNavigation(serverType);
	}
}
