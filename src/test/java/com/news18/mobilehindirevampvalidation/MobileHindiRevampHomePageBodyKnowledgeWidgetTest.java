package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomePageBodyKnowledgeWidgetTest extends MobileCommonConfig  {

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
	 * This method is used to validate navigation of Knowledge Widget Image
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidgetImg() {
		pages.mobileHindiRevampLandingPage.verifyKnowledgeWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget Article
	 */
	@Test(priority = -1)
	public void verifyHindiRevampKnowledgeWidgetArticle() {
		pages.mobileHindiRevampLandingPage.verifyKnowledgeWidgetArticle(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More Knowledge News
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidgetMoreLnk() {
		pages.mobileHindiRevampLandingPage.verifyMoreKnowledgeLnk(this.serverType);        
	}
	
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of Knowledge Widget
	 */
	@Test
	public void verifyHindiRevampKnowledgeWidget() {
		pages.mobileHindiRevampLandingPage.verifyKnowledgeWidget(this.serverType);        
	}
}
