package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileLokmatVideoWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void videoArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyVideoArticleNavigation(serverType);
	}
	
	@Test
	public void videoImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyVideoImageNavigation(serverType);
	}
	
	@Test
	public void videoTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyVideoTitleNavigation(serverType);
	}
	
	@Test
	public void videoReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyVideoReadMoreNavigation(serverType);
	}
}
