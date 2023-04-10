package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPLokmatTechnologyWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatAMPBeta"));
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Image
	 */
	@Test
	public void verifyLokmatTechnologyWidgetImg() {
		pages.ampLokmatLandingPage.verifyTechnologyWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Article
	 */
	@Test(priority = 4)
	public void verifyLokmatTechnologyWidgetArticle() {
		pages.ampLokmatLandingPage.verifyTechnologyWidgetArticle(this.serverType);        
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Technology News
	 */
	@Test
	public void verifyLokmatTechnologyWidgetMoreLnk() {
		pages.ampLokmatLandingPage.verifyMoreTechnologyLnk(this.serverType);        
	}

	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	@Test
	public void verifyLokmatTechnologyWidget() {
		pages.ampLokmatLandingPage.verifyTechnologyWidget(this.serverType);        
	}

}
