package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatNews18MinisWidgetTest extends MobileCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for Hindi Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisWorldOfNewsNavigation()
	{
		pages.mobileLokmatLandingPage.verifyNews18MinisWorldOfNewsNavigation("preprod");
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyNews18MinisImageNavigation("preprod");
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyNews18MinisArticleNavigation("preprod");
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyNews18MinisReadMoreNavigation("preprod");
	}
}
