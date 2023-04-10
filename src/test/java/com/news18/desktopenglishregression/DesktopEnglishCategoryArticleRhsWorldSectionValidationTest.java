package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsWorldSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_WorldSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_WorldSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_WorldSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_WorldSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_WorldSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_WorldSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_WorldSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_WorldSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_WorldSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify World Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_WorldSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneWorldLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
