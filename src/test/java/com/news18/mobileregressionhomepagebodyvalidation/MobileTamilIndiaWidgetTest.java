package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilIndiaWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of India Widget Image
	 */
	@Test
	public void verifyTamilIndiaWidgetImg() {
		pages.mobileTamilLandingPage.verifyIndiaWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilIndiaWidgetArticle() {
		pages.mobileTamilLandingPage.verifyIndiaWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	@Test
	public void verifyTamilIndiaWidgetMoreLnk() {
		pages.mobileTamilLandingPage.verifyMoreIndiaLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget
	 */
	@Test
	public void verifyTamilIndiaWidget() {
		pages.mobileTamilLandingPage.verifyIndiaWidget(this.serverType);        
	}
	
}
