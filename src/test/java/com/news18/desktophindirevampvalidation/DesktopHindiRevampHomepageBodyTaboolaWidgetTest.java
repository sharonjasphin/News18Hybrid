package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in English Homepage
 */
public class DesktopHindiRevampHomepageBodyTaboolaWidgetTest extends DesktopCommonConfig {

//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This class contains Test files to Validate Promoted Content Ads Article Navigation 
	 */
	@Test
	public void taboolaFeedsValidation()
	{
		pages.desktopOutbrainValidation.verifyHomepageTaboolaContent();
	}
	
	
}
