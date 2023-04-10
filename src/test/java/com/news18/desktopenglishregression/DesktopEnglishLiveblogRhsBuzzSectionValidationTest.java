package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsBuzzSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyBuzzSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyBuzzSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyBuzzSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyBuzzSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyBuzzSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
