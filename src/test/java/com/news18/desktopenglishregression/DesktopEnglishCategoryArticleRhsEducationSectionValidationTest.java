package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsEducationSectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_EducationSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_EducationSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_EducationSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_EducationSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_EducationSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_EducationSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_EducationSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_EducationSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_EducationSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}

	/**
	 * @author DanishR
	 * This method is used to verify Education Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_EducationSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneEducationLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
