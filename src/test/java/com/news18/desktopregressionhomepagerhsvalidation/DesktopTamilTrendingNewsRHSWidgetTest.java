package com.news18.desktopregressionhomepagerhsvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopTamilTrendingNewsRHSWidgetTest extends DesktopCommonConfig {

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
	 * This method is used to validate navigation of TrendingNewsRHS Widget Image
	 */
	@Test
	public void verifyTamilTrendingNewsRHSWidgetImg() {
		pages.desktopTamilLandingPage.verifyTrendingNewsRHSWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of TrendingNewsRHS Widget Article
	 */
	@Test(priority = 3)
	public void verifyTamilTrendingNewsRHSWidgetArticle() {
		pages.desktopTamilLandingPage.verifyTrendingNewsRHSWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of TrendingNewsRHS Widget
	 */
	@Test
	public void verifyTamilTrendingNewsRHSWidget() {
		pages.desktopTamilLandingPage.verifyTrendingNewsRHSWidget(this.serverType);        
	}
	
}
