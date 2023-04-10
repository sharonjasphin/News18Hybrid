package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsAutoSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_verifyAutoSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_verifyAutoSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_verifyAutoSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section More News Down ad
	 */
	@Test
	public void live_Blog_12_verifyAutoSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_verifyAutoSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
