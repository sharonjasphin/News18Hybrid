package com.news18.desktopregressionhomepagerhsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilExplainerRHSWidgetTest extends DesktopCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget Image
	 */
	@Test
	public void verifyTamilExplainerRHSWidgetImg() {
		pages.desktopTamilLandingPage.verifyExplainerRHSWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget Article
	 */
	@Test(priority = 3)
	public void verifyTamilExplainerRHSWidgetArticle() {
		pages.desktopTamilLandingPage.verifyExplainerRHSWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button in ExplainerRHS
	 */
	@Test
	public void verifyTamilExplainerRHSNextButton() {
		pages.desktopTamilLandingPage.verifyExplainerRHSNextButton(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of ExplainerRHS Widget
	 */
	@Test
	public void verifyTamilExplainerRHSWidget() {
		pages.desktopTamilLandingPage.verifyExplainerRHSWidget(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Previous Button in ExplainerRHS
	 */
	@Test
	public void verifyTamilExplainerRHSPreviousButton() {
		pages.desktopTamilLandingPage.verifyExplainerRHSPreviousButton(this.serverType);        
	}
	
}
