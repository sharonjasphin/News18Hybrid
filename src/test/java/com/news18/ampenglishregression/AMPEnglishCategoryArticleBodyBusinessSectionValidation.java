package com.news18.ampenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPEnglishCategoryArticleBodyBusinessSectionValidation extends MobileCommonConfig{
	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Article
	 */
	@Test
	public void cat_Landing_AMP_10_BusinessSectionPhotogalleryArticle() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleNavigation(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the navigation of Photogallery Featured Image
	 */
	@Test
	public void cat_Landing_AMP_10_BusinessSectionPhotogalleryImg() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.verifyPhotoGalleryArticleImg(serverType);
	}

	/**
	 * @author Danish
	 * This method is used to Validate the functionalities of the Live Tv section
	 */
	@Test
	public void cat_Landing_AMP_12_BusinessSectionLiveTv() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.liveTv();
	}	
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Down Ad  Section 
	 */
	@Test
	public void  cat_Landing_AMP_08_BusinessVideoWallDownAd() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.verifyArticleVideoDownAdNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Article  Section 
	 */
	@Test
	public void cat_Landing_AMP_09_BusinessVideoWallArticle() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleNavigation(serverType);
	}
	
	/**
	 * @author DanishR
	 * This method is used to verify VideoWall Img  Section 
	 */
	@Test 
	public void cat_Landing_AMP_09_BusinessVideoWallImg() {
		pages.ampLandingPage.clickOnLineOneBusinessLink();
		pages.ampCategoryArticleConsumptionPage.verifyVideoWallArticleImg(serverType);
	}
}
