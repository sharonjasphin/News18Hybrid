package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishArticleRhsHomePageTrendingNewsTest extends DesktopCommonConfig{
	
	@BeforeMethod
//	@Parameters({"url","server"})
	public void navigateToHomePageURL() {
//		this.serverType=serverType;
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Articles
	 */
	@Test
	public void verifyTrendingNewsArticleLnk() {
		pages.desktopLandingPage.verifyRhsTrendingNewsArticleNavigation(serverType); 
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Title
	 */
	@Test
	public void verifyTrendingNewsTitleNavigation() {
		pages.desktopLandingPage.verifyRhsTrendingNewsTitleNavigation(serverType); 
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Read more
	 */
	@Test
	public void verifyTrendingNewsReadmoreNavigation() {
		pages.desktopLandingPage.verifyRhsTrendingNewsReadMoreNavigation(serverType); 
	}
}
