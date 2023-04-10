package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsLatestSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_LatestSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_LatestSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_LatestSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_LatestSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_LatestSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_LatestSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_LatestSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_LatestSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_LatestSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Latest Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_LatestSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoLatestLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
