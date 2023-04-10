package com.news18.mobilehindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Hindi Food corner section present 
 *at the RHS of the Home page
 */

public class MobileHindiRevampHomeBodyFoodWidgetValidationTest extends DesktopCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */

//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}

	/**
	 * This method is used to verify the Food corner section title navigation 
	 * present at the RHS of the Home page
	 */
	@Test
	public void foodCornerTitle() {
		pages.mobileHindiRevampLandingPage.verifyFoodTitleNavigation(serverType);
	}

	/**
	 * This method is used to verify the Food corner section article navigation present 
	 * at the RHS of the Home page
	 */
	@Test
	public void foodCornerArticle() {
		pages.mobileHindiRevampLandingPage.verifyFoodArticleNavigation(serverType);
	}

	/**
	 * This method is used to verify the Food corner section ReadMore navigation present 
	 * at the RHS of the Home page
	 */
	@Test
	public void foodCornerReadMore() {
		pages.mobileHindiRevampLandingPage.verifyFoodReadMoreNavigation(serverType);
	}
}
