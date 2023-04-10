package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsShowshaSectionValidationTest extends DesktopCommonConfig {
	
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
	public void live_Blog_10_VerifyShowshaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyShowshaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyShowshaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyShowshaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyShowshaSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
