package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsBusinessSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Title
	 */
	@Test
	public void bus_Landing_13_BusinessSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Article
	 */
	@Test
	public void bus_Landing_13_BusinessSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews ReadMore
	 */
	@Test
	public void bus_Landing_13_BusinessSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section MoreNews Articles
	 */
	@Test
	public void bus_Landing_22_BusinessSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section PhotoGallery Title
	 */
	@Test
	public void bus_Landing_25_BusinessSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section PhotoGallery Articles
	 */
	@Test
	public void bus_Landing_25_BusinessSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section BigAd Below TrendingNews
	 */
	@Test
	public void bus_Landing_21_BusinessSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section BigAd Below Videowall
	 */
	@Test
	public void  bus_Landing_24_BusinessSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section Live Tv Functionality
	 */
	@Test
	public void  bus_Landing_19_BusinessSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}

	/**
	 * @author DanishR
	 * This method is used to verify Business Section TrendingNews Title
	 */
	@Test
	public void bus_Landing_23_BusinessSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneBusinessLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
