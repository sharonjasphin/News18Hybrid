package com.news18.mobilesanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiLiveBlogTest extends MobileCommonConfig{
	/**
	 * @author 
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	@Test
	public void LiveBlogHeadline () {
		pages.mobileHindiSanityLandingPage.verfyLiveBlogHeadline(serverType);
	}
	
	@Test
	public void LiveBlogImg () {
		pages.mobileHindiSanityLandingPage.verfyLiveBlogImg(serverType);
	}
}
