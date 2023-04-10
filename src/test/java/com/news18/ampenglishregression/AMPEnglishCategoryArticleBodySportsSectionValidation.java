package com.news18.ampenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishCategoryArticleBodySportsSectionValidation extends MobileCommonConfig{

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_AMP_10_SportsSectionPhotogalleryArticle() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_AMP_10_SportsSectionPhotogalleryImg() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_AMP_12_SportsSectionLiveTv() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_AMP_08_SportsVideoWallDownAd() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_AMP_09_SportsVideoWallArticle() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test 
	public void cat_Landing_AMP_09_SportsVideoWallImg() {
		pages.ampLandingPage.clickOnLineOneSportsLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
