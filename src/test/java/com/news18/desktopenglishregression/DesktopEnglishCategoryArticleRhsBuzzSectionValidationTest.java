package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsBuzzSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_BuzzSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_BuzzSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_BuzzSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_BuzzSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_BuzzSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_BuzzSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_BuzzSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_BuzzSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Buzz Section Live Tv Functionality
	 */
//	@Test
	public void  cat_Landing_BuzzSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneBuzzLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
}
