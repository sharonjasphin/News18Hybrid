package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsLatestSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyLatestSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyLatestSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyLatestSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyLatestSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyLatestSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
