package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilSportWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Sport Widget Image
	 */
	@Test
	public void verifyTamilSportWidgetImg() {
		pages.ampTamilLandingPage.verifySportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilSportWidgetArticle() {
		pages.ampTamilLandingPage.verifySportWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Sport News
	 */
	@Test
	public void verifyTamilSportWidgetMoreLnk() {
		pages.ampTamilLandingPage.verifyMoreSportLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Sport Widget
	 */
	@Test
	public void verifyTamilSportWidget() {
		pages.ampTamilLandingPage.verifySportWidget(this.serverType);        
	}
	
}
