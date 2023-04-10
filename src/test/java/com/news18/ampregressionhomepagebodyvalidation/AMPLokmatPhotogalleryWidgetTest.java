package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class AMPLokmatPhotogalleryWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyPhotogalleryArticleNavigation(serverType);
	}
	
	@Test
	public void photogalleryImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyPhotogalleryImageNavigation(serverType);
	}
	
	@Test
	public void photogalleryTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyPhotogalleryTitleNavigation(serverType);
	}
	
	@Test
	public void photogalleryReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyPhotogalleryReadMoreNavigation(serverType);
	}
}
