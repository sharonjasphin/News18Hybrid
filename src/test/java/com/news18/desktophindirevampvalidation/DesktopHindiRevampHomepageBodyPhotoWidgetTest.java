package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyPhotoWidgetTest extends DesktopCommonConfig {


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
	public void photoArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoArticleNavigation(serverType);
	}

//	@Test
	public void photoImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoImageNavigation(serverType);
	}

	@Test
	public void photoTabsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoTabsArticleNavigation(serverType);
	}

	@Test
	public void photoTabsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoTabsImageNavigation(serverType);
	}

	@Test
	public void photoTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoTitleNavigation(serverType);
	}
	
	@Test
	public void photoReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPhotoReadMoreNavigation(serverType);
	}
}
