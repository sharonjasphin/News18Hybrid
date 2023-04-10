package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsIndiaSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_IndiaSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_IndiaSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_IndiaSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_IndiaSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_IndiaSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_IndiaSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_IndiaSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_IndiaSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_IndiaSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify India Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_IndiaSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneIndiaLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
