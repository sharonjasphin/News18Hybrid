package com.news18.desktophindirevampvalidation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Sharon
 *This test class contains the methods to validate the Ajab-Gajab section present at the RHS 
 *of the Home page
 */
public class DesktopHindiRevampHomeRhsAjabGajabSectionValidation extends DesktopCommonConfig{

	/**
	 * This method is used for navigate to  Home page URL which is fetching from Property File
	 * URL-https://hindi.news18.com/ 
	 */
//	@BeforeMethod
	public void navigateToEnglishbHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiRewampUrl"));
	}

	/**
	 * This method is used to verify the Ajab-Gajab section image navigation
	 *  present at the RHS of the Home page
	 */
	@Test
	public void verifyAjabGajabRhsTitleNavigation() {
		pages.desktopHindiRevampLandingPage.verifyAjabGajabRhsHeadlineNavigation(serverType);

	}
	
	/**
	 * This method is used to verify the Ajab-Gajab article navigation
	 *  present at the RHS of the Home page
	 */
	@Test
	public void verifyAjabGajabRhsArticleNavigation() {
		pages.desktopHindiRevampLandingPage.verifyAjabGajabRhsArticleNavigation(serverType);
	}
	
	/**
	 * This method is used to verify the Ajab-Gajab Read more button navigation
	 * present at the RHS of the Home page
	 */
	@Test
	public void verifyAjabGajabRhsReadMoreNavigation() {
		pages.desktopHindiRevampLandingPage.verifyAjabGajabRhsReadMoreNavigation(serverType);
	}
}
