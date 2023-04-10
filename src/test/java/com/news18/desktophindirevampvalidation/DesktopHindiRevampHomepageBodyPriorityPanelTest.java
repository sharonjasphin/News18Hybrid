package com.news18.desktophindirevampvalidation;

import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

public class DesktopHindiRevampHomepageBodyPriorityPanelTest extends DesktopCommonConfig {


	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hinBeta"));
	}

	@Test
	public void priorityPanelArticleNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPriorityPanelArticleNavigation(serverType);
	}

	@Test
	public void priorityPanelImageNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyPriorityPanelImageNavigation(serverType);
	}
	
//	@Test
	public void priorityPanelRelatedNewsNavigation()
	{
//		pages.desktopHindiRevampLandingPage.verifyRelatedNewsArticleNavigation(serverType);
	}

	@Test
	public void taazaSamachaarReadMoreNavigation()
	{
		pages.desktopHindiRevampLandingPage.verifyTaazaSamachaarNavigation(serverType);
	}

}
