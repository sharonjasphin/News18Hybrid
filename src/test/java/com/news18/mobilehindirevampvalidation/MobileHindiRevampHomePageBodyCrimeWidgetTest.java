package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyCrimeWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of Crime Widget Image
	 */
	@Test
	public void verifyHindiRevampCrimeWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyCrimeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampCrimeWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyCrimeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Crime News
	 */
	@Test
	public void verifyHindiRevampCrimeWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreCrimeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Crime Widget
	 */
	@Test
	public void verifyHindiRevampCrimeWidget() {
		pages.mobileHindiRevampLandingPage.verifyCrimeWidget(this.serverType);        
	}
}
