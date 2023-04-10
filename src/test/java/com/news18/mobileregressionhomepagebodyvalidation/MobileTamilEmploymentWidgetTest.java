package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilEmploymentWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Employment Widget Image
	 */
	@Test
	public void verifyTamilEmploymentWidgetImg() {
		pages.mobileTamilLandingPage.verifyEmploymentWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilEmploymentWidgetArticle() {
		pages.mobileTamilLandingPage.verifyEmploymentWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Employment News
	 */
	@Test
	public void verifyTamilEmploymentWidgetMoreLnk() {
		pages.mobileTamilLandingPage.verifyMoreEmploymentLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Employment Widget
	 */
	@Test
	public void verifyTamilEmploymentWidget() {
		pages.mobileTamilLandingPage.verifyEmploymentWidget(this.serverType);        
	}
	
}
