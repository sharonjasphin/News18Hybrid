package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilBusinessWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Business Widget Image
	 */
	@Test
	public void verifyTamilBusinessWidgetImg() {
		pages.desktopTamilLandingPage.verifyBusinessWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilBusinessWidgetArticle() {
		pages.desktopTamilLandingPage.verifyBusinessWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Business News
	 */
	@Test
	public void verifyTamilBusinessWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreBusinessLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Business Widget
	 */
	@Test
	public void verifyTamilBusinessWidget() {
		pages.desktopTamilLandingPage.verifyBusinessWidget(this.serverType);        
	}
	
}
