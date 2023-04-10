package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article, sections and More News Link Navigation 
 * for Money Widget present on the body part of mobile hindi homepage
 */
/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiRevampHomepageBodyMoneyWidgetTest extends MobileCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
	
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	@Test
	public void  moneyTabsArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMoneyTabsArticleNavigation(serverType);
	}
	
	@Test
	public void moneyTabsImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMoneyTabsImageNavigation(serverType);
	}
	
	@Test
	public void moneyReaddMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMoneyReadMoreNavigation(serverType);
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMoneyTitleNavigation(serverType);
	}

	@Test
	public void moneyControlBannerNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMoneyBannerNavigation();
	}
}