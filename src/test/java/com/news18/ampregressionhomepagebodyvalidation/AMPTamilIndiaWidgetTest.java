package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilIndiaWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of India Widget Image
	 */
	@Test
	public void verifyTamilIndiaWidgetImg() {
		pages.ampTamilLandingPage.verifyIndiaWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilIndiaWidgetArticle() {
		pages.ampTamilLandingPage.verifyIndiaWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More India News
	 */
	@Test
	public void verifyTamilIndiaWidgetMoreLnk() {
		pages.ampTamilLandingPage.verifyMoreIndiaLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of India Widget
	 */
	@Test
	public void verifyTamilIndiaWidget() {
		pages.ampTamilLandingPage.verifyIndiaWidget(this.serverType);        
	}
	
}
