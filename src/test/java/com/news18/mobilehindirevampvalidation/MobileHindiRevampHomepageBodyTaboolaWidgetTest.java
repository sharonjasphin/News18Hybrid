package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in Hindi Homepage
 */
public class MobileHindiRevampHomepageBodyTaboolaWidgetTest extends MobileCommonConfig {

	
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
		pages.mobileOutbrainValidation.verifyHomePageOutbrainContent();
	}
	
}
