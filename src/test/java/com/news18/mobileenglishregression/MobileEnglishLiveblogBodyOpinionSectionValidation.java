package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishLiveblogBodyOpinionSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_OpinionSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_OpinionSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_OpinionSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneOpinionLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
