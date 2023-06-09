package com.news18.mobileenglishregression;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 * @author VipinKumarGawande
 * This class contains Test Files to Validate The Article , Image and More Tech News Link Navigation 
 * for Tech Widget
 */
public class MobileEnglishHomePageBodyTechWidgetTest extends MobileCommonConfig {

	
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
	 * This method is used to Verify the Tech Section Article Text Navigation in Homepage
	 */
	@Test
	public void techArticleNavigation()
	{
		pages.mobileLandingPage.verifyTechArticleNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the Tech Section Image Navigation in Homepage
	 */
	@Test
	public void techImageNavigation()
	{
		pages.mobileLandingPage.verifyTechImageNavigation(this.serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Verify the More Tech News Link Navigation for Tech Section in Homepage
	 */
	@Test
	public void moreTechNewsNavigation()
	{
		pages.mobileLandingPage.verifyMoreTechNewsNavigation(this.serverType);
	}
}
