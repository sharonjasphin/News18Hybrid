package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyNationWidgetTest extends DesktopCommonConfig {

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
	public void verifyHindiRevampNationWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyNationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	@Test(priority = 4)
	public void verifyHindiRevampNationWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyNationWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiRevampNationWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreNationLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget
	 */
	@Test
	public void verifyHindiRevampNationWidget() {
		pages.desktopHindiRevampLandingPage.verifyNationWidget(this.serverType);        
	}
	
}
