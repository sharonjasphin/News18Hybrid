package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyWebstoriesWidgetTest extends DesktopCommonConfig {


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
	public void webstoriesArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}

//	@Test
	public void webstoriesImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
	
	@Test
	public void webstoriesReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyWebstoriesReadMoreNavigation(serverType);
	}
}
