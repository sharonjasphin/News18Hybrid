package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodyLifestyleSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_LifestyleSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_LifestyleSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_LifestyleSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneLifeStyleLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
