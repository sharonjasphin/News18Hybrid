package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilSpiritualWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Spiritual Widget Image
	 */
	@Test
	public void verifyTamilSpiritualWidgetImg() {
		pages.desktopTamilLandingPage.verifySpiritualWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Spiritual Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilSpiritualWidgetArticle() {
		pages.desktopTamilLandingPage.verifySpiritualWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Spiritual News
	 */
	@Test
	public void verifyTamilSpiritualWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreSpiritualLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Spiritual Widget
	 */
	@Test
	public void verifyTamilSpiritualWidget() {
		pages.desktopTamilLandingPage.verifySpiritualWidget(this.serverType);        
	}
	
}
