package com.news18.desktopregressionhomepagerhsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilLiveNowRHSWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of LiveNowRHS Widget Team
	 */
	@Test(priority = 3)
	public void verifyTamilLiveNowRHSWidgetTeams() {
		pages.desktopTamilLandingPage.verifyLiveNowRHSWidgetTeams(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Next Button in LiveNowRHS
	 */
	@Test
	public void verifyTamilLiveNowRHSNextButton() {
		pages.desktopTamilLandingPage.verifyLiveNowRHSNextButton(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Previous Button in LiveNowRHS
	 */
	@Test
	public void verifyTamilLiveNowRHSPreviousButton() {
		pages.desktopTamilLandingPage.verifyLiveNowRHSPreviousButton(this.serverType);        
	}
	
}
