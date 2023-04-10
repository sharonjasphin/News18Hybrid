package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;
/**
 * @author Sharon
 *This test class contains the methods to validate the Hindi Cartoon corner section present 
 *in the Home page
 */
public class MobileHindiCartoonSection extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */

//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	/**
	 * This method is used to verify the Cartoon corner section title navigation 
	 * present at the Home page
	 */
	@Test
	public void cartoonCornerTitle() {
		pages.mobileHindiLandingPage.verifyCartoonCornerTitle(serverType);
	}
	
	/**
	 * This method is used to verify the Cartoon corner section article navigation present 
	 * at the Home page
	 */
//	@Test
	public void cartoonCornerArticle() {
		pages.mobileHindiLandingPage.verifyCartoonCornerArticle(serverType);
	}
}
