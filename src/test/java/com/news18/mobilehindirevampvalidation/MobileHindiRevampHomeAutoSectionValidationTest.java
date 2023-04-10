package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Auto section navigation present in 
 * the Home page
 */
public class MobileHindiRevampHomeAutoSectionValidationTest extends MobileCommonConfig{
	
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
	 * This method is used to verify the Auto section title navigation present in the Home page
	 */
	@Test
	public void autoTitleNavigation() {
		pages.mobileHindiRevampLandingPage.verifyAutoHeadlineNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Auto section article navigation present in the
	 * the Home page
	 */	
	@Test
	public void autoArticleNavigation() {
		pages.mobileHindiRevampLandingPage.verifyAutoArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Auto section ReadMore navigation present in the
	 * the Home page
	 */	
	@Test
	public void autoReadMoreNavigation() {
		pages.mobileHindiRevampLandingPage.verifyAutoReadMoreNavigation(serverType);
	}
	
}
