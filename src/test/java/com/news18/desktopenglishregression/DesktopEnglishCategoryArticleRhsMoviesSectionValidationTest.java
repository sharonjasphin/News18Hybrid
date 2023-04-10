package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsMoviesSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_MoviesSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_MoviesSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_MoviesSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_MoviesSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_MoviesSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_MoviesSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_MoviesSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_MoviesSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_MoviesSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Movies Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_MoviesSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneMovieLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
	
}
