package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilNationalWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of National Widget Image
	 */
	@Test
	public void verifyTamilNationalWidgetImg() {
		pages.desktopTamilLandingPage.verifyNationalWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilNationalWidgetArticle() {
		pages.desktopTamilLandingPage.verifyNationalWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More National News
	 */
	@Test
	public void verifyTamilNationalWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreNationalLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of National Widget
	 */
	@Test
	public void verifyTamilNationalWidget() {
		pages.desktopTamilLandingPage.verifyNationalWidget(this.serverType);        
	}
	
}
