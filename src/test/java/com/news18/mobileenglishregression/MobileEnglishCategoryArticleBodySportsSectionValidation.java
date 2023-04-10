package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishCategoryArticleBodySportsSectionValidation extends MobileCommonConfig{

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_Mweb_10_SportsSectionPhotogalleryArticle() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_Mweb_10_SportsSectionPhotogalleryImg() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_Mweb_12_SportsSectionLiveTv() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_Mweb_08_VideoWallDownAd() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_Mweb_08_VideoWallArticle() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test
	public void cat_Landing_Mweb_08_VideoWallImg() {
		pages.mobileLandingPage.clickOnLineOneSportsLink();
		pages.mobileCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
