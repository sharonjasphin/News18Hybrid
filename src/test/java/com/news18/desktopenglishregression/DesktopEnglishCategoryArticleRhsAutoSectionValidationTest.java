package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsAutoSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_AutoSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_AutoSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_AutoSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_AutoSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_AutoSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_AutoSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_AutoSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_AutoSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Auto Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_AutoSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoAutoLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
}
