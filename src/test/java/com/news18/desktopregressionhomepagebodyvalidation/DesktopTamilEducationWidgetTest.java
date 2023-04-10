package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilEducationWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Education Widget Image
	 */
	@Test
	public void verifyTamilEducationWidgetImg() {
		pages.desktopTamilLandingPage.verifyEducationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilEducationWidgetArticle() {
		pages.desktopTamilLandingPage.verifyEducationWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Education News
	 */
	@Test
	public void verifyTamilEducationWidgetMoreLnk() {
		pages.desktopTamilLandingPage.verifyMoreEducationLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Education Widget
	 */
	@Test
	public void verifyTamilEducationWidget() {
		pages.desktopTamilLandingPage.verifyEducationWidget(this.serverType);        
	}
	
}
