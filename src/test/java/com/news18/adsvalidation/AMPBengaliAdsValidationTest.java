package com.news18.adsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the Advertisement is displayed in various pages
 * like Homepage , Article Consumption Page , PhotoGallery Page for Bengali News18 mobile page
 * 
 */
public class AMPBengaliAdsValidationTest extends MobileCommonConfig{

//	/**
//	 * @author AnupamGupta
//	 * This method is used for navigate to Bengali Home page URL which is fetching from Property File
//	 * URL-https://bengali.news18.com/
//	 */
//	@BeforeMethod
//	public void navigateToBengaliHomePageURL() {
//		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
//	}


	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String curerrentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(curerrentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali Home Page 
	 */
	@Test
	public void verifyBengaliHomePageAds() {
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();     //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali First Article Page 
	 */
	@Test
	public void verifyBengaliFirstArticlePageAds() {
		pages.mobileBengaliLandingPage.clickOnFirstArticleBengaliHomePage();     //It will click on First Article Of Bengali Home Page
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate advertisement is displayed on News18 Bengali photo section Page 
	 */
	@Test
	public void verifyBengaliPhotoSectionPageAds() {
		pages.mobileBengaliLandingPage.clickOnPhotoSection();       //It will click on photo section Of Bengali Home Page
		pages.mobileBengaliPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.mobileAdsValidation.verifyAds();      //It will verify advertisements is displayed
	}
}