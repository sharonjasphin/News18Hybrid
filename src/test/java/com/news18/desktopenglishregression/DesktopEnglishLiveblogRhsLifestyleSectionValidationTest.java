package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsLifestyleSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyLifeStyleSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyLifeStyleSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyLifeStyleSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyLifeStyleSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyLifeStyleSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
