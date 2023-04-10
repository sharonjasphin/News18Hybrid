package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsExplainerSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_ExplainerSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_ExplainerSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_ExplainerSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_ExplainerSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_ExplainerSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_ExplainerSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_ExplainerSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Explainer Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_ExplainerSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoExplainersLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
	
}
