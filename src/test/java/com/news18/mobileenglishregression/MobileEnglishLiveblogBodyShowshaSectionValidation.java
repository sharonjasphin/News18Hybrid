package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodyShowshaSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_ShowshaSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_ShowshaSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_ShowshaSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
