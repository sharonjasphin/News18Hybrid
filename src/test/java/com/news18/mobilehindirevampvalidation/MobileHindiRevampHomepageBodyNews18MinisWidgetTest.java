package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article, sections and More News Link Navigation 
 * for Money Widget present on the body part of mobile hindi homepage
 */
/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiRevampHomepageBodyNews18MinisWidgetTest extends MobileCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
	
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisReaddMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18MinisReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18MinisTitleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18MinisArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18MinisImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18MinisBannerNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18MinisWorldOfNewsNavigation(serverType);
	}
 
}