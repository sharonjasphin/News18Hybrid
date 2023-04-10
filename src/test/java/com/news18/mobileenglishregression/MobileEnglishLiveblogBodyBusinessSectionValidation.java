package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileEnglishLiveblogBodyBusinessSectionValidation extends MobileCommonConfig{
	//	@BeforeMethod
	//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Title
	 */
	@Test
	public void live_Blog_Mweb_08_BusinessSectionTrendingNewsTitle() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileLiveblogPage.verifyTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_Mweb_08_BusinessSectionTrendingNewsArticles() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileLiveblogPage.verifyTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_Mweb_08_BusinessSectionTrendingNewsReadMore() {
		pages.mobileLandingPage.clickOnLineOneBusinessLink();
		pages.mobileLiveblogPage.verifyTrendingNewsReadMoreNavigation(serverType);
	}
}
