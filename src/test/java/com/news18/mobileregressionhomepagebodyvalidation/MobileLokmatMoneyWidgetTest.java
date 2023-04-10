package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatMoneyWidgetTest extends MobileCommonConfig{

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
	public void moneyArticleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMoneyArticleNavigation("preprod");
	}
	
	@Test
	public void moneyImageNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMoneyImageNavigation("preprod");
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMoneyTitleNavigation("preprod");
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.mobileLokmatLandingPage.verifyMoneyReadMoreNavigation("preprod");
	}
}
