package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class DesktopHindiRevampHomepageBodyMobileTechWidgetTest extends DesktopCommonConfig
{


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
	public void mobileTechTabsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMobileTechTabsArticleNavigation(serverType);
	}


	@Test
	public void mobileTechTabsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMobileTechTabsImageNavigation(serverType);
	}

	@Test
	public void mobileTechReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMobileTechReadMoreNavigation(serverType);
	}

	@Test
	public void mobileTechTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMobileTechTitleNavigation(serverType);
	}
}
