package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsSportsSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_SportsSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_SportsSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_SportsSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_SportsSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_SportsSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_SportsSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_SportsSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_SportsSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_SportsSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Sports Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_SportsSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoSportsLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
