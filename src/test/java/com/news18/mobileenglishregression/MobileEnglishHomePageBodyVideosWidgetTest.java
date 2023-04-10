package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Videos News Link Navigation and Slider Navigation
 * for Videos Widget
 */
public class MobileEnglishHomePageBodyVideosWidgetTest extends MobileCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://www.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Section Article Text Navigation in Homepage
	 */
	@Test
	public void videosArticleNavigation()
	{
		pages.mobileLandingPage.verifyVideosSectionArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Videos Section Image Navigation in Homepage
	 */
	@Test
	public void videosImageNavigation()
	{
		pages.mobileLandingPage.verifyVideosSectionImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Slider Navigation for Videos Section in Homepage
	 */
	@Test
	public void videosSliderNavigation()
	{
		pages.mobileLandingPage.verifyVideosSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Videos News Link Validation for Videos Section in Homepage
	 */
	@Test
	public void moreVideosNavigation()
	{
		pages.mobileLandingPage.verifyMoreVideosLinkNavigation(this.serverType);
	}
}
