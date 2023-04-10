package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyFooterSportWidgetTest extends DesktopCommonConfig {

	
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
	 * This method is used to validate navigation of FooterSport Widget Image
	 */
	@Test
	public void verifyHindiRevampFooterSportWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyFooterSportWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampFooterSportWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyFooterSportWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FooterSport News
	 */
	@Test
	public void verifyHindiRevampFooterSportWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreFooterSportLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FooterSport Widget
	 */
	@Test
	public void verifyHindiRevampFooterSportWidget() {
		pages.desktopHindiRevampLandingPage.verifyFooterSportWidget(this.serverType);        
	}

}
