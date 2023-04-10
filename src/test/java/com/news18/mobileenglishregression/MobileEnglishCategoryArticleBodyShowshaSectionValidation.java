package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 * This class contains All Test Files to Validate the Article Consumption Pages For English Mobile.
 */
public class MobileEnglishCategoryArticleBodyShowshaSectionValidation extends MobileCommonConfig{
	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_Mweb_10_ShowshaSectionPhotogalleryArticle() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_Mweb_10_ShowshaSectionPhotogalleryImg() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_Mweb_12_ShowshaSectionLiveTv() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_Mweb_08_VideoWallDownAd() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_Mweb_08_VideoWallArticle() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test
	public void cat_Landing_Mweb_08_VideoWallImg() {
		pages.mobileLandingPage.clickOnLineOneShowshaLink();
		pages.mobileCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
