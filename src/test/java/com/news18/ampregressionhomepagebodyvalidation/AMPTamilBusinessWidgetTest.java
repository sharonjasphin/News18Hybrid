package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilBusinessWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Business Widget Image
	 */
	@Test
	public void verifyTamilBusinessWidgetImg() {
		pages.ampTamilLandingPage.verifyBusinessWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilBusinessWidgetArticle() {
		pages.ampTamilLandingPage.verifyBusinessWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	@Test
	public void verifyTamilBusinessWidgetMoreLnk() {
		pages.ampTamilLandingPage.verifyMoreBusinessLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	@Test
	public void verifyTamilBusinessWidget() {
		pages.ampTamilLandingPage.verifyBusinessWidget(this.serverType);        
	}
	
}
