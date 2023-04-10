package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Duniya section navigation present in 
 * the Home page
 */
public class MobileHindiRevampHomeBodyDuniyaWidgetValidationTest extends MobileCommonConfig{
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl() 
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}
	
	/**
	 * This method is used to verify the Duniya section title navigation present in the Home page
	 */
	@Test
	public void duniyaTitleNavigation() {
		pages.mobileHindiRevampLandingPage.verifyDuniyaHeadlineNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Duniya section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void duniyaArticleNavigation() {
		pages.mobileHindiRevampLandingPage.verifyDuniyaArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Duniya section ReadMore navigation present in the
	 * the Home page
	 */	
	@Test
	public void duniyaReadMoreNavigation() {
		pages.mobileHindiRevampLandingPage.verifyDuniyaReadMoreNavigation(serverType);
	}
	
}
