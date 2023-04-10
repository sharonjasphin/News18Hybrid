package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class DesktopHindiRevampHomepageBodyNews18MinisWidgetTest extends DesktopCommonConfig{

	
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
	public void news18MinisArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	@Test
	public void news18MinisImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisImageNavigation(serverType);
	}
	
	@Test
	public void news18MinisSeeMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisSeeMoreNavigation(serverType);
	}
	
	@Test
	public void news18MinisSliderNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisSliderNavigation();
	}
	
	@Test
	public void news18MinisReadFullStoryNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisReadFullStoryNavigation(serverType);
	}
	
	@Test
	public void news18MinisWorldNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyNews18MinisWorldOfNewsNavigation(serverType);
	}
	
}
