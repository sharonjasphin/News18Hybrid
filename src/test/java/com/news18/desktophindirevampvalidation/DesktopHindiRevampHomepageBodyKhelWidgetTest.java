package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Methods to Validate the Body Khel Widget
 */
public class DesktopHindiRevampHomepageBodyKhelWidgetTest extends DesktopCommonConfig {

	
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
	public void bodyKhelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelArticleNavigation(serverType);
	}

	@Test
	public void bodyKhelImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelImageNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelTitleNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTabsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelTabsArticleNavigation(serverType);
	}
	
	@Test
	public void bodyKhelTabsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelTabsImageNavigation(serverType);
	}
	
	@Test
	public void bodyKhelReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyBodyKhelReadMoreNavigation(serverType);
	}
}
