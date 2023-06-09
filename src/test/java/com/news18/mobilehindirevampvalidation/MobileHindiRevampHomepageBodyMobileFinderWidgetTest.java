package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *
 */
public class MobileHindiRevampHomepageBodyMobileFinderWidgetTest extends MobileCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
	//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test(priority = -1)
	public void latestMobileNewsArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyLatestMobileNewsArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test(priority = -11)
	public void latestMobileNewsImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyLatestMobileNewsImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test(priority = -14)
	public void latestMobileNewsMoreNewsNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyLatestMobileMoreNewsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void mobileBrandsNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyMobileBrandsNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileSliderNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTrendingAndRecommendedSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileStoriesNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTrendingAndRecommendedStoriesNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void trendingAndRecommendedMobileReadMoreNavigation()
	{
		pages.mobileHindiLandingPage.verifyTrendingAndRecommendedMobileReadMoreNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileSliderNavigation()
	{
		pages.mobileHindiLandingPage.verifyUpcomingMobileSliderNavigation();
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileStoriesNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyUpcomingMobileStoriesNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void upcomingMobileReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyUpcomingMobileReadMoreNavigation(serverType);
	}
}
