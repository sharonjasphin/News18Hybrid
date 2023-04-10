package com.news18.desktopenglishregression;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishLiveblogRhsExplainersSectionValidationTest extends DesktopCommonConfig {
	
//	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
		this.serverType="";
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section TrendingNews Title
	 */
	@Test
	public void live_Blog_10_VerifyExplainersSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section TrendingNews Articles
	 */
	@Test
	public void live_Blog_10_VerifyExplainersSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section TrendingNews Read more
	 */
	@Test
	public void live_Blog_10_VerifyExplainersSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopLiveblogPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section More News Down ad
	 */
	@Test
	public void live_Blog_12_VerifyExplainersSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopLiveblogPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainers Section Trending News Down ad
	 */
	@Test
	public void live_Blog_11_VerifyExplainersSectionRHSTrendingNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopLiveblogPage.verifyArticleTrendingNewsDownAdNavigation(serverType);
	}
}
