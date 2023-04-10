package com.news18.ampregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 *	This class contains Testfiles to Validate the Webstories Widget Article ,Image , Slider and Title Navigation in Homepage
 */
public class AMPLokmatWebstoriesWidgetTest extends MobileCommonConfig {

//	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("ampLokmatBeta"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Article Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.ampLokmatLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Image Navigation in Homepage
	 */
//	@Test
	public void webstoriesImageNavigation()
	{
		pages.ampLokmatLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Slider in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.ampLokmatLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Title Navigation in Homepage
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.ampLokmatLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
