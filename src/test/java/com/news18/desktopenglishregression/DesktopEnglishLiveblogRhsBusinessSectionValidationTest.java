package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsBusinessSectionValidationTest extends DesktopCommonConfig {
	
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
	public void live_Blog_10_VerifyBusinessSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyBusinessSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyBusinessSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyBusinessSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Business Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyBusinessSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}

}
