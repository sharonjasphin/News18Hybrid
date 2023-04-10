package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodySportsSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_SportsSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_SportsSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_SportsSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
