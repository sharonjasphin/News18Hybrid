package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyLiteratureWidgetTest extends DesktopCommonConfig {

	
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
	public void literatureArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLiteratureArticleNavigation(serverType);
	}

	@Test
	public void literatureImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLiteratureImageNavigation(serverType);
	}
	
	@Test
	public void verifyLiteratureReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLiteratureReadMoreNavigation(serverType);
	}

	@Test
	public void verifyLiteratureTitleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLiteratureTitleNavigation(serverType);
	}
}

