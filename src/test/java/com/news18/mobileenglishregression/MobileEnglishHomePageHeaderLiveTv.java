package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;


/**
 * @author DanishR
 * This class validates Desktop English HomePage Header Logo
 */
public class MobileEnglishHomePageHeaderLiveTv extends MobileCommonConfig {


	/**
	 * This method is used to validate Google Search present in Home Page 
	 */
	@Test
	public void hompageHeaderLiveTv() {
		pages.mobileLandingPage.verfyHeaderLiveTv();
	}
}

