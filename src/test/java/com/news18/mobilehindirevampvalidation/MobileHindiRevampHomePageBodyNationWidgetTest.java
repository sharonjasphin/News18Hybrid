package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyNationWidgetTest  extends MobileCommonConfig{

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
	 * This method is used to validate navigation of Nation Widget Image
	 */
	@Test
	public void verifyHindiRevampNationWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyNationWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampNationWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyNationWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Nation Widget 
	 */
	@Test
	public void verifyHindiRevampNationWidget() {
		pages.mobileHindiRevampLandingPage.verifyNationWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Nation News
	 */
	@Test
	public void verifyHindiRevampNationWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreNationLnk(this.serverType);        
	}
}
