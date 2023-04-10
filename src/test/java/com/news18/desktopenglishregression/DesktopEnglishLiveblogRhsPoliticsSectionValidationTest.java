package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsPoliticsSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyPoliticsSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyPoliticsSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyPoliticsSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyPoliticsSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyPoliticsSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
