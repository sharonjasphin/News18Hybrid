package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsShowShaSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_ShowshaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_ShowshaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_ShowshaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_ShowshaSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_ShowshaSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_ShowshaSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_ShowshaSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_ShowshaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_ShowshaSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Showsha Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_ShowshaSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneShowshaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
