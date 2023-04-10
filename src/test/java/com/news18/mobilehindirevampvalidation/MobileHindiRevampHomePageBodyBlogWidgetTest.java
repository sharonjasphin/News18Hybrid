package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyBlogWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Blog Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampBlogWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyBlogWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget 
	 */
	@Test
	public void verifyHindiRevampBlogWidget() {
		pages.mobileHindiRevampLandingPage.verifyBlogWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	@Test
	public void verifyHindiRevampBlogWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreBlogLnk(this.serverType);        
	}
}
