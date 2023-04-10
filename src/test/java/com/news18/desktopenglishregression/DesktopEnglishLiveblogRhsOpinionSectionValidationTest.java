package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsOpinionSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyOpinionSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyOpinionSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyOpinionSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyOpinionSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section Trending News Down ad
	 */
	@Test
	public void live_Blog_1_VerifyOpinionSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
