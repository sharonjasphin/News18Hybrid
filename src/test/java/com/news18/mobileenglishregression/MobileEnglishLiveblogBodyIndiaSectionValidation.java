package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodyIndiaSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_IndiaSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_IndiaSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_IndiaSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneIndiaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
