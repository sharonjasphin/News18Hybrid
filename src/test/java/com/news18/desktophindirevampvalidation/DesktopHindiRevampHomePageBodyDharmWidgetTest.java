package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyDharmWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Dharm Widget Image
	 */
	@Test
	public void verifyHindiRevampDharmWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyDharmWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampDharmWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyDharmWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Dharm News
	 */
	@Test
	public void verifyHindiRevampDharmWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreDharmLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget
	 */
	@Test
	public void verifyHindiRevampDharmWidget() {
		pages.desktopHindiRevampLandingPage.verifyDharmWidget(this.serverType);        
	}
}
