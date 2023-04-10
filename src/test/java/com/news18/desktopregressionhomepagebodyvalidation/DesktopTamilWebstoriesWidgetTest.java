package com.news18.desktopregressionhomepagebodyvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;
import com.news18.init.WebDriverActions;

/**
 * @author VipinKumarGawande
 *	This class contains Testfiles to Validate the Webstories Widget Article ,Image , Slider and Title Navigation in Homepage
 */
public class DesktopTamilWebstoriesWidgetTest extends DesktopCommonConfig {

	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Article Navigation in Homepage
	 */
	@Test
	public void webstoriesArticleNavigation()
	{
		pages.desktopTamilLandingPage.verifyWebstoriesArticleNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Image Navigation in Homepage
	 */
	@Test(enabled = false)
	public void webstoriesImageNavigation()
	{
		pages.desktopTamilLandingPage.verifyWebstoriesImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Slider in Homepage
	 */
	@Test
	public void webstoriesSliderNavigation()
	{
		pages.desktopTamilLandingPage.verifyWebstoriesSliderNavigation();
	}
	
	/**
	 * @author VipinKumarGawande
	 * This method is used to Validate the Webstories Title Navigation in Homepage
	 */
	@Test
	public void webstoriesTitleNavigation()
	{
		pages.desktopTamilLandingPage.verifyWebstoriesTitleNavigation(serverType);
	}
}
