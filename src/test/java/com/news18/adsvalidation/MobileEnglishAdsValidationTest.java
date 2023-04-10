package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , Liveblog Article Consumption Page , PhotoGallery Page for English News18 mobile page
 * 
 */
public class MobileEnglishAdsValidationTest extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English Home Page 
	 */
	@Test
	public void verifyEnglishHomePageAds() {
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English First Article Page 
	 */
	@Test
	public void verifyEnglishFirstArticlePageAds() {
		pages.mobileLandingPage.clickOnFirstArticleHomePage();      //It will click on First Article Of English Home Page
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English First Live Blog Article Page 
	 */
	@Test
	public void verifyEnglishFirstLiveArticlePageAds() {
		pages.mobileLandingPage.clickOnFirstLiveBlogArticleHomePage();       //It will click on First Live blog Article Of English Home Page
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}
	

	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 English photo section Page 
	 */
	@Test
	public void verifyEnglishPhotoSectionPageAds() {
		pages.mobileLandingPage.clickOnPhotoSection();       //It will click on photo section Of English Home Page
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//Click on First Article of photo gallery Consumption Page.
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}

}
