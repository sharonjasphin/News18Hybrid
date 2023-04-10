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
public class MobileHindiRevampHomepageBodyNews18HindiPlusWidgetTest extends MobileCommonConfig {


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
	public void news18HindiPlusReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18HindiPlusReadMoreNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18HindiPlusTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18HindiPlusTitleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18HindiPlusArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18HindiPlusArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void news18HindiPlusImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyNews18HindiPlusImageNavigation(serverType);
	}

 
}