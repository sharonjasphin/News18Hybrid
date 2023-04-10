package com.news18.ampenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author AnupamGupta
 * This test Class contains scripts to verify the navigation of VideoWall widget article ,Image and More Link
 */
public class AMPEnglishHomePageVideoWallWidget extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to English Home page URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampEnglishUrl"));
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Image
	 */
	@Test
	public void verifyEnglishHomePageVideoWallWidgetImg() {
		pages.ampLandingPage.verifyVideoWallImgNavigation(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of VideoWall Widget Article
	 */
	@Test
	public void verifyEnglishHomePageVideoWallWidgetArticle() {
		pages.ampLandingPage.verifyVideoWallArticleNavigation(this.serverType);        
	}
	
	
}
