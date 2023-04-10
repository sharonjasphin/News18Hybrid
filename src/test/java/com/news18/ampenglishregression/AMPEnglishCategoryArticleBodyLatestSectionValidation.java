package com.news18.ampenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishCategoryArticleBodyLatestSectionValidation extends MobileCommonConfig{
	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_AMP_10_LatestSectionPhotogalleryArticle() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_AMP_10_LatestSectionPhotogalleryImg() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_AMP_12_LatestSectionLiveTv() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_AMP_08_LatestVideoWallDownAd() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_AMP_09_LatestVideoWallArticle() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test 
	public void cat_Landing_AMP_09_LatestVideoWallImg() {
		pages.ampLandingPage.clickOnLineOneLatestLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
