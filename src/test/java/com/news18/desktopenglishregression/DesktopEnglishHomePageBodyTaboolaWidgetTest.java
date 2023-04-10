package com.news18.desktopenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test files to Validate Promoted Content Ads Article and Image Navigation in English Homepage
 */
public class DesktopEnglishHomePageBodyTaboolaWidgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to verify the Taboola Ads Article Navigation in English Homepage
	 */
	@Test
	public void homepageTaboolaFeedsValidation()
	{
		pages.desktopOutbrainValidation.verifyHomepageTaboolaValidation();
	}
	
}
