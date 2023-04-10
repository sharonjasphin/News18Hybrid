package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilWorldWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	@Test
	public void verifyTamilWorldWidgetImg() {
		pages.mobileTamilLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilWorldWidgetArticle() {
		pages.mobileTamilLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	@Test
	public void verifyTamilWorldWidgetMoreLnk() {
		pages.mobileTamilLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyTamilWorldWidget() {
		pages.mobileTamilLandingPage.verifyWorldWidget(this.serverType);        
	}
	
}
