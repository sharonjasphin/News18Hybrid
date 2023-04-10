package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsMovieSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyMovieSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyMovieSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyMovieSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyMovieSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movie Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyMovieSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
