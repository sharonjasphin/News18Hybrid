package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileKannadaLifeStyleWidgetTest extends MobileCommonConfig{

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Gujarati Home page URL which is fetching from Property File
	 */
//	@BeforeMethod
	public void navigateToKannadaHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Image
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidgetImg() {
		pages.mobileKannadaLandingPage.verifyLifeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget Article
	 */
	@Test(priority = 4)
	public void verifyKannadaHomePageLifeStyleWidgetArticle() {
		pages.mobileKannadaLandingPage.verifyLifeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Lifestyle News
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidgetMoreLnk() {
		pages.mobileKannadaLandingPage.verifyMoreLifeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Lifestyle Widget
	 */
	@Test
	public void verifyKannadaHomePageLifeStyleWidget() {
		pages.mobileKannadaLandingPage.verifyLifeWidget(this.serverType);        
	}
}
