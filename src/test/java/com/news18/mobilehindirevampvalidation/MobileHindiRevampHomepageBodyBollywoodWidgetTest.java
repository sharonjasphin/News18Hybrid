package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiRevampHomepageBodyBollywoodWidgetTest extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	@Test
	public void bollywoodTabsArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBollywoodTabsArticleNavigation(serverType);
	}
	
	@Test
	public void bollywoodTabsImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBollywoodTabsImageNavigation(serverType);
	}
	
	@Test
	public void bollywoodRaedMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBollywoodReadMoreNavigation(serverType);
	}
	
	@Test
	public void bollywoodTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBollywoodTitleNavigation(serverType);
	}
	
}
