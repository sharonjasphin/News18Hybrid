package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPTamilFeaturedArticleWidgetTest extends MobileCommonConfig {

	/**
	 * @author AnupamGupta
	 * This method is used for navigate to Tamil Home page URL which is fetching from Property File
	 * URL-https://tamil.news18.com/amp 
	 */
//	@BeforeMethod
	public void navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilAMPBeta"));
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FeaturedArticle Widget Image
	 */
	@Test
	public void verifyTamilFeaturedArticleWidgetImg() {
		pages.ampTamilLandingPage.verifyFeaturedArticleWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FeaturedArticle Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilFeaturedArticleWidgetArticle() {
		pages.ampTamilLandingPage.verifyFeaturedArticleWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FeaturedArticle News
	 */
	@Test
	public void verifyTamilFeaturedArticleWidgetMoreLnk() {
		pages.ampTamilLandingPage.verifyMoreFeaturedArticleLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FeaturedArticle Widget
	 */
	@Test
	public void verifyTamilFeaturedArticleWidget() {
		pages.ampTamilLandingPage.verifyFeaturedArticleWidget(this.serverType);        
	}
	
}
