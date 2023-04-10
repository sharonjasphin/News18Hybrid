package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatMoneyWidgetTest extends MobileCommonConfig{

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
	public void moneyArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyMoneyArticleNavigation(serverType);
	}
	
	@Test
	public void moneyImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyMoneyImageNavigation(serverType);
	}
	
	@Test
	public void moneyTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyMoneyTitleNavigation(serverType);
	}
	
	@Test
	public void moneyReadMoreNavigation()
	{
		pages.ampLokmatLandingPage.verifyMoneyReadMoreNavigation(serverType);
	}
}
