package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsSportsSectionValidationTest extends DesktopCommonConfig {
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifySportsSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifySportsSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifySportsSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifySportsSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifySportsSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
