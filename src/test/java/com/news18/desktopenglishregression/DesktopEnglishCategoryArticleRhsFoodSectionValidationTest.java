package com.news18.desktopenglishregression;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsFoodSectionValidationTest extends DesktopCommonConfig{
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_ExplainerSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_ExplainerSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_ExplainerSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_ExplainerSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_ExplainerSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_ExplainerSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_ExplainerSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoFoodLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
