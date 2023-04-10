package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

public class MobileLokmatPhotogalleryWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void photogalleryArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyPhotogalleryArticleNavigation("preprod");
	}
	
	@Test
	public void photogalleryImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyPhotogalleryImageNavigation("preprod");
	}
	
	@Test
	public void photogalleryTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyPhotogalleryTitleNavigation("preprod");
	}
	
	@Test
	public void photogalleryReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyPhotogalleryReadMoreNavigation("preprod");
	}
}
