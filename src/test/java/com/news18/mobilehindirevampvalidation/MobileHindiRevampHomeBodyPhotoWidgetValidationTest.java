package com.news18.mobilehindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Hindi Photo corner section present 
 *at the RHS of the Home page
 */

public class MobileHindiRevampHomeBodyPhotoWidgetValidationTest extends MobileCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */

//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiStagUrl"));
	}

	/**
	 * This method is used to verify the Photo corner section title navigation 
	 * present at the RHS of the Home page
	 */
	@Test
	public void photoTitle() {
		pages.mobileHindiRevampLandingPage.verifyPhotoTitleNavigation(serverType);
	}

	/**
	 * This method is used to verify the Photo corner section article navigation present 
	 * at the RHS of the Home page
	 */
	@Test
	public void photoArticle() {
		pages.mobileHindiRevampLandingPage.verifyPhotoArticleNavigation(serverType);
	}

	/**
	 * This method is used to verify the Photo corner section ReadMore navigation present 
	 * at the RHS of the Home page
	 */
	@Test
	public void photoReadMore() {
		pages.mobileHindiRevampLandingPage.verifyPhotoReadMoreNavigation(serverType);
	}
}
