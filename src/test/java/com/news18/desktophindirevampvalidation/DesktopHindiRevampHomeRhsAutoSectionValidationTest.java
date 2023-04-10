package com.news18.desktophindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the script to validate the Auto Section Navigation present 
 *in the RHS of home page
 */
public class DesktopHindiRevampHomeRhsAutoSectionValidationTest extends DesktopCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * This method is used to verify the auto title navigation present at the RHS of the Home page
	 */
	@Test
	public void autoTitleNavigation() {
		pages.desktopHindiRevampLandingPage.verifyRhsAutoHeadlineNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the auto article navigation present at the RHS of the Home page
	 */
	@Test
	public void autoArticleNavigation() {
		pages.desktopHindiRevampLandingPage.verifyRhsAutoArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the auto Read more option navigation present at the RHS of the
	 * Home page
	 */
	@Test
	public void autoReadMoreNavigation() {
		pages.desktopHindiRevampLandingPage.verifyRhsAutoReadMoreNavigation(serverType);
	}
}
