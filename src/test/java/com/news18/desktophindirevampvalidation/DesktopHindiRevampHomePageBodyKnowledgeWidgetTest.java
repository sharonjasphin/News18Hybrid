package com.news18.desktophindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomePageBodyKnowledgeWidgetTest extends DesktopCommonConfig{

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
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidgetImg() {
		pages.desktopHindiRevampLandingPage.verifyKnowledgeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	@Test(priority = 1)
	public void verifyHindiRevampKnowledgeWidgetArticle() {
		pages.desktopHindiRevampLandingPage.verifyKnowledgeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidgetMoreLnk() {
		pages.desktopHindiRevampLandingPage.verifyMoreKnowledgeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidget() {
		pages.desktopHindiRevampLandingPage.verifyKnowledgeWidget(this.serverType);        
	}

}
