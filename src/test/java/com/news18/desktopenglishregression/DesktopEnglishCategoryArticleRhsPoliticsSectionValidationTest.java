package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsPoliticsSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_PoliticsSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_PoliticsSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_PoliticsSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_PoliticsSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_PoliticsSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_PoliticsSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_PoliticsSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_PoliticsSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_PoliticsSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Politics Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_PoliticsSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOnePoliticsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
