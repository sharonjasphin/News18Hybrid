package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilEntertainmentWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of Entertainment Widget Image
	 */
	@Test
	public void verifyTamilEntertainmentWidgetImg() {
		pages.desktopTamilLandingPage.verifyEntertainmentWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilEntertainmentWidgetArticle() {
		pages.desktopTamilLandingPage.verifyEntertainmentWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Entertainment News
	 */
	@Test
	public void verifyTamilEntertainmentWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreEntertainmentLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Entertainment Widget
	 */
	@Test
	public void verifyTamilEntertainmentWidget() {
		pages.desktopTamilLandingPage.verifyEntertainmentWidget(this.serverType);        
	}

}
