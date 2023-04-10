package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyVideoWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to validate navigation of Video Widget Image
	 */
	@Test
	public void verifyHindiRevampVideoWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyVideoWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampVideoWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyVideoWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Video Widget 
	 */
	@Test
	public void verifyHindiRevampVideoWidget() {
		pages.mobileHindiRevampLandingPage.verifyVideoWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Video News
	 */
	@Test
	public void verifyHindiRevampVideoWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreVideoLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Slider
	 */
	@Test
	public void verifyHindiRevampVideoWidgetSlider() {
		pages.mobileHindiRevampLandingPage.verifyVideoWidgetSliderNavigation();        
	}
	
	
}
