package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsIndiaSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
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
	public void live_Blog_10_VerifyIndiaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyIndiaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyIndiaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyIndiaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyIndiaSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
