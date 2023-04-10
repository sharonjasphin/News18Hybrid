package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodyPoliticsSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_PoliticsSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_PoliticsSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_PoliticsSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOnePoliticsLink();
		pages.mobileArticleConsumptionPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
