package com.news18.mobilehindirevampvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class MobileHindiRevampHomepageBodyPriorityPanelTest extends MobileCommonConfig
{

	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
	//	@BeforeMethod
	public void navigateToHindiHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTaazaSamacharArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTaazaSamacharArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTaazaSamacharImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTaazaSamacharImageNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTopHindiNewsArticleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTopHindiNewsArticleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTopHindiNewsImageNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyTopHindiNewsImageNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelReadMoreNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyPriorityPanelMoreNewsNavigation(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 */
	@Test
	public void priorityPanelTitleNavigation()
	{
		pages.mobileHindiRevampLandingPage.verifyPriorityPanelTaazaSamacharTitleNavigation(serverType);
	}

	/**
	 * @author VipinKumarGawande
	 */
//	@Test
//	public void priorityPanelRelatedNewsNavigation()
//	{
//		pages.mobileHindiLandingPage.verifyRelatedNewsArticleNavigation(serverType);
//	}
}
