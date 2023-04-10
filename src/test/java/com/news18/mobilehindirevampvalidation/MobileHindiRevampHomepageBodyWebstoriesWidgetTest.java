package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomepageBodyWebstoriesWidgetTest extends MobileCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
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
	public void webstoriesArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
	public void webstoriesImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyWebstoriesImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyWebstoriesSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
