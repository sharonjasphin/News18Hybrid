package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyWorldWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Hindi Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Image
	 */
	@Test
	public void verifyHindiRevampWorldWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyWorldWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampWorldWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyWorldWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More World News
	 */
	@Test
	public void verifyHindiRevampWorldWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreWorldLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of World Widget
	 */
	@Test
	public void verifyHindiRevampWorldWidget() {
		pages.mobileHindiRevampLandingPage.verifyWorldWidget(this.serverType);        
	}
}
