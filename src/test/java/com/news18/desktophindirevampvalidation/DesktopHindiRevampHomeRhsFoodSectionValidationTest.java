package com.news18.desktophindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Food section articles navogation
 *present at the RHS of the Home page
 */
public class DesktopHindiRevampHomeRhsFoodSectionValidationTest extends DesktopCommonConfig{
	
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}

	/**
	 * This method is used to verify the Food title navigation present at the RHS of the Home page
	 */
	@Test
	public void verifyFoodTitle() {
		pages.desktopHindiRevampLandingPage.verifyHomePagefoodTitle(serverType);

	}
	/**
	 * This method is used to verify the Food article navigation present at the RHS of theHome page 
	 */
	@Test
	public void foodArticleNavigation() {
		pages.desktopHindiRevampLandingPage.verifyRhsFoodArticleNavigation(serverType);
	}
}
