package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileTamilFeaturedArticleWidgetTest extends MobileCommonConfig {

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
	 * This method is used to validate navigation of FeaturedArticle Widget Image
	 */
	@Test
	public void verifyTamilFeaturedArticleWidgetImg() {
		pages.mobileTamilLandingPage.verifyFeaturedArticleWidgetImg(this.serverType);        
	}


	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FeaturedArticle Widget Article
	 */
	@Test(priority = 4)
	public void verifyTamilFeaturedArticleWidgetArticle() {
		pages.mobileTamilLandingPage.verifyFeaturedArticleWidgetArticle(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of More FeaturedArticle News
	 */
	@Test
	public void verifyTamilFeaturedArticleWidgetMoreLnk() {
		pages.mobileTamilLandingPage.verifyMoreFeaturedArticleLnk(this.serverType);        
	}
	
	/**
	 * @author AnupamGupta
	 * This method is used to validate navigation of FeaturedArticle Widget
	 */
	@Test
	public void verifyTamilFeaturedArticleWidget() {
		pages.mobileTamilLandingPage.verifyFeaturedArticleWidget(this.serverType);        
	}
	
}
