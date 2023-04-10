package com.news18.desktopregressionhomepagebodyvalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopLokmatPromotedContentWIdgetTest extends DesktopCommonConfig {

	
	/**
	 * @author VipinKumarGawande
	 * This method is used to navigate to News18 HomePage for English Language URL which is fetching from Property File
	 * URL - https://hindi.news18.com/
	 */
//	@BeforeMethod
	public void navigateToEnglishHomePageUrl()
	{
	navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}
	
	@Test
	public void promotedContentArticleNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentArticleNavigation();
	}
	
	@Test
	public void promotedContentImageNavigation()
	{
		pages.desktopOutbrainValidation.verifyPromotedContentImageNavigation();
	}
}
