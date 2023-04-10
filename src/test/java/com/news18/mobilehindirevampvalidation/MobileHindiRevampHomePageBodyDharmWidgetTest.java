package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyDharmWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to validate navigation of Dharm Widget Image
	 */
	@Test
	public void verifyHindiRevampDharmWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyDharmWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampDharmWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyDharmWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Dharm Widget 
	 */
	@Test
	public void verifyHindiRevampDharmWidget() {
		pages.mobileHindiRevampLandingPage.verifyDharmWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Dharm News
	 */
	@Test
	public void verifyHindiRevampDharmWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreDharmLnk(this.serverType);        
	}
}
