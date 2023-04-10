package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyMoneyWidgetTest extends DesktopCommonConfig {

	
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
	public void moneyArticleNavigation()
	{
//		pages.desktopHindiRevampLandingPage.verifyMoneyArticleNavigation(serverType);
	}
	
//	@Test
	public void moneyImageNavigation()
	{
//		pages.desktopHindiRevampLandingPage.verifyMoneyImageNavigation(serverType);
	}
	
	@Test
	public void moneyTabsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoneyTabsArticleNavigation(serverType);
	}
	
	@Test
	public void moneyTabsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoneyTabsImageNavigation(serverType);
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoneyTitleNavigation(serverType);
	}
	
	@Test
	public void moneyControlBannerNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoneyControlNavigation();
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMoneyReadMoreNavigation(serverType);
	}
}

