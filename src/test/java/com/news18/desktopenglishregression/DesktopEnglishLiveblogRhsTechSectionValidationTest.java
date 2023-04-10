package com.news18.desktopenglishregression;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsTechSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyTechSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyTechSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyTechSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyTechSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyTechSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
