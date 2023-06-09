package com.news18.desktophindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Hindi Cartoon corner section present 
 *at the RHS of the Home page
 */

public class DesktopHindiRevampHomeRhsCartoonSectionValidationTest extends DesktopCommonConfig{
	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */

//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}

	/**
	 * This method is used to verify the Cartoon corner section title navigation 
	 * present at the RHS of the Home page
	 */
	@Test
	public void cartoonCornerTitle() {
		pages.desktopHindiRevampLandingPage.verifyCartoonCornerTitle(serverType);
	}
	
	/**
	 * This method is used to verify the Cartoon corner section article navigation present 
	 * at the RHS of the Home page
	 */
	@Test
	public void cartoonCornerArticle() {
		pages.desktopHindiRevampLandingPage.verifyRhsCartoonArticleNavigation("");
		}
}
