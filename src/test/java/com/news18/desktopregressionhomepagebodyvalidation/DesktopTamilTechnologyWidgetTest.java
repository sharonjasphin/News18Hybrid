package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilTechnologyWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Technology Widget Image
	 */
	@Test
	public void verifyTamilTechnologyWidgetImg() {
		pages.desktopTamilLandingPage.verifyTechnologyWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilTechnologyWidgetArticle() {
		pages.desktopTamilLandingPage.verifyTechnologyWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Technology News
	 */
	@Test
	public void verifyTamilTechnologyWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreTechnologyLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Technology Widget
	 */
	@Test
	public void verifyTamilTechnologyWidget() {
		pages.desktopTamilLandingPage.verifyTechnologyWidget(this.serverType);        
	}
	
}
