package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilWorldWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/amp 
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilAMPBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	@Test
	public void verifyTamilWorldWidgetImg() {
		pages.ampTamilLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilWorldWidgetArticle() {
		pages.ampTamilLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	@Test
	public void verifyTamilWorldWidgetMoreLnk() {
		pages.ampTamilLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyTamilWorldWidget() {
		pages.ampTamilLandingPage.verifyWorldWidget(this.serverType);        
	}
	
}
