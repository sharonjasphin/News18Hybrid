package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Education and Career News Link Navigation 
 * for Education And Career Widget
 */

public class DesktopEnglishHomePageBodyEducationAndCareerWidgetTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Education And Career Widget Article Text Navigation
	 */
	@Test
	public void educationAndCareerArticleNavigation()
	{
		pages.desktopLandingPage.verifyEducationAndCareerArticleNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The Education And Career Widget Image Navigation
	 */
	@Test
	public void educationAndCareerImageNavigation()
	{
		pages.desktopLandingPage.verifyEducationAndCareerImageNavigation(this.serverType);
	}

	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify The More Education And Career News Navigation
	 */
	@Test
	public void educationAndCareerMoreNewsNavigation()
	{
		pages.desktopLandingPage.verifyMoreEducationAndCarrerNews(this.serverType);
	}
}
