package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyBlogWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of Blog Widget Article
	 */
	@Test
	public void verifyHindiHomePageBlogWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyBlogWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Blog News
	 */
	@Test
	public void verifyHindiHomePageBlogWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreBlogLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Blog Widget
	 */
	@Test
	public void verifyHindiHomePageBlogWidget() {
		pages.desktopHindiRevampLandingPage.verifyBlogWidget(this.serverType);        
	}
}
