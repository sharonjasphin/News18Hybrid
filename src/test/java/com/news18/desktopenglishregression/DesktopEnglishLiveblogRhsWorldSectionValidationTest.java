package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsWorldSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyWorldSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyWorldSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyWorldSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section More News Down ad
	 */
	@Test
	public void live_Blog_10_VerifyWorldSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section Trending News Down ad
	 */
	@Test
	public void live_Blog_10_VerifyWorldSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
