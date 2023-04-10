package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class AMPLokmatVideoWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://lokmat.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void videoArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyVideoArticleNavigation(serverType);
	}
	
	@Test
	public void videoImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyVideoImageNavigation(serverType);
	}
	
	@Test
	public void videoTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyVideoTitleNavigation(serverType);
	}
	
	@Test
	public void videoReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyVideoReadMoreNavigation(serverType);
	}
}
