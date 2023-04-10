package com.news18.mobileregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileLokmatPromotedContentWIdgetTest extends MobileCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatBeta"));
	}
	
	@Test
	public void promotedContentArticleNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	@Test
	public void promotedContentImageNavigation()
	{
		pages.mobileOutbrainValidation.verifyPromotedContentImageNavigation();
	}
	
}
