package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

/**
 * This Class Contains scripts to verify the  MObile line One Sections Present at the Header Part of Mobile English HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class MobileEnglishHomePageHeaderHamburgerSocialWidgetValidation extends MobileCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for English
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * Hamburger Section Widget
	 */
	@Test
	public void hamburgerSocialShareSectionValidation () {

		pages.mobileLandingPage.verfyhamburgerSocialShareValidation("live");
	}
}
