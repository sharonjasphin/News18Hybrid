package com.news18.ampenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class AMPEnglishCategoryArticleBodyIndiaSectionValidation extends MobileCommonConfig{
	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_AMP_10_IndiaSectionPhotogalleryArticle() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_AMP_10_IndiaSectionPhotogalleryImg() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_AMP_12_IndiaSectionLiveTv() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_AMP_08_IndiaVideoWallDownAd() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_AMP_09_IndiaVideoWallArticle() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test 
	public void cat_Landing_AMP_09_IndiaVideoWallImg() {
		pages.ampLandingPage.clickOnLineOneIndiaLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
