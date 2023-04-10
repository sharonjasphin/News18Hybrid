package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyCareerWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Career Widget Image
	 */
	@Test
	public void verifyHindiRevampCareerWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyCareerWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampCareerWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyCareerWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Career News
	 */
	@Test
	public void verifyHindiRevampCareerWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreCareerLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Career Widget
	 */
	@Test
	public void verifyHindiRevampCareerWidget() {
		pages.desktopHindiRevampLandingPage.verifyCareerWidget(this.serverType);        
	}
}
