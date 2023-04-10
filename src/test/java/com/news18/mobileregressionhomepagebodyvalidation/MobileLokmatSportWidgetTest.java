package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatSportWidgetTest extends MobileCommonConfig {


	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Lokmat Home page URL which is fetching from Property File
	 * URL-https://lokmat.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyLokmatSportWidgetImg() {
		pages.mobileLokmatLandingPage.verifySportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 4)
	public void verifyLokmatSportWidgetArticle() {
		pages.mobileLokmatLandingPage.verifySportWidgetArticle(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	@Test
	public void verifyLokmatSportWidgetMoreLnk() {
		pages.mobileLokmatLandingPage.verifyMoreSportLnk(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyLokmatSportWidget() {
		pages.mobileLokmatLandingPage.verifySportWidget(this.serverType);        
	}

}
