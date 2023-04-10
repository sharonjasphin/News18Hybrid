package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyMobileFinderWidgetTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	@Test
	public void latestMobileNewsArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLatestMobileNewsArticleNavigation(serverType);
	}

	@Test
	public void latestMobileNewsImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLatestMobileNewsImageNavigation(serverType);
	}

	@Test
	public void latestMobileNewsMoreNewsNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyLatestMobileMoreNewsNavigation(serverType);
	}

	@Test
	public void mobileBrandsNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyMobileBrandsNavigation(serverType);
	}

	@Test
	public void trendingAndRecommendedMobileSliderNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyTrendingAndRecommendedSliderNavigation();
	}

	@Test
	public void trendingAndRecommendedMobileStoriesNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyTrendingAndRecommendedStoriesNavigation(serverType);
	}

	@Test
	public void trendingAndRecommendedMobileReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyTrendingAndRecommendedMobileReadMoreNavigation(serverType);
	}

	@Test
	public void upcomingMobileSliderNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyUpcomingMobileSliderNavigation();
	}

	@Test
	public void upcomingMobileStoriesNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyUpcomingMobileStoriesNavigation(serverType);
	}

	@Test
	public void upcomingMobileReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyUpcomingMobileReadMoreNavigation(serverType);
	}
}
