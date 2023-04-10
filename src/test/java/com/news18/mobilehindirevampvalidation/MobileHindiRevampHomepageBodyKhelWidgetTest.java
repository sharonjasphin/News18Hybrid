package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiRevampHomepageBodyKhelWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBodyKhelTabsArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBodyKhelTabsImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void bodySportsTabReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyBodyKhelReadMoreNavigation(serverType);
	}
}
