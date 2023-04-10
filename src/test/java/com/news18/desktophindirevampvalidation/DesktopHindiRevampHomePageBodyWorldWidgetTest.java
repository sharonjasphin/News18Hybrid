package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyWorldWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRevampUrl"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyHindiRevampWorldWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampWorldWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiRevampWorldWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyHindiRevampWorldWidget() {
		pages.desktopHindiRevampLandingPage.verifyWorldWidget(this.serverType);        
	}
}
