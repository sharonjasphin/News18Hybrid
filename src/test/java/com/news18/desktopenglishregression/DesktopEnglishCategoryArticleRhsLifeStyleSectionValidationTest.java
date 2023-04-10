package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsLifeStyleSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_LifestyleSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_LifestyleSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_LifestyleSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_LifestyleSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_LifestyleSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_LifestyleSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_LifestyleSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_LifestyleSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_LifestyleSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Lifestyle Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_LifestyleSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoLifeStyleLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
	
}
