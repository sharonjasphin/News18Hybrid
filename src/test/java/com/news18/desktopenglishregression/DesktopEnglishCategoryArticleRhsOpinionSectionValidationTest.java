package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsOpinionSectionValidationTest extends DesktopCommonConfig {
	

	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Title
	 */
	@Test
	public void opi_Landing_13_OpinionSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Article
	 */
	@Test
	public void opi_Landing_13_OpinionSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews ReadMore
	 */
	@Test
	public void opi_Landing_13_OpinionSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section MoreNews Articles
	 */
	@Test
	public void opi_Landing_15_OpinionSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section PhotoGallery Title
	 */
	@Test
	public void opi_Landing_19_OpinionSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section PhotoGallery Articles
	 */
	@Test
	public void opi_Landing_19_OpinionSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section BigAd Below TrendingNews
	 */
	@Test
	public void opi_Landing_16_OpinionSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section BigAd Below Videowall
	 */
	@Test
	public void  opi_Landing_16_OpinionSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section Live Tv Functionality
	 */
	@Test
	public void  opi_Landing_12_OpinionSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Opinion Section TrendingNews Title
	 */
	@Test
	public void opi_Landing_17_OpinionSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineOneOpinionLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
