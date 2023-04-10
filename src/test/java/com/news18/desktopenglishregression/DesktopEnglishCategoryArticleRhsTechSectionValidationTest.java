package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopEnglishCategoryArticleRhsTechSectionValidationTest extends DesktopCommonConfig {
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Title
	 */
	@Test
	public void cat_Landing_13_TechSectionRHSTrendingNewsTitle() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Article
	 */
	@Test
	public void cat_Landing_13_TechSectionRHSTrendingNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews ReadMore
	 */
	@Test
	public void cat_Landing_13_TechSectionRHSTrendingNewsReadMore() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsTrendingNewsReadMoreNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section MoreNews Articles
	 */
	@Test
	public void cat_Landing_15_TechSectionRHSMoreNewsArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsMoreNewsArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section PhotoGallery Title
	 */
	@Test
	public void cat_Landing_17_TechSectionRHSPhotoGalleryTitle() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryTitleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section PhotoGallery Articles
	 */
	@Test
	public void cat_Landing_17_TechSectionRHSPhotoGalleryArticles() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsPhotoGalleryArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section BigAd Below TrendingNews
	 */
	@Test
	public void cat_Landing_14_TechSectionRHSBigAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSBigAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section BigAd Below Videowall
	 */
	@Test
	public void  cat_Landing_16_TechSectionRHSMoreNewsDownAd() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyArticleRHSMoreNewsDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section Live Tv Functionality
	 */
	@Test
	public void  cat_Landing_TechSectionRHSLiveTv() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.liveTv();
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify Tech Section TrendingNews Title
	 */
//	@Test
	public void cat_Landing_TechSectionRHSVideoWall() {
		pages.desktopLandingPage.clickOnLineTwoTechLink();
		pages.desktopCategoryArticleConsumptionPage.verifyRhsVideowallNavigation(serverType);
	}
}
